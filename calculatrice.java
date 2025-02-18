public class Calculatrice {

    public double addition(double a, double b) {
        return a + b;
    }

    // Méthode pour la soustraction
    public double soustraction(double a, double b) {
        return a - b;
    }

    // Méthode pour la multiplication
    public double multiplication(double a, double b) {
        return a * b;
    }

    public double division(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division par zéro impossible");
        }
        return a / b;
    }
}


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculatrice calculatrice = new Calculatrice();

        System.out.println("Bienvenue dans la calculatrice !");
        System.out.println("Opérations disponibles :");
        System.out.println("1. Addition (+)");
        System.out.println("2. Soustraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");

        System.out.print("Choisissez une opération (1-4) : ");
        int choix = scanner.nextInt();

        System.out.print("Entrez le premier nombre : ");
        double nombre1 = scanner.nextDouble();

        System.out.print("Entrez le deuxième nombre : ");
        double nombre2 = scanner.nextDouble();

        double resultat = 0;
        boolean erreur = false;

        switch (choix) {
            case 1:
                resultat = calculatrice.addition(nombre1, nombre2);
                break;
            case 2:
                resultat = calculatrice.soustraction(nombre1, nombre2);
                break;
            case 3:
                resultat = calculatrice.multiplication(nombre1, nombre2);
                break;
            case 4:
                try {
                    resultat = calculatrice.division(nombre1, nombre2);
                } catch (ArithmeticException e) {
                    System.out.println(e.getMessage());
                    erreur = true;
                }
                break;
            default:
                System.out.println("Opération non valide.");
                erreur = true;
        }

        if (!erreur) {
            System.out.println("Le résultat est : " + resultat);
        }

        scanner.close();
    }
