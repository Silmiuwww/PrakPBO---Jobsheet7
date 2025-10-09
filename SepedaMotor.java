class SepedaMotor extends Kendaraan {
    int kapasitasTangki;
    String bahanBakar;

    // Constructor tanpa parameter
    public SepedaMotor() {
        super();
        this.kapasitasTangki = 0;
        this.bahanBakar = "Belum diisi";
    }

    // Constructor berparameter
    public SepedaMotor(String merk, String tipe, int tahun, int kapasitasTangki, String bahanBakar) {
        super(merk, tipe, tahun);
        this.kapasitasTangki = kapasitasTangki;
        this.bahanBakar = bahanBakar;
    }

    // Overriding method getInfo()
    public String getInfo() {
        return super.getInfo() +
               "\nKapasitas Tangki: " + kapasitasTangki + " liter" +
               "\nBahan Bakar: " + bahanBakar;
    }
}
