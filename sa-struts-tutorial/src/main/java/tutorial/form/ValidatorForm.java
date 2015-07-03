package tutorial.form;

import org.seasar.struts.annotation.Arg;
import org.seasar.struts.annotation.ByteType;
import org.seasar.struts.annotation.CreditCardType;
import org.seasar.struts.annotation.DateType;
import org.seasar.struts.annotation.DoubleRange;
import org.seasar.struts.annotation.DoubleType;
import org.seasar.struts.annotation.EmailType;
import org.seasar.struts.annotation.FloatRange;
import org.seasar.struts.annotation.FloatType;
import org.seasar.struts.annotation.IntRange;
import org.seasar.struts.annotation.IntegerType;
import org.seasar.struts.annotation.LongRange;
import org.seasar.struts.annotation.LongType;
import org.seasar.struts.annotation.Mask;
import org.seasar.struts.annotation.Maxbytelength;
import org.seasar.struts.annotation.Maxlength;
import org.seasar.struts.annotation.Minbytelength;
import org.seasar.struts.annotation.Minlength;
import org.seasar.struts.annotation.Msg;
import org.seasar.struts.annotation.Required;
import org.seasar.struts.annotation.ShortType;
import org.seasar.struts.annotation.UrlType;
import org.seasar.struts.annotation.Validwhen;

public class ValidatorForm {

    //Byteの必須チェック
    @Required
    @ByteType
    public String byteText;

    //shortの必須チェック
    @Required
    @ShortType
    public String shortText;

    //Intergerの必須チェック
    @Required
    @IntegerType
    public String integerText;

    //longの必須チェック
    @Required
    @LongType
    public String longText;

    //floatの必須チェック
    @Required
    @FloatType
    public String floatText;

    //doubleの必須チェック
    @Required
    @DoubleType
    public String doubleText;

    //dateの必須チェック（フォーマットもチェック）
    @Required
    @DateType(datePattern = "yyyy/MM/dd")
    public String dateText;

    //CreditCardの必須チェック
    @Required
    @CreditCardType
    public String creditcardText;

    //Emailの必須チェック
    @Required
    @EmailType
    public String emailText;

    //Urlの必須チェック
    @Required
    @UrlType
    public String urlText;

    //整数の範囲の必須チェック
    @Required
    @IntRange(min = 3, max = 10)
    public String intRangeText;

    //長整数の範囲の必須チェック
    @Required
    @LongRange(min = 3, max = 10)
    public String longRangeText;

    //Floatの範囲の必須チェック
    @Required
    @FloatRange(min = "3.0", max = "10.0")
    public String floatRangeText;

    //doubleの範囲の必須チェック
    @Required
    @DoubleRange(min = "3.0", max = "10.0")
    public String doubleRangeText;

    //文字の最小桁数の必須チェック
    @Required
    @Minlength(minlength = 3)
    public String minlengthText;

    //文字の最大桁数の必須チェック
    @Required
    @Maxlength(maxlength = 10)
    public String maxlengthText;

    //byte長の最小値の必須チェック
    @Required
    @Minbytelength(minbytelength = 3)
    public String minbytelengthText;

    //byte長の最大値の必須チェック
    @Required
    @Maxbytelength(maxbytelength = 10)
    public String maxbytelengthText;

    //正規表現の必須チェック
    //電話番号のフォーマットチェック
    @Required
    @Mask(mask = "\\d\\d-\\d\\d\\d\\d-\\d\\d\\d\\d", msg = @Msg(key = "errors.phone"), args = @Arg(key = "99-9999-9999", resource = false, position = 1))
    public String phoneText;

    public String validwhen1Text;

    //validwhen1Textがnullまたは入力されていた場合に必須チェックする
    @Validwhen(test = "((validwhen1Text == null) or (*this* != null))", msg = @Msg(key = "errors.required.other"), args = @Arg(key = "validwhen1Text", resource = false, position = 1))
    public String validwhen2Text;

    //初期値の設定
    public void initialize() {
        byteText = "1";
        shortText = "1";
        integerText = "1";
        longText = "1";
        floatText = "1.0";
        doubleText = "1.0";
        dateText = "2008/1/1";
        emailText = "higayasuo@gmail.com";
        urlText = "http://d.hatena.ne.jp/higayasuo";
        intRangeText = "7";
        longRangeText = "7";
        floatRangeText = "7.0";
        doubleRangeText = "7.0";
        minlengthText = "123";
        maxlengthText = "1234567890";
        minbytelengthText = "aaa";
        maxbytelengthText = "aaaaaaaaaa";
        phoneText = "03-9999-9999";
    }
}