package tutorial.form;

import org.seasar.struts.annotation.IntegerType;
import org.seasar.struts.annotation.Required;

public class AddForm {

    //args1がInterger型でかつ、入力チェック
    @Required
    @IntegerType
    public String arg1;

    //args2がInterger型でかつ、入力チェック
    @Required
    @IntegerType
    public String arg2;
}
