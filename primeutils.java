public class primeutils {

    /// Print version
    public static void PrintIsPrimeVersion() {
        System.out.println("JavaIsPrime Version: 1.0");
    }

    /// The function which determines if a number is prime
    public static boolean IsPrime(int number) {
        if ((number & 1) == 0 && number > 2)
            return false;

        if (number < 2)
            return false;

        if (number > 2) {
            for (int i = 1; i < (number >> 2); i++) {
                if (number % (i * 2 + 1) == 0)
                    return false;
            }
        }
        return true;
    }

    /// Outputs the default useage to the command line
    public static void PrintDefaultUsage() {
        System.out.println(
                """

                            JavaIsPrime - A simple prime number checker using trial division.
                        JavaIsPrime can process many numbers. However, the exit code will only relate to the last number processed.

                        Default Useage <options..> [number, number, ...]

                        Options:
                            -s | --silent   Silent mode, no output, only returns exit code
                                            for last processed value. Using with multiple inputs is ill-advised.
                            -v | --version  Prints application version and exits.
                            -h | --help     Prints this sript and exits.""");
    }

}
