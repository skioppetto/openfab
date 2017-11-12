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
 * <p>Classe Java per EquipmentAssetMappingType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="EquipmentAssetMappingType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EquipmentID" type="{http://www.mesa.org/xml/B2MML-V0600}EquipmentIDType"/>
 *         &lt;element name="PhysicalAssetID" type="{http://www.mesa.org/xml/B2MML-V0600}PhysicalAssetIDType"/>
 *         &lt;element name="StartTime" type="{http://www.mesa.org/xml/B2MML-V0600}DateTimeType" minOccurs="0"/>
 *         &lt;element name="EndTime" type="{http://www.mesa.org/xml/B2MML-V0600}DateTimeType" minOccurs="0"/>
 *         &lt;group ref="{http://www.mesa.org/xml/B2MML-V0600-AllExtensions}EquipmentAssetMapping" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EquipmentAssetMappingType", propOrder = {
    "equipmentID",
    "physicalAssetID",
    "startTime",
    "endTime"
})
public class EquipmentAssetMappingType {

    @XmlElement(name = "EquipmentID", required = true)
    protected EquipmentIDType equipmentID;
    @XmlElement(name = "PhysicalAssetID", required = true)
    protected PhysicalAssetIDType physicalAssetID;
    @XmlElement(name = "StartTime")
    protected DateTimeType startTime;
    @XmlElement(name = "EndTime")
    protected DateTimeType endTime;

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
     * Recupera il valore della proprietà physicalAssetID.
     * 
     * @return
     *     possible object is
     *     {@link PhysicalAssetIDType }
     *     
     */
    public PhysicalAssetIDType getPhysicalAssetID() {
        return physicalAssetID;
    }

    /**
     * Imposta il valore della proprietà physicalAssetID.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalAssetIDType }
     *     
     */
    public void setPhysicalAssetID(PhysicalAssetIDType value) {
        this.physicalAssetID = value;
    }

    /**
     * Recupera il valore della proprietà startTime.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getStartTime() {
        return startTime;
    }

    /**
     * Imposta il valore della proprietà startTime.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setStartTime(DateTimeType value) {
        this.startTime = value;
    }

    /**
     * Recupera il valore della proprietà endTime.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getEndTime() {
        return endTime;
    }

    /**
     * Imposta il valore della proprietà endTime.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setEndTime(DateTimeType value) {
        this.endTime = value;
    }

}
