package digital.cariad.logger

import io.github.oshai.kotlinlogging.KotlinLogging

class TestLogger {

    private val logger = KotlinLogging.logger {}

    fun calculateReachableRange() {
        logger.info { "Testing logger.. " }

    }

}