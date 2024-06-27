import java.util.Scanner;
/* Em um bar, o ingresso custa 10 reais para homens e 8 reais para mulheres. Cada cerveja custa 5 
reais, cada refrigerante 3 reais e cada espetinho custa 7. Além disso, o bar cobra uma taxa de 
couvert artístico no valor de 4 reais, porém, se o valor gasto com consumo for superior a 30 reais, 
o couvert artístico não é cobrado. Fazer um programa para ler os seguintes dados de um cliente do 
bar: sexo (F ou M), quantidade de cervejas, refrigerantes e espetinhos consumidos. O programa 
deve então mostrar um relatório com a conta a ser paga pelo cliente. 

EXEMPLO 1:                                      EXEMPLO 2:                                 
Sexo: F                                         Sexo: M
Quantidade de cervejas: 3                       Quantidade de cervejas: 7
Quantidade de refrigerantes: 0                  Quantidade de refrigerantes: 1
Quantidade de espetinhos: 1                     Quantidade de espetinhos: 2
    RELATÓRIO:                                      RELATÓRIO: 
Consumo = R$ 22.00                              Consumo = R$ 52.00 
Couvert = R$ 4.00                               Isento de Couvert 
Ingresso = R$ 8.00                              Ingresso = R$ 10.00 
Valor a pagar = R$ 34.00                        Valor a pagar = R$ 62.00 

*/
public class Bar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        Double ingresso = 0.0;
        Double cerveja = 5.0; 
        Double refrigerante = 3.0;
        Double espetinho = 7.0;
        Double couvert = 4.0;

        System.out.println("Sexo: ");
        String sexo = sc.nextLine();
        System.out.println("Quantidade de cervejas: ");
        Double qntCerveja = sc.nextDouble();
        cerveja *= qntCerveja;
        System.out.println("Quantidade de refrigerantes: ");
        Double qntRefrigerante = sc.nextDouble();
        refrigerante *= qntRefrigerante;
        System.out.println("Quantidade de espetinhos: ");
        Double qntEspetinho = sc.nextDouble();
        espetinho *= qntEspetinho;
        
        if("M".equalsIgnoreCase(sexo)){
            ingresso = 10.0;
        }
        else if("F".equalsIgnoreCase(sexo)){
            ingresso = 8.00;
        }else{
            System.out.println("Escreva o sexo usando M ou F!\nO programa será encerrado!!!");
            System.exit(1);
        }

        Double consumo = cerveja + refrigerante + espetinho;
        
        if(consumo > 30.00){
            Double total = consumo + ingresso;
            System.out.println("Consumo: " + consumo);
            System.out.println("Isento de Couvert");
            System.out.println("Ingresso: " + ingresso);
            System.out.println("-------------\nValor a pagar: " + total);
        }else {
            Double total = consumo + ingresso + couvert;
            System.out.println("Consumo: " + consumo);
            System.out.println("Couvert: " + couvert);
            System.out.println("Ingresso: " + ingresso);
            System.out.println("-------------\nValor a pagar: " + total);
        }

            

    }

   

    
    
    



    
}
