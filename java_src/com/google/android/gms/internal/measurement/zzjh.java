package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzhv;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import kotlin.text.Typography;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
/* loaded from: classes2.dex */
public final class zzjh {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static String zza(zzjg zzjgVar, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        zza(zzjgVar, sb, 0);
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x01f1, code lost:
        if (((java.lang.Boolean) r6).booleanValue() == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01f3, code lost:
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0204, code lost:
        if (((java.lang.Integer) r6).intValue() == 0) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0215, code lost:
        if (((java.lang.Float) r6).floatValue() == 0.0f) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0227, code lost:
        if (((java.lang.Double) r6).doubleValue() == 0.0d) goto L82;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void zza(zzjg zzjgVar, StringBuilder sb, int i) {
        Method[] declaredMethods;
        boolean equals;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet();
        for (Method method : zzjgVar.getClass().getDeclaredMethods()) {
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (String str : treeSet) {
            String substring = str.startsWith("get") ? str.substring(3) : str;
            boolean z = true;
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List")) {
                String valueOf = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf2 = String.valueOf(substring.substring(1, substring.length() - 4));
                String concat = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                Method method2 = (Method) hashMap.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    zza(sb, i, zza(concat), zzhv.zza(method2, zzjgVar, new Object[0]));
                }
            }
            if (substring.endsWith("Map") && !substring.equals("Map")) {
                String valueOf3 = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf4 = String.valueOf(substring.substring(1, substring.length() - 3));
                String concat2 = valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3);
                Method method3 = (Method) hashMap.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    zza(sb, i, zza(concat2), zzhv.zza(method3, zzjgVar, new Object[0]));
                }
            }
            String valueOf5 = String.valueOf(substring);
            if (((Method) hashMap2.get(valueOf5.length() != 0 ? "set".concat(valueOf5) : new String("set"))) != null) {
                if (substring.endsWith("Bytes")) {
                    String valueOf6 = String.valueOf(substring.substring(0, substring.length() - 5));
                    if (!hashMap.containsKey(valueOf6.length() != 0 ? "get".concat(valueOf6) : new String("get"))) {
                    }
                }
                String valueOf7 = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf8 = String.valueOf(substring.substring(1));
                String concat3 = valueOf8.length() != 0 ? valueOf7.concat(valueOf8) : new String(valueOf7);
                String valueOf9 = String.valueOf(substring);
                Method method4 = (Method) hashMap.get(valueOf9.length() != 0 ? "get".concat(valueOf9) : new String("get"));
                String valueOf10 = String.valueOf(substring);
                Method method5 = (Method) hashMap.get(valueOf10.length() != 0 ? "has".concat(valueOf10) : new String("has"));
                if (method4 != null) {
                    Object zza = zzhv.zza(method4, zzjgVar, new Object[0]);
                    if (method5 == null) {
                        if (!(zza instanceof Boolean)) {
                            if (!(zza instanceof Integer)) {
                                if (!(zza instanceof Float)) {
                                    if (!(zza instanceof Double)) {
                                        if (zza instanceof String) {
                                            equals = zza.equals("");
                                        } else if (zza instanceof zzgm) {
                                            equals = zza.equals(zzgm.zza);
                                        } else {
                                            equals = !(zza instanceof zzjg) ? false : false;
                                        }
                                    }
                                }
                            }
                        }
                        if (equals) {
                            z = false;
                        }
                    } else {
                        z = ((Boolean) zzhv.zza(method5, zzjgVar, new Object[0])).booleanValue();
                    }
                    if (z) {
                        zza(sb, i, zza(concat3), zza);
                    }
                }
            }
        }
        if (zzjgVar instanceof zzhv.zzd) {
            Iterator<Map.Entry<zzhv.zzc, Object>> zzd = ((zzhv.zzd) zzjgVar).zzc.zzd();
            if (zzd.hasNext()) {
                zzd.next().getKey();
                throw new NoSuchMethodError();
            }
        }
        zzhv zzhvVar = (zzhv) zzjgVar;
        if (zzhvVar.zzb != null) {
            zzhvVar.zzb.zza(sb, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void zza(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object obj2 : (List) obj) {
                zza(sb, i, str, obj2);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                zza(sb, i, str, entry);
            }
        } else {
            sb.append('\n');
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                sb.append(' ');
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                sb.append(zzkj.zza(zzgm.zza((String) obj)));
                sb.append(Typography.quote);
            } else if (obj instanceof zzgm) {
                sb.append(": \"");
                sb.append(zzkj.zza((zzgm) obj));
                sb.append(Typography.quote);
            } else if (obj instanceof zzhv) {
                sb.append(" {");
                zza((zzhv) obj, sb, i + 2);
                sb.append("\n");
                while (i2 < i) {
                    sb.append(' ');
                    i2++;
                }
                sb.append("}");
            } else if (obj instanceof Map.Entry) {
                sb.append(" {");
                Map.Entry entry2 = (Map.Entry) obj;
                int i4 = i + 2;
                zza(sb, i4, "key", entry2.getKey());
                zza(sb, i4, "value", entry2.getValue());
                sb.append("\n");
                while (i2 < i) {
                    sb.append(' ');
                    i2++;
                }
                sb.append("}");
            } else {
                sb.append(": ");
                sb.append(obj.toString());
            }
        }
    }

    private static final String zza(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }
}
