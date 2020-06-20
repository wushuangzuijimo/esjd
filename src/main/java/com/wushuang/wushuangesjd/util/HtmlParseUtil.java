package com.wushuang.wushuangesjd.util;

import org.apache.lucene.analysis.standard.UAX29URLEmailTokenizerImpl;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class HtmlParseUtil {



    public static void main(String[] args) throws IOException {



        String url = "https://search.jd.com/Search?keyword=java";
        //解析网页(jsoup返回document就是document对象)
        Document document = Jsoup.connect(url).timeout(30000).userAgent("aoligei").validateTLSCertificates(false).get();


        Element element = document.getElementById("J_goodsList");


        System.out.println(element);

    }
}
