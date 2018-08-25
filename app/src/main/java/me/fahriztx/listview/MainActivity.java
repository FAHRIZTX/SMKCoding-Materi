package me.fahriztx.listview;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    // TODO : NANGKAP ID ViewPager DENGAN ButterKnife
    @BindView(R.id.viewpager)
    ViewPager viewPager;

    // TODO : NANGKAP ID TabLayout DENGAN ButterKnife
    @BindView(R.id.tablayout)
    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO : JANGAN LUPA ButterKnife.bind(this); WAJIB SAAT MENGGUNAKAN BUTTERKNIFE!!!
        ButterKnife.bind(this);

        // TODO : ADD LIST FRAGMENT
        List<Fragment> fragmentList = new ArrayList<>();
        fragmentList.add(new FragmentSatu());
        fragmentList.add(new FragmentDua());
        fragmentList.add(new FragmentSatu());
        fragmentList.add(new FragmentDua());
        fragmentList.add(new FragmentSatu());
        fragmentList.add(new FragmentDua());

        // TODO : ADD LIST TITLE UNTUK TABLAYOUT
        List<String> titleList = new ArrayList<>();
        titleList.add("SATU");
        titleList.add("DUA");
        titleList.add("SATU");
        titleList.add("DUA");
        titleList.add("SATU");
        titleList.add("DUA");

        // TODO : SET ADAPTER UNTUK VIEWPAGER
        viewPager.setAdapter(new ViewPagerAdapter(getSupportFragmentManager(), fragmentList, titleList));

        // TODO : SET TABLAYOUT AGAR MENGIKUTI VIEWPAGER
        tabLayout.setupWithViewPager(viewPager);
    }
}