package com.daaw;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
/* loaded from: classes2.dex */
public final class de8 {

    /* renamed from: a */
    public static final char[] f7024a;

    static {
        char[] cArr = new char[80];
        f7024a = cArr;
        Arrays.fill(cArr, ' ');
    }

    /* renamed from: a */
    public static String m24440a(zd8 zd8Var, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        m24437d(zd8Var, sb, 0);
        return sb.toString();
    }

    /* renamed from: b */
    public static void m24439b(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object obj2 : (List) obj) {
                m24439b(sb, i, str, obj2);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                m24439b(sb, i, str, entry);
            }
        } else {
            sb.append('\n');
            m24438c(i, sb);
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
                sb.append(kg8.m17753a(y68.m4062r((String) obj)));
                sb.append('\"');
            } else if (obj instanceof y68) {
                sb.append(": \"");
                sb.append(kg8.m17753a((y68) obj));
                sb.append('\"');
            } else if (obj instanceof ja8) {
                sb.append(" {");
                m24437d((ja8) obj, sb, i + 2);
                sb.append("\n");
                m24438c(i, sb);
                sb.append("}");
            } else if (!(obj instanceof Map.Entry)) {
                sb.append(": ");
                sb.append(obj);
            } else {
                sb.append(" {");
                Map.Entry entry2 = (Map.Entry) obj;
                int i3 = i + 2;
                m24439b(sb, i3, "key", entry2.getKey());
                m24439b(sb, i3, "value", entry2.getValue());
                sb.append("\n");
                m24438c(i, sb);
                sb.append("}");
            }
        }
    }

    /* renamed from: c */
    public static void m24438c(int i, StringBuilder sb) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(f7024a, 0, i2);
            i -= i2;
        }
    }

    /* renamed from: d */
    public static void m24437d(zd8 zd8Var, StringBuilder sb, int i) {
        int i2;
        Object obj;
        Method method;
        String substring;
        Object m18665r;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = zd8Var.getClass().getDeclaredMethods();
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
                m18665r = ja8.m18665r(method2, zd8Var, new Object[0]);
            } else if (!substring2.endsWith("Map") || substring2.equals("Map") || (method = (Method) entry.getValue()) == null || !method.getReturnType().equals(Map.class) || method.isAnnotationPresent(Deprecated.class) || !Modifier.isPublic(method.getModifiers())) {
                if (hashSet.contains("set".concat(substring2)) && (!substring2.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(substring2.substring(0, substring2.length() - 5)))))) {
                    Method method4 = (Method) entry.getValue();
                    Method method5 = (Method) hashMap.get("has".concat(substring2));
                    if (method4 != null) {
                        Object m18665r2 = ja8.m18665r(method4, zd8Var, new Object[0]);
                        if (method5 != null) {
                            if (!((Boolean) ja8.m18665r(method5, zd8Var, new Object[0])).booleanValue()) {
                            }
                            m24439b(sb, i, substring2, m18665r2);
                        } else if (m18665r2 instanceof Boolean) {
                            if (!((Boolean) m18665r2).booleanValue()) {
                            }
                            m24439b(sb, i, substring2, m18665r2);
                        } else if (m18665r2 instanceof Integer) {
                            if (((Integer) m18665r2).intValue() == 0) {
                            }
                            m24439b(sb, i, substring2, m18665r2);
                        } else if (m18665r2 instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) m18665r2).floatValue()) == 0) {
                            }
                            m24439b(sb, i, substring2, m18665r2);
                        } else if (m18665r2 instanceof Double) {
                            if (Double.doubleToRawLongBits(((Double) m18665r2).doubleValue()) == 0) {
                            }
                            m24439b(sb, i, substring2, m18665r2);
                        } else {
                            if (m18665r2 instanceof String) {
                                obj = "";
                            } else if (m18665r2 instanceof y68) {
                                obj = y68.f33399q;
                            } else if (m18665r2 instanceof zd8) {
                                if (m18665r2 == ((zd8) m18665r2).mo18673d()) {
                                }
                                m24439b(sb, i, substring2, m18665r2);
                            } else {
                                if ((m18665r2 instanceof Enum) && ((Enum) m18665r2).ordinal() == 0) {
                                }
                                m24439b(sb, i, substring2, m18665r2);
                            }
                            if (m18665r2.equals(obj)) {
                            }
                            m24439b(sb, i, substring2, m18665r2);
                        }
                    }
                }
                i2 = 3;
            } else {
                substring = substring2.substring(0, substring2.length() - 3);
                m18665r = ja8.m18665r(method, zd8Var, new Object[0]);
            }
            m24439b(sb, i, substring, m18665r);
            i2 = 3;
        }
        if (zd8Var instanceof ba8) {
            ba8 ba8Var = (ba8) zd8Var;
            throw null;
        }
        qg8 qg8Var = ((ja8) zd8Var).zzc;
        if (qg8Var != null) {
            qg8Var.m12538i(sb, i);
        }
    }
}
