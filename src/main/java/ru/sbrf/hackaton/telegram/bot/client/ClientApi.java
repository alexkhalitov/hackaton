package ru.sbrf.hackaton.telegram.bot.client;

import ru.sbrf.hackaton.telegram.bot.model.Issue;

/**
 * Интерфейс вз-я бота специалиста с клиентским ботом
 */
public interface ClientApi {
    /**
     * Отправка ответа по заявке
     * @param issue заявка
     * @param answer ответ специалиста
     * @param photo
     */
    void answer(Issue issue, String answer, String photo);

    /**
     * Отправка клиенту запроса на закрытие тикета
     * @param issue заявка
     */
    void closeIssue(Issue issue);
}
