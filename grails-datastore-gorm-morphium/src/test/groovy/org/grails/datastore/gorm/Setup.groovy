package org.grails.datastore.gorm

import org.grails.datastore.gorm.events.AutoTimestampEventListener
import org.grails.datastore.gorm.events.DomainEventListener
import org.grails.datastore.mapping.core.Session
import org.grails.datastore.mapping.model.MappingContext
import org.grails.datastore.mapping.transactions.DatastoreTransactionManager
import org.grails.datastore.morphium.MorphiumDatastore
import org.springframework.context.support.GenericApplicationContext

class Setup {

    static morphiumDs

    static destroy() {
        morphiumDs.disconnect()
    }
    static Session setup(classes) {
        def ctx = new GenericApplicationContext()
        ctx.refresh()
        Properties config=new Properties();

        morphiumDs = new MorphiumDatastore(ctx)
        for (cls in classes) {
            morphiumDs.mappingContext.addPersistentEntity(cls)
        }


        def enhancer = new GormEnhancer(morphiumDs, new DatastoreTransactionManager(datastore: morphiumDs))
        enhancer.enhance()

        morphiumDs.mappingContext.addMappingContextListener({ e -> enhancer.enhance e } as MappingContext.Listener)

        morphiumDs.connect()
    }
}