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
	public QuadraticResult solve(double a, double b, double c) {
		if(a == 0) {
			return null;
		}
		
		double sqrtInnerExpressionValue = (b * b) - (4 * a * c);
		
		if(sqrtInnerExpressionValue < 0) {
			QuadraticResult result = new QuadraticResult();
			result.setNegativeResult(0);
			result.setPositiveResult(0);
			
			return result;
		}
		
		QuadraticResult result = new QuadraticResult();
		double sqrtExpressionValue = Math.sqrt(sqrtInnerExpressionValue);
		double denominatorValue = 2 * a;
		result.setNegativeResult((-b - sqrtExpressionValue) / denominatorValue);
		result.setPositiveResult((-b + sqrtExpressionValue) / denominatorValue);
		
		return result;
	}
}
