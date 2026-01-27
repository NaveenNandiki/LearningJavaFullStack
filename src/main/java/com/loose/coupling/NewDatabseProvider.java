package com.loose.coupling;

public class NewDatabseProvider implements UserDataProvider{
    @Override
    public String getUserDetails(){
        return "Data fetching from mongo DB";
    }
}
