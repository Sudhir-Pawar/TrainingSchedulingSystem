package com.zensar.esd.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.zensar.esd.connection.MakeConnection;

public class OperationLink_TM_TPDao implements TrainingDisplayInterface<ResultSet>{
	Connection c;
	@Override
	public ResultSet displayTotalFinancialBudget() {
		// TODO Auto-generated method stub
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
				return rs;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return rs;
	}
}
