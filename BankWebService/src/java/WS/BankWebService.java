/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WS;

//import Controller.DB_controller;
//import DB.Connector;
import Classes.Conta;
import DB.DBQuery;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.ejb.Stateless;
import javax.jws.WebParam;


/**
 *
 * @author yuril
 */
@WebService(serviceName = "BankWebService")
@Stateless()
public class BankWebService {
    public final DBQuery dbq;
    
    public BankWebService() {
        dbq = new DBQuery();
    }
    
//    @WebMethod(operationName = "hello")
//    public String hello(@WebParam(name = "name") String txt) {
//        return "Hello " + txt + " !";
//    }
        
    @WebMethod(operationName = "cadastrarConta")
    public int cadastrarConta(@WebParam(name = "nome") String nome,@WebParam(name = "ag") int ag,@WebParam(name = "conta") int conta){
        return dbq.RegistrarConta(nome, ag, conta);
    }
    
    @WebMethod(operationName = "ConsultarConta")
    public Conta ConsultarConta(int ag, int conta){
        return dbq.ConsultarCadastro(ag, conta);
    }
    
    @WebMethod(operationName = "AlterarConta")
    public int AlterarConta(String nome, int ag, int conta){
        return dbq.AlterarCadastro(nome, ag, conta);
    }
    
    @WebMethod(operationName = "RealizarDeposito")
    public int RealizarDeposito(int ag, int conta, float valor){
        return dbq.Deposito(ag, conta, valor);
    }
    
    @WebMethod(operationName = "RealizarSaque")
    public int RealizarSaque(int ag, int conta, float valor){
        return dbq.RealizarSaque(ag, conta, valor);
    }
    
    @WebMethod(operationName = "ContaExistente")
    public boolean contaExistente(int ag, int conta){
        return dbq.cadastroExistente(ag, conta);
    }

}
