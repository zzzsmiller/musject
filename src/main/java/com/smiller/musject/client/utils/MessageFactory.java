package com.smiller.musject.client.utils;

import com.google.gwt.core.client.GWT;
import com.smiller.musject.client.messages.formtitles.EditGreetingsMessages;

/**
 * Created with IntelliJ IDEA.
 * User: musatov
 * Date: 7/19/12
 * Time: 11:43 AM
 * To change this template use File | Settings | File Templates.
 */
public class MessageFactory {

    private static EditGreetingsMessages editGreetingsMessages;

    public static EditGreetingsMessages getEditGreetingsMessages() {
        if (editGreetingsMessages == null) {
            editGreetingsMessages = GWT.create(EditGreetingsMessages.class);
        }
        return editGreetingsMessages;
    }
}
