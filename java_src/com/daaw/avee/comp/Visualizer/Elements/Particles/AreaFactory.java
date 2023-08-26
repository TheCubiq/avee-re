package com.daaw.avee.comp.Visualizer.Elements.Particles;

import com.daaw.avee.Common.tlog;
import com.daaw.avee.comp.Visualizer.Elements.Base.IArea;
import com.daaw.avee.comp.Visualizer.Elements.Particles.Remove.AreaHorizontalLineRandDir;
import com.daaw.avee.comp.Visualizer.Elements.Particles.Remove.AreaRect3d;
import com.daaw.avee.comp.Visualizer.Elements.Particles.Remove.AreaVerticalLine;
/* loaded from: classes.dex */
public class AreaFactory {
    public static final String typeNameNone = "None";
    public static final String[] typeNames = {"HorizontalLine", AreaRect.typeName};
    public static final String[] typeNamesAndNone = {"None", "HorizontalLine", AreaRect.typeName};

    public static IArea create(String str, IArea iArea) {
        if (getTypeName(iArea).equals(str)) {
            return iArea;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1424852677:
                if (str.equals(AreaHorizontalLineRandDir.typeName)) {
                    c = 2;
                    break;
                }
                break;
            case -1169699505:
                if (str.equals(AreaRect.typeName)) {
                    c = 5;
                    break;
                }
                break;
            case 2368532:
                if (str.equals("Line")) {
                    c = 3;
                    break;
                }
                break;
            case 2433880:
                if (str.equals("None")) {
                    c = 0;
                    break;
                }
                break;
            case 127874218:
                if (str.equals(AreaVerticalLine.typeNameAlias)) {
                    c = 4;
                    break;
                }
                break;
            case 1200208896:
                if (str.equals(AreaRect3d.typeName)) {
                    c = 6;
                    break;
                }
                break;
            case 1802881624:
                if (str.equals("HorizontalLine")) {
                    c = 1;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return null;
            case 1:
                return new AreaHorizontalLine();
            case 2:
                return new AreaHorizontalLineRandDir();
            case 3:
                return new AreaVerticalLine();
            case 4:
                return new AreaVerticalLine();
            case 5:
                return new AreaRect();
            case 6:
                return new AreaRect3d();
            default:
                tlog.w("unknown typeName: " + str);
                return iArea;
        }
    }

    public static String getTypeName(IArea iArea) {
        if (iArea == null) {
            return "None";
        }
        if (iArea instanceof AreaHorizontalLine) {
            return "HorizontalLine";
        }
        if (iArea instanceof AreaHorizontalLineRandDir) {
            return AreaHorizontalLineRandDir.typeName;
        }
        if (iArea instanceof AreaVerticalLine) {
            return "Line";
        }
        if (iArea instanceof AreaRect) {
            return AreaRect.typeName;
        }
        if (iArea instanceof AreaRect3d) {
            return AreaRect3d.typeName;
        }
        tlog.w("unknown instance type");
        return "unk";
    }
}
