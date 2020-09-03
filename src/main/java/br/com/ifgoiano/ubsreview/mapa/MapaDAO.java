/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifgoiano.ubsreview.mapa;

import java.util.List;

/**
 *
 * @author olive
 */
public interface MapaDAO {
    
    public void salvar(Sismob sismob);

	public void atualizar(Sismob sismob);

	public void excluir(Sismob sismob);

	public Sismob carregar(Integer id);

	public List<Sismob> listar();

        public Sismob buscarPorCoor(float lat, float lng);
}
