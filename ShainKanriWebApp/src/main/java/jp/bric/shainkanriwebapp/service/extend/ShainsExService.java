package jp.bric.shainkanriwebapp.service.extend;

import static jp.bric.shainkanriwebapp.entity.ShainsNames.*;

import org.seasar.extension.jdbc.where.SimpleWhere;

import jp.bric.shainkanriwebapp.entity.Shains;
import jp.bric.shainkanriwebapp.service.ShainsService;

public class ShainsExService extends ShainsService {

	//登録
	public void registerShainTx(Shains shain) {
		insert(shain);
	}

	//同じ社員番号検索
	public Shains findByShainNo(String shainNo) {
		SimpleWhere where = new SimpleWhere();
		where.eq(shainNo(), shainNo);

		return select().where(where).getSingleResult();
	}

	//検索する社員
	public Shains shainsExService(String shainNo,String shainName) {
		SimpleWhere where = new SimpleWhere();
		where.eq(shainNo(), shainNo);
		where.contains(shainName(), shainName);

		return select().where(where).getSingleResult();
	}


}
