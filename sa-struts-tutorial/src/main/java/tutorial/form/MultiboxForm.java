package tutorial.form;

import java.io.Serializable;

import org.seasar.framework.container.annotation.tiger.Component;
import org.seasar.framework.container.annotation.tiger.InstanceType;

@Component(instance = InstanceType.SESSION)
public class MultiboxForm implements Serializable {

	private static final long serialVersionUID = 1L;

	public String[] check1;

	public String[] check2;

	//初期地の設定
	public void initialize() {
		check1 = new String[] { "2" };
		check2 = new String[0];
	}

	//check選択していない状態にする
	public void reset() {
		check1 = new String[0];
	}

	//check2を選択していない状態にする
	public void reset2() {
		check2 = new String[0];
	}
}