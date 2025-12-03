package com.sprk.main;

import com.sprk.connection.DbConnection;
import com.sprk.dao.StudentDao;

public class TestMain {
	
	public static void main(String[] args) {
		try {
			StudentDao studentDao =  new StudentDao(DbConnection.getConnection("root", "root", "jdbc:mysql://localhost:3306/jdbc_demo"));
			
			
			
			studentDao.testConnection();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

}
