package com.s63d.routescraper.domain.api

data class MapsResponse(val routes: List<RoutesItem>,
                        val geocodedWaypoints: List<GeocodedWaypointsItem>?,
                        val status: String = "")