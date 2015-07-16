package jp.bric.shainkanriwebapp.service.extend;

import static jp.bric.shainkanriwebapp.entity.ShainsNames.*;

import org.seasar.extension.jdbc.where.SimpleWhere;

import jp.bric.shainkanriwebapp.entity.Shains;
import jp.bric.shainkanriwebapp.service.ShainsService;

public class ShainsExService extends ShainsService {

	public void registerShainTx(Shains shain) {
		insert(shain);
	}

	public Shains findByShainNo(String shainNo) {
		SimpleWhere where = new SimpleWhere();
		where.eq(shainNo(), shainNo);

		return select().where(where).getSingleResult();
	}

}
