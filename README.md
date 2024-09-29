# Mars Photos android test app

## What's inside >

### Web services and Retrofit
- Internet permission and Exception Handling
- Sealed interface
- Parse the JSON response with kotlinx.serialization

### Different layers
- data layer
  A data layer is responsible for the business logic of your app and for sourcing and saving data for your app.   
  The data layer exposes data to the UI layer using the Unidirectional Data Flow pattern.   
  Data can come from multiple sources, like a network request, a local database, or from a file on the device.

- repository   
In general a repository class:  
-- Exposes data to the rest of the app.  
-- Centralizes changes to data.   
-- Resolves conflicts between multiple data sources.  
-- Abstracts sources of data from the rest of the app.  
-- Contains business logic.  

##
### View
##

<img
src="https://github.com/dizzcode/mars-photos-android-test-app/blob/main/screenshots/img.png"
width="320"
height="680"
/>

