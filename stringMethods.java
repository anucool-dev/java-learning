public class stringMethods{

    public static void main(String[] args) {
        String birthDate = "2//10/1986/";
        int startingIndex = birthDate.indexOf("1986");
        System.out.println("staringIndex = " + startingIndex);
        System.out.println("Birth year  = " + birthDate.substring(startingIndex));

        System.out.println("Month = "+ birthDate.substring(3,5));
//   method1:
        String newDate = String.join("/","25","11","1986");
        System.out.println("newDate = "+ newDate);
        // method 2:
        newDate = "25";
        newDate = newDate.concat("/");
        newDate = newDate.concat("10");
        newDate = newDate.concat("/");
        newDate = newDate.concat("1982");
        System.out.printf("newDate = "+ newDate);
 // method 3:
        newDate = "25"+ "/" + "11" + "/" + "1982";
        System.out.printf(" newDate = "+ newDate);
        newDate = "25".concat("/").concat("11").concat("/").concat("1982");
        System.out.println("newDate = "+ newDate);



    }
}
