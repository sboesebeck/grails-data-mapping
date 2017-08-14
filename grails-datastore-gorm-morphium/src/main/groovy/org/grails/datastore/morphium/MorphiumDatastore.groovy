package org.grails.datastore.morphium

import org.grails.datastore.gorm.events.DefaultApplicationEventPublisher
import org.grails.datastore.mapping.cache.TPCacheAdapterRepository
import org.grails.datastore.mapping.core.AbstractDatastore
import org.grails.datastore.mapping.core.Session
import org.grails.datastore.mapping.document.config.DocumentMappingContext
import org.grails.datastore.mapping.model.MappingContext
import org.springframework.context.ConfigurableApplicationContext
import org.springframework.context.support.GenericApplicationContext
import org.springframework.core.env.PropertyResolver
import grails.core.GrailsApplication

class MorphiumDatastore extends AbstractDatastore {


    MorphiumDatastore(GenericApplicationContext appContext) {
        super(new DocumentMappingContext("testdb"))
    }

    @Override
    protected Session createSession(PropertyResolver connectionDetails) {

        return new MorphiumSession(this,mappingContext,new DefaultApplicationEventPublisher())
    }
}
