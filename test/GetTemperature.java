// Instantiate the Choreo, using a previously instantiated TembooSession object, eg:
// TembooSession session = new TembooSession("tmb-qa-jhs-0225", "myFirstApp", "E1mmYzJIgaggKDHfptN4kTpKQFVndPaI");

GetTemperature getTemperatureChoreo = new GetTemperature(session);

// Get an InputSet object for the choreo
GetTemperatureInputSet getTemperatureInputs = getTemperatureChoreo.newInputSet();

// Set inputs

// Execute Choreo
GetTemperatureResultSet getTemperatureResults = getTemperatureChoreo.execute(getTemperatureInputs);