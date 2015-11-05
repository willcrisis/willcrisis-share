USAGE = '''
share-domain <domain-class-package> <domain-class-to-share> <owner-class> [relationship-class-name]

where:
<domain-class-package> - Package where the relationship class will be created
<domain-class-to-share> - The domain class you wish to share (with package)
<owner-class> - The domain class that owns the relationship (with package)
[relationship-class-name] - (Optional) The name to the relationship class that will be created

Creates a relationship class between a domain class and a owner class that allows the data sharing.

Example: grails share-domain com.yourapp com.yourapp.yourpackage.Car com.yourapp.security.User
Example: grails share-domain com.yourapp com.yourapp.yourpackage.Car com.yourapp.security.User AllowedCarUsers
'''

includeTargets << grailsScript('_GrailsBootstrap')

appDir = "$basedir/grails-app"

packageName = ''
domainClassToShare = ''
ownerClassName = ''
relationshipClassName = ''

target(shareDomain: 'Creates artifacts for sharing a domain class') {

}