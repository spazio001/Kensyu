package tutorial.action;

import javax.annotation.Resource;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import tutorial.form.AddForm;

public class AddAction {

    //結果出力用の変数
    public Integer result;

    //ActionFormの呼び出し
    @ActionForm
    @Resource
    protected AddForm addForm;

    //初期表示（必須チェックなし）
    @Execute(validator = false)
    public String index() {
        return "index.jsp";
    }

    //submitボタン押下時に、必須（数値）チェックをし、足し算の結果を表示する。
    @Execute(input = "index.jsp")
    public String submit() {
        result = Integer.valueOf(addForm.arg1) + Integer.valueOf(addForm.arg2);
        return "index.jsp";
    }
}