class Mother {
    public void smile() {
        System.out.println("Mother is smiling.");
    }

    public void angry() {
        System.out.println("Mother is angry.");
    }
}


class Daughter extends Mother {
    public void walk() {
        System.out.println("Daughter is walking.");
    }
}


public class Main1 {
    public static void main(String[] args) {
        Daughter d1 = new Daughter();
        d1.smile(); 
        d1.angry(); 
        d1.walk();  
}
}


    
    

    