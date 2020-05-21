package com.zensar.esd.bean;

public class TrainingModuleBean {
	int training_Module_Code;
	String module_Name; 
	int duration_In_Days;
	double budget;
	
	
	public TrainingModuleBean(int training_Module_Code, String module_Name, int duration_In_Days, double budget) {
		super();
		this.training_Module_Code = training_Module_Code;
		this.module_Name = module_Name;
		this.duration_In_Days = duration_In_Days;
		this.budget = budget;
	}
	public int getTraining_Module_Code() {
		return training_Module_Code;
	}
	public void setTraining_Module_Code(int training_Module_Code) {
		this.training_Module_Code = training_Module_Code;
	}
	public String getModule_Name() {
		return module_Name;
	}
	public void setModule_Name(String module_Name) {
		this.module_Name = module_Name;
	}
	public int getDuration_In_Days() {
		return duration_In_Days;
	}
	public void setDuration_In_Days(int duration_In_Days) {
		this.duration_In_Days = duration_In_Days;
	}
	public double getBudget() {
		return budget;
	}
	public void setBudget(double budget) {
		this.budget = budget;
	}
	@Override
	public String toString() {
		return "TrainingModuleBean [training_Module_Code=" + training_Module_Code + ", module_Name=" + module_Name
				+ ", duration_In_Days=" + duration_In_Days + ", budget=" + budget + "]";
	}
	
	
}
