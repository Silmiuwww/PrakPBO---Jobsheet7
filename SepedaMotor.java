public class SepedaMotor extends Kendaraan {
    public int kapasitasTangki;
    public String bahanBakar;

    public SepedaMotor() {
        System.out.println(tahun);
        System.out.println("Objek dari class SepedaMotor dibuat");
    }

    public SepedaMotor(String merk, String tipe, int tahun, int kapasitasTangki, String bahanBakar) {
        System.out.println("Objek dari class SepedaMotor dibuat dengan constructor berparameter");
    }

    public String getInfo() {
        String info = "";
        info += "Kapasitas Tangki: " + kapasitasTangki + " liter\n";
        info += "Bahan Bakar: " + bahanBakar + "\n";
        return info;
    }

    public String getAllInfo() {
        String info = super.getInfo();
        info += this.getInfo();
        return info;
    }
}
