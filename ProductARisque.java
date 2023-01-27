package com.mycompany.exam;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author khkin
 */
public class ProductARisque extends Producteur implements InterfaceRisque{

    public ProductARisque(String nom, String prenom, int age, String date, int uniteProduite) {
        super(nom, prenom, age, date, uniteProduite);
    }
    @Override
    double calculerSalaire() {
        return super.calculerSalaire() + ProductARisque.prime;
    }
}
