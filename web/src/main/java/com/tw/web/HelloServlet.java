package com.tw.web;
import com.tw.core.Service;

public class HelloServlet {

    public static void main(String[] args) {
        Service service = new Service();
        System.out.println(service.service());
    }
}