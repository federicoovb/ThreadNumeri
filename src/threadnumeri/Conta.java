/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadnumeri;

/**
 *
 * @author violaboros.federico
 */
public class Conta implements Runnable{
    char ch;
    int i = 0, j = 50;
    boolean terminato = false;
    
    public Conta(char c){
        ch = c;
    }
    
    public void run(){
        if(ch == 'A'){
            while(!terminato){
                System.out.println(i);
                i++;
                try {
                    Thread.sleep(500);
                } catch(InterruptedException e){                    
                }
                if(i > 50){
                    this.ferma();
                }
            }
        }else{
            while(!terminato){
                System.out.println("\t\t" + j);
                j--;
                try{
                    Thread.sleep(500);
                }catch(InterruptedException e){                    
                }
                if (j > 50) {
                    this.ferma();
                }
            }
        }
    }
    public void ferma(){
        this.terminato = true;
    }
}
