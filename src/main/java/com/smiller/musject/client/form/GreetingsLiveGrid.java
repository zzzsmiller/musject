package com.smiller.musject.client.form;

import com.google.gwt.cell.client.DateCell;
import com.google.gwt.core.client.Scheduler;
import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.sencha.gxt.core.client.resources.ThemeStyles;
import com.sencha.gxt.data.client.loader.RpcProxy;
import com.sencha.gxt.data.shared.ListStore;
import com.sencha.gxt.data.shared.ModelKeyProvider;
import com.sencha.gxt.data.shared.loader.PagingLoadConfig;
import com.sencha.gxt.data.shared.loader.PagingLoadResult;
import com.sencha.gxt.data.shared.loader.PagingLoader;
import com.sencha.gxt.widget.core.client.grid.*;
import com.sencha.gxt.widget.core.client.toolbar.ToolBar;
import com.smiller.musject.client.messages.formtitles.EditGreetingsMessages;
import com.smiller.musject.client.service.IntroduceServiceAsync;
import com.smiller.musject.client.utils.MessageFactory;
import com.smiller.musject.client.utils.PropertyFactory;
import com.smiller.musject.shared.entity.Greeting;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: musatov
 * Date: 7/19/12
 * Time: 1:54 PM
 * To change this template use File | Settings | File Templates.
 */
public class GreetingsLiveGrid extends Grid<Greeting> {

    private RpcProxy<PagingLoadConfig, PagingLoadResult<Greeting>> rpcProxy =
            new RpcProxy<PagingLoadConfig, PagingLoadResult<Greeting>>() {
                @Override
                public void load(PagingLoadConfig loadConfig, AsyncCallback<PagingLoadResult<Greeting>> callback) {
                    IntroduceServiceAsync.Util.getInstance().getGreetings(loadConfig, callback);
                }
            };

    private PagingLoader<PagingLoadConfig, PagingLoadResult<Greeting>> pagingLoader =
            new PagingLoader<PagingLoadConfig, PagingLoadResult<Greeting>>(rpcProxy);

    private ListStore<Greeting> store = new ListStore<Greeting>(new ModelKeyProvider<Greeting>() {
        @Override
        public String getKey(Greeting item) {
            return item.getId().toString();
        }
    });

    private final LiveGridView<Greeting> lview = new LiveGridView<Greeting>();

    public GreetingsLiveGrid() {
        init();
    }

    private void init() {
        List<ColumnConfig<Greeting, ?>> columnConfigs = initColumnConfig();


        lview.setForceFit(true);

        ColumnModel<Greeting> columnModel = new ColumnModel<Greeting>(columnConfigs);

        /*Grid<Greeting> grid = new Grid<Greeting>(store, columnModel) {
            @Override
            protected void onAfterFirstAttach() {
                Scheduler.get().scheduleDeferred(new Scheduler.ScheduledCommand() {
                    @Override
                    public void execute() {
                        pagingLoader.load(0, lview.getCacheSize());
                    }
                });
            }
        };*/
        setLoadMask(true);
        setLoader(pagingLoader);
        setView(lview);

        /*ToolBar toolBar = new ToolBar();
        toolBar.add(new LiveToolItem(grid));
        toolBar.addStyleName(ThemeStyles.getStyle().borderTop());*/


    }

    private List<ColumnConfig<Greeting, ?>> initColumnConfig() {
        GreetingProperties props = PropertyFactory.getGreetingProperties();
        List<ColumnConfig<Greeting, ?>> listColumnConfigs = new ArrayList<ColumnConfig<Greeting, ?>>();
        EditGreetingsMessages msgs = MessageFactory.getEditGreetingsMessages();
        ColumnConfig<Greeting, ?> column = new ColumnConfig<Greeting, String>(props.author(), 150, msgs.author());
        listColumnConfigs.add(column);
        column = new ColumnConfig<Greeting, String>(props.text(), 300, msgs.text());
        listColumnConfigs.add(column);
        ColumnConfig<Greeting, Date> dateColumnConfig = new ColumnConfig<Greeting, Date>(props.date(), 250, msgs.date());
        dateColumnConfig.setCell(new DateCell(DateTimeFormat.getFormat("dd.MM.YYYY HH:mm:ss")));
        listColumnConfigs.add(column);
        return listColumnConfigs;
    }

    @Override
    protected void onAfterFirstAttach() {
        Scheduler.get().scheduleDeferred(new Scheduler.ScheduledCommand() {
            @Override
            public void execute() {
                pagingLoader.load(0, lview.getCacheSize());
            }
        });
    }
}
