public class PassageParValeur {
    public static  void test(Car car){
        car.setCouleur("blue");
        System.out.println("Couleur car : "+car.getCouleur());
    }

    public static  void test1(String texte){
        texte = "Texte modifié";
        System.out.println("Texte : "+texte);
    }

    public static void main(String[] args) {
        Car c= new Car();
        System.out.println("Couleur car : "+c.getCouleur());
        test(c);
        System.out.println("Couleur car : "+c.getCouleur());

        String unTexte = "Texte original";
        System.out.println("Texte : "+unTexte);
        test1(unTexte);
        System.out.println("Texte: "+unTexte);

    }
}


class Car {
    private String couleur = "Red";

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }
}
