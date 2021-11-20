/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nwmissouri.zoo06group;

/**
 *
 * @author Nikhil KrishnanVenkatesh
 */
public class Lion extends Animal {

    /**
     * Lion constructor 
     * @param name - the name of this Lion
     */
    public Lion(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.printf("I'm %s. I'm an Lion!", this.name);
    }

    @Override
    public void move() {
        System.out.println("When I move, I walk, walk, walk.");
    }

    double getLionAddition(double first, int second) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   public static void Casting()
    
   {
       int i=91;
       double d=(double) i;
       System.out.println("Casted to"+d);

     
    }

    public static void Exception()
    {
        int a=8;
        int i=0;
        try{
            int h=a/i;
            System.out.println("h:"+h);

        }catch(Exception E)
                {
              System.out.println("Generated Exception is"+E);
  
            
        }
    }
    public static void main(String[] args)
    {
       Exception();
       Casting();
       
    }

    }   

