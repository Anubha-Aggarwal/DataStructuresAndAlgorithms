/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dfs;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class Dfs {

    /**
     * @param args the command line arguments
     */
    int [][]matrix;
    Scanner in;
    int n,point;
    int []visited;
    Dfs()
    {
        matrix=new int[10][10];
        in=new Scanner(System.in);
        visited=new int[10];
    }
   void fillDfs()
    {
       System.out.println("Enter total no of points");
        n=in.nextInt();
       for(int i=0;i<n;i++)
       {
           for(int j=0;j<n;j++)
           {
               matrix[i][j]=in.nextInt();
           }              
       }       
       for(int i=0;i<n;i++)
       {          
           visited[i]=0;
       }
       System.out.printf("Enter source point ");
       point=in.nextInt();
       dfs(point-1);
        for(int i=0;i<n;i++)
        {
        if(visited[i]==1&&i!=point-1)
            System.out.println(i+1+"");
        }
    }
   void dfs(int i)
   {
       visited[i]=1;
       for(int j=0;j<n;j++)
       {
           if(matrix[i][j]==1)
           {
               if(visited[j]==0)
               {
                   dfs(j);                   
               }
           }
       }
   }
    public static void main(String[] args) {
        // TODO code application logic here
    Dfs object=new Dfs();    
    object.fillDfs();
   
    }
    
}
