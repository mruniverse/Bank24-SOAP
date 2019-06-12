/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import WS.BankWebService;

/**
 *
 * @author yuril
 */
public class NewTestClass {
    public static void main(String[] args) {
        BankWebService ws = new BankWebService();
        
        ws.cadastrarConta("NAOFUNCIONAESSAMERDA", 1234, 123456);
    }
    
}
