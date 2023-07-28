package com.rk.cj.day12;

public class StringBuilderExample {
        public static void main(String[] args) {


                String username = "sai krishna ";
                String description = "He works for SSGA at Bangalore";

                StringBuilder sb = new StringBuilder();
                sb.append("<!DOCTYPE html>\\n")
                        .append("<html>\n")
                        .append("<head>\n")
                        .append("<title>Profile Introduction</title>\n")
                        .append("</head>\n")
                        .append("<body>\n")
                        .append("<h1>Welcome : ")
                        .append(username)
                        .append("</h1>\n")
                        .append("<p>")
                        .append(description)
                        .append("</p>\n")
                        .append("</body>\n")
                        .append("</html>\n");
                System.out.println(sb);
        }
}
