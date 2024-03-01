import java.util.Locale;
import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) throws Exception {

        try{

            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
     
                System.out.println("Digite o seu primeiro nome");
                String nome = scanner.next();
        
                System.out.println("Digite seu sobrenome");
                String sobreNome = scanner.next(); 
        
                System.out.println("Digite a sua idade");
                int idade = scanner.nextInt();
        
                System.out.println("digite a sua altura");
                double altura = scanner.nextDouble();
        
        
                
                System.out.println("Olá, me chamo " + nome + " " + sobreNome);
                System.out.println("Tenho " + idade + " anos");
                System.out.println("Minha altura é " + altura + " cm");
        
                System.out.println("Então essa é uma descrição sobre mim! Gostou? Quer saber mais? Então bora conversar!");
                scanner.close();
        }
        catch(Exception e){
            System.err.println("Os campos Idade e altura precisam ser numéricos");
        }
    }
}
