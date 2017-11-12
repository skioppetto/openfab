//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2017.11.12 alle 03:08:18 PM CET 
//


package org.mesa.xml.b2mml_v0600;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per HierarchyScopeType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="HierarchyScopeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EquipmentID" type="{http://www.mesa.org/xml/B2MML-V0600}EquipmentIDType"/>
 *         &lt;element name="EquipmentElementLevel" type="{http://www.mesa.org/xml/B2MML-V0600}EquipmentElementLevelType"/>
 *         &lt;element name="HierarchyScope" type="{http://www.mesa.org/xml/B2MML-V0600}HierarchyScopeType" minOccurs="0"/>
 *         &lt;group ref="{http://www.mesa.org/xml/B2MML-V0600-AllExtensions}HierarchyScope" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HierarchyScopeType", propOrder = {
    "equipmentID",
    "equipmentElementLevel",
    "hierarchyScope"
})
public class HierarchyScopeType {

    @XmlElement(name = "EquipmentID", required = true)
    protected EquipmentIDType equipmentID;
    @XmlElement(name = "EquipmentElementLevel", required = true)
    protected EquipmentElementLevelType equipmentElementLevel;
    @XmlElement(name = "HierarchyScope")
    protected HierarchyScopeType hierarchyScope;

    /**
     * Recupera il valore della proprietà equipmentID.
     * 
     * @return
     *     possible object is
     *     {@link EquipmentIDType }
     *     
     */
    public EquipmentIDType getEquipmentID() {
        return equipmentID;
    }

    /**
     * Imposta il valore della proprietà equipmentID.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipmentIDType }
     *     
     */
    public void setEquipmentID(EquipmentIDType value) {
        this.equipmentID = value;
    }

    /**
     * Recupera il valore della proprietà equipmentElementLevel.
     * 
     * @return
     *     possible object is
     *     {@link EquipmentElementLevelType }
     *     
     */
    public EquipmentElementLevelType getEquipmentElementLevel() {
        return equipmentElementLevel;
    }

    /**
     * Imposta il valore della proprietà equipmentElementLevel.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipmentElementLevelType }
     *     
     */
    public void setEquipmentElementLevel(EquipmentElementLevelType value) {
        this.equipmentElementLevel = value;
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

}
