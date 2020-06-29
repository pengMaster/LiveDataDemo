package com.pengmaster.livedatademo

/**
 * <pre>
 *     author : Wp
 *     e-mail : 1101313414@qq.com
 *     time   : 2020-06-17 14:34
 *     desc   :
 *     version: 1.0
 * </pre>
 */
class Main {
   companion object{
       @JvmStatic
       fun main(args : Array<String>){
//           net( error = error)
           println(result)

       }
       val error ={ a : Int,b : Int ->
           println(a.toString())
       }

       fun net( success:( i:Int , n :Int ) -> Unit = ::success,error:( i:Int , n :Int )->Unit = ::success ) {
           success(1,2)
           error(3,4)
       }

       fun success( i :Int ,b :Int) : Unit{
           println(i.toString())
       }

       val result = "1314".also {
           println(it.length)
           "我的"
       }
       val testResult = "name".run {
           println(this)
           "哈哈"
       }

   }


}