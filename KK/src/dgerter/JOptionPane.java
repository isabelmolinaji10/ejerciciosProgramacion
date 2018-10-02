package dgerter;

public class JOptionPane {

	
		public static void main(String[] args) {
	        
	        
	        String str = JOptionPane.showInputDialog("Introduzca el primer numero:");
	        int var1 = Integer.parseInt(str);
	        String str2 = JOptionPane.showInputDialog("Introduzca el segundo numero:");
	        int var2 = Integer.parseInt(str2);
	        String str3 = JOptionPane.showInputDialog("Introduzca el tercer numero:");
	        int var3 = Integer.parseInt(str3);
	        
	        int suma = var1 + var2 + var3;
	        float media = (float) (suma / 3.0);
	        
	        System.out.println("La media de los números es:" + (var1 + var2 + var3)/3);
	        
	    }
	    
	    
	    
		private static String showInputDialog(String string) {
			// TODO Auto-generated method stub
			return null;
		}


	  
	}


