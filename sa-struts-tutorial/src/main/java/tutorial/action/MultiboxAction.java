package tutorial.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import tutorial.form.MultiboxForm;

public class MultiboxAction {

	public List<Map<String, String>> check2List;

	@ActionForm
	@Resource
	protected MultiboxForm multiboxForm;

	//初期表示
	@Execute(validator = false)
	public String index() {
		multiboxForm.initialize();
		return "index.jsp";
	}

	//エラーの場合、reset()メソッドを実行
	//submit押下時に実行
	@Execute(validator = false, reset = "reset")
	public String submit() {
		setupCheck2List();
		return "submit.jsp";
	}

    //エラーの場合、reset2()メソッドを実行
    //submit2押下時に実行
	@Execute(validator = false, reset = "reset2")
	public String submit2() {
		return "submit2.jsp";
	}

	//submit.jspでの選択リストの作成
	protected void setupCheck2List() {
		check2List = new ArrayList<Map<String, String>>();
		for (int i = 1; i <= 3; i++) {
			Map<String, String> m = new HashMap<String, String>();
			m.put("value", String.valueOf(i));
			m.put("label", "label" + i);
			check2List.add(m);
		}
	}
}