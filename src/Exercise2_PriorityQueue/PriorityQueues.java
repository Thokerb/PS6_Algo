/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise2_PriorityQueue;

/**
 *
 * @author bmccune
 */
public class PriorityQueues {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        PriorityQueue<Integer,String> myQ = new SortedPriorityQueue<>();
        
        myQ.insert(5, "hello");
        myQ.insert(2, "whats up");
        myQ.insert(7, "how's it going?");
        System.out.println(myQ.min().getValue());
        
        
        
    }
    
}
