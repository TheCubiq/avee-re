package com.daaw;

import android.database.Cursor;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
/* loaded from: classes.dex */
public class lj1 {

    /* renamed from: a */
    public final String f17458a;

    /* renamed from: b */
    public final Map<String, C2047a> f17459b;

    /* renamed from: c */
    public final Set<C2048b> f17460c;

    /* renamed from: d */
    public final Set<C2050d> f17461d;

    /* renamed from: com.daaw.lj1$a */
    /* loaded from: classes.dex */
    public static class C2047a {

        /* renamed from: a */
        public final String f17462a;

        /* renamed from: b */
        public final String f17463b;

        /* renamed from: c */
        public final int f17464c;

        /* renamed from: d */
        public final boolean f17465d;

        /* renamed from: e */
        public final int f17466e;

        /* renamed from: f */
        public final String f17467f;

        /* renamed from: g */
        public final int f17468g;

        public C2047a(String str, String str2, boolean z, int i, String str3, int i2) {
            this.f17462a = str;
            this.f17463b = str2;
            this.f17465d = z;
            this.f17466e = i;
            this.f17464c = m16904a(str2);
            this.f17467f = str3;
            this.f17468g = i2;
        }

        /* renamed from: a */
        public static int m16904a(String str) {
            if (str == null) {
                return 5;
            }
            String upperCase = str.toUpperCase(Locale.US);
            if (upperCase.contains("INT")) {
                return 3;
            }
            if (upperCase.contains("CHAR") || upperCase.contains("CLOB") || upperCase.contains("TEXT")) {
                return 2;
            }
            if (upperCase.contains("BLOB")) {
                return 5;
            }
            return (upperCase.contains("REAL") || upperCase.contains("FLOA") || upperCase.contains("DOUB")) ? 4 : 1;
        }

        /* renamed from: b */
        public boolean m16903b() {
            return this.f17466e > 0;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C2047a c2047a = (C2047a) obj;
            if (Build.VERSION.SDK_INT >= 20) {
                if (this.f17466e != c2047a.f17466e) {
                    return false;
                }
            } else if (m16903b() != c2047a.m16903b()) {
                return false;
            }
            if (this.f17462a.equals(c2047a.f17462a) && this.f17465d == c2047a.f17465d) {
                if (this.f17468g != 1 || c2047a.f17468g != 2 || (str3 = this.f17467f) == null || str3.equals(c2047a.f17467f)) {
                    if (this.f17468g != 2 || c2047a.f17468g != 1 || (str2 = c2047a.f17467f) == null || str2.equals(this.f17467f)) {
                        int i = this.f17468g;
                        return (i == 0 || i != c2047a.f17468g || ((str = this.f17467f) == null ? c2047a.f17467f == null : str.equals(c2047a.f17467f))) && this.f17464c == c2047a.f17464c;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }

        public int hashCode() {
            return (((((this.f17462a.hashCode() * 31) + this.f17464c) * 31) + (this.f17465d ? 1231 : 1237)) * 31) + this.f17466e;
        }

        public String toString() {
            return "Column{name='" + this.f17462a + "', type='" + this.f17463b + "', affinity='" + this.f17464c + "', notNull=" + this.f17465d + ", primaryKeyPosition=" + this.f17466e + ", defaultValue='" + this.f17467f + "'}";
        }
    }

    /* renamed from: com.daaw.lj1$b */
    /* loaded from: classes.dex */
    public static class C2048b {

        /* renamed from: a */
        public final String f17469a;

        /* renamed from: b */
        public final String f17470b;

        /* renamed from: c */
        public final String f17471c;

        /* renamed from: d */
        public final List<String> f17472d;

        /* renamed from: e */
        public final List<String> f17473e;

        public C2048b(String str, String str2, String str3, List<String> list, List<String> list2) {
            this.f17469a = str;
            this.f17470b = str2;
            this.f17471c = str3;
            this.f17472d = Collections.unmodifiableList(list);
            this.f17473e = Collections.unmodifiableList(list2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C2048b c2048b = (C2048b) obj;
            if (this.f17469a.equals(c2048b.f17469a) && this.f17470b.equals(c2048b.f17470b) && this.f17471c.equals(c2048b.f17471c) && this.f17472d.equals(c2048b.f17472d)) {
                return this.f17473e.equals(c2048b.f17473e);
            }
            return false;
        }

        public int hashCode() {
            return (((((((this.f17469a.hashCode() * 31) + this.f17470b.hashCode()) * 31) + this.f17471c.hashCode()) * 31) + this.f17472d.hashCode()) * 31) + this.f17473e.hashCode();
        }

        public String toString() {
            return "ForeignKey{referenceTable='" + this.f17469a + "', onDelete='" + this.f17470b + "', onUpdate='" + this.f17471c + "', columnNames=" + this.f17472d + ", referenceColumnNames=" + this.f17473e + '}';
        }
    }

    /* renamed from: com.daaw.lj1$c */
    /* loaded from: classes.dex */
    public static class C2049c implements Comparable<C2049c> {

        /* renamed from: p */
        public final int f17474p;

        /* renamed from: q */
        public final int f17475q;

        /* renamed from: r */
        public final String f17476r;

        /* renamed from: s */
        public final String f17477s;

        public C2049c(int i, int i2, String str, String str2) {
            this.f17474p = i;
            this.f17475q = i2;
            this.f17476r = str;
            this.f17477s = str2;
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(C2049c c2049c) {
            int i = this.f17474p - c2049c.f17474p;
            return i == 0 ? this.f17475q - c2049c.f17475q : i;
        }
    }

    /* renamed from: com.daaw.lj1$d */
    /* loaded from: classes.dex */
    public static class C2050d {

        /* renamed from: a */
        public final String f17478a;

        /* renamed from: b */
        public final boolean f17479b;

        /* renamed from: c */
        public final List<String> f17480c;

        public C2050d(String str, boolean z, List<String> list) {
            this.f17478a = str;
            this.f17479b = z;
            this.f17480c = list;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C2050d c2050d = (C2050d) obj;
            if (this.f17479b == c2050d.f17479b && this.f17480c.equals(c2050d.f17480c)) {
                return this.f17478a.startsWith("index_") ? c2050d.f17478a.startsWith("index_") : this.f17478a.equals(c2050d.f17478a);
            }
            return false;
        }

        public int hashCode() {
            return ((((this.f17478a.startsWith("index_") ? -1184239155 : this.f17478a.hashCode()) * 31) + (this.f17479b ? 1 : 0)) * 31) + this.f17480c.hashCode();
        }

        public String toString() {
            return "Index{name='" + this.f17478a + "', unique=" + this.f17479b + ", columns=" + this.f17480c + '}';
        }
    }

    public lj1(String str, Map<String, C2047a> map, Set<C2048b> set, Set<C2050d> set2) {
        this.f17458a = str;
        this.f17459b = Collections.unmodifiableMap(map);
        this.f17460c = Collections.unmodifiableSet(set);
        this.f17461d = set2 == null ? null : Collections.unmodifiableSet(set2);
    }

    /* renamed from: a */
    public static lj1 m16910a(ji1 ji1Var, String str) {
        return new lj1(str, m16909b(ji1Var, str), m16907d(ji1Var, str), m16905f(ji1Var, str));
    }

    /* renamed from: b */
    public static Map<String, C2047a> m16909b(ji1 ji1Var, String str) {
        Cursor mo18504B = ji1Var.mo18504B("PRAGMA table_info(`" + str + "`)");
        HashMap hashMap = new HashMap();
        try {
            if (mo18504B.getColumnCount() > 0) {
                int columnIndex = mo18504B.getColumnIndex("name");
                int columnIndex2 = mo18504B.getColumnIndex("type");
                int columnIndex3 = mo18504B.getColumnIndex("notnull");
                int columnIndex4 = mo18504B.getColumnIndex("pk");
                int columnIndex5 = mo18504B.getColumnIndex("dflt_value");
                while (mo18504B.moveToNext()) {
                    String string = mo18504B.getString(columnIndex);
                    hashMap.put(string, new C2047a(string, mo18504B.getString(columnIndex2), mo18504B.getInt(columnIndex3) != 0, mo18504B.getInt(columnIndex4), mo18504B.getString(columnIndex5), 2));
                }
            }
            return hashMap;
        } finally {
            mo18504B.close();
        }
    }

    /* renamed from: c */
    public static List<C2049c> m16908c(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        int count = cursor.getCount();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < count; i++) {
            cursor.moveToPosition(i);
            arrayList.add(new C2049c(cursor.getInt(columnIndex), cursor.getInt(columnIndex2), cursor.getString(columnIndex3), cursor.getString(columnIndex4)));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* renamed from: d */
    public static Set<C2048b> m16907d(ji1 ji1Var, String str) {
        HashSet hashSet = new HashSet();
        Cursor mo18504B = ji1Var.mo18504B("PRAGMA foreign_key_list(`" + str + "`)");
        try {
            int columnIndex = mo18504B.getColumnIndex("id");
            int columnIndex2 = mo18504B.getColumnIndex("seq");
            int columnIndex3 = mo18504B.getColumnIndex("table");
            int columnIndex4 = mo18504B.getColumnIndex("on_delete");
            int columnIndex5 = mo18504B.getColumnIndex("on_update");
            List<C2049c> m16908c = m16908c(mo18504B);
            int count = mo18504B.getCount();
            for (int i = 0; i < count; i++) {
                mo18504B.moveToPosition(i);
                if (mo18504B.getInt(columnIndex2) == 0) {
                    int i2 = mo18504B.getInt(columnIndex);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (C2049c c2049c : m16908c) {
                        if (c2049c.f17474p == i2) {
                            arrayList.add(c2049c.f17476r);
                            arrayList2.add(c2049c.f17477s);
                        }
                    }
                    hashSet.add(new C2048b(mo18504B.getString(columnIndex3), mo18504B.getString(columnIndex4), mo18504B.getString(columnIndex5), arrayList, arrayList2));
                }
            }
            return hashSet;
        } finally {
            mo18504B.close();
        }
    }

    /* renamed from: e */
    public static C2050d m16906e(ji1 ji1Var, String str, boolean z) {
        Cursor mo18504B = ji1Var.mo18504B("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = mo18504B.getColumnIndex("seqno");
            int columnIndex2 = mo18504B.getColumnIndex("cid");
            int columnIndex3 = mo18504B.getColumnIndex("name");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                TreeMap treeMap = new TreeMap();
                while (mo18504B.moveToNext()) {
                    if (mo18504B.getInt(columnIndex2) >= 0) {
                        int i = mo18504B.getInt(columnIndex);
                        treeMap.put(Integer.valueOf(i), mo18504B.getString(columnIndex3));
                    }
                }
                ArrayList arrayList = new ArrayList(treeMap.size());
                arrayList.addAll(treeMap.values());
                return new C2050d(str, z, arrayList);
            }
            return null;
        } finally {
            mo18504B.close();
        }
    }

    /* renamed from: f */
    public static Set<C2050d> m16905f(ji1 ji1Var, String str) {
        Cursor mo18504B = ji1Var.mo18504B("PRAGMA index_list(`" + str + "`)");
        try {
            int columnIndex = mo18504B.getColumnIndex("name");
            int columnIndex2 = mo18504B.getColumnIndex("origin");
            int columnIndex3 = mo18504B.getColumnIndex("unique");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                HashSet hashSet = new HashSet();
                while (mo18504B.moveToNext()) {
                    if ("c".equals(mo18504B.getString(columnIndex2))) {
                        String string = mo18504B.getString(columnIndex);
                        boolean z = true;
                        if (mo18504B.getInt(columnIndex3) != 1) {
                            z = false;
                        }
                        C2050d m16906e = m16906e(ji1Var, string, z);
                        if (m16906e == null) {
                            return null;
                        }
                        hashSet.add(m16906e);
                    }
                }
                return hashSet;
            }
            return null;
        } finally {
            mo18504B.close();
        }
    }

    public boolean equals(Object obj) {
        Set<C2050d> set;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        lj1 lj1Var = (lj1) obj;
        String str = this.f17458a;
        if (str == null ? lj1Var.f17458a == null : str.equals(lj1Var.f17458a)) {
            Map<String, C2047a> map = this.f17459b;
            if (map == null ? lj1Var.f17459b == null : map.equals(lj1Var.f17459b)) {
                Set<C2048b> set2 = this.f17460c;
                if (set2 == null ? lj1Var.f17460c == null : set2.equals(lj1Var.f17460c)) {
                    Set<C2050d> set3 = this.f17461d;
                    if (set3 == null || (set = lj1Var.f17461d) == null) {
                        return true;
                    }
                    return set3.equals(set);
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        String str = this.f17458a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Map<String, C2047a> map = this.f17459b;
        int hashCode2 = (hashCode + (map != null ? map.hashCode() : 0)) * 31;
        Set<C2048b> set = this.f17460c;
        return hashCode2 + (set != null ? set.hashCode() : 0);
    }

    public String toString() {
        return "TableInfo{name='" + this.f17458a + "', columns=" + this.f17459b + ", foreignKeys=" + this.f17460c + ", indices=" + this.f17461d + '}';
    }
}
