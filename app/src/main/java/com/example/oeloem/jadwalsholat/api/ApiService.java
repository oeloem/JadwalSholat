package com.example.oeloem.jadwalsholat.api;

import com.example.oeloem.jadwalsholat.model.ModelJadwal;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {

    @GET("jakarta.json")
    Call<ModelJadwal> getJadwal();

}

