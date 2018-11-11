package com.brins.animator;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Fragment_custom extends Fragmentbase {

    private Myview myview;
    public Fragment_custom(String title) {
        super(title);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view=inflater.from(getContext()).inflate(R.layout.fragment3,container,false);
        bt=view.findViewById(R.id.动画);
        myview=view.findViewById(R.id.myview);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        bt.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        super.onClick(v);
        objectAnimator= ObjectAnimator.ofFloat(myview,"progress",0f,200f,0f);
        objectAnimator.setDuration(1500);
        objectAnimator.start();
    }
}
