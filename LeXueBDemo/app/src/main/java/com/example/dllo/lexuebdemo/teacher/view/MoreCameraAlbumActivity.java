package com.example.dllo.lexuebdemo.teacher.view;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import android.support.v4.content.FileProvider;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.dllo.lexuebdemo.R;
import com.example.dllo.lexuebdemo.base.BaseActivity;
import com.example.dllo.lexuebdemo.main.view.MainActivity;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
    by Mr.L
    data 2017-03-18
    desc 描述
*/
public class MoreCameraAlbumActivity extends BaseActivity implements View.OnClickListener {
    public static final int TAKE_PHOTO = 1;
    private ImageView picture;
    private Uri imageUri;
    private Button takePhoto;

    @Override
    protected int getLayout() {
        return R.layout.activity_more_camera_album;
    }

    @Override
    protected void initView() {
        picture = bindView(R.id.picture);
        takePhoto = bindView(R.id.take_photo);
    }

    @Override
    protected void initData() {
        takePhoto.setOnClickListener(this);
    }

    @Override
    protected void initListener() {

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.picture:
                //创建File对象，用于存储拍照后的图片
                File outputImg = new File(getExternalCacheDir(), "output_image.jpg");
                try {
                    if (outputImg.exists()) {
                        outputImg.delete();
                    }
                    outputImg.createNewFile();
                } catch (IOException e) {
                    e.printStackTrace();
                }

                if(Build.VERSION.SDK_INT >= 24){
                    imageUri = FileProvider.getUriForFile(this,
                            "Ç", outputImg);
                }else{
                    imageUri = Uri.fromFile(outputImg);
                }

                //启动相机程序
                Intent intent = new Intent("android.media.action.IMAGE_CAPYURE");
                intent.putExtra(MediaStore.EXTRA_OUTPUT, imageUri);
                startActivityForResult(intent, TAKE_PHOTO);
                break;
            default:
                break;
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        switch (requestCode){
            case TAKE_PHOTO:
                if(resultCode == RESULT_OK){
                    try{
                        //将拍摄的照片显示出来
                        Bitmap bitmap = BitmapFactory.decodeStream(getContentResolver()
                            .openInputStream(imageUri));
                        picture.setImageBitmap(bitmap);
                    }catch (FileNotFoundException e){
                        e.printStackTrace();
                    }
                }
                break;
            default:
                break;
        }
    }
}
