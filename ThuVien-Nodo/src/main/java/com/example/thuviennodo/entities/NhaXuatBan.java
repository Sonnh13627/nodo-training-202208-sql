package com.example.thuviennodo.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name="NH_SON_NHAXUATBAN", indexes={@Index(name="NH_SON_NHAXUATBAN_MA_IX", columnList="MA", unique=true)})
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NhaXuatBan implements Serializable {
    protected static final String PK = "id";

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "nhaXuatBanSequen", sequenceName = "NHAXUATBAN_SONNH_SEQ")
    @Column(name="ID", unique=true, nullable=false, precision=4)
    private BigDecimal id;
    @Column(name="MA", unique=true, precision=4)
    private BigDecimal ma;
    @Column(name="TEN", length=30)
    private String ten;
    @Column(name="TRANG_THAI", length=10)
    private String trangThai;
    @Column(name="DIA_CHI", length=50)
    private String diaChi;
    @Column(name="MO_TA", length=50)
    private String moTa;

    @JsonIgnore
    @OneToMany(mappedBy="Nhaxuatban")
    private List<Sach> listSach;

}
