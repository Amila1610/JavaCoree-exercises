package com.company.five;

public class Kalkulator {
    /*double operand1;
    double operand2;*/

    public double add(double a , double b){
        return a+b;
    }
    public double sub(double a , double b){
        return a-b;
    }
    public double mul(double a , double b){
        return a*b;
    }
    public double div(double a , double b){
        return a/b;
    }
 public double rezultat(String operator, double a, double b){
        if(operator=="*"){
            return mul(a,b);
        }
     else if(operator=="/"){
         return div(a,b);
     }
     else if(operator=="-"){
         return sub(a,b);
     }
    else if(operator=="+"){
         return add(a,b);
     }
    return 0;
     }
 }
