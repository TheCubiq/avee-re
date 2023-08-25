package com.daaw;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
/* loaded from: classes2.dex */
public final class tu7 {

    /* renamed from: f */
    public static HashMap f28084f;

    /* renamed from: k */
    public static Object f28089k;

    /* renamed from: l */
    public static boolean f28090l;

    /* renamed from: a */
    public static final Uri f28079a = Uri.parse("content://com.google.android.gsf.gservices");

    /* renamed from: b */
    public static final Uri f28080b = Uri.parse("content://com.google.android.gsf.gservices/prefix");

    /* renamed from: c */
    public static final Pattern f28081c = Pattern.compile("^(1|true|t|on|yes|y)$", 2);

    /* renamed from: d */
    public static final Pattern f28082d = Pattern.compile("^(0|false|f|off|no|n)$", 2);

    /* renamed from: e */
    public static final AtomicBoolean f28083e = new AtomicBoolean();

    /* renamed from: g */
    public static final HashMap f28085g = new HashMap();

    /* renamed from: h */
    public static final HashMap f28086h = new HashMap();

    /* renamed from: i */
    public static final HashMap f28087i = new HashMap();

    /* renamed from: j */
    public static final HashMap f28088j = new HashMap();

    /* renamed from: m */
    public static final String[] f28091m = new String[0];

    /* renamed from: a */
    public static String m8819a(ContentResolver contentResolver, String str, String str2) {
        synchronized (tu7.class) {
            if (f28084f == null) {
                f28083e.set(false);
                f28084f = new HashMap();
                f28089k = new Object();
                f28090l = false;
                contentResolver.registerContentObserver(f28079a, true, new ht7(null));
            } else if (f28083e.getAndSet(false)) {
                f28084f.clear();
                f28085g.clear();
                f28086h.clear();
                f28087i.clear();
                f28088j.clear();
                f28089k = new Object();
                f28090l = false;
            }
            Object obj = f28089k;
            if (f28084f.containsKey(str)) {
                String str3 = (String) f28084f.get(str);
                if (str3 != null) {
                    r3 = str3;
                }
                return r3;
            }
            int length = f28091m.length;
            Cursor query = contentResolver.query(f28079a, null, null, new String[]{str}, null);
            if (query == null) {
                return null;
            }
            try {
                if (!query.moveToFirst()) {
                    m8817c(obj, str, null);
                    return null;
                }
                String string = query.getString(1);
                if (string != null && string.equals(null)) {
                    string = null;
                }
                m8817c(obj, str, string);
                return string != null ? string : null;
            } finally {
                query.close();
            }
        }
    }

    /* renamed from: c */
    public static void m8817c(Object obj, String str, String str2) {
        synchronized (tu7.class) {
            if (obj == f28089k) {
                f28084f.put(str, str2);
            }
        }
    }
}
