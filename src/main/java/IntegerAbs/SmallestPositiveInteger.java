/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IntegerAbs;
// The program is printing the smallest positive integer that is 
// absent in the array.
/**
 *
 * @author USER
 */

public class SmallestPositiveInteger {
    
// creating a method that checks to find the smallest positive integer
    public  static int smallestNumber(int[] a){
        //
        int z = a.length;   //initialize a variable to hold the array length
        int [] counter = new int[z + 1];  // a counter thatloops through the index of the array
        
        for(int x:a)  //Looking through the individal index

// check for the condition where the index is geater than 0 and does not exceed the ength of the array            
            if(x>0 && x<= z)
                    counter[x]++; 
        for(int x =1; x<z+1; x++)    
            
            if(counter[x] == 0)
                return x;
        
        return z+1;
      
    }
    public static void main(String args[]){
        int a[] = {3,2,5,6,7,10,4,6,9,6,2,1};
        
        System.out.println(smallestNumber(a));
    }

}


