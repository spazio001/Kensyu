package tutorial.action;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.seasar.framework.exception.IORuntimeException;
import org.seasar.struts.annotation.Execute;
import org.seasar.struts.util.ResponseUtil;

public class DownloadAction {

    @Resource
    protected HttpServletResponse response;

    //初期表示
    @Execute(validator = false)
    public String index() {
        return "index.jsp";
    }

    //ダウンロードボタン押下時の処理
    @Execute(validator = false)
    public String download() {
        try {
            ResponseUtil.download(new String(
                "サンプル.txt".getBytes("Shift_JIS"),
                "ISO-8859-1"), "こんにちは".getBytes("Shift_JIS"));
        } catch (IOException e) {
            throw new IORuntimeException(e);
        }
        return null;
    }
}