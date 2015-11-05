package jmsdemoexternal

class TestController {
    def messageService
    def index() {
        render (view:"index")
    }

    def send(){
        def message = params.message
        messageService.sendMessage(message)
        render (view:"index")
    }
}
