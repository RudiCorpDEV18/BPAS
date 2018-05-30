package info.rudicorpdev.bpas;

public class List_bab {

    private int id;
    private String judul, isi;
    private int gambar;

    public List_bab(int id, String judul, String isi, int gambar) {
        this.id = id;
        this.judul = judul;
        this.isi = isi;
        this.gambar = gambar;
    }

    public int getId() {
        return id;
    }

    public String getJudul() {
        return judul;
    }

    public String getIsi() {
        return isi;
    }

    public int getGambar() {
        return gambar;
    }
}
