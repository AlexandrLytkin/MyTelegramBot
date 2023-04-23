package com.skypro.mytelegrambot.service.impl;

import com.skypro.mytelegrambot.service.UpdateProducer;
import lombok.extern.log4j.Log4j;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.objects.Update;

@Service
@Log4j
public class UpdateProducerImpl implements UpdateProducer {

    @Override
    public void produce(String queue, Update update) {
        log.debug(update.getMessage().getText());
    }
}