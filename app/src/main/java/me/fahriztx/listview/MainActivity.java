package me.fahriztx.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView mListMenu;
    private ArrayAdapter<String> mAdapterMenu;
    private String[] mMinuman = new String[] {
            "Aqua",
            "Es Teh",
            "Cleo",
            "Coca-Cola",
            "Fanta",
            "Sprite",
            "Yakult",
            "Club"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListMenu = findViewById(R.id.list_menu);
        mAdapterMenu = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, mMinuman);
        mListMenu.setAdapter(mAdapterMenu);
    }
}

