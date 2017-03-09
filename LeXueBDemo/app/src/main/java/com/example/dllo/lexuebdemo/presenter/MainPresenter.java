package com.example.dllo.lexuebdemo.presenter;

import com.example.dllo.lexuebdemo.R;
import com.example.dllo.lexuebdemo.view.FindFragment;
import com.example.dllo.lexuebdemo.view.MainView;

/**
 * Created by dllo on 17/3/9.
 */

public class MainPresenter {
    private MainView mainView;

    public MainPresenter(MainView mainView) {
        this.mainView = mainView;
    }

    public void addView(int Id){
        switch (Id){
            case R.id.radiobtn_main:
//                mainView.onAddFragment();
                mainView.onRadiuGroupCheckChange(Id);
                break;
            case R.id.radiobtn_teacher:
//                mainView.onAddFragment();
                mainView.onRadiuGroupCheckChange(Id);
                break;
            case R.id.radiobtn_find:
                mainView.onAddFragment(new FindFragment());
                mainView.onRadiuGroupCheckChange(Id);
                break;
            case R.id.radiobtn_my:
//                mainView.onAddFragment();
                mainView.onRadiuGroupCheckChange(Id);
                break;

        }
    }
}
