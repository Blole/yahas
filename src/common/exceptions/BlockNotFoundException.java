package common.exceptions;


public class BlockNotFoundException extends Exception {
	private static final long serialVersionUID = 8392834553502105328L;

	public BlockNotFoundException(long blockID) {
		super(String.valueOf(blockID));
	}
}
