package jp.bric.shainkanriwebapp.action.ajax;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;
import org.seasar.struts.util.ActionMessagesUtil;
import org.seasar.struts.util.ResponseUtil;

import jp.bric.shainkanriwebapp.action.AbstractShainKanriAction;
import jp.bric.shainkanriwebapp.dto.SearchResultDto;
import jp.bric.shainkanriwebapp.dto.SearchResultItemDto;
import jp.bric.shainkanriwebapp.entity.Shains;
import jp.bric.shainkanriwebapp.form.SearchForm;
import jp.bric.shainkanriwebapp.service.extend.ShainsExService;
import net.arnx.jsonic.JSON;

public class SearchAction extends AbstractShainKanriAction {

	@ActionForm
	@Resource
	protected SearchForm searchForm;

	@Resource
	protected ShainsExService shainsExService;

	@Execute(validator = false)
	public String search() {
		//TODO データベースの検索をして、データを取ってくる
		//全件データ取得
		List<Shains> shainsSearch = shainsExService.findByShainAll(searchForm.shainNo, searchForm.shainName, searchForm.shainSex, searchForm.shainPostcode, searchForm.shainAddress, searchForm.shainTelno);
		if (shainsSearch.size() != 0) {
			//TODO 検索結果をDtoに詰め込み、JSONで返却する。
			SearchResultDto searchResultDto = new SearchResultDto();
			//TODO 正しくSQLを発行し、値を取得する　暫定版：件数（カウント）の初期化
			searchResultDto.count = 0;

			ArrayList<SearchResultItemDto> resultList = new ArrayList<SearchResultItemDto>();

			for(Shains shain : shainsSearch){
				//
				SearchResultItemDto itemDto = new SearchResultItemDto();
				itemDto.shainNo = shain.shainNo;
				itemDto.shainName = shain.shainName;
				itemDto.shainBirthday = shain.shainBirthday;
				itemDto.shainSex = shain.shainSex;
				itemDto.shainPostcode = shain.shainPostcode;
				itemDto.shainAddress = shain.shainAddress;
				itemDto.shainTelno = shain.shainTelno;
				//TODO 年齢を算出する。
				resultList.add(itemDto);
			}

			searchResultDto.resultList = resultList;

			String json = JSON.encode(searchResultDto);
			ResponseUtil.write(json);

			return null;

		} else {
			// エラーメッセージを格納する
			ActionMessages errors = new ActionMessages();
			errors.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage("errors.existShain", searchForm.shainNo));
			ActionMessagesUtil.saveErrors(session, errors);

			return "search.jsp";
		}
	}
}

		//TODO 検索結果をDtoに詰め込み、JSONで返却する。
//		SearchResultDto searchResultDto = new SearchResultDto();
//		//件数（カウント）の初期化
//		searchResultDto.count = 0;
//
//		ArrayList<SearchResultItemDto> resultList = new ArrayList<SearchResultItemDto>();
//		resultList.add(ResultData(searchForm.shainNo,searchForm.shainName,searchForm.shainBirthday,searchForm.shainSex,searchForm.shainPostcode,searchForm.shainAddress,searchForm.shainTelno));
		//resultList.add(

		//	makeDummyData(5L, "山川１", "1990/09/09", 1, "1112222", "岐阜県", "1122223333"));
		//		resultList.add(makeDummyData(6L, "山川２", "1990/09/09", 1, "1112222", "岐阜県", "1122223333"));
		//		resultList.add(makeDummyData(7L, "山川３", "1990/09/09", 1, "1112222", "岐阜県", "1122223333"));
		//		resultList.add(makeDummyData(8L, "山川４", "1990/09/09", 1, "1112222", "岐阜県", "1122223333"));
		//		resultList.add(makeDummyData(9L, "山川５", "1990/09/09", 1, "1112222", "岐阜県", "1122223333"));
		//		resultList.add(makeDummyData(10L, "山川６", "1990/09/09", 1, "1112222", "岐阜県", "1122223333"));
		//		resultList.add(makeDummyData(11L, "山川７", "1990/09/09", 1, "1112222", "岐阜県", "1122223333"));
		//		resultList.add(makeDummyData(12L, "山川８", "1990/09/09", 1, "1112222", "岐阜県", "1122223333"));
		//		resultList.add(makeDummyData(13L, "山川９", "1990/09/09", 1, "1112222", "岐阜県", "1122223333"));
		//		resultList.add(makeDummyData(14L, "山川１０", "1990/09/09", 1, "1112222", "岐阜県", "1122223333"));
		//		resultList.add(makeDummyData(15L, "山川１１", "1990/09/09", 1, "1112222", "岐阜県", "1122223333"));
		//		resultList.add(makeDummyData(16L, "山川１２", "1990/09/09", 1, "1112222", "岐阜県", "1122223333"));
		//		resultList.add(makeDummyData(17L, "山川１３", "1990/09/09", 1, "1112222", "岐阜県", "1122223333"));
		//		resultList.add(makeDummyData(18L, "山川１４", "1990/09/09", 1, "1112222", "岐阜県", "1122223333"));
		//		resultList.add(makeDummyData(19L, "山川１５", "1990/09/09", 1, "1112222", "岐阜県", "1122223333"));
		//		resultList.add(makeDummyData(20L, "山川１６", "1990/09/09", 1, "1112222", "岐阜県", "1122223333"));
		//		resultList.add(makeDummyData(21L, "山川１７", "1990/09/09", 1, "1112222", "岐阜県", "1122223333"));
		//		resultList.add(makeDummyData(22L, "山川１８", "1990/09/09", 1, "1112222", "岐阜県", "1122223333"));
		//		resultList.add(makeDummyData(23L, "山川１９", "1990/09/09", 1, "1112222", "岐阜県", "1122223333"));
		//		resultList.add(makeDummyData(24L, "山川２０", "1990/09/09", 1, "1112222", "岐阜県", "1122223333"));
//		searchResultDto.resultList = resultList;
//
//		String json = JSON.encode(searchResultDto);
//		ResponseUtil.write(json);
//
//		return null;
//
//	}

//	private SearchResultItemDto resultData(shainsSearch) {
//		SearchResultItemDto itemDto = new SearchResultItemDto();
//		try {
//			itemDto.shainNo = Long.parseLong(shainNo);
//			itemDto.shainName = shainName;
//			SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
//			itemDto.shainBirthday = format.parse(shainBirthday);
//			itemDto.shainSex = Integer.parseInt(shainSex);
//			itemDto.shainPostcode = shainPostcode;
//			itemDto.shainAddress = shainAddress;
//			itemDto.shainTelno = shainTelno;
//			itemDto.insertTime = new Date();
//			itemDto.lastUpdateTime = new Date();
//		} catch (ParseException e) {
//			// TODO 自動生成された catch ブロック
//			e.printStackTrace();
//		}
//		return itemDto;
//	}