package com.cg.ems.ExpenseCodeModule.dao;

import org.springframework.data.repository.CrudRepository;

import com.cg.ems.ExpenseCodeModule.model.ExpenseCodeModule;

public interface ExpensesDao extends CrudRepository<ExpenseCodeModule, Integer>{

}
