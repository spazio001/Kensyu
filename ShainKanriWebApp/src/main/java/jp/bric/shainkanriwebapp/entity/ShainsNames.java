package jp.bric.shainkanriwebapp.entity;

import java.sql.Date;
import java.sql.Timestamp;
import javax.annotation.Generated;
import org.seasar.extension.jdbc.name.PropertyName;

/**
 * {@link Shains}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2015/07/08 17:33:28")
public class ShainsNames {

    /**
     * shainNoのプロパティ名を返します。
     * 
     * @return shainNoのプロパティ名
     */
    public static PropertyName<Long> shainNo() {
        return new PropertyName<Long>("shainNo");
    }

    /**
     * shainNameのプロパティ名を返します。
     * 
     * @return shainNameのプロパティ名
     */
    public static PropertyName<String> shainName() {
        return new PropertyName<String>("shainName");
    }

    /**
     * shainBirthdayのプロパティ名を返します。
     * 
     * @return shainBirthdayのプロパティ名
     */
    public static PropertyName<Date> shainBirthday() {
        return new PropertyName<Date>("shainBirthday");
    }

    /**
     * shainSexのプロパティ名を返します。
     * 
     * @return shainSexのプロパティ名
     */
    public static PropertyName<Integer> shainSex() {
        return new PropertyName<Integer>("shainSex");
    }

    /**
     * shainPostcodeのプロパティ名を返します。
     * 
     * @return shainPostcodeのプロパティ名
     */
    public static PropertyName<String> shainPostcode() {
        return new PropertyName<String>("shainPostcode");
    }

    /**
     * shainAddressのプロパティ名を返します。
     * 
     * @return shainAddressのプロパティ名
     */
    public static PropertyName<String> shainAddress() {
        return new PropertyName<String>("shainAddress");
    }

    /**
     * shainTelnoのプロパティ名を返します。
     * 
     * @return shainTelnoのプロパティ名
     */
    public static PropertyName<String> shainTelno() {
        return new PropertyName<String>("shainTelno");
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
    public static class _ShainsNames extends PropertyName<Shains> {

        /**
         * インスタンスを構築します。
         */
        public _ShainsNames() {
        }

        /**
         * インスタンスを構築します。
         * 
         * @param name
         *            名前
         */
        public _ShainsNames(final String name) {
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
        public _ShainsNames(final PropertyName<?> parent, final String name) {
            super(parent, name);
        }

        /**
         * shainNoのプロパティ名を返します。
         *
         * @return shainNoのプロパティ名
         */
        public PropertyName<Long> shainNo() {
            return new PropertyName<Long>(this, "shainNo");
        }

        /**
         * shainNameのプロパティ名を返します。
         *
         * @return shainNameのプロパティ名
         */
        public PropertyName<String> shainName() {
            return new PropertyName<String>(this, "shainName");
        }

        /**
         * shainBirthdayのプロパティ名を返します。
         *
         * @return shainBirthdayのプロパティ名
         */
        public PropertyName<Date> shainBirthday() {
            return new PropertyName<Date>(this, "shainBirthday");
        }

        /**
         * shainSexのプロパティ名を返します。
         *
         * @return shainSexのプロパティ名
         */
        public PropertyName<Integer> shainSex() {
            return new PropertyName<Integer>(this, "shainSex");
        }

        /**
         * shainPostcodeのプロパティ名を返します。
         *
         * @return shainPostcodeのプロパティ名
         */
        public PropertyName<String> shainPostcode() {
            return new PropertyName<String>(this, "shainPostcode");
        }

        /**
         * shainAddressのプロパティ名を返します。
         *
         * @return shainAddressのプロパティ名
         */
        public PropertyName<String> shainAddress() {
            return new PropertyName<String>(this, "shainAddress");
        }

        /**
         * shainTelnoのプロパティ名を返します。
         *
         * @return shainTelnoのプロパティ名
         */
        public PropertyName<String> shainTelno() {
            return new PropertyName<String>(this, "shainTelno");
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