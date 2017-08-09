package org.grails.datasource.morphium.test

import org.junit.runners.Suite.SuiteClasses
import org.junit.runners.Suite
import org.junit.runner.RunWith
import grails.gorm.tests.*

/**
 * @author graemerocher
 */
@RunWith(Suite)
@SuiteClasses([
        FindByMethodSpec,
        ListOrderBySpec
])

class MorphiumTestSuite {
}
