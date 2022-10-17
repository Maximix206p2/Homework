public class Homework5 {
    public static void main(String[] args) {
        //For15
        int A = 5, N = 5, An = 1;
        for (int i = 0; i<N; i++) {
            An *= A;
        }
        System.out.println(An);
        //For17
        int A2 = 4, N2 = 3, An2 = 0;
        for (int i = 0; i<N2+1; i++) {
            An2 += Math.pow(A2, i);
        }
        System.out.println(An2);
        //For19
        int N3= 7, Nfact = 1;
        for (int i = 1; i<N3+1; i++) {
            Nfact *= i;
        }
        System.out.println(Nfact);
    }
}
