/**  853.车队
 *   https://leetcode-cn.com/problems/car-fleet/
 */

class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
            Map<Integer, Integer> map = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });

        for(int i=0; i<position.length; i++){
            map.put(target-position[i], speed[i]);
        }
        Iterator<Map.Entry<Integer, Integer>> iterator = map.entrySet().iterator();
        boolean flag = true;
        int result = 0;
        double time = Double.MAX_VALUE;
        while(iterator.hasNext()){
            Map.Entry<Integer, Integer> next = iterator.next();
            Double key = next.getKey().doubleValue();
            Double value = next.getValue().doubleValue();
            if(flag){
                result++;
                flag = false;
                time = key/value;
            }else{
                if(key/value>time){
                    result++;
                    time = Math.max(time, key/value);
                }
            }

        }
        return result;
    }
}
