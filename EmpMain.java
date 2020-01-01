package com.zensar.edb.main;

import java.util.Scanner;

import com.zensar.edb.bean.EmpBean;
import com.zensar.edb.dao.OperationEmpDao;

public class EmpMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id:");
		int id=sc.nextInt();
		System.out.println("Enter name:");
		String name=sc.next();
		System.out.println("Enter salary:");
		double salary=sc.nextDouble();
		
		EmpBean eb=new EmpBean(id,name,salary);
		OperationEmpDao oed=new OperationEmpDao();
		if(oed.insertEmpRecord(eb))
			System.out.println("inserted");
		else
			System.out.println("not inserted");
	}

}
