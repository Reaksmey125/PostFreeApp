package com.reaksmey.postfreeapp.api;

import com.reaksmey.postfreeapp.models.response.PostResponse;
import com.reaksmey.postfreeapp.models.response.PostsItem;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiInterface {


    @GET("/posts")
    Call<PostResponse> getAllPosts();
    @GET("/posts/{id}")
    Call<PostsItem> getPostById(@Path("id") int id);
}