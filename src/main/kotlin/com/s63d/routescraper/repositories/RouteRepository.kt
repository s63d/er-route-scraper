package com.s63d.routescraper.repositories

import com.s63d.routescraper.domain.database.RoutesItem
import org.bson.types.ObjectId
import org.springframework.data.mongodb.repository.MongoRepository

interface RouteRepository : MongoRepository<RoutesItem, ObjectId>