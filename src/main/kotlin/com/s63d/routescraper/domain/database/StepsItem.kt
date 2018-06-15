package com.s63d.routescraper.domain.database

import com.s63d.routescraper.domain.api.Distance
import com.s63d.routescraper.domain.api.Duration
import org.springframework.data.mongodb.core.geo.GeoJsonLineString
import org.springframework.data.mongodb.core.geo.GeoJsonPoint

data class StepsItem(val duration: Duration,
                     val startLocation: GeoJsonPoint,
                     val distance: Distance,
                     val travelMode: String = "",
                     val endLocation: GeoJsonPoint,
                     val polyline: GeoJsonLineString)