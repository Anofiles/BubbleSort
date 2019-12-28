package com.company;

public class Main {

    public static void main(String[] args) {
        int []x=new int[5];
        for (int i = 0; i < x.length; i++) {
            x[i]= (int) (Math.random()*9);
            System.out.print(x[i]+" ");
            
        }
        
        

    }
}
