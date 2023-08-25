package com.daaw;

import android.os.Bundle;
import java.util.EnumMap;
/* loaded from: classes2.dex */
public final class cd2 {
    public static final cd2 b = new cd2(null, null);
    public final EnumMap a;

    public cd2(Boolean bool, Boolean bool2) {
        EnumMap enumMap = new EnumMap(vb2.class);
        this.a = enumMap;
        enumMap.put((EnumMap) vb2.AD_STORAGE, (vb2) bool);
        enumMap.put((EnumMap) vb2.ANALYTICS_STORAGE, (vb2) bool2);
    }

    public cd2(EnumMap enumMap) {
        EnumMap enumMap2 = new EnumMap(vb2.class);
        this.a = enumMap2;
        enumMap2.putAll(enumMap);
    }

    public static cd2 a(Bundle bundle) {
        vb2[] values;
        if (bundle == null) {
            return b;
        }
        EnumMap enumMap = new EnumMap(vb2.class);
        for (vb2 vb2Var : vb2.values()) {
            enumMap.put((EnumMap) vb2Var, (vb2) n(bundle.getString(vb2Var.p)));
        }
        return new cd2(enumMap);
    }

    public static cd2 b(String str) {
        EnumMap enumMap = new EnumMap(vb2.class);
        if (str != null) {
            int i = 0;
            while (true) {
                vb2[] vb2VarArr = vb2.s;
                int length = vb2VarArr.length;
                if (i >= 2) {
                    break;
                }
                vb2 vb2Var = vb2VarArr[i];
                int i2 = i + 2;
                if (i2 < str.length()) {
                    char charAt = str.charAt(i2);
                    Boolean bool = null;
                    if (charAt != '-') {
                        if (charAt == '0') {
                            bool = Boolean.FALSE;
                        } else if (charAt == '1') {
                            bool = Boolean.TRUE;
                        }
                    }
                    enumMap.put((EnumMap) vb2Var, (vb2) bool);
                }
                i++;
            }
        }
        return new cd2(enumMap);
    }

    public static String g(Bundle bundle) {
        vb2[] values;
        String string;
        for (vb2 vb2Var : vb2.values()) {
            if (bundle.containsKey(vb2Var.p) && (string = bundle.getString(vb2Var.p)) != null && n(string) == null) {
                return string;
            }
        }
        return null;
    }

    public static boolean j(int i, int i2) {
        return i <= i2;
    }

    public static final int m(Boolean bool) {
        if (bool == null) {
            return 0;
        }
        return bool.booleanValue() ? 1 : 2;
    }

    public static Boolean n(String str) {
        if (str == null) {
            return null;
        }
        if (str.equals("granted")) {
            return Boolean.TRUE;
        }
        if (str.equals("denied")) {
            return Boolean.FALSE;
        }
        return null;
    }

    public final cd2 c(cd2 cd2Var) {
        vb2[] values;
        EnumMap enumMap = new EnumMap(vb2.class);
        for (vb2 vb2Var : vb2.values()) {
            Boolean bool = (Boolean) this.a.get(vb2Var);
            Boolean bool2 = (Boolean) cd2Var.a.get(vb2Var);
            if (bool == null) {
                bool = bool2;
            } else if (bool2 != null) {
                bool = Boolean.valueOf(bool.booleanValue() && bool2.booleanValue());
            }
            enumMap.put((EnumMap) vb2Var, (vb2) bool);
        }
        return new cd2(enumMap);
    }

    public final cd2 d(cd2 cd2Var) {
        vb2[] values;
        EnumMap enumMap = new EnumMap(vb2.class);
        for (vb2 vb2Var : vb2.values()) {
            Boolean bool = (Boolean) this.a.get(vb2Var);
            if (bool == null) {
                bool = (Boolean) cd2Var.a.get(vb2Var);
            }
            enumMap.put((EnumMap) vb2Var, (vb2) bool);
        }
        return new cd2(enumMap);
    }

    public final Boolean e() {
        return (Boolean) this.a.get(vb2.AD_STORAGE);
    }

    public final boolean equals(Object obj) {
        vb2[] values;
        if (obj instanceof cd2) {
            cd2 cd2Var = (cd2) obj;
            for (vb2 vb2Var : vb2.values()) {
                if (m((Boolean) this.a.get(vb2Var)) != m((Boolean) cd2Var.a.get(vb2Var))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public final Boolean f() {
        return (Boolean) this.a.get(vb2.ANALYTICS_STORAGE);
    }

    public final String h() {
        StringBuilder sb = new StringBuilder("G1");
        vb2[] vb2VarArr = vb2.s;
        int length = vb2VarArr.length;
        for (int i = 0; i < 2; i++) {
            Boolean bool = (Boolean) this.a.get(vb2VarArr[i]);
            sb.append(bool == null ? '-' : bool.booleanValue() ? '1' : '0');
        }
        return sb.toString();
    }

    public final int hashCode() {
        int i = 17;
        for (Boolean bool : this.a.values()) {
            i = (i * 31) + m(bool);
        }
        return i;
    }

    public final boolean i(vb2 vb2Var) {
        Boolean bool = (Boolean) this.a.get(vb2Var);
        return bool == null || bool.booleanValue();
    }

    public final boolean k(cd2 cd2Var) {
        return l(cd2Var, (vb2[]) this.a.keySet().toArray(new vb2[0]));
    }

    public final boolean l(cd2 cd2Var, vb2... vb2VarArr) {
        for (vb2 vb2Var : vb2VarArr) {
            Boolean bool = (Boolean) this.a.get(vb2Var);
            Boolean bool2 = (Boolean) cd2Var.a.get(vb2Var);
            Boolean bool3 = Boolean.FALSE;
            if (bool == bool3 && bool2 != bool3) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("settings: ");
        vb2[] values = vb2.values();
        int length = values.length;
        for (int i = 0; i < length; i++) {
            vb2 vb2Var = values[i];
            if (i != 0) {
                sb.append(", ");
            }
            sb.append(vb2Var.name());
            sb.append("=");
            Boolean bool = (Boolean) this.a.get(vb2Var);
            sb.append(bool == null ? "uninitialized" : true != bool.booleanValue() ? "denied" : "granted");
        }
        return sb.toString();
    }
}
