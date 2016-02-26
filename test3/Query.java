// Instantiate the Choreo, using a previously instantiated TembooSession object, eg:
// TembooSession session = new TembooSession("accountName", "myFirstApp", "abc123xxxxxxxxxxxxxx");

Query queryChoreo = new Query(session);

// Get an InputSet object for the choreo
QueryInputSet queryInputs = queryChoreo.newInputSet();

// Set inputs

// Execute Choreo
QueryResultSet queryResults = queryChoreo.execute(queryInputs);