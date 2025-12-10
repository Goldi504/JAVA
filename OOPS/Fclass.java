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

    void setColor(String newColor){   // ✔ String argument
        color = newColor;
    }

    void setTip(int newTip){
        tip = newTip;
    }
}
