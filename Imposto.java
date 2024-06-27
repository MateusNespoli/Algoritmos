/*  Para calcular o imposto de renda que uma pessoa deve pagar, um país aplica as seguintes regras: 
1) Imposto sobre salário: a pessoa paga imposto sobre seu salário conforme tabela ao lado 

Salário MENSAL   |   Imposto
Abaixo de 3000   |   por mês Isento
3000 até 5000    |   exclusive 10%
5000 ou acima    |   20%

2) Se a pessoa obteve renda com prestação de serviços, o imposto cobrado é de 15%. 
3) Se a pessoa obteve ganho de capital (imóveis, ações, etc.), o imposto cobrado é de 20%. 
4) A pessoa pode abater até 30% do seu imposto bruto devido com gastos médicos ou educacionais. Mas 
se seus gastos médicos e educacionais forem abaixo desses 30%, apenas os gastos médicos e 
educacionais podem ser abatidos. 
Fazer um programa para ler quanto a pessoa obteve de renda anual com salário, prestação de serviço e 
ganho de capital. Leia também quando a pessoal teve de gastos médicos e educacionais no ano. Seu 
programa deverá então produzir um relatório de imposto de renda dessa pessoa conforme exemplos. 
Considere a renda mensal com salário como sendo a renda anual dividida por 12. 

EXEMPLO 1:                                          EXEMPLO 2: 
Renda anual com salário: 48000.00                   Renda anual com salário: 189000.00 
Renda anual com prestação de serviço: 0.00          Renda anual com prestação de serviço: 55184.93
Renda anual com ganho de capital: 800.00            Renda anual com ganho de capital: 20000.00
Gastos médicos: 400.00                              Gastos médicos: 600.00
Gastos educacionais: 5400.00                        Gastos educacionais: 7500.00
RELATÓRIO DE IMPOSTO DE RENDA                       RELATÓRIO DE IMPOSTO DE RENDA 
CONSOLIDADO DE RENDA:                               CONSOLIDADO DE RENDA: 
Imposto sobre salário: 4800.00                      Imposto sobre salário: 37800.00 
Imposto sobre serviços: 0.00                        Imposto sobre serviços: 8277.74 
Imposto sobre ganho de capital: 160.00              Imposto sobre ganho de capital: 4000.00    
DEDUÇÕES:                                           DEDUÇÕES: 
Máximo dedutível: 1488.00                           Máximo dedutível: 15023.32 
Gastos dedutíveis: 5800.00                          Gastos dedutíveis: 8100.00 
RESUMO:                                             RESUMO: 
Imposto bruto total: 4960.00                        Imposto bruto total: 50077.74 
Abatimento: 1488.00                                 Abatimento: 8100.00 
Imposto devido: 3472.00                             Imposto devido: 41977.74 
 */
import java.util.Scanner;


public class Imposto {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Renda anual com salario: ");
        Double rendaSalario = sc.nextDouble();
        calcDouble(rendaSalario);
        System.out.println("Renda anual com prestação de serviço: ");
        Double rendaServico = sc.nextDouble();
        calcServico(rendaServico);
        System.out.println("Renda anual com ganho de capital: ");
        Double rendaCapital = sc.nextDouble();
        calcCapital(rendaCapital);
        System.out.println("Gastos médicos: ");
        Double gastosMedicos = sc.nextDouble();
        System.out.println("Gastos educacionais: ");
        Double gastosEducacionais = sc.nextDouble();

        System.out.println("---RELATORIO DE IMPOSTO DE RENDA----------");
        System.out.println(calcDouble(rendaSalario));
        System.out.println(calcServico(rendaServico));
        System.out.println(calcCapital(rendaCapital));

        System.out.println("---DEDUÇÕES---------");  
        Double maxDedutivel = gastosMedicos + gastosEducacionais;
        Double gastoDedutivel = (calcDouble(rendaSalario) + calcServico(rendaServico) + calcCapital(rendaCapital)) * 0.3;
        calcDeducao(maxDedutivel, gastoDedutivel);
        System.out.println(gastoDedutivel);
        System.out.println(maxDedutivel);

        System.out.println("---RESUMO---------");
        Double impostoBruto = calcDouble(rendaSalario) + calcServico(rendaServico) + calcCapital(rendaCapital);
        Double impostoDevido = impostoBruto - calcDeducao(maxDedutivel, gastoDedutivel);
        System.out.println(impostoBruto);
        System.out.println(calcDeducao(maxDedutivel, gastoDedutivel));
        System.out.println(impostoDevido);
        
    }

    public static Double calcDouble (Double rendaSalario){
        Double impostoSalario;
        if(rendaSalario < 36000.00){
            impostoSalario = 0.0;
        }else if(rendaSalario >= 36000.00 && rendaSalario <= 60000.00){
            impostoSalario = rendaSalario * 0.1;
        }else {
            impostoSalario = rendaSalario * 0.2;
        }
        return impostoSalario;
    }

    public static Double calcServico (Double rendaServico){
        Double impostoServico;
        impostoServico = rendaServico * 0.15;
        return impostoServico;
    }

    public static Double calcCapital (Double rendaCapital){
        Double impostoCapital;
        impostoCapital = rendaCapital * 0.20;
        return impostoCapital;
    }
    
    public static Double calcDeducao (Double maxDedutivel, Double gastoDedutivel){
        if(maxDedutivel < gastoDedutivel){
            return maxDedutivel;
        }
        return gastoDedutivel;
    }
    
}

    