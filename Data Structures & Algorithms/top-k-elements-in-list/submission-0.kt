class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val frequencyMap = HashMap<Int,Int>()
        for(i in nums){
            frequencyMap[i]=frequencyMap.getOrDefault(i,0)+1
        }

       val heap = PriorityQueue <Map.Entry<Int,Int>>{a,b ->
       a.value - b.value
       }
       for(entry in frequencyMap.entries){
        heap.offer(entry)
        if(heap.size>k){
            heap.poll()
        }
       }
 val result = IntArray(k)
       for(i in k-1 downTo 0){
        result[i] = heap.poll().key
       }

return result
       
    }
}
