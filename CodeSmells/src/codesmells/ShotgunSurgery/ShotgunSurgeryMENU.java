/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codesmells.ShotgunSurgery;

/**
 *
 * @author Yoselin
 */
public class ShotgunSurgeryMENU {
    public static void main(String[] args) throws Exception {
              AccountCodeSmells acc = new AccountCodeSmells("Personal","AC1234",1000);
              acc.debit(500);
              acc.sendWarningMessage();
              //acc.debit(500);
       
              AccountRefactoring acc1 = new AccountRefactoring("Personal","AC1234",1000);
              acc.debit(500);
              acc.sendWarningMessage();
    }
}
