# JavaIsPrime
A Command Line Java app which returns if a supplied number is prime using trial division. The program will hand off a return code based on useage and result. Many numbers may be passed, though only the last processed number will determine the exit code.

#### Useage:

Default Useage <options..> [number, number, ...]

Options:

    -s | --silent   Silent mode, no output, only returns exit code for last processed value. 

    -v | --version  Prints application version and exits.

    -h | --help     Prints the putline and help sripts and exits.
    
#### Return Codes:

By the program will return a `1` if no number or valid number was passed. For results `-1` is returned if a number is not prime, and `0` if the provided number is prime.
