package br.gov.mec.negocio;

import com.google.gson.annotations.Expose;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by brunocesar on 08/02/17.
 */
@Entity
@Table(name = "Area_de_Conhecimento")
public class AreaConhecimento {

    @Expose
    @Column(name = "Grande_Area")
    private String grandeArea;

    @Expose
    @Column(name = "Area")
    private String area;

    @Column(name = "Subarea")
    private String subarea;


}
