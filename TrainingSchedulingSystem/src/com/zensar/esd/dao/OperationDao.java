package com.zensar.esd.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.zensar.esd.bean.TrainingProgramBean;
import com.zensar.esd.connection.MakeConnection;

public class OperationDao implements TrainingDisplayInterface<Integer,TrainingProgramBean,Double>{

	Connection c;
	double budget=0;
	@Override
	public Double displayTotalFinancialBudget() {
		// TODO Auto-generated method stub
		budget = 0;
		ResultSet rs = null;
		try {
			c=MakeConnection.getConnection();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			PreparedStatement pr=c.prepareStatement("select sum(TrainingModule.Budget) from TrainingModule NATURAL JOIN link_tm_tp");
			rs=pr.executeQuery();
			while(rs.next())
			budget=rs.getDouble(1);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return budget;
	}

	@Override
	public Double displayMonthBudget(TrainingProgramBean p) {
		// TODO Auto-generated method stub
		
		try {
			c=MakeConnection.getConnection();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		budget = 0;
		PreparedStatement pr;
		try {
			pr = c.prepareStatement("select sum(TrainingModule.Budget) from link_tm_tp natural join TrainingModule  natural join TrainingProgram  WHERE execution_month=?");
		
		pr.setString(1,p.getExecution_Month());
		ResultSet rs=pr.executeQuery();
			while(rs.next())
				budget=rs.getInt(1);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return budget;
	
	}

	@Override
	public Integer displayModuleCount(TrainingProgramBean p) {
		// TODO Auto-generated method stub
		try {
			c=MakeConnection.getConnection();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int count = 0;
		PreparedStatement pr;
		try {
			pr = c.prepareStatement("select count(training_module_code) from link_tm_tp natural join TrainingModule  natural join TrainingProgram where training_program_code=?");
			pr.setInt(1,p.getTraining_Program_code());
			ResultSet rs =pr.executeQuery();
			
			while(rs.next())
				count =rs.getInt(1);
			
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return count;
	}

	}


