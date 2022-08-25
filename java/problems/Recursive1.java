package problems;


class Recursive1 {
    public static void main (String[] args) {
        System.out.println(combinacionesPosibles(1));
        System.out.println(combinacionesPosibles(2));
        System.out.println(combinacionesPosibles(3));
        System.out.println(combinacionesPosibles(8));
    }

    public static int combinacionesPosibles (int escalera) {
        if (escalera < 3) { // Escalera es 1 o 2
            return escalera;
        }
        else {
            return combinacionesPosibles(escalera - 1) + combinacionesPosibles (escalera - 2);
        }
    }
}