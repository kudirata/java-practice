package day07_ScannerObjects;

public class PreAndPost2 {

	public static void main(String[] args) {
		
int messages = 10;

messages++;  // 11

++messages;  // 12

System.out.println("Messages: "+messages);
		
	
int readMessages = --messages;


System.out.println("ReadMessages: "+ readMessages);

System.out.println("Messages: "+ messages);

int unreadMessages = readMessages--;

System.out.println("unReadMessages: "+ unreadMessages);

System.out.println("ReadMessages: "+ readMessages);

System.out.println();

int count = 20;
int count2 = 10;
int totalCount = ++count + --count2;  // ++count=21 and --count = 9

System.out.println("count "+count);

System.out.println("count2 "+count2);

System.out.println("totalCount "+totalCount);

System.out.println();
int myCount = count++ + ++count;  // 21 + 23

System.out.println("count "+count);  // count ended with 21, count++ becomes 22, ++count makes it 23

System.out.println("myCount "+myCount);



		
	}

}
