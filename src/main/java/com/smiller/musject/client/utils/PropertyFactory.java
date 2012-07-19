package com.smiller.musject.client.utils;

import com.google.gwt.core.client.GWT;
import com.smiller.musject.client.form.GreetingProperties;

/**
 * Created with IntelliJ IDEA.
 * User: musatov
 * Date: 7/19/12
 * Time: 2:29 PM
 * To change this template use File | Settings | File Templates.
 */
public class PropertyFactory {

    private static GreetingProperties greetingProperties;

    public static GreetingProperties getGreetingProperties() {
        if (greetingProperties == null) {
            greetingProperties = GWT.create(GreetingProperties.class);
        }
        return greetingProperties;
    }
}
