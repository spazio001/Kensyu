package jp.bric.shainkanriwebapp.dto;

import java.io.Serializable;

import org.seasar.framework.container.annotation.tiger.Component;
import org.seasar.framework.container.annotation.tiger.InstanceType;

@Component(instance = InstanceType.SESSION)
public class UserDataDto implements Serializable {
	private static final long serialVersionUID = 1L;

	public String loginUser;
	public Integer roleType;
}