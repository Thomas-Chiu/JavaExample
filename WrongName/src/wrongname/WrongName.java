/*
 * 檔名：WrongName.java
 * 作者：張凱慶
 * 網站：http://kaiching.org
 */
package wrongname;

// 使用與 API 相同名稱的變數
public class WrongName {
   public static void main(String[] args) {
       String a = "22";
       
       System.out.println();
       System.out.println(a.getClass());
       System.out.println();
       
       // 變數 String 與 API 中的名稱相同
       Integer String = 22;
       
       System.out.println(String.getClass());
       System.out.println();
    }
}