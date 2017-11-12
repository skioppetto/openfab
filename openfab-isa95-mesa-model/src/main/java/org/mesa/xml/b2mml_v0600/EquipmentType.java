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
 * <p>Classe Java per EquipmentType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="EquipmentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.mesa.org/xml/B2MML-V0600}IdentifierType"/>
 *         &lt;element name="Description" type="{http://www.mesa.org/xml/B2MML-V0600}DescriptionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Location" type="{http://www.mesa.org/xml/B2MML-V0600}LocationType" minOccurs="0"/>
 *         &lt;element name="HierarchyScope" type="{http://www.mesa.org/xml/B2MML-V0600}HierarchyScopeType" minOccurs="0"/>
 *         &lt;element name="EquipmentLevel" type="{http://www.mesa.org/xml/B2MML-V0600}HierarchyScopeType" minOccurs="0"/>
 *         &lt;element name="EquipmentAssetMapping" type="{http://www.mesa.org/xml/B2MML-V0600}EquipmentAssetMappingType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="EquipmentProperty" type="{http://www.mesa.org/xml/B2MML-V0600}EquipmentPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Equipment" type="{http://www.mesa.org/xml/B2MML-V0600}EquipmentType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="EquipmentClassID" type="{http://www.mesa.org/xml/B2MML-V0600}EquipmentClassIDType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="EquipmentCapabilityTestSpecificationID" type="{http://www.mesa.org/xml/B2MML-V0600}EquipmentCapabilityTestSpecificationIDType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;group ref="{http://www.mesa.org/xml/B2MML-V0600-AllExtensions}Equipment" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EquipmentType", propOrder = {
    "id",
    "description",
    "location",
    "hierarchyScope",
    "equipmentLevel",
    "equipmentAssetMapping",
    "equipmentProperty",
    "equipment",
    "equipmentClassID",
    "equipmentCapabilityTestSpecificationID"
})
public class EquipmentType {

    @XmlElement(name = "ID", required = true)
    protected IdentifierType id;
    @XmlElement(name = "Description")
    protected List<DescriptionType> description;
    @XmlElement(name = "Location")
    protected LocationType location;
    @XmlElement(name = "HierarchyScope")
    protected HierarchyScopeType hierarchyScope;
    @XmlElement(name = "EquipmentLevel")
    protected HierarchyScopeType equipmentLevel;
    @XmlElement(name = "EquipmentAssetMapping")
    protected List<EquipmentAssetMappingType> equipmentAssetMapping;
    @XmlElement(name = "EquipmentProperty")
    protected List<EquipmentPropertyType> equipmentProperty;
    @XmlElement(name = "Equipment")
    protected List<EquipmentType> equipment;
    @XmlElement(name = "EquipmentClassID")
    protected List<EquipmentClassIDType> equipmentClassID;
    @XmlElement(name = "EquipmentCapabilityTestSpecificationID")
    protected List<EquipmentCapabilityTestSpecificationIDType> equipmentCapabilityTestSpecificationID;

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
     * Recupera il valore della proprietà location.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getLocation() {
        return location;
    }

    /**
     * Imposta il valore della proprietà location.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setLocation(LocationType value) {
        this.location = value;
    }

    /**
     * Recupera il valore della proprietà hierarchyScope.
     * 
     * @return
     *     possible object is
     *     {@link HierarchyScopeType }
     *     
     */
    public HierarchyScopeType getHierarchyScope() {
        return hierarchyScope;
    }

    /**
     * Imposta il valore della proprietà hierarchyScope.
     * 
     * @param value
     *     allowed object is
     *     {@link HierarchyScopeType }
     *     
     */
    public void setHierarchyScope(HierarchyScopeType value) {
        this.hierarchyScope = value;
    }

    /**
     * Recupera il valore della proprietà equipmentLevel.
     * 
     * @return
     *     possible object is
     *     {@link HierarchyScopeType }
     *     
     */
    public HierarchyScopeType getEquipmentLevel() {
        return equipmentLevel;
    }

    /**
     * Imposta il valore della proprietà equipmentLevel.
     * 
     * @param value
     *     allowed object is
     *     {@link HierarchyScopeType }
     *     
     */
    public void setEquipmentLevel(HierarchyScopeType value) {
        this.equipmentLevel = value;
    }

    /**
     * Gets the value of the equipmentAssetMapping property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the equipmentAssetMapping property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEquipmentAssetMapping().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EquipmentAssetMappingType }
     * 
     * 
     */
    public List<EquipmentAssetMappingType> getEquipmentAssetMapping() {
        if (equipmentAssetMapping == null) {
            equipmentAssetMapping = new ArrayList<EquipmentAssetMappingType>();
        }
        return this.equipmentAssetMapping;
    }

    /**
     * Gets the value of the equipmentProperty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the equipmentProperty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEquipmentProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EquipmentPropertyType }
     * 
     * 
     */
    public List<EquipmentPropertyType> getEquipmentProperty() {
        if (equipmentProperty == null) {
            equipmentProperty = new ArrayList<EquipmentPropertyType>();
        }
        return this.equipmentProperty;
    }

    /**
     * Gets the value of the equipment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the equipment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEquipment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EquipmentType }
     * 
     * 
     */
    public List<EquipmentType> getEquipment() {
        if (equipment == null) {
            equipment = new ArrayList<EquipmentType>();
        }
        return this.equipment;
    }

    /**
     * Gets the value of the equipmentClassID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the equipmentClassID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEquipmentClassID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EquipmentClassIDType }
     * 
     * 
     */
    public List<EquipmentClassIDType> getEquipmentClassID() {
        if (equipmentClassID == null) {
            equipmentClassID = new ArrayList<EquipmentClassIDType>();
        }
        return this.equipmentClassID;
    }

    /**
     * Gets the value of the equipmentCapabilityTestSpecificationID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the equipmentCapabilityTestSpecificationID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEquipmentCapabilityTestSpecificationID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EquipmentCapabilityTestSpecificationIDType }
     * 
     * 
     */
    public List<EquipmentCapabilityTestSpecificationIDType> getEquipmentCapabilityTestSpecificationID() {
        if (equipmentCapabilityTestSpecificationID == null) {
            equipmentCapabilityTestSpecificationID = new ArrayList<EquipmentCapabilityTestSpecificationIDType>();
        }
        return this.equipmentCapabilityTestSpecificationID;
    }

}
