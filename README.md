<h1 align="center" > Mars Photos - Android  - Test App </h1>

## ɪ  ⁃  ᴘʀᴏᴊᴇᴄᴛ ɪɴꜰᴏ

Mars Photos app is a demo app that shows actual images of Mars' surface. These images are real-life photos from Mars captured by NASA's Mars rovers. The data is stored on a Web server as a REST web service.  

<br>

<div align="center">
⁃ ᴛᴇᴄʜɴᴏʟᴏɢɪᴇꜱ | ᴘʟᴀᴛꜰᴏʀᴍ ⁃
<br>
<br>
  
[![Platform](https://img.shields.io/badge/-Android%20|%20Platform-2E8B57?logo=android&logoColor=white&style=for-the-badge)](#)
[![Language](https://img.shields.io/badge/-Kotlin%20|%20Language-%2307405e?logo=kotlin&logoColor=white&style=for-the-badge)](#)

[![MIN API LEVEL](https://img.shields.io/badge/-MIN%20SDK%20|%2024-1C1E24?logo=planetscale&logoColor=00C7B7&style=for-the-badge)](#)
[![Target Version](https://img.shields.io/badge/-Target%20SDK%20|%2034-1C1E24?logo=planetscale&logoColor=00C7B7&style=for-the-badge)](#)
[![Architecture](https://img.shields.io/badge/-Architecture%20|%20MVI-1C1E24?logo=planetscale&logoColor=00C7B7&style=for-the-badge)](#)
[![UI](https://img.shields.io/badge/-UI%20|%20Jetpack%20Compose-1C1E24?logo=planetscale&logoColor=00C7B7&style=for-the-badge)](#)

</div>

<br>

<p align="center">
<img 
  src="https://github.com/dizzcode/mars-photos-android-test-app/blob/main/screenshots/img_main.png" 
   width="380" height="720" 
  />
</p>

## ɪɪ ⁃ ᴡʜᴀᴛ ᴜꜱᴇʀꜱ ᴄᴀɴ ᴇxᴘᴇᴄᴛ

### ⭓ Features

  
  1. **View Real Mars Photos:**
       - Users can browse through authentic images of Mars' surface taken by NASA’s rovers.
         
  2. **Seamless Image Loading:**
       - The app provides a smooth experience with quick image loading via URL.
        
  3. **Simple and Intuitive UI:**
       - Easy navigation and clean layout for viewing images of Mars.

##
### ⭓ Requirements
  - Android 7.0 and Above
  - Min SDK version 24


##
### ⭓ Permissions
  - Internet

<hr>

## ɪɪɪ ⁃ ᴠɪꜱᴜᴀʟ ᴛᴏᴜʀ ᴏꜰ ᴛʜᴇ ᴀᴘᴘ: ꜱᴄʀᴇᴇɴꜱ

<p align="center">
<img 
  src="https://github.com/dizzcode/mars-photos-android-test-app/blob/main/screenshots/img.png" 
   width="200" height="460" 
  />
<img 
  src="https://github.com/dizzcode/mars-photos-android-test-app/blob/main/screenshots/retry_screen.png" 
  width="200" height="460" 
  />
<img 
  src="https://github.com/dizzcode/mars-photos-android-test-app/blob/main/screenshots/image_fail_to_load.png" 
   width="200" height="460" 
  />
</p>


#
<div align="center">


![forthebadge](https://forthebadge.com/images/badges/built-with-love.svg)
![ForTheBadge ANDROID](https://forthebadge.com/images/badges/built-for-android.svg)
![ForTheBadge GIT](https://forthebadge.com/images/badges/uses-git.svg)

  <br>
  
  <kbd>[&nbsp; ⮝ &nbsp;  BACK TO TOP  &nbsp;&nbsp;&nbsp;](#ɪ----ᴘʀᴏᴊᴇᴄᴛ-ɪɴꜰᴏ) </kbd>
</div>

#

> [!NOTE]
> *Dev Zone: The following sections are crafted specifically for use in development.*

#
## ɪᴠ ⁃ ʙᴇʜɪɴᴅ ᴛʜᴇ ᴄᴏᴅᴇ: ᴅᴇᴠ ꜰᴇᴀᴛᴜʀᴇꜱ

### ⭓ Features

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


#
### ⭓ App Dependencies/Libraries Overview

<br>

* [Kotlin][0] : Kotlin is statically typed & first-class language for Android Development.
* [Coroutines][1] : For Asynchronus or non-blocking operations.
* [Flows][2] : Data Streaming API which is built on top of Coroutines.
* [Jetpack Compose][3] : Toolkit for building native UI in a declarative way.
* [Splash Screen API][4] : Launch app with animation of launcher icon.
* [Retrofit][5] : Type-safe REST client for Android to consume RESTful web services.
* [Dagger Hilt][6] : Dependency injection library for Android.
* [Kotlin DSL][7] : For writing gradle script for Kotlin is more readable and offers better compile-time.

[0]:  https://kotlinlang.org/
[1]:  https://kotlinlang.org/docs/coroutines-overview.html
[2]:  https://developer.android.com/kotlin/flow
[3]:  https://developer.android.com/jetpack/compose
[4]:  https://developer.android.com/develop/ui/views/launch/splash-screen
[5]:  https://github.com/square/retrofit
[6]:  https://dagger.dev/hilt/
[7]:  https://docs.gradle.org/current/userguide/kotlin_dsl.html

<br>

____
## ᴠ ⁃ ᴘʀᴏᴊᴇᴄᴛ ʙʀᴀɴᴄʜᴇꜱ

- [master](https://github.com/dizzcode/mars-photos-android-test-app/tree/master) - master branch will contain the production code.
- [dev](https://github.com/dizzcode/mars-photos-android-test-app/tree/dev) - development branch will contain the on-going app feature developement and bug fixes

<br>  

#
<div align="center">

  <kbd>[&nbsp; ⮝ &nbsp;  BACK TO TOP  &nbsp;&nbsp;&nbsp;](#ɪ----ᴘʀᴏᴊᴇᴄᴛ-ɪɴꜰᴏ) </kbd>
</div>
<hr>



# ᴠɪ ⁃ ᴘʀᴏᴊᴇᴄᴛ ɴᴏᴛᴇꜱ

____

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



<br>


