package com.utils.forms;

import java.util.Scanner;

public class FormsBuilder {
    public static void printTitle(String msg, char c){
        System.out.println(msg);

        for (int i = 0; i < msg.length(); i++) {
            System.out.print(c);
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
    /*
     * get value ask for integrar given a message it
     * prints : after msg
     * @param msg
     * @return
     */
    public static int getValueInt(String msg){
        Scanner auxAs = new Scanner(System.in);
        System.out.print(msg + ": ");
        return auxAs.nextInt();
        
    }
    /*
     * get value ask for double given a message it
     * prints : after msg
     * @param msg
     * @return
     */
    public static double getValueDouble(String msg){
        Scanner auxAs = new Scanner(System.in);
        System.out.print(msg + ": ");
        return auxAs.nextDouble();
    }

    /*
     * get value ask for double given a message it
     * prints : after msg
     * @param msg
     * @return
     */
    public static String getValueString(String msg){
        Scanner auxAs = new Scanner(System.in);
        System.out.print(msg + ": ");
        return auxAs.nextLine();
    }
}
