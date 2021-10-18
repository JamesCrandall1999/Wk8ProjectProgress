package com.company.controllers;

import com.company.views.UserView;

public class Main {
    public static UserView view;
    public static String choice;
    public static int currentIdentity;
    public static String currentName;
    public static void main(String[] args) {

       view = new UserView();
       choice = view.startMenu();
       switch(choice){
           case "1":
               //currentIdentity = view.login();
                break;
           case "2":
               currentName = view.createUser();
               break;
           case "3":
               view.exit();
               break;
           default:
               view.invalidchoice1();
       }
    }
}
