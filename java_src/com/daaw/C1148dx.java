package com.daaw;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* renamed from: com.daaw.dx */
/* loaded from: classes.dex */
public final class C1148dx {

    /* renamed from: a */
    public static final C1148dx f7949a = new C1148dx();

    /* renamed from: com.daaw.dx$a */
    /* loaded from: classes.dex */
    public static final class C1149a {

        /* renamed from: a */
        public final String f7950a;

        /* renamed from: b */
        public final String f7951b;

        /* renamed from: c */
        public final boolean f7952c;

        public C1149a(String str, String str2, boolean z) {
            ug0.m8268f(str, "name");
            ug0.m8268f(str2, "mimeType");
            this.f7950a = str;
            this.f7951b = str2;
            this.f7952c = z;
        }

        /* renamed from: a */
        public final String m23844a() {
            return this.f7951b;
        }

        /* renamed from: b */
        public final String m23843b() {
            return this.f7950a;
        }

        /* renamed from: c */
        public final boolean m23842c() {
            return this.f7952c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C1149a) {
                C1149a c1149a = (C1149a) obj;
                return ug0.m8273a(this.f7950a, c1149a.f7950a) && ug0.m8273a(this.f7951b, c1149a.f7951b) && this.f7952c == c1149a.f7952c;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = ((this.f7950a.hashCode() * 31) + this.f7951b.hashCode()) * 31;
            boolean z = this.f7952c;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            return hashCode + i;
        }

        public String toString() {
            return "Codec(name=" + this.f7950a + ", mimeType=" + this.f7951b + ", supportsHighProfile=" + this.f7952c + ')';
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e9  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final List<C1149a> m23847a(int[] iArr) {
        boolean z;
        boolean z2;
        boolean z3;
        ug0.m8268f(iArr, "outPreferred");
        pg0 m22943f = f31.m22943f(0, MediaCodecList.getCodecCount());
        ArrayList arrayList = new ArrayList(C2037lg.m16966h(m22943f, 10));
        Iterator<Integer> it = m22943f.iterator();
        while (it.hasNext()) {
            arrayList.add(MediaCodecList.getCodecInfoAt(((mg0) it).mo14310a()));
        }
        ArrayList<MediaCodecInfo> arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((MediaCodecInfo) obj).isEncoder()) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (MediaCodecInfo mediaCodecInfo : arrayList2) {
            String name = mediaCodecInfo.getName();
            ug0.m8269e(name, "codecInfo.name");
            if (!oh1.m14298g(name, ".google.", false, 2, null)) {
                String name2 = mediaCodecInfo.getName();
                ug0.m8269e(name2, "codecInfo.name");
                if (!oh1.m14298g(name2, ".android.", false, 2, null)) {
                    z = true;
                    String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
                    ug0.m8269e(supportedTypes, "codecInfo.supportedTypes");
                    ArrayList<String> arrayList4 = new ArrayList();
                    for (String str : supportedTypes) {
                        if (ug0.m8273a(str, "video/avc") || (z && (ug0.m8273a(str, "video/3gpp") || ug0.m8273a(str, "video/hevc") || ug0.m8273a(str, "video/mp4v-es")))) {
                            arrayList4.add(str);
                        }
                    }
                    ArrayList arrayList5 = new ArrayList(C2037lg.m16966h(arrayList4, 10));
                    for (String str2 : arrayList4) {
                        String name3 = mediaCodecInfo.getName();
                        ug0.m8269e(name3, "codecInfo.name");
                        ug0.m8269e(str2, "mimeType");
                        if (Build.VERSION.SDK_INT >= 27) {
                            MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr = mediaCodecInfo.getCapabilitiesForType(str2).profileLevels;
                            ug0.m8269e(codecProfileLevelArr, "codecInfo.getCapabilitie…e(mimeType).profileLevels");
                            int length = codecProfileLevelArr.length;
                            int i = 0;
                            while (true) {
                                if (i >= length) {
                                    z3 = false;
                                    break;
                                }
                                if (codecProfileLevelArr[i].profile == 524288) {
                                    z3 = true;
                                    break;
                                }
                                i++;
                            }
                            if (z3) {
                                z2 = true;
                                arrayList5.add(new C1149a(name3, str2, z2));
                            }
                        }
                        z2 = false;
                        arrayList5.add(new C1149a(name3, str2, z2));
                    }
                    C2550pg.m13404i(arrayList3, arrayList5);
                }
            }
            z = false;
            String[] supportedTypes2 = mediaCodecInfo.getSupportedTypes();
            ug0.m8269e(supportedTypes2, "codecInfo.supportedTypes");
            ArrayList<String> arrayList42 = new ArrayList();
            while (r13 < r12) {
            }
            ArrayList arrayList52 = new ArrayList(C2037lg.m16966h(arrayList42, 10));
            while (r7.hasNext()) {
            }
            C2550pg.m13404i(arrayList3, arrayList52);
        }
        iArr[0] = 0;
        int i2 = 0;
        for (Object obj2 : arrayList3) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                C1946kg.m17758g();
            }
            C1149a c1149a = (C1149a) obj2;
            if (oh1.m14298g(c1149a.m23843b(), "OMX.google", false, 2, null) && ug0.m8273a(c1149a.m23844a(), "video/avc")) {
                iArr[0] = i2;
            }
            i2 = i3;
        }
        return arrayList3;
    }

    /* renamed from: b */
    public static final ArrayList<String> m23846b() {
        return C1946kg.m17762c("Baseline", "Main");
    }

    /* renamed from: c */
    public static final String[] m23845c(List<C1149a> list) {
        ug0.m8268f(list, "codecs");
        ArrayList arrayList = new ArrayList(C2037lg.m16966h(list, 10));
        for (C1149a c1149a : list) {
            arrayList.add(c1149a.m23843b());
        }
        Object[] array = arrayList.toArray(new String[0]);
        ug0.m8270d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return (String[]) array;
    }
}
