package com.smiller.musject.client.form;

import com.sencha.gxt.widget.core.client.TabPanel;
import com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer;
import com.sencha.gxt.widget.core.client.form.FormPanel;
import com.smiller.musject.client.messages.formtitles.EditGreetingsMessages;
import com.smiller.musject.client.utils.MessageFactory;

import static com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer.VerticalLayoutData;


/**
 * Created with IntelliJ IDEA.
 * User: musatov
 * Date: 7/18/12
 * Time: 5:42 PM
 * To change this template use File | Settings | File Templates.
 */
public class EditGreetingForm extends FormPanel {

    /*interface EditGreetingFormmUiBinder extends UiBinder<Widget, EditGreetingForm> {
    }

    private static EditGreetingFormmUiBinder ourUiBinder = GWT.create(EditGreetingFormmUiBinder.class);

    public EditGreetingForm() {
        Widget rootElement = ourUiBinder.createAndBindUi(this);

    }*/

    public EditGreetingForm() {
        TabPanel tabs = new TabPanel();
        setWidget(tabs);
        EditGreetingsMessages msgs = MessageFactory.getEditGreetingsMessages();

        VerticalLayoutContainer tabContainer = new VerticalLayoutContainer();
        tabs.add(tabContainer, msgs.viewAllTitle());

        tabContainer.add(new EditGreetingForm(), new VerticalLayoutData(1, -1));

        tabs.add(new VerticalLayoutContainer(), msgs.addGreetingTitle());
        tabs.add(new VerticalLayoutContainer(), msgs.editGreetingTitle());
        tabs.add(new VerticalLayoutContainer(), msgs.dellGreetingTitle());
    }
}