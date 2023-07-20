package com.me.junkcode;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;

import com.dn.junkcode.R;

import java.io.File;
import java.util.Random;


public class MainActivity extends AppCompatActivity {

    static {
        System.out.println();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Class1 class1 = new Class1();
        Class2 class2 = new Class2();
        Class3 class3 = new Class3();
        openNews(this,"a","b");

    }

    private void openNews(Context context, String str, String str2) {

        int i = new Random().nextInt();
        System.out.println("test" + str2);
        File cacheDir = context.getCacheDir();
        openActivityWeb(context,str);

    }

    public void openActivityWeb(Context context, String str) {
        context.getCacheDir();
        System.out.println("test" + str);
    }






}