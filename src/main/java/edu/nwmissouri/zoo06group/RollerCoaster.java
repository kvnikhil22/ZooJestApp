/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo06group;

/**
 *
 * @author Nikhil Krishnan Venkatesh
 */
public class RollerCoaster extends AdventureRides{
    private int wheels;
    private int players;
    private String ticketType;
    /**
     * getter wheels method 
     * @return wheels
     */

    public int getWheels() {
        return wheels;
    }
/**
 * setter wheels method
 * @param wheels 
 */
    public void setWheels(int wheels) {
        this.wheels = wheels;
    }
/**
 * get Players method 
 * @return players
 */
    public int getPlayers() {
        return players;
    }
/**
 * set players method
 * @param players 
 */
    public void setPlayers(int players) {
        this.players = players;
    }
/**
 * get Ticket Type method
 * @return ticketType
 */
    public String getTicketType() {
        return ticketType;
    }
/**
 * set Ticket Type method
 * @param ticketType 
 */
    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }
    
   /**
    * resultOfGame method 
    * @return string "You never Loose2"
    */ 
   @Override
    public String resultOfGame(){
        
        System.out.println("You won the game");
        return "You never Loose";
    }
    /**
     * onlineBooking method
     * @return string "Your ticket is booked"
     */
    @Override
    public  String onlineBooking(){
         System.out.println("Welcome to adventure rides");
    return "Your ticket is booked";
    }
    /**
     * rotations method
     * @return 0
     */
    
    public static int rotations(){
        System.out.println("You successfully stayed alive");
    return 0;
    }
    public static void Casting()



{
int i=9;
double d=(double) i;
System.out.println("Casted to "+d);






}





public static void Exception()
{
String[] i={"altima","ford","malibu"};



try{
String s=i[10];
System.out.println("String:"+s);





}catch(Exception E)
{
System.out.println("Generated Exception is "+E);




}
}
public static void main(String[] args)
{
Exception();
Casting();



}



   
    
}
