package jp.bric.shainkanriwebapp.service.extend;

import static jp.bric.shainkanriwebapp.entity.ShainsNames.*;

import java.util.Date;
import java.util.List;

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

	//全社員検索（条件追加）
	public List<Shains> findByShainAll(String shainNo, String shainName,Date birthdayFrom, Date birthdayTo, String shainSex, String shainPostcode, String shainAddress, String shainTelno) {

		SimpleWhere where = new SimpleWhere();

		//社員番号がnullでない場合
		if(shainNo != null && shainNo != ""){
			where.eq(shainNo(), shainNo);
		}

		//氏名がnullでない場合
		if(shainName != null && shainName != ""){
			where.contains(shainName(), shainName);
		}

		//年齢（FROM）がnullでない場合
		if(birthdayFrom != null){
			where.ge(shainBirthday(), birthdayFrom);
		}

		//年齢（TO）がnullでない場合
		if(birthdayTo != null){
			where.lt(shainBirthday(), birthdayTo);
		}

		//性別がnullでない場合
		if(shainSex != null && shainSex != ""){
			where.eq(shainSex(), shainSex);
		}

		//郵便番号がnullでない場合
		if(shainPostcode != null && shainPostcode != ""){
			where.contains(shainPostcode(), shainPostcode);
		}

		//住所がnullでない場合
		if(shainAddress != null && shainAddress != ""){
			where.contains(shainAddress(), shainAddress);
		}

		//電話番号がnullでない場合
		if(shainTelno != null && shainTelno != ""){
			where.contains(shainTelno(), shainTelno);
		}

		return select().where(where).getResultList();

	}

}
