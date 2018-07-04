package com.persi.memegenrator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements TopFragment.TopFragmentListner {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void CreateMeme(String top, String bottom) {
        BottomFragment fragment=(BottomFragment)getSupportFragmentManager().findFragmentById(R.id.bottom_fragment);
        fragment.setMemeText(top,bottom);
    }
}
