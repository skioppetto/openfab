package com.openfab.isa95.equipments;

import org.junit.Assert;
import org.junit.Test;

public class EquipmentLevelEnumTest {

	@Test
	public void testEnterprise() {
		Assert.assertNull(EquipmentLevelEnum.Enterprise.getParents());
	}

	@Test
	public void testSite() {
		Assert.assertNotNull(EquipmentLevelEnum.Site.getParents());
		Assert.assertEquals(1, EquipmentLevelEnum.Site.getParents().size());
		Assert.assertTrue(EquipmentLevelEnum.Site.getParents().contains(
				EquipmentLevelEnum.Enterprise));
	}

	@Test
	public void testArea() {
		Assert.assertNotNull(EquipmentLevelEnum.Area.getParents());
		Assert.assertEquals(1, EquipmentLevelEnum.Area.getParents().size());
		Assert.assertTrue(EquipmentLevelEnum.Area.getParents().contains(
				EquipmentLevelEnum.Site));
	}

	@Test
	public void testProcessCell() {
		Assert.assertNotNull(EquipmentLevelEnum.ProcessCell.getParents());
		Assert.assertEquals(1, EquipmentLevelEnum.ProcessCell.getParents()
				.size());
		Assert.assertTrue(EquipmentLevelEnum.ProcessCell.getParents().contains(
				EquipmentLevelEnum.Area));
	}

	@Test
	public void testProductionUnit() {
		Assert.assertNotNull(EquipmentLevelEnum.ProductionUnit.getParents());
		Assert.assertEquals(1, EquipmentLevelEnum.ProductionUnit.getParents()
				.size());
		Assert.assertTrue(EquipmentLevelEnum.ProductionUnit.getParents()
				.contains(EquipmentLevelEnum.Area));
	}

	@Test
	public void testProductionLine() {
		Assert.assertNotNull(EquipmentLevelEnum.ProductionLine.getParents());
		Assert.assertEquals(1, EquipmentLevelEnum.ProductionLine.getParents()
				.size());
		Assert.assertTrue(EquipmentLevelEnum.ProductionLine.getParents()
				.contains(EquipmentLevelEnum.Area));
	}

	@Test
	public void testStorageZone() {
		Assert.assertNotNull(EquipmentLevelEnum.StorageZone.getParents());
		Assert.assertEquals(1, EquipmentLevelEnum.StorageZone.getParents()
				.size());
		Assert.assertTrue(EquipmentLevelEnum.StorageZone.getParents().contains(
				EquipmentLevelEnum.Area));
	}

	@Test
	public void testWorkCenter() {
		Assert.assertNotNull(EquipmentLevelEnum.WorkCenter.getParents());
		Assert.assertEquals(1, EquipmentLevelEnum.WorkCenter.getParents()
				.size());
		Assert.assertTrue(EquipmentLevelEnum.WorkCenter.getParents().contains(
				EquipmentLevelEnum.Area));
	}

	@Test
	public void testWorkUnit() {
		Assert.assertNotNull(EquipmentLevelEnum.WorkUnit.getParents());
		Assert.assertEquals(1, EquipmentLevelEnum.WorkUnit.getParents().size());
		Assert.assertTrue(EquipmentLevelEnum.WorkUnit.getParents().contains(
				EquipmentLevelEnum.WorkCenter));
	}

	@Test
	public void testUnit() {
		Assert.assertNotNull(EquipmentLevelEnum.Unit.getParents());
		Assert.assertEquals(2, EquipmentLevelEnum.Unit.getParents().size());
		Assert.assertTrue(EquipmentLevelEnum.Unit.getParents().contains(
				EquipmentLevelEnum.ProcessCell));
		Assert.assertTrue(EquipmentLevelEnum.Unit.getParents().contains(
				EquipmentLevelEnum.ProductionUnit));
	}

	@Test
	public void testWorkCell() {
		Assert.assertNotNull(EquipmentLevelEnum.WorkCell.getParents());
		Assert.assertEquals(1, EquipmentLevelEnum.WorkCell.getParents().size());
		Assert.assertTrue(EquipmentLevelEnum.WorkCell.getParents().contains(
				EquipmentLevelEnum.ProductionLine));
	}

	@Test
	public void testStorageUnit() {
		Assert.assertNotNull(EquipmentLevelEnum.StorageUnit.getParents());
		Assert.assertEquals(1, EquipmentLevelEnum.StorageUnit.getParents()
				.size());
		Assert.assertTrue(EquipmentLevelEnum.StorageUnit.getParents().contains(
				EquipmentLevelEnum.StorageZone));
	}
	
	@Test
	public void testEquipmentModule() {
		Assert.assertNotNull(EquipmentLevelEnum.EquipmentModule.getParents());
		Assert.assertEquals(2, EquipmentLevelEnum.EquipmentModule.getParents().size());
		Assert.assertTrue(EquipmentLevelEnum.EquipmentModule.getParents().contains(
				EquipmentLevelEnum.EquipmentModule));
		Assert.assertTrue(EquipmentLevelEnum.EquipmentModule.getParents().contains(
				EquipmentLevelEnum.Unit));
	}
	
	@Test
	public void testControlModule() {
		Assert.assertNotNull(EquipmentLevelEnum.ControlModule.getParents());
		Assert.assertEquals(2, EquipmentLevelEnum.ControlModule.getParents().size());
		Assert.assertTrue(EquipmentLevelEnum.ControlModule.getParents().contains(
				EquipmentLevelEnum.ControlModule));
		Assert.assertTrue(EquipmentLevelEnum.ControlModule.getParents().contains(
				EquipmentLevelEnum.EquipmentModule));
	}

}
