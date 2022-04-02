package com.sergiosabater.retrofit2.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.sergiosabater.retrofit2.model.PostModel;
import com.sergiosabater.retrofit2.network.APIService;
import com.sergiosabater.retrofit2.network.RetrofitInstance;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class PostListViewModel extends ViewModel {

    private MutableLiveData<List<PostModel>> postsList;

    public PostListViewModel() {
        this.postsList = new MutableLiveData<>();
    }

    public void makeAPICall() {
        APIService apiService = RetrofitInstance.getRetrofitInstance().create(APIService.class);
        Call<List<PostModel>> call = apiService.getPostsList();
        call.enqueue(new Callback<List<PostModel>>() {
            @Override
            public void onResponse(Call<List<PostModel>> call, Response<List<PostModel>> response) {

            }

            @Override
            public void onFailure(Call<List<PostModel>> call, Throwable t) {

            }
        });
    }
}
