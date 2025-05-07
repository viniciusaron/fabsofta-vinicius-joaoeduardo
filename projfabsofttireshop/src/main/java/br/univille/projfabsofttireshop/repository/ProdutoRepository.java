package br.univille.projfabsofttireshop.repository;

import br.univille.projfabsofttireshop.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    List<Produto> findByFabricante(String fabricante);
    List<Produto> findByLargura(String largura);
    List<Produto> findByPerfil(String perfil);
    List<Produto> findByDiametro(String diametro);
    List<Produto> findByTipoConstrucao(String tipoConstrucao);
}