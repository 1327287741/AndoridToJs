package com.example.administrator.mytestandstudy;
import android.webkit.JavascriptInterface;

public class AdroidToJS extends Object {

    @JavascriptInterface
    public void helloword(String _msg){
        System.out.println(_msg);
    }
}
