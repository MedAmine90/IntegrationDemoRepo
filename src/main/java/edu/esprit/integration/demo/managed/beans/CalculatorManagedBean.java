package edu.esprit.integration.demo.managed.beans;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import edu.esprit.integration.demo.services.CalculatorService;

@ManagedBean
@SessionScoped
public class CalculatorManagedBean {
	@EJB
	private CalculatorService calc;
	private int a;
	private int b;
	public CalculatorService getCalc() {
		return calc;
	}
	public void setCalc(CalculatorService calc) {
		this.calc = calc;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int add(){
		 
		return calc.addition(a, b);
	}
	public int sous(){
		 
		return calc.soustraction(a, b);
	}
	public int mult(){
		 
		return calc.multiplication(a, b);
	}
	public int div(){
		 
		return calc.division(a, b);
	}
	
}
