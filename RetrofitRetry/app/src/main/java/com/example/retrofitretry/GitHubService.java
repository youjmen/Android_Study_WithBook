package com.example.retrofitretry;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface GitHubService {
    @GET("users/{user}")
    Call<JsonParse> getInfo(@Path("user") String id);
}
