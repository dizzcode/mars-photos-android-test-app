<div align="center">
  
# Mars Photos - Android  - Test App

![Android](https://img.shields.io/badge/Android-3DDC84?style=for-the-badge&logo=android&logoColor=white)
[![Kotlin](https://img.shields.io/badge/Kotlin-0095D5?&style=for-the-badge&logo=kotlin&logoColor=white)](#)

</div>

Mars Photos app is a demo app that shows actual images of Mars' surface. These images are real-life photos from Mars captured by NASA's Mars rovers. The data is stored on a Web server as a REST web service.  
- Platform : Android  
- Langugae : Kotlin

<br>

## 1. Main Screen

<p align="center">
<img 
  src="https://github.com/dizzcode/mars-photos-android-test-app/blob/main/screenshots/img_main.png" 
   width="380" height="720" 
  />
</p>

## 2. What's inside >

1. Web services and Retrofit &nbsp;|&nbsp;  [ More-> ](#web-services-and-retrofit)
2. Different layers
    - Data Layer &nbsp;|&nbsp; [ More-> ](#data-layer)
    - Repository &nbsp;|&nbsp; [ More-> ](#repository)
      
3. Dependency injection (DI) &nbsp;|&nbsp; [ More-> ](#dependency-injection)  

4. Fake data and dependencies for tests
5. Test coroutines
6. ViewModel test
7. Test dispatcher
8. Coil library to load and display an image from a web URL
9. Lazy grids  &nbsp;|&nbsp; [ More-> ](#lazy-grids)
10. Mock Data

****
****
<br>

# > Expand points
****

## Web services and Retrofit
- Internet permission and Exception Handling
- Sealed interface
- Parse the JSON response with kotlinx.serialization
  
****

## Data layer
  A data layer is responsible for the business logic of your app and for sourcing and saving data for your app.   
  The data layer exposes data to the UI layer using the Unidirectional Data Flow pattern.   
  Data can come from multiple sources, like a network request, a local database, or from a file on the device.
  
****

## Repository   
In general a repository class:  
  - Exposes data to the rest of the app.  
  - Centralizes changes to data.   
  - Resolves conflicts between multiple data sources.  
  - Abstracts sources of data from the rest of the app.  
  - Contains business logic.  

The repository naming convention is |  type of data + Repository  
Ex: MarsPhotosRepository
  
****

## Dependency injection
  When a class requires another class, the required class is called a dependency.  
  
  To make the code more flexible and adaptable, a class must not instantiate the objects it depends on.   
  The objects it depends on must be instantiated outside the class and then passed in.  

  Passing in the required objects is called dependency injection (DI). It is also known as inversion of control.  
  
  DI is when a dependency is provided at runtime instead of being hardcoded into the calling class.  

  Implementing dependency injection:
  - Helps with the reusability of code. Code is not dependent on a specific object, which allows for greater flexibility.
  - Makes refactoring easier. Code is loosely coupled, so refactoring one section of code does not impact another section of code.
  - Helps with testing. Test objects can be passed in during testing.
  
****

## Lazy grids  
  The LazyVerticalGrid and LazyHorizontalGrid composables provide support to display items in a grid.

<br>

****
****
<br>

# > All Screens

<br>

<div align="center" class="table-wrapper" markdown="block">
  
<table>
<tr>
  
<td width="33%">

  <p align="center"> Main Screen  </p>
   <hr>
  <img 
  src="https://github.com/dizzcode/mars-photos-android-test-app/blob/main/screenshots/img.png" 
   width="180" height="360" 
  />


</td>

<td width="33%">
  <p align="center"> Retry Screen  </p>
  <hr>
  <img 
  src="https://github.com/dizzcode/mars-photos-android-test-app/blob/main/screenshots/retry_screen.png" 
  width="180" height="360" 
  />
  
</td>

<td width="33%">

  <p align="center"> Error Image Screen  </p>
   <hr>
  <img 
  src="https://github.com/dizzcode/mars-photos-android-test-app/blob/main/screenshots/image_fail_to_load.png" 
   width="180" height="360" 
  />
  
</td>

</tr>
</table>

</div>

<br>

<p align="center">
<img 
  src="https://github.com/dizzcode/mars-photos-android-test-app/blob/main/screenshots/img.png" 
   width="180" height="360" 
  />
<img 
  src="https://github.com/dizzcode/mars-photos-android-test-app/blob/main/screenshots/retry_screen.png" 
  width="180" height="360" 
  />
<img 
  src="https://github.com/dizzcode/mars-photos-android-test-app/blob/main/screenshots/image_fail_to_load.png" 
   width="180" height="360" 
  />
</p>
