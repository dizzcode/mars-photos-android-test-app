package dizzcode.com.marsphotos.network

import dizzcode.com.marsphotos.model.MarsPhoto
import retrofit2.http.GET

interface MarsApiService {
    @GET("photos")
    suspend fun getPhotos(): List<MarsPhoto>
}

/** NOTE
 * In Kotlin, object declarations are used to declare singleton objects.
 *
 * Warning:
 * Singleton pattern is not a recommended practice.
 * Singletons represent global states that are hard to predict, particularly in tests.
 * Objects should define which dependencies they need, instead of describing how to create them.
 *
 * Use Dependency injection over singleton pattern,
 */


