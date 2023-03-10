public class Ravenclaw extends Hogwarts{
    private int smart;
    private int wise;
    private int witty;

    public Ravenclaw(String nameStudent, int age, int magicPower, int transgress,
                      int smart, int wise, int witty){
        super(nameStudent, age, magicPower, transgress);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public String toString() {
        return "Факультет Когтевран! " + super.toString() +"\nУм " + smart + "\nмудрость " + wise +
                "\nостроумие " + witty;
    }

    public boolean equals(Ravenclaw o) {
        int summThis = smart + wise + witty;
        int summO = o.smart + o.wise + o.witty;
        if(summThis > summO){
            return true;
        }else{
            return false;
        }
    }
}
