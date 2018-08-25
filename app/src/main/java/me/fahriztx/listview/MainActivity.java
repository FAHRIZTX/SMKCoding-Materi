package me.fahriztx.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.frame)
    FrameLayout frameLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnSatu)
    public void clickBtnSatu(View btn){
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.frame, new FragmentSatu())
                .commit();
    }

    @OnClick(R.id.btnDua)
    public void clickBtnDua(View btn){
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.frame, new FragmentDua())
                .commit();
    }
}