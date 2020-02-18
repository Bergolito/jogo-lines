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

		System.out.println("matrix1OK - Achou Caminho? "+path.existeCaminho(matrix1OK));
		
	}
	
	public static void teste03() {
		Navegacao path = new Navegacao();
		String[][] matrix1Falha = 
		{  
			{"X", "F", "X", "S"}, 
			{"F", "X", "X", "X"}, 
			{"D", "F", "F", "F"}, 
			{"X", "F", "F", "F"}
		}; 
				
		System.out.println("matrix1Falha - Achou Caminho? "+path.existeCaminho(matrix1Falha));
	}
	
	public static void teste04() {
		Navegacao path = new Navegacao();
		String[][] matrix2OK = 
		{  
			{"S", "X", "F", "F", "F"}, 
			{"F", "X", "F", "X", "F"}, 
			{"F", "X", "F", "X", "F"}, 
			{"F", "X", "F", "X", "F"},
			{"F", "F", "F", "X", "D"}
		}; 
				
		System.out.println("matrix2OK - Achou Caminho? "+path.existeCaminho(matrix2OK));
	}
	
	public static void teste05() {
		Navegacao path = new Navegacao();
		String[][] matrix2Falha = 
		{  
			{"S", "X", "F", "F", "F"}, 
			{"F", "X", "F", "X", "F"}, 
			{"F", "X", "F", "X", "F"}, 
			{"F", "X", "F", "X", "X"},
			{"F", "F", "F", "X", "D"}
		}; 
		System.out.println("matrix2Falha - Achou Caminho? "+path.existeCaminho(matrix2Falha));
	}
	
	public static void teste06() {
		Navegacao path = new Navegacao();
		String[][] matrix3OK = 
		{  
			{"S", "X", "F", "F", "F", "F"}, 
			{"F", "X", "F", "X", "X", "F"}, 
			{"F", "X", "F", "X", "X", "F"}, 
			{"F", "X", "F", "X", "X", "F"},
			{"F", "X", "F", "X", "X", "F"},
			{"F", "F", "F", "X", "D", "F"}
		}; 
		System.out.println("matrix3OK - Achou Caminho? "+path.existeCaminho(matrix3OK));
	}
	
	public static void teste07() {
		Navegacao path = new Navegacao();
		String[][] matrix3Falha = 
		{  
			{"S", "X", "F", "F", "F", "F"}, 
			{"F", "X", "F", "X", "X", "X"}, 
			{"F", "X", "F", "X", "X", "X"}, 
			{"F", "X", "F", "X", "X", "X"},
			{"F", "X", "F", "X", "X", "X"},
			{"F", "F", "F", "X", "D", "X"}
		}; 
		System.out.println("matrix3Falha - Achou Caminho? "+path.existeCaminho(matrix3Falha));
	}
	
	public static void teste08() {
		Navegacao path = new Navegacao();
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
				
		System.out.println("matrix4OK - Achou Caminho? "+path.existeCaminho(matrix4OK));
	}
	
	public static void teste09() {
		Navegacao path = new Navegacao();
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
		System.out.println("matrix4Falha - Achou Caminho? "+path.existeCaminho(matrix4Falha));
	}
	
	public static void main(String[] args) {
		//
		teste01();
		//
		teste02();
		//
		teste03();
		//
		teste04();
		//
		teste05();
		//
		teste06();
		//
		teste07();
		//
		teste08();
		//
		teste09();
	}
}
