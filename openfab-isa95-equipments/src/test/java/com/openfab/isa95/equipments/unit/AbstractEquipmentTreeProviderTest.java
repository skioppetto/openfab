package com.openfab.isa95.equipments.unit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.openfab.isa95.equipments.AbstractEquipment;
import com.openfab.isa95.equipments.AbstractEquipmentTreeNode;
import com.openfab.isa95.equipments.AbstractEquipmentTreeProvider;
import com.openfab.isa95.equipments.Equipment;

public class AbstractEquipmentTreeProviderTest {

	List<AbstractEquipment> nodes = null;
	private AbstractEquipmentTreeProvider provider;

	@Before
	public void buildNodeList() {
		AbstractEquipment root = new Equipment();
		root.setID("root");
		AbstractEquipment node1_root = new Equipment();
		node1_root.setID("node1");
		node1_root.setParentID("root");
		AbstractEquipment node2_root = new Equipment();
		node2_root.setID("node2");
		node2_root.setParentID("root");
		AbstractEquipment node3_node1 = new Equipment();
		node3_node1.setID("node3");
		node3_node1.setParentID("node1");
		AbstractEquipment node4_node1 = new Equipment();
		node4_node1.setID("node4");
		node4_node1.setParentID("node1");
		AbstractEquipment node5_node2 = new Equipment();
		node5_node2.setID("node5");
		node5_node2.setParentID("node2");
		nodes = Arrays.asList(root, node1_root, node2_root, node3_node1,
				node4_node1, node5_node2);
		provider = AbstractEquipmentTreeProvider.getInstance(nodes);
	}

	@Test
	public void testTreeRoot() {
		Assert.assertEquals(provider.getRoot().getID(), "root");
	}

	@Test
	public void testChildren() {

		AbstractEquipmentTreeNode root = provider.asTree();

		List<String> chidldrenIDs = new ArrayList<String>();

		// root children
		root.getChildren().forEach(
				child -> chidldrenIDs.add(child.getNode().getID()));
		Assert.assertTrue(chidldrenIDs.stream().allMatch(
				childID -> Arrays.asList("node1", "node2").contains(childID)));

		// node1 children
		chidldrenIDs.clear();
		Optional<AbstractEquipmentTreeNode> node1 = root.getChildren().stream()
				.filter(child -> "node1".equals(child.getNode().getID()))
				.findFirst();
		Assert.assertTrue(node1.isPresent());
		Assert.assertEquals(2, node1.get().getChildren().size());
		node1.get().getChildren()
				.forEach(child -> chidldrenIDs.add(child.getNode().getID()));

		Assert.assertTrue(chidldrenIDs.stream().allMatch(
				childID -> Arrays.asList("node3", "node4").contains(childID)));

		// node3 and node4 leafs
		Optional<AbstractEquipmentTreeNode> node3 = node1.get().getChildren()
				.stream()
				.filter(child -> "node3".equals(child.getNode().getID()))
				.findFirst();
		Assert.assertTrue(node3.isPresent());
		Assert.assertNull(node3.get().getChildren());

		Optional<AbstractEquipmentTreeNode> node4 = node1.get().getChildren()
				.stream()
				.filter(child -> "node4".equals(child.getNode().getID()))
				.findFirst();
		Assert.assertTrue(node4.isPresent());
		Assert.assertNull(node4.get().getChildren());

		// node2 children
		chidldrenIDs.clear();
		Optional<AbstractEquipmentTreeNode> node2 = root.getChildren().stream()
				.filter(child -> "node2".equals(child.getNode().getID()))
				.findFirst();
		Assert.assertTrue(node2.isPresent());
		Assert.assertEquals(1, node2.get().getChildren().size());
		node2.get().getChildren()
				.forEach(child -> chidldrenIDs.add(child.getNode().getID()));
		Assert.assertTrue(chidldrenIDs.stream().allMatch(
				childID -> Arrays.asList("node5").contains(childID)));

		// node5 leaf
		Optional<AbstractEquipmentTreeNode> node5 = node2.get().getChildren()
				.stream()
				.filter(child -> "node5".equals(child.getNode().getID()))
				.findFirst();
		Assert.assertTrue(node5.isPresent());
		Assert.assertNull(node5.get().getChildren());

	}
}
