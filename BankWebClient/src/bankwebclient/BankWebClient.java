/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankwebclient;

import ws.Conta;

/**
 *
 * @author yuril
 */
public class BankWebClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        System.out.println(cadastrarConta("Alfredinho", 1234, 123456));
        
//        System.out.println(consultarConta(1234, 123456).getNome());
        
//        alterarConta("Roberto", 1234, 123456);
        
        System.out.println(consultarConta(1234, 123456).getNome());
//        
//        System.out.println(realizarDeposito(1234, 123456, 200));
//        
//        System.out.println(realizarSaque(1234, 123456, 100));
    }

    private static int alterarConta(java.lang.String arg0, int arg1, int arg2) {
        ws.BankWebService_Service service = new ws.BankWebService_Service();
        ws.BankWebService port = service.getBankWebServicePort();
        return port.alterarConta(arg0, arg1, arg2);
    }

    private static Conta consultarConta(int arg0, int arg1) {
        ws.BankWebService_Service service = new ws.BankWebService_Service();
        ws.BankWebService port = service.getBankWebServicePort();
        return port.consultarConta(arg0, arg1);
    }

    private static int realizarDeposito(int arg0, int arg1, float arg2) {
        ws.BankWebService_Service service = new ws.BankWebService_Service();
        ws.BankWebService port = service.getBankWebServicePort();
        return port.realizarDeposito(arg0, arg1, arg2);
    }

    private static int realizarSaque(int arg0, int arg1, float arg2) {
        ws.BankWebService_Service service = new ws.BankWebService_Service();
        ws.BankWebService port = service.getBankWebServicePort();
        return port.realizarSaque(arg0, arg1, arg2);
    }

    private static int cadastrarConta(java.lang.String nome, int ag, int conta) {
        ws.BankWebService_Service service = new ws.BankWebService_Service();
        ws.BankWebService port = service.getBankWebServicePort();
        return port.cadastrarConta(nome, ag, conta);
    }

}
