package jp.bric.crawler;

import java.io.IOException;
import java.util.Iterator;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Crawler {

	public Crawler() {
	}

	public void crawl(){
		try {
			Document doc = Jsoup.connect("http://en.wikipedia.org/").get();
			Elements newsHeadlines = doc.select("#mp-itn b a");

			Iterator<Element> it = newsHeadlines.iterator();
			while(it.hasNext()){
				Element elem = it.next();
				System.out.println(elem.attr("href"));
			}

		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Crawler crawler = new Crawler();
		crawler.crawl();
	}

}
