package _OOP_01;

public class NaqVasitesi {
    String marka;
    String reng;
    double muherrikhecimi;

    NaqVasitesi(String marka, String reng, double muherrikhecimi) {
        setMarka(marka);
        setReng(reng);
        setMuherrikhecimi(muherrikhecimi);
    }
    public String getMarka() {
        return marka;
    }
    public void setMarka(String marka) {
        this.marka = marka;
    }
    public String getReng() {
        return reng;
    }
    public void setReng(String reng) {
        this.reng = reng;
    }
    public double getMuherrikhecimi() {
        return muherrikhecimi;
    }
    public void setMuherrikhecimi(double muherrikhecimi) {
        this.muherrikhecimi = muherrikhecimi;
    }

    @Override
    public String toString() {
        return " NaqVasitesi {" +
                " Marka= '" + marka + '\'' +
                ", Reng= '" + reng + '\'' +
                ", Muherrik hecimi= " + muherrikhecimi +
                '}';
    }
}





