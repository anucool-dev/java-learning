    public class Main {
        public static void main(String[] args) {
            int number = 4;
            int count=0;
            int oddCount=0;
            while (number<= 20) {
                number++;
                if(!isEvenNumber(number)) {
                    count++;
                    if(count==5){
                        break;
                    }
                    continue;
                }
                else {

                    oddCount++;

                }
                System.out.println("Even numbers:" + number );
            }System.out.println("total numbers of even numbers are:"+count);
            System.out.println("total numbers of odd numbers are:"+oddCount);
        }
            public static boolean isEvenNumber ( int number){
                if ((number % 2) == 0) {
                    return true;
                } else {
                    return false;
                }
            }
        }

