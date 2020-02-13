package com.zensar.esd.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.zensar.esd.bean.TrainingLink_TM_TPBean;
import com.zensar.esd.connection.MakeConnection;

public class OperationLink_TM_TPDao implements TrainingInterface<Boolean,TrainingLink_TM_TPBean>{
	Connection c;
	@Override
	public Boolean insert(TrainingLink_TM_TPBean p) {
		try {
			c=MakeConnection.getConnection();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try{
			PreparedStatement pr=c.prepareStatement("insert into Link_TM_TP VALUES(?,?)");
			pr.setInt(1,p.getTrainingProgramCode());
			pr.setInt(2,p.getTrainingModuleCode());
			int count =pr.executeUpdate();
			if(count > 0)
				return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
}
