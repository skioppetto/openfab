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
 * <p>Classe Java per TransChangeStatusType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TransChangeStatusType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Code" type="{http://www.mesa.org/xml/B2MML-V0600}CodeType" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.mesa.org/xml/B2MML-V0600}DescriptionType" minOccurs="0"/>
 *         &lt;element name="EffectiveDateTime" type="{http://www.mesa.org/xml/B2MML-V0600}DateTimeType" minOccurs="0"/>
 *         &lt;element name="ReasonCode" type="{http://www.mesa.org/xml/B2MML-V0600}CodeType" minOccurs="0"/>
 *         &lt;element name="Reason" type="{http://www.mesa.org/xml/B2MML-V0600}CodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="StateChange" type="{http://www.mesa.org/xml/B2MML-V0600}TransStateChangeType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "TransChangeStatusType", propOrder = {
    "code",
    "description",
    "effectiveDateTime",
    "reasonCode",
    "reason",
    "stateChange",
    "userArea"
})
public class TransChangeStatusType {

    @XmlElement(name = "Code")
    protected CodeType code;
    @XmlElement(name = "Description")
    protected DescriptionType description;
    @XmlElement(name = "EffectiveDateTime")
    protected DateTimeType effectiveDateTime;
    @XmlElement(name = "ReasonCode")
    protected CodeType reasonCode;
    @XmlElement(name = "Reason")
    protected List<CodeType> reason;
    @XmlElement(name = "StateChange")
    protected List<TransStateChangeType> stateChange;
    @XmlElement(name = "UserArea")
    protected TransUserAreaType userArea;

    /**
     * Recupera il valore della proprietà code.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getCode() {
        return code;
    }

    /**
     * Imposta il valore della proprietà code.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setCode(CodeType value) {
        this.code = value;
    }

    /**
     * Recupera il valore della proprietà description.
     * 
     * @return
     *     possible object is
     *     {@link DescriptionType }
     *     
     */
    public DescriptionType getDescription() {
        return description;
    }

    /**
     * Imposta il valore della proprietà description.
     * 
     * @param value
     *     allowed object is
     *     {@link DescriptionType }
     *     
     */
    public void setDescription(DescriptionType value) {
        this.description = value;
    }

    /**
     * Recupera il valore della proprietà effectiveDateTime.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getEffectiveDateTime() {
        return effectiveDateTime;
    }

    /**
     * Imposta il valore della proprietà effectiveDateTime.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setEffectiveDateTime(DateTimeType value) {
        this.effectiveDateTime = value;
    }

    /**
     * Recupera il valore della proprietà reasonCode.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getReasonCode() {
        return reasonCode;
    }

    /**
     * Imposta il valore della proprietà reasonCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setReasonCode(CodeType value) {
        this.reasonCode = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reason property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReason().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeType }
     * 
     * 
     */
    public List<CodeType> getReason() {
        if (reason == null) {
            reason = new ArrayList<CodeType>();
        }
        return this.reason;
    }

    /**
     * Gets the value of the stateChange property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stateChange property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStateChange().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransStateChangeType }
     * 
     * 
     */
    public List<TransStateChangeType> getStateChange() {
        if (stateChange == null) {
            stateChange = new ArrayList<TransStateChangeType>();
        }
        return this.stateChange;
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
