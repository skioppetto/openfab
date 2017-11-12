//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2017.11.12 alle 03:08:18 PM CET 
//


package org.mesa.xml.b2mml_v0600;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ResultType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ResultType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ValueString" type="{http://www.mesa.org/xml/B2MML-V0600}ValueStringType"/>
 *         &lt;element name="DataType" type="{http://www.mesa.org/xml/B2MML-V0600}DataTypeType" minOccurs="0"/>
 *         &lt;element name="UnitOfMeasure" type="{http://www.mesa.org/xml/B2MML-V0600}UnitOfMeasureType" minOccurs="0"/>
 *         &lt;element name="Key" type="{http://www.mesa.org/xml/B2MML-V0600}IdentifierType" minOccurs="0"/>
 *         &lt;group ref="{http://www.mesa.org/xml/B2MML-V0600-AllExtensions}Result" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResultType", propOrder = {
    "valueString",
    "dataType",
    "unitOfMeasure",
    "key"
})
public class ResultType {

    @XmlElement(name = "ValueString", required = true, nillable = true)
    protected ValueStringType valueString;
    @XmlElementRef(name = "DataType", namespace = "http://www.mesa.org/xml/B2MML-V0600", type = JAXBElement.class, required = false)
    protected JAXBElement<DataTypeType> dataType;
    @XmlElementRef(name = "UnitOfMeasure", namespace = "http://www.mesa.org/xml/B2MML-V0600", type = JAXBElement.class, required = false)
    protected JAXBElement<UnitOfMeasureType> unitOfMeasure;
    @XmlElement(name = "Key")
    protected IdentifierType key;

    /**
     * Recupera il valore della proprietà valueString.
     * 
     * @return
     *     possible object is
     *     {@link ValueStringType }
     *     
     */
    public ValueStringType getValueString() {
        return valueString;
    }

    /**
     * Imposta il valore della proprietà valueString.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueStringType }
     *     
     */
    public void setValueString(ValueStringType value) {
        this.valueString = value;
    }

    /**
     * Recupera il valore della proprietà dataType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DataTypeType }{@code >}
     *     
     */
    public JAXBElement<DataTypeType> getDataType() {
        return dataType;
    }

    /**
     * Imposta il valore della proprietà dataType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DataTypeType }{@code >}
     *     
     */
    public void setDataType(JAXBElement<DataTypeType> value) {
        this.dataType = value;
    }

    /**
     * Recupera il valore della proprietà unitOfMeasure.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UnitOfMeasureType }{@code >}
     *     
     */
    public JAXBElement<UnitOfMeasureType> getUnitOfMeasure() {
        return unitOfMeasure;
    }

    /**
     * Imposta il valore della proprietà unitOfMeasure.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UnitOfMeasureType }{@code >}
     *     
     */
    public void setUnitOfMeasure(JAXBElement<UnitOfMeasureType> value) {
        this.unitOfMeasure = value;
    }

    /**
     * Recupera il valore della proprietà key.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getKey() {
        return key;
    }

    /**
     * Imposta il valore della proprietà key.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setKey(IdentifierType value) {
        this.key = value;
    }

}
