package com.zensar.esd.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.zensar.esd.bean.TrainingProgramBean;
import com.zensar.esd.connection.MakeConnection;

public class OperationTrainingProgramDao implements TrainingInterface<Boolean,TrainingProgramBean>{

	Connection c;
	@Override
	public Boolean insert(TrainingProgramBean p) {
		// TODO Auto-generated method stub
		try {
			c=MakeConnection.getConnection();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int training_Program_code=p.getTraining_Program_code();
		String program_Name=p.getProgram_Name();
		String execution_Month=p.getExecution_Month();
		try{
		PreparedStatement ps=c.prepareStatement("Insert into TrainingProgram values(?,?,?)");
		ps.setInt(1, training_Program_code);
		ps.setString(2,program_Name );
		ps.setString(3, execution_Month);
		int count=ps.executeUpdate();
		if(count >0)
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
