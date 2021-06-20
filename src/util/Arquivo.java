/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.awt.List;
import java.awt.Menu;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Atletas;

/**
 *
 * @author Leonardo
 */
public class Arquivo {

    public static Atletas[] Read(String Caminho) {
        
        ArrayList<Atletas> atletas = new ArrayList<Atletas>();
        BufferedReader saida = null;
        try {
            if (new File(Caminho).exists()) {
                saida = new BufferedReader(new FileReader(Caminho));
                String linha = saida.readLine();
                while (linha != null) {
                    System.out.println(linha);
                    atletas.add(new Atletas(linha.split(";")));
                    linha = saida.readLine();
                }
                saida.close();
  
            }

        } catch (Exception ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        return (Atletas[]) atletas.toArray(new Atletas[atletas.size()]);
        
        
//        String conteudo = "";
//        try {
//            FileReader arquivo = new FileReader(Caminho);
//            BufferedReader lerArquivo = new BufferedReader(arquivo);
//            String linha = "";
//            try {
//                linha = lerArquivo.readLine();
//                while (linha != null) {
//                    conteudo += linha;
//                    linha = lerArquivo.readLine();
//                }
//                arquivo.close();
//
//            } catch (IOException ex) {
//                conteudo = "Erro: Não foi possível ler arquivo";
//            }
//        } catch (FileNotFoundException ex) {
//            conteudo = "Erro: Arquivo não encontrado!";
//        }
//        if (conteudo.contains("Erro")) {
//       return "";
//        } else {
//         return conteudo;
//        }
    }

    public static boolean Write(String Caminho, String Texto) {
        try {
            FileWriter arquivo = new FileWriter(Caminho, true);
            PrintWriter gravarArquivo = new PrintWriter(arquivo);
            gravarArquivo.println(Texto);
            gravarArquivo.close();
            return true;
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }

}
