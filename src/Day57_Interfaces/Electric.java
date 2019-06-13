package Day57_Interfaces;

public interface Electric {

	public static final boolean HAS_BATTERIS = true;
	public static final int MAX_BATTERIES = 1_000_000;  // THIS IS AUTOMATICALLY PUBLIC STATIC FINAL
	
	public abstract void charge(); //IF PUBLIC & ABSTRACT ARE REMOVED IT'LL STILL COMPILE
		
	
}
