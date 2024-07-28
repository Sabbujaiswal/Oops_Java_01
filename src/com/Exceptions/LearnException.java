package com.Exceptions;

public class LearnException {
    /*
    Java Exception- A exception is an unwanted event that occurs during program execution.
    it affect the flow of the program instruction which can cause to terminate abnormally.
    Reason can occurs for may reason like-
    Invalid user input, Device failure,loss of network connection,code error,opening an unavailable file. etc

    Exception are two type-(i) java run time exception(ii) compile time exception or IOException
    i.Run time exception- A run time exception happens due to program error. they are also known as unchecked exception.
    these exception are not checked at compile time but run time.
    some of the runtime exception are:
    #Null pointer access(missing the initialization of variable)-NullPointerException
    #Out of bound array access-ArrayOutOfBoundException
    #Dividing a number by 0-ArithmeticException
   * we can think it in this way that if it is runtime exception then its your fault.

   ii.IOException-- An IOException is also known as checked exception.they are checked by the compiler at the compile time and programmer is prompted to handle these exception.
   some of the example of checked exception are :
   #Trying to open a file that does not exits, results in FileNotFoundException.
   #Trying to read end of file that is not available.

  ** Handling Exception--
  try-catch block- used to handle exception and prevents the abnormal termination of the program.

     */
    public static void main(String[] args) {
        int arr[]=new int[5];
        System.out.println("Hello jack");


        try{
            int result=5/0;//pehle isi exception ko dekhega fir suke bad catch m chala jaega
            System.out.println(arr[8]);

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Tried to access out of bound element "+e.getMessage());
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());//yah btata h kaha se exception suru hua h
            System.out.println(e);
        }
        System.out.println("After handle exception");
    }
}
