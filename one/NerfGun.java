//Thanavat voloshin 632115022
package one;
public class NerfGun{
    int gunn = 1;
    int a = 1;
    public NerfGun(){
    }
    public void fire() {
    gunn = gunn - 1;
    if (gunn == 0){
        System.out.println("There is no ammuition");
    }
    else {
    System.out.println("BANG !!!");
    }
    }
    public void reload(int i){
    gunn = gunn + i;
    if (gunn >= 16){
        System.out.println("Error!! the ammunition is overload");
    gunn = gunn - i;
    }
    }
    public void displayNumOfAmmunition(){
    System.out.println(gunn+"bullet left");
    }
    public void displayGunID(){
    System.out.println("The ID of this gun is " + a);
     
}
    public NerfGun(int i){
    a = 2;
    gunn = 0;
    gunn = gunn+i;
    }
    
         
    
}