
# Simple System Info

A very simple class showing how to obtain system information from inside a Java application. No external libraries, no system commands executed; just plain, simple Java.

For an example of how to use it, check the Main class. Sample output:

```
Mac OS X x86_64 10.14.6
Available processors: 12
CPU:  0.0% (process),  0.0% (system total), avg. load: 2.73
Process memory: 2MB used (18.8%), 10MB total
CPU:  0.1% (process), 13.1% (system total), avg. load: 2.73
Process memory: 2MB used (19.2%), 10MB total
CPU:  0.4% (process),  5.1% (system total), avg. load: 2.73
Process memory: 1MB used (14.9%), 10MB total
CPU:  0.0% (process),  3.6% (system total), avg. load: 2.52
Process memory: 1MB used (15.1%), 10MB total
CPU:  0.0% (process),  4.2% (system total), avg. load: 2.52
Process memory: 1MB used (15.1%), 10MB total
```

This project was heavily based on these Stack Overflow questions:

- [Java get available memory](https://stackoverflow.com/q/12807797/778272)
- [Get OS-level system information](https://stackoverflow.com/q/25552/778272)
- [Using OperatingSystemMXBean to get CPU usage](https://stackoverflow.com/q/19781087/778272)
