package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class WordCount {
	public static void main(String[] args) {
		String line = "Maharashtra is Beutiful State Maharashtra  ";
		
		getWordCount(line);
	}

	public static void getWordCount(String line) {
		String[] words = line.split(" ");
		
		HashMap<String, Integer> wordcount = new HashMap<String, Integer>();
		for(String word:words) {
			if(wordcount.containsKey(word)) {
				int exitingwordCount = wordcount.get(word);
				wordcount.put(word, exitingwordCount+1);
			}else {
				wordcount.put(word,1);
			}
			
			Set<Map.Entry<String, Integer>>wordentries = wordcount.entrySet();
			for(Map.Entry<String, Integer> entry:wordentries) {
				System.out.println("Word: "+entry.getKey()+ " :Count: "+entry.getValue());
			}
		}
		
	}

}
