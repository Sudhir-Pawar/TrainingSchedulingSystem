package com.zensar.esd.test;

import java.sql.Connection;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.zensar.esd.bean.TrainingProgramBean;
import com.zensar.esd.connection.MakeConnection;
import com.zensar.esd.dao.OperationTrainingProgramDao;

public class OperationTrainingProgramDaoTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		Connection c=MakeConnection.getConnection();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void testInsert() {
	
		TrainingProgramBean tpb=new TrainingProgramBean(2001,"esd","jan");
		OperationTrainingProgramDao opd=new OperationTrainingProgramDao();
		if(opd.insert(tpb))
			System.out.println("succues");
	}

}
