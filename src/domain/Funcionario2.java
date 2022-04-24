package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Programa para reunir pessoas por grupo de sexo.
 * 
 * @author wagne
 * @since 23/04/2022
 */
public class Funcionario2 {

	public static void main(String[] args) {

		Scanner pdc = new Scanner(System.in);

//			ArrayList<Pessoa> listaPessoa = new ArrayList<Pessoa>();
		ArrayList<Pessoa> listaPessoa = new ArrayList<Pessoa>();

		int n = 0;
		System.out.println("\nInforme a(s)  quantidade(s)  de registro(s) que voçê deseja inserir: ");
		n = pdc.nextInt();
		System.out.println("\n");
		System.out
				.println("\nSerão solicitadas  " + n + "  entradas. Informe o primeiro nome da pessoa e o seu sexo. ");
		// System.out.printf("Foram inseridos " + n + " registros. ");

		for (int i = 0; i < n; i++) {
			Pessoa pessoa = new Pessoa();

			System.out.println("\nDigite o primeiro nome: ");
			pessoa.nome = pdc.next();

			System.out.println("\nDigite o seu sexo: 1 para M ou 0 para F:  ");
			pessoa.sexo = pdc.nextInt();
			listaPessoa.add(pessoa);
			// System.out.println("\n\n");
//				listaPessoa.add(pessoa);
			// System.out.println(listaPessoa);

		}
		System.out.println("\n\n");
		System.out.println("*********************************************************************\n");
		// System.out.println("* *\n");
		System.out.println("*                                                                   *\n");
		System.out.println("     Dados processados para agrupar pessoas por tipo de sexo        *\n");
		// System.out.println("* *\n");
		System.out.println("*                                                                   *\n");
		System.out.println("*********************************************************************\n");

//			System.out.println("*********** 1) Dados inseridos pela primeria vez. ***********************\n");
		System.out.println("* 1) Dados inseridos pela primeria vez. ***********************\n");

		System.out.println(listaPessoa);
		System.out.println("\n\n");
		System.out.println("* 2) Lista Ordenada em ORDEM CRESCENTE POR NOME ***********************\n");
		Collections.sort(listaPessoa);
		// System.out.println("Vai dá Certo!!!!!!!!!!!!!!!");
		System.out.println(listaPessoa);
		// System.out.println("\n\n");
		// System.out.println(listaPessoa.size());
		System.out.println("\n\n");
		ComparaSexoPessoa comparaSexoPessoa = new ComparaSexoPessoa();
		// System.out.println("\n* 3) Lista AGRUPADA POR TIPO DO SEXO
		// ********************************* ");
		System.out.println("\n* 3) Lista AGRUPADA POR TIPO DE SEXO MASC.(1) e FEM.(0)  *********************");
		// System.out.println("\n\n");

		Collections.sort(listaPessoa, comparaSexoPessoa);
		System.out.println(" Lista ordenada por tipo do sexo:  " + listaPessoa);

		System.out.println("\n\n");
		System.out.println("\n* 4) Qde. de registros inseridos:  *********************");
		System.out.println("\n\n");
		System.out.printf("Foram inseridos " + listaPessoa.size() + "  registros. ");
		System.out.println("\n\n");
	}

}
