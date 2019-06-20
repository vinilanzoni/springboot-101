package br.com.lanzoni.dao;

import br.com.lanzoni.domain.Musica;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class MusicaDao implements IMusicaDao {

    @PersistenceContext
    private EntityManager em;

    @Override
    public void salvar(Musica musica) {
        em.persist(musica);
    }

    @Override
    public List<Musica> recuperarPorPlaylist(long playlistId) {
        return em.createQuery("SELECT m FROM Musica m WHERE m.playlist.id = :playlistId", Musica.class)
                .setParameter("playlistId", playlistId)
                .getResultList();
    }

    @Override
    public Musica recuperarPorPlaylistEMusica(long playlistId, long musicaId) {
        return em.createQuery("SELECT m FROM Musica m WHERE m.playlist.id = :playlistId AND m.id = :musicaId" , Musica.class)
                .setParameter("playlistId", playlistId)
                .setParameter("musicaId", musicaId)
                .getSingleResult();
    }

    @Override
    public void atualizar(Musica musica) {
        em.merge(musica);
    }

    @Override
    public void excluir(long musicaId) {
        em.remove(em.getReference(Musica.class, musicaId));
    }
}
