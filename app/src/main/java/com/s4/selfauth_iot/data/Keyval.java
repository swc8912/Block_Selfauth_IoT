package com.s4.selfauth_iot.data;

/**
 * Created by 우철 on 2016-07-09.
 */
public class Keyval{
    public String key;
    public String value;

    public Keyval(String key, String value){
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}