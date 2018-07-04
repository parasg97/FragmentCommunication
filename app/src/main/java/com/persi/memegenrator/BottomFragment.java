package com.persi.memegenrator;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class BottomFragment extends android.support.v4.app.Fragment {
    private TextView mTopTextView;
    private TextView mBottomTextView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.bottom_fragment_layout,container,false);
        mTopTextView=v.findViewById(R.id.upText);
        mBottomTextView=v.findViewById(R.id.downText);
        return v;
    }

    public void setMemeText(String top,String bottom){
        mTopTextView.setText(top);
        mBottomTextView.setText(bottom);
    }
}
