package com.zensar.esd.dao;

public interface TrainingDisplayInterface <T,P,Q>{
	public Q displayTotalFinancialBudget();
	public Q displayMonthBudget(P p);
	public T displayModuleCount(P p);
	
}
