package com.example.dllo.lexuebdemo.myself.activity;

import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;

import com.example.dllo.lexuebdemo.R;
import com.example.dllo.lexuebdemo.base.BaseActivity;

/*
         |              |
         | \            | \
         |   | | | | | |    | | | | |||||\
         |                          |||||||\
         |         ( )              ||||||||
         |                           |||||/
         |                  | | | | | |||/
         |    |             |          |
         |    |             |          |
       / |   | |            |          |\
      |      |/             |          \|
       \ |                  |
         |                  |
           \ | | | | | | | /
             |       |            <-----弱鸡
             |       |
             |       |
*/
public class ClauseActivity extends BaseActivity implements View.OnClickListener {
    private ImageView backIv;
    private WebView webView;
    private String url = "http://esfile.lexue.com/static/protocal.html?version=2.3.0&os=baidu";

    @Override
    protected int getLayout() {
        return R.layout.activity_clause;
    }

    @Override
    protected void initView() {
        backIv = bindView(R.id.iv_clause_back);
        webView = bindView(R.id.wv_clause);
    }

    @Override
    protected void initData() {
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setAllowFileAccess(true);
        webSettings.setSupportMultipleWindows(true);
        webSettings.setDomStorageEnabled(true);
        webView.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                return false;
            }
        });
        webView.loadUrl(url);
    }

    @Override
    protected void initListener() {
        backIv.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.iv_clause_back:
                finish();
                break;
        }
    }
}
