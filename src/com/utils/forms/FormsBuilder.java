package com.utils.forms;

public class FormsBuilder {
    public static void printTitle(String msg){
        System.out.println(msg);

        for (int i = 0; i < msg.length(); i++) {
            System.out.print("=");
        }
        System.out.println();
    }

    public static void printValue(String Key, String Value){
        
        System.out.println(Key + ": " + Value);
    
    }

    public static void divider(char c){

        for (int i = 0; i < 20; i++) {
            System.out.print(c);
        }
        System.out.println();
    }
}
