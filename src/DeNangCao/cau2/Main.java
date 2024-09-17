package DeNangCao.cau2;
import static DeNangCao.cau2.Regex.isValidISBN;

import static javax.lang.model.SourceVersion.isName;

public class Main {

        public static void main(String[] args) {
            String[] testIBSN = {"12-09-2001", "978-0-596-52068-7", "0-596-52068-9",
                    "978 0 596 52068 7",
                    "0596520689",
                    "9780596520687"};
            for (String isbn : testIBSN) {
                System.out.println("Isbn: " + isbn + " : " + isValidISBN(isbn));
            }

            String[] testName = {"Khanh", "Kha-nh", "Mi nh", "Min#" , "25Khanh"};
            for (String name : testName) {
                System.out.println("Name: " + name + " : " + isName(name));
            }
        }

    }
