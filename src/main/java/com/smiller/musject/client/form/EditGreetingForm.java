package com.smiller.musject.client.form;

import com.sencha.gxt.widget.core.client.TabPanel;
import com.sencha.gxt.widget.core.client.form.FormPanel;

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

    TabPanel tabs;



    public EditGreetingForm() {
        tabs = new TabPanel();
        setWidget(tabs);

    }
}