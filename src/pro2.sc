object scala_basic
def test (str1: string): string =
{
  val len = str1.length
  val last = str1.charAt(len -1)
  last + str1 + last
}

 def man(args: Array[string]): Unit ={
   println("result" + test(scala))
 }