package org.grails.datastore.morphium.org.grails.datastore.morphium.engine

import org.grails.datastore.mapping.cache.TPCacheAdapterRepository
import org.grails.datastore.mapping.core.Session
import org.grails.datastore.mapping.engine.AssociationIndexer
import org.grails.datastore.mapping.engine.EntityAccess
import org.grails.datastore.mapping.engine.NativeEntryEntityPersister
import org.grails.datastore.mapping.engine.PropertyValueIndexer
import org.grails.datastore.mapping.model.MappingContext
import org.grails.datastore.mapping.model.PersistentEntity
import org.grails.datastore.mapping.model.PersistentProperty
import org.grails.datastore.mapping.model.types.Association
import org.grails.datastore.mapping.query.Query
import org.springframework.context.ApplicationEventPublisher

class MorphiumEntityPersister extends NativeEntryEntityPersister{
    MorphiumEntityPersister(MappingContext mappingContext, PersistentEntity entity, Session session, ApplicationEventPublisher publisher) {
        super(mappingContext, entity, session, publisher)
    }

    MorphiumEntityPersister(MappingContext mappingContext, PersistentEntity entity, Session session, ApplicationEventPublisher publisher, TPCacheAdapterRepository cacheAdapterRepository) {
        super(mappingContext, entity, session, publisher, cacheAdapterRepository)
    }

    @Override
    String getEntityFamily() {
        return null
    }

    @Override
    protected void deleteEntry(String family, Object key, Object entry) {

    }

    @Override
    protected Object generateIdentifier(PersistentEntity persistentEntity, Object entry) {
        return null
    }

    @Override
    PropertyValueIndexer getPropertyIndexer(PersistentProperty property) {
        return null
    }

    @Override
    AssociationIndexer getAssociationIndexer(Object nativeEntry, Association association) {
        return null
    }

    @Override
    protected Object createNewEntry(String family) {
        return null
    }

    @Override
    protected Object getEntryValue(Object nativeEntry, String property) {
        return null
    }

    @Override
    protected void setEntryValue(Object nativeEntry, String key, Object value) {

    }

    @Override
    protected Object retrieveEntry(PersistentEntity persistentEntity, String family, Serializable key) {
        return null
    }

    @Override
    protected Object storeEntry(PersistentEntity persistentEntity, EntityAccess entityAccess, Object storeId, Object nativeEntry) {
        return null
    }

    @Override
    protected void updateEntry(PersistentEntity persistentEntity, EntityAccess entityAccess, Object key, Object entry) {

    }

    @Override
    protected void deleteEntries(String family, List keys) {

    }

    @Override
    Query createQuery() {
        return null
    }
}
