package principal;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import model.bo.ClienteBO;
import model.dao.ClienteDAO;
import model.dao.EnderecoDAO;
import model.vo.Cliente;
import model.vo.Endereco;
import model.vo.Telefone;


public class Executavel {

	public static void main(String[] argumentosLinhaDeComando) {
				ArrayList<Telefone> telefones = new ArrayList<Telefone>();

				// Exerc�cio 2
				Cliente cliente1 = obterClienteDaTela();

				// - Salvar no banco (APENAS TESTES, AINDA VIOLANDO O MVC)
				ClienteBO clienteBO = new ClienteBO();
				String mensagem = clienteBO.salvar(cliente1);

				JOptionPane.showMessageDialog(null, mensagem);

			}

			private static Cliente obterClienteDaTela() {
				String nome = JOptionPane.showInputDialog("Informe o nome");
				String sobrenome = JOptionPane.showInputDialog("Informe o sobrenome");
				String cpf = JOptionPane.showInputDialog("Informe o CPF");

				EnderecoDAO endDAO = new EnderecoDAO();
				ArrayList<Endereco> listaEnderecos = endDAO.consultarTodos();
				
				Object[] enderecos = listaEnderecos.toArray();
				Endereco enderecoSelecionado = (Endereco) JOptionPane.showInputDialog(null, 
						"Selecione um endere�o", "Endere�o", 
						JOptionPane.QUESTION_MESSAGE, 
						null, enderecos, null);

				Cliente novoCliente = new Cliente(nome, sobrenome, cpf, 
						new ArrayList<Telefone>(), enderecoSelecionado);

				return novoCliente;
			

	}

}
