package OOPS;

class Fclass {

    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("Blue");       // ✔ String pass kar rahe hain
        System.out.println(p1.color);
    }
}

class Pen  {
    String color;
    int tip;
    String getCol(){
        return this.color;
    }

    void setColor(String newColor){   // ✔ String argument
        this.color = newColor;
    }

    void setTip(int Tip){
        this.tip = Tip;
    }
}
