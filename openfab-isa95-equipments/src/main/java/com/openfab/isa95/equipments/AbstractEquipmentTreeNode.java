package com.openfab.isa95.equipments;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class AbstractEquipmentTreeNode {

	AbstractEquipment node;

	List<AbstractEquipmentTreeNode> children = new ArrayList<AbstractEquipmentTreeNode>();

	public AbstractEquipmentTreeNode(AbstractEquipment equipment) {
		super();
		this.node = equipment;
	}

}
