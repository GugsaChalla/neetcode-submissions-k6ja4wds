class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String str: strs){
            sb.append(str.length());
            //delimeter
            sb.append("*");
            sb.append(str);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> strs = new ArrayList<>();
        for(int i=0;i<str.length();i++){
            int j=i;
            //multiple digit num
            while(str.charAt(j)!='*'){
                j++;
            }
            int wordLength=Integer.parseInt(str.substring(i,j));//2
            i=wordLength+j;
            String word = str.substring(j+1,i+1);
            strs.add(word);
        }
        return strs;
    }
}

