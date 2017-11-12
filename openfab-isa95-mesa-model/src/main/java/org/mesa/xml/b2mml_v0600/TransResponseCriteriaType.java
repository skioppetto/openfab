//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2017.11.12 alle 03:08:18 PM CET 
//


package org.mesa.xml.b2mml_v0600;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per TransResponseCriteriaType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TransResponseCriteriaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ResponseExpression" type="{http://www.mesa.org/xml/B2MML-V0600}TransExpressionType" minOccurs="0"/>
 *         &lt;element name="ChangeStatus" type="{http://www.mesa.org/xml/B2MML-V0600}TransChangeStatusType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransResponseCriteriaType", propOrder = {
    "responseExpression",
    "changeStatus"
})
public class TransResponseCriteriaType {

    @XmlElement(name = "ResponseExpression")
    protected TransExpressionType responseExpression;
    @XmlElement(name = "ChangeStatus")
    protected TransChangeStatusType changeStatus;

    /**
     * Recupera il valore della proprietà responseExpression.
     * 
     * @return
     *     possible object is
     *     {@link TransExpressionType }
     *     
     */
    public TransExpressionType getResponseExpression() {
        return responseExpression;
    }

    /**
     * Imposta il valore della proprietà responseExpression.
     * 
     * @param value
     *     allowed object is
     *     {@link TransExpressionType }
     *     
     */
    public void setResponseExpression(TransExpressionType value) {
        this.responseExpression = value;
    }

    /**
     * Recupera il valore della proprietà changeStatus.
     * 
     * @return
     *     possible object is
     *     {@link TransChangeStatusType }
     *     
     */
    public TransChangeStatusType getChangeStatus() {
        return changeStatus;
    }

    /**
     * Imposta il valore della proprietà changeStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link TransChangeStatusType }
     *     
     */
    public void setChangeStatus(TransChangeStatusType value) {
        this.changeStatus = value;
    }

}
