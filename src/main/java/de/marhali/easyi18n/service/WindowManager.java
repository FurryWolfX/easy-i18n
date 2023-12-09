package de.marhali.easyi18n.service;

import com.intellij.openapi.wm.ToolWindow;
import de.marhali.easyi18n.tabs.TableView;

/**
 * Provides access to the plugin's own tool-window.
 * @author marhali
 */
public class WindowManager {

    private static WindowManager INSTANCE;

    private ToolWindow toolWindow;
    private TableView tableView;

    public static WindowManager getInstance() {
        return INSTANCE == null ? INSTANCE = new WindowManager() : INSTANCE;
    }

    private WindowManager() {}

    public void initialize(ToolWindow toolWindow, TableView tableView) {
        this.toolWindow = toolWindow;
        this.tableView = tableView;
    }

    public ToolWindow getToolWindow() {
        return toolWindow;
    }


    public TableView getTableView() {
        return tableView;
    }
}