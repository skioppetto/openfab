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
 * <p>Classe Java per OpMaterialCapabilityType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="OpMaterialCapabilityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MaterialClassID" type="{http://www.mesa.org/xml/B2MML-V0600}MaterialClassIDType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MaterialDefinitionID" type="{http://www.mesa.org/xml/B2MML-V0600}MaterialDefinitionIDType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MaterialLotID" type="{http://www.mesa.org/xml/B2MML-V0600}MaterialLotIDType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MaterialSubLotID" type="{http://www.mesa.org/xml/B2MML-V0600}MaterialSubLotIDType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.mesa.org/xml/B2MML-V0600}DescriptionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CapabilityType" type="{http://www.mesa.org/xml/B2MML-V0600}CapabilityTypeType" minOccurs="0"/>
 *         &lt;element name="Reason" type="{http://www.mesa.org/xml/B2MML-V0600}ReasonType" minOccurs="0"/>
 *         &lt;element name="ConfidenceFactor" type="{http://www.mesa.org/xml/B2MML-V0600}ConfidenceFactorType" minOccurs="0"/>
 *         &lt;element name="HierarchyScope" type="{http://www.mesa.org/xml/B2MML-V0600}HierarchyScopeType" minOccurs="0"/>
 *         &lt;element name="MaterialUse" type="{http://www.mesa.org/xml/B2MML-V0600}MaterialUseType" minOccurs="0"/>
 *         &lt;element name="StartTime" type="{http://www.mesa.org/xml/B2MML-V0600}StartTimeType" minOccurs="0"/>
 *         &lt;element name="EndTime" type="{http://www.mesa.org/xml/B2MML-V0600}EndTimeType" minOccurs="0"/>
 *         &lt;element name="AssemblyCapability" type="{http://www.mesa.org/xml/B2MML-V0600}OpMaterialCapabilityType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AssemblyType" type="{http://www.mesa.org/xml/B2MML-V0600}AssemblyTypeType" minOccurs="0"/>
 *         &lt;element name="AssemblyRelationship" type="{http://www.mesa.org/xml/B2MML-V0600}AssemblyRelationshipType" minOccurs="0"/>
 *         &lt;element name="Quantity" type="{http://www.mesa.org/xml/B2MML-V0600}QuantityValueType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MaterialCapabilityProperty" type="{http://www.mesa.org/xml/B2MML-V0600}OpMaterialCapabilityPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;group ref="{http://www.mesa.org/xml/B2MML-V0600-AllExtensions}OpMaterialCapability" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpMaterialCapabilityType", propOrder = {
    "materialClassID",
    "materialDefinitionID",
    "materialLotID",
    "materialSubLotID",
    "description",
    "capabilityType",
    "reason",
    "confidenceFactor",
    "hierarchyScope",
    "materialUse",
    "startTime",
    "endTime",
    "assemblyCapability",
    "assemblyType",
    "assemblyRelationship",
    "quantity",
    "materialCapabilityProperty"
})
public class OpMaterialCapabilityType {

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
    @XmlElement(name = "CapabilityType")
    protected CapabilityTypeType capabilityType;
    @XmlElement(name = "Reason")
    protected ReasonType reason;
    @XmlElement(name = "ConfidenceFactor")
    protected ConfidenceFactorType confidenceFactor;
    @XmlElement(name = "HierarchyScope")
    protected HierarchyScopeType hierarchyScope;
    @XmlElement(name = "MaterialUse")
    protected MaterialUseType materialUse;
    @XmlElement(name = "StartTime")
    protected StartTimeType startTime;
    @XmlElement(name = "EndTime")
    protected EndTimeType endTime;
    @XmlElement(name = "AssemblyCapability")
    protected List<OpMaterialCapabilityType> assemblyCapability;
    @XmlElement(name = "AssemblyType")
    protected AssemblyTypeType assemblyType;
    @XmlElement(name = "AssemblyRelationship")
    protected AssemblyRelationshipType assemblyRelationship;
    @XmlElement(name = "Quantity")
    protected List<QuantityValueType> quantity;
    @XmlElement(name = "MaterialCapabilityProperty")
    protected List<OpMaterialCapabilityPropertyType> materialCapabilityProperty;

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
     * Recupera il valore della proprietà capabilityType.
     * 
     * @return
     *     possible object is
     *     {@link CapabilityTypeType }
     *     
     */
    public CapabilityTypeType getCapabilityType() {
        return capabilityType;
    }

    /**
     * Imposta il valore della proprietà capabilityType.
     * 
     * @param value
     *     allowed object is
     *     {@link CapabilityTypeType }
     *     
     */
    public void setCapabilityType(CapabilityTypeType value) {
        this.capabilityType = value;
    }

    /**
     * Recupera il valore della proprietà reason.
     * 
     * @return
     *     possible object is
     *     {@link ReasonType }
     *     
     */
    public ReasonType getReason() {
        return reason;
    }

    /**
     * Imposta il valore della proprietà reason.
     * 
     * @param value
     *     allowed object is
     *     {@link ReasonType }
     *     
     */
    public void setReason(ReasonType value) {
        this.reason = value;
    }

    /**
     * Recupera il valore della proprietà confidenceFactor.
     * 
     * @return
     *     possible object is
     *     {@link ConfidenceFactorType }
     *     
     */
    public ConfidenceFactorType getConfidenceFactor() {
        return confidenceFactor;
    }

    /**
     * Imposta il valore della proprietà confidenceFactor.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfidenceFactorType }
     *     
     */
    public void setConfidenceFactor(ConfidenceFactorType value) {
        this.confidenceFactor = value;
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
     * Recupera il valore della proprietà startTime.
     * 
     * @return
     *     possible object is
     *     {@link StartTimeType }
     *     
     */
    public StartTimeType getStartTime() {
        return startTime;
    }

    /**
     * Imposta il valore della proprietà startTime.
     * 
     * @param value
     *     allowed object is
     *     {@link StartTimeType }
     *     
     */
    public void setStartTime(StartTimeType value) {
        this.startTime = value;
    }

    /**
     * Recupera il valore della proprietà endTime.
     * 
     * @return
     *     possible object is
     *     {@link EndTimeType }
     *     
     */
    public EndTimeType getEndTime() {
        return endTime;
    }

    /**
     * Imposta il valore della proprietà endTime.
     * 
     * @param value
     *     allowed object is
     *     {@link EndTimeType }
     *     
     */
    public void setEndTime(EndTimeType value) {
        this.endTime = value;
    }

    /**
     * Gets the value of the assemblyCapability property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assemblyCapability property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssemblyCapability().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OpMaterialCapabilityType }
     * 
     * 
     */
    public List<OpMaterialCapabilityType> getAssemblyCapability() {
        if (assemblyCapability == null) {
            assemblyCapability = new ArrayList<OpMaterialCapabilityType>();
        }
        return this.assemblyCapability;
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
     * Gets the value of the materialCapabilityProperty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the materialCapabilityProperty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMaterialCapabilityProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OpMaterialCapabilityPropertyType }
     * 
     * 
     */
    public List<OpMaterialCapabilityPropertyType> getMaterialCapabilityProperty() {
        if (materialCapabilityProperty == null) {
            materialCapabilityProperty = new ArrayList<OpMaterialCapabilityPropertyType>();
        }
        return this.materialCapabilityProperty;
    }

}
