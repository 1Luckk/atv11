/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 * @author Lucas da Silva Cardoso - 11211102438
 * @author Victor Ferreira Silva  - 11211100596
 */
public class Aluno {
    private String nome;
    private String snome;
    private String data;
    private String sexo;
    private int RGM;
    private String curso;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSnome() {
        return snome;
    }
    public void setSnome(String snome) {
        this.snome = snome;
    }

    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }

    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getRGM() {
        return RGM;
    }
    public void setRGM(int RGM) {
        this.RGM = RGM;
    }

    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    } 
}