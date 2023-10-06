package com.example.countrynameapp.service;


import com.example.countrynameapp.model.Result;

import retrofit2.Call;
import retrofit2.http.GET;
public interface GetCountryDataService {
    //retrofit interface. it act as bridge between model class and retrofit instance with the service and the API
    @GET("countries")  //end point not complete api url. (api.printfull.com/countries).
    //base url is api.printfull.com
    Call<Result> getResult();

}
