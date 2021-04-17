package com.company.Zadaća;

public class VarijabilniArgumenti {
    public static int Zbir(int ... args) {
        int s=0;
        for(int broj:args){
            s+=broj;
        }
        return s;
    }
}
