/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        val dummy=ListNode(0)
        var mergedList=dummy
        if(list1==null)
        return list2
        if(list2==null)
        return list1

        var p1=list1
var p2=list2
        while((p1 != null) && (p2 != null)){
            if(p1.`val` <= p2.`val`){
mergedList.next = p1
p1= p1.next
            }
            
            else{
mergedList.next=p2
p2=p2.next
            }
           mergedList = mergedList.next!! 
        }

        while(p1!=null){
mergedList.next = p1
p1=p1.next
mergedList=mergedList.next!!
        }
        
while(p2!=null){
        mergedList.next = p2
        p2=p2.next
mergedList=mergedList.next!!

    }
    return dummy.next
}
}
