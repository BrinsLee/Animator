package com.brins.animator;

import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
public class MainActivity extends AppCompatActivity {

    private TabLayout tb;
    private android.support.v4.view.ViewPager vp;
    MyAdapter adapter=new MyAdapter(getSupportFragmentManager());
    /*private Button bt;
    private ImageView iv;*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tb = findViewById(R.id.tab);
        vp = findViewById(R.id.vip);

        for (int i=0;i<2;i++){
            adapter.addFragment(new Fragment1(),"title");
        }
        vp.setAdapter(adapter);
        tb.setupWithViewPager(vp);


    }
}
