//
// Questo file � stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andr� persa durante la ricompilazione dello schema di origine. 
// Generato il: 2017.11.12 alle 03:08:18 PM CET 
//


package org.mesa.xml.b2mml_v0600;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java per AnyGenericValueType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="AnyGenericValueType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="currencyID" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *       &lt;attribute name="currencyCodeListVersionID" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *       &lt;attribute name="encodingCode" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *       &lt;attribute name="format" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="characterSetCode" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *       &lt;attribute name="listID" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *       &lt;attribute name="listAgencyID" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *       &lt;attribute name="listAgencyName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="listName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="listVersionID" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *       &lt;attribute name="languageID" type="{http://www.w3.org/2001/XMLSchema}language" />
 *       &lt;attribute name="languageLocaleID" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *       &lt;attribute name="listURI" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="listSchemaURI" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="mimeCode" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="schemaID" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *       &lt;attribute name="schemaName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="schemaAgencyID" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *       &lt;attribute name="schemaAgencyName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="schemaVersionID" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *       &lt;attribute name="schemaDataURI" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="schemaURI" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="unitCode" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *       &lt;attribute name="unitCodeListID" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *       &lt;attribute name="unitCodeListAgencyID" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *       &lt;attribute name="unitCodeListAgencyName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="unitCodeListVersionID" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *       &lt;attribute name="filename" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="uri" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnyGenericValueType", propOrder = {
    "value"
})
@XmlSeeAlso({
    ValueStringType.class,
    QuantityStringType.class
})
public class AnyGenericValueType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "currencyID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String currencyID;
    @XmlAttribute(name = "currencyCodeListVersionID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String currencyCodeListVersionID;
    @XmlAttribute(name = "encodingCode")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String encodingCode;
    @XmlAttribute(name = "format")
    protected String format;
    @XmlAttribute(name = "characterSetCode")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String characterSetCode;
    @XmlAttribute(name = "listID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String listID;
    @XmlAttribute(name = "listAgencyID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String listAgencyID;
    @XmlAttribute(name = "listAgencyName")
    protected String listAgencyName;
    @XmlAttribute(name = "listName")
    protected String listName;
    @XmlAttribute(name = "listVersionID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String listVersionID;
    @XmlAttribute(name = "languageID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String languageID;
    @XmlAttribute(name = "languageLocaleID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String languageLocaleID;
    @XmlAttribute(name = "listURI")
    @XmlSchemaType(name = "anyURI")
    protected String listURI;
    @XmlAttribute(name = "listSchemaURI")
    @XmlSchemaType(name = "anyURI")
    protected String listSchemaURI;
    @XmlAttribute(name = "mimeCode")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String mimeCode;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "schemaID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String schemaID;
    @XmlAttribute(name = "schemaName")
    protected String schemaName;
    @XmlAttribute(name = "schemaAgencyID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String schemaAgencyID;
    @XmlAttribute(name = "schemaAgencyName")
    protected String schemaAgencyName;
    @XmlAttribute(name = "schemaVersionID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String schemaVersionID;
    @XmlAttribute(name = "schemaDataURI")
    @XmlSchemaType(name = "anyURI")
    protected String schemaDataURI;
    @XmlAttribute(name = "schemaURI")
    @XmlSchemaType(name = "anyURI")
    protected String schemaURI;
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
    @XmlAttribute(name = "unitCodeListVersionID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String unitCodeListVersionID;
    @XmlAttribute(name = "filename")
    protected String filename;
    @XmlAttribute(name = "uri")
    @XmlSchemaType(name = "anyURI")
    protected String uri;

    /**
     * Recupera il valore della propriet� value.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Imposta il valore della propriet� value.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Recupera il valore della propriet� currencyID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyID() {
        return currencyID;
    }

    /**
     * Imposta il valore della propriet� currencyID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyID(String value) {
        this.currencyID = value;
    }

    /**
     * Recupera il valore della propriet� currencyCodeListVersionID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCodeListVersionID() {
        return currencyCodeListVersionID;
    }

    /**
     * Imposta il valore della propriet� currencyCodeListVersionID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCodeListVersionID(String value) {
        this.currencyCodeListVersionID = value;
    }

    /**
     * Recupera il valore della propriet� encodingCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncodingCode() {
        return encodingCode;
    }

    /**
     * Imposta il valore della propriet� encodingCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncodingCode(String value) {
        this.encodingCode = value;
    }

    /**
     * Recupera il valore della propriet� format.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormat() {
        return format;
    }

    /**
     * Imposta il valore della propriet� format.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormat(String value) {
        this.format = value;
    }

    /**
     * Recupera il valore della propriet� characterSetCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCharacterSetCode() {
        return characterSetCode;
    }

    /**
     * Imposta il valore della propriet� characterSetCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCharacterSetCode(String value) {
        this.characterSetCode = value;
    }

    /**
     * Recupera il valore della propriet� listID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListID() {
        return listID;
    }

    /**
     * Imposta il valore della propriet� listID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListID(String value) {
        this.listID = value;
    }

    /**
     * Recupera il valore della propriet� listAgencyID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListAgencyID() {
        return listAgencyID;
    }

    /**
     * Imposta il valore della propriet� listAgencyID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListAgencyID(String value) {
        this.listAgencyID = value;
    }

    /**
     * Recupera il valore della propriet� listAgencyName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListAgencyName() {
        return listAgencyName;
    }

    /**
     * Imposta il valore della propriet� listAgencyName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListAgencyName(String value) {
        this.listAgencyName = value;
    }

    /**
     * Recupera il valore della propriet� listName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListName() {
        return listName;
    }

    /**
     * Imposta il valore della propriet� listName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListName(String value) {
        this.listName = value;
    }

    /**
     * Recupera il valore della propriet� listVersionID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListVersionID() {
        return listVersionID;
    }

    /**
     * Imposta il valore della propriet� listVersionID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListVersionID(String value) {
        this.listVersionID = value;
    }

    /**
     * Recupera il valore della propriet� languageID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageID() {
        return languageID;
    }

    /**
     * Imposta il valore della propriet� languageID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguageID(String value) {
        this.languageID = value;
    }

    /**
     * Recupera il valore della propriet� languageLocaleID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageLocaleID() {
        return languageLocaleID;
    }

    /**
     * Imposta il valore della propriet� languageLocaleID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguageLocaleID(String value) {
        this.languageLocaleID = value;
    }

    /**
     * Recupera il valore della propriet� listURI.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListURI() {
        return listURI;
    }

    /**
     * Imposta il valore della propriet� listURI.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListURI(String value) {
        this.listURI = value;
    }

    /**
     * Recupera il valore della propriet� listSchemaURI.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListSchemaURI() {
        return listSchemaURI;
    }

    /**
     * Imposta il valore della propriet� listSchemaURI.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListSchemaURI(String value) {
        this.listSchemaURI = value;
    }

    /**
     * Recupera il valore della propriet� mimeCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMimeCode() {
        return mimeCode;
    }

    /**
     * Imposta il valore della propriet� mimeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMimeCode(String value) {
        this.mimeCode = value;
    }

    /**
     * Recupera il valore della propriet� name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Imposta il valore della propriet� name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Recupera il valore della propriet� schemaID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemaID() {
        return schemaID;
    }

    /**
     * Imposta il valore della propriet� schemaID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemaID(String value) {
        this.schemaID = value;
    }

    /**
     * Recupera il valore della propriet� schemaName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemaName() {
        return schemaName;
    }

    /**
     * Imposta il valore della propriet� schemaName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemaName(String value) {
        this.schemaName = value;
    }

    /**
     * Recupera il valore della propriet� schemaAgencyID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemaAgencyID() {
        return schemaAgencyID;
    }

    /**
     * Imposta il valore della propriet� schemaAgencyID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemaAgencyID(String value) {
        this.schemaAgencyID = value;
    }

    /**
     * Recupera il valore della propriet� schemaAgencyName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemaAgencyName() {
        return schemaAgencyName;
    }

    /**
     * Imposta il valore della propriet� schemaAgencyName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemaAgencyName(String value) {
        this.schemaAgencyName = value;
    }

    /**
     * Recupera il valore della propriet� schemaVersionID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemaVersionID() {
        return schemaVersionID;
    }

    /**
     * Imposta il valore della propriet� schemaVersionID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemaVersionID(String value) {
        this.schemaVersionID = value;
    }

    /**
     * Recupera il valore della propriet� schemaDataURI.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemaDataURI() {
        return schemaDataURI;
    }

    /**
     * Imposta il valore della propriet� schemaDataURI.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemaDataURI(String value) {
        this.schemaDataURI = value;
    }

    /**
     * Recupera il valore della propriet� schemaURI.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemaURI() {
        return schemaURI;
    }

    /**
     * Imposta il valore della propriet� schemaURI.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemaURI(String value) {
        this.schemaURI = value;
    }

    /**
     * Recupera il valore della propriet� unitCode.
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
     * Imposta il valore della propriet� unitCode.
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
     * Recupera il valore della propriet� unitCodeListID.
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
     * Imposta il valore della propriet� unitCodeListID.
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
     * Recupera il valore della propriet� unitCodeListAgencyID.
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
     * Imposta il valore della propriet� unitCodeListAgencyID.
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
     * Recupera il valore della propriet� unitCodeListAgencyName.
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
     * Imposta il valore della propriet� unitCodeListAgencyName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitCodeListAgencyName(String value) {
        this.unitCodeListAgencyName = value;
    }

    /**
     * Recupera il valore della propriet� unitCodeListVersionID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitCodeListVersionID() {
        return unitCodeListVersionID;
    }

    /**
     * Imposta il valore della propriet� unitCodeListVersionID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitCodeListVersionID(String value) {
        this.unitCodeListVersionID = value;
    }

    /**
     * Recupera il valore della propriet� filename.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilename() {
        return filename;
    }

    /**
     * Imposta il valore della propriet� filename.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilename(String value) {
        this.filename = value;
    }

    /**
     * Recupera il valore della propriet� uri.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUri() {
        return uri;
    }

    /**
     * Imposta il valore della propriet� uri.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUri(String value) {
        this.uri = value;
    }

}
