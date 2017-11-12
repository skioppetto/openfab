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
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per SegmentDependencyType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="SegmentDependencyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.mesa.org/xml/B2MML-V0600}IdentifierType"/>
 *         &lt;element name="Description" type="{http://www.mesa.org/xml/B2MML-V0600}DescriptionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Dependency" type="{http://www.mesa.org/xml/B2MML-V0600}DependencyType"/>
 *         &lt;element name="TimingFactor" type="{http://www.mesa.org/xml/B2MML-V0600}ValueType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="ProductSegmentID" type="{http://www.mesa.org/xml/B2MML-V0600}ProductSegmentIDType"/>
 *           &lt;element name="ProcessSegmentID" type="{http://www.mesa.org/xml/B2MML-V0600}ProcessSegmentIDType"/>
 *           &lt;element name="SegmentID" type="{http://www.mesa.org/xml/B2MML-V0600}IdentifierType"/>
 *         &lt;/choice>
 *         &lt;group ref="{http://www.mesa.org/xml/B2MML-V0600-AllExtensions}SegmentDependency" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SegmentDependencyType", propOrder = {
    "id",
    "description",
    "dependency",
    "timingFactor",
    "productSegmentIDOrProcessSegmentIDOrSegmentID"
})
public class SegmentDependencyType {

    @XmlElement(name = "ID", required = true)
    protected IdentifierType id;
    @XmlElement(name = "Description")
    protected List<DescriptionType> description;
    @XmlElement(name = "Dependency", required = true)
    protected DependencyType dependency;
    @XmlElement(name = "TimingFactor")
    protected List<ValueType> timingFactor;
    @XmlElements({
        @XmlElement(name = "ProductSegmentID", type = ProductSegmentIDType.class),
        @XmlElement(name = "ProcessSegmentID", type = ProcessSegmentIDType.class),
        @XmlElement(name = "SegmentID")
    })
    protected List<IdentifierType> productSegmentIDOrProcessSegmentIDOrSegmentID;

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
     * Recupera il valore della proprietà dependency.
     * 
     * @return
     *     possible object is
     *     {@link DependencyType }
     *     
     */
    public DependencyType getDependency() {
        return dependency;
    }

    /**
     * Imposta il valore della proprietà dependency.
     * 
     * @param value
     *     allowed object is
     *     {@link DependencyType }
     *     
     */
    public void setDependency(DependencyType value) {
        this.dependency = value;
    }

    /**
     * Gets the value of the timingFactor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the timingFactor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTimingFactor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValueType }
     * 
     * 
     */
    public List<ValueType> getTimingFactor() {
        if (timingFactor == null) {
            timingFactor = new ArrayList<ValueType>();
        }
        return this.timingFactor;
    }

    /**
     * Gets the value of the productSegmentIDOrProcessSegmentIDOrSegmentID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productSegmentIDOrProcessSegmentIDOrSegmentID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductSegmentIDOrProcessSegmentIDOrSegmentID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductSegmentIDType }
     * {@link ProcessSegmentIDType }
     * {@link IdentifierType }
     * 
     * 
     */
    public List<IdentifierType> getProductSegmentIDOrProcessSegmentIDOrSegmentID() {
        if (productSegmentIDOrProcessSegmentIDOrSegmentID == null) {
            productSegmentIDOrProcessSegmentIDOrSegmentID = new ArrayList<IdentifierType>();
        }
        return this.productSegmentIDOrProcessSegmentIDOrSegmentID;
    }

}
