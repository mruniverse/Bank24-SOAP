
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for conta complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="conta">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="num_ag" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="num_conta" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="saldo" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "conta", propOrder = {
    "id",
    "nome",
    "numAg",
    "numConta",
    "saldo"
})
public class Conta {

    protected int id;
    protected String nome;
    @XmlElement(name = "num_ag")
    protected int numAg;
    @XmlElement(name = "num_conta")
    protected int numConta;
    protected float saldo;

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

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
     * Gets the value of the numAg property.
     * 
     */
    public int getNumAg() {
        return numAg;
    }

    /**
     * Sets the value of the numAg property.
     * 
     */
    public void setNumAg(int value) {
        this.numAg = value;
    }

    /**
     * Gets the value of the numConta property.
     * 
     */
    public int getNumConta() {
        return numConta;
    }

    /**
     * Sets the value of the numConta property.
     * 
     */
    public void setNumConta(int value) {
        this.numConta = value;
    }

    /**
     * Gets the value of the saldo property.
     * 
     */
    public float getSaldo() {
        return saldo;
    }

    /**
     * Sets the value of the saldo property.
     * 
     */
    public void setSaldo(float value) {
        this.saldo = value;
    }

}
