
package ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ContaExistenteResponse_QNAME = new QName("http://WS/", "ContaExistenteResponse");
    private final static QName _ContaExistente_QNAME = new QName("http://WS/", "ContaExistente");
    private final static QName _CadastrarContaResponse_QNAME = new QName("http://WS/", "cadastrarContaResponse");
    private final static QName _AlterarConta_QNAME = new QName("http://WS/", "AlterarConta");
    private final static QName _RealizarSaque_QNAME = new QName("http://WS/", "RealizarSaque");
    private final static QName _RealizarDeposito_QNAME = new QName("http://WS/", "RealizarDeposito");
    private final static QName _AlterarContaResponse_QNAME = new QName("http://WS/", "AlterarContaResponse");
    private final static QName _RealizarDepositoResponse_QNAME = new QName("http://WS/", "RealizarDepositoResponse");
    private final static QName _ConsultarContaResponse_QNAME = new QName("http://WS/", "ConsultarContaResponse");
    private final static QName _RealizarSaqueResponse_QNAME = new QName("http://WS/", "RealizarSaqueResponse");
    private final static QName _ConsultarConta_QNAME = new QName("http://WS/", "ConsultarConta");
    private final static QName _CadastrarConta_QNAME = new QName("http://WS/", "cadastrarConta");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ContaExistente }
     * 
     */
    public ContaExistente createContaExistente() {
        return new ContaExistente();
    }

    /**
     * Create an instance of {@link ContaExistenteResponse }
     * 
     */
    public ContaExistenteResponse createContaExistenteResponse() {
        return new ContaExistenteResponse();
    }

    /**
     * Create an instance of {@link AlterarConta }
     * 
     */
    public AlterarConta createAlterarConta() {
        return new AlterarConta();
    }

    /**
     * Create an instance of {@link RealizarSaque }
     * 
     */
    public RealizarSaque createRealizarSaque() {
        return new RealizarSaque();
    }

    /**
     * Create an instance of {@link CadastrarContaResponse }
     * 
     */
    public CadastrarContaResponse createCadastrarContaResponse() {
        return new CadastrarContaResponse();
    }

    /**
     * Create an instance of {@link RealizarDeposito }
     * 
     */
    public RealizarDeposito createRealizarDeposito() {
        return new RealizarDeposito();
    }

    /**
     * Create an instance of {@link RealizarDepositoResponse }
     * 
     */
    public RealizarDepositoResponse createRealizarDepositoResponse() {
        return new RealizarDepositoResponse();
    }

    /**
     * Create an instance of {@link AlterarContaResponse }
     * 
     */
    public AlterarContaResponse createAlterarContaResponse() {
        return new AlterarContaResponse();
    }

    /**
     * Create an instance of {@link ConsultarContaResponse }
     * 
     */
    public ConsultarContaResponse createConsultarContaResponse() {
        return new ConsultarContaResponse();
    }

    /**
     * Create an instance of {@link ConsultarConta }
     * 
     */
    public ConsultarConta createConsultarConta() {
        return new ConsultarConta();
    }

    /**
     * Create an instance of {@link RealizarSaqueResponse }
     * 
     */
    public RealizarSaqueResponse createRealizarSaqueResponse() {
        return new RealizarSaqueResponse();
    }

    /**
     * Create an instance of {@link CadastrarConta }
     * 
     */
    public CadastrarConta createCadastrarConta() {
        return new CadastrarConta();
    }

    /**
     * Create an instance of {@link Conta }
     * 
     */
    public Conta createConta() {
        return new Conta();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContaExistenteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS/", name = "ContaExistenteResponse")
    public JAXBElement<ContaExistenteResponse> createContaExistenteResponse(ContaExistenteResponse value) {
        return new JAXBElement<ContaExistenteResponse>(_ContaExistenteResponse_QNAME, ContaExistenteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContaExistente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS/", name = "ContaExistente")
    public JAXBElement<ContaExistente> createContaExistente(ContaExistente value) {
        return new JAXBElement<ContaExistente>(_ContaExistente_QNAME, ContaExistente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CadastrarContaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS/", name = "cadastrarContaResponse")
    public JAXBElement<CadastrarContaResponse> createCadastrarContaResponse(CadastrarContaResponse value) {
        return new JAXBElement<CadastrarContaResponse>(_CadastrarContaResponse_QNAME, CadastrarContaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlterarConta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS/", name = "AlterarConta")
    public JAXBElement<AlterarConta> createAlterarConta(AlterarConta value) {
        return new JAXBElement<AlterarConta>(_AlterarConta_QNAME, AlterarConta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RealizarSaque }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS/", name = "RealizarSaque")
    public JAXBElement<RealizarSaque> createRealizarSaque(RealizarSaque value) {
        return new JAXBElement<RealizarSaque>(_RealizarSaque_QNAME, RealizarSaque.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RealizarDeposito }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS/", name = "RealizarDeposito")
    public JAXBElement<RealizarDeposito> createRealizarDeposito(RealizarDeposito value) {
        return new JAXBElement<RealizarDeposito>(_RealizarDeposito_QNAME, RealizarDeposito.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlterarContaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS/", name = "AlterarContaResponse")
    public JAXBElement<AlterarContaResponse> createAlterarContaResponse(AlterarContaResponse value) {
        return new JAXBElement<AlterarContaResponse>(_AlterarContaResponse_QNAME, AlterarContaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RealizarDepositoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS/", name = "RealizarDepositoResponse")
    public JAXBElement<RealizarDepositoResponse> createRealizarDepositoResponse(RealizarDepositoResponse value) {
        return new JAXBElement<RealizarDepositoResponse>(_RealizarDepositoResponse_QNAME, RealizarDepositoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarContaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS/", name = "ConsultarContaResponse")
    public JAXBElement<ConsultarContaResponse> createConsultarContaResponse(ConsultarContaResponse value) {
        return new JAXBElement<ConsultarContaResponse>(_ConsultarContaResponse_QNAME, ConsultarContaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RealizarSaqueResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS/", name = "RealizarSaqueResponse")
    public JAXBElement<RealizarSaqueResponse> createRealizarSaqueResponse(RealizarSaqueResponse value) {
        return new JAXBElement<RealizarSaqueResponse>(_RealizarSaqueResponse_QNAME, RealizarSaqueResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarConta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS/", name = "ConsultarConta")
    public JAXBElement<ConsultarConta> createConsultarConta(ConsultarConta value) {
        return new JAXBElement<ConsultarConta>(_ConsultarConta_QNAME, ConsultarConta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CadastrarConta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS/", name = "cadastrarConta")
    public JAXBElement<CadastrarConta> createCadastrarConta(CadastrarConta value) {
        return new JAXBElement<CadastrarConta>(_CadastrarConta_QNAME, CadastrarConta.class, null, value);
    }

}
