package br.com.lanzoni.dao;

import br.com.lanzoni.domain.Playlist;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class PlaylistDao implements IPlaylistDao {

    @PersistenceContext
    private EntityManager em;

    @Override
    public void salvar(Playlist playlist) {
        em.persist(playlist);
    }

    @Override
    public List<Playlist> recuperar() {
        return em.createQuery("SELECT p from Playlist p", Playlist.class).getResultList();
    }

    @Override
    public Playlist recuperarPorId(long id) {
        return em.find(Playlist.class, id);
    }

    @Override
    public void atualizar(Playlist playlist) {
        em.merge(playlist);
    }

    @Override
    public void excluir(long id) {
        em.remove(em.getReference(Playlist.class, id));
    }
}
