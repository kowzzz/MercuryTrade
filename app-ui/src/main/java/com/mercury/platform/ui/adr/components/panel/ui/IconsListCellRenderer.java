package com.mercury.platform.ui.adr.components.panel.ui;

import com.mercury.platform.ui.components.ComponentsFactory;
import com.mercury.platform.ui.misc.AppThemeColor;

import javax.swing.*;
import java.awt.*;



public class IconsListCellRenderer implements ListCellRenderer<String> {
    private ComponentsFactory componentsFactory = new ComponentsFactory();
    @Override
    public Component getListCellRendererComponent(JList<? extends String> list, String value, int index, boolean isSelected, boolean cellHasFocus) {
        JPanel root = this.componentsFactory.getJPanel(new BorderLayout());
        root.setBorder(BorderFactory.createEmptyBorder(2,2,2,2));
        JLabel iconLabel = this.componentsFactory.getIconLabel("app/adr/icons/" + value + ".png", 64);
        root.add(iconLabel,BorderLayout.CENTER);

        if(isSelected){
            iconLabel.setBorder(BorderFactory.createLineBorder(AppThemeColor.TEXT_MESSAGE));
        }
        return root;
    }
}
