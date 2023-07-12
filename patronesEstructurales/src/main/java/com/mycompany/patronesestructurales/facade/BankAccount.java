/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.patronesestructurales.facade;

/**
 *
 * La fachada proporciona una interfaz unificada para un conjunto de interfaces
 * en un subsistema, lo que facilita su uso.
 */

// Subsistema 1: Módulo de Cuenta Bancaria

public class BankAccount {
 public void verifyAccount(String accountNumber) {
        System.out.println("Verifying bank account: " + accountNumber);
    }
    
    public void processTransaction(String accountNumber, double amount) {
        System.out.println("Processing transaction for account: " + accountNumber);
        System.out.println("Amount: " + amount);
    }
}
