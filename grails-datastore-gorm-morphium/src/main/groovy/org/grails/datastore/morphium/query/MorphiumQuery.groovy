package org.grails.datastore.morphium.query

import org.grails.datastore.mapping.core.Session
import org.grails.datastore.mapping.model.PersistentEntity
import org.grails.datastore.mapping.query.Query

class MorphiumQuery extends Query {
    protected MorphiumQuery(Session session, PersistentEntity entity) {
        super(session, entity)
    }

    @Override
    protected List executeQuery(PersistentEntity entity, Query.Junction criteria) {
        return null
    }
}
