package org.grails.datastore.morphium

import org.grails.datastore.mapping.cache.TPCacheAdapterRepository
import org.grails.datastore.mapping.core.AbstractSession
import org.grails.datastore.mapping.core.Datastore
import org.grails.datastore.mapping.engine.Persister
import org.grails.datastore.mapping.model.MappingContext
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
        return null
    }

    @Override
    protected Transaction beginTransactionInternal() {
        return null
    }

    @Override
    Object getNativeInterface() {
        return null
    }
}
