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
public class ThreadNumeri {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conta p1 = new Conta('A');
        Conta p2 = new Conta('B');
        Thread T1 = new Thread(p1);
        Thread T2 = new Thread(p2);
        T1.start();
        T2.start();
    }
    
}
