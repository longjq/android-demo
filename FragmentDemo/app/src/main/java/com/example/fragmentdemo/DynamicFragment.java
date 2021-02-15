package com.example.fragmentdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.util.DisplayMetrics;

public class DynamicFragment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dynamic_fragment);

        // 横竖屏兼容
        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);
        int screenWidth = dm.widthPixels;
        int screenHeight = dm.heightPixels;

        // 动态加载子的fragment
        FragmentManager fm = getSupportFragmentManager();
        Fragment frag = fm.findFragmentById(R.id.subview);
        if (screenWidth > screenHeight){ // 横屏
            if (frag != null){
                fm.beginTransaction().remove(frag).commitNow();
            }
        }else { // 竖屏
            if (frag == null){
                // 参数1：要添加的位置，参数2：要添加的代码
                fm.beginTransaction().add(R.id.subview, new SubViewFragment()).commitNow();
            }
        }



    }
}