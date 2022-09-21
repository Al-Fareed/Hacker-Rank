import java.util.*;
class DiagonalMat
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the matrix(row and matrix):");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int a[][] = new int[25][25];
        if(r==c)
        {
            System.out.println("Enter the elements of the array");
            for(int i=0;i<r;i++)
            {
                for(int j=0;j<r;j++)
                {
                    if(i==j)
                    {
                        a[i][j] = sc.nextInt();
                    }
                    else
                    {
                        a[i][j] = 0;
                    }
                }
            }
            System.out.println("Elements in the matrix:");
            for(int i=0;i<r;i++)
            {
                for(int j=0;j<r;j++)
                {
                    System.out.print(a[i][j]+"\t");
                }
                System.out.println();
            }
            System.out.println("Mapping 2D matrix into 1D matrix:");
            int oneD[] = new int[25];
            for(int i=0;i<r;i++)
            {
                for(int j=0;j<c;j++)
                {
                    if(a[i][j]!=0)
                        {oneD[i] = a[i][j];
                        System.out.print(oneD[i]);}
                }
            }
        }
        else
        {
            System.out.println("Row size and Column size doesn't match!");
        }
    }
}
