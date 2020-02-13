package com.zensar.esd.bean;

public class TrainingLink_TM_TPBean {
	
	private int trainingModuleCode;
	private int trainingProgramCode;
	public int getTrainingModuleCode() {
		return trainingModuleCode;
	}
	public void setTrainingModuleCode(int trainingModuleCode) {
		this.trainingModuleCode = trainingModuleCode;
	}
	public int getTrainingProgramCode() {
		return trainingProgramCode;
	}
	public void setTrainingProgramCode(int trainingProgramCode) {
		this.trainingProgramCode = trainingProgramCode;
	}
	public TrainingLink_TM_TPBean(int trainingModuleCode, int trainingProgramCode) {
		super();
		this.trainingModuleCode = trainingModuleCode;
		this.trainingProgramCode = trainingProgramCode;
	}
	
	

}
