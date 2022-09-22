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
@Table(name="NH_SON_SACH", indexes={@Index(name="NH_SON_SACH_MA_IX", columnList="MA", unique=true)})
public class Sach implements Serializable {
    protected static final String PK = "id";

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "sachSequen", sequenceName = "SACH_SONNH_SEQ")
    @Column(name="ID", unique=true, nullable=false, precision=4)
    private BigDecimal id;
    @Column(name="MA", unique=true, precision=4)
    private BigDecimal ma;
    @Column(name="TEN", length=30)
    private String ten;
    @Column(name="CHU_DE", length=20)
    private String chuDe;
    @Column(name="NAM_XUAT_BAN")
    private LocalDateTime namXuatBan;
    @Column(name="MOTA", length=50)
    private String mota;
    @Column(name="SO_LUONG_CON_LAI")
    private BigDecimal soLuongConLai;
    @Column(name="SO_LUONG_DANG_MUON")
    private BigDecimal soLuongDangMuon;
    @Column(name="TONG_SO_SACH")
    private BigDecimal tongSoSach;
    @ManyToOne
    @JoinColumn(name="ID_NXB")
    private NhaXuatBan Nhaxuatban;
    @ManyToOne
    @JoinColumn(name="ID_TACGIA")
    private TacGia Tacgia;

    @JsonIgnore
    @OneToMany(mappedBy="Sach")
    private List<MuonSach> listMuonsach;
}
