package com.caletre.quadraticequation.test.service;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

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
	
	@Test
	public void testSquareRootBeingNegativeReturnsZeroInBothResults(){
		// Arrange
		QuadraticEquationSolver simpleQuadraticEquationSolver =
				new SimpleQuadraticEquationSolver();
		
		// Act
		QuadraticResult quadraticResult =
				simpleQuadraticEquationSolver.solve(1, 2, 2);
		
		// Assert
		assertNotNull(quadraticResult);
		assertEquals(0, quadraticResult.getNegativeResult(), 0);
		assertEquals(0, quadraticResult.getPositiveResult(), 0);
	}
	
	@Test
	public void testSquareRootBeingZeroCalculatesSameResult(){
		// Arrange
		QuadraticEquationSolver simpleQuadraticEquationSolver =
				new SimpleQuadraticEquationSolver();
		
		// Act
		QuadraticResult quadraticResult =
				simpleQuadraticEquationSolver.solve(1, 2, 1);
		
		// Assert
		assertNotNull(quadraticResult);
		assertEquals(-1, quadraticResult.getNegativeResult(), 0);
		assertEquals(-1, quadraticResult.getPositiveResult(), 0);
	}
}
