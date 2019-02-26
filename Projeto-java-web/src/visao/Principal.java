package visao;

import java.util.ArrayList;
import java.util.Scanner;

import modelo.Carro;
import modelo.Endereço;
import modelo.Moto;
import modelo.Pessoa;
import modelo.PessoaFisica;
import modelo.PessoaJuridica;
import modelo.Trator;
import modelo.Veiculo;

public class Principal {

	public static void main(String[] args) {

		ArrayList<Veiculo> Veiculo = new ArrayList();
		ArrayList<Pessoa> Pessoa = new ArrayList();
		ArrayList<PessoaJuridica> PessoaJuridica = new ArrayList();
		ArrayList<PessoaFisica> PessoaFisica = new ArrayList();

		Scanner teclado = new Scanner(System.in);

		Carro carro = new Carro(null, null, null, null, null);
		Endereço endereço = new Endereço(null, null, null, null);
		Moto moto = new Moto(null, null, null, null, null);
		Pessoa pessoa = new Pessoa(null, null);
		Trator trator = new Trator(null, null, null, null, null, null);

		int opcao;
		int opcao2;
		int opcao3;
		int opcao4 = 0;

		do {
			System.out.println("---------------------------------------------------------");
			System.out.println("Sistema de locação de veiculos");
			System.out.println("---------------------------------------------------------");
			System.out.println("--------------------------------");
			System.out.println("\t Seja bem-vindo!!!");
			System.out.println("--------------------------------");
			System.out.println("1-Realizar locação de veiculos");
			System.out.println("2-Cadastrar veiculo");
			System.out.println("3-Cadastro de cliente");
			System.out.println("4-Encerrar");
			System.out.println("---------------------------------");
			System.out.println("Escolha uma das opções acima");
			opcao = teclado.nextInt();

			switch (opcao) {
			case 1:
				do {
					System.out.println("--------------------------------");
					System.out.println("1-Consultar veiculos disponiveis");
					System.out.println("2-Alugar carro ");
					System.out.println("3-voltar");
					System.out.println("---------------------------------");
					System.out.println("Escolha uma das opções acima");

					opcao2 = teclado.nextInt();
					switch (opcao2) {
					case 1:
						if (Veiculo.isEmpty()) {
							System.out.println("Nenhum veiculo cadastrado");
						} else {
							for (int i = 0; i < Veiculo.size(); i++) {
								System.out.println("--------------------------");
								System.out.println("\t Grupo De Pesquisa: ");
								System.out.println(Veiculo.get(i).toString());
								System.out.println("---------------------------");

							}
						}
						break;

					case 2:
						if (Veiculo.isEmpty()) {
							System.out.println("Nenhum veiculo cadastrado");
						}
						break;
					}
				} while (opcao2 != 3);
				break;

			case 2:
				do {
					System.out.println("--------------------------------");
					System.out.println("1-Cadastrar veiculos");
					System.out.println("2-Listar veiculos");
					System.out.println("3-Voltar");
					System.out.println("---------------------------------");
					System.out.println("Escolha uma das opções acima");
					opcao3 = teclado.nextInt();

					switch (opcao3) {

					case 1:
						Veiculo veiculo = new Veiculo(null, null, null, null);
						Scanner entrada = new Scanner(System.in);
						System.out.println("Digite a cor do veiculo:");
						veiculo.setCor(entrada.next());
						entrada.nextLine();

						System.out.println("Digite o modelo do veiculo");
						veiculo.setModelo(entrada.nextLine());

						System.out.println("Digite a marcao do veiculo");
						veiculo.setMarca(entrada.nextLine());

						System.out.println("Digite o ano do veiculo");
						veiculo.setAno(entrada.nextLine());

						Veiculo.add(veiculo);
						break;
					case 2:
						if (Veiculo.isEmpty()) {

							System.out.println("Nenhuma informação cadastrada!");

						} else {

							for (int i = 0; i < Veiculo.size(); i++) {
								System.out.println("--------------------------");
								System.out.println("\t Veiculo: ");
								System.out.println(Veiculo.get(i).toString());
								System.out.println("---------------------------");
							}

						}
						break;
					}

				} while (opcao3 != 3);
				break;
			case 3:
				do {
					System.out.println("--------------------------------");
					System.out.println("1-Cadastrar clientes");
					System.out.println("2-Listar clientes");
					System.out.println("3-Voltar");
					System.out.println("---------------------------------");
					System.out.println("Escolha uma das opções acima");
					opcao4 = teclado.nextInt();

					switch (opcao4) {
					case 1:
						do {
							System.out.println("--------------------------------");
							System.out.println("1-Pessoa fisica");
							System.out.println("2-Pessoa juridica");
							System.out.println("3-Voltar");
							System.out.println("---------------------------------");
							System.out.println("Escolha uma das opções acima");

							opcao4 = teclado.nextInt();

							switch (opcao4) {
							case 1:
								PessoaFisica pfisica = new PessoaFisica(null, null, null);
								Scanner entrada2 = new Scanner(System.in);
								System.out.println("Digite o CPF do cliente:");
								pfisica.setCPF(entrada2.next());
								entrada2.nextLine();

								System.out.println("Digite o nome do cliente");
								pfisica.setNome(entrada2.nextLine());

								System.out.println("Digite o Email do cliente");
								pfisica.setEmail(entrada2.nextLine());

								PessoaFisica.add(pfisica);
								break;

							case 2:
								PessoaJuridica pjuridica = new PessoaJuridica(null, null, null, null);
								Scanner entrada3 = new Scanner(System.in);
								System.out.println("Digite o CNPJ do cliente:");
								pjuridica.setCNPJ(entrada3.next());
								entrada3.nextLine();

								System.out.println("Digite o nome do cliente");
								pjuridica.setNome(entrada3.nextLine());

								System.out.println("Digite o Email do cliente");
								pjuridica.setEmail(entrada3.nextLine());

								System.out.println("Digite o nome fantasia do cliente");
								pjuridica.setNomeFantasia(entrada3.nextLine());

								PessoaJuridica.add(pjuridica);
								break;

							}

						} while (opcao4 != 3);
					case 2:
						if (PessoaJuridica.isEmpty() || PessoaJuridica.isEmpty()) {

							System.out.println("Nenhuma informação cadastrada!");

						} else {

							for (int i = 0; i < PessoaJuridica.size(); i++) {
								System.out.println("--------------------------");
								System.out.println("\t Pessoa Juridica: ");
								System.out.println(PessoaJuridica.get(i).toString());
								System.out.println("---------------------------");
							}
							for (int i = 0; i < PessoaFisica.size(); i++) {
								System.out.println("--------------------------");
								System.out.println("\t Pessoa Fisica: ");
								System.out.println(PessoaFisica.get(i).toString());
								System.out.println("---------------------------");
							}

						}
						break;

					}

				} while (opcao4 != 4);
			case 4:
				System.out.println("Programa finalizado...");

			}
		} while (opcao != 4);

	}
}