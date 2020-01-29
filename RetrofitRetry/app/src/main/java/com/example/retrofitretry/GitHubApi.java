package com.example.retrofitretry;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class GitHubApi {
    private static GitHubApi apiInstance = new GitHubApi();
    public static GitHubApi getInstance() {
        return apiInstance;
    }
    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://api.github.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    GitHubService service = retrofit.create(GitHubService.class);
    public GitHubService getService() {
        return service;
    }

}
