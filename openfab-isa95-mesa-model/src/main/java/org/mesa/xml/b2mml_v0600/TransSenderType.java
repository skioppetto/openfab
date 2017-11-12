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
 * <p>Classe Java per TransSenderType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TransSenderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LogicalID" type="{http://www.mesa.org/xml/B2MML-V0600}IdentifierType" minOccurs="0"/>
 *         &lt;element name="ComponentID" type="{http://www.mesa.org/xml/B2MML-V0600}IdentifierType" minOccurs="0"/>
 *         &lt;element name="TaskID" type="{http://www.mesa.org/xml/B2MML-V0600}IdentifierType" minOccurs="0"/>
 *         &lt;element name="ReferenceID" type="{http://www.mesa.org/xml/B2MML-V0600}IdentifierType" minOccurs="0"/>
 *         &lt;element name="ConfirmationCode" type="{http://www.mesa.org/xml/B2MML-V0600}TransConfirmationCodeType" minOccurs="0"/>
 *         &lt;element name="AuthorizationID" type="{http://www.mesa.org/xml/B2MML-V0600}IdentifierType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransSenderType", propOrder = {
    "logicalID",
    "componentID",
    "taskID",
    "referenceID",
    "confirmationCode",
    "authorizationID"
})
public class TransSenderType {

    @XmlElement(name = "LogicalID")
    protected IdentifierType logicalID;
    @XmlElement(name = "ComponentID")
    protected IdentifierType componentID;
    @XmlElement(name = "TaskID")
    protected IdentifierType taskID;
    @XmlElement(name = "ReferenceID")
    protected IdentifierType referenceID;
    @XmlElement(name = "ConfirmationCode")
    protected TransConfirmationCodeType confirmationCode;
    @XmlElement(name = "AuthorizationID")
    protected IdentifierType authorizationID;

    /**
     * Recupera il valore della proprietà logicalID.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getLogicalID() {
        return logicalID;
    }

    /**
     * Imposta il valore della proprietà logicalID.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setLogicalID(IdentifierType value) {
        this.logicalID = value;
    }

    /**
     * Recupera il valore della proprietà componentID.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getComponentID() {
        return componentID;
    }

    /**
     * Imposta il valore della proprietà componentID.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setComponentID(IdentifierType value) {
        this.componentID = value;
    }

    /**
     * Recupera il valore della proprietà taskID.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getTaskID() {
        return taskID;
    }

    /**
     * Imposta il valore della proprietà taskID.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setTaskID(IdentifierType value) {
        this.taskID = value;
    }

    /**
     * Recupera il valore della proprietà referenceID.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getReferenceID() {
        return referenceID;
    }

    /**
     * Imposta il valore della proprietà referenceID.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setReferenceID(IdentifierType value) {
        this.referenceID = value;
    }

    /**
     * Recupera il valore della proprietà confirmationCode.
     * 
     * @return
     *     possible object is
     *     {@link TransConfirmationCodeType }
     *     
     */
    public TransConfirmationCodeType getConfirmationCode() {
        return confirmationCode;
    }

    /**
     * Imposta il valore della proprietà confirmationCode.
     * 
     * @param value
     *     allowed object is
     *     {@link TransConfirmationCodeType }
     *     
     */
    public void setConfirmationCode(TransConfirmationCodeType value) {
        this.confirmationCode = value;
    }

    /**
     * Recupera il valore della proprietà authorizationID.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getAuthorizationID() {
        return authorizationID;
    }

    /**
     * Imposta il valore della proprietà authorizationID.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setAuthorizationID(IdentifierType value) {
        this.authorizationID = value;
    }

}
