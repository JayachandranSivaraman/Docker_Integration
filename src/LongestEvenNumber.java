
public class LongestEvenNumber {
	
	public static void main(String[] args) {
		String test = "This is the longest sentencetrtryt43t in whicheweweewewi i have to find the longest even word";
		String temp ="";
		String[] words = test.split(" ");
		for(int i=0;i<words.length;i++) {
			if(words[i].length()%2==0) {
			if(i==0) {
				temp= words[i];
				
			}
			else {
				temp = temp.length()>words[i].length()?temp:words[i];
			}
			}
		}
		System.out.println(temp);
	}

}
