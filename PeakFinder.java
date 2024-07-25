import java.util.*;

import javax.lang.model.util.ElementScanner6;
public class PeakFinder{
    private int[][] Dizi;
    private int col;
    private int row;

    public PeakFinder(int[][] Dizi, int col, int row){
        this.Dizi=Dizi;
        this.col=col;
        this.row=row;
    }
    public int greedy_ascent(int a,int b){
        if(a > 0 && Dizi[a-1][b] > Dizi[a][b]){
            return greedy_ascent(a-1,b);
        }
        else if(a < row-1 && Dizi[a+1][b] > Dizi[a][b]){
            return greedy_ascent(a+1, b);
        }
        else if(b > 0 && Dizi[a][b-1] > Dizi[a][b]){
            return greedy_ascent(a, b-1);
        }
        else if(b < col-1 && Dizi[a][b+1] > Dizi[a][b]){
            return greedy_ascent(a, b+1);
        }
        else
        return Dizi[a][b];
    }
    public int divide_conquer(int a, int b){
        int i=a + (row-a)/2;
        int j=b + (col-b)/2;
        if(i > 0 && Dizi[a-1][b] > Dizi[a][b])
            return divide_conquer(i-1, j);
        else if(i < row-1 && Dizi[i+1][j] > Dizi[i][j])
            return divide_conquer(i+1, j);
        else if(j > 0 && Dizi[i][j-1] > Dizi[i][j])
            return divide_conquer(i, j-1);
        else if(j < col-1 && Dizi[i][j+1] > Dizi[i][j])
            return divide_conquer(i, j+1);
        else
        a=i;
        b=j;
            return Dizi[a][b];
    }
    public static void main(String[] args) {
        int[][] Dizi = new int[][]{ {67, 89, 32, 12},
                                    {23, 54, 77, 45},
                                    {95 ,92 ,75 ,22},
                                    {25 ,47 ,32 ,33}};
        int row=4, col=4;
        PeakFinder A = new PeakFinder(Dizi,row,col);
        int b = A.greedy_ascent(0 ,0);
        System.out.println("Peak =" + b);
        int c = A.divide_conquer(0, 0);
        System.out.println("Peak =" + c); 
    }

}