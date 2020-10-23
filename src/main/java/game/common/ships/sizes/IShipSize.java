package game.common.ships.sizes;

public interface IShipSize {
	public void doAttack();
	public default void onEnemyWarpOut() {}
	//???
	public void canAccess();
}
