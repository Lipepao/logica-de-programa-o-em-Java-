import java.util.Scanner;
public static void main(String[] args) {
    
    System.out.println("Digite o valor da sua compra:");

    Scanner scan = new Scanner(System.in);
    int valorCompra = scan.nextInt();
    System.out.print("Digite uma das opcões para proceguir:");

    System.out.println("Opção 1 Para 10 % de desconto para pagamentos avista");
    System.out.println("Opção 2 Para 5 % de desconto de pagamento após 30 dias");
    System.out.println("Opção 3 Sem desconto para pagamentos após 60 dias");
    System.out.println("Opção 4 para 90 dias de pagamentos 5 % adicionais");
    
    System.out.println("Escolha uma opção");
    int opcao =scan.nextInt();
    if(opcao==1)
    {   
        int valor = valorCompra - (valorCompra * 10 / 100);
        System.out.println("Sua compra a vista com 10% a menos fica: "+ valor);
    }
    else if (opcao==2 ){ 
    int valor = valorCompra - (valorCompra * 5 / 100);
    System.out.println("Sua compra para 30 dias com 5% a menos fica: "+ valor);
    }
    else if (opcao==3 ){ 
    System.out.println("Sua compra para 60 dia fica: "+ valorCompra);
    }
    else if (opcao==4 ){ 
    int valor = valorCompra + (valorCompra * 5 / 100);
    System.out.println("Sua compra para 60 dias com 5% a mais fica: "+ valor);
    }
    else{
        System.out.println("Escolha uma opçao valida !");
    }
}   //Exercicio em java usando condicionais, o exercício consiste em pedir um valor onde ser aplicado ou adicionados descontos utilizando if else