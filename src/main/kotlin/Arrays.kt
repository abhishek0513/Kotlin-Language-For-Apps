fun main(){
    var nums = intArrayOf(1, 23, 4, 5, 6, 7)
    println(nums[1])
    println(nums.last())
    println(nums.getOrNull(4))
//    :::
    //we can use lastIndex for arrays last index
    nums = nums.plus(56)
    println(nums.joinToString())
    
    //also you can use mutablelistof if want to use nums.add
}