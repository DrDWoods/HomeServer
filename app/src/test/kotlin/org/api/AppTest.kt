/*
 * This source file was generated by the Gradle 'init' task
 */
package org.api

import kotlin.test.Test
import kotlin.test.assertNotNull

class AppTest {
    @Test fun appHasAGreeting() {
        val classUnderTest = App()
        assertNotNull(classUnderTest.greeting(), "This is to satisfy a test")
    }
}