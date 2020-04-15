class cc{

    private double a=10;
    private double b,c;
    public cc(double a){
        this.a=a;
    }
    public cc(double a,double b,double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public double calArea(){
        return a*3.14*a;
    }

    public double seta(double a){
        return this.a=a;
    }
    public double setb(double b){
        return this.b=b;
    }

    public double setc(double c){
        return this.c=c;
    }
    public double geta(){
        return this.a;
    }
    public double getb(){
        return this.b;
    }
    public double getc(){
        return this.c;
    }
}






class test00 {
    public static void main(String[] args){
        
        cc s = new cc(5.2,256.0,25.3);
        System.out.println(s.geta()+" : "+s.getb()+" : "+s.getc());
        System.out.println(s.calArea());
       



    }


}