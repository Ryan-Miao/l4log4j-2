测试使用log4j-2
=============

官网说log4j-2是log4j的改进版，引入了logback的一些优秀特性，
并且修复了logback固有的问题。总之，这是比log4j和logback更牛逼的东西。








--------------------------------


## Apache Log4j 2
Apache Log4j 2 is an upgrade to Log4j that provides significant improvements over its predecessor, Log4j 1.x, and provides many of the improvements available in Logback while fixing some inherent problems in Logback’s architecture.

### Features
API Separation
The API for Log4j is separate from the implementation making it clear for application developers which classes and methods they can use while ensuring forward compatibility. This allows the Log4j team to improve the implementation safely and in a compatible manner.

### Improved Performance
Log4j 2 contains next-generation Asynchronous Loggers based on the LMAX Disruptor library. In multi-threaded scenarios Asynchronous Loggers have 18 times higher throughput and orders of magnitude lower latency than Log4j 1.x and Logback. See Asynchronous Logging Performance for details. Otherwise, Log4j 2 significantly outperforms Log4j 1.x, Logback and java.util.logging, especially in multi-threaded applications. See Performance for more information.

### Support for multiple APIs
While the Log4j 2 API will provide the best performance, Log4j 2 provides support for the Log4j 1.2, SLF4J, Commons Logging and java.util.logging (JUL) APIs.

### Avoid lock-in
Applications coded to the Log4j 2 API always have the option to use any SLF4J-compliant library as their logger implementation with the log4j-to-slf4j adapter.

### Automatic Reloading of Configurations
Like Logback, Log4j 2 can automatically reload its configuration upon modification. Unlike Logback, it will do so without losing log events while reconfiguration is taking place.

### Advanced Filtering
Like Logback, Log4j 2 supports filtering based on context data, markers, regular expressions, and other components in the Log event. Filtering can be specified to apply to all events before being passed to Loggers or as they pass through Appenders. In addition, filters can also be associated with Loggers. Unlike Logback, you can use a common Filter class in any of these circumstances.

### Plugin Architecture
Log4j uses the plugin pattern to configure components. As such, you do not need to write code to create and configure an Appender, Layout, Pattern Converter, and so on. Log4j automatically recognizes plugins and uses them when a configuration references them.

### Property Support
You can reference properties in a configuration, Log4j will directly replace them, or Log4j will pass them to an underlying component that will dynamically resolve them. Properties come from values defined in the configuration file, system properties, environment variables, the ThreadContext Map, and data present in the event. Users can further customize the property providers by adding their own Lookup Plugin.

### Java 8 Lambda Support
Previously, if a log message was expensive to construct, you would often explicitly check if the requested log level is enabled before constructing the message. Client code running on Java 8 can benefit from Log4j’s lambda support. Since Log4j will not evaluate a lambda expression if the requested log level is not enabled, the same effect can be achieved with less code.

### Custom Log Levels
In Log4j 2, custom log levels can easily be defined in code or in configuration. No subclassing is required.

### Garbage-free
During steady state logging, Log4j 2 is garbage-free in stand-alone applications, and low garbage in web applications. This reduces pressure on the garbage collector and can give better response time performance.