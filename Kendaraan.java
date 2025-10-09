class Kendaraan {
    String merk;
    String tipe;
    int tahun;

    // Constructor tanpa parameter
    public Kendaraan() {
        this.merk = "Belum diisi";
        this.tipe = "Belum diisi";
        this.tahun = 0;
    }

    // Constructor berparameter
    public Kendaraan(String merk, String tipe, int tahun) {
        this.merk = merk;
        this.tipe = tipe;
        this.tahun = tahun;
    }

    public String getInfo() {
        return "Merk: " + merk + "\nTipe: " + tipe + "\nTahun: " + tahun;
    }
}
