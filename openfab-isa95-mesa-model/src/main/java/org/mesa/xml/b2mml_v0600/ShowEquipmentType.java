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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java per ShowEquipmentType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ShowEquipmentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ApplicationArea" type="{http://www.mesa.org/xml/B2MML-V0600}TransApplicationAreaType"/>
 *         &lt;element name="DataArea">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Show" type="{http://www.mesa.org/xml/B2MML-V0600}TransShowType"/>
 *                   &lt;element name="Equipment" type="{http://www.mesa.org/xml/B2MML-V0600}EquipmentType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="releaseID" use="required" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *       &lt;attribute name="versionID" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShowEquipmentType", propOrder = {
    "applicationArea",
    "dataArea"
})
public class ShowEquipmentType {

    @XmlElement(name = "ApplicationArea", required = true)
    protected TransApplicationAreaType applicationArea;
    @XmlElement(name = "DataArea", required = true)
    protected ShowEquipmentType.DataArea dataArea;
    @XmlAttribute(name = "releaseID", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String releaseID;
    @XmlAttribute(name = "versionID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String versionID;

    /**
     * Recupera il valore della proprietà applicationArea.
     * 
     * @return
     *     possible object is
     *     {@link TransApplicationAreaType }
     *     
     */
    public TransApplicationAreaType getApplicationArea() {
        return applicationArea;
    }

    /**
     * Imposta il valore della proprietà applicationArea.
     * 
     * @param value
     *     allowed object is
     *     {@link TransApplicationAreaType }
     *     
     */
    public void setApplicationArea(TransApplicationAreaType value) {
        this.applicationArea = value;
    }

    /**
     * Recupera il valore della proprietà dataArea.
     * 
     * @return
     *     possible object is
     *     {@link ShowEquipmentType.DataArea }
     *     
     */
    public ShowEquipmentType.DataArea getDataArea() {
        return dataArea;
    }

    /**
     * Imposta il valore della proprietà dataArea.
     * 
     * @param value
     *     allowed object is
     *     {@link ShowEquipmentType.DataArea }
     *     
     */
    public void setDataArea(ShowEquipmentType.DataArea value) {
        this.dataArea = value;
    }

    /**
     * Recupera il valore della proprietà releaseID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReleaseID() {
        return releaseID;
    }

    /**
     * Imposta il valore della proprietà releaseID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReleaseID(String value) {
        this.releaseID = value;
    }

    /**
     * Recupera il valore della proprietà versionID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersionID() {
        return versionID;
    }

    /**
     * Imposta il valore della proprietà versionID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersionID(String value) {
        this.versionID = value;
    }


    /**
     * <p>Classe Java per anonymous complex type.
     * 
     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Show" type="{http://www.mesa.org/xml/B2MML-V0600}TransShowType"/>
     *         &lt;element name="Equipment" type="{http://www.mesa.org/xml/B2MML-V0600}EquipmentType" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "show",
        "equipment"
    })
    public static class DataArea {

        @XmlElement(name = "Show", required = true)
        protected TransShowType show;
        @XmlElement(name = "Equipment", required = true)
        protected List<EquipmentType> equipment;

        /**
         * Recupera il valore della proprietà show.
         * 
         * @return
         *     possible object is
         *     {@link TransShowType }
         *     
         */
        public TransShowType getShow() {
            return show;
        }

        /**
         * Imposta il valore della proprietà show.
         * 
         * @param value
         *     allowed object is
         *     {@link TransShowType }
         *     
         */
        public void setShow(TransShowType value) {
            this.show = value;
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

    }

}
