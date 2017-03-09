package com.example.dllo.lexuebdemo.presenter;

import com.example.dllo.lexuebdemo.R;
import com.example.dllo.lexuebdemo.view.FindFragment;
import com.example.dllo.lexuebdemo.view.MainView;
import com.example.dllo.lexuebdemo.view.TeacherFragment;

/**
 * Created by dllo on 17/3/9.
 */

public class MainPresenter {
    private MainView mainView;

    public MainPresenter(MainView mainView) {
        this.mainView = mainView;
    }

    public void selectPage(int Id){
        switch (Id){
            case R.id.radiobtn_main:
                mainView.selectFragment(0);
                break;
            case R.id.radiobtn_teacher:
                mainView.selectFragment(1);
                break;
            case R.id.radiobtn_find:
                mainView.selectFragment(2);
                break;
            case R.id.radiobtn_my:
                mainView.selectFragment(3);
                break;

        }
    }
}
