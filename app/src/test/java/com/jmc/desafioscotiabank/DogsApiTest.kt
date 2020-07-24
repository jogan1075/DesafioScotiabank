package com.jmc.desafioscotiabank

import com.jmc.desafioscotiabank.data.dataSource.remote.DogService
import com.jmc.desafioscotiabank.di.appModule
import kotlinx.coroutines.runBlocking
import org.junit.After
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import org.koin.core.context.stopKoin
import org.koin.test.KoinTest
import org.koin.test.inject

class DogsApiTest : KoinTest {

    private val dogSearchQuery = "akita"


    private val api: DogService by inject()

    @Before
    fun `start koin`() {
        startKoin {
            modules(
                testModule
            )
        }
    }

    @Test
    fun `should get list Dogs from api`() {
        val result = runBlocking {
            api.getListDogs().execute().body()
        }

        Assert.assertNotNull(result); result ?: return

        Assert.assertTrue(result.message!!.isNotEmpty())
    }

    @Test
    fun `should get the images Dogs from api`() {
        val result = runBlocking {
            api.getDogsByName(type = dogSearchQuery).execute().body()
        }

        Assert.assertNotNull(result); result ?: return

        Assert.assertTrue(result.message!!.isNotEmpty())
    }


    @After
    fun `stop koin`() {
        stopKoin()
    }
}
