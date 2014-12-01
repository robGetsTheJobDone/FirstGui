/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg2dlongbooty;

import java.util.ArrayList;

/**
 *
 * @author bpb
 */
public class Book implements java.io.Serializable{
  public  String Title;  public String Pub;  public int year; public int Cat;  public boolean circ; 
     public ArrayList<String>Sub  = new ArrayList<>(); 
   public ArrayList<String> Auth = new ArrayList<>();
    
    public Book(String Title, String pub, int year, int Cat, boolean circ ){
     this.Cat = Cat; this.Pub = Pub; this.Title = Title; this.circ = circ; this.year = year;  
    
    }
    public Book( String Title){
        this.Title = Title; 
        
    }
    public ArrayList<String> GetArraySubString() {
         ArrayList<String> temp = new ArrayList<String>();
        for(int x = 0; x < Sub.size(); x++){
            temp.add(Sub.get(x));
           
       }
        return temp;
    }
    public String SubStr(){
         String d = " "; 
       for (int x =0; x < Sub.size(); x++){
          d = d + Sub.get(x); 
       }
       return d;
       
    }
    public String GetArrayAut(int x){
        return Auth.get(x);
    }
    public String getTitle(){
      
        return Title; 
    }
    public int getYear(){
       // System.out.print(year);
        return year;
    }
    public String getPub(){
        return Pub;
    }
    public int getCat(){
        return Cat;
    }
    public void SetAuth(String s){
          Auth.add(s);
        
    }
     public int gerAuthLen(){
          return Auth.size();
        
     }
     public int gerSUbLength(){
         return Sub.size();
     }
    public void SetSub(String s){
        
          Sub.add(s);
        
    }
    public void SetCirc(boolean n){
        circ = n;
        
    }
    public boolean GetCirc(){
        return circ;
    }
    
    
}
