package main;

import java.net.InetSocketAddress;

import requests.StudentCreate;
import requests.StudentDelete;
import requests.StudentEdit;
import requests.StudentInfo;

import com.sun.net.httpserver.HttpServer;

public class Main {
	 public static void main(String[] args) throws Exception {
	        HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);	        
	        server.createContext("/student_info", new StudentInfo());
	        server.createContext("/student_edit", new StudentEdit());
	        server.createContext("/student_create", new StudentCreate());
	        server.createContext("/student_delete", new StudentDelete());	        
	        server.setExecutor(null); // creates a default executor
	        server.start();
	    }
}
