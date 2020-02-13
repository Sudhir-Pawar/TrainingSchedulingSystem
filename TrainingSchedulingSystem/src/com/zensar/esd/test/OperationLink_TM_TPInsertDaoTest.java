package com.zensar.esd.test;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.zensar.esd.bean.TrainingLink_TM_TPBean;
import com.zensar.esd.dao.OperationLink_TM_TPDao;

public class OperationLink_TM_TPInsertDaoTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void testInsert() {
		
		TrainingLink_TM_TPBean tlb=new TrainingLink_TM_TPBean(2001,1010);
		OperationLink_TM_TPDao old=new OperationLink_TM_TPDao();
		assertEquals(true,old.insert(tlb));
	}

}
