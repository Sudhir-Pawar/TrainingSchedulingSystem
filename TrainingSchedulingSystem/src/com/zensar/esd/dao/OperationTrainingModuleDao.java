package com.zensar.esd.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.zensar.esd.bean.TrainingModuleBean;
import com.zensar.esd.connection.MakeConnection;

public class OperationTrainingModuleDao implements TrainingInterface<Boolean,TrainingModuleBean>{

	Connection c;
	@Override
	public Boolean insert(TrainingModuleBean p) {
		// TODO Auto-generated method stub
		try {
			c=MakeConnection.getConnection();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int training_Module_Code=p.getTraining_Module_Code();
		String module_Name=p.getModule_Name(); 
		int duration_In_Days=p.getDuration_In_Days();
		double budget=p.getBudget();
		try {
			PreparedStatement ps=c.prepareStatement("insert into TrainingModule values(?,?,?,?)");
			ps.setInt(1,training_Module_Code);
			ps.setString(2,module_Name);
			ps.setInt(3,duration_In_Days);
			ps.setDouble(4,budget);
			int count=ps.executeUpdate();
			if(count>0)
				return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
