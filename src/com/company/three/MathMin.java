package com.company.three;

public class MathMin {
    public static void main (String [] args){
        int a= -6;
        int b= -69853147;
        double c= -124.3659;
        double d= -5642.1879;

        System.out.println("Manji broj od -6 i -69853147 je: " + Math.min( a,b));
        System.out.println("Manji broj od -69853147 i -124.3659 je: " + Math.min( b,c));
        System.out.println("Manji broj od -124.3659 i -5642.1879 je: " + Math.min( c,d));
        System.out.println("Manji broj od -5642.1879 i -6 je: " + Math.min( d,a));
        System.out.println("Najmanji broj od četiri ponuđena je: " + Math.min( b,d));
    }
}