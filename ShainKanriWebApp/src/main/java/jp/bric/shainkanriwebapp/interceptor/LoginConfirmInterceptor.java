package jp.bric.shainkanriwebapp.interceptor;

import javax.annotation.Resource;

import org.aopalliance.intercept.MethodInvocation;
import org.seasar.framework.aop.interceptors.AbstractInterceptor;
import org.seasar.struts.annotation.Execute;

import jp.bric.shainkanriwebapp.dto.UserDataDto;

public class LoginConfirmInterceptor extends AbstractInterceptor {

	private static final long serialVersionUID = 1L;

	/**
	 * セッションに保持されているデータです。
	 */
	@Resource
	protected UserDataDto userDataDto;

	/**
	 * AbstractInterceptorを継承する際に、実装する必要のあるメソッド。
	 * 割り込ませる処理を記述。
	 */
	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		// 両方の条件を満たしていない場合、Loginページへ飛ばす。
		return (!isExecuteMethod(invocation) || isLoggedIn()) ? invocation
				.proceed() : "/login/";
	}

	/**
	 * 実行されたActionに@Executeがついていたかどうか。
	 * @param invocation
	 * @return アノテーションがついていればtrue
	 * Actionの実行前のため、意味がない。（今回）
	 */
	private boolean isExecuteMethod(MethodInvocation invocation) {
		return invocation.getMethod().isAnnotationPresent(Execute.class);
	}

	/**
	 * セッション上にDtoがあるか、あった場合その中にloginUserは保持されているか。
	 * @return 上記の条件を両方満たしていればtrue
	 */
	private boolean isLoggedIn() {
		return (userDataDto != null && userDataDto.loginUser != null);
	}

}
