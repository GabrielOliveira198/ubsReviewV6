/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifgoiano.ubsreview.mapa;

import br.com.ifgoiano.ubsreview.util.DAOFactory;
import java.util.List;

/**
 *
 * @author olive
 */
public class MapaRN {
    
     private MapaDAO mapaDAO;

    public MapaRN() {
        this.mapaDAO = DAOFactory.criarMapaDAO();
    }

    public Sismob buscarPorCodigo(float lat, float lng) {
        return this.mapaDAO.buscarPorCoor(lat, lng);
    }

    public void salvar(Sismob sismob) {

        this.mapaDAO.salvar(sismob);

    }
    public void excluir(Sismob sismob) {
        this.mapaDAO.excluir(sismob);
    }

    public List<Sismob> listar() {
        return this.mapaDAO.listar();
    }
}
