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
public class Vendeur extends Employe {
   double chiffreAffaire = 200.00;

    void getChiffreAffaire(){
        System.out.println("Chiffre d'affaire est : " + this.chiffreAffaire + " dinars");
    }
    @Override
       double calculerSalaire(){
        return (this.chiffreAffaire * 0.20) + 400;
    }
    Vendeur(String nom, String prenom, int age, String date, double chiffreAffaire){
        super(nom,prenom,age,date);
        this.chiffreAffaire = chiffreAffaire;
    }
}
