package com.company.seven;

public class Automobil2 {
    public static void main(String[]args){
        Automobil a=new Automobil();
        a.automobil("BMW","X3", 210.0);
        Automobil b=new Automobil();
        b.automobil("Toyota", "C-HR", 170.0);
        Automobil c=new Automobil();
        c.automobil("Ford", "Ranger", 180.0);

        System.out.println("Brzina " + a.nazivAutomobila + " model: " + a.modelAutomobila + " je " + a.brzina + "km/h");
        System.out.println("Brzina " + b.nazivAutomobila + " model: " + b.modelAutomobila + " je " + b.brzina + "km/h");
        System.out.println("Brzina " + c.nazivAutomobila + " model: " + c.modelAutomobila + " je " + c.brzina + "km/h");

        if(a.brzina>b.brzina&&a.brzina>c.brzina){
            System.out.println("BMW je najbrže auto u odnosu na Toyotu i Ford sa brzinom: " + a.brzina);
        }else if(b.brzina>a.brzina&&b.brzina>c.brzina){
            System.out.println("Toyota je najbrže auto u odnosu na BMW i Ford  sa brzinom: " + b.brzina);
        }else if(c.brzina>a.brzina&&c.brzina>b.brzina){
            System.out.println("Ford je najbrže auto u odnosu na Toyotu i BMW  sa brzinom: " + c.brzina);
        }
        }
    }
