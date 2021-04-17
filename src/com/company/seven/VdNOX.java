package com.company.seven;

public class VdNOX {
    public static void main(String[]args){
        int w=10,h=20;
        int [][] points={{2,4},{1,5},{6,6},{3,2},{0,0}};

        for(int i=0;i<w;i++){
            for(int j=0;j<h;j++){
                boolean postojiTacka=false;
                for(int k=0;k<points.length;k++) {
                    if (points[k][0] == i && points[k][1] == j)
                        postojiTacka = true;
                }
                if(postojiTacka) System.out.print("X");
                else System.out.print("O");
            }
            System.out.println();
            }
        }
    }
