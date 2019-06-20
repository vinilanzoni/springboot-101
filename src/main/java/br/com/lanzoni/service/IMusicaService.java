package br.com.lanzoni.service;

import br.com.lanzoni.domain.Musica;

import java.util.List;

public interface IMusicaService {

    void salvar(Musica musica, long playlistId);
    List<Musica> recuperarPorPlaylistId(long playlistId);
    Musica recuperarPorPlaylistIdEMusicaId(long playlistId, long musicaId);
    void atualizar(Musica musica, long playlistId);
    void excluir(long playlistId, long musicaId);

}
