package desafio;

import java.util.Scanner;

public class DesafioLogicaJava {

	public static void main(String[] args) {

		double valorUni, valorEstoque, aliq, margemLucro, precoFinal, valorImposto, somaC, somaE, somaV;
		String nomeProduto;
		int valorInicio, iniciar, categoria, contador, qtd, quantidadeC, quantidadeE, quantidadeV, limiteContador;
		
		
		Scanner sc = new Scanner(System.in);
		
		valorInicio = 0;
		contador = 0;
		quantidadeC = 0;
		quantidadeE = 0;
		quantidadeV = 0;
		somaC = 0;
		somaE = 0;
		somaV = 0;
		limiteContador = 2;
		System.out.println("Digite 0 para iniciar ou qualquer outra teclar para cancelar");
		iniciar = sc.nextInt();
		
		while (iniciar == valorInicio && contador < limiteContador) { 
			if (iniciar != valorInicio) {
			System.out.println("Finalizando programa.");
		}else {
			if (contador >= limiteContador) {
				System.out.println("Limite de produtos atingido. Finalizando programa");
			} else {
			System.out.println("Digite o nome do produto");
			nomeProduto = sc.next();
			
			System.out.println("Digite a categoria do produto: \n (1) para Cama, Mesa e Banho \n (2) para Eletrodomésticos \n (3) para Vestuário");
			categoria = sc.nextInt();
			
			System.out.println("Digite a quantidade de produtos em estoque");
			qtd = sc.nextInt();
			
			System.out.println("Digite o valor unitário do produto em estoque: R$");
			valorUni = sc.nextDouble();
			
			switch(categoria) {
			case 1:
				aliq = 0.3741;
				margemLucro = 0.30;
				valorImposto = qtd * valorUni * aliq;
				precoFinal = valorUni + (valorUni * aliq);
				valorEstoque = qtd * valorUni;
				somaC = somaC + valorEstoque;
				quantidadeC ++;
				System.out.printf("\nValor do Produto em Estoque: R$ %.2f", valorEstoque);
				System.out.printf("\nValor do Imposto sobre produto: R$ %.2f", valorImposto);
				System.out.printf("\nPreço Final do Produto (com margem de lucro: R$ %.2f)", precoFinal);
				break;
			case 2:
				aliq = 0.4314;
				margemLucro = 0.35;
				valorImposto = qtd * valorUni * aliq;
				precoFinal = valorUni + (valorUni * aliq);
				valorEstoque = qtd * valorUni;
				somaE = somaE + valorEstoque;
				quantidadeE ++;
				System.out.printf("\nValor do Produto em Estoque: R$ %.2f", valorEstoque);
				System.out.printf("\nValor do Imposto sobre produto: R$ %.2f", valorImposto);
				System.out.printf("\nPreço Final do Produto (com margem de lucro: R$ %.2f)", precoFinal);
				break;
			case 3:
				aliq = 0.3842;
				margemLucro = 0.40;
				valorImposto = qtd * valorUni * aliq;
				precoFinal = valorUni + (valorUni * aliq);
				valorEstoque = qtd * valorUni;
				somaV = somaV + valorEstoque;
				quantidadeV ++;
				System.out.printf("\nValor do Produto em Estoque: R$ %.2f", valorEstoque);
				System.out.printf("\nValor do Imposto sobre produto: R$ %.2f", valorImposto);
				System.out.printf("\nPreço Final do Produto (com margem de lucro: R$ %.2f)", precoFinal);				
				break;
			default:
					System.out.println("Categoria Inválida");
			};
			
			contador ++;
			
			System.out.printf("\nQuantidade de itens (1) Cama, Mesa e Banho: " + quantidadeC + ". Valor em estoque: R$ %.2f",somaC);
			System.out.printf("\nQuantidade de itens (2) Eletrodomésticos: " + quantidadeE + ". Valor em estoque: R$ %.2f",somaE);
			System.out.printf("\nQuantidade de itens (3) Vestuário: " + quantidadeV + ". Valor em estoque: R$ %.2f",somaV);
			
			System.out.println("\nProduto "
					+ contador + 
					" Incluído. Digite 0 para incluir mais um ou qualquer outro número para finalizar.\n");
			iniciar = sc.nextInt();
		}
			
			
		};
		
		
		
		sc.close();
	}
}
}