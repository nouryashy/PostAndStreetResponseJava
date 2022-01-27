package com.example.postandstreetresponsejava;

import java.util.List;

import io.reactivex.Single;
import retrofit2.Call;
import retrofit2.http.GET;

public interface APIInterface {
//    @GET("posts")
//    public Single<List<PostModel>> getPosts();

//    @GET("posts")
//    public Call<List<PostModel>> getPosts();

        @GET("streeters")
    public Call<List<PostModel>> getPosts();
}
