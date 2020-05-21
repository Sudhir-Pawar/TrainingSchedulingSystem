package com.zensar.esd.bean;

public class TrainingProgramBean {

	int training_Program_code;
	String program_Name;
	String execution_Month;
	public TrainingProgramBean(int training_Program_code, String program_Name, String execution_Month) {
		super();
		this.training_Program_code = training_Program_code;
		this.program_Name = program_Name;
		this.execution_Month = execution_Month;
	}
	public int getTraining_Program_code() {
		return training_Program_code;
	}
	public void setTraining_Program_code(int training_Program_code) {
		this.training_Program_code = training_Program_code;
	}
	public String getProgram_Name() {
		return program_Name;
	}
	public void setProgram_Name(String program_Name) {
		this.program_Name = program_Name;
	}
	public String getExecution_Month() {
		return execution_Month;
	}
	public void setExecution_Month(String execution_Month) {
		this.execution_Month = execution_Month;
	}
	@Override
	public String toString() {
		return "TrainingProgramBean [training_Program_code=" + training_Program_code + ", program_Name=" + program_Name
				+ ", execution_Month=" + execution_Month + "]";
	}
	
	
}
