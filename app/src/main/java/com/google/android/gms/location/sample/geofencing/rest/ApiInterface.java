package com.google.android.gms.location.sample.geofencing.rest;
//
//import com.example.plisbisageobajing.respon_login.ResponseLogin;
//import com.example.plisbisageobajing.respon_login.responnse_read.ResponseRead;
//import com.example.plisbisageobajing.respon_login.response_create.ResponseCreate;
import com.google.android.gms.location.sample.geofencing.respon_login.ResponseLogin;
import com.google.android.gms.location.sample.geofencing.respon_login.responnse_read.ResponseRead;
import com.google.android.gms.location.sample.geofencing.respon_login.response_create.ResponseCreate;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

//import com.google.android.gms.location.sample.geofencing.response.respon_login.ResponseLogin;
//import com.google.android.gms.location.sample.geofencing.response.respon_login.responnse_read.ResponseRead;
//import com.google.android.gms.location.sample.geofencing.response.respon_login.response_create.ResponseCreate;

public interface ApiInterface {

    @FormUrlEncoded
    @POST(Constant.CREATE)
    Call<ResponseCreate> getkreatif
            (@Field("stats") String first, @Field("user") String last);


    @GET(Constant.READ)
    Call<ResponseRead> getData();

    @FormUrlEncoded
    @POST(Constant.LOGIN)
    Call<ResponseLogin> getLog(
            @Field("edtusername") String first,
            @Field("edtpassword") String last
    );

}
