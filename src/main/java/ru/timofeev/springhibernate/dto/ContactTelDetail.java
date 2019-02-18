package ru.timofeev.springhibernate.dto;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "contact_tel_detail")
@Data
public class ContactTelDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Version
    private int version;

    @Column(name = "TEL_TYPE")
    private String telType;

    @Column(name = "TEL_NUMBER")
    private String telNumber;

    @ManyToOne
    @JoinColumn(name = "CONTACT_ID")
    private Contact contact;

    public ContactTelDetail(String telType, String telNumber) {
        this.telType = telType;
        this.telNumber = telNumber;
    }
}
