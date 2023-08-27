package com.daaw.avee.comp.Common;

import com.daaw.avee.comp.Visualizer.Elements.Base.Element;
/* loaded from: classes.dex */
public class VisualizerThemeInfo {
    public final int id;
    public final boolean isTemplate;

    public VisualizerThemeInfo(int i) {
        this.id = i;
        this.isTemplate = true;
    }

    public VisualizerThemeInfo(int i, boolean z) {
        this.id = i;
        this.isTemplate = z;
    }

    public static boolean CompareElementVersions(String str, String str2) {
        if (str.length() == 0 && str2.equals("10")) {
            return true;
        }
        if (str.equals("10") && str2.length() == 0) {
            return true;
        }
        return str.equals(str2);
    }

    public static boolean CompareElementReUsability(Element element, String str, String str2) {
        return element.getElementTypeName().equals(str) && CompareElementVersions(element.getElementVersion(), str2);
    }
}
