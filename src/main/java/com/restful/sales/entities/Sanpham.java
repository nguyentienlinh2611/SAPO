package com.restful.sales.entities;

import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "sanpham")
public class Sanpham {

    @Id
    @Column(name = "idsanpham")
    private int idsanpham;

    @Column(name = "tensanpham")
    private String tensanpham;

    @Column(name = "mausac")
    private String mausac;

    @Column(name = "dungtich")
    private Double dungtich;

    @Column(name = "idloai")
    private int idloai;

    public int getIdloai() {
        return idloai;
    }
// cua t moi column no deu hien ra chu a o dau dong nhu cot ID co
    public void setIdloai(int idloai) {
        this.idloai = idloai;
    }




    public int getIdsanpham() {
        return idsanpham;
    }

    public void setIdsanpham(int idsanpham) {
        this.idsanpham = idsanpham;
    }

    public String getTensanpham() {
        return tensanpham;
    }

    public void setTensanpham(String tensanpham) {
        this.tensanpham = tensanpham;
    }


    public String getMausac() {
        return mausac;
    }

    public void setMausac(String mausac) {
        this.mausac = mausac;
    }



    public Double getDungtich() {
        return dungtich;
    }

    public void setDungtich(Double dungtich) {
        this.dungtich = dungtich;
    }

}
