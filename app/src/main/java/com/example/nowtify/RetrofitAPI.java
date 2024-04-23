package com.example.nowtify;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface RetrofitAPI {
    @GET
    Call<NewsRVModal> getAllNews(@Url String url);

    @GET
    Call<NewsRVModal> getNewsByCategory(@Url String url);
}
