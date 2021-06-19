/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Leonardo
 */
public class Arquivo {

    public static String Read(String Caminho) {
        String conteudo = "";
        try {
            FileReader arquivo = new FileReader(Caminho);
            BufferedReader lerArquivo = new BufferedReader(arquivo);
            String linha = "";
            try {
                linha = lerArquivo.readLine();
                while (linha != null) {
                    conteudo += linha;
                    linha = lerArquivo.readLine();
                }
                arquivo.close();

            } catch (IOException ex) {
                conteudo = "Erro: Não foi possível ler arquivo";
            }
        } catch (FileNotFoundException ex) {
            conteudo = "Erro: Arquivo não encontrado!";
        }
        if (conteudo.contains("Erro")) {
            return "";
        } else {
            return conteudo;
        }
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
