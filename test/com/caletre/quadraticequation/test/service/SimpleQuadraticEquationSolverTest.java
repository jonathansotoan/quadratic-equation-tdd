package com.caletre.quadraticequation.test.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.caletre.quadraticequation.model.QuadraticResult;
import com.caletre.quadraticequation.service.QuadraticEquationSolver;
import com.caletre.quadraticequation.service.SimpleQuadraticEquationSolver;

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

	@Test
	public void testEquallyBigNumbersCalculatesWell(){
		// Arrange
		QuadraticEquationSolver simpleQuadraticEquationSolver =
				new SimpleQuadraticEquationSolver();
		
		// Act
		QuadraticResult quadraticResult1 =
				simpleQuadraticEquationSolver.solve(6703, 9841790, 3151638);
		QuadraticResult quadraticResult2 =
				simpleQuadraticEquationSolver.solve(15613, 25161353, 13513612);
		
		// Assert
		assertNotNull(quadraticResult1);
		assertEquals(-1467.9461478, quadraticResult1.getNegativeResult(), 0.01);
		assertEquals(-0.3203000343, quadraticResult1.getPositiveResult(), 0.01);
		
		assertNotNull(quadraticResult2);
		assertEquals(-1611.0270161, quadraticResult2.getNegativeResult(), 0.01);
		assertEquals(-0.5372572222, quadraticResult2.getPositiveResult(), 0.01);
	}

	@Test
	public void testEquallySmallNumbersCalculatesWell(){
		// Arrange
		QuadraticEquationSolver simpleQuadraticEquationSolver =
				new SimpleQuadraticEquationSolver();
		
		// Act
		QuadraticResult quadraticResult1 =
				simpleQuadraticEquationSolver.solve(0.6703, 9.841790, 31.51638);
		QuadraticResult quadraticResult2 =
				simpleQuadraticEquationSolver.solve(0.05613, 10.0251613, 1.135);
		
		// Assert
		assertNotNull(quadraticResult1);
		assertEquals(-9.9637049993, quadraticResult1.getNegativeResult(), 0.01);
		assertEquals(-4.7189594792, quadraticResult1.getPositiveResult(), 0.01);
		
		assertNotNull(quadraticResult2);
		assertEquals(-178.49283011, quadraticResult2.getNegativeResult(), 0.01);
		assertEquals(-0.1132869915, quadraticResult2.getPositiveResult(), 0.01);
	}

	// Assert
	@Test(expected = IllegalArgumentException.class)
	public void testAIsNotANumberThrowsAnException(){
		// Arrange
		QuadraticEquationSolver simpleQuadraticEquationSolver =
				new SimpleQuadraticEquationSolver();
		
		// Act
		simpleQuadraticEquationSolver.solve(Double.NaN, 1, 1);
	}

	// Assert
	@Test(expected = IllegalArgumentException.class)
	public void testBIsNotANumberThrowsAnException(){
		// Arrange
		QuadraticEquationSolver simpleQuadraticEquationSolver =
				new SimpleQuadraticEquationSolver();
		
		// Act
		simpleQuadraticEquationSolver.solve(1, Double.NaN, 1);
	}

	// Assert
	@Test(expected = IllegalArgumentException.class)
	public void testCIsNotANumberThrowsAnException(){
		// Arrange
		QuadraticEquationSolver simpleQuadraticEquationSolver =
				new SimpleQuadraticEquationSolver();
		
		// Act
		simpleQuadraticEquationSolver.solve(1, 1, Double.NaN);
	}
}
