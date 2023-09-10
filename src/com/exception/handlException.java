package com.exception;

public class handlException{
    public static void main(String[] args) {
        var result = divide(14,2);
        System.out.println("First set of result:" +result);
        var newResult = divide(12,0);
        System.out.println("Second set of result:" +newResult);
    }
    public static int divide(int dividend, int divisor) {
       try {
           if(divisor == 0) {
             throw new ZeroDevicerException("The Divisor can't be zero: custom exception");
           }
           return  dividend/divisor;
       } catch(ZeroDevicerException exception) {
           System.err.println(exception.getMessage());
           exception.printStackTrace();
           return 0;
       } catch(ArithmeticException exception) {
           exception.printStackTrace();
           System.err.println("The divider can't be zero here");
           return 0;
       } finally {
           System.out.println("The job is finally finished");
       }
    }
}
