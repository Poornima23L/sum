package com.tgt.ignite.plus;

import java.util.Scanner;

public class sum
{
    public static void main(String[] args){
        int n,i,e1=0,odd=0;
        Scanner read = new Scanner(System.in);
        System.out.println("enter n");
        n = read.nextInt();
        for(i=1;i<=n;i++){
            if(i%2==0){
                e1=e1+i;

            }
            else{
                odd=odd+i;
            }
        }
        System.out.println("the sum of n even number" +e1);
        System.out.println("the sum of n odd number" +odd);

    }
}
