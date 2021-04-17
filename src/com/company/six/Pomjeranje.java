package com.company.six;

public class Pomjeranje {
    public static void main(String[]args) throws InterruptedException {
      while(true){
          for(int i=1;i<=10;i++){
              for(int j=0;j<i;j++){
                  System.out.print(" ");
              }
              System.out.print("*\r");
              Thread.sleep(100);
          }

        for(int i=10;i>=1;i--){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            System.out.print("*\r");
            Thread.sleep(100);
        }}
        }
    }
