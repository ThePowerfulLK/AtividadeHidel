/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.JOptionPane;
import util.Arquivo;

/**
 *
 * @author Leonardo
 */
public class MainClass {

    public static void main(String[] args) {
        //  String arquivo = "Atletas.txt";

        Arquivo arquivo = new Arquivo();

        Path caminho = Paths.get("Atletas.dat");
        try {
            byte[] texto = Files.readAllBytes(caminho);
            String leitura = new String(texto);

            JOptionPane.showMessageDialog(null, leitura);

        } catch (Exception erro) {

        }

//        arquivo.Read("Atletas.dat");
    }
}
