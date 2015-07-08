package jp.bric.shainkanriwebapp.service;

import java.util.List;
import javax.annotation.Generated;
import jp.bric.shainkanriwebapp.entity.Users;

import static jp.bric.shainkanriwebapp.entity.UsersNames.*;
import static org.seasar.extension.jdbc.operation.Operations.*;

/**
 * {@link Users}のサービスクラスです。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.ServiceModelFactoryImpl"}, date = "2015/07/08 17:33:31")
public class UsersService extends AbstractService<Users> {

    /**
     * 識別子でエンティティを検索します。
     * 
     * @param loginUser
     *            識別子
     * @return エンティティ
     */
    public Users findById(String loginUser) {
        return select().id(loginUser).getSingleResult();
    }

    /**
     * 識別子の昇順ですべてのエンティティを検索します。
     * 
     * @return エンティティのリスト
     */
    public List<Users> findAllOrderById() {
        return select().orderBy(asc(loginUser())).getResultList();
    }
}