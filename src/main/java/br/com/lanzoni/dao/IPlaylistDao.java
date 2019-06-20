package br.com.lanzoni.dao;

import br.com.lanzoni.domain.Playlist;

import java.util.List;

public interface IPlaylistDao {

    void salvar(Playlist playlist);
    List<Playlist> recuperar();
    Playlist recuperarPorId(long id);
    void atualizar(Playlist playlist);
    void excluir(long id);
}
