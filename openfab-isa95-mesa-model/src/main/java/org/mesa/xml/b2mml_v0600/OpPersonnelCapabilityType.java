//
// Questo file Ŕ stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrÓ persa durante la ricompilazione dello schema di origine. 
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
 * <p>Classe Java per OpPersonnelCapabilityType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="OpPersonnelCapabilityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PersonnelClassID" type="{http://www.mesa.org/xml/B2MML-V0600}PersonnelClassIDType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PersonID" type="{http://www.mesa.org/xml/B2MML-V0600}PersonIDType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.mesa.org/xml/B2MML-V0600}DescriptionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CapabilityType" type="{http://www.mesa.org/xml/B2MML-V0600}CapabilityTypeType" minOccurs="0"/>
 *         &lt;element name="Reason" type="{http://www.mesa.org/xml/B2MML-V0600}ReasonType" minOccurs="0"/>
 *         &lt;element name="ConfidenceFactor" type="{http://www.mesa.org/xml/B2MML-V0600}ConfidenceFactorType" minOccurs="0"/>
 *         &lt;element name="HierarchyScope" type="{http://www.mesa.org/xml/B2MML-V0600}HierarchyScopeType" minOccurs="0"/>
 *         &lt;element name="PersonnelUse" type="{http://www.mesa.org/xml/B2MML-V0600}PersonnelUseType" minOccurs="0"/>
 *         &lt;element name="StartTime" type="{http://www.mesa.org/xml/B2MML-V0600}StartTimeType" minOccurs="0"/>
 *         &lt;element name="EndTime" type="{http://www.mesa.org/xml/B2MML-V0600}EndTimeType" minOccurs="0"/>
 *         &lt;element name="Quantity" type="{http://www.mesa.org/xml/B2MML-V0600}QuantityValueType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PersonnelCapabilityProperty" type="{http://www.mesa.org/xml/B2MML-V0600}OpPersonnelCapabilityPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;group ref="{http://www.mesa.org/xml/B2MML-V0600-AllExtensions}OpPersonnelCapability" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpPersonnelCapabilityType", propOrder = {
    "personnelClassID",
    "personID",
    "description",
    "capabilityType",
    "reason",
    "confidenceFactor",
    "hierarchyScope",
    "personnelUse",
    "startTime",
    "endTime",
    "quantity",
    "personnelCapabilityProperty"
})
public class OpPersonnelCapabilityType {

    @XmlElement(name = "PersonnelClassID")
    protected List<PersonnelClassIDType> personnelClassID;
    @XmlElement(name = "PersonID")
    protected List<PersonIDType> personID;
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
    @XmlElement(name = "PersonnelUse")
    protected PersonnelUseType personnelUse;
    @XmlElement(name = "StartTime")
    protected StartTimeType startTime;
    @XmlElement(name = "EndTime")
    protected EndTimeType endTime;
    @XmlElement(name = "Quantity")
    protected List<QuantityValueType> quantity;
    @XmlElement(name = "PersonnelCapabilityProperty")
    protected List<OpPersonnelCapabilityPropertyType> personnelCapabilityProperty;

    /**
     * Gets the value of the personnelClassID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personnelClassID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonnelClassID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonnelClassIDType }
     * 
     * 
     */
    public List<PersonnelClassIDType> getPersonnelClassID() {
        if (personnelClassID == null) {
            personnelClassID = new ArrayList<PersonnelClassIDType>();
        }
        return this.personnelClassID;
    }

    /**
     * Gets the value of the personID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonIDType }
     * 
     * 
     */
    public List<PersonIDType> getPersonID() {
        if (personID == null) {
            personID = new ArrayList<PersonIDType>();
        }
        return this.personID;
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
     * Recupera il valore della proprietÓ capabilityType.
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
     * Imposta il valore della proprietÓ capabilityType.
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
     * Recupera il valore della proprietÓ reason.
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
     * Imposta il valore della proprietÓ reason.
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
     * Recupera il valore della proprietÓ confidenceFactor.
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
     * Imposta il valore della proprietÓ confidenceFactor.
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
     * Recupera il valore della proprietÓ hierarchyScope.
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
     * Imposta il valore della proprietÓ hierarchyScope.
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
     * Recupera il valore della proprietÓ personnelUse.
     * 
     * @return
     *     possible object is
     *     {@link PersonnelUseType }
     *     
     */
    public PersonnelUseType getPersonnelUse() {
        return personnelUse;
    }

    /**
     * Imposta il valore della proprietÓ personnelUse.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonnelUseType }
     *     
     */
    public void setPersonnelUse(PersonnelUseType value) {
        this.personnelUse = value;
    }

    /**
     * Recupera il valore della proprietÓ startTime.
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
     * Imposta il valore della proprietÓ startTime.
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
     * Recupera il valore della proprietÓ endTime.
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
     * Imposta il valore della proprietÓ endTime.
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
     * Gets the value of the personnelCapabilityProperty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personnelCapabilityProperty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonnelCapabilityProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OpPersonnelCapabilityPropertyType }
     * 
     * 
     */
    public List<OpPersonnelCapabilityPropertyType> getPersonnelCapabilityProperty() {
        if (personnelCapabilityProperty == null) {
            personnelCapabilityProperty = new ArrayList<OpPersonnelCapabilityPropertyType>();
        }
        return this.personnelCapabilityProperty;
    }

}
