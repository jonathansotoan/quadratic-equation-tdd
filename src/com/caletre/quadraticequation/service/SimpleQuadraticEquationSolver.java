package com.caletre.quadraticequation.service;

import com.caletre.quadraticequation.model.QuadraticResult;

/**
 * Represents a solver for the quadratic equation that does not take into
 * account complex numbers.
 * @author Jonathan Soto
 * @see SimpleQuadraticEquationSolver
 */
public class SimpleQuadraticEquationSolver implements QuadraticEquationSolver {

	@Override
	public QuadraticResult solve(int a, int b, int c) {
		if(b * b - 4 * a * c < 0) {
			QuadraticResult result = new QuadraticResult();
			result.setNegativeResult(0);
			result.setPositiveResult(0);
			
			return result;
		} else {
			return null;
		}
	}
}
