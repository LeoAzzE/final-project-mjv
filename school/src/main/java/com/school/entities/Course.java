package com.school.entities;

import java.io.Serializable;
import java.util.Objects;

public class Course implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private String name;
    private Integer cargaHoraria;
    private Double value;
    private Double notaPrevista;
    private Double notaMinima;

    public Course() {
    }

    public Course(Long id, String name, Integer cargaHoraria, Double value, Double notaPrevista, Double notaMinima) {
        this.id = id;
        this.name = name;
        this.cargaHoraria = cargaHoraria;
        this.value = value;
        this.notaPrevista = notaPrevista;
        this.notaMinima = notaMinima;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Integer cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public Double getNotaPrevista() {
        return notaPrevista;
    }

    public void setNotaPrevista(Double notaPrevista) {
        this.notaPrevista = notaPrevista;
    }

    public Double getNotaMinima() {
        return notaMinima;
    }

    public void setNotaMinima(Double notaMinima) {
        this.notaMinima = notaMinima;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return id.equals(course.id) && Objects.equals(name, course.name) && Objects.equals(cargaHoraria, course.cargaHoraria) && Objects.equals(value, course.value) && Objects.equals(notaPrevista, course.notaPrevista) && Objects.equals(notaMinima, course.notaMinima);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
