package stas.paliutin.discovery;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
class MessageRestController {

    @Value("${message:Hello default}")//todo здесь вся фишка - это сообщение может подменяться 2-мя способами: 1. local application.properties 2. Config Server -> git
    private String message;

    @RequestMapping("/message")
    String getMessage() {
        return this.message;
    }
}