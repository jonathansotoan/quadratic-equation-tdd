package com.caletre.quadraticequation.test.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.caletre.quadraticequation.model.QuadraticResult;
import com.caletre.quadraticequation.service.QuadraticEquationSolver;
import com.caletre.quadraticequation.service.SimpleQuadraticEquationSolver;

@RunWith(Parameterized.class)
public class SimpleQuadraticEquationSolverParameterizedTest {
	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][]{
			{-24, -64, -4, -0.06403781568934841, -2.602628850977318},
			{-751, -751, -2, -0.002670246059557846, -0.9973297539404422},
			{-13, -91, -5, -0.055383241145015916, -6.944616758854984},
			{-13, -314, -64, -0.20557125487516714, -23.948274898970986}
		});
	}

	@Parameter(value = 0)
	public double aParam;
	
	@Parameter(value = 1)
	public double bParam;
	
	@Parameter(value = 2)
	public double cParam;
	
	@Parameter(value = 3)
	public double negativeResult;
	
	@Parameter(value = 4)
	public double positiveResult;
	

	@Test
	public void testNegativeNumbersCalculatesWell(){
		// Arrange
		QuadraticEquationSolver simpleQuadraticEquationSolver =
				new SimpleQuadraticEquationSolver();
		
		// Act
		QuadraticResult quadraticResult1 =
				simpleQuadraticEquationSolver.solve(aParam, bParam, cParam);
		
		// Assert
		assertNotNull(quadraticResult1);
		assertEquals(negativeResult, quadraticResult1.getNegativeResult(), 0.01);
		assertEquals(positiveResult, quadraticResult1.getPositiveResult(), 0.01);
	}

}
