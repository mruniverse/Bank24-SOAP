
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cadastrarConta complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cadastrarConta">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ag" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="conta" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cadastrarConta", propOrder = {
    "nome",
    "ag",
    "conta"
})
public class CadastrarConta {

    protected String nome;
    protected int ag;
    protected int conta;

    /**
     * Gets the value of the nome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNome() {
        return nome;
    }

    /**
     * Sets the value of the nome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNome(String value) {
        this.nome = value;
    }

    /**
     * Gets the value of the ag property.
     * 
     */
    public int getAg() {
        return ag;
    }

    /**
     * Sets the value of the ag property.
     * 
     */
    public void setAg(int value) {
        this.ag = value;
    }

    /**
     * Gets the value of the conta property.
     * 
     */
    public int getConta() {
        return conta;
    }

    /**
     * Sets the value of the conta property.
     * 
     */
    public void setConta(int value) {
        this.conta = value;
    }

}
