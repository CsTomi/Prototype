package Class_Diagram;

public class Olajfolt extends Akadály {

	/**
	 * A robot megcsúszik. A következő kőrben nem változtathatja a sebességét.
	 * @param r
	 */
	public void viselkedés(Robot r) {
		System.out.println("Olajfolt viselkedés fv.-e kezdődik r paraméterrel");
		r.setOlajonVan(true);
		System.out.println("Olajfolt viselkedés fv. vége");
	}
}
