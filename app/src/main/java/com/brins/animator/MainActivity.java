package com.brins.animator;

import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private TabLayout tb;
    private android.support.v4.view.ViewPager vp;
    List<Fragmentbase>fragmentbaseList=new ArrayList<>();
    MyAdapter adapter=new MyAdapter(getSupportFragmentManager());
    Fragmentbase fragmentbase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tb = findViewById(R.id.tab);
        vp = findViewById(R.id.vip);

        for (int i=0;i<4;i++) {

        fragmentbaseList.add(initFragment(i));

        }

        for (int i=0;i<fragmentbaseList.size();i++) {
            adapter.addFragment(fragmentbaseList.get(i),fragmentbaseList.get(i).title);
        }
        vp.setAdapter(adapter);
        tb.setupWithViewPager(vp);

    }

    private Fragmentbase initFragment(int i){

        switch (i){
            case 0:
            {fragmentbase=new Fragment1("ValueProperty");
                break;}
            case 1:{
                fragmentbase=new Fragment_obj("ObjectAnimation");
                break;
            }
            case 2:{
                fragmentbase=new Fragment_set("AnimationSet");
                break;
            }
            case 3:{
                fragmentbase=new Fragment_custom("CustomAnimation");
                break;
            }
            default:
                break;
        }
        return fragmentbase;
    }
}
