package com.dsml.monjava.deliverycheck;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class fragmentstreaming
  extends Fragment
{
  @Nullable
  public View onCreateView(@NonNull LayoutInflater paramLayoutInflater, @Nullable ViewGroup paramViewGroup, @Nullable Bundle paramBundle)
  {
    paramLayoutInflater = paramLayoutInflater.inflate(2131427382, paramViewGroup, false);
    paramViewGroup = (WebView)paramLayoutInflater.findViewById(2131296269);
    paramViewGroup.setWebViewClient(new WebViewClient());
    paramViewGroup.getSettings().setLoadWithOverviewMode(true);
    paramViewGroup.getSettings().setUseWideViewPort(true);
    paramViewGroup.getSettings().setJavaScriptEnabled(true);
    paramViewGroup.invalidate();
    paramViewGroup.loadUrl("http://osias.asuscomm.com/~post/photo.php");
    return paramLayoutInflater;
  }
}


/* Location:              C:\dex2jar-2.0\com.dsml.monjava.deliverycheck-dex2jar.jar!\com\dsml\monjava\deliverycheck\fragmentstreaming.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */