- [] run it-tests with built jar
- [] mvn clean verify is broken...
   currently need to mvn clean pakage -DskipTests=true && mvn verify
   to fix that:
    - must: attach integration tests to after package lifecycle
    - most-likely: got to factor out integration tests to separate maven profile
