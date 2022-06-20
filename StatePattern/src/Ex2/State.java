package Ex2;

/**
 * Lab 11
 * @author scz
 */
public interface State {
	State leave();
	State enter();
	State ask();
	State over();
	State handover();
}
