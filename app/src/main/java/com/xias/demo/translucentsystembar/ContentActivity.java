package com.xias.demo.translucentsystembar;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.jaeger.library.StatusBarUtil;
import com.xias.demo.translucentsystembar.util.StatusBarCompat;

public class ContentActivity extends AppCompatActivity implements View.OnClickListener{

    Fragment fragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);
        TextView tv1 = findViewById(R.id.tv1);
        TextView tv2 = findViewById(R.id.tv2);
        fragment = TvOneFragment.newInstance();
        getSupportFragmentManager().beginTransaction().add(R.id.frame, fragment).commitAllowingStateLoss();
        tv1.setOnClickListener(this);
        tv2.setOnClickListener(this);
        StatusBarUtil.setTranslucentForImageViewInFragment(ContentActivity.this, null);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tv1:
                getSupportFragmentManager().beginTransaction().remove(fragment).commitAllowingStateLoss();
                fragment = TvOneFragment.newInstance();
                getSupportFragmentManager().beginTransaction().add(R.id.frame, fragment).commitAllowingStateLoss();
                break;
            case R.id.tv2:
                getSupportFragmentManager().beginTransaction().remove(fragment).commitAllowingStateLoss();
                fragment = TvTwoFragment.newInstance();
                getSupportFragmentManager().beginTransaction().add(R.id.frame, fragment).commitAllowingStateLoss();
                break;
        }
    }

    public void setStatusTwo(){
        StatusBarCompat.compat(this);
        //StatusBarCompat.compatTranslucentForImageViewInFragment(this);
        //StatusBarCompat.setTranslucentForImageViewInFragment(this, 0);
    }

    public void setStatusOne(){
        //getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_VISIBLE);
        getWindow().getDecorView().setFitsSystemWindows(true);
        StatusBarCompat.setTranslucentForImageViewInFragment(this, 255);
        StatusBarCompat.compat(this, getResources().getColor(R.color.colorPrimary));

    }
}
