package com.brins.animator;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;


public class Fragment_obj extends Fragmentbase {


    private boolean isStart=false;

    public Fragment_obj(String title) {
        super(title);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return super.onCreateView(inflater,container,savedInstanceState);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        bt.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {

        super.onClick(v);
        if (!isStart){
            switch (radioGroup.getCheckedRadioButtonId()){
                case R.id.tranX:
                {switch (radioGroup2.getCheckedRadioButtonId()){
                    case R.id.acdec:{
                        objectAnimator= ObjectAnimator.ofFloat(iv,"translationX",500f)
                                .setDuration(1500);
                        objectAnimator.setInterpolator(AccDecinterpolator);
                        objectAnimator.start();
                        isStart=true;
                        break;
                    }
                    case R.id.linear:{
                        objectAnimator= ObjectAnimator.ofFloat(iv,"translationX",500f)
                                .setDuration(1500);
                        objectAnimator.setInterpolator(Linearinterpolator);
                        objectAnimator.start();
                        isStart=true;
                        break;
                    }
                    case R.id.bound:{
                        objectAnimator= ObjectAnimator.ofFloat(iv,"translationX",500f)
                                .setDuration(1500);
                        objectAnimator.setInterpolator(bounceInterpolator);
                        objectAnimator.start();
                        isStart=true;
                        break;
                    }

                }
                    break;}
                case R.id.tranY:
                {
                    switch (radioGroup2.getCheckedRadioButtonId()){
                        case R.id.acdec:{
                            objectAnimator= ObjectAnimator.ofFloat(iv,"translationY",500f)
                                    .setDuration(1500);
                            objectAnimator.setInterpolator(AccDecinterpolator);
                            objectAnimator.start();
                            isStart=true;
                            break;
                        }
                        case R.id.linear:{
                            objectAnimator= ObjectAnimator.ofFloat(iv,"translationY",500f)
                                    .setDuration(1500);
                            objectAnimator.setInterpolator(Linearinterpolator);
                            objectAnimator.start();
                            isStart=true;
                            break;
                        }
                        case R.id.bound:{
                            objectAnimator= ObjectAnimator.ofFloat(iv,"translationY",500f)
                                    .setDuration(1500);
                            objectAnimator.setInterpolator(bounceInterpolator);
                            objectAnimator.start();
                            isStart=true;
                            break;
                        }

                    }
                    break;
                }
                case R.id.rotaX:
                {
                    switch (radioGroup2.getCheckedRadioButtonId()){
                        case R.id.acdec:{
                            objectAnimator= ObjectAnimator.ofFloat(iv,"rotationX",360)
                                    .setDuration(1500);
                            objectAnimator.setInterpolator(AccDecinterpolator);
                            objectAnimator.start();
                            isStart=true;
                            break;
                        }
                        case R.id.linear:{
                            objectAnimator= ObjectAnimator.ofFloat(iv,"rotationX",360)
                                    .setDuration(1500);
                            objectAnimator.setInterpolator(Linearinterpolator);
                            objectAnimator.start();
                            isStart=true;
                            break;
                        }
                        case R.id.bound:{
                            objectAnimator= ObjectAnimator.ofFloat(iv,"rotationX",360)
                                    .setDuration(1500);
                            objectAnimator.setInterpolator(bounceInterpolator);
                            objectAnimator.start();
                            isStart=true;
                            break;
                        }

                    }
                    break;
                }

                case R.id.rotaY:
                {
                    switch (radioGroup2.getCheckedRadioButtonId()){
                        case R.id.acdec:{
                            objectAnimator= ObjectAnimator.ofFloat(iv,"rotationY",360)
                                    .setDuration(1500);
                            objectAnimator.setInterpolator(AccDecinterpolator);
                            objectAnimator.start();
                            isStart=true;
                            break;
                        }
                        case R.id.linear:{
                            objectAnimator= ObjectAnimator.ofFloat(iv,"rotationY",360)
                                    .setDuration(1500);
                            objectAnimator.setInterpolator(Linearinterpolator);
                            objectAnimator.start();
                            isStart=true;
                            break;
                        }
                        case R.id.bound:{
                            objectAnimator= ObjectAnimator.ofFloat(iv,"rotationY",360)
                                    .setDuration(1500);
                            objectAnimator.setInterpolator(bounceInterpolator);
                            objectAnimator.start();
                            isStart=true;
                            break;
                        }

                    }
                    break;
                }
            }
        }else {

            switch (radioGroup.getCheckedRadioButtonId()){
                case R.id.tranX:
                {switch (radioGroup2.getCheckedRadioButtonId()){
                    case R.id.acdec:{
                        objectAnimator= ObjectAnimator.ofFloat(iv,"translationX",-500f)
                                .setDuration(1500);
                        objectAnimator.setInterpolator(AccDecinterpolator);
                        objectAnimator.start();
                        isStart=false;
                        break;
                    }
                    case R.id.linear:{
                        objectAnimator= ObjectAnimator.ofFloat(iv,"translationX",-500f)
                                .setDuration(1500);
                        objectAnimator.setInterpolator(Linearinterpolator);
                        objectAnimator.start();
                        isStart=false;
                        break;
                    }
                    case R.id.bound:{
                        objectAnimator= ObjectAnimator.ofFloat(iv,"translationX",-500f)
                                .setDuration(1500);
                        objectAnimator.setInterpolator(bounceInterpolator);
                        objectAnimator.start();
                        isStart=false;
                        break;
                    }

                }
                    break;}
                case R.id.tranY:
                {
                    switch (radioGroup2.getCheckedRadioButtonId()){
                        case R.id.acdec:{
                            objectAnimator= ObjectAnimator.ofFloat(iv,"translationY",-500f)
                                    .setDuration(1500);
                            objectAnimator.setInterpolator(AccDecinterpolator);
                            objectAnimator.start();
                            isStart=false;
                            break;
                        }
                        case R.id.linear:{
                            objectAnimator= ObjectAnimator.ofFloat(iv,"translationY",-500f)
                                    .setDuration(1500);
                            objectAnimator.setInterpolator(Linearinterpolator);
                            objectAnimator.start();
                            isStart=false;
                            break;
                        }
                        case R.id.bound:{
                            objectAnimator= ObjectAnimator.ofFloat(iv,"translationY",-500f)
                                    .setDuration(1500);
                            objectAnimator.setInterpolator(bounceInterpolator);
                            objectAnimator.start();
                            isStart=false;
                            break;
                        }

                    }
                    break;
                }
                case R.id.rotaX:
                {
                    switch (radioGroup2.getCheckedRadioButtonId()){
                        case R.id.acdec:{
                            objectAnimator= ObjectAnimator.ofFloat(iv,"rotationX",-360)
                                    .setDuration(1500);
                            objectAnimator.setInterpolator(AccDecinterpolator);
                            objectAnimator.start();
                            isStart=false;
                            break;
                        }
                        case R.id.linear:{
                            objectAnimator= ObjectAnimator.ofFloat(iv,"rotationX",-360)
                                    .setDuration(1500);
                            objectAnimator.setInterpolator(Linearinterpolator);
                            objectAnimator.start();
                            isStart=false;
                            break;
                        }
                        case R.id.bound:{
                            objectAnimator= ObjectAnimator.ofFloat(iv,"rotationX",-360)
                                    .setDuration(1500);
                            objectAnimator.setInterpolator(bounceInterpolator);
                            objectAnimator.start();
                            isStart=false;
                            break;
                        }

                    }
                    break;
                }

                case R.id.rotaY:
                {
                    switch (radioGroup2.getCheckedRadioButtonId()){
                        case R.id.acdec:{
                            objectAnimator= ObjectAnimator.ofFloat(iv,"rotationY",-360)
                                    .setDuration(1500);
                            objectAnimator.setInterpolator(AccDecinterpolator);
                            objectAnimator.start();
                            isStart=false;
                            break;
                        }
                        case R.id.linear:{
                            objectAnimator= ObjectAnimator.ofFloat(iv,"rotationY",-360)
                                    .setDuration(1500);
                            objectAnimator.setInterpolator(Linearinterpolator);
                            objectAnimator.start();
                            isStart=false;
                            break;
                        }
                        case R.id.bound:{
                            objectAnimator= ObjectAnimator.ofFloat(iv,"rotationY",-360)
                                    .setDuration(1500);
                            objectAnimator.setInterpolator(bounceInterpolator);
                            objectAnimator.start();
                            isStart=false;
                            break;
                        }

                    }
                    break;
                }
            }
        }
    }
}
