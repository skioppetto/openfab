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
 * <p>Classe Java per OpMaterialRequirementType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="OpMaterialRequirementType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MaterialClassID" type="{http://www.mesa.org/xml/B2MML-V0600}MaterialClassIDType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MaterialDefinitionID" type="{http://www.mesa.org/xml/B2MML-V0600}MaterialDefinitionIDType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MaterialLotID" type="{http://www.mesa.org/xml/B2MML-V0600}MaterialLotIDType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MaterialSubLotID" type="{http://www.mesa.org/xml/B2MML-V0600}MaterialSubLotIDType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.mesa.org/xml/B2MML-V0600}DescriptionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MaterialUse" type="{http://www.mesa.org/xml/B2MML-V0600}MaterialUseType" minOccurs="0"/>
 *         &lt;element name="StorageLocation" type="{http://www.mesa.org/xml/B2MML-V0600}StorageLocationType" minOccurs="0"/>
 *         &lt;element name="Quantity" type="{http://www.mesa.org/xml/B2MML-V0600}QuantityValueType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AssemblyRequirement" type="{http://www.mesa.org/xml/B2MML-V0600}OpMaterialRequirementType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AssemblyType" type="{http://www.mesa.org/xml/B2MML-V0600}AssemblyTypeType" minOccurs="0"/>
 *         &lt;element name="AssemblyRelationship" type="{http://www.mesa.org/xml/B2MML-V0600}AssemblyRelationshipType" minOccurs="0"/>
 *         &lt;element name="HierarchyScope" type="{http://www.mesa.org/xml/B2MML-V0600}HierarchyScopeType" minOccurs="0"/>
 *         &lt;element name="MaterialRequirementProperty" type="{http://www.mesa.org/xml/B2MML-V0600}OpMaterialRequirementPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RequiredByRequestedSegmentResponse" type="{http://www.mesa.org/xml/B2MML-V0600}RequiredByRequestedSegmentResponseType" minOccurs="0"/>
 *         &lt;group ref="{http://www.mesa.org/xml/B2MML-V0600-AllExtensions}OpMaterialRequirement" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpMaterialRequirementType", propOrder = {
    "materialClassID",
    "materialDefinitionID",
    "materialLotID",
    "materialSubLotID",
    "description",
    "materialUse",
    "storageLocation",
    "quantity",
    "assemblyRequirement",
    "assemblyType",
    "assemblyRelationship",
    "hierarchyScope",
    "materialRequirementProperty",
    "requiredByRequestedSegmentResponse"
})
public class OpMaterialRequirementType {

    @XmlElement(name = "MaterialClassID")
    protected List<MaterialClassIDType> materialClassID;
    @XmlElement(name = "MaterialDefinitionID")
    protected List<MaterialDefinitionIDType> materialDefinitionID;
    @XmlElement(name = "MaterialLotID")
    protected List<MaterialLotIDType> materialLotID;
    @XmlElement(name = "MaterialSubLotID")
    protected List<MaterialSubLotIDType> materialSubLotID;
    @XmlElement(name = "Description")
    protected List<DescriptionType> description;
    @XmlElement(name = "MaterialUse")
    protected MaterialUseType materialUse;
    @XmlElement(name = "StorageLocation")
    protected StorageLocationType storageLocation;
    @XmlElement(name = "Quantity")
    protected List<QuantityValueType> quantity;
    @XmlElement(name = "AssemblyRequirement")
    protected List<OpMaterialRequirementType> assemblyRequirement;
    @XmlElement(name = "AssemblyType")
    protected AssemblyTypeType assemblyType;
    @XmlElement(name = "AssemblyRelationship")
    protected AssemblyRelationshipType assemblyRelationship;
    @XmlElement(name = "HierarchyScope")
    protected HierarchyScopeType hierarchyScope;
    @XmlElement(name = "MaterialRequirementProperty")
    protected List<OpMaterialRequirementPropertyType> materialRequirementProperty;
    @XmlElement(name = "RequiredByRequestedSegmentResponse")
    protected RequiredByRequestedSegmentResponseType requiredByRequestedSegmentResponse;

    /**
     * Gets the value of the materialClassID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the materialClassID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMaterialClassID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MaterialClassIDType }
     * 
     * 
     */
    public List<MaterialClassIDType> getMaterialClassID() {
        if (materialClassID == null) {
            materialClassID = new ArrayList<MaterialClassIDType>();
        }
        return this.materialClassID;
    }

    /**
     * Gets the value of the materialDefinitionID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the materialDefinitionID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMaterialDefinitionID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MaterialDefinitionIDType }
     * 
     * 
     */
    public List<MaterialDefinitionIDType> getMaterialDefinitionID() {
        if (materialDefinitionID == null) {
            materialDefinitionID = new ArrayList<MaterialDefinitionIDType>();
        }
        return this.materialDefinitionID;
    }

    /**
     * Gets the value of the materialLotID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the materialLotID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMaterialLotID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MaterialLotIDType }
     * 
     * 
     */
    public List<MaterialLotIDType> getMaterialLotID() {
        if (materialLotID == null) {
            materialLotID = new ArrayList<MaterialLotIDType>();
        }
        return this.materialLotID;
    }

    /**
     * Gets the value of the materialSubLotID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the materialSubLotID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMaterialSubLotID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MaterialSubLotIDType }
     * 
     * 
     */
    public List<MaterialSubLotIDType> getMaterialSubLotID() {
        if (materialSubLotID == null) {
            materialSubLotID = new ArrayList<MaterialSubLotIDType>();
        }
        return this.materialSubLotID;
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
     * Recupera il valore della proprietà materialUse.
     * 
     * @return
     *     possible object is
     *     {@link MaterialUseType }
     *     
     */
    public MaterialUseType getMaterialUse() {
        return materialUse;
    }

    /**
     * Imposta il valore della proprietà materialUse.
     * 
     * @param value
     *     allowed object is
     *     {@link MaterialUseType }
     *     
     */
    public void setMaterialUse(MaterialUseType value) {
        this.materialUse = value;
    }

    /**
     * Recupera il valore della proprietà storageLocation.
     * 
     * @return
     *     possible object is
     *     {@link StorageLocationType }
     *     
     */
    public StorageLocationType getStorageLocation() {
        return storageLocation;
    }

    /**
     * Imposta il valore della proprietà storageLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link StorageLocationType }
     *     
     */
    public void setStorageLocation(StorageLocationType value) {
        this.storageLocation = value;
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
     * Gets the value of the assemblyRequirement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assemblyRequirement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssemblyRequirement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OpMaterialRequirementType }
     * 
     * 
     */
    public List<OpMaterialRequirementType> getAssemblyRequirement() {
        if (assemblyRequirement == null) {
            assemblyRequirement = new ArrayList<OpMaterialRequirementType>();
        }
        return this.assemblyRequirement;
    }

    /**
     * Recupera il valore della proprietà assemblyType.
     * 
     * @return
     *     possible object is
     *     {@link AssemblyTypeType }
     *     
     */
    public AssemblyTypeType getAssemblyType() {
        return assemblyType;
    }

    /**
     * Imposta il valore della proprietà assemblyType.
     * 
     * @param value
     *     allowed object is
     *     {@link AssemblyTypeType }
     *     
     */
    public void setAssemblyType(AssemblyTypeType value) {
        this.assemblyType = value;
    }

    /**
     * Recupera il valore della proprietà assemblyRelationship.
     * 
     * @return
     *     possible object is
     *     {@link AssemblyRelationshipType }
     *     
     */
    public AssemblyRelationshipType getAssemblyRelationship() {
        return assemblyRelationship;
    }

    /**
     * Imposta il valore della proprietà assemblyRelationship.
     * 
     * @param value
     *     allowed object is
     *     {@link AssemblyRelationshipType }
     *     
     */
    public void setAssemblyRelationship(AssemblyRelationshipType value) {
        this.assemblyRelationship = value;
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
     * Gets the value of the materialRequirementProperty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the materialRequirementProperty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMaterialRequirementProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OpMaterialRequirementPropertyType }
     * 
     * 
     */
    public List<OpMaterialRequirementPropertyType> getMaterialRequirementProperty() {
        if (materialRequirementProperty == null) {
            materialRequirementProperty = new ArrayList<OpMaterialRequirementPropertyType>();
        }
        return this.materialRequirementProperty;
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
