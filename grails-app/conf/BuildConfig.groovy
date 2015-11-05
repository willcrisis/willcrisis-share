grails.project.repos.bintray.url = "https://api.bintray.com/maven/willcrisis/plugins/willcrisis-security"
grails.project.repos.bintray.username = System.getenv("BINTRAY_USERNAME")
grails.project.repos.bintray.password = System.getenv("BINTRAY_PASSWORD")
grails.project.repos.default = "bintray"

grails.project.work.dir = 'target'

grails.project.dependency.resolver = "maven"
grails.project.dependency.resolution = {
    inherits "global"
    log "warn"
    repositories {
        grailsCentral()
        mavenLocal()
        mavenCentral()
        mavenRepo "http://dl.bintray.com/willcrisis/plugins/"
    }

    plugins {
        build(":release:3.1.1", ":rest-client-builder:2.1.1", ":bintray-upload:0.2") {
            export = false
        }
    }
}
