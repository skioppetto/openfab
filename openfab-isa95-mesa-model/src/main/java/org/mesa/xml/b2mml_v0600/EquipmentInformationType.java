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
 * <p>Classe Java per EquipmentInformationType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="EquipmentInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.mesa.org/xml/B2MML-V0600}IdentifierType" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.mesa.org/xml/B2MML-V0600}DescriptionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Location" type="{http://www.mesa.org/xml/B2MML-V0600}LocationType" minOccurs="0"/>
 *         &lt;element name="HierarchyScope" type="{http://www.mesa.org/xml/B2MML-V0600}HierarchyScopeType" minOccurs="0"/>
 *         &lt;element name="PublishedDate" type="{http://www.mesa.org/xml/B2MML-V0600}PublishedDateType" minOccurs="0"/>
 *         &lt;element name="Equipment" type="{http://www.mesa.org/xml/B2MML-V0600}EquipmentType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="EquipmentClass" type="{http://www.mesa.org/xml/B2MML-V0600}EquipmentClassType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="EquipmentCapabilityTestSpecification" type="{http://www.mesa.org/xml/B2MML-V0600}EquipmentCapabilityTestSpecificationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;group ref="{http://www.mesa.org/xml/B2MML-V0600-AllExtensions}EquipmentInformation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EquipmentInformationType", propOrder = {
    "id",
    "description",
    "location",
    "hierarchyScope",
    "publishedDate",
    "equipment",
    "equipmentClass",
    "equipmentCapabilityTestSpecification"
})
public class EquipmentInformationType {

    @XmlElement(name = "ID")
    protected IdentifierType id;
    @XmlElement(name = "Description")
    protected List<DescriptionType> description;
    @XmlElement(name = "Location")
    protected LocationType location;
    @XmlElement(name = "HierarchyScope")
    protected HierarchyScopeType hierarchyScope;
    @XmlElement(name = "PublishedDate")
    protected PublishedDateType publishedDate;
    @XmlElement(name = "Equipment")
    protected List<EquipmentType> equipment;
    @XmlElement(name = "EquipmentClass")
    protected List<EquipmentClassType> equipmentClass;
    @XmlElement(name = "EquipmentCapabilityTestSpecification")
    protected List<EquipmentCapabilityTestSpecificationType> equipmentCapabilityTestSpecification;

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
     * Recupera il valore della proprietà publishedDate.
     * 
     * @return
     *     possible object is
     *     {@link PublishedDateType }
     *     
     */
    public PublishedDateType getPublishedDate() {
        return publishedDate;
    }

    /**
     * Imposta il valore della proprietà publishedDate.
     * 
     * @param value
     *     allowed object is
     *     {@link PublishedDateType }
     *     
     */
    public void setPublishedDate(PublishedDateType value) {
        this.publishedDate = value;
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
     * Gets the value of the equipmentClass property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the equipmentClass property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEquipmentClass().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EquipmentClassType }
     * 
     * 
     */
    public List<EquipmentClassType> getEquipmentClass() {
        if (equipmentClass == null) {
            equipmentClass = new ArrayList<EquipmentClassType>();
        }
        return this.equipmentClass;
    }

    /**
     * Gets the value of the equipmentCapabilityTestSpecification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the equipmentCapabilityTestSpecification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEquipmentCapabilityTestSpecification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EquipmentCapabilityTestSpecificationType }
     * 
     * 
     */
    public List<EquipmentCapabilityTestSpecificationType> getEquipmentCapabilityTestSpecification() {
        if (equipmentCapabilityTestSpecification == null) {
            equipmentCapabilityTestSpecification = new ArrayList<EquipmentCapabilityTestSpecificationType>();
        }
        return this.equipmentCapabilityTestSpecification;
    }

}
