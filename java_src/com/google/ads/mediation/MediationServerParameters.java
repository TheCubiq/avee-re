package com.google.ads.mediation;

import com.google.android.gms.internal.ads.zzane;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
@Deprecated
/* loaded from: classes.dex */
public class MediationServerParameters {

    /* loaded from: classes.dex */
    public static final class MappingException extends Exception {
        public MappingException(String str) {
            super(str);
        }
    }

    @Target({ElementType.FIELD})
    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: classes.dex */
    public @interface Parameter {
        String name();

        boolean required() default true;
    }

    public void load(Map<String, String> map) throws MappingException {
        Field[] fields;
        StringBuilder sb;
        String str;
        HashMap hashMap = new HashMap();
        for (Field field : getClass().getFields()) {
            Parameter parameter = (Parameter) field.getAnnotation(Parameter.class);
            if (parameter != null) {
                hashMap.put(parameter.name(), field);
            }
        }
        if (hashMap.isEmpty()) {
            zzane.zzdk("No server options fields detected. To suppress this message either add a field with the @Parameter annotation, or override the load() method.");
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            Field field2 = (Field) hashMap.remove(entry.getKey());
            if (field2 != null) {
                try {
                    field2.set(this, entry.getValue());
                } catch (IllegalAccessException unused) {
                    String key = entry.getKey();
                    sb = new StringBuilder(String.valueOf(key).length() + 49);
                    sb.append("Server option \"");
                    sb.append(key);
                    str = "\" could not be set: Illegal Access";
                    sb.append(str);
                    zzane.zzdk(sb.toString());
                } catch (IllegalArgumentException unused2) {
                    String key2 = entry.getKey();
                    sb = new StringBuilder(String.valueOf(key2).length() + 43);
                    sb.append("Server option \"");
                    sb.append(key2);
                    str = "\" could not be set: Bad Type";
                    sb.append(str);
                    zzane.zzdk(sb.toString());
                }
            } else {
                String key3 = entry.getKey();
                String value = entry.getValue();
                StringBuilder sb2 = new StringBuilder(String.valueOf(key3).length() + 31 + String.valueOf(value).length());
                sb2.append("Unexpected server option: ");
                sb2.append(key3);
                sb2.append(" = \"");
                sb2.append(value);
                sb2.append("\"");
                zzane.zzck(sb2.toString());
            }
        }
        StringBuilder sb3 = new StringBuilder();
        for (Field field3 : hashMap.values()) {
            if (((Parameter) field3.getAnnotation(Parameter.class)).required()) {
                String valueOf = String.valueOf(((Parameter) field3.getAnnotation(Parameter.class)).name());
                zzane.zzdk(valueOf.length() != 0 ? "Required server option missing: ".concat(valueOf) : new String("Required server option missing: "));
                if (sb3.length() > 0) {
                    sb3.append(", ");
                }
                sb3.append(((Parameter) field3.getAnnotation(Parameter.class)).name());
            }
        }
        if (sb3.length() > 0) {
            String valueOf2 = String.valueOf(sb3.toString());
            throw new MappingException(valueOf2.length() != 0 ? "Required server option(s) missing: ".concat(valueOf2) : new String("Required server option(s) missing: "));
        }
    }
}
