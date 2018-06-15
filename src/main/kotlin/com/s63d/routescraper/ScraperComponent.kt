package com.s63d.routescraper

import com.fasterxml.jackson.databind.PropertyNamingStrategy
import com.github.kittinunf.fuel.core.FuelManager
import com.github.kittinunf.fuel.jackson.mapper
import org.slf4j.LoggerFactory
import org.springframework.scheduling.annotation.EnableScheduling
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component

@Component
@EnableScheduling
class ScraperComponent {
    companion object {
        const val API_KEY = "AIzaSyAuNGqrWQIRmNpBF7uhbZ1koVxVWQZmRNY"
        const val URL = "https://maps.googleapis.com/maps/api/directions/json"
        init {
            FuelManager.instance.baseParams = listOf("mode" to "driving","key" to API_KEY)
            mapper.propertyNamingStrategy = PropertyNamingStrategy.SNAKE_CASE
        }
    }
    private val logger = LoggerFactory.getLogger(ScraperComponent::class.java)

    @Scheduled(fixedRate = 5000)
    fun scrapeRoute() {
        val from = allCities.random()
        val to = allCities.random()


        logger.info("Generating trip from $from to $to")
    }
}