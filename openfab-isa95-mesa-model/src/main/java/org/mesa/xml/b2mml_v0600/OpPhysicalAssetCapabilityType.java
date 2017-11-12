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
 * <p>Classe Java per OpPhysicalAssetCapabilityType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="OpPhysicalAssetCapabilityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PhysicalAssetClassID" type="{http://www.mesa.org/xml/B2MML-V0600}PhysicalAssetClassIDType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PhysicalAssetID" type="{http://www.mesa.org/xml/B2MML-V0600}PhysicalAssetIDType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.mesa.org/xml/B2MML-V0600}DescriptionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CapabilityType" type="{http://www.mesa.org/xml/B2MML-V0600}CapabilityTypeType" minOccurs="0"/>
 *         &lt;element name="Reason" type="{http://www.mesa.org/xml/B2MML-V0600}ReasonType" minOccurs="0"/>
 *         &lt;element name="ConfidenceFactor" type="{http://www.mesa.org/xml/B2MML-V0600}ConfidenceFactorType" minOccurs="0"/>
 *         &lt;element name="HierarchyScope" type="{http://www.mesa.org/xml/B2MML-V0600}HierarchyScopeType" minOccurs="0"/>
 *         &lt;element name="PhysicalAssetUse" type="{http://www.mesa.org/xml/B2MML-V0600}PhysicalAssetUseType" minOccurs="0"/>
 *         &lt;element name="StartTime" type="{http://www.mesa.org/xml/B2MML-V0600}StartTimeType" minOccurs="0"/>
 *         &lt;element name="EndTime" type="{http://www.mesa.org/xml/B2MML-V0600}EndTimeType" minOccurs="0"/>
 *         &lt;element name="Quantity" type="{http://www.mesa.org/xml/B2MML-V0600}QuantityValueType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PhysicalAssetCapabilityProperty" type="{http://www.mesa.org/xml/B2MML-V0600}OpPhysicalAssetCapabilityPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;group ref="{http://www.mesa.org/xml/B2MML-V0600-AllExtensions}OpPhysicalAssetCapability" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpPhysicalAssetCapabilityType", propOrder = {
    "physicalAssetClassID",
    "physicalAssetID",
    "description",
    "capabilityType",
    "reason",
    "confidenceFactor",
    "hierarchyScope",
    "physicalAssetUse",
    "startTime",
    "endTime",
    "quantity",
    "physicalAssetCapabilityProperty"
})
public class OpPhysicalAssetCapabilityType {

    @XmlElement(name = "PhysicalAssetClassID")
    protected List<PhysicalAssetClassIDType> physicalAssetClassID;
    @XmlElement(name = "PhysicalAssetID")
    protected List<PhysicalAssetIDType> physicalAssetID;
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
    @XmlElement(name = "PhysicalAssetUse")
    protected PhysicalAssetUseType physicalAssetUse;
    @XmlElement(name = "StartTime")
    protected StartTimeType startTime;
    @XmlElement(name = "EndTime")
    protected EndTimeType endTime;
    @XmlElement(name = "Quantity")
    protected List<QuantityValueType> quantity;
    @XmlElement(name = "PhysicalAssetCapabilityProperty")
    protected List<OpPhysicalAssetCapabilityPropertyType> physicalAssetCapabilityProperty;

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
     * Gets the value of the physicalAssetCapabilityProperty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the physicalAssetCapabilityProperty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhysicalAssetCapabilityProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OpPhysicalAssetCapabilityPropertyType }
     * 
     * 
     */
    public List<OpPhysicalAssetCapabilityPropertyType> getPhysicalAssetCapabilityProperty() {
        if (physicalAssetCapabilityProperty == null) {
            physicalAssetCapabilityProperty = new ArrayList<OpPhysicalAssetCapabilityPropertyType>();
        }
        return this.physicalAssetCapabilityProperty;
    }

}
