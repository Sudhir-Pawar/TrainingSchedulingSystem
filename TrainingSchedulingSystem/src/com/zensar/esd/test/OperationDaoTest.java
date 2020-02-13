package com.zensar.esd.test;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.zensar.esd.bean.TrainingProgramBean;
import com.zensar.esd.dao.OperationDao;

public class OperationDaoTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void testDisplayTotalFinancialBudget() {
		//double budget=new OperationDao().displayTotalFinancialBudget();
		assertEquals(210000,(int)(double)new OperationDao().displayTotalFinancialBudget());
		
	}

	@Test
	public void testDisplayMonthBudget() {
		//fail("Not yet implemented");
		assertEquals(205000,(int)(double)new OperationDao().displayMonthBudget(TrainingProgramBean.createTrainingProgramObjectForMonth("jan")));
	}

	@Test
	public void testDisplayModuleCount() {
		assertEquals(4,(int)(double)new OperationDao().displayModuleCount(TrainingProgramBean.createTrainingProgramObjectForCode(2001)));
	}

}
