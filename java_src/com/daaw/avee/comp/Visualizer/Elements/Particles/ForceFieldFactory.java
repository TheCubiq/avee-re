package com.daaw.avee.comp.Visualizer.Elements.Particles;

import com.daaw.avee.Common.tlog;
/* loaded from: classes.dex */
public class ForceFieldFactory {
    public static final String typeNameNone = "None";
    public static final String[] typeNamesAndNone = {"None", VortexForceField.typeName};

    public static IForceField create(String str, IForceField iForceField) {
        if (getTypeName(iForceField).equals(str)) {
            return iForceField;
        }
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -1726838578) {
            if (hashCode == 2433880 && str.equals("None")) {
                c = 0;
            }
        } else if (str.equals(VortexForceField.typeName)) {
            c = 1;
        }
        if (c != 0) {
            if (c == 1) {
                return new VortexForceField();
            }
            tlog.w("unknown typeName: " + str);
            return iForceField;
        }
        return null;
    }

    public static String getTypeName(IForceField iForceField) {
        if (iForceField == null) {
            return "None";
        }
        if (iForceField instanceof VortexForceField) {
            return VortexForceField.typeName;
        }
        tlog.w("unknown instance type");
        return "unk";
    }
}
