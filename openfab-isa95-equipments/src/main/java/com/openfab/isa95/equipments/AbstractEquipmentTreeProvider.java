package com.openfab.isa95.equipments;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AbstractEquipmentTreeProvider {

	private List<? extends AbstractEquipment> nodes;
	private Set<? extends AbstractEquipment> children;

	private AbstractEquipmentTreeProvider(
			List<? extends AbstractEquipment> _nodes) {
		super();
		this.nodes = _nodes;

	}

	public static AbstractEquipmentTreeProvider getInstance(
			List<? extends AbstractEquipment> nodes) {
		return new AbstractEquipmentTreeProvider(nodes);
	}

	public AbstractEquipmentTreeNode asTree() {
		this.children = new HashSet<AbstractEquipment>(nodes);
		AbstractEquipment root = getRoot();
		AbstractEquipmentTreeNode rootNode = new AbstractEquipmentTreeNode(root);
		children.remove(root);
		appendChildren(rootNode);
		this.children = null;
		return rootNode;

	}

	private void appendChildren(AbstractEquipmentTreeNode root) {
		List<AbstractEquipment> childrenToRemove = new ArrayList<AbstractEquipment>();
		children.stream()
				.filter(node -> root.getEquipment().getID()
						.equals(node.getParentID()))
				.forEach(
						child -> {
							root.getChildren().add(
									new AbstractEquipmentTreeNode(child));
							childrenToRemove.add(child);
						});
		children.removeAll(childrenToRemove);
		root.getChildren().forEach(child -> appendChildren(child));
	}

	public final AbstractEquipment getRoot() {
		List<String> IDs = new ArrayList<String>();
		nodes.forEach(node -> IDs.add(node.getID()));
		return nodes
				.stream()
				.filter(node -> null == node.getParentID()
						|| !IDs.contains(node.getParentID())).findFirst()
				.orElse(null);

	}

}
