package be.pxl.h1.Opdrachten;

public class Arrays {

    public static void main(String[] args) {

        int[][] tabel = new int[4][6];

        for(int i=0;i<tabel.length;i++) {
            for(int j=0;j<tabel[i].length;j++) {
                tabel[i][j] = (i+1)*(j+1);
            }
        }

        for(int[] rij : tabel) {
            for(int product : rij) {
                System.out.print(product + "\t");
            }
            System.out.println();
        }
    }
}
