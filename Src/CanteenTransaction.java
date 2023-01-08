// Interface yang digunakan untuk melakukan transaksi di kantin, bisa digunakan siapa saja
public interface CanteenTransaction {
	// Melakukan pembelian dari kantin
	public void buy(Food food);
}
