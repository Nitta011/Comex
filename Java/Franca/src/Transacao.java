
public class Transacao {
	
	public Transacao() {
		super();
	}
	public static void main(String[] args) {
		try {
			
		
		Devedores devedor1 = new Devedores("Blake", "Alex", -2);
		Devedores devedor2 = new Devedores("Alex", "Blake", -2);
		Devedores devedor3 = new Devedores("Casey", "Alex", -5);
		
		System.out.println(devedor1.getSaldo());
		System.out.println(devedor2.getSaldo());
		System.out.println(devedor3.getSaldo());
		}catch(IllegalArgumentException msg) {
			System.out.println("O seguinte item foi adicionado errado: " + msg.getMessage());
		}
	}
}
