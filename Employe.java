package com.mycompany.exam;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author khkin
 */
abstract class Employe {
    String nom;
    String prenom;
    int age;
    String date;
    
   abstract double calculerSalaire();
    String getNom() {
        return this.nom + " " + this.prenom; 
    }
    public Employe(String nom,String prenom,int age,String date){
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.date = date;
             
    }
}