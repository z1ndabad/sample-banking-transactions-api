# Simple Banking Transactions API

This project serves a REST API conveying transaction data from the Open Bank Sandbox API as simple, flat JSON. Transactions are cached for 60 seconds following each request. The API is secured with basic auth.

The API currently supports 3 endpoints:
- `{bank}/transactions` -- Returns a list of all transactions for the provided bank ID
- `{bank}/transactions/types/{type}` -- Returns a list for the provided bank ID, filtered by the provided type
- `{bank}/transactions/totals` -- Returns a list of total transaction amounts per transaction type

## Running
- Prerequisites: JDK 8, Maven 3.6+
- Platform support: Tomcat 8.5
- Clone or download the repo at https://github.com/TSamee/sample-banking-transactions-api
- Run `mvn package` in the project directory and serve the resulting WAR
- Alternatively, use Eclipse to download and install a Tomcat 8.5 dev server, right-click the project under Project Explorer and select Run as > Run on Server
- Ensure src/main/source is on the classpath

## Testing
- Point Eclipse JUnit run configurations to the `AllUnitTest` class and run
- Alternatively, run `mvn clean test` in the project directory to run unit tests, powered by JUnit 5 and Mockito

## Usage
- When making requests, include the header `Authorization:Basic` and supply a valid set of credentials. Currently only a test user is configured

## Known issues & limitations
- Limited to transactions in the Open Bank Sandbox public API
- Caching mechanism is very basic, no help for clients making requests >60 seconds apart
- No distinction between receiving an error code from OpenBank, i.e., in case of an inaccessible account, or simply encountering an empty transaction list. Both cases will return an empty list to the client
- Currency amounts sent without trailing zeroes
