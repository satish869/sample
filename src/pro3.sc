object pro3
def test (str: string): string=
{
  if (str.startswith("if")) str
  else "if" + str
}

def main(args : Array[string]): Unit ={
  println("result " + test("if else "));
  println("reslut " + test("else"));
}