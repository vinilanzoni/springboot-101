package br.com.lanzoni.dao;

import br.com.lanzoni.domain.Musica;

import java.util.List;

public interface IMusicaDao {

    void salvar(Musica musica);
    List<Musica> recuperarPorPlaylist(long playlistId);
    Musica recuperarPorPlaylistEMusica(long playlistId, long musicaId);
    void atualizar(Musica musica);
    void excluir(long musicaId);
}
