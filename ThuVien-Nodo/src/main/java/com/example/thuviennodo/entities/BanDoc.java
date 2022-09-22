package com.example.thuviennodo.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="NH_SON_BANDOC", indexes={@Index(name="NH_SON_BANDOC_MA_IX", columnList="MA", unique=true)})
public class BanDoc implements Serializable {
    protected static final String PK = "id";

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "banDocSeq", sequenceName = "BANDOC_SONNH_SEQ")
    @Column(name="ID", unique=true, nullable=false, precision=4)
    private BigDecimal id;
    @Column(name="MA", unique=true, precision=4)
    private BigDecimal ma;
    @Column(name="TEN", length=30)
    private String ten;
    @Column(name="SO_DIEN_THOAI")
    private BigDecimal soDienThoai;
    @Column(name="DIA_CHI", length=50)
    private String diaChi;
    @Column(name="NGAY_SINH")
    private LocalDateTime ngaySinh;
    @Column(name="NGAY_TAO_TAI_KHOAN")
    private LocalDateTime ngayTaoTaiKhoan;
    @Column(name="HANG", length=5)
    private String hang;

    @JsonIgnore
    @OneToMany(mappedBy="Bandoc")
    private List<MuonSach> listMuonsach;
}
