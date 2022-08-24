### Howto: start the performance tests via command line
1. start the tutorial *jwt-tutorial-005*
2. once the application is started, run **mvn -P webtoolkit-jmeter verify**
3. **Attention!** the tests rely on a freshly started server and count the amount of documents loaded, so if you load 
  a document manually, or repeat the test runs,  the test will fail 