package com.example.alc4_0phase1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.net.http.SslError;
import android.os.Bundle;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class AboutALC extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTitle("About ALC");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_alc);

        final ProgressDialog progressDialog = new ProgressDialog(this);
        progressDialog.setMessage("Please wait while the page loads");
        progressDialog.show();

        WebView webView = findViewById(R.id.webview);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("https://andela.com/alc");
        webView.setWebViewClient(new WebViewClient(){
            @Override
            public void onPageFinished(WebView view, String url) {
                progressDialog.dismiss();
            }

            @Override
            public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
                handler.proceed();
            }
        });

    }


    }