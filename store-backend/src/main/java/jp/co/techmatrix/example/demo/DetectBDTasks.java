package jp.co.techmatrix.example.demo;

public class DetectBDTasks {

	public void printCalculationResult(Object result)
    {
        if (result instanceof Exception) {
            System.err.println("Exception found: " + ((Exception)result).getMessage());
            
        } else if (result instanceof RuntimeException) { // BD.UC.COND VIOLATION
            ((RuntimeException)result).printStackTrace(System.err);
            
        } else {
            System.out.println("Result: " + result.toString());
        }
    }
}
