/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package storm;

import java.io.File;
import java.util.ArrayList;
import Arquivo.Arquivo;
import java.util.Date;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.PieChart.Data;
/**
 *
 * @author matheus
 */

public class Usuario extends Arquivo{
    //ATRIBUTOS
    
    //Obrigatórios.
    private String nome;
    private String sobrenome; 
    private String login;
    private String senha;
    //Fim Obrigatórios.
    
    //Opcionais (podemos ou não inserir/usar essas informações).
    private String email;
    private Date nascimento;            
    private String nacionalidade;           //Profissional ou estudante.
 
    
    //MÉTODOS DE ALTERAÇÃO

    public Usuario(String nome , String sobrenome ,Date nasc ,String nacional , String email ,String login, String senha  ) {
    
    this.nome=nome;
    this.sobrenome=sobrenome;
    this.nascimento=nasc;
    this.nacionalidade=nacionalidade;
    this.email=email;
    this.login=login;
    this.senha=senha;
    
    }
    
    public  Usuario(){
    }
    
    
    
 
    
       //Implementando a interface de arquivo 
      @Override
    public String toString() {
        String texto;

        texto = "" + getNome() + getSobrenome();

        return (texto);
    }

    protected String ArquivoNome() {
        String s = DiretorioNome() + "Usuario_" + this.getNome() + ".Usuario";
        return s;
    }

    protected String DiretorioNome() {
        String s = "Arquivos" + File.separator + "Usuario" + File.separator;
        return s;
    }

    public Usuario Load(String nome) {
        File arquivo = new File(DiretorioNome() + nome);
        Usuario t = null;

        try {
            t = LoadFile(arquivo);
        } catch (ClassNotFoundException ex) {
            throw ex;
        } finally {
            return t;
        }
    }

    public ArrayList<Usuario> LoadAll() {
        ArrayList<Usuario> t = null;

        try {
            t = LoadAllFiles();
        } catch (ClassNotFoundException ex) {
            throw ex;
        } finally {
            return t;
        }
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the sobrenome
     */
    public String getSobrenome() {
        return sobrenome;
    }

    /**
     * @param sobrenome the sobrenome to set
     */
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    /**
     * @return the login
     */
    public String getLogin() {
        return login;
    }

    /**
     * @param login the login to set
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the nascimento
     */
    public Date getNascimento() {
        return nascimento;
    }

    /**
     * @param nascimento the nascimento to set
     */
    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    /**
     * @return the nacionalidade
     */
    public String getNacionalidade() {
        return nacionalidade;
    }

    /**
     * @param nacionalidade the nacionalidade to set
     */
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
}
