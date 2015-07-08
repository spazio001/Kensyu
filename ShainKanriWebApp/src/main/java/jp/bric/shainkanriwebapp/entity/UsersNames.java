package jp.bric.shainkanriwebapp.entity;

import java.sql.Timestamp;
import javax.annotation.Generated;
import org.seasar.extension.jdbc.name.PropertyName;

/**
 * {@link Users}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2015/07/08 17:33:28")
public class UsersNames {

    /**
     * loginUserのプロパティ名を返します。
     * 
     * @return loginUserのプロパティ名
     */
    public static PropertyName<String> loginUser() {
        return new PropertyName<String>("loginUser");
    }

    /**
     * loginPasswordのプロパティ名を返します。
     * 
     * @return loginPasswordのプロパティ名
     */
    public static PropertyName<String> loginPassword() {
        return new PropertyName<String>("loginPassword");
    }

    /**
     * roleTypeのプロパティ名を返します。
     * 
     * @return roleTypeのプロパティ名
     */
    public static PropertyName<Integer> roleType() {
        return new PropertyName<Integer>("roleType");
    }

    /**
     * insertTimeのプロパティ名を返します。
     * 
     * @return insertTimeのプロパティ名
     */
    public static PropertyName<Timestamp> insertTime() {
        return new PropertyName<Timestamp>("insertTime");
    }

    /**
     * lastUpdateTimeのプロパティ名を返します。
     * 
     * @return lastUpdateTimeのプロパティ名
     */
    public static PropertyName<Timestamp> lastUpdateTime() {
        return new PropertyName<Timestamp>("lastUpdateTime");
    }

    /**
     * @author S2JDBC-Gen
     */
    public static class _UsersNames extends PropertyName<Users> {

        /**
         * インスタンスを構築します。
         */
        public _UsersNames() {
        }

        /**
         * インスタンスを構築します。
         * 
         * @param name
         *            名前
         */
        public _UsersNames(final String name) {
            super(name);
        }

        /**
         * インスタンスを構築します。
         * 
         * @param parent
         *            親
         * @param name
         *            名前
         */
        public _UsersNames(final PropertyName<?> parent, final String name) {
            super(parent, name);
        }

        /**
         * loginUserのプロパティ名を返します。
         *
         * @return loginUserのプロパティ名
         */
        public PropertyName<String> loginUser() {
            return new PropertyName<String>(this, "loginUser");
        }

        /**
         * loginPasswordのプロパティ名を返します。
         *
         * @return loginPasswordのプロパティ名
         */
        public PropertyName<String> loginPassword() {
            return new PropertyName<String>(this, "loginPassword");
        }

        /**
         * roleTypeのプロパティ名を返します。
         *
         * @return roleTypeのプロパティ名
         */
        public PropertyName<Integer> roleType() {
            return new PropertyName<Integer>(this, "roleType");
        }

        /**
         * insertTimeのプロパティ名を返します。
         *
         * @return insertTimeのプロパティ名
         */
        public PropertyName<Timestamp> insertTime() {
            return new PropertyName<Timestamp>(this, "insertTime");
        }

        /**
         * lastUpdateTimeのプロパティ名を返します。
         *
         * @return lastUpdateTimeのプロパティ名
         */
        public PropertyName<Timestamp> lastUpdateTime() {
            return new PropertyName<Timestamp>(this, "lastUpdateTime");
        }
    }
}