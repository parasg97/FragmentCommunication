package com.persi.memegenrator;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TextInputEditText;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class TopFragment extends Fragment {
    private TextInputEditText mTopText;
    private TextInputEditText mBottomText;
    private Button mCreateButton;

    private TopFragmentListner mFragmentListner;
    public interface TopFragmentListner{
        public void CreateMeme(String top,String bottom);

    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try{
            mFragmentListner=(TopFragmentListner) context;
        }catch (Exception e){
            Log.d("Meme:",e.toString());
        }

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.top_fragment_layout,container,false);
        mTopText=v.findViewById(R.id.top_text);
        mBottomText=v.findViewById(R.id.bottom_text);
        mCreateButton=v.findViewById(R.id.button);
        mCreateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onButtonClick(view);
            }
        });
        return  v;
    }

    public void onButtonClick(View v){
        mFragmentListner.CreateMeme(mTopText.getText().toString(),mBottomText.getText().toString());

    }
}

