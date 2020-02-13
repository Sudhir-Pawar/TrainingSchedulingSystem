package com.zensar.esd.test;

import java.sql.Connection;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.zensar.esd.bean.TrainingModuleBean;
import com.zensar.esd.connection.MakeConnection;
import com.zensar.esd.dao.OperationTrainingModuleDao;

public class OperationTrainingModuleDaoTest {
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		Connection c=MakeConnection.getConnection();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void testInsert() {
		TrainingModuleBean tmb=new TrainingModuleBean(1010,"core java",10,100000);
		OperationTrainingModuleDao otm=new OperationTrainingModuleDao();
		if(otm.insert(tmb))
			System.out.println("success");
		
	}

}
