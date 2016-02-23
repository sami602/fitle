package com.example.root.fittle;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.koushikdutta.async.future.FutureCallback;
import com.koushikdutta.ion.Ion;
import android.content.Context;
import android.util.Base64;

/**
 * Created by root on 21/02/16.
 */
public class User {
    private String token;
    private String secret;
    User(){
        token = null;
        secret = null;

    }
    public User(JsonElement t){
        token = t.getAsString();
        secret="";

    }


    public String getToken(){
        return token;
    }
    public String getSecret(){
        return secret;
    }
    public void setSecret(String s){
        secret=s;
    }
    public boolean isAuthenticated() {return !(token == null);}


}
