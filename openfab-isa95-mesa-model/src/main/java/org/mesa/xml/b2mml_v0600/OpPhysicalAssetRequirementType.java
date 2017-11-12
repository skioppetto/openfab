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
 * <p>Classe Java per OpPhysicalAssetRequirementType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="OpPhysicalAssetRequirementType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PhysicalAssetClassID" type="{http://www.mesa.org/xml/B2MML-V0600}PhysicalAssetClassIDType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PhysicalAssetID" type="{http://www.mesa.org/xml/B2MML-V0600}PhysicalAssetIDType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.mesa.org/xml/B2MML-V0600}DescriptionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PhysicalAssetUse" type="{http://www.mesa.org/xml/B2MML-V0600}PhysicalAssetUseType" minOccurs="0"/>
 *         &lt;element name="Quantity" type="{http://www.mesa.org/xml/B2MML-V0600}QuantityValueType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="HierarchyScope" type="{http://www.mesa.org/xml/B2MML-V0600}HierarchyScopeType" minOccurs="0"/>
 *         &lt;element name="EquipmentLevel" type="{http://www.mesa.org/xml/B2MML-V0600}HierarchyScopeType" minOccurs="0"/>
 *         &lt;element name="PhysicalAssetRequirementProperty" type="{http://www.mesa.org/xml/B2MML-V0600}OpPhysicalAssetRequirementPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RequiredByRequestedSegmentResponse" type="{http://www.mesa.org/xml/B2MML-V0600}RequiredByRequestedSegmentResponseType" minOccurs="0"/>
 *         &lt;group ref="{http://www.mesa.org/xml/B2MML-V0600-AllExtensions}OpPhysicalAssetRequirement" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpPhysicalAssetRequirementType", propOrder = {
    "physicalAssetClassID",
    "physicalAssetID",
    "description",
    "physicalAssetUse",
    "quantity",
    "hierarchyScope",
    "equipmentLevel",
    "physicalAssetRequirementProperty",
    "requiredByRequestedSegmentResponse"
})
public class OpPhysicalAssetRequirementType {

    @XmlElement(name = "PhysicalAssetClassID")
    protected List<PhysicalAssetClassIDType> physicalAssetClassID;
    @XmlElement(name = "PhysicalAssetID")
    protected List<PhysicalAssetIDType> physicalAssetID;
    @XmlElement(name = "Description")
    protected List<DescriptionType> description;
    @XmlElement(name = "PhysicalAssetUse")
    protected PhysicalAssetUseType physicalAssetUse;
    @XmlElement(name = "Quantity")
    protected List<QuantityValueType> quantity;
    @XmlElement(name = "HierarchyScope")
    protected HierarchyScopeType hierarchyScope;
    @XmlElement(name = "EquipmentLevel")
    protected HierarchyScopeType equipmentLevel;
    @XmlElement(name = "PhysicalAssetRequirementProperty")
    protected List<OpPhysicalAssetRequirementPropertyType> physicalAssetRequirementProperty;
    @XmlElement(name = "RequiredByRequestedSegmentResponse")
    protected RequiredByRequestedSegmentResponseType requiredByRequestedSegmentResponse;

    /**
     * Gets the value of the physicalAssetClassID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the physicalAssetClassID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhysicalAssetClassID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PhysicalAssetClassIDType }
     * 
     * 
     */
    public List<PhysicalAssetClassIDType> getPhysicalAssetClassID() {
        if (physicalAssetClassID == null) {
            physicalAssetClassID = new ArrayList<PhysicalAssetClassIDType>();
        }
        return this.physicalAssetClassID;
    }

    /**
     * Gets the value of the physicalAssetID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the physicalAssetID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhysicalAssetID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PhysicalAssetIDType }
     * 
     * 
     */
    public List<PhysicalAssetIDType> getPhysicalAssetID() {
        if (physicalAssetID == null) {
            physicalAssetID = new ArrayList<PhysicalAssetIDType>();
        }
        return this.physicalAssetID;
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
     * Recupera il valore della proprietà physicalAssetUse.
     * 
     * @return
     *     possible object is
     *     {@link PhysicalAssetUseType }
     *     
     */
    public PhysicalAssetUseType getPhysicalAssetUse() {
        return physicalAssetUse;
    }

    /**
     * Imposta il valore della proprietà physicalAssetUse.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalAssetUseType }
     *     
     */
    public void setPhysicalAssetUse(PhysicalAssetUseType value) {
        this.physicalAssetUse = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quantity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuantity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuantityValueType }
     * 
     * 
     */
    public List<QuantityValueType> getQuantity() {
        if (quantity == null) {
            quantity = new ArrayList<QuantityValueType>();
        }
        return this.quantity;
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
     * Gets the value of the physicalAssetRequirementProperty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the physicalAssetRequirementProperty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhysicalAssetRequirementProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OpPhysicalAssetRequirementPropertyType }
     * 
     * 
     */
    public List<OpPhysicalAssetRequirementPropertyType> getPhysicalAssetRequirementProperty() {
        if (physicalAssetRequirementProperty == null) {
            physicalAssetRequirementProperty = new ArrayList<OpPhysicalAssetRequirementPropertyType>();
        }
        return this.physicalAssetRequirementProperty;
    }

    /**
     * Recupera il valore della proprietà requiredByRequestedSegmentResponse.
     * 
     * @return
     *     possible object is
     *     {@link RequiredByRequestedSegmentResponseType }
     *     
     */
    public RequiredByRequestedSegmentResponseType getRequiredByRequestedSegmentResponse() {
        return requiredByRequestedSegmentResponse;
    }

    /**
     * Imposta il valore della proprietà requiredByRequestedSegmentResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link RequiredByRequestedSegmentResponseType }
     *     
     */
    public void setRequiredByRequestedSegmentResponse(RequiredByRequestedSegmentResponseType value) {
        this.requiredByRequestedSegmentResponse = value;
    }

}
