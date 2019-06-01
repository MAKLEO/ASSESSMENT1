package manish.khullar.lib;

import java.io.IOException;
import java.util.Scanner;

class KiBolbo
{
    void Bolbo()
    {
        System.out.println("The Roots of Quadratic Equation are: ");
    }
}
public class QuadrEqat extends KiBolbo  implements EasyHai{
   public static double a;
   public static double b;
   public static double c;
   public static double det;
   public static double alpha;
   public static double beta;
    public static void main(String[] args)
    {
        QuadrEqat qe=new QuadrEqat();
        Scanner scann=new Scanner(System.in);
        System.out.println("Enter the roots of the quadratic equation (ax^2 + bx + c = 0) by entering A,B,C only");
        try
        {
            System.out.println("Enter A");
            a=scann.nextInt();
            System.out.println("\nEnter B");
            b=scann.nextInt();
            System.out.println("\nEnter C");
            c=scann.nextInt();
        }
        /*catch(IOException iee)
        {
            System.out.println("Enter values of A then B then C seperately\n\n");
        }*/
        catch(Exception ae)
        {
            System.out.println("ABE THEEK SE CHAAP \n" +ae);
        }
       det= qe.Determ();
        System.out.println(det);
       if(det<0)
       {
           System.out.println("Roots are Imaginary");
       }
       else if(det==0)
       {
           alpha=((-b) + det)/(2*a);
           beta=((-b) - det)/(2*a);
          qe.Bolbo();
           qe.roots();
       }
       else if(det >0)
       {
           alpha=((-b) + det)/(2*a);
           beta=((-b) - det)/(2*a);
           qe.Bolbo();
           qe.roots();
       }
    }
    @Override
    public double Determ() {
        double det;
        det = Math.sqrt((b*b)-(4*a*c));
        return det;
    }
    @Override
    public double roots() {
        System.out.println("alpha: "+alpha+"\nbeta: "+beta);
        return 0;
    }
}