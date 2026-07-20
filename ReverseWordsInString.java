class ReverseWordsInString {
    
    public String reverseWords(String s) {

        String trimmedStr = s.trim();

        int sLen = trimmedStr.length();

        if (sLen == 1)
        return trimmedStr;

        int ptr1 = sLen - 1, ptr2 = sLen - 1;

        StringBuilder result = new StringBuilder();

        while ((ptr1 >= 0) && (ptr2 >= 0)) {
            if (trimmedStr.charAt(ptr1) == ' ') {
                result.append(trimmedStr.substring(ptr1 + 1, ptr2+1));
                result.append(" ");
                ptr1--;
                while ((trimmedStr.charAt(ptr1) == ' ') && (ptr1 >= 0)) {
                    ptr1--;
                }
                ptr2 = ptr1;
            }
            ptr1--;
        }
        result.append(trimmedStr.substring(0, ptr2+1));
        return result.toString();    
    }
}
