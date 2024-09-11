package Bai1;

import java.io.Serializable;

public class Sturdent extends Person implements Serializable {
    private double  markAvg;

    public Sturdent(int personID, String personName, int dateOfBirth, double markAvg) {
        super(personID, personName, dateOfBirth);
        this.markAvg = markAvg;
    }
   public double getMarkAvg(){
        return markAvg;
    }
    public void setMarkAvg ( double markAvg){
        this.markAvg=markAvg;
    }

    @Override
    public String toString() {
        return "Sturdent{" +
                super.toString() +
                "markAvg=" + markAvg +
                '}';
    }
}
