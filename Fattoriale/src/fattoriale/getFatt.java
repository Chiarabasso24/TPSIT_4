/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fattoriale;

/**
 *
 * @author Studente
 */
public class getFatt extends Thread{
    public int fat = 1;
    public int n;
    public getFatt(int n){
        this.n = n;
    }
    public void run(){
        int i = this.n;
        while(n>0){
            this.fat *= this.n;
            n--;
        }
        System.out.println(i+"!="+fat);
    } 
}