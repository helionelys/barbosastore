/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.barbosasys.jdbc;

import javax.swing.JOptionPane;

/**
 *
 * @author hbarbosa
 */
public class TestarConexao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            new ConexaoBanco().conectar();
            JOptionPane.showMessageDialog(null, "Conectado com sucesso");
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null,"Aconteceu o erro: " +erro);
        }
    }
    
}
