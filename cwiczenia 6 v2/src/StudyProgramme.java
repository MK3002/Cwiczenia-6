
public class StudyProgramme {
    private String Nazwa;
    private String Opis;
    private int IloscSemestrow;
    private int MaksITNs;

    public StudyProgramme(String nazwa, String opis, int iloscSemestrow, int maksITNs) {
        this.Nazwa = nazwa;
        this.Opis = opis;
        this.IloscSemestrow = iloscSemestrow;
        this.MaksITNs = maksITNs;
    }

    public int getIloscSemestrow() {
        return IloscSemestrow;
    }

    public String getNazwa() {
        return Nazwa;
    }

    public String getOpis() {
        return Opis;
    }

    public int getMaksITNs() {
        return MaksITNs;
    }
}
