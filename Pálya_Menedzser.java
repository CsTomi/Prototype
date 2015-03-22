package palya;

import java.util.TimerTask;

/**
 * Ez az osztály a pálya és a felhasználó "között" van. Fogadja az inputokat és a játék számára
 * értelmezhetővé teszi. Vektorokat tovább küldi a pályának, robotoknak. A játékos akadály 
 * lerakását is ezen keresztül küldi a robot/pálya felé.
 * A játék elején mód van a robotok ragacs és olaj készletének a beállítására.
 * Nyílván tartja a körök számát. Egy kőr alatt minden robot lép egyet. Miután minden robot lépett
 * letelik egy kőr.
 * @author C Sharks
 *
 */
public class Pálya_Menedzser {

	private int kor;//Ennyi kőr lesz a játék alatt
	private int olajkeszlet;//Robot olaj...
	private int ragacskeszlet;//...és ragacs készlete

	public static void main(String args[]){
		
	}
	
	/**
	 * 
	 * @param kor
	 * @param ragacs
	 * @param olaj
	 */
	public Pálya_Menedzser(int kor, int ragacs, int olaj) {
		System.out.println("PM - konstruktor hívás. "+kor+", "+ragacs+", "+olaj+" paraméterekkel.");
		this.kor = kor;
		this.ragacskeszlet = ragacs;
		this.olajkeszlet = olaj;
	}

	public void korSzamol() {
		System.out.println("PM - korSzamol fv. kezdődik.");
		this.kor--;//Mínusz 1 kőr
		System.out.println("korSzamol vége.");
	}

	public int getKor() {
		System.out.println("PM - getKor fv. kezdődik és "+this.kor+" értékkel tér vissza.");
		return this.kor;
	}

	/**
	 * 
	 * @param kor
	 */
	public void setKor(int kor) {
		System.out.println("PM - setKor fv kezdődik "+kor+" paraméterrel.");
		this.kor = kor;
		System.out.println("setKor vége.");
	}

	/**
	 * 
	 * @param olajkeszlet
	 */
	public void setOlajkeszlet(int olajkeszlet) {
		System.out.println("PM - setOlajkeszlet fv. kezdodik "+olajkeszlet+" paraméterrel.");
		this.olajkeszlet = olajkeszlet;
		System.out.println("setOlajkeszlet vege.");
	}

	/**
	 * 
	 * @param ragacskeszlet
	 */
	public void setRagacskeszlet(int ragacskeszlet) {
		System.out.println("PM - setRagacskeszlet fv. kezdodik "+ragacskeszlet+" parameterrel.");
		this.ragacskeszlet = ragacskeszlet;
		System.out.println("setRagacskeszlet vége.");
	}
	
	private static class OwnTimer extends TimerTask{
		private double currentT;
		private final double limit;
		
		public OwnTimer(){
			this.currentT = 0.0;
			this.limit = 50.0;
		}
		
		public OwnTimer(double The_Limit){
			this.currentT = 0.0;
			this.limit = The_Limit;
		}
		
		public void reset(){
			currentT = 0.0;
		}

		public double getCurrentT() {
			return currentT;
		}

		public void run() {
						
		}
	}
}
