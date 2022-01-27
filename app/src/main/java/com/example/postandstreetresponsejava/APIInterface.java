package com.example.postandstreetresponsejava;

import java.util.List;

import io.reactivex.Single;
import retrofit2.Call;
import retrofit2.http.GET;

public interface APIInterface {
    //rxCall
//    @GET("posts")
//    public Single<List<PostModel>> getPosts();

    //callBack call
//    @GET("posts")
//    public Call<List<PostModel>> getPosts();

    //callBack call of street api
        @GET("streeters")
    public Call<List<PostModel>> getPosts();
}
