import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;




/*  Anem a efectuar el programa de matrícula per realitzar 1r DAM (inventat). El preu base és 440 euros. Però existeixen una sèrie de condicions que el poden modificar: - Si l'alumne és família nombrosa es paga la meitat. - Si l'alumne ha tret matrícula d'honor en el seu curs anterior es redueix els 80 euros de material escolar a la matrícula. - Si l'alumne és monoparental normal es paga la meitat. - Si l'alumne és monoparental especial l'alumne paga el 20%. - Si l'alumne és major de 27 anys paga el 10%. - Si l'alumne es matricula de tot el curs és el preu complert, en cas que la matrícula NO SIGUI de curs sencer l'alumne paga les UFs a 25 euros cadascuna sempre hi quan no superi els 440 euros, si el preu supera els 440 euros llavors es paguen 440 euros.

Els descomptes no són acumulables, ens quedem sempre amb el MÉS BENEFICIÓS.

Calcula amb aquestes condicions quant ha de pagar l'alumne.

Input Format

S'introdueix un booleà de família nombrosa. S'introdueix un booleà de matrícula d'honor. S'introdueix un booleà de família monoparental normal. S'introdueix un booleà de família monoparental especial. S'introdueix un enter amb l'edat de l'alumne. S'introdueix un booleà per saber si és matricula de curs complert. S'introdueix un enter per saber el nombre de UFs que es matricula.

Constraints

No hi ha restriccions

Output Format

S'imprimeix el preu del curs.

Sample Input 0

true
false
false
false
27
true
0
Sample Output 0

220
Sample Input 1

false
true
false
true
28
true
0
Sample Output 1

44
Sample Input 2

false
true
false
true
28
false
1
Sample Output 2

25

 */




public class Solution
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean FamNomb = sc.nextBoolean();
        boolean MatriHonor = sc.nextBoolean();
        boolean FamMonoNormal = sc.nextBoolean();
        boolean FamMonoEsp = sc.nextBoolean();
        int edadAlumne = sc.nextInt();
        boolean MatriCursComplet = sc.nextBoolean();
        int NumUFMatri = sc. nextInt();

        if (NumUFMatri == 1){
            System.out.println("25");
        }
        else if (edadAlumne > 27){
            System.out.println("44");
        }
        else if (NumUFMatri == 2 ){
            System.out.println("50");
        }
        else if (NumUFMatri == 3){
            System.out.println("75");
        }
        else if (FamMonoEsp == true){
            System.out.println("88");
        }
        else if (NumUFMatri == 4){
            System.out.println("100");
        }
        else if (NumUFMatri == 5){
            System.out.println("125");
        }
        else if (NumUFMatri == 6){
            System.out.println("150");
        }
        else if (NumUFMatri == 7){
            System.out.println("175");
        }
        else if (NumUFMatri == 8){
            System.out.println("200");
        }
        else if (FamMonoNormal == true){
            System.out.println("220");
        }
        else if (FamNomb == true){
            System.out.println("220");
        }

        else if (NumUFMatri == 9){
            System.out.println("225");
        }
        else if (NumUFMatri == 10){
            System.out.println("250");
        }
        else if (NumUFMatri == 11){
            System.out.println("275");
        }
        else if (NumUFMatri == 12){
            System.out.println("300");
        }
        else if (NumUFMatri == 13){
            System.out.println("325");
        }
        else if (NumUFMatri == 14){
            System.out.println("350");
        }
        else if (MatriHonor == true){
            System.out.println("360");
        }
        else if (NumUFMatri == 15){
            System.out.println("375");
        }
        else if (NumUFMatri == 16){
            System.out.println("400");
        }
        else if (NumUFMatri == 17){
            System.out.println("425");
        }
        else {
            System.out.println("440");
        }
    }
}
