package com.example.wevview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.TextView;

import java.nio.BufferUnderflowException;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
TextView textView;
Button button, button2;
WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button) findViewById(R.id.button);
        button2=(Button) findViewById(R.id.button2);
        webView=(WebView) findViewById(R.id.webView);

        button2.setOnClickListener(this);
        button.setOnClickListener(this);
        webView.setWebViewClient(new MyWebViewClient());
        String url = "https://www.google.com/";
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl(url);


    }


    @Override
    public void onClick(View v) {
switch (v.getId()){
    case  R.id.button2:
        String customHtml = "<html><body><h1>Hello, Nadia Tasnim Tonima Tanzim Rakib</h1>" +
                "<h1>Heading 1</h1><h2>Heading 2</h2><h3>Heading 3</h3>" +
                "<p>This is a sample paragraph of static HTML In Web view</p>" +
                "</body></html>";
        webView.loadData(customHtml, "text/html", "UTF-8");
        break;
    case R.id.button:
        webView.setWebViewClient(new MyWebViewClient());
        String url="https://www.google.com/";
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl(url);
        break;
}
    }

    private class MyWebViewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);

            return true;
        }
    }
}
