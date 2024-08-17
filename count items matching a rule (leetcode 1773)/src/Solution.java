import java.util.*;

public class Solution {
	public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        for(List<String> item: items)
        {
            if(ruleKey.equals("type") && item.get(0).equals(ruleValue))
            {
                count++;
                continue;
            }
            else if(ruleKey.equals("color") && item.get(1).equals(ruleValue))
            {
                count++;
                continue;
            }
            else if(ruleKey.equals("name") && item.get(2).equals(ruleValue))
            {
                count++;
                continue;
            }
        }
        return count;
    }
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		List<List<String>> items = new ArrayList<>();
		list1.add("phone");
		list1.add("blue");
		list1.add("pixel");
		List<String> list2 = new ArrayList<>();
		list2.add("computer");
		list2.add("silver");
		list2.add("lenovo");
		List<String> list3 = new ArrayList<>();
		list3.add("phone");
		list3.add("gold");
		list3.add("iphone");
		items.add(list1);
		items.add(list2);
		items.add(list3);
		System.out.println(countMatches(items, "color", "silver"));
	}
}