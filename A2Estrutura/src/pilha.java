
public class pilha {	
	public static void main(String[] args) {
		pilha p = new pilha();
		p.push("F");
		p.push("E");
		p.push("L");
		p.push("I");
		p.push("C");
		p.push("I");
		p.push("D");
		p.push("A");
		p.push("D");
		p.push("E");
		
		System.out.print("Forma invertida: ");
		while(!p.isEmpty()) {
			String pilha = p.pop();
			System.out.print(pilha);
		}			
	}
	
	int topo;
	String pilha[];
	
	public pilha() {
		pilha = new String[50];
		topo = -1;
	}
	public void push (String e) {
		if(isFull()) {
			throw new RuntimeException("Pilha está cheia");
		}
		topo++;
		pilha[topo] = e;
	}
	public String pop() {
		if(isEmpty()) {
			throw new RuntimeException("Pilha vazia");
		}
		String e;
		e = pilha[topo];
		topo--;
		return e;
		
	}
	public boolean isEmpty() {
		return (topo == -1);
	}
	public boolean isFull() {
		return (topo == 49);
	}
	public String top() {
		if(isEmpty()) {
			throw new RuntimeException("Pilha vazia");
		}
		return pilha[topo];
	}
}
