/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;


//import java.util.Scanner;


/**
 *
 * @author asus
 */
public class Task1 {
    public static void main(String [] args){
        int [] arr={12,22,33};
        //l  количество четных цифр 
        //k количество нечетных цифр
        //m общее количество цифр
        int e=0;//количество чисел с четными цифрами
        int u=0;// количество чисел с нечетными цифрами
        for (int i = 0;i < arr.length;i++){
            int l=0;
            int k=0;
            int m=0;
            while(arr[i] > 0){
                if (arr[i]%2 == 0){
                    l+=1;
                    m+=1;
                }
                else {
                    k+=1;
                    m+=1;
                }
                arr[i]=(arr[i]-arr[i]%2)/10;
            }
            if (l==m) {
               e+=1;
            }
            else if(k==m){
               u+=1;
            }        
        }
        if (e==2){
            System.out.println("Есть два числа с четными цифрами");
        }
        if (u==2){
            System.out.println("Есть два числа с нечетными цифрами");
        }
        if (u!=2&e!=2){
            System.out.println("Таких чисе нет");
        }
    }
}
//Scanner scanner=new Scanner(System.in);
//        int n=scanner.nextInt();
//        Scanner sc = new Scanner(System.in);
//        int [] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i]= sc.nextInt();
//        }

