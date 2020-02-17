package br.com.app.lines;

public class NavegacaoTest {

	/*
    A value of cell "S" means Source.
    A value of cell "D" means Destination.
    A value of cell "F" means Blank cell.
    A value of cell "X" means Blank Wall.
    */
	public static void teste01() {
		Navegacao path = new Navegacao();

		String[][] matrix1OK = 
		{  
			{"S", "X", "D", "F"}, 
			{"F", "X", "F", "F"}, 
			{"F", "X", "F", "F"}, 
			{"F", "F", "F", "F"}
		}; 
		System.out.println("Achou Caminho? "+path.existeCaminho(matrix1OK));
	}

	public static void teste02() {
		Navegacao path = new Navegacao();
		
		String[][] matrix1OK = 
		{  
			{"S", "X", "D", "F"}, 
			{"F", "X", "F", "F"}, 
			{"F", "X", "F", "F"}, 
			{"F", "F", "F", "F"}
		}; 

		System.out.println("Achou Caminho? "+path.existeCaminho(matrix1OK));
		
		String[][] matrix1Falha = 
		{  
			{"X", "F", "X", "S"}, 
			{"F", "X", "X", "X"}, 
			{"D", "F", "F", "F"}, 
			{"X", "F", "F", "F"}
		}; 
				
		System.out.println("Achou Caminho? "+path.existeCaminho(matrix1Falha));
	
		
		String[][] matrix2OK = 
		{  
			{"S", "X", "F", "F", "F"}, 
			{"F", "X", "F", "X", "F"}, 
			{"F", "X", "F", "X", "F"}, 
			{"F", "X", "F", "X", "F"},
			{"F", "F", "F", "X", "D"}
		}; 
				
		System.out.println("Achou Caminho? "+path.existeCaminho(matrix2OK));
	
		String[][] matrix2Falha = 
		{  
			{"S", "X", "F", "F", "F"}, 
			{"F", "X", "F", "X", "F"}, 
			{"F", "X", "F", "X", "F"}, 
			{"F", "X", "F", "X", "X"},
			{"F", "F", "F", "X", "D"}
		}; 
				
		System.out.println("Achou Caminho? "+path.existeCaminho(matrix2Falha));
		
		String[][] matrix3OK = 
		{  
			{"S", "X", "F", "F", "F", "F"}, 
			{"F", "X", "F", "X", "X", "F"}, 
			{"F", "X", "F", "X", "X", "F"}, 
			{"F", "X", "F", "X", "X", "F"},
			{"F", "X", "F", "X", "X", "F"},
			{"F", "F", "F", "X", "D", "F"}
		}; 
				
		System.out.println("Achou Caminho? "+path.existeCaminho(matrix3OK));
	
		String[][] matrix3Falha = 
		{  
			{"S", "X", "F", "F", "F", "F"}, 
			{"F", "X", "F", "X", "X", "X"}, 
			{"F", "X", "F", "X", "X", "X"}, 
			{"F", "X", "F", "X", "X", "X"},
			{"F", "X", "F", "X", "X", "X"},
			{"F", "F", "F", "X", "D", "X"}
		}; 
				
		System.out.println("Achou Caminho? "+path.existeCaminho(matrix3Falha));
	
		String[][] matrix4OK = 
		{  
			{"F", "F", "F", "X", "F", "F", "F", "F", "F"}, 
			{"F", "X", "F", "X", "F", "X", "X", "X", "F"},
			{"F", "X", "F", "X", "F", "X", "X", "X", "F"},
			{"F", "X", "F", "X", "F", "X", "X", "X", "F"},
			{"F", "X", "F", "X", "F", "X", "X", "X", "F"},
			{"F", "X", "F", "X", "F", "X", "X", "X", "F"},
			{"F", "X", "F", "X", "F", "X", "X", "X", "F"},
			{"F", "X", "F", "X", "F", "X", "X", "X", "F"},
			{"S", "X", "F", "F", "F", "X", "X", "D", "F"},
		}; 
				
		System.out.println("Achou Caminho? "+path.existeCaminho(matrix4OK));
	
		String[][] matrix4Falha = 
		{  
				{"F", "F", "F", "X", "F", "F", "F", "F", "F"}, 
				{"F", "X", "F", "X", "F", "X", "X", "X", "F"},
				{"F", "X", "F", "X", "F", "X", "X", "X", "F"},
				{"F", "X", "F", "X", "F", "X", "X", "X", "F"},
				{"F", "X", "F", "X", "F", "X", "X", "X", "F"},
				{"F", "X", "F", "X", "F", "X", "X", "X", "F"},
				{"F", "X", "F", "X", "F", "X", "X", "X", "F"},
				{"F", "X", "F", "X", "F", "X", "X", "X", "F"},
				{"S", "X", "F", "F", "F", "X", "X", "D", "X"},
		}; 
				
		System.out.println("Achou Caminho? "+path.existeCaminho(matrix4Falha));
	}
	
	public static void main(String[] args) {
		//
		teste01();
		//
		teste02();
	}
}
