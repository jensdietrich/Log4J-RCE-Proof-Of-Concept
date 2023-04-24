# Log4J-RCE-Proof-Of-Concept (CVE-2021-44228)

The fork makes the following changes:

1. the vulnerable class returned by the lookup creates a file `foo` when it is loaded (using `touch`, linux only)
2. a pom has been added to build a standalone executable jar 
3. gradle scripts and settings have been removed

See [original project](https://github.com/HyCraftHD/Log4J-RCE-Proof-Of-Concept) for more details.
