package com.insurance.client;

public class Test { 

    public static void main(String[] args) 

    { 

        String s1 = "HELLO"; 

        String s2 = "HELLO"; 

        String s3 =  new String("HELLO"); 
        
        
       if( "hello" == "hello") {
    	   
       }
       
       if("hello".equals("hello")) {
    	   
       }
        
        System.out.println(s1 == s2); 

        System.out.println(s1 == s3); 

        System.out.println(s1.equals(s2)); 

        System.out.println(s1.equals(s3)); 

    } 
} 
