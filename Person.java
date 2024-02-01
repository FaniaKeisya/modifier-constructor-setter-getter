/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.person;

class Person {
    private String name;
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
    
    public class user{
        private String username;
        private String password;
        
        public user(){
            System.out.println("eksekusi method constructor...");
        }
    }
}
