package com.javarush.task.pro.task09.task0912;

/* 
Проверка URL-адреса
*/

public class Solution {
    public static void main(String[] args) {
        String[] urls = {"https://javarush.ru", "https://google.com", "http://wikipedia.org", "facebook.com", "https://instagram", "codegym.cc"};
        for (String url : urls) {
            String protocol = checkProtocol(url);
            String domain = checkDomain(url);

            System.out.println("У URL-адреса - " + url + ", сетевой протокол - " + protocol + ", домен - " + domain);
        }
    }

    public static String checkProtocol(String url) {
        if (!url.matches("^(https://|http://).*")) {
            return "неизвестный";
        }
        String toRemove = url.replaceAll("(https|http)","");
        return url.replaceAll(toRemove, "");
    }

    public static String checkDomain(String url) {
        if (!url.matches(".*(com|net|org|ru)$"))
        {
            return "неизвестный";
        }
        String[] urlParts = url.split("\\.");
        String domain = urlParts[urlParts.length - 1];
        return domain;
    }
}
