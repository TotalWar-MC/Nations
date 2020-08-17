package tk.totalwar.steffbeard.objects;

/**
 * A simple interface to show that a class can be named, agnostic
 * if its a {@link NationsObject} or not.
 */
public interface Nameable {
	/**
	 * Get the name of the specified object
	 * 
	 * @return A String representing the name of the object.
	 */
	String getName();

	/**
	 * Gets the formatted name of the object.
	 * 
	 * @return The formatted name.
	 */
	default String getFormattedName() {
		return getName().replace('_', ' ');
	}
	
}