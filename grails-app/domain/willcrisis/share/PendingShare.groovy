package willcrisis.share

class PendingShare {

    String email
    Long objectId
    Class objectType
    String serviceName

    static constraints = {
        email nullable: false, email: true
        objectId nullable: false
        objectType nullable: false
        serviceName nullable: false
    }
}
