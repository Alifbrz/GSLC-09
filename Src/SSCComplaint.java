// Interface yang digunakan untuk melakukan laporan kepada SSC, hanya bisa digunakan oleh Student class saja
public interface SSCComplaint {
	// Melakukan komplain terhadap mata kuliah
	public void subject_complaint(String subject, String description);
	// Melaporkan masalah keuangan mahasiswa
	public void financial_problem(String description);
}
