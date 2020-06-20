package com.wushuang.wushuangesjd.util;

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
        Document document = Jsoup.parse(new URL(url), 30000);


        Element element = document.getElementById("J_goodsList");

        System.out.println(element);

    }
}
