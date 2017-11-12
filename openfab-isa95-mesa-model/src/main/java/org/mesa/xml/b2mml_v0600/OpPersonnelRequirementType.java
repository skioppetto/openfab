//
// Questo file � stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andr� persa durante la ricompilazione dello schema di origine. 
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
 * <p>Classe Java per OpPersonnelRequirementType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="OpPersonnelRequirementType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PersonnelClassID" type="{http://www.mesa.org/xml/B2MML-V0600}PersonnelClassIDType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PersonID" type="{http://www.mesa.org/xml/B2MML-V0600}PersonIDType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.mesa.org/xml/B2MML-V0600}DescriptionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PersonnelUse" type="{http://www.mesa.org/xml/B2MML-V0600}PersonnelUseType" minOccurs="0"/>
 *         &lt;element name="Quantity" type="{http://www.mesa.org/xml/B2MML-V0600}QuantityValueType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="HierarchyScope" type="{http://www.mesa.org/xml/B2MML-V0600}HierarchyScopeType" minOccurs="0"/>
 *         &lt;element name="PersonnelRequirementProperty" type="{http://www.mesa.org/xml/B2MML-V0600}OpPersonnelRequirementPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RequiredByRequestedSegmentResponse" type="{http://www.mesa.org/xml/B2MML-V0600}RequiredByRequestedSegmentResponseType" minOccurs="0"/>
 *         &lt;group ref="{http://www.mesa.org/xml/B2MML-V0600-AllExtensions}OpPersonnelRequirement" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpPersonnelRequirementType", propOrder = {
    "personnelClassID",
    "personID",
    "description",
    "personnelUse",
    "quantity",
    "hierarchyScope",
    "personnelRequirementProperty",
    "requiredByRequestedSegmentResponse"
})
public class OpPersonnelRequirementType {

    @XmlElement(name = "PersonnelClassID")
    protected List<PersonnelClassIDType> personnelClassID;
    @XmlElement(name = "PersonID")
    protected List<PersonIDType> personID;
    @XmlElement(name = "Description")
    protected List<DescriptionType> description;
    @XmlElement(name = "PersonnelUse")
    protected PersonnelUseType personnelUse;
    @XmlElement(name = "Quantity")
    protected List<QuantityValueType> quantity;
    @XmlElement(name = "HierarchyScope")
    protected HierarchyScopeType hierarchyScope;
    @XmlElement(name = "PersonnelRequirementProperty")
    protected List<OpPersonnelRequirementPropertyType> personnelRequirementProperty;
    @XmlElement(name = "RequiredByRequestedSegmentResponse")
    protected RequiredByRequestedSegmentResponseType requiredByRequestedSegmentResponse;

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
     * Recupera il valore della propriet� personnelUse.
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
     * Imposta il valore della propriet� personnelUse.
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
     * Recupera il valore della propriet� hierarchyScope.
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
     * Imposta il valore della propriet� hierarchyScope.
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
     * Gets the value of the personnelRequirementProperty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personnelRequirementProperty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonnelRequirementProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OpPersonnelRequirementPropertyType }
     * 
     * 
     */
    public List<OpPersonnelRequirementPropertyType> getPersonnelRequirementProperty() {
        if (personnelRequirementProperty == null) {
            personnelRequirementProperty = new ArrayList<OpPersonnelRequirementPropertyType>();
        }
        return this.personnelRequirementProperty;
    }

    /**
     * Recupera il valore della propriet� requiredByRequestedSegmentResponse.
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
     * Imposta il valore della propriet� requiredByRequestedSegmentResponse.
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
