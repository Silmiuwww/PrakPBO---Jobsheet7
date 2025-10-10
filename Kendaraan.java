public class Kendaraan {
    public String merk;
    public String tipe;
    protected int tahun;

    public Kendaraan() {
        System.out.println("Objek dari class Kendaraan dibuat");
    }

    public Kendaraan(String merk, String tipe, int tahun) {
    this.merk = merk;
    this.tipe = tipe;
    this.tahun = tahun;
    }

    public String getInfo() {
        String info = "";
        info += "Merk: " + merk + "\n";
        info += "Tipe: " + tipe + "\n";
        info += "Tahun: " + tahun + "\n";

        return info;
    }
}
