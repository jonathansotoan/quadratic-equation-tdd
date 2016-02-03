package com.caletre.quadraticequation.model;

import com.caletre.quadraticequation.service.QuadraticEquationSolver;

/**
 * Holds the two possible results of the calculation of the quadratic equation
 * @author Jonathan Soto
 * @see QuadraticEquationSolver
 */
public class QuadraticResult {
	private int negativeResult;
	private int positiveResult;
	
	/**
	 * Retrieves the calculated number of the quadratic equation when doing it
	 * with the negative sign. Note that it does not mean that this number is
	 * always less or equal than zero. 
	 * @return a number calculated when the quadratic equation was evaluated
	 * with the negative sign
	 */
	public int getNegativeResult() {
		return negativeResult;
	}
	
	/**
	 * Sets the result of the quadratic equation when it is evaluated with the
	 * minus sign. This number does not have to be negative.
	 * @param negativeResult the resultant number when the quadratic equation
	 * is evaluated with the minus sign
	 */
	public void setNegativeResult(int negativeSolution) {
		this.negativeResult = negativeSolution;
	}
	
	/**
	 * Retrieves the calculated number of the quadratic equation when doing it
	 * with the positive sign. Note that it does not mean that this number is
	 * always greater or equal than zero. 
	 * @return a number calculated when the quadratic equation was evaluated
	 * with the negative sign
	 */
	public int getPositiveResult() {
		return positiveResult;
	}
	
	/**
	 * Sets the result of the quadratic equation when it is evaluated with the
	 * plus sign. This number does not have to be positive.
	 * @param positiveSolution the resultant number when the quadratic equation
	 * is evaluated with the plus sign
	 */
	public void setPositiveResult(int positiveSolution) {
		this.positiveResult = positiveSolution;
	}
}
