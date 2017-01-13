package jp.asojukuac.st.asoretry2016no3;

/**
 * Created by KWT-5628 on 2017/01/13.
 */

public class AnbayashiData {
        private String pname;
        private String yomi;
        private String cname;
        // Constructor
        public AnbayashiData(String pname, String yomi, String cname) {
            this.pname = pname;
            this.yomi = yomi;
            this.cname = cname;
        }

        public String getpname() {
            return pname;
        }

        public String getyomi() {
            return yomi;
        }

        public String getcname() {
            return cname;
        }
    }
