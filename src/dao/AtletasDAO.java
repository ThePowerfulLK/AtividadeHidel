package dao;

import java.awt.FileDialog;
import java.io.*;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import model.Atletas;
import util.Arquivo;
import view.FrmCadastro;

/**
 *
 * @author Leonardo
 */
public class AtletasDAO {

    private final Arquivo arq;
    private FileDialog fdAbrir, fdSalvar;
    
    public AtletasDAO(){
        arq = new Arquivo();
    }
    
    public void insert(Atletas atletas) {
      //  try {
            /*PrintWriter out = new PrintWriter(txtNome.getText() + ".txt");
            out.println("Nome: " + txtNome.getText());
            out.println("Idade: " + txtIdade.getText());
            out.println("Sexo: " + txtSexo.getText());
            // out.println(txtCategoria.getText());
            out.println("Faixa: " + txtFaixa.getText());
            out.close();
            JOptionPane.showMessageDialog(null, "Arquivo Gravado com Sucesso!!");
        } catch (IOException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao gravar arquivo!!" + erro);
        }*/
          //  PreparedStatement ps = arq.Write(Caminho, Texto);
        
   // }catch{}


}}
