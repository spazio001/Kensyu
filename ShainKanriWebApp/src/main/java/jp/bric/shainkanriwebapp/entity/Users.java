package jp.bric.shainkanriwebapp.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Usersエンティティクラス
 * 
 */
@Entity
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.EntityModelFactoryImpl"}, date = "2015/07/08 17:33:23")
public class Users implements Serializable {

    private static final long serialVersionUID = 1L;

    /** loginUserプロパティ */
    @Id
    @Column(length = 16, nullable = false, unique = true)
    public String loginUser;

    /** loginPasswordプロパティ */
    @Column(length = 16, nullable = false, unique = false)
    public String loginPassword;

    /** roleTypeプロパティ */
    @Column(precision = 10, nullable = false, unique = false)
    public Integer roleType;

    /** insertTimeプロパティ */
    @Column(nullable = false, unique = false)
    public Timestamp insertTime;

    /** lastUpdateTimeプロパティ */
    @Column(nullable = false, unique = false)
    public Timestamp lastUpdateTime;
}