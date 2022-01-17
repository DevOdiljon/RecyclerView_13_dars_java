package com.example.a13_recyclerviewwithanimationjava.model;

import android.util.Log;

public class Memeber {
    String tv_name;
    String tv_tel_number;
    public Memeber(String tv_name, String tv_tel_number) {
        this.tv_name = tv_name;
        this.tv_tel_number = tv_tel_number;
    }

    public String getTv_name() {
        return tv_name;
    }

    public String getTv_tel_number() {
        return tv_tel_number;
    }
}
