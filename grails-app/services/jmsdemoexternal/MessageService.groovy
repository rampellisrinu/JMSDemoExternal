package jmsdemoexternal

class MessageService {

    def jmsService

    def sendMessage(message){
        jmsService.send(queue: "notification", message, "standard", null)
    }

}
