class Solution {
    fun isValid(s: String): Boolean {
        val map=mapOf('}' to '{', ')' to '(', ']' to '[')
        val stack = ArrayDeque<Char>()
        for(c in s){
            when(c){
                '{','(','[' -> stack.push(c)
                 '}',')',']' -> if(stack.isEmpty() || (stack.pop()!=map[c]))
                                {
                                    return false
                                }
            }

            
        }
        
        
        return stack.isEmpty()
        
        
       
    }
}
