public final class Triangolo extends Forma{
    private double base;
    private double altezza;

    public double getAltezza(){
       return this.altezza;
    }
    public void setAltezza(double nuovaAltezza){
       altezza=nuovaAltezza;
    }
    public Triangolo(double base, double altezza){
        this.base=base;
        this.altezza=altezza;
    }
    @Override
    public String toString() {
        return "Triangolo{" +
                "base=" + base +
                ", altezza=" + altezza +
                '}';
    }
    @Override
    public double calcolaArea() {
        return (base * altezza)/2;
    }
}
