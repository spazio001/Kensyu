package tutorial.form;

import java.io.Serializable;

import org.seasar.framework.container.annotation.tiger.Component;
import org.seasar.framework.container.annotation.tiger.InstanceType;
import org.seasar.struts.annotation.Required;

@Component(instance = InstanceType.SESSION)
public class SessionForm implements Serializable {

	private static final long serialVersionUID = 1L;

	//テキストフィールドの必須チェック
	@Required
	public String first;

    //テキストフィールドの必須チェック(secondに値が入力されているかを検証)
	@Required(target = "goThird")
	public String second;
}