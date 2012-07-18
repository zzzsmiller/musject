package com.smiller.musject.client.form;

import com.extjs.gxt.ui.client.widget.form.FormPanel;
import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.HTMLPanel;

/**
 * Created with IntelliJ IDEA.
 * User: musatov
 * Date: 7/18/12
 * Time: 5:42 PM
 * To change this template use File | Settings | File Templates.
 */
public class EditGreetingForm extends FormPanel {
    interface EditGreetingFormmUiBinder extends UiBinder<HTMLPanel, EditGreetingForm> {
    }

    private static EditGreetingFormmUiBinder ourUiBinder = GWT.create(EditGreetingFormmUiBinder.class);

    public EditGreetingForm() {
        HTMLPanel rootElement = ourUiBinder.createAndBindUi(this);

    }
}