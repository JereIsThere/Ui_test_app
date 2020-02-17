package com.example.bottomappbartestapp;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

/**
 * a class to call {@link Log#d} with the predefined tag "myCustomTag"
 */
class MyLogClass {
    static int toastLength = Toast.LENGTH_LONG;

    public static void d(String message) {
        Log.d("myCustomTag", message);
    }

    public static void d(Object message) {
        Log.d("myCustomTag", message.toString());
    }

    public static void toast(String str, Context context){
        Toast.makeText(context, str, toastLength).show();
    }
}
