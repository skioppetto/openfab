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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java per SyncEquipmentClassType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="SyncEquipmentClassType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ApplicationArea" type="{http://www.mesa.org/xml/B2MML-V0600}TransApplicationAreaType"/>
 *         &lt;element name="DataArea">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Sync" type="{http://www.mesa.org/xml/B2MML-V0600}TransSyncType"/>
 *                   &lt;element name="EquipmentClass" type="{http://www.mesa.org/xml/B2MML-V0600}EquipmentClassType" maxOccurs="unbounded"/>
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
@XmlType(name = "SyncEquipmentClassType", propOrder = {
    "applicationArea",
    "dataArea"
})
public class SyncEquipmentClassType {

    @XmlElement(name = "ApplicationArea", required = true)
    protected TransApplicationAreaType applicationArea;
    @XmlElement(name = "DataArea", required = true)
    protected SyncEquipmentClassType.DataArea dataArea;
    @XmlAttribute(name = "releaseID", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String releaseID;
    @XmlAttribute(name = "versionID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String versionID;

    /**
     * Recupera il valore della propriet� applicationArea.
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
     * Imposta il valore della propriet� applicationArea.
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
     * Recupera il valore della propriet� dataArea.
     * 
     * @return
     *     possible object is
     *     {@link SyncEquipmentClassType.DataArea }
     *     
     */
    public SyncEquipmentClassType.DataArea getDataArea() {
        return dataArea;
    }

    /**
     * Imposta il valore della propriet� dataArea.
     * 
     * @param value
     *     allowed object is
     *     {@link SyncEquipmentClassType.DataArea }
     *     
     */
    public void setDataArea(SyncEquipmentClassType.DataArea value) {
        this.dataArea = value;
    }

    /**
     * Recupera il valore della propriet� releaseID.
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
     * Imposta il valore della propriet� releaseID.
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
     * Recupera il valore della propriet� versionID.
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
     * Imposta il valore della propriet� versionID.
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
     *         &lt;element name="Sync" type="{http://www.mesa.org/xml/B2MML-V0600}TransSyncType"/>
     *         &lt;element name="EquipmentClass" type="{http://www.mesa.org/xml/B2MML-V0600}EquipmentClassType" maxOccurs="unbounded"/>
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
        "sync",
        "equipmentClass"
    })
    public static class DataArea {

        @XmlElement(name = "Sync", required = true)
        protected TransSyncType sync;
        @XmlElement(name = "EquipmentClass", required = true)
        protected List<EquipmentClassType> equipmentClass;

        /**
         * Recupera il valore della propriet� sync.
         * 
         * @return
         *     possible object is
         *     {@link TransSyncType }
         *     
         */
        public TransSyncType getSync() {
            return sync;
        }

        /**
         * Imposta il valore della propriet� sync.
         * 
         * @param value
         *     allowed object is
         *     {@link TransSyncType }
         *     
         */
        public void setSync(TransSyncType value) {
            this.sync = value;
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

    }

}
