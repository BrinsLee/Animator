package com.brins.animator;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Shader;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioGroup;

public class Fragmentbase extends Fragment implements View.OnClickListener {

    protected Button bt;
    protected ImageView iv;
    protected RadioGroup radioGroup;
    protected RadioGroup radioGroup2;
    protected Interpolator AccDecinterpolator=new AccelerateDecelerateInterpolator();
    protected Interpolator Linearinterpolator=new LinearInterpolator();
    protected Interpolator bounceInterpolator=new BounceInterpolator();
    protected ObjectAnimator objectAnimator,objectAnimator1,objectAnimator2;
    public String title;


    public Fragmentbase(String title) {
        this.title=title;

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.from(getContext()).inflate(R.layout.fragment1,container,false);
        iv=view.findViewById(R.id.iv);
        bt=view.findViewById(R.id.动画);
        radioGroup=view.findViewById(R.id.type);
        radioGroup2=view.findViewById(R.id.interatortype);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onClick(View v) {

    }
}
