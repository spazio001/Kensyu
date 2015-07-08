package jp.bric.shainkanriwebapp.service;

import java.util.List;
import javax.annotation.Generated;
import jp.bric.shainkanriwebapp.entity.Shains;

import static jp.bric.shainkanriwebapp.entity.ShainsNames.*;
import static org.seasar.extension.jdbc.operation.Operations.*;

/**
 * {@link Shains}のサービスクラスです。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.ServiceModelFactoryImpl"}, date = "2015/07/08 17:33:31")
public class ShainsService extends AbstractService<Shains> {

    /**
     * 識別子でエンティティを検索します。
     * 
     * @param shainNo
     *            識別子
     * @return エンティティ
     */
    public Shains findById(Long shainNo) {
        return select().id(shainNo).getSingleResult();
    }

    /**
     * 識別子の昇順ですべてのエンティティを検索します。
     * 
     * @return エンティティのリスト
     */
    public List<Shains> findAllOrderById() {
        return select().orderBy(asc(shainNo())).getResultList();
    }
}