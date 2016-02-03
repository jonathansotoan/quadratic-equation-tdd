package com.caletre.quadraticequation.service;

import com.caletre.quadraticequation.model.QuadraticResult;

/**
 * Represents a solver for the quadratic equation
 * @author Jonathan Soto
 * @see SimpleQuadraticEquationSolver
 */
public interface QuadraticEquationSolver {
	
	/**
	 * Calculates the two possible solutions of the classic quadratic equation.
	 * @param a second-order multiplier of the polynomial expression
	 * @param b first-order multiplier of the polynomial expression
	 * @param c constant of the polynomial expression
	 * @throws IllegalArgumentException when a is 0
	 */
	QuadraticResult solve(double a, double b, double c);
}
