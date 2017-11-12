//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2017.11.12 alle 03:08:18 PM CET 
//


package org.mesa.xml.b2mml_v0600_allextensions;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java per QuantityType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="QuantityType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
 *       &lt;attribute name="unitCode" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *       &lt;attribute name="unitCodeListID" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *       &lt;attribute name="unitCodeListAgencyID" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *       &lt;attribute name="unitCodeListAgencyName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuantityType", propOrder = {
    "value"
})
public class QuantityType {

    @XmlValue
    protected BigDecimal value;
    @XmlAttribute(name = "unitCode")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String unitCode;
    @XmlAttribute(name = "unitCodeListID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String unitCodeListID;
    @XmlAttribute(name = "unitCodeListAgencyID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String unitCodeListAgencyID;
    @XmlAttribute(name = "unitCodeListAgencyName")
    protected String unitCodeListAgencyName;

    /**
     * Recupera il valore della proprietà value.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValue() {
        return value;
    }

    /**
     * Imposta il valore della proprietà value.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValue(BigDecimal value) {
        this.value = value;
    }

    /**
     * Recupera il valore della proprietà unitCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitCode() {
        return unitCode;
    }

    /**
     * Imposta il valore della proprietà unitCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitCode(String value) {
        this.unitCode = value;
    }

    /**
     * Recupera il valore della proprietà unitCodeListID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitCodeListID() {
        return unitCodeListID;
    }

    /**
     * Imposta il valore della proprietà unitCodeListID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitCodeListID(String value) {
        this.unitCodeListID = value;
    }

    /**
     * Recupera il valore della proprietà unitCodeListAgencyID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitCodeListAgencyID() {
        return unitCodeListAgencyID;
    }

    /**
     * Imposta il valore della proprietà unitCodeListAgencyID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitCodeListAgencyID(String value) {
        this.unitCodeListAgencyID = value;
    }

    /**
     * Recupera il valore della proprietà unitCodeListAgencyName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitCodeListAgencyName() {
        return unitCodeListAgencyName;
    }

    /**
     * Imposta il valore della proprietà unitCodeListAgencyName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitCodeListAgencyName(String value) {
        this.unitCodeListAgencyName = value;
    }

}
