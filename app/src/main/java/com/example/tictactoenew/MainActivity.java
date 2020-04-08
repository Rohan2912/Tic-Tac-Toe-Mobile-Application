package com.example.tictactoenew;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView browser = (WebView) findViewById(R.id.webView);
        browser.setWebViewClient(new WebViewClient());
        browser.setWebChromeClient(new WebChromeClient());
        browser.getSettings().setJavaScriptEnabled(true);
        browser.loadUrl("file:///android_asset/index.html");
    }
}

