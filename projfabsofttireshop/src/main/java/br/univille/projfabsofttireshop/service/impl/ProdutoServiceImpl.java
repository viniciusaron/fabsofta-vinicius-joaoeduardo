package br.univille.projfabsofttireshop.service.impl;

import br.univille.projfabsofttireshop.entity.Produto;
import br.univille.projfabsofttireshop.repository.ProdutoRepository;
import br.univille.projfabsofttireshop.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoServiceImpl implements ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    @Override
    public List<Produto> listarTodos() {
        return produtoRepository.findAll();
    }

    @Override
    public Optional<Produto> buscarPorId(long id) {
        return produtoRepository.findById(id);
    }

    @Override
    public Produto salvar(Produto produto) {
        return produtoRepository.save(produto);
    }

    @Override
    public void excluir(long id) {
        produtoRepository.deleteById(id);
    }

    @Override
    public List<Produto> buscarPorFabricante(String fabricante) {
        return produtoRepository.findByFabricante(fabricante);
    }

    @Override
    public List<Produto> buscarPorLargura(String largura) {
        return produtoRepository.findByLargura(largura);
    }

    @Override
    public List<Produto> buscarPorPerfil(String perfil) {
        return produtoRepository.findByPerfil(perfil);
    }

    @Override
    public List<Produto> buscarPorDiametro(String diametro) {
        return produtoRepository.findByDiametro(diametro);
    }

    @Override
    public List<Produto> buscarPorTipoConstrucao(String tipoConstrucao) {
        return produtoRepository.findByTipoConstrucao(tipoConstrucao);
    }
}