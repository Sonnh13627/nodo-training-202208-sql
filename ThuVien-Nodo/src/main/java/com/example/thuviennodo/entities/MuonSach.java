package com.example.thuviennodo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity(name="NH_SON_MUONSACH")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MuonSach implements Serializable {
    protected static final String PK = "id";

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "muonSachSequen", sequenceName = "MUONSACH_SONNH_SEQ")
    @Column(name="ID", unique=true, nullable=false, precision=4)
    private BigDecimal id;
    @Column(name="SO_LUONG")
    private BigDecimal soLuong;
    @Column(name="NGAY_GIO_MUON")
    private LocalDateTime ngayGioMuon;
    @Column(name="NGAY_GIO_TRA")
    private LocalDateTime ngayGioTra;
    @Column(name="TRANG_THAI", length=10)
    private String trangThai;
    @Column(name="GHI_CHU", length=50)
    private String ghiChu;
    @ManyToOne
    @JoinColumn(name="ID_BAN_HOC")
    private BanDoc Bandoc;
    @ManyToOne
    @JoinColumn(name="ID_SACH")
    private Sach Sach;
}
