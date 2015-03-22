package Class_Diagram;

/**
 * Az akadály osztály az akadályokra vonatkozó közös
 * függvényeket és methódusokat írja elő.
 **/
public abstract class Akadály {

	/**
	 * A viselkedés fv. kivált a paraméternek megadott robotból valamilyen sebesség változást.
	 * @param r - ez a robot
	 */
	public abstract void viselkedés(Robot r);
}
