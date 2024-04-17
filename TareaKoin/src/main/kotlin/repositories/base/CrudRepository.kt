package org.example.repositories.base

interface CrudRepository {
    fun findAll(): List<T>
    fun findById(id: ID): T?
    fun save(item: T): T
    fun update(id: ID, item: T): T?
    fun delete(id: ID): T?
}