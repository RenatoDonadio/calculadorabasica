/**
 * exemploaula
 */
public class calculadora {

    private double ANS;
    public calculadora(){
    this.ANS=0;
    }
    public double soma(double x, double y){
            this.ANS = x+y;
            return this.ANS;
    }
    public double subt(double x, double y){
    this.ANS = x-y;
    return this.ANS;
}
public double multi(double x, double y){
    this.ANS = x*y;
    return this.ANS;
}
public double divis(double x, double y){
    this.ANS = x/y;
    return this.ANS;
}

public double getANS(){
    return this.ANS;
}
public void resetANS(){
    this.ANS = 0;
}
public double opera (double x, double y, char op){
switch (op) {
    case '+': return soma(x,y);
    case '-': return subt(x,y);
    case '*': return multi(x,y);
    case '/': return divis(x,y);
    default: return 0;
        
}

}

    }


    

