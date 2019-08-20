package org.dscsastra.aerialsrgandatacollector;

import org.openstreetmap.josm.gui.MainApplication;
import org.openstreetmap.josm.gui.MainMenu;
import org.openstreetmap.josm.plugins.Plugin;
import org.openstreetmap.josm.plugins.PluginInformation;


public class AerialSRGANDataCollector extends Plugin{

    public AerialSRGANDataCollector(PluginInformation info){
        super((info));
        MainMenu menu = MainApplication.getMenu();
        //Add action class
        //menu.add(menu.toolsMenu, new ActionClassName());
    }
}
