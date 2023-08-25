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
    public final String a;
    public final Map<String, a> b;
    public final Set<b> c;
    public final Set<d> d;

    /* loaded from: classes.dex */
    public static class a {
        public final String a;
        public final String b;
        public final int c;
        public final boolean d;
        public final int e;
        public final String f;
        public final int g;

        public a(String str, String str2, boolean z, int i, String str3, int i2) {
            this.a = str;
            this.b = str2;
            this.d = z;
            this.e = i;
            this.c = a(str2);
            this.f = str3;
            this.g = i2;
        }

        public static int a(String str) {
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

        public boolean b() {
            return this.e > 0;
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
            a aVar = (a) obj;
            if (Build.VERSION.SDK_INT >= 20) {
                if (this.e != aVar.e) {
                    return false;
                }
            } else if (b() != aVar.b()) {
                return false;
            }
            if (this.a.equals(aVar.a) && this.d == aVar.d) {
                if (this.g != 1 || aVar.g != 2 || (str3 = this.f) == null || str3.equals(aVar.f)) {
                    if (this.g != 2 || aVar.g != 1 || (str2 = aVar.f) == null || str2.equals(this.f)) {
                        int i = this.g;
                        return (i == 0 || i != aVar.g || ((str = this.f) == null ? aVar.f == null : str.equals(aVar.f))) && this.c == aVar.c;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }

        public int hashCode() {
            return (((((this.a.hashCode() * 31) + this.c) * 31) + (this.d ? 1231 : 1237)) * 31) + this.e;
        }

        public String toString() {
            return "Column{name='" + this.a + "', type='" + this.b + "', affinity='" + this.c + "', notNull=" + this.d + ", primaryKeyPosition=" + this.e + ", defaultValue='" + this.f + "'}";
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public final String a;
        public final String b;
        public final String c;
        public final List<String> d;
        public final List<String> e;

        public b(String str, String str2, String str3, List<String> list, List<String> list2) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = Collections.unmodifiableList(list);
            this.e = Collections.unmodifiableList(list2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            if (this.a.equals(bVar.a) && this.b.equals(bVar.b) && this.c.equals(bVar.c) && this.d.equals(bVar.d)) {
                return this.e.equals(bVar.e);
            }
            return false;
        }

        public int hashCode() {
            return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
        }

        public String toString() {
            return "ForeignKey{referenceTable='" + this.a + "', onDelete='" + this.b + "', onUpdate='" + this.c + "', columnNames=" + this.d + ", referenceColumnNames=" + this.e + '}';
        }
    }

    /* loaded from: classes.dex */
    public static class c implements Comparable<c> {
        public final int p;
        public final int q;
        public final String r;
        public final String s;

        public c(int i, int i2, String str, String str2) {
            this.p = i;
            this.q = i2;
            this.r = str;
            this.s = str2;
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(c cVar) {
            int i = this.p - cVar.p;
            return i == 0 ? this.q - cVar.q : i;
        }
    }

    /* loaded from: classes.dex */
    public static class d {
        public final String a;
        public final boolean b;
        public final List<String> c;

        public d(String str, boolean z, List<String> list) {
            this.a = str;
            this.b = z;
            this.c = list;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            if (this.b == dVar.b && this.c.equals(dVar.c)) {
                return this.a.startsWith("index_") ? dVar.a.startsWith("index_") : this.a.equals(dVar.a);
            }
            return false;
        }

        public int hashCode() {
            return ((((this.a.startsWith("index_") ? -1184239155 : this.a.hashCode()) * 31) + (this.b ? 1 : 0)) * 31) + this.c.hashCode();
        }

        public String toString() {
            return "Index{name='" + this.a + "', unique=" + this.b + ", columns=" + this.c + '}';
        }
    }

    public lj1(String str, Map<String, a> map, Set<b> set, Set<d> set2) {
        this.a = str;
        this.b = Collections.unmodifiableMap(map);
        this.c = Collections.unmodifiableSet(set);
        this.d = set2 == null ? null : Collections.unmodifiableSet(set2);
    }

    public static lj1 a(ji1 ji1Var, String str) {
        return new lj1(str, b(ji1Var, str), d(ji1Var, str), f(ji1Var, str));
    }

    public static Map<String, a> b(ji1 ji1Var, String str) {
        Cursor B = ji1Var.B("PRAGMA table_info(`" + str + "`)");
        HashMap hashMap = new HashMap();
        try {
            if (B.getColumnCount() > 0) {
                int columnIndex = B.getColumnIndex("name");
                int columnIndex2 = B.getColumnIndex("type");
                int columnIndex3 = B.getColumnIndex("notnull");
                int columnIndex4 = B.getColumnIndex("pk");
                int columnIndex5 = B.getColumnIndex("dflt_value");
                while (B.moveToNext()) {
                    String string = B.getString(columnIndex);
                    hashMap.put(string, new a(string, B.getString(columnIndex2), B.getInt(columnIndex3) != 0, B.getInt(columnIndex4), B.getString(columnIndex5), 2));
                }
            }
            return hashMap;
        } finally {
            B.close();
        }
    }

    public static List<c> c(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        int count = cursor.getCount();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < count; i++) {
            cursor.moveToPosition(i);
            arrayList.add(new c(cursor.getInt(columnIndex), cursor.getInt(columnIndex2), cursor.getString(columnIndex3), cursor.getString(columnIndex4)));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static Set<b> d(ji1 ji1Var, String str) {
        HashSet hashSet = new HashSet();
        Cursor B = ji1Var.B("PRAGMA foreign_key_list(`" + str + "`)");
        try {
            int columnIndex = B.getColumnIndex("id");
            int columnIndex2 = B.getColumnIndex("seq");
            int columnIndex3 = B.getColumnIndex("table");
            int columnIndex4 = B.getColumnIndex("on_delete");
            int columnIndex5 = B.getColumnIndex("on_update");
            List<c> c2 = c(B);
            int count = B.getCount();
            for (int i = 0; i < count; i++) {
                B.moveToPosition(i);
                if (B.getInt(columnIndex2) == 0) {
                    int i2 = B.getInt(columnIndex);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (c cVar : c2) {
                        if (cVar.p == i2) {
                            arrayList.add(cVar.r);
                            arrayList2.add(cVar.s);
                        }
                    }
                    hashSet.add(new b(B.getString(columnIndex3), B.getString(columnIndex4), B.getString(columnIndex5), arrayList, arrayList2));
                }
            }
            return hashSet;
        } finally {
            B.close();
        }
    }

    public static d e(ji1 ji1Var, String str, boolean z) {
        Cursor B = ji1Var.B("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = B.getColumnIndex("seqno");
            int columnIndex2 = B.getColumnIndex("cid");
            int columnIndex3 = B.getColumnIndex("name");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                TreeMap treeMap = new TreeMap();
                while (B.moveToNext()) {
                    if (B.getInt(columnIndex2) >= 0) {
                        int i = B.getInt(columnIndex);
                        treeMap.put(Integer.valueOf(i), B.getString(columnIndex3));
                    }
                }
                ArrayList arrayList = new ArrayList(treeMap.size());
                arrayList.addAll(treeMap.values());
                return new d(str, z, arrayList);
            }
            return null;
        } finally {
            B.close();
        }
    }

    public static Set<d> f(ji1 ji1Var, String str) {
        Cursor B = ji1Var.B("PRAGMA index_list(`" + str + "`)");
        try {
            int columnIndex = B.getColumnIndex("name");
            int columnIndex2 = B.getColumnIndex("origin");
            int columnIndex3 = B.getColumnIndex("unique");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                HashSet hashSet = new HashSet();
                while (B.moveToNext()) {
                    if ("c".equals(B.getString(columnIndex2))) {
                        String string = B.getString(columnIndex);
                        boolean z = true;
                        if (B.getInt(columnIndex3) != 1) {
                            z = false;
                        }
                        d e = e(ji1Var, string, z);
                        if (e == null) {
                            return null;
                        }
                        hashSet.add(e);
                    }
                }
                return hashSet;
            }
            return null;
        } finally {
            B.close();
        }
    }

    public boolean equals(Object obj) {
        Set<d> set;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        lj1 lj1Var = (lj1) obj;
        String str = this.a;
        if (str == null ? lj1Var.a == null : str.equals(lj1Var.a)) {
            Map<String, a> map = this.b;
            if (map == null ? lj1Var.b == null : map.equals(lj1Var.b)) {
                Set<b> set2 = this.c;
                if (set2 == null ? lj1Var.c == null : set2.equals(lj1Var.c)) {
                    Set<d> set3 = this.d;
                    if (set3 == null || (set = lj1Var.d) == null) {
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
        String str = this.a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Map<String, a> map = this.b;
        int hashCode2 = (hashCode + (map != null ? map.hashCode() : 0)) * 31;
        Set<b> set = this.c;
        return hashCode2 + (set != null ? set.hashCode() : 0);
    }

    public String toString() {
        return "TableInfo{name='" + this.a + "', columns=" + this.b + ", foreignKeys=" + this.c + ", indices=" + this.d + '}';
    }
}
