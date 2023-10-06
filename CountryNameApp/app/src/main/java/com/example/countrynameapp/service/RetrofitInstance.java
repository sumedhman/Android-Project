package com.example.countrynameapp.service;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitInstance {
    private static Retrofit retrofit=null;
    //add base url as static
    private static String BASE_URL="https://api.printful.com/";
    //singleton pattern is use to create the retrofit instance
    public static GetCountryDataService getCountryDataService(){
        //in order to check this create only one time object or not
        //if not retrofit object is create before  then bellow code will create it
        if (retrofit==null){
            retrofit= new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        //if retrofit instance all ready created
        return retrofit.create(GetCountryDataService.class);
    }
}
