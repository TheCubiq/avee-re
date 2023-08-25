package com.daaw;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
/* loaded from: classes.dex */
public final class zt7 {
    public static final char[] a;

    static {
        char[] cArr = new char[80];
        a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static String a(xt7 xt7Var, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        d(xt7Var, sb, 0);
        return sb.toString();
    }

    public static void b(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object obj2 : (List) obj) {
                b(sb, i, str, obj2);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                b(sb, i, str, entry);
            }
        } else {
            sb.append('\n');
            c(i, sb);
            if (!str.isEmpty()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(Character.toLowerCase(str.charAt(0)));
                for (int i2 = 1; i2 < str.length(); i2++) {
                    char charAt = str.charAt(i2);
                    if (Character.isUpperCase(charAt)) {
                        sb2.append("_");
                    }
                    sb2.append(Character.toLowerCase(charAt));
                }
                str = sb2.toString();
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                sb.append(rv7.a(yq7.H((String) obj)));
                sb.append('\"');
            } else if (obj instanceof yq7) {
                sb.append(": \"");
                sb.append(rv7.a((yq7) obj));
                sb.append('\"');
            } else if (obj instanceof ls7) {
                sb.append(" {");
                d((ls7) obj, sb, i + 2);
                sb.append("\n");
                c(i, sb);
                sb.append("}");
            } else if (!(obj instanceof Map.Entry)) {
                sb.append(": ");
                sb.append(obj);
            } else {
                sb.append(" {");
                Map.Entry entry2 = (Map.Entry) obj;
                int i3 = i + 2;
                b(sb, i3, "key", entry2.getKey());
                b(sb, i3, "value", entry2.getValue());
                sb.append("\n");
                c(i, sb);
                sb.append("}");
            }
        }
    }

    public static void c(int i, StringBuilder sb) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(a, 0, i2);
            i -= i2;
        }
    }

    public static void d(xt7 xt7Var, StringBuilder sb, int i) {
        int i2;
        Object obj;
        Method method;
        String substring;
        Object y;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = xt7Var.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i3 = 0;
        while (true) {
            i2 = 3;
            if (i3 >= length) {
                break;
            }
            Method method3 = declaredMethods[i3];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        hashMap.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i3++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String substring2 = ((String) entry.getKey()).substring(i2);
            if (substring2.endsWith("List") && !substring2.endsWith("OrBuilderList") && !substring2.equals("List") && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                substring = substring2.substring(0, substring2.length() - 4);
                y = ls7.y(method2, xt7Var, new Object[0]);
            } else if (!substring2.endsWith("Map") || substring2.equals("Map") || (method = (Method) entry.getValue()) == null || !method.getReturnType().equals(Map.class) || method.isAnnotationPresent(Deprecated.class) || !Modifier.isPublic(method.getModifiers())) {
                if (hashSet.contains("set".concat(substring2)) && (!substring2.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(substring2.substring(0, substring2.length() - 5)))))) {
                    Method method4 = (Method) entry.getValue();
                    Method method5 = (Method) hashMap.get("has".concat(substring2));
                    if (method4 != null) {
                        Object y2 = ls7.y(method4, xt7Var, new Object[0]);
                        if (method5 != null) {
                            if (!((Boolean) ls7.y(method5, xt7Var, new Object[0])).booleanValue()) {
                            }
                            b(sb, i, substring2, y2);
                        } else if (y2 instanceof Boolean) {
                            if (!((Boolean) y2).booleanValue()) {
                            }
                            b(sb, i, substring2, y2);
                        } else if (y2 instanceof Integer) {
                            if (((Integer) y2).intValue() == 0) {
                            }
                            b(sb, i, substring2, y2);
                        } else if (y2 instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) y2).floatValue()) == 0) {
                            }
                            b(sb, i, substring2, y2);
                        } else if (y2 instanceof Double) {
                            if (Double.doubleToRawLongBits(((Double) y2).doubleValue()) == 0) {
                            }
                            b(sb, i, substring2, y2);
                        } else {
                            if (y2 instanceof String) {
                                obj = "";
                            } else if (y2 instanceof yq7) {
                                obj = yq7.q;
                            } else if (y2 instanceof xt7) {
                                if (y2 == ((xt7) y2).c()) {
                                }
                                b(sb, i, substring2, y2);
                            } else {
                                if ((y2 instanceof Enum) && ((Enum) y2).ordinal() == 0) {
                                }
                                b(sb, i, substring2, y2);
                            }
                            if (y2.equals(obj)) {
                            }
                            b(sb, i, substring2, y2);
                        }
                    }
                }
                i2 = 3;
            } else {
                substring = substring2.substring(0, substring2.length() - 3);
                y = ls7.y(method, xt7Var, new Object[0]);
            }
            b(sb, i, substring, y);
            i2 = 3;
        }
        if (xt7Var instanceof js7) {
            js7 js7Var = (js7) xt7Var;
            throw null;
        }
        uv7 uv7Var = ((ls7) xt7Var).zzc;
        if (uv7Var != null) {
            uv7Var.i(sb, i);
        }
    }
}
