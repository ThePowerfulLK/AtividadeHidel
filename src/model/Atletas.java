

package model;

import java.util.Objects;

/**
 *
 * @author Leonardo
 */
public class Atletas {

    private String nome;
    private int idade;
    private boolean sexo;
    private String categoria;
    private String faixa;
    private float peso, altura;

    public Atletas() {
    }
    
    public Atletas(String nome, int idade, boolean sexo, String categoria, String faixa, float peso, float altura) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.categoria = categoria;
        this.faixa = faixa;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean isSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getFaixa() {
        return faixa;
    }

    public void setFaixa(String faixa) {
        this.faixa = faixa;
    }

    @Override
    public String toString() {
        return "Atletas{" + "nome=" + nome + ", categoria=" + categoria + ", faixa=" + faixa + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Atletas other = (Atletas) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return true;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    
}
