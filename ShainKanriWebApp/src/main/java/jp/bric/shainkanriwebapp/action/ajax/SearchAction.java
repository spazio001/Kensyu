package jp.bric.shainkanriwebapp.action.ajax;

import javax.annotation.Resource;

import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;
import org.seasar.struts.util.ActionMessagesUtil;

import jp.bric.shainkanriwebapp.action.AbstractShainKanriAction;
import jp.bric.shainkanriwebapp.entity.Shains;
import jp.bric.shainkanriwebapp.form.SearchForm;
import jp.bric.shainkanriwebapp.service.extend.ShainsExService;

public class SearchAction extends AbstractShainKanriAction {

	@ActionForm
	@Resource
	protected SearchForm searchForm;

	@Resource
	protected ShainsExService shainsExService;

	@Execute(validator = false)
	public String search() {
		//TODO データベースの検索をして、データを取ってくる
		Shains shainsSearch = shainsExService.findByShainsTx(searchForm.shainNo, searchForm.shainName);
		if (shainsSearch != null) {

			//社員を表示する
			return "search.jsp";

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
		//件数（カウント）の初期化
//		searchResultDto.count = 0;

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
//
//	private SearchResultItemDto ResultData(Long shainNo, String shainName, String shainBirthday, Integer
//			shainSex,
//			String shainPostcode, String shainAddress, String shainTelno) {
//		SearchResultItemDto itemDto = new SearchResultItemDto();
//		try {
//			itemDto.shainNo = shainNo;
//			itemDto.shainName = shainName;
//			SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
//			itemDto.shainBirthday = format.parse(shainBirthday);
//			itemDto.shainSex = shainSex;
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
//
//}
