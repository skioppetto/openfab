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
 * <p>Classe Java per TestedEquipmentPropertyType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TestedEquipmentPropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EquipmentID" type="{http://www.mesa.org/xml/B2MML-V0600}EquipmentIDType"/>
 *         &lt;element name="PropertyID" type="{http://www.mesa.org/xml/B2MML-V0600}PropertyIDType"/>
 *         &lt;group ref="{http://www.mesa.org/xml/B2MML-V0600-AllExtensions}TestedEquipmentProperty" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TestedEquipmentPropertyType", propOrder = {
    "equipmentID",
    "propertyID"
})
public class TestedEquipmentPropertyType {

    @XmlElement(name = "EquipmentID", required = true)
    protected EquipmentIDType equipmentID;
    @XmlElement(name = "PropertyID", required = true)
    protected PropertyIDType propertyID;

    /**
     * Recupera il valore della proprietà equipmentID.
     * 
     * @return
     *     possible object is
     *     {@link EquipmentIDType }
     *     
     */
    public EquipmentIDType getEquipmentID() {
        return equipmentID;
    }

    /**
     * Imposta il valore della proprietà equipmentID.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipmentIDType }
     *     
     */
    public void setEquipmentID(EquipmentIDType value) {
        this.equipmentID = value;
    }

    /**
     * Recupera il valore della proprietà propertyID.
     * 
     * @return
     *     possible object is
     *     {@link PropertyIDType }
     *     
     */
    public PropertyIDType getPropertyID() {
        return propertyID;
    }

    /**
     * Imposta il valore della proprietà propertyID.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyIDType }
     *     
     */
    public void setPropertyID(PropertyIDType value) {
        this.propertyID = value;
    }

}
