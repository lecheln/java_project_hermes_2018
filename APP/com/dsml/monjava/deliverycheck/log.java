package com.dsml.monjava.deliverycheck;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class log
  extends AppCompatActivity
{
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2131427356);
    paramBundle = (WebView)findViewById(2131296382);
    paramBundle.setWebViewClient(new WebViewClient());
    paramBundle.getSettings().setLoadWithOverviewMode(true);
    paramBundle.getSettings().setUseWideViewPort(true);
    paramBundle.getSettings().setSupportZoom(true);
    paramBundle.getSettings().setBuiltInZoomControls(true);
    paramBundle.invalidate();
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("http://osias.asuscomm.com/~post/logsearchDweb.php?boxnum=");
    localStringBuilder.append(LoginActivity.vaules[3]);
    paramBundle.loadUrl(localStringBuilder.toString());
  }
}


/* Location:              C:\dex2jar-2.0\com.dsml.monjava.deliverycheck-dex2jar.jar!\com\dsml\monjava\deliverycheck\log.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */