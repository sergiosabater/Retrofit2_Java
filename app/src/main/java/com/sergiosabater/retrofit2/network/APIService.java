package com.sergiosabater.retrofit2.network;

import com.sergiosabater.retrofit2.model.PostModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIService {

    @GET("posts")
    Call<List<PostModel>> getPostsList();

}
