package org.grails.datastore.morphium

import org.grails.datastore.mapping.cache.TPCacheAdapterRepository
import org.grails.datastore.mapping.core.AbstractSession
import org.grails.datastore.mapping.core.Datastore
import org.grails.datastore.mapping.document.config.DocumentPersistentEntity
import org.grails.datastore.mapping.engine.EntityPersister
import org.grails.datastore.mapping.engine.Persister
import org.grails.datastore.mapping.model.MappingContext
import org.grails.datastore.mapping.model.PersistentEntity
import org.grails.datastore.mapping.query.Query
import org.grails.datastore.mapping.transactions.Transaction
import org.springframework.context.ApplicationEventPublisher

class MorphiumSession extends AbstractSession<MorphiumSession> {
    MorphiumSession(Datastore datastore, MappingContext mappingContext, ApplicationEventPublisher publisher) {
        super(datastore, mappingContext, publisher)
    }

    MorphiumSession(Datastore datastore, MappingContext mappingContext, ApplicationEventPublisher publisher, boolean stateless) {
        super(datastore, mappingContext, publisher, stateless)
    }

    MorphiumSession(Datastore datastore, MappingContext mappingContext, ApplicationEventPublisher publisher, TPCacheAdapterRepository cacheAdapterRepository) {
        super(datastore, mappingContext, publisher, cacheAdapterRepository)
    }

    MorphiumSession(Datastore datastore, MappingContext mappingContext, ApplicationEventPublisher publisher, TPCacheAdapterRepository cacheAdapterRepository, boolean stateless) {
        super(datastore, mappingContext, publisher, cacheAdapterRepository, stateless)
    }

    @Override
    protected Persister createPersister(Class cls, MappingContext mappingContext) {
        return new EntityPersister(mappingContext,new DocumentPersistentEntity(cls,mappingContext),this,publisher) {
            @Override
            protected List<Object> retrieveAllEntities(PersistentEntity pe, Serializable[] keys) {
                return null
            }

            @Override
            protected List<Object> retrieveAllEntities(PersistentEntity pe, Iterable<Serializable> keys) {
                return null
            }

            @Override
            protected List<Serializable> persistEntities(PersistentEntity pe,
                                                         @SuppressWarnings("rawtypes") Iterable objs) {
                return null
            }

            @Override
            protected Object retrieveEntity(PersistentEntity pe, Serializable key) {
                return null
            }

            @Override
            protected Serializable persistEntity(PersistentEntity pe, Object obj) {
                return null
            }

            @Override
            protected void deleteEntity(PersistentEntity pe, Object obj) {

            }

            @Override
            protected void deleteEntities(PersistentEntity pe, @SuppressWarnings("rawtypes") Iterable objects) {

            }

            @Override
            Query createQuery() {
                return null
            }

            @Override
            Serializable refresh(Object o) {
                return null
            }
        }
    }

    @Override
    protected Transaction beginTransactionInternal() {
        return new Transaction() {
            @Override
            void commit() {

            }

            @Override
            void rollback() {

            }

            @Override
            Object getNativeTransaction() {
                return null
            }

            @Override
            boolean isActive() {
                return false
            }

            @Override
            void setTimeout(int timeout) {

            }
        }
    }

    @Override
    Object getNativeInterface() {
        return this
    }
}
