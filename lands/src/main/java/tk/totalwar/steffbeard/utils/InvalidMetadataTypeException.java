package tk.totalwar.steffbeard.utils;

public class InvalidMetadataTypeException extends NationsException {

	/**
	 * I have no idea why we need this or what it does but Eclipse gets mad if i dont auto gen it
	 * 
	 * @author Steffbeard
	 */
	private static final long serialVersionUID = -439673566777472487L;
	
	public InvalidMetadataTypeException(CustomDataFieldType type) {
        super("The given string for type " + type.getTypeName() + " is not valid!");
    }
}
