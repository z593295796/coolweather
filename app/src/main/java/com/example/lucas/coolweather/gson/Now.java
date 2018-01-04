package com.example.lucas.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by lucas on 2018/1/3.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {

        @SerializedName("txt")
        public String info;

    }

}
