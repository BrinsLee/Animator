package com.brins.animator;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.media.Image;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioGroup;

public class Fragment_set extends Fragmentbase {

    private boolean isStart=false;
    private Button button;
    private ImageView imageView;

    public Fragment_set(String title) {
        super(title);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.from(getContext()).inflate(R.layout.fragment2,container,false);
        radioGroup=view.findViewById(R.id.type);
        button=view.findViewById(R.id.动画);
        imageView=view.findViewById(R.id.iv);
        radioGroup=view.findViewById(R.id.type);
        radioGroup2=view.findViewById(R.id.interatortype);
        return view;
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        button.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        super.onClick(v);
        if (!isStart){
            switch (radioGroup.getCheckedRadioButtonId()){
                case R.id.tranrotaX:
                {switch (radioGroup2.getCheckedRadioButtonId()){
                    case R.id.acdec:{
                        objectAnimator= ObjectAnimator.ofFloat(imageView,"translationX",500f);
                        objectAnimator.setInterpolator(AccDecinterpolator);
                        objectAnimator1=ObjectAnimator.ofFloat(imageView,"rotation",360f);
                        objectAnimator1.setInterpolator(AccDecinterpolator);
                        AnimatorSet animatorSet=new AnimatorSet();
                        animatorSet.play(objectAnimator).with(objectAnimator1);
                        animatorSet.setDuration(1500);
                        animatorSet.start();
                        isStart=true;
                        break;
                    }
                    case R.id.linear:{
                        objectAnimator= ObjectAnimator.ofFloat(imageView,"translationX",500f);
                        objectAnimator.setInterpolator(Linearinterpolator);
                        objectAnimator1=ObjectAnimator.ofFloat(imageView,"rotation",360f);
                        objectAnimator1.setInterpolator(Linearinterpolator);
                        AnimatorSet animatorSet=new AnimatorSet();
                        animatorSet.play(objectAnimator).with(objectAnimator1);
                        animatorSet.setDuration(1500);
                        animatorSet.start();
                        isStart=true;
                        break;
                    }
                    case R.id.bound:{
                        objectAnimator= ObjectAnimator.ofFloat(imageView,"translationX",500f);
                        objectAnimator.setInterpolator(bounceInterpolator);
                        objectAnimator1=ObjectAnimator.ofFloat(imageView,"rotation",360f);
                        objectAnimator1.setInterpolator(bounceInterpolator);
                        AnimatorSet animatorSet=new AnimatorSet();
                        animatorSet.play(objectAnimator).with(objectAnimator1);
                        animatorSet.setDuration(1500);
                        animatorSet.start();
                        isStart=true;
                        break;
                    }

                }
                    break;}
                case R.id.tranrotaY:
                {
                    switch (radioGroup2.getCheckedRadioButtonId()){
                        case R.id.acdec:{
                            objectAnimator= ObjectAnimator.ofFloat(imageView,"translationY",500f);
                            objectAnimator.setInterpolator(AccDecinterpolator);
                            objectAnimator1=ObjectAnimator.ofFloat(imageView,"rotation",360f);
                            objectAnimator1.setInterpolator(AccDecinterpolator);
                            AnimatorSet animatorSet=new AnimatorSet();
                            animatorSet.play(objectAnimator).with(objectAnimator1);
                            animatorSet.setDuration(1500);
                            animatorSet.start();
                            isStart=true;
                            break;
                        }
                        case R.id.linear:{
                            objectAnimator= ObjectAnimator.ofFloat(imageView,"translationY",500f);
                            objectAnimator.setInterpolator(Linearinterpolator);
                            objectAnimator1=ObjectAnimator.ofFloat(imageView,"rotation",360f);
                            objectAnimator1.setInterpolator(Linearinterpolator);
                            AnimatorSet animatorSet=new AnimatorSet();
                            animatorSet.play(objectAnimator).with(objectAnimator1);
                            animatorSet.setDuration(1500);
                            animatorSet.start();
                            isStart=true;
                            break;
                        }
                        case R.id.bound:{
                            objectAnimator= ObjectAnimator.ofFloat(imageView,"translationY",500f);
                            objectAnimator.setInterpolator(bounceInterpolator);
                            objectAnimator1=ObjectAnimator.ofFloat(imageView,"rotation",360f);
                            objectAnimator1.setInterpolator(bounceInterpolator);
                            AnimatorSet animatorSet=new AnimatorSet();
                            animatorSet.play(objectAnimator).with(objectAnimator1);
                            animatorSet.setDuration(1500);
                            animatorSet.start();
                            isStart=true;
                            break;
                        }

                    }
                    break;
                }

                case R.id.rotascaleY:
                {
                    switch (radioGroup2.getCheckedRadioButtonId()){
                        case R.id.acdec:{
                            objectAnimator= ObjectAnimator.ofFloat(imageView,"scaleY",1.0f,3.0f,1.0f);
                            objectAnimator.setInterpolator(AccDecinterpolator);
                            objectAnimator1=ObjectAnimator.ofFloat(imageView,"rotation",360f);
                            objectAnimator1.setInterpolator(AccDecinterpolator);
                            objectAnimator2=ObjectAnimator.ofFloat(imageView,"scaleX",1.0f,3.0f,1.0f);
                            objectAnimator2.setInterpolator(AccDecinterpolator);
                            AnimatorSet animatorSet=new AnimatorSet();
                            animatorSet.play(objectAnimator).with(objectAnimator1).with(objectAnimator2);
                            animatorSet.setDuration(1500);
                            animatorSet.start();
                            isStart=true;
                            break;
                        }
                        case R.id.linear:{
                            objectAnimator= ObjectAnimator.ofFloat(imageView,"scaleY",1.0f,3.0f,1.0f);
                            objectAnimator.setInterpolator(Linearinterpolator);
                            objectAnimator1=ObjectAnimator.ofFloat(imageView,"rotation",360f);
                            objectAnimator1.setInterpolator(Linearinterpolator);
                            objectAnimator2=ObjectAnimator.ofFloat(imageView,"scaleX",1.0f,3.0f,1.0f);
                            objectAnimator2.setInterpolator(Linearinterpolator);
                            AnimatorSet animatorSet=new AnimatorSet();
                            animatorSet.play(objectAnimator).with(objectAnimator1).with(objectAnimator2);
                            animatorSet.setDuration(1500);
                            animatorSet.start();
                            isStart=true;
                            break;
                        }
                        case R.id.bound:{
                            objectAnimator= ObjectAnimator.ofFloat(imageView,"scaleY",1.0f,3.0f,1.0f);
                            objectAnimator.setInterpolator(bounceInterpolator);
                            objectAnimator1=ObjectAnimator.ofFloat(imageView,"rotation",360f);
                            objectAnimator1.setInterpolator(bounceInterpolator);
                            objectAnimator2=ObjectAnimator.ofFloat(imageView,"scaleX",1.0f,3.0f,1.0f);
                            objectAnimator2.setInterpolator(bounceInterpolator);
                            AnimatorSet animatorSet=new AnimatorSet();
                            animatorSet.play(objectAnimator).with(objectAnimator1).with(objectAnimator2);
                            animatorSet.setDuration(1500);
                            animatorSet.start();
                            isStart=true;
                            break;
                        }

                    }
                    break;
                }
            }
        }else {

            switch (radioGroup.getCheckedRadioButtonId()) {
                case R.id.tranrotaX: {
                    switch (radioGroup2.getCheckedRadioButtonId()) {
                        case R.id.acdec: {
                            objectAnimator = ObjectAnimator.ofFloat(imageView, "translationX", -500f);
                            objectAnimator.setInterpolator(AccDecinterpolator);
                            objectAnimator1 = ObjectAnimator.ofFloat(imageView, "rotation", -360f);
                            objectAnimator1.setInterpolator(AccDecinterpolator);
                            AnimatorSet animatorSet=new AnimatorSet();
                            animatorSet.play(objectAnimator).with(objectAnimator1);
                            animatorSet.setDuration(1500);
                            animatorSet.start();
                            isStart = false;
                            break;
                        }
                        case R.id.linear: {
                            objectAnimator = ObjectAnimator.ofFloat(imageView, "translationX", -500f);
                            objectAnimator.setInterpolator(Linearinterpolator);
                            objectAnimator1 = ObjectAnimator.ofFloat(imageView, "rotation", -360f);
                            objectAnimator1.setInterpolator(Linearinterpolator);
                            AnimatorSet animatorSet=new AnimatorSet();
                            animatorSet.play(objectAnimator).with(objectAnimator1);
                            animatorSet.setDuration(1500);
                            animatorSet.start();
                            isStart = false;
                            break;
                        }
                        case R.id.bound: {
                            objectAnimator = ObjectAnimator.ofFloat(imageView, "translationX", -500f);
                            objectAnimator.setInterpolator(bounceInterpolator);
                            objectAnimator1 = ObjectAnimator.ofFloat(imageView, "rotation", -360f);
                            objectAnimator1.setInterpolator(bounceInterpolator);
                            AnimatorSet animatorSet=new AnimatorSet();
                            animatorSet.play(objectAnimator).with(objectAnimator1);
                            animatorSet.setDuration(1500);
                            animatorSet.start();
                            isStart = false;
                            break;
                        }

                    }
                    break;
                }
                case R.id.tranrotaY: {
                    switch (radioGroup2.getCheckedRadioButtonId()) {
                        case R.id.acdec: {
                            objectAnimator = ObjectAnimator.ofFloat(imageView, "translationY", -500f);
                            objectAnimator.setInterpolator(AccDecinterpolator);
                            objectAnimator1 = ObjectAnimator.ofFloat(imageView, "rotation", -360f);
                            objectAnimator1.setInterpolator(AccDecinterpolator);
                            AnimatorSet animatorSet=new AnimatorSet();
                            animatorSet.play(objectAnimator).with(objectAnimator1);
                            animatorSet.setDuration(1500);
                            animatorSet.start();
                            isStart = false;
                            break;
                        }
                        case R.id.linear: {
                            objectAnimator = ObjectAnimator.ofFloat(imageView, "translationY", -500f);
                            objectAnimator.setInterpolator(Linearinterpolator);
                            objectAnimator1 = ObjectAnimator.ofFloat(imageView, "rotation", -360f);
                            objectAnimator1.setInterpolator(Linearinterpolator);
                            AnimatorSet animatorSet=new AnimatorSet();
                            animatorSet.play(objectAnimator).with(objectAnimator1);
                            animatorSet.setDuration(1500);
                            animatorSet.start();
                            isStart = false;
                            break;
                        }
                        case R.id.bound: {
                            objectAnimator = ObjectAnimator.ofFloat(imageView, "translationY", -500f);
                            objectAnimator.setInterpolator(bounceInterpolator);
                            objectAnimator1 = ObjectAnimator.ofFloat(imageView, "rotation", -360f);
                            objectAnimator1.setInterpolator(bounceInterpolator);
                            AnimatorSet animatorSet=new AnimatorSet();
                            animatorSet.play(objectAnimator).with(objectAnimator1);
                            animatorSet.setDuration(1500);
                            animatorSet.start();
                            isStart = false;
                            break;
                        }

                    }
                    break;
                }

                case R.id.rotascaleY: {
                    switch (radioGroup2.getCheckedRadioButtonId()) {
                        case R.id.acdec: {
                            objectAnimator = ObjectAnimator.ofFloat(imageView, "scaleY", 1.0f, 3.0f,1.0f);
                            objectAnimator.setInterpolator(AccDecinterpolator);
                            objectAnimator1 = ObjectAnimator.ofFloat(imageView, "rotation", -360f);
                            objectAnimator1.setInterpolator(AccDecinterpolator);
                            objectAnimator2 = ObjectAnimator.ofFloat(imageView, "scaleX", 1.0f, 3.0f,1.0f);
                            objectAnimator2.setInterpolator(AccDecinterpolator);

                            AnimatorSet animatorSet=new AnimatorSet();
                            animatorSet.play(objectAnimator).with(objectAnimator1).with(objectAnimator2);
                            animatorSet.setDuration(1500);
                            animatorSet.start();
                            isStart = false;
                            break;
                        }
                        case R.id.linear: {
                            objectAnimator = ObjectAnimator.ofFloat(imageView, "scaleY", 1.0f, 3.0f,1.0f);
                            objectAnimator.setInterpolator(Linearinterpolator);
                            objectAnimator2 = ObjectAnimator.ofFloat(imageView, "scaleX", 1.0f, 3.0f,1.0f);
                            objectAnimator2.setInterpolator(Linearinterpolator);
                            objectAnimator1 = ObjectAnimator.ofFloat(imageView, "rotation", -360f);
                            objectAnimator1.setInterpolator(Linearinterpolator);
                            AnimatorSet animatorSet=new AnimatorSet();
                            animatorSet.play(objectAnimator).with(objectAnimator1).with(objectAnimator2);
                            animatorSet.setDuration(1500);
                            animatorSet.start();
                            isStart = false;
                            break;
                        }
                        case R.id.bound: {
                            objectAnimator = ObjectAnimator.ofFloat(imageView, "scaleY", 1.0f, 3.0f,1.0f);
                            objectAnimator.setInterpolator(bounceInterpolator);
                            objectAnimator1 = ObjectAnimator.ofFloat(imageView, "rotation", -360f);
                            objectAnimator1.setInterpolator(bounceInterpolator);
                            objectAnimator2 = ObjectAnimator.ofFloat(imageView, "scaleX", 1.0f, 3.0f,1.0f);
                            objectAnimator2.setInterpolator(bounceInterpolator);
                            AnimatorSet animatorSet=new AnimatorSet();
                            animatorSet.play(objectAnimator).with(objectAnimator1).with(objectAnimator2);
                            animatorSet.setDuration(1500);
                            animatorSet.start();
                            isStart = false;
                            break;
                        }

                    }
                    break;
                }
            }
        }

    }
}
