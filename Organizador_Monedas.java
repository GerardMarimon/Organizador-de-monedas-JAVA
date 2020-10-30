import java.util.Scanner;

public class centims {

    public static void main(String[] args) {
       Scanner keyboard = new Scanner(System.in);
       
       int n, n1,n2,n3,n4,n5,n6,n7, dos, un, mitg, 
               vint, deu, cinc, doss, unn ;
       // creació de les variants int
       
       System.out.println("Cèntims?");
       n = keyboard.nextInt();
       
       dos = n/200;
       n1 = n%200;
       /* agafem el total de cèntims i el dividim per 
       la primera moneda i el residu el guardem*/
       
       un = n1/100;
       n2 = n1%100;
       /* amb el residu dividim per la moneda que 
       volem i amb el residu per la resta de monedes*/
       
       mitg = n2/50;
       n3 = n2%50;
       // fem el procces amb totes les monedes
       
       vint = n3/20;
       n4 = n3%20;
       
       deu = n4/10;
       n5 = n4%10;
       
       cinc = n5/5;
       n6 = n5%5;
       
       doss = n6/2;
       n7 = n6%2;
       
       unn = n7/1;
              
       System.out.println("Monedas: "+ dos*2 +"€ "+ un +"€ "+ mitg*(0.5) 
               +"€ "+ vint*(0.2) +"€ "+ deu*(0.1) +"€ "+ cinc*(0.05) +"€ "+
               doss*(0.02) +"€ "+ unn +"€");
        // multiplicant es veu la quantitat en monedes i no el número de monedes
    }
    
}
