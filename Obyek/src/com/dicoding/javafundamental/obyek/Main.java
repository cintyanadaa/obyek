/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dicoding.javafundamental.obyek;

/**
 *
 * @author Sindy
 */
public class Main {
     public static void main(String[] args) {
        Hewan Kelinci = new Hewan("Kelinci");
        Hewan Sapi = new Hewan("Sapi");

        Kelinci.beratHewan(2);
        Kelinci.jumlahKakiHewan(4);
        Kelinci.cetakHewan();

        Sapi.beratHewan(1000);
        Sapi.jumlahKakiHewan(4);
        Sapi.cetakHewan();
    }
}
