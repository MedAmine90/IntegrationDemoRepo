package edu.esprit.integration.demo.services;

import javax.ejb.LocalBean;
import javax.ejb.Stateful;

@Stateful
@LocalBean
public class CalculatorService {
	public int addition(int a, int b){
		return a+b;
	}
	public int soustraction(int a, int b){
		return a-b;
	}
	public int multiplication(int a, int b){
		return a*b;
	}
	public int division(int a, int b){
		return a/b;
	}

}
