package br.com.bolasdasorte.sorteios.models;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "sorteios_lotofacil")
public class SorteioLotofacil {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private Integer nr_sorteio;
    private Date data_sorteio;
    private String numeros;
    private Date data_proximo_sorteio;
    private Boolean acumulou;
    private String primeiro_premio;
    private String segundo_premio;
    private String terceiro_premio;
    private String quarto_premio;
    private String quinto_premio;
    private String sexto_premio;
    private Integer qnt_primeiro;
    private Integer qnt_segundo;
    private Integer qnt_terceiro;
    private Integer qnt_quarto;
    private Integer qnt_cinco;
    private String nome_img;
    private String url_video;
    private Boolean verify;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNrSorteio() {
        return nr_sorteio;
    }

    public void setNrSorteio(Integer nr_sorteio) {
        this.nr_sorteio = nr_sorteio;
    }

    public Date getData_sorteio() {
        return data_sorteio;
    }

    public void setData_sorteio(Date data_sorteio) {
        this.data_sorteio = data_sorteio;
    }

    public String getNumeros() {
        return numeros;
    }

    public void setNumeros(String numeros) {
        this.numeros = numeros;
    }

    public Date getData_proximo_sorteio() {
        return data_proximo_sorteio;
    }

    public void setData_proximo_sorteio(Date data_proximo_sorteio) {
        this.data_proximo_sorteio = data_proximo_sorteio;
    }

    public Boolean getAcumulou() {
        return acumulou;
    }

    public void setAcumulou(Boolean acumulou) {
        this.acumulou = acumulou;
    }

    public String getPrimeiro_premio() {
        return primeiro_premio;
    }

    public void setPrimeiro_premio(String primeiro_premio) {
        this.primeiro_premio = primeiro_premio;
    }

    public String getSegundo_premio() {
        return segundo_premio;
    }

    public void setSegundo_premio(String segundo_premio) {
        this.segundo_premio = segundo_premio;
    }

    public String getTerceiro_premio() {
        return terceiro_premio;
    }

    public void setTerceiro_premio(String terceiro_premio) {
        this.terceiro_premio = terceiro_premio;
    }

    public String getQuarto_premio() {
        return quarto_premio;
    }

    public void setQuarto_premio(String quarto_premio) {
        this.quarto_premio = quarto_premio;
    }

    public String getQuinto_premio() {
        return quinto_premio;
    }

    public void setQuinto_premio(String quinto_premio) {
        this.quinto_premio = quinto_premio;
    }

    public String getSexto_premio() {
        return sexto_premio;
    }

    public void setSexto_premio(String sexto_premio) {
        this.sexto_premio = sexto_premio;
    }

    public Integer getQnt_primeiro() {
        return qnt_primeiro;
    }

    public void setQnt_primeiro(Integer qnt_primeiro) {
        this.qnt_primeiro = qnt_primeiro;
    }

    public Integer getQnt_segundo() {
        return qnt_segundo;
    }

    public void setQnt_segundo(Integer qnt_segundo) {
        this.qnt_segundo = qnt_segundo;
    }

    public Integer getQnt_terceiro() {
        return qnt_terceiro;
    }

    public void setQnt_terceiro(Integer qnt_terceiro) {
        this.qnt_terceiro = qnt_terceiro;
    }

    public Integer getQnt_quarto() {
        return qnt_quarto;
    }

    public void setQnt_quarto(Integer qnt_quarto) {
        this.qnt_quarto = qnt_quarto;
    }

    public Integer getQnt_cinco() {
        return qnt_cinco;
    }

    public void setQnt_cinco(Integer qnt_cinco) {
        this.qnt_cinco = qnt_cinco;
    }

    public String getNome_img() {
        return nome_img;
    }

    public void setNome_img(String nome_img) {
        this.nome_img = nome_img;
    }

    public String getUrl_video() {
        return url_video;
    }

    public void setUrl_video(String url_video) {
        this.url_video = url_video;
    }

    public Boolean getVerify() {
        return verify;
    }

    public void setVerify(Boolean verify) {
        this.verify = verify;
    }

}
