package Enum;

public enum AtivoEnum {
V(1), F(2);
	
	private final int valor;

	AtivoEnum(int valorOpcao){
		valor = valorOpcao;
	}
	public int getValor(){
		return valor;
	}
	
/*	//'V' VEDADEIRO E 'F' FALSO  * */
	
}
