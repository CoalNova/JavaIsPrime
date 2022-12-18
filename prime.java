import java.util.ArrayList;

public class prime {

    /// Entry point
    public static void main(String[] args) {
        Boolean isPrime = false,
                silent = false;

        int parsedNumber = 0,
                exitStatus = 1;

        var numbers = new ArrayList<Integer>();

        if (args.length > 0) {

            // check for flags, parse numbers into array to run through
            for (String string : args)
                if (string.length() > 0) {

                    // check flags for silent, version, or help
                    if (string.charAt(0) == '-') {
                        if (string.matches("-s") || string.matches("--silent"))
                            silent = true;
                        else if (string.matches("-v") || string.matches("--version")) {
                            primeutils.PrintIsPrimeVersion();
                            return;
                        } else if (string.matches("-h") || string.matches("--help")) {
                            primeutils.PrintDefaultUsage();
                            return;
                        }
                    } else {
                        // catch if provided value is a number
                        try {
                            parsedNumber = Integer.parseInt(string);
                            numbers.add(parsedNumber);
                        } catch (Exception e) {
                            if (!silent)
                                System.out.println(string + " is not recognized as a valid number.");
                        }
                    }
                }

            // catch that no numbers were passed
            if (numbers.size() < 1) {
                primeutils.PrintDefaultUsage();
                return;
            }

            for (Integer num : numbers) {
                isPrime = primeutils.IsPrime(num);
                if (!silent)
                    System.out.println("The number " + num + " is" + (isPrime ? " " : " not ") + "prime.");
                exitStatus = isPrime ? 0 : -1;
            }

        } else {
            primeutils.PrintDefaultUsage();
        }
        System.exit(exitStatus);
    }
}
