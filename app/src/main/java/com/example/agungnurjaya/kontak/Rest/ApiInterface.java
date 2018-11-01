package com.example.agungnurjaya.kontak.Rest;
import com.example.agungnurjaya.kontak.Model.GetKontak;
import com.example.agungnurjaya.kontak.Model.PostPutDelKontak;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.HTTP;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface ApiInterface {

    @GET("kontak.php")
    Call<GetKontak> getKontak();

    @POST("insert.php")
    Call<String> postKontak(@Body PostPutDelKontak post);

    @FormUrlEncoded
    @POST("updatephp.php")
    Call<PostPutDelKontak> putKontak(@Field("id") String id,
                                     @Field("nama") String nama,
                                     @Field("nomor") String nomor);

    @FormUrlEncoded
    @POST("deletedata.php")
    Call<PostPutDelKontak> deleteKontak(@Field("id") String id);

}
