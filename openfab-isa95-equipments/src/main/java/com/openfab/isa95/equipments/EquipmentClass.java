package com.openfab.isa95.equipments;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Document
@Data
@EqualsAndHashCode(callSuper=true)
public class EquipmentClass extends AbstractEquipment{

}
