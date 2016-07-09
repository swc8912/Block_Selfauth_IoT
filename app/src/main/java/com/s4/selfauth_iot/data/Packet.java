package com.s4.selfauth_iot.data;

import java.util.ArrayList;

/**
 * Created by 우철 on 2016-07-09.
 */
public class Packet {
    private ArrayList<Keyval> authinfo;
    private int cmd;

    public Packet(){
        authinfo = new ArrayList<Keyval>();
    }

    public ArrayList<Keyval> getAuthinfo() {
        return authinfo;
    }

    private void setAuthinfo(ArrayList<Keyval> authinfo) {
        this.authinfo = authinfo;
    }

    public int getCmd() {
        return cmd;
    }

    public void setCmd(int cmd) {
        this.cmd = cmd;
    }
}
