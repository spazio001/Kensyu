package jp.bric.shainkanriwebapp.entity;

import javax.annotation.Generated;
import jp.bric.shainkanriwebapp.entity.ShainsNames._ShainsNames;
import jp.bric.shainkanriwebapp.entity.UsersNames._UsersNames;

/**
 * 名前クラスの集約です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.NamesAggregateModelFactoryImpl"}, date = "2015/07/08 17:33:28")
public class Names {

    /**
     * {@link Shains}の名前クラスを返します。
     * 
     * @return Shainsの名前クラス
     */
    public static _ShainsNames shains() {
        return new _ShainsNames();
    }

    /**
     * {@link Users}の名前クラスを返します。
     * 
     * @return Usersの名前クラス
     */
    public static _UsersNames users() {
        return new _UsersNames();
    }
}