package com.company;

public class Main {

    public static void main(String[] args) {
        int []x=new int[50];
        for (int i = 0; i < x.length; i++) {
            x[i]= (int) (Math.random()*9);
            System.out.print(x[i]+" ");
            
        }
        int y;
        for (int i = 0; i <x.length; i++) {
            for (int j =0; j <x.length-1; j++) {
                if (x[j]>x[j+1]){
                    y=x[j];
                    x[j]=x[j+1];
                    x[j+1]=y;

                }


            }
        }
        System.out.println();
        for (int q:x
             ) {
            System.out.print(q+ " ");

        }
        

    }
}
