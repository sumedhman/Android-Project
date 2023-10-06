package com.example.countrynameapp;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.example.countrynameapp.model.CountryModel;
import com.example.countrynameapp.model.Result;
import com.example.countrynameapp.service.GetCountryDataService;
import com.example.countrynameapp.service.RetrofitInstance;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    ArrayList<CountryModel> countries;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getCountries();

    }
    public  Object getCountries(){
        GetCountryDataService getCountryDataService = RetrofitInstance.getCountryDataService();
        Call<Result> call = getCountryDataService.getResult();

        call.enqueue(new Callback<Result>() {
            @Override
            public void onResponse(Call<Result> call, Response<Result> response) {
                Result result= response.body();

                if(result != null && result.getResult() != null){
                    countries = (ArrayList<CountryModel>) result.getResult();

                    for(CountryModel c:countries){
                        Log.i("TAG",""+c.getName());
                    }
                }

            }

            @Override
            public void onFailure(Call<Result> call, Throwable t) {

            }
        });
       return countries;
    }
}