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
@Table(name="NH_SON_TACGIA", indexes={@Index(name="NH_SON_TACGIA_MA_IX", columnList="MA", unique=true)})
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TacGia implements Serializable {
    protected static final String PK = "id";

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "tacGiaSequen", sequenceName = "TACGIA_SONNH_SEQ")
    @Column(name="ID", unique=true, nullable=false, precision=4)
    private BigDecimal id;
    @Column(name="MA", unique=true, precision=4)
    private BigDecimal ma;
    @Column(name="TEN", length=30)
    private String ten;
    @Column(name="SDT", precision=38)
    private BigDecimal sdt;
    @Column(name="DIA_CHI", length=50)
    private String diaChi;
    @Column(name="MOTA", length=50)
    private String mota;

    @JsonIgnore
    @OneToMany(mappedBy="Tacgia")
    private List<Sach> listSach;

}
