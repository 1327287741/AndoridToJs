package com.example.administrator.mytestandstudy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = findViewById(R.id.test);
        webView.setWebChromeClient(new WebChromeClient());
        webView.setWebViewClient(new WebViewClient());
//        WebSettings webSettings = webView.getSettings();

        //打开webview与js交互的权限
        webView.getSettings().setJavaScriptEnabled(true);
        //打开DOM储存API，如果不打开可能会出现网页显示不全
        webView.getSettings().setDomStorageEnabled(true);

        webView.addJavascriptInterface(new AdroidToJS(),"myBridge");
        webView.loadUrl("file:///android_asset/interactive.html");
    }
}
