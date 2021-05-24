package model;

public class Player {
    //Nie do rozmycia
    private String League;
    private String nationality;
    //Do rozmycia
    private int GP;
    private int FGM;
    private int ThreePM;
    private int TOV;
    private int PF;
    private int REB;
    private int AST;
    private int STL;
    private int BLK;
    private int PTS;
    private double height;
    private double weight;

    public Player(String league, String nationality, int GP, int FGM, int threePM, int TOV, int PF, int REB, int AST, int STL, int BLK, int PTS, double height, double weight) {
        League = league;
        this.nationality = nationality;
        this.GP = GP;
        this.FGM = FGM;
        ThreePM = threePM;
        this.TOV = TOV;
        this.PF = PF;
        this.REB = REB;
        this.AST = AST;
        this.STL = STL;
        this.BLK = BLK;
        this.PTS = PTS;
        this.height = height;
        this.weight = weight;
    }

    public String getLeague() {
        return League;
    }

    public void setLeague(String league) {
        League = league;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getGP() {
        return GP;
    }

    public void setGP(int GP) {
        this.GP = GP;
    }

    public int getFGM() {
        return FGM;
    }

    public void setFGM(int FGM) {
        this.FGM = FGM;
    }

    public int getThreePM() {
        return ThreePM;
    }

    public void setThreePM(int threePM) {
        ThreePM = threePM;
    }

    public int getTOV() {
        return TOV;
    }

    public void setTOV(int TOV) {
        this.TOV = TOV;
    }

    public int getPF() {
        return PF;
    }

    public void setPF(int PF) {
        this.PF = PF;
    }

    public int getREB() {
        return REB;
    }

    public void setREB(int REB) {
        this.REB = REB;
    }

    public int getAST() {
        return AST;
    }

    public void setAST(int AST) {
        this.AST = AST;
    }

    public int getSTL() {
        return STL;
    }

    public void setSTL(int STL) {
        this.STL = STL;
    }

    public int getBLK() {
        return BLK;
    }

    public void setBLK(int BLK) {
        this.BLK = BLK;
    }

    public int getPTS() {
        return PTS;
    }

    public void setPTS(int PTS) {
        this.PTS = PTS;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
