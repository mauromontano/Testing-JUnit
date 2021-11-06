package main;

public class Acciones {
	
	private int [] arr = {1,2,3,4,5,6,7,8,9};
	
	public Acciones() {
	}
	
	public boolean pertenece(int elem){
		boolean encontre = false;
		int i = 0;
		while(i<arr.length && !encontre){    
			if(arr[i] == elem) {
				encontre = true;
			}
			i++;
		};
		return encontre;
	}
	
	public int contarA(String word) {
		int count = 0;
		for(int i=0; i<word.length(); i++) {
			if(word.charAt(i) == 'a' || word.charAt(i) == 'A') {
				count++;
			}
		}
		return count;
	}
	
	
}
