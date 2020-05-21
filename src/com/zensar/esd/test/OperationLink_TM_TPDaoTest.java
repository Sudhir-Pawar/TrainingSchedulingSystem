package com.zensar.esd.test;

import static org.junit.Assert.assertEquals;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.zensar.esd.dao.OperationLink_TM_TPDao;

public class OperationLink_TM_TPDaoTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void testDisplayTotalFinancialBudget() {
		OperationLink_TM_TPDao old=new OperationLink_TM_TPDao();
		ResultSet rs=old.displayTotalFinancialBudget();
		try {
			while(rs.next())
				assertEquals(110000,rs.getInt(1));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void testDisplayMonthBudget() {
		OperationLink_TM_TPDao old=new OperationLink_TM_TPDao();
		int budget=old.displayMonthBudget("jan");
		assertEquals(105000,budget);
		System.out.println(budget);
	}

}
