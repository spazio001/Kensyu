package jp.bric.shainkanriwebapp.dto;

import java.io.Serializable;

import org.seasar.framework.container.annotation.tiger.Component;
import org.seasar.framework.container.annotation.tiger.InstanceType;

//@Componentのアノテーションにて、セッションを自動で保持する
@Component(instance = InstanceType.SESSION)
public class UserDataDto implements Serializable {

	private static final long serialVersionUID = 1L;

	//ユーザーID
	public String loginUser;

	//権限（0:管理者、1:一般）
	public Integer roleType;

	public String getLoginUser() {
		return loginUser;
	}

	public Integer getRoleType() {
		return roleType;
	}


}