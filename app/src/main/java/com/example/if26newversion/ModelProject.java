package com.example.if26newversion;

import java.util.HashMap;
import java.util.Map;

public class ModelProject {

    private Map<String, UserModel> users = new HashMap<>();


    public void registerUser(String username, String mailAdress, String password){
        //we are looking if the mail adress is not already use
        if (users.containsKey(mailAdress)){
            System.out.println("!!!!!!!! CETTE ADDRESS MAIL EST DEJA UTILISER !!!!!!!!!!!!!!");
        }else{
            users.put(mailAdress,new UserModel(username,password));
        }
    }
    public Map<String, UserModel> getRegisterUsers(){
        return users;
    }
}
