package dizzcode.com.marsphotos.network

import retrofit2.Retrofit
import retrofit2.converter.scalars.ScalarsConverterFactory
import retrofit2.http.GET

private const val BASE_URL =
    "https://android-kotlin-fun-mars-server.appspot.com"

class MarsApiService {

    object MarsApi {
        private val retrofit = Retrofit.Builder()
            .addConverterFactory(ScalarsConverterFactory.create())
            .baseUrl(BASE_URL)
            .build()

        val retrofitService : MarsApiService by lazy {
            retrofit.create(MarsApiService::class.java)
        }
    }

    interface MarsApiService {
        @GET("photos")
        suspend fun getPhotos(): String
    }

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


