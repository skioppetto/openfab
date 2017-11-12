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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per TransActionCriteriaType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TransActionCriteriaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ActionExpression" type="{http://www.mesa.org/xml/B2MML-V0600}TransExpressionType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "TransActionCriteriaType", propOrder = {
    "actionExpression",
    "changeStatus"
})
public class TransActionCriteriaType {

    @XmlElement(name = "ActionExpression")
    protected List<TransExpressionType> actionExpression;
    @XmlElement(name = "ChangeStatus")
    protected TransChangeStatusType changeStatus;

    /**
     * Gets the value of the actionExpression property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the actionExpression property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActionExpression().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransExpressionType }
     * 
     * 
     */
    public List<TransExpressionType> getActionExpression() {
        if (actionExpression == null) {
            actionExpression = new ArrayList<TransExpressionType>();
        }
        return this.actionExpression;
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
