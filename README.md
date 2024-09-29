# Mars Photos android test app

## What's inside >

### Web services and Retrofit
- Internet permission and Exception Handling
- Sealed interface
- Parse the JSON response with kotlinx.serialization

### Different layers
- Data layer
  A data layer is responsible for the business logic of your app and for sourcing and saving data for your app.   
  The data layer exposes data to the UI layer using the Unidirectional Data Flow pattern.   
  Data can come from multiple sources, like a network request, a local database, or from a file on the device.

- Repository   
In general a repository class:  
-- Exposes data to the rest of the app.  
-- Centralizes changes to data.   
-- Resolves conflicts between multiple data sources.  
-- Abstracts sources of data from the rest of the app.  
-- Contains business logic.  

The repository naming convention is |  type of data + Repository  
Ex: MarsPhotosRepository

- Dependency injection
  When a class requires another class, the required class is called a dependency.  
  
  To make the code more flexible and adaptable, a class must not instantiate the objects it depends on.   
  The objects it depends on must be instantiated outside the class and then passed in.

  Passing in the required objects is called dependency injection (DI). It is also known as inversion of control.
  
  DI is when a dependency is provided at runtime instead of being hardcoded into the calling class.

  Implementing dependency injection:
-- Helps with the reusability of code. Code is not dependent on a specific object, which allows for greater flexibility.
-- Makes refactoring easier. Code is loosely coupled, so refactoring one section of code does not impact another section of code.
-- Helps with testing. Test objects can be passed in during testing.
  
  
- Fake data and dependencies for tests
- Test coroutines
- ViewModel test
- Test dispatcher
- Coil library to load and display an image from a web URL

- Lazy grids  
  The LazyVerticalGrid and LazyHorizontalGrid composables provide support to display items in a grid.

- Mock Data

##
### View
##

### Main Screen

<img
src="https://github.com/dizzcode/mars-photos-android-test-app/blob/main/screenshots/img.png"
width="320"
height="680"
/>

##
### Retry Screen

<img
src="https://github.com/dizzcode/mars-photos-android-test-app/blob/main/screenshots/retry_screen.png"
width="320"
height="680"
/>

##
### When Images fail to load

<img
src="https://github.com/dizzcode/mars-photos-android-test-app/blob/main/screenshots/image_fail_to_load.png"
width="320"
height="680"
/>
