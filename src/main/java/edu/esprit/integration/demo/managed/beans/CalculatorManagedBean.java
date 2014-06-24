package edu.esprit.integration.demo.managed.beans;

import java.util.ArrayList;
import java.util.List;

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
	private int c;
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}

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
	public int calcul(int a, int b ,int c) {
		
		switch (c) {
        case 1:
			return calc.addition(a, b);
		case 2:
			return calc.soustraction(a, b);
		case 3:
			return calc.multiplication(a, b);		 
		case 4:
			return calc.division(a, b);
		default:
            return  0;
    }
	}
	
}
