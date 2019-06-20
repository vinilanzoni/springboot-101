package br.com.lanzoni.service;

import br.com.lanzoni.domain.Playlist;

import java.util.List;

public interface IPlaylistService {

    void salvar(Playlist playlist);
    List<Playlist> recuperar();
    Playlist recuperarPorId(long id);
    void atualizar(Playlist playlist);
    void excluir(long id);

}
