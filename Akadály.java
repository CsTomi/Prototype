package akadaly;

/**
 * Az akadály osztály az akadályokra vonatkozó közös
 * függvényeket és methódusokat írja elő.
 **/
public abstract class Akadaly {

	/**
	 * A viselkedés fv. kivált a paraméternek megadott robotból valamilyen sebesség változást.
	 * @param r - ez a robot
	 */
	public abstract void viselkedes(Robot r);
}
