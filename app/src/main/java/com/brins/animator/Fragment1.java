package com.brins.animator;

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

public class Fragment1 extends Fragmentbase{

    private Button bt;
    private ImageView iv;
    private boolean isStart=false;
    RadioGroup radioGroup;
    RadioGroup radioGroup2;
    private Interpolator AccDecinterpolator=new AccelerateDecelerateInterpolator();
    private Interpolator Linearinterpolator=new LinearInterpolator();
    private Interpolator bounceInterpolator=new BounceInterpolator();


    public Fragment1() {

        super();
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
                        iv.animate().translationX(500).setInterpolator(AccDecinterpolator)
                                .setDuration(1500)
                                .start();
                        isStart=true;
                        break;
                    }
                    case R.id.linear:{
                        iv.animate().translationX(500).setInterpolator(Linearinterpolator)
                                .setDuration(1500)
                                .start();
                        isStart=true;
                        break;
                    }
                    case R.id.bound:{
                        iv.animate().translationX(500).setInterpolator(bounceInterpolator)
                                .setDuration(1500)
                                .start();
                        isStart=true;
                        break;
                    }

                }
                break;}
                case R.id.tranY:
                {
                    switch (radioGroup2.getCheckedRadioButtonId()){
                        case R.id.acdec:{
                            iv.animate().translationY(500).setInterpolator(AccDecinterpolator)
                                    .setDuration(1500)
                                    .start();
                            isStart=true;
                            break;
                        }
                        case R.id.linear:{
                            iv.animate().translationY(500).setInterpolator(Linearinterpolator)
                                    .setDuration(1500)
                                    .start();
                            isStart=true;
                            break;
                        }
                        case R.id.bound:{
                            iv.animate().translationY(500).setInterpolator(bounceInterpolator)
                                    .setDuration(1500)
                                    .start();
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
                            iv.animate().rotationX(360).setInterpolator(AccDecinterpolator)
                                    .setDuration(1500)
                                    .start();
                            isStart=true;
                            break;
                        }
                        case R.id.linear:{
                            iv.animate().rotationX(360).setInterpolator(Linearinterpolator)
                                    .setDuration(1500)
                                    .start();
                            isStart=true;
                            break;
                        }
                        case R.id.bound:{
                            iv.animate().rotationX(360).setInterpolator(bounceInterpolator)
                                    .setDuration(1500)
                                    .start();
                            isStart=true;
                            break;
                        }

                    }
                    break;
                }

                case R.id.rotaY:
                {
                    iv.animate().rotationY(360).setInterpolator(AccDecinterpolator)
                            .setDuration(1500)
                            .start();
                    isStart=true;
                    break;
                }
            }
        }else {

            switch (radioGroup.getCheckedRadioButtonId()) {

                case R.id.tranX:
                {
                    switch (radioGroup2.getCheckedRadioButtonId()){
                        case R.id.acdec:{
                            iv.animate().translationX(-500).setInterpolator(AccDecinterpolator)
                                    .setDuration(1500)
                                    .start();
                            isStart=false;
                            break;
                        }
                        case R.id.linear:{
                            iv.animate().translationX(-500).setInterpolator(Linearinterpolator)
                                    .setDuration(1500)
                                    .start();
                            isStart=false;
                            break;
                        }
                        case R.id.bound:{
                            iv.animate().translationX(-500).setInterpolator(bounceInterpolator)
                                    .setDuration(1500)
                                    .start();
                            isStart=false;
                            break;
                        }

                    }
                break;}
                case R.id.tranY:
                {
                    switch (radioGroup2.getCheckedRadioButtonId()){
                        case R.id.acdec:{
                            iv.animate().translationY(-500).setInterpolator(AccDecinterpolator)
                                    .setDuration(1500)
                                    .start();
                            isStart=false;
                            break;
                        }
                        case R.id.linear:{
                            iv.animate().translationY(-500).setInterpolator(Linearinterpolator)
                                    .setDuration(1500)
                                    .start();
                            isStart=false;
                            break;
                        }
                        case R.id.bound:{
                            iv.animate().translationY(-500).setInterpolator(bounceInterpolator)
                                    .setDuration(1500)
                                    .start();
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
                            iv.animate().rotationX(-360).setInterpolator(AccDecinterpolator)
                                    .setDuration(1500)
                                    .start();
                            isStart=false;
                            break;
                        }
                        case R.id.linear:{
                            iv.animate().rotationX(-360).setInterpolator(Linearinterpolator)
                                    .setDuration(1500)
                                    .start();
                            isStart=false;
                            break;
                        }
                        case R.id.bound:{
                            iv.animate().rotationX(-360).setInterpolator(bounceInterpolator)
                                    .setDuration(1500)
                                    .start();
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
                            iv.animate().rotationY(-360).setInterpolator(AccDecinterpolator)
                                    .setDuration(1500)
                                    .start();
                            isStart=false;
                            break;
                        }
                        case R.id.linear:{
                            iv.animate().rotationY(-360).setInterpolator(Linearinterpolator)
                                    .setDuration(1500)
                                    .start();
                            isStart=false;
                            break;
                        }
                        case R.id.bound:{
                            iv.animate().rotationY(-360).setInterpolator(bounceInterpolator)
                                    .setDuration(1500)
                                    .start();
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
