//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2017.11.12 alle 03:08:18 PM CET 
//


package org.mesa.xml.b2mml_v0600;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per TransProcessType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TransProcessType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ActionCriteria" type="{http://www.mesa.org/xml/B2MML-V0600}TransActionCriteriaType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="acknowledgeCode" type="{http://www.mesa.org/xml/B2MML-V0600}TransResponseCodeType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransProcessType", propOrder = {
    "actionCriteria"
})
public class TransProcessType {

    @XmlElement(name = "ActionCriteria")
    protected List<TransActionCriteriaType> actionCriteria;
    @XmlAttribute(name = "acknowledgeCode")
    protected TransResponseCodeType acknowledgeCode;

    /**
     * Gets the value of the actionCriteria property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the actionCriteria property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActionCriteria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransActionCriteriaType }
     * 
     * 
     */
    public List<TransActionCriteriaType> getActionCriteria() {
        if (actionCriteria == null) {
            actionCriteria = new ArrayList<TransActionCriteriaType>();
        }
        return this.actionCriteria;
    }

    /**
     * Recupera il valore della proprietà acknowledgeCode.
     * 
     * @return
     *     possible object is
     *     {@link TransResponseCodeType }
     *     
     */
    public TransResponseCodeType getAcknowledgeCode() {
        return acknowledgeCode;
    }

    /**
     * Imposta il valore della proprietà acknowledgeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link TransResponseCodeType }
     *     
     */
    public void setAcknowledgeCode(TransResponseCodeType value) {
        this.acknowledgeCode = value;
    }

}
