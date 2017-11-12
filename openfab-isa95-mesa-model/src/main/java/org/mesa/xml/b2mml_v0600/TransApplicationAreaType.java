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
 * <p>Classe Java per TransApplicationAreaType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TransApplicationAreaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Sender" type="{http://www.mesa.org/xml/B2MML-V0600}TransSenderType" minOccurs="0"/>
 *         &lt;element name="Receiver" type="{http://www.mesa.org/xml/B2MML-V0600}TransReceiverType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CreationDateTime" type="{http://www.mesa.org/xml/B2MML-V0600}DateTimeType"/>
 *         &lt;element name="Signature" type="{http://www.mesa.org/xml/B2MML-V0600}TransSignatureType" minOccurs="0"/>
 *         &lt;element name="BODID" type="{http://www.mesa.org/xml/B2MML-V0600}IdentifierType" minOccurs="0"/>
 *         &lt;element name="UserArea" type="{http://www.mesa.org/xml/B2MML-V0600}TransUserAreaType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransApplicationAreaType", propOrder = {
    "sender",
    "receiver",
    "creationDateTime",
    "signature",
    "bodid",
    "userArea"
})
public class TransApplicationAreaType {

    @XmlElement(name = "Sender")
    protected TransSenderType sender;
    @XmlElement(name = "Receiver")
    protected List<TransReceiverType> receiver;
    @XmlElement(name = "CreationDateTime", required = true)
    protected DateTimeType creationDateTime;
    @XmlElement(name = "Signature")
    protected TransSignatureType signature;
    @XmlElement(name = "BODID")
    protected IdentifierType bodid;
    @XmlElement(name = "UserArea")
    protected TransUserAreaType userArea;

    /**
     * Recupera il valore della proprietà sender.
     * 
     * @return
     *     possible object is
     *     {@link TransSenderType }
     *     
     */
    public TransSenderType getSender() {
        return sender;
    }

    /**
     * Imposta il valore della proprietà sender.
     * 
     * @param value
     *     allowed object is
     *     {@link TransSenderType }
     *     
     */
    public void setSender(TransSenderType value) {
        this.sender = value;
    }

    /**
     * Gets the value of the receiver property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the receiver property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReceiver().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransReceiverType }
     * 
     * 
     */
    public List<TransReceiverType> getReceiver() {
        if (receiver == null) {
            receiver = new ArrayList<TransReceiverType>();
        }
        return this.receiver;
    }

    /**
     * Recupera il valore della proprietà creationDateTime.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getCreationDateTime() {
        return creationDateTime;
    }

    /**
     * Imposta il valore della proprietà creationDateTime.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setCreationDateTime(DateTimeType value) {
        this.creationDateTime = value;
    }

    /**
     * Recupera il valore della proprietà signature.
     * 
     * @return
     *     possible object is
     *     {@link TransSignatureType }
     *     
     */
    public TransSignatureType getSignature() {
        return signature;
    }

    /**
     * Imposta il valore della proprietà signature.
     * 
     * @param value
     *     allowed object is
     *     {@link TransSignatureType }
     *     
     */
    public void setSignature(TransSignatureType value) {
        this.signature = value;
    }

    /**
     * Recupera il valore della proprietà bodid.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getBODID() {
        return bodid;
    }

    /**
     * Imposta il valore della proprietà bodid.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setBODID(IdentifierType value) {
        this.bodid = value;
    }

    /**
     * Recupera il valore della proprietà userArea.
     * 
     * @return
     *     possible object is
     *     {@link TransUserAreaType }
     *     
     */
    public TransUserAreaType getUserArea() {
        return userArea;
    }

    /**
     * Imposta il valore della proprietà userArea.
     * 
     * @param value
     *     allowed object is
     *     {@link TransUserAreaType }
     *     
     */
    public void setUserArea(TransUserAreaType value) {
        this.userArea = value;
    }

}
