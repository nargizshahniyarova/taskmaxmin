package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    int array[]=new int[5];
    int max=0,min=0,sum=0;
        Scanner scanner=new Scanner(System.in);
        for(int i=0;i<5;i++){
            array[i]= scanner.nextInt();
        }
        for(int a=0;a<array.length;a++){
            min=array[a];
            max=array[a];
            for(a=0;a<array.length;a++){
                sum+=array[a];
           if(min>array[a]){
               min=array[a];
             }
           if(max<array[a]){
              max=array[a];
          }
      }

        }

        System.out.println((sum-max)+"-"+(sum-min));}

}
