package com.s63d.routescraper.domain.api

import com.s63d.routescraper.domain.database.LegsItem

data class LegsItem(val duration: Duration,
                    val startLocation: Coordinate,
                    val distance: Distance,
                    val startAddress: String = "",
                    val endLocation: Coordinate,
                    val endAddress: String = "",
                    val steps: List<StepsItem>) {
    fun toDatabaseModel() : LegsItem {
        return LegsItem(duration, startLocation.toGeoJsonPoint(), distance, startAddress, endLocation.toGeoJsonPoint(), endAddress, steps.map(StepsItem::toDatabaseModel))
    }
}