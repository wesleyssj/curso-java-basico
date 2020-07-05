package com.wesley.cursojavaloiane;

public class AgendaCheiaException extends Throwable {

    @Override
    public String toString() {
        return "Agenda já está cheia!";
    }
}
