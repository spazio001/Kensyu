package jp.bric.shainkanriwebapp.entity;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Shainsエンティティクラス
 *
 */
@Entity
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.EntityModelFactoryImpl"}, date = "2015/07/08 17:33:22")
public class Shains implements Serializable {

    private static final long serialVersionUID = 1L;

    /** shainNoプロパティ */
    @Id
    @Column(precision = 19, nullable = false, unique = true)
    public Long shainNo;

    /** shainNameプロパティ */
    @Column(length = 64, nullable = false, unique = false)
    public String shainName;

    /** shainBirthdayプロパティ */
    @Column(nullable = false, unique = false)
    public Date shainBirthday;

    /** shainSexプロパティ */
    @Column(precision = 10, nullable = false, unique = false)
    public Integer shainSex;

    /** shainPostcodeプロパティ */
    @Column(length = 7, nullable = false, unique = false)
    public String shainPostcode;

    /** shainAddressプロパティ */
    @Column(length = 72, nullable = false, unique = false)
    public String shainAddress;

    /** shainTelnoプロパティ */
    @Column(length = 11, nullable = false, unique = false)
    public String shainTelno;

    /** insertTimeプロパティ */
    @Column(nullable = false, unique = false)
    public Timestamp insertTime;

    /** lastUpdateTimeプロパティ */
    @Column(nullable = false, unique = false)
    public Timestamp lastUpdateTime;
}