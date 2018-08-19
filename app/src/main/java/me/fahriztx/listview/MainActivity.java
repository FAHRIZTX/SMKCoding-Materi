package me.fahriztx.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView mListContacts;
    private ContactAdapter mContactAdapter;
    private List<ContactModel> mItemContacts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListContacts = findViewById(R.id.list_contacts);
        mItemContacts = new ArrayList<>();

        mItemContacts.add(new ContactModel("Muhammad Fahri","085895784355", R.mipmap.user));
        mItemContacts.add(new ContactModel("Sugeng Riyadi","085895784354", R.mipmap.user));
        mItemContacts.add(new ContactModel("Ongky Cristina","085895784353", R.mipmap.user));
        mItemContacts.add(new ContactModel("Febri Prasasti","085895784352", R.mipmap.user));
        mItemContacts.add(new ContactModel("Rizky Adi Riyanto","085895784351", R.mipmap.user));
        mItemContacts.add(new ContactModel("Rara","085895784351", R.mipmap.user));
        mItemContacts.add(new ContactModel("Diva","085895784351", R.mipmap.user));
        mItemContacts.add(new ContactModel("Riyan Satria","085895784351", R.mipmap.user));
        mItemContacts.add(new ContactModel("Alvin","085895784351", R.mipmap.user));
        mItemContacts.add(new ContactModel("Farras","085895784351", R.mipmap.user));
        mItemContacts.add(new ContactModel("Vauzan","085895784351", R.mipmap.user));
        mItemContacts.add(new ContactModel("Marchello","085895784351", R.mipmap.user));
        mItemContacts.add(new ContactModel("Ulum","085895784351", R.mipmap.user));

        mContactAdapter = new ContactAdapter(mItemContacts);

        mListContacts.setAdapter(mContactAdapter);

        mListContacts.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ContactModel model = mItemContacts.get(position);

                Toast.makeText(MainActivity.this, "Hai "+model.getName(), Toast.LENGTH_SHORT).show();
            }
        });

    }
}

