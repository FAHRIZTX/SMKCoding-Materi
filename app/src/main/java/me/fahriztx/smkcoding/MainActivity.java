package me.fahriztx.smkcoding;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.recycler)
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);

        recyclerView.setLayoutManager(linearLayoutManager);

        getJSON json = new getJSON();
        json.execute("https://jsonplaceholder.typicode.com/posts");

    }

    private class getJSON extends AsyncTask<String, Void, String> {

        @Override
        protected void onPreExecute() {
            System.out.println("ON PreExceute");
            super.onPreExecute();
        }

        @Override
        protected String doInBackground(String... strings) {
            System.out.println("ON doInBackground");
            return Request.GET(strings[0]);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            System.out.println("ON PostExceute");
            System.out.println(s);

            try {

                JSONArray jsonArray = new JSONArray(s);
                int jsonArrayTotal = jsonArray.length();
                List<User> userList = new ArrayList<>();

                for (int i = 0; i < jsonArrayTotal; i++){
                    JSONObject jsonObject = jsonArray.getJSONObject(i);

                    User user = new User(
                            jsonObject.getInt("id"),
                            jsonObject.getString("title"),
                            jsonObject.getString("body"),
                            jsonObject.getInt("userId")
                    );

                    userList.add(user);

                }

                recyclerView.setAdapter(new RecyclerAdapter(userList));

            } catch (JSONException e) {

            }
        }
    }
}
