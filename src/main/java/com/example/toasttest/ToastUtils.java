package com.example.toasttest;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by xiedong on 2017/9/27.
 */

public class ToastUtils {
    public static void showToast(Context context,String str){
        Toast.makeText(context, str, Toast.LENGTH_SHORT).show();
    }
}
