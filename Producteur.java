package com.mycompany.exam;


import com.mycompany.exam.Employe;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author khkin
 */
public class Producteur extends Employe {
    int uniteProduite = 20;
       @Override
       double calculerSalaire(){
        return this.uniteProduite * 5;
    }
        Producteur(String nom, String prenom, int age, String date, int uniteProduite){
        super(nom,prenom,age,date);
        this.uniteProduite = uniteProduite;
    }
}
