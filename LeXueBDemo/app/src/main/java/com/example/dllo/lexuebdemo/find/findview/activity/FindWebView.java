package com.example.dllo.lexuebdemo.find.findview.activity;

import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.example.dllo.lexuebdemo.R;
import com.example.dllo.lexuebdemo.base.BaseActivity;

/**
 * Created by dllo on 17/3/10.
 */

public class FindWebView extends BaseActivity{
    private WebView webView;

    @Override
    protected int getLayout() {
        return R.layout.activity_find_shop;
    }

    @Override
    protected void initView() {
        webView=(WebView)findViewById(R.id.webview_find);
    }

    @Override
    protected void initData() {
        webView.loadUrl("http://www.lexue.com/mall/index.html?version=2.3.0&os=baidu");
        webView.setWebChromeClient(new WebChromeClient() {
            @Override
            public void onReceivedTitle(WebView view, String title) {
            }
        });
        WebSettings webSettings=webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }

    @Override
    protected void initListener() {

    }
}
