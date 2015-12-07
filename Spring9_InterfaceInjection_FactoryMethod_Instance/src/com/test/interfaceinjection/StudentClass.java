package com.test.interfaceinjection;

public class StudentClass implements StudentInterface
{
	public void insertStudent()
	{
		System.out.println("Student is inserted....");
	}
	
	public void deleteStudent()
	{
		System.out.println("Student is deleted....");
	}
	
}
