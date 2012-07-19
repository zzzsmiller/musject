package com.smiller.musject.client.form;

import com.sencha.gxt.core.client.ValueProvider;
import com.sencha.gxt.data.shared.ModelKeyProvider;
import com.sencha.gxt.data.shared.PropertyAccess;
import com.smiller.musject.shared.entity.Greeting;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: musatov
 * Date: 7/19/12
 * Time: 2:25 PM
 * To change this template use File | Settings | File Templates.
 */
public interface GreetingProperties extends PropertyAccess<Greeting> {

    ModelKeyProvider<Greeting> id();

    ValueProvider<Greeting, String> author();

    ValueProvider<Greeting, String> text();

    ValueProvider<Greeting, Date> date();

}
