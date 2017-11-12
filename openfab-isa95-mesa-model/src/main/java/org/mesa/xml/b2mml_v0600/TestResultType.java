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
 * <p>Classe Java per TestResultType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TestResultType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.mesa.org/xml/B2MML-V0600}IdentifierType" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.mesa.org/xml/B2MML-V0600}DescriptionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TestDateTime" type="{http://www.mesa.org/xml/B2MML-V0600}TestDateTimeType" minOccurs="0"/>
 *         &lt;element name="Result" type="{http://www.mesa.org/xml/B2MML-V0600}ResultType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ExpirationTime" type="{http://www.mesa.org/xml/B2MML-V0600}ExpirationTimeType" minOccurs="0"/>
 *         &lt;group ref="{http://www.mesa.org/xml/B2MML-V0600-AllExtensions}TestResult" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TestResultType", propOrder = {
    "id",
    "description",
    "testDateTime",
    "result",
    "expirationTime"
})
public class TestResultType {

    @XmlElement(name = "ID")
    protected IdentifierType id;
    @XmlElement(name = "Description")
    protected List<DescriptionType> description;
    @XmlElement(name = "TestDateTime")
    protected TestDateTimeType testDateTime;
    @XmlElement(name = "Result")
    protected List<ResultType> result;
    @XmlElement(name = "ExpirationTime")
    protected ExpirationTimeType expirationTime;

    /**
     * Recupera il valore della proprietà id.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getID() {
        return id;
    }

    /**
     * Imposta il valore della proprietà id.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setID(IdentifierType value) {
        this.id = value;
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
     * Recupera il valore della proprietà testDateTime.
     * 
     * @return
     *     possible object is
     *     {@link TestDateTimeType }
     *     
     */
    public TestDateTimeType getTestDateTime() {
        return testDateTime;
    }

    /**
     * Imposta il valore della proprietà testDateTime.
     * 
     * @param value
     *     allowed object is
     *     {@link TestDateTimeType }
     *     
     */
    public void setTestDateTime(TestDateTimeType value) {
        this.testDateTime = value;
    }

    /**
     * Gets the value of the result property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the result property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResultType }
     * 
     * 
     */
    public List<ResultType> getResult() {
        if (result == null) {
            result = new ArrayList<ResultType>();
        }
        return this.result;
    }

    /**
     * Recupera il valore della proprietà expirationTime.
     * 
     * @return
     *     possible object is
     *     {@link ExpirationTimeType }
     *     
     */
    public ExpirationTimeType getExpirationTime() {
        return expirationTime;
    }

    /**
     * Imposta il valore della proprietà expirationTime.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpirationTimeType }
     *     
     */
    public void setExpirationTime(ExpirationTimeType value) {
        this.expirationTime = value;
    }

}
