package com.caletre.quadraticequation.test.service;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import com.caletre.quadraticequation.model.QuadraticResult;
import com.caletre.quadraticequation.service.QuadraticEquationSolver;
import com.caletre.quadraticequation.service.SimpleQuadraticEquationSolver;

// TODO Implement all the test cases for the SimpleQuadraticEquationSolver class
public class SimpleQuadraticEquationSolverTest {
	
	@Test
	public void testABeingZeroReturnsNull(){
		// Arrange
		QuadraticEquationSolver simpleQuadraticEquationSolver =
				new SimpleQuadraticEquationSolver();
		
		// Act
		QuadraticResult quadraticResult =
				simpleQuadraticEquationSolver.solve(0, 1, 1);
		
		// Assert
		assertEquals(null, quadraticResult);
	}
}
