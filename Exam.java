/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exam;

/**
 *
 * @author khkin
 */

public class Exam{

    public static void main(String[] args) {


        Vendeur v;
        v = new Vendeur("Khaled","Briki",20,"20 April",50.00);
        Producteur p;
        p = new Producteur("Aziz","Khemiri",20,"1 Janvier",50);
        System.out.println("Le Vendeur " + v.getNom() + " gagne " + v.calculerSalaire() + " dinars");
        System.out.println("Le Producteur " + p.getNom() + " gagne " + p.calculerSalaire() + " dinars");
        System.out.println("La salaire moyen dans l'entreprise est " + ((v.calculerSalaire() + p.calculerSalaire()) / 2) + " dinars" );
        v.getChiffreAffaire();
    }
}
