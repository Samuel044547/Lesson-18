public class Main {
    public static void main(String[] args) {
        // Problem 1
        System.out.println("Problem ");
        double x01 = problem(6) + problem(13) + problem(21);
        System.out.println("x1=" + x01);
        double x02 = problem11(5, 7) + problem11(12, 8) + problem11(31, 2);
        System.out.println("x2=" + x02);
        double x03 = problem12(15, 8) + problem12(6, 12) + problem11(7, 21);
        System.out.println("x03=" + x03);
        double x04 = problem12(13, 7) + problem12(15, 12) + problem11(21, 32);
        System.out.println("x04=" + x04);

        // Problem 2
        System.out.println("Problem 2 2-shi jol");
        problem2(5, 5);
        // Problem 3
        System.out.println("Prolem 3 2 shi jol");
        int pi = problem3(1, 45, 4, 6, 3, 2);
        int pi2 = problem3(1, 8, 6, 5, 43, 2);
        System.out.println("Max 01=" + pi + "\n" + "Max 02=" + pi2);
        // Problem 4
        System.out.println("Problem 4");
        prob4(123456);
        // Problem 5
        System.out.println("Problem 5");
        prob5(6);
        // Problem 6
        System.out.println("\nProblem 6");
        prob6(4, 6, 8);
        // Problem 7
        System.out.println("Problem 7");
        prob7("Javasjkrip");
    }

    public static double problem(int n) {
        double res = (Math.sqrt(n) + n) / 2;

        return res;
    }

    public static double problem11(int n, int y) {
        double res1 = (n + Math.sqrt(n) / Math.sqrt(y) + y);

        return res1;
    }

    public static double problem12(int n, int y) {
        double res2 = n + Math.sqrt(y) / Math.sqrt(n);

        return res2;
    }

    public static double problem13(int n, int y) {
        double res2 = n + Math.sqrt(y) / y + Math.sqrt(n);

        return res2;
    }

    public static double problem2(int x, int y) {
        if (x == y) {
            System.out.println("error");
        } else if (x < y) {
            System.out.println("Y ylken");
        } else {
            System.out.println("X ylken");
        }
        return 0;
    }

    public static int problem3(int n1, int n2, int n3, int n4, int n5, int n6) {
        int n = Math.max(Math.max(Math.max(n1, n2), Math.max(n3, n4)), Math.max(n5, n6));
        return n;
    }

    public static int prob4(int n) {
        int san1 = 0;
        int san2 = 0;
        int n1 = n / 1000;
        int n2 = n % 1000;
        for (int i = 3; n == i; i++) {
            san1 = san1 + n % 10;
            san2 = san2 + n2 % 10;

            n1 = n1 / 10;
            n2 = n2 / 10;
        }
        if (san1 == san2) {
            System.out.println("san bakatta");
        } else {
            System.out.println(" san bakata emes ");
        }
        return san1;
    }
    public static void prob5(int n) {
        for (int i = 0; i <= n; i++) {
            System.out.print("*");
        }
    }

    public static void prob6(int n1, int n2, int n3) {
        int S = (n1 + n2 + n3) / 2;
        double A = Math.sqrt(S * (S - n1) * (S - n2) * (S - n3));
        double P = n1 + n2 + n3;
        System.out.println("Ауданы=" + A);
        System.out.println("Периметры=" + P);
        System.out.println("Ауданы + Периметры= " + (P + A));
    }

    public static void prob7(String name) {

        name = "jaaj";
        int a = name.length();
        if(a%2==0){
            int b = a/2;

            //Java
            String first = name.substring(0,b); //ja
            String second = name.substring(b,name.length()); //va

            StringBuilder reversed = new StringBuilder(second).reverse();
            String result = reversed.toString();

            if(first.equals(result)){
                System.out.println("Палиндром");
            }
            else{
                System.out.println("Палиндром емес");
            }


        }
        else{
            //And r oid
            int c = a/2;
            String first = name.substring(0,c); //and
            //r
            String second = name.substring(c+1,name.length());//oid
            //dio

            StringBuilder reversed = new StringBuilder(second).reverse();
            String result = reversed.toString();

            if(first.equals(result)){
                System.out.println("Палиндром");
            }
            else{
                System.out.println("Палиндром емес");
            }
        }

}}