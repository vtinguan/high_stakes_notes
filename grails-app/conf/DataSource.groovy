dataSource {
    pooled = true
    dbCreate = "update"
    url = "jdbc:mysql://localhost/high_stakes"
    driverClassName = "com.mysql.jdbc.Driver"
    dialect = "org.hibernate.dialect.MySQL5InnoDBDialect"
    //dialect = "org.hibernate.dialect.H2Dialect"
    username = "root"
    password = ""
}
hibernate {
    cache.use_second_level_cache = true
    cache.use_query_cache = false
    cache.region.factory_class = 'net.sf.ehcache.hibernate.EhCacheRegionFactory'
}
// environment specific settings
environments {
    development {
        /*dataSource {
            dbCreate = "create-drop" // one of 'create', 'create-drop', 'update', 'validate', ''
            url = "jdbc:h2:mem:devDb;MVCC=TRUE;LOCK_TIMEOUT=10000"
        } */
        dataSource {
            pooled = true
            driverClassName = "com.mysql.jdbc.Driver"
            dialect = org.hibernate.dialect.MySQL5InnoDBDialect
            // other common settings here
        }
    }
    test {
        dataSource {
            dbCreate = "update"
            url = "jdbc:h2:mem:testDb;MVCC=TRUE;LOCK_TIMEOUT=10000"
        }
    }
    production {
        dataSource {
            username = "tinguan"
            password = "spockillhim!!!"
            pooled = true
            dbCreate = "update"
            driverClassName = "com.mysql.jdbc.Driver"
            url = "jdbc:mysql://aaeqgwif28rx3m.cwdc9edmcxbk.us-east-1.rds.amazonaws.com:3306/ebdb?user=tinguan&password=spockillhim!!!"
            dialect = org.hibernate.dialect.MySQL5InnoDBDialect
            properties {
                validationQuery = "SELECT 1"
                testOnBorrow = true
                testOnReturn = true
                testWhileIdle = true
                timeBetweenEvictionRunsMillis = 1800000
                numTestsPerEvictionRun = 3
                minEvictableIdleTimeMillis = 1800000
            }
        }
    }
}