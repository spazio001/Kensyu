package tutorial.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import tutorial.form.ForeachButtonForm;

public class ForeachButtonAction {

    //抽象するリストの宣言
	public List<Map<String, Object>> mapItems = new ArrayList<Map<String, Object>>();

	@ActionForm
	@Resource
	protected ForeachButtonForm foreachButtonForm;

	//リストを作成し、初期表示
	@Execute(validator = false)
	public String index() {
		for (int i = 0; i < 10; i++) {
			Map<String, Object> m = new HashMap<String, Object>();
			m.put("id", i);
			m.put("name", "name" + i);
			mapItems.add(m);
		}
		return "index.jsp";
	}

	//ボタン押下時に実行
	@Execute(validator = false)
	public String result() {
		return "result.jsp";
	}
}