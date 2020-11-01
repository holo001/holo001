package com.naver.paas.es.ila;
public class level2 {
    public class level3 {
        public String str = "acbdw,12695,47AasIDK";
        public String[] temp = str.split(",");
    }
        public String str = "acbdw,12695,47AasIDK";
        public String[] temp = str.split(",");
        public String lowerCase (String param){
            int t = 0;
            for (int i = 0; i < param.length(); i++) {
                if (Character.isDigit(param.charAt(i))) {
                    continue;
                } else {
                    if (Character.isUpperCase(param.charAt(i))) {
                        return "has upper case";
                    }
                    t += 1;
                }
            }
            if (t != 0) {
                return "str is not all digital";
            }
            return "all is digital";
        }
    public static void main(String[]args){
            level2 t = new level2();
            System.out.println(t.lowerCase(t.temp[0]));
            System.out.println(t.lowerCase(t.temp[1]));
            System.out.println(t.lowerCase(t.temp[2]));
    }
}


