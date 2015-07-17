package jp.bric.shainkanriwebapp.action.ajax;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.annotation.Resource;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;
import org.seasar.struts.util.ResponseUtil;

import jp.bric.shainkanriwebapp.action.AbstractShainKanriAction;
import jp.bric.shainkanriwebapp.dto.SearchResultDto;
import jp.bric.shainkanriwebapp.dto.SearchResultItemDto;
import jp.bric.shainkanriwebapp.form.SearchForm;
import net.arnx.jsonic.JSON;

public class SearchAction extends AbstractShainKanriAction {

	@ActionForm
	@Resource
	protected SearchForm searchForm;

	@Execute(validator = false)
	public String search() {
		//TODO データベースの検索をして、データを取ってくる




		//TODO 検索結果をDtoに詰め込み、JSONで返却する。
		SearchResultDto searchResultDto = new SearchResultDto();
		searchResultDto.count = 120;

		ArrayList<SearchResultItemDto> resultList = new ArrayList<SearchResultItemDto>();
		resultList.add(makeDummyData(5L, "山川１", "1990/09/09", 1, "1112222", "岐阜県", "1122223333"));
		resultList.add(makeDummyData(6L, "山川２", "1990/09/09", 1, "1112222", "岐阜県", "1122223333"));
		resultList.add(makeDummyData(7L, "山川３", "1990/09/09", 1, "1112222", "岐阜県", "1122223333"));
		resultList.add(makeDummyData(8L, "山川４", "1990/09/09", 1, "1112222", "岐阜県", "1122223333"));
		resultList.add(makeDummyData(9L, "山川５", "1990/09/09", 1, "1112222", "岐阜県", "1122223333"));
		resultList.add(makeDummyData(10L, "山川６", "1990/09/09", 1, "1112222", "岐阜県", "1122223333"));
		resultList.add(makeDummyData(11L, "山川７", "1990/09/09", 1, "1112222", "岐阜県", "1122223333"));
		resultList.add(makeDummyData(12L, "山川８", "1990/09/09", 1, "1112222", "岐阜県", "1122223333"));
		resultList.add(makeDummyData(13L, "山川９", "1990/09/09", 1, "1112222", "岐阜県", "1122223333"));
		resultList.add(makeDummyData(14L, "山川１０", "1990/09/09", 1, "1112222", "岐阜県", "1122223333"));
		resultList.add(makeDummyData(15L, "山川１１", "1990/09/09", 1, "1112222", "岐阜県", "1122223333"));
		resultList.add(makeDummyData(16L, "山川１２", "1990/09/09", 1, "1112222", "岐阜県", "1122223333"));
		resultList.add(makeDummyData(17L, "山川１３", "1990/09/09", 1, "1112222", "岐阜県", "1122223333"));
		resultList.add(makeDummyData(18L, "山川１４", "1990/09/09", 1, "1112222", "岐阜県", "1122223333"));
		resultList.add(makeDummyData(19L, "山川１５", "1990/09/09", 1, "1112222", "岐阜県", "1122223333"));
		resultList.add(makeDummyData(20L, "山川１６", "1990/09/09", 1, "1112222", "岐阜県", "1122223333"));
		resultList.add(makeDummyData(21L, "山川１７", "1990/09/09", 1, "1112222", "岐阜県", "1122223333"));
		resultList.add(makeDummyData(22L, "山川１８", "1990/09/09", 1, "1112222", "岐阜県", "1122223333"));
		resultList.add(makeDummyData(23L, "山川１９", "1990/09/09", 1, "1112222", "岐阜県", "1122223333"));
		resultList.add(makeDummyData(24L, "山川２０", "1990/09/09", 1, "1112222", "岐阜県", "1122223333"));
		searchResultDto.resultList = resultList;

		String json = JSON.encode(searchResultDto);
		ResponseUtil.write(json);

		return null;

	}

	private SearchResultItemDto makeDummyData(Long shainNo, String shainName, String shainBirthday, Integer shainSex, String shainPostcode, String shainAddress, String shainTelno) {
		SearchResultItemDto itemDto = new SearchResultItemDto();
		try {
			itemDto.shainNo = shainNo;
			itemDto.shainName = shainName;
			SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
			itemDto.shainBirthday = format.parse(shainBirthday);
			itemDto.shainSex = shainSex;
			itemDto.shainPostcode = shainPostcode;
			itemDto.shainAddress = shainAddress;
			itemDto.shainTelno = shainTelno;
			itemDto.insertTime = new Date();
			itemDto.lastUpdateTime = new Date();
		} catch (ParseException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		return itemDto;
	}


}
