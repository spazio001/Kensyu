package jp.bric.shainkanriwebapp.service.extend;
import static jp.bric.shainkanriwebapp.entity.UsersNames.*;

import org.seasar.extension.jdbc.where.SimpleWhere;

import jp.bric.shainkanriwebapp.entity.Users;
import jp.bric.shainkanriwebapp.service.UsersService;

public class UsersExService extends UsersService {

	public Users findByIdAndPassword(String loginUser, String loginPassword) {
		SimpleWhere where = new SimpleWhere();
		where.eq(loginUser(), loginUser);
		where.eq(loginPassword(),loginPassword);

        return select().where(where).getSingleResult();
    }

}
