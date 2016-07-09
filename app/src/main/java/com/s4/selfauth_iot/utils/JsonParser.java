package com.s4.selfauth_iot.utils;

import android.util.Log;

import com.google.gson.*;
import com.s4.selfauth_iot.data.Packet;

/**
 * Created by 우철 on 2016-07-09.
 */
public class JsonParser {
    private static Gson jspGson;
    private static JsonParser jsp = new JsonParser();

    private JsonParser(){
        if(jspGson == null)
            jspGson = new GsonBuilder().create();
        String value = "{'authinfo': [ {'key':'key1','value':'val1'} ]}";
        Packet p = jspGson.fromJson(value, Packet.class);
        for(int i=0; i<p.getAuthinfo().size(); i++)
            Log.d("1", p.getAuthinfo().get(i).getKey() + " " + p.getAuthinfo().get(i).getValue());

        //gson.toJson(person));
    }

    public static JsonParser getInstance(){
        return jsp;
    }

    public Gson getJspGson(){
        return jspGson;
    }
}
