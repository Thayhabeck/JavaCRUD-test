import java.util.Date;

import br.com.crud.dao.ContatoDAO;
import br.com.crud.model.Contato;

public class TesteCrud {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ContatoDAO contatoDAO = new ContatoDAO();

		// Cria um contato e salva no banco
		/*Contato contato = new Contato();
		contato.setNome("Maria");
		contato.setIdade(22);
		contato.setDataCadastro(new Date());

		contatoDAO.save(contato);
		
		
		contatoDAO.romoveById(3);
		*/
		
		Contato contato = new Contato();
		contato.setId(2);
		contato.setNome("Maria");
		contato.setIdade(28);
		contato.setDataCadastro(new Date());
		
		contatoDAO.update(contato);
		
		
		for(Contato c : contatoDAO.getContatos()) {
			System.out.println("NOME: " + c.getNome());
		}

	}

}
