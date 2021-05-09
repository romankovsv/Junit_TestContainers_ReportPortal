Junit 5, TestContainers for WebDriver Selenium
ReportPortal for live reporting


For running tests:

mvn clean test

Video of run tests are saved in test/resources

Report portal configured in resources/reportportal.properties

Report portal itself can be deployed by docker-compose command from
reportportal tutorial 

rp.uuid should be taken from profile of newly deployed from UI

and set in reportportal.properties

