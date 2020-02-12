package ua.lviv.iot.firstLab;

public class Perfume {

	private static int numberOfPerfumes;
	private int id;

	private String nameOfPerfume;

	private double priceInUAH;

	private int volumeOfPerfume;

	private String classificationOfAromas;

	private String countryOfOrigin;

	protected String notesOfAromas;

	protected String forWhatGender;

	public Perfume() {
		numberOfPerfumes++;
		id = numberOfPerfumes;
	}

	public Perfume(String nameOfPerfume, double priceInUAH, int volumeOfPerfume, String classificationOfAromas,
			String countryOfOrigin, String notesOfAromas, String forWhatGender) {
		super();
		this.nameOfPerfume = nameOfPerfume;
		this.priceInUAH = priceInUAH;
		this.volumeOfPerfume = volumeOfPerfume;
		this.classificationOfAromas = classificationOfAromas;
		this.countryOfOrigin = countryOfOrigin;
		this.notesOfAromas = notesOfAromas;
		this.forWhatGender = forWhatGender;
		numberOfPerfumes++;
		id = numberOfPerfumes;
	}

	public Perfume(String nameOfPerfume, double priceInUAH, int volumeOfPerfume, String classificationOfAromas) {
		this(nameOfPerfume, priceInUAH, volumeOfPerfume, classificationOfAromas, null, null, null);
	}

	public String getNameOfPerfume() {
		return nameOfPerfume;
	}

	public void setNameOfPerfume(String nameOfPerfume) {
		this.nameOfPerfume = nameOfPerfume;
	}

	public double getPriceInUAH() {
		return priceInUAH;
	}

	public void setPriceInUAH(double priceInUAH) {
		this.priceInUAH = priceInUAH;
	}

	public int getVolumeOfPerfume() {
		return volumeOfPerfume;
	}

	public void setVolumeOfPerfume(int volumeOfPerfume) {
		this.volumeOfPerfume = volumeOfPerfume;
	}

	public String getClassificationOfAromas() {
		return classificationOfAromas;
	}

	public void setClassificationOfAromas(String classificationOfAromas) {
		this.classificationOfAromas = classificationOfAromas;
	}

	public String getCountryOfOrigin() {
		return countryOfOrigin;
	}

	public void setCountryOfOrigin(String countryOfOrigin) {
		this.countryOfOrigin = countryOfOrigin;
	}

	public String getNotesOfAromas() {
		return notesOfAromas;
	}

	public void setNotesOfAromas(String notesOfAromas) {
		this.notesOfAromas = notesOfAromas;
	}

	public String getForWhatGender() {
		return forWhatGender;
	}

	public void setForWhatGender(String forWhatGender) {
		this.forWhatGender = forWhatGender;
	}

	public String toString() {
		return "Perfume " + id + ":" + nameOfPerfume + ", price =" + priceInUAH + " UAH" + ", volume ="
				+ volumeOfPerfume + ", classification Of Aromas=" + classificationOfAromas + ", country Of Origin="
				+ countryOfOrigin + ", notes Of Aromas=" + notesOfAromas + ", for What Gender=" + forWhatGender;
	}

	public static void printStaticNumberOfPerfumes() {
		System.out.println("Currently we have: " + numberOfPerfumes + " perfumes.");
	}

	public void printNumberOfPerfumes() {
		System.out.println("Currently we have: " + numberOfPerfumes + " perfumes.");
	}

	public void resetValues(String nameOfPerfume, double priceInUAH, int volumeOfPerfume, String classificationOfAromas,
			String countryOfOrigin, String notesOfAromas, String forWhatGender) {
		this.nameOfPerfume = nameOfPerfume;
		this.priceInUAH = priceInUAH;
		this.volumeOfPerfume = volumeOfPerfume;
		this.classificationOfAromas = classificationOfAromas;
		this.countryOfOrigin = countryOfOrigin;
		this.notesOfAromas = notesOfAromas;
		this.forWhatGender = forWhatGender;
	}
}
