package UnicodeFormat;



public class MySwingTest  {

	
	 public String convert(String str) {  
	        StringBuffer ostr = new StringBuffer();  
	  
	        for (int i = 0; i < str.length(); i++) {  
	            char ch = str.charAt(i);  
	            /* caracter precisa ser convertido para unicode? */  
	            if ((ch >= 0x0020) && (ch <= 0x007e)) {  
	                /* não */  
	                ostr.append(ch);  
	            } else {  
	                /* sim */  
	                ostr.append("\\u"); /* formato de unicode padrão */  
	                /* pega o valor hexadecimal do caracter */  
	                String hex = Integer.toHexString(str.charAt(i) & 0xFFFF);  
	                for (int j = 0; j < 4 - hex.length(); j++) {  
	                    /* concatena o zero porque o unicode requer 4 digitos */  
	                    ostr.append("0");  
	                }  
	                ostr.append(hex.toLowerCase());  
	            }  
	        }  
	        return (new String(ostr));  
	    }  
	      
	    public static void main(String[] args) {  
	    	
                                                       // informar palavra para formatar	    	
	        System.out.println(new MySwingTest().convert("Teste-Endereço"));  
	    } 
	
}
