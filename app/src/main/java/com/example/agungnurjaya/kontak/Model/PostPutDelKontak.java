package com.example.agungnurjaya.kontak.Model;

import com.google.gson.annotations.SerializedName;

public class PostPutDelKontak {
    @SerializedName("status")
    String status;
    @SerializedName("result")
    Kontak mKontak;
    @SerializedName("message")
    String message;
    String nama, nomor;

    public PostPutDelKontak(String nama, String nomor){
        this.nama = nama;
        this.nomor = nomor;
    }

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public Kontak getKontak() {
        return mKontak;
    }
    public void setKontak(Kontak Kontak) {
        mKontak = Kontak;
    }
}
