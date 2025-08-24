    import java.util.Scanner;
public class desconto {
    public static void main(String[] args){
        /*Uma loja tem uma promoção:
Compras acima de 100 reais têm 10% de desconto.
Compras acima de 200 reais têm 20% de desconto.
Faça um programa que receba o valor da compra e mostre o valor final. */
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor da compra: ");
        //double que pede ao usuario o valor da compra
        double valorCompra = sc.nextDouble();

        //if que verifica se o valor ultrapassa os R$200 e é apto ao desconto de 20% (o maior desconto primeiro)
        if(valorCompra > 200){
            double desconto20 = valorCompra - (valorCompra*0.20);
            System.out.println("Total com 20% de desconto: " + desconto20);
        //else if que verifica se o valor ultrapassa os R$100 e é apto ao desconto de 10%
        }else if(valorCompra > 100){
            double desconto10 = valorCompra - (valorCompra*0.10);
            System.out.println("Total com 10% de desconto: " + desconto10);
        //else que apresenta o valor original dado pelo usuario caso o  valor não ultrapasse R$100
        }else{
            System.out.println("Total: " + valorCompra);
        }
        sc.close();
    }
}
