package br.com.sampaio.Cad_Project.dao;

import br.com.sampaio.Cad_Project.domain.Cliente;

import java.util.Collection;

public interface IClientDAO {

    public Boolean cadastrar(Cliente cliente);
    public void excluir(Long cpf);
    public void alterar(Cliente cliente);
    public Cliente consultar(Long cpf);
    public Collection<Cliente> buscarTodos();
}
