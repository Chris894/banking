/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.banking;

/**
 *
 * @author User
 */
public class AccountRun {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           Account chriszano = new Account();

            chriszano.setName("Chriszano");

            chriszano.setId("192947298734");

            chriszano.setAccountType("Student Account");

            chriszano.toString();
        
    }
}