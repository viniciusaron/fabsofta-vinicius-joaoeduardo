package br.univille.projfabsofttireshop.service;

import br.univille.projfabsofttireshop.entity.Produto;

import java.util.List;
import java.util.Optional;

public interface ProdutoService {
    List<Produto> listarTodos();
    Optional<Produto> buscarPorId(long id);
    Produto salvar(Produto produto);
    void excluir(long id);
    List<Produto> buscarPorFabricante(String fabricante);
    List<Produto> buscarPorLargura(String largura);
    List<Produto> buscarPorPerfil(String perfil);
    List<Produto> buscarPorDiametro(String diametro);
    List<Produto> buscarPorTipoConstrucao(String tipoConstrucao);
}