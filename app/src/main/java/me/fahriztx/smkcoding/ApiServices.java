package me.fahriztx.smkcoding;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiServices {

    @GET("/posts")
    Call<Post> getPost();
}
