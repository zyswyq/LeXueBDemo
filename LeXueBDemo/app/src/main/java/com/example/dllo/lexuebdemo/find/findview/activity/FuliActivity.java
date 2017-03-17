package com.example.dllo.lexuebdemo.find.findview.activity;

import android.app.DownloadManager;
import android.net.Uri;
import android.os.Environment;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.dllo.lexuebdemo.R;
import com.example.dllo.lexuebdemo.base.BaseActivity;
import com.example.dllo.lexuebdemo.find.model.FuliBean;
import com.example.dllo.lexuebdemo.nettools.NetBean;
import com.example.dllo.lexuebdemo.nettools.NetTools;
import com.example.dllo.lexuebdemo.nettools.inter.MyCallBack;

/**
 * Created by dllo on 17/3/16.
 */

public class FuliActivity extends BaseActivity implements View.OnClickListener {

    private ImageView fuliImage;
    private Button downbtn,nextBtn;
    private String url=" http://gank.io/api/random/data/福利/1";
    private FuliBean bean;
    private String downUrl="";
    long reference = 0L;
    private DownloadManager downloadManager;


    @Override
    protected int getLayout() {
        return R.layout.activity_fuli;
    }

    @Override
    protected void initView() {
        fuliImage=bindView(R.id.img_fuli_main);
        downbtn=bindView(R.id.btn_fuli_down);
        nextBtn=bindView(R.id.btn_fuli_next);
        bean=new FuliBean();
        downloadManager = (DownloadManager) getSystemService(DOWNLOAD_SERVICE);

    }

    @Override
    protected void initData() {
        getDaaUrl();
    }

    @Override
    protected void initListener() {
        downbtn.setOnClickListener(this);
        nextBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_fuli_next:
                getDaaUrl();
                break;
            case R.id.btn_fuli_down:
                beginDownLoad();
                break;
        }
    }



    private void downLoad(){
        final DownloadManager dManager = (DownloadManager) getSystemService(this.DOWNLOAD_SERVICE);
         Uri uri = Uri.parse(downUrl);
         DownloadManager.Request request = new DownloadManager.Request(uri);
        request.setAllowedNetworkTypes(DownloadManager.Request.NETWORK_MOBILE | DownloadManager.Request.NETWORK_WIFI);

        // 设置下载路径和文件名
//         request.setDestinationInExternalPublicDir(Environment.`, bean.getResults().get(0).get_id()+".jpg");
//         request.setDescription("软件新版本下载");
         request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
         request.setMimeType("application/vnd.android.package-archive");
         // 设置为可被媒体扫描器找到
         request.allowScanningByMediaScanner();
        request.setShowRunningNotification(true);
        request.setTitle("apk_title");
        request.setDescription("apk_description");
         // 设置为可见和可管理
         request.setVisibleInDownloadsUi(true);
        dManager.equals(request);

    }
    private String getFileName(String url) {
        return url.substring(url.lastIndexOf("/"), url.length());
    }
    protected void beginDownLoad() {
        DownloadManager.Request down = new DownloadManager.Request(Uri.parse(downUrl));
        down.setAllowedNetworkTypes(DownloadManager.Request.NETWORK_MOBILE | DownloadManager.Request.NETWORK_WIFI);
        down.setNotificationVisibility(View.VISIBLE);
        down.setVisibleInDownloadsUi(true);
        down.setDestinationInExternalPublicDir(Environment.DIRECTORY_PICTURES, getFileName(downUrl));
        down.setTitle("apk_title");
        down.setDescription("apk_description");
        reference = downloadManager.enqueue(down);
        //queryDownloadStatus();
    }



    private void getDaaUrl(){
        NetTools.getInstance().startRequest(url, FuliBean.class, new MyCallBack<FuliBean>() {
            @Override
            public void success(FuliBean respomse) {
                bean=respomse;
                downUrl=bean.getResults().get(0).getUrl();
                Glide.with(FuliActivity.this).load(bean.getResults().get(0).getUrl()).into(fuliImage);

            }

            @Override
            public void error(Throwable throwable) {

            }
        });
    }
}
