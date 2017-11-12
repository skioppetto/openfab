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
 * <p>Classe Java per TransStateChangeType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TransStateChangeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FromStateCode" type="{http://www.mesa.org/xml/B2MML-V0600}CodeType" minOccurs="0"/>
 *         &lt;element name="ToStateCode" type="{http://www.mesa.org/xml/B2MML-V0600}CodeType" minOccurs="0"/>
 *         &lt;element name="ChangeDateTime" type="{http://www.mesa.org/xml/B2MML-V0600}DateTimeType" minOccurs="0"/>
 *         &lt;group ref="{http://www.mesa.org/xml/B2MML-V0600}TransStateChangeTextGroup" minOccurs="0"/>
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
@XmlType(name = "TransStateChangeType", propOrder = {
    "fromStateCode",
    "toStateCode",
    "changeDateTime",
    "description",
    "note",
    "userArea"
})
public class TransStateChangeType {

    @XmlElement(name = "FromStateCode")
    protected CodeType fromStateCode;
    @XmlElement(name = "ToStateCode")
    protected CodeType toStateCode;
    @XmlElement(name = "ChangeDateTime")
    protected DateTimeType changeDateTime;
    @XmlElement(name = "Description")
    protected List<DescriptionType> description;
    @XmlElement(name = "Note")
    protected List<TextType> note;
    @XmlElement(name = "UserArea")
    protected TransUserAreaType userArea;

    /**
     * Recupera il valore della proprietà fromStateCode.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getFromStateCode() {
        return fromStateCode;
    }

    /**
     * Imposta il valore della proprietà fromStateCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setFromStateCode(CodeType value) {
        this.fromStateCode = value;
    }

    /**
     * Recupera il valore della proprietà toStateCode.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getToStateCode() {
        return toStateCode;
    }

    /**
     * Imposta il valore della proprietà toStateCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setToStateCode(CodeType value) {
        this.toStateCode = value;
    }

    /**
     * Recupera il valore della proprietà changeDateTime.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getChangeDateTime() {
        return changeDateTime;
    }

    /**
     * Imposta il valore della proprietà changeDateTime.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setChangeDateTime(DateTimeType value) {
        this.changeDateTime = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the description property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescriptionType }
     * 
     * 
     */
    public List<DescriptionType> getDescription() {
        if (description == null) {
            description = new ArrayList<DescriptionType>();
        }
        return this.description;
    }

    /**
     * Gets the value of the note property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the note property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextType }
     * 
     * 
     */
    public List<TextType> getNote() {
        if (note == null) {
            note = new ArrayList<TextType>();
        }
        return this.note;
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
