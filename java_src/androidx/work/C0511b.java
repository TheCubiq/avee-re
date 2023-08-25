package androidx.work;

import com.daaw.ll0;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/* renamed from: androidx.work.b */
/* loaded from: classes.dex */
public final class C0511b {

    /* renamed from: b */
    public static final String f2465b = ll0.m16883f("Data");

    /* renamed from: c */
    public static final C0511b f2466c = new C0512a().m27961a();

    /* renamed from: a */
    public Map<String, Object> f2467a;

    /* renamed from: androidx.work.b$a */
    /* loaded from: classes.dex */
    public static final class C0512a {

        /* renamed from: a */
        public Map<String, Object> f2468a = new HashMap();

        /* renamed from: a */
        public C0511b m27961a() {
            C0511b c0511b = new C0511b(this.f2468a);
            C0511b.m27962k(c0511b);
            return c0511b;
        }

        /* renamed from: b */
        public C0512a m27960b(String str, Object obj) {
            if (obj == null) {
                this.f2468a.put(str, null);
            } else {
                Class<?> cls = obj.getClass();
                if (cls == Boolean.class || cls == Byte.class || cls == Integer.class || cls == Long.class || cls == Float.class || cls == Double.class || cls == String.class || cls == Boolean[].class || cls == Byte[].class || cls == Integer[].class || cls == Long[].class || cls == Float[].class || cls == Double[].class || cls == String[].class) {
                    this.f2468a.put(str, obj);
                } else if (cls == boolean[].class) {
                    this.f2468a.put(str, C0511b.m27972a((boolean[]) obj));
                } else if (cls == byte[].class) {
                    this.f2468a.put(str, C0511b.m27971b((byte[]) obj));
                } else if (cls == int[].class) {
                    this.f2468a.put(str, C0511b.m27968e((int[]) obj));
                } else if (cls == long[].class) {
                    this.f2468a.put(str, C0511b.m27967f((long[]) obj));
                } else if (cls == float[].class) {
                    this.f2468a.put(str, C0511b.m27969d((float[]) obj));
                } else if (cls != double[].class) {
                    throw new IllegalArgumentException(String.format("Key %s has invalid type %s", str, cls));
                } else {
                    this.f2468a.put(str, C0511b.m27970c((double[]) obj));
                }
            }
            return this;
        }

        /* renamed from: c */
        public C0512a m27959c(C0511b c0511b) {
            m27958d(c0511b.f2467a);
            return this;
        }

        /* renamed from: d */
        public C0512a m27958d(Map<String, Object> map) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                m27960b(entry.getKey(), entry.getValue());
            }
            return this;
        }

        /* renamed from: e */
        public C0512a m27957e(String str, String str2) {
            this.f2468a.put(str, str2);
            return this;
        }
    }

    public C0511b() {
    }

    public C0511b(C0511b c0511b) {
        this.f2467a = new HashMap(c0511b.f2467a);
    }

    public C0511b(Map<String, ?> map) {
        this.f2467a = new HashMap(map);
    }

    /* renamed from: a */
    public static Boolean[] m27972a(boolean[] zArr) {
        Boolean[] boolArr = new Boolean[zArr.length];
        for (int i = 0; i < zArr.length; i++) {
            boolArr[i] = Boolean.valueOf(zArr[i]);
        }
        return boolArr;
    }

    /* renamed from: b */
    public static Byte[] m27971b(byte[] bArr) {
        Byte[] bArr2 = new Byte[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            bArr2[i] = Byte.valueOf(bArr[i]);
        }
        return bArr2;
    }

    /* renamed from: c */
    public static Double[] m27970c(double[] dArr) {
        Double[] dArr2 = new Double[dArr.length];
        for (int i = 0; i < dArr.length; i++) {
            dArr2[i] = Double.valueOf(dArr[i]);
        }
        return dArr2;
    }

    /* renamed from: d */
    public static Float[] m27969d(float[] fArr) {
        Float[] fArr2 = new Float[fArr.length];
        for (int i = 0; i < fArr.length; i++) {
            fArr2[i] = Float.valueOf(fArr[i]);
        }
        return fArr2;
    }

    /* renamed from: e */
    public static Integer[] m27968e(int[] iArr) {
        Integer[] numArr = new Integer[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            numArr[i] = Integer.valueOf(iArr[i]);
        }
        return numArr;
    }

    /* renamed from: f */
    public static Long[] m27967f(long[] jArr) {
        Long[] lArr = new Long[jArr.length];
        for (int i = 0; i < jArr.length; i++) {
            lArr[i] = Long.valueOf(jArr[i]);
        }
        return lArr;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x002c -> B:34:0x002c). Please submit an issue!!! */
    /* renamed from: g */
    public static C0511b m27966g(byte[] bArr) {
        ObjectInputStream objectInputStream;
        Throwable th;
        if (bArr.length > 10240) {
            throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
        }
        HashMap hashMap = new HashMap();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ObjectInputStream objectInputStream2 = null;
        try {
            try {
                objectInputStream = new ObjectInputStream(byteArrayInputStream);
            } catch (IOException unused) {
            }
            try {
                for (int readInt = objectInputStream.readInt(); readInt > 0; readInt--) {
                    hashMap.put(objectInputStream.readUTF(), objectInputStream.readObject());
                }
                objectInputStream.close();
            } catch (IOException | ClassNotFoundException unused2) {
                objectInputStream2 = objectInputStream;
                if (objectInputStream2 != null) {
                    objectInputStream2.close();
                }
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th = th2;
                if (objectInputStream != null) {
                    try {
                        objectInputStream.close();
                    } catch (IOException unused3) {
                    }
                }
                try {
                    byteArrayInputStream.close();
                } catch (IOException unused4) {
                }
                throw th;
            }
        } catch (IOException | ClassNotFoundException unused5) {
        } catch (Throwable th3) {
            objectInputStream = null;
            th = th3;
        }
        try {
            byteArrayInputStream.close();
        } catch (IOException unused6) {
            return new C0511b(hashMap);
        }
    }

    /* renamed from: k */
    public static byte[] m27962k(C0511b c0511b) {
        ObjectOutputStream objectOutputStream;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream2 = null;
        try {
            try {
                objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException unused) {
        }
        try {
            objectOutputStream.writeInt(c0511b.m27963j());
            for (Map.Entry<String, Object> entry : c0511b.f2467a.entrySet()) {
                objectOutputStream.writeUTF(entry.getKey());
                objectOutputStream.writeObject(entry.getValue());
            }
            try {
                objectOutputStream.close();
            } catch (IOException unused2) {
            }
            try {
                byteArrayOutputStream.close();
            } catch (IOException unused3) {
            }
            if (byteArrayOutputStream.size() <= 10240) {
                return byteArrayOutputStream.toByteArray();
            }
            throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
        } catch (IOException unused4) {
            objectOutputStream2 = objectOutputStream;
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (objectOutputStream2 != null) {
                try {
                    objectOutputStream2.close();
                } catch (IOException unused5) {
                }
            }
            try {
                byteArrayOutputStream.close();
            } catch (IOException unused6) {
            }
            return byteArray;
        } catch (Throwable th2) {
            th = th2;
            objectOutputStream2 = objectOutputStream;
            if (objectOutputStream2 != null) {
                try {
                    objectOutputStream2.close();
                } catch (IOException unused7) {
                }
            }
            try {
                byteArrayOutputStream.close();
            } catch (IOException unused8) {
            }
            throw th;
        }
    }

    public boolean equals(Object obj) {
        boolean z;
        if (this == obj) {
            return true;
        }
        if (obj == null || C0511b.class != obj.getClass()) {
            return false;
        }
        C0511b c0511b = (C0511b) obj;
        Set<String> keySet = this.f2467a.keySet();
        if (keySet.equals(c0511b.f2467a.keySet())) {
            for (String str : keySet) {
                Object obj2 = this.f2467a.get(str);
                Object obj3 = c0511b.f2467a.get(str);
                if (obj2 == null || obj3 == null) {
                    if (obj2 == obj3) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                } else if ((obj2 instanceof Object[]) && (obj3 instanceof Object[])) {
                    z = Arrays.deepEquals((Object[]) obj2, (Object[]) obj3);
                    continue;
                } else {
                    z = obj2.equals(obj3);
                    continue;
                }
                if (!z) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public Map<String, Object> m27965h() {
        return Collections.unmodifiableMap(this.f2467a);
    }

    public int hashCode() {
        return this.f2467a.hashCode() * 31;
    }

    /* renamed from: i */
    public String m27964i(String str) {
        Object obj = this.f2467a.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    /* renamed from: j */
    public int m27963j() {
        return this.f2467a.size();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Data {");
        if (!this.f2467a.isEmpty()) {
            for (String str : this.f2467a.keySet()) {
                sb.append(str);
                sb.append(" : ");
                Object obj = this.f2467a.get(str);
                if (obj instanceof Object[]) {
                    sb.append(Arrays.toString((Object[]) obj));
                } else {
                    sb.append(obj);
                }
                sb.append(", ");
            }
        }
        sb.append("}");
        return sb.toString();
    }
}
