class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int k = s1.length();
        String ref = sort(s1);

        StringBuilder sb = new StringBuilder();
        if(s1.length() > s2.length()){
            return false;
        }
        for(int i = 0; i < k; i++){
            sb.append(s2.charAt(i));
        }
        if(sort(sb.toString()).equals(ref)){
            return true;
        }
        for(int i = k; i < s2.length(); i++){
            sb.deleteCharAt(0);
            sb.append(s2.charAt(i));
            if(sort(sb.toString()).equals(ref)){
                return true;
            }
        }
        return false;
        }
        String sort(String s){
        char[] c = s.toCharArray();
        Arrays.sort(c);
        return new String(c);
    }
    }


