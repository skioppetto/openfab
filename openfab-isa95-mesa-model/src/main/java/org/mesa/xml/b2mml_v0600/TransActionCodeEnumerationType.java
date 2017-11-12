//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2017.11.12 alle 03:08:18 PM CET 
//


package org.mesa.xml.b2mml_v0600;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per TransActionCodeEnumerationType.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="TransActionCodeEnumerationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Add"/>
 *     &lt;enumeration value="Change"/>
 *     &lt;enumeration value="Delete"/>
 *     &lt;enumeration value="Replaced"/>
 *     &lt;enumeration value="Accepted"/>
 *     &lt;enumeration value="Modified"/>
 *     &lt;enumeration value="Rejected"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TransActionCodeEnumerationType")
@XmlEnum
public enum TransActionCodeEnumerationType {

    @XmlEnumValue("Add")
    ADD("Add"),
    @XmlEnumValue("Change")
    CHANGE("Change"),
    @XmlEnumValue("Delete")
    DELETE("Delete"),
    @XmlEnumValue("Replaced")
    REPLACED("Replaced"),
    @XmlEnumValue("Accepted")
    ACCEPTED("Accepted"),
    @XmlEnumValue("Modified")
    MODIFIED("Modified"),
    @XmlEnumValue("Rejected")
    REJECTED("Rejected");
    private final String value;

    TransActionCodeEnumerationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TransActionCodeEnumerationType fromValue(String v) {
        for (TransActionCodeEnumerationType c: TransActionCodeEnumerationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
