/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implement;

/**
 *
 * @author Prakhar
 */

class method2 implements Runnable {
    public void run(){
        System.out.println("Thread running...................");
    }
}
public class Implement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        method2 m2 = new method2();
        Thread t1 = new Thread(m2);
        t1.start();
    }
    
}
