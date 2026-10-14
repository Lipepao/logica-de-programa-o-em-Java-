import java.util.Scanner;

public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Digite um conjuto de numeros onde a codicao de parada sera (-1)");
    
    int maiorNum = 0;
    int num;
    
    System.out.println("Digite um numero:");
        num = scan.nextInt();
            if(num == -1){
                System.out.println("Lembre-se (-1) é a parada");
                System.out.println("Tente novamente!");
            }
    while (num != -1) {
        System.out.println("Digite um numero:");
        num = scan.nextInt();
        if (num > maiorNum){
            maiorNum = num ;
        }
    }
    System.out.println("Maior numero digitado foi: "+ maiorNum);

    //Exercio ultilizado While para uma condicao de parada
}