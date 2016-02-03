package com.caletre.quadraticequation;

import com.caletre.quadraticequation.service.QuadraticEquationSolver;
import com.caletre.quadraticequation.service.SimpleQuadraticEquationSolver;

public class QuadraticEquationApplication {
	public static void main(String[] args){
		QuadraticEquationSolver solver = new SimpleQuadraticEquationSolver();
		System.out.println(solver.solve(1, 2, 3));
	}
}
