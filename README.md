
# My Credit Manager

This projects purpose is to automate one happy path scenerio for the My Credit Manager application.

## Required
- JAVA 11
- Latest version of Chrome
## Cucumber BDD Framework
- Framework has TWO key layers: Business Layer & Implementation Layer
- Business Layer: Test scenario is written in feature files in Gherkin language.
- Implementation Layer: Java logic and test script is in Step Definitions package.
- Runner package: Allows you run scenario with the use of tags in feature files
- Current tag is "@test1" and test will run with that tag unless altered
- Pages Package: WebElements used in test are stored here for better maintainability.
- Configuration.properties: has URL and browser set up. Chrome by default.
## How to Run
- Go to Runners Package --> Runner class --> Make sure dryRun = false and tags = "@test1" --> Run
- Cucumber report will become availabe in console for reference.