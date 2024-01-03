class Solution {
    public List<String> findHighAccessEmployees(List<List<String>> access_times) {
        Map<String,List<Integer>> accessmap = new HashMap<>();
        for(List<String> acc:access_times){
            if(!accessmap.containsKey(acc.get(0))){
                accessmap.put(acc.get(0),new ArrayList<>());
            }
            char[] second = acc.get(1).toCharArray();
            int hour = (second[0]-'0')*10 +second[1]-'0';
            int min = (second[2]-'0')*10+second[3]-'0';
            accessmap.get(acc.get(0)).add(hour*60+min);
        }
        List<String> high = new ArrayList<>();
        for(String key:accessmap.keySet()){
            List<Integer> val = accessmap.get(key);
            Collections.sort(val);
            for(int i =0;i<val.size()-2;i++){
                if(val.get(i+2)-val.get(i)<=59){
                    high.add(key);
                    break;
                }
            }
        }
        return high;
    }
}
