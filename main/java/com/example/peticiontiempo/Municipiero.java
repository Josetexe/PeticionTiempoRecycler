package com.example.peticiontiempo;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name="consulta_municipiero", strict =false)
public class Municipiero {
    @Element(name = "nm")
    private String nombre_municipio;
    @Element(name = "loine")
    private Codigo_Municipio codigo_muni;

    public String getNombre_municipio() {
        return nombre_municipio;
    }

    public void setNombre_municipio(String nombre_municipio) {
        this.nombre_municipio = nombre_municipio;
    }

    public Codigo_Municipio getCodigo_muni() {
        return codigo_muni;
    }

    public void setCodigo_muni(Codigo_Municipio codigo_muni) {
        this.codigo_muni = codigo_muni;
    }

    @Override
    public String toString() {
        return nombre_municipio;
    }

}
