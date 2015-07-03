package tutorial.form;

import java.io.Serializable;

import org.seasar.framework.container.annotation.tiger.Component;
import org.seasar.framework.container.annotation.tiger.InstanceType;

@Component(instance = InstanceType.SESSION)
public class CheckboxForm implements Serializable {

	private static final long serialVersionUID = 1L;

	public boolean check1;

	public boolean check2;

	public String[] check3;

	//初期では「check2」にチェックが入っている状況
	public void initialize() {
		check2 = true;
	}

	//reset()が実行されたときには、チェックなし
	public void reset() {
		check1 = false;
		check2 = false;
	}
}
