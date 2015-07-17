package jp.bric.shainkanriwebapp.form;

import org.seasar.struts.annotation.Arg;
import org.seasar.struts.annotation.IntegerType;
import org.seasar.struts.annotation.Required;

public class SearchForm {
	// 必須チェック
	@Required(arg0 = @Arg(key = "labels.shainNo") )
	@IntegerType
	public String shainNo;

	// 必須チェック
	@Required(arg0 = @Arg(key = "labels.shainName") )
	public String shainName;

	// 必須チェック
	@Required(arg0 = @Arg(key = "labels.shainBirthday") )
	// @DateType(datePatternStrict = "yyyy/MM/dd")
	public String shainBirthday;

	// 必須チェック
	// @Required(arg0 = @Arg(key = "labels.shainSex") )
	public String shainSex;

	// 必須チェック
	// @Required(arg0 = @Arg(key = "labels.shainPost1") )
	// public String shainPost1;

	// 必須チェック
	// @Required(arg0 = @Arg(key = "labels.shainPost2") )
	// public String shainPost2;

	// 必須チェック
	@Required(arg0 = @Arg(key = "labels.shainPostcode") )
	public String shainPostcode;

	// 必須チェック
	@Required(arg0 = @Arg(key = "labels.shainAddress") )
	public String shainAddress;

	// 必須チェック
	@Required(arg0 = @Arg(key = "labels.shainTelno") )
	public String shainTelno;

	public String age;

}
