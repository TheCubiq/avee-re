package com.daaw;

import android.content.Context;
import android.content.pm.Signature;
import com.daaw.xw1;
import java.security.MessageDigest;
import java.util.List;
/* loaded from: classes.dex */
public class y91 extends C1983kt {

    /* renamed from: b */
    public static Object[] f33435b = {0, 0, 0, 0};

    /* renamed from: com.daaw.y91$a */
    /* loaded from: classes.dex */
    public class C3682a extends RuntimeException {
        public C3682a(String str) {
            super(str);
        }

        @Override // java.lang.Throwable
        public synchronized Throwable fillInStackTrace() {
            return this;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "";
        }
    }

    public y91() {
        m3992f();
        nc0.f19992j.m4424b(new xw1.InterfaceC3648a() { // from class: com.daaw.w91
            @Override // com.daaw.xw1.InterfaceC3648a
            /* renamed from: c */
            public final Object mo4423c(Object obj, Object obj2) {
                Boolean m3989i;
                m3989i = y91.this.m3989i(obj, (Integer[]) obj2);
                return m3989i;
            }
        }, this.f16736a);
    }

    /* renamed from: c */
    public static int m3995c(Context context) {
        Signature[] signatureArr;
        String[] strArr = {"87ec1545ce", "3f4af8b5d", "e27229c66e072", "4e"};
        List<String> m2596d = C3822z9.m2596d(strArr[0], strArr[1], new String[]{"e0418bb", "ec1545", "a9a844", "ba"}, new String[]{"3bc9", "52fc", "229c66", "95"}, new String[]{"388", "303f0", "303f0", "83"}, new String[]{"f52", "93a", "072e7357aea", "29"}, new String[]{"0b", "bc7", "c66e072e7357ae83f4a", "ae83ae83", "bb"});
        C3822z9.m2595e(m2596d);
        String m2594f = C3822z9.m2594f(m2596d);
        try {
            int i = 0;
            for (Signature signature : context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures) {
                MessageDigest messageDigest = MessageDigest.getInstance("SHA");
                messageDigest.update(signature.toByteArray());
                byte[] digest = messageDigest.digest(messageDigest.digest());
                StringBuffer stringBuffer = new StringBuffer();
                for (byte b : digest) {
                    String hexString = Integer.toHexString(b & 255);
                    if (hexString.length() == 1) {
                        stringBuffer.append("0");
                    }
                    stringBuffer.append(hexString);
                }
                if (m2594f.equals(stringBuffer.toString())) {
                    return i + 34;
                }
                i++;
            }
        } catch (Exception unused) {
        }
        return 0;
    }

    /* renamed from: d */
    public static void m3994d() {
        throw new C3682a("");
    }

    /* renamed from: e */
    public static void m3993e(Runnable runnable) {
        try {
            runnable.run();
        } catch (Throwable unused) {
            m3994d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ void m3990h(Integer[] numArr) {
        numArr[3] = !m3991g() ? numArr[6] : numArr[2];
        numArr[2] = !m3991g() ? numArr[5] : numArr[3];
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ Boolean m3989i(Object obj, final Integer[] numArr) {
        boolean z = !numArr[1].equals(numArr[1]);
        m3993e(new Runnable() { // from class: com.daaw.x91
            @Override // java.lang.Runnable
            public final void run() {
                y91.this.m3990h(numArr);
            }
        });
        return Boolean.valueOf(m3991g() != z);
    }

    /* renamed from: f */
    public void m3992f() {
        if (f33435b[0].equals(0)) {
            f33435b[0] = m3995c(dx0.m23837e()) != 0 ? this : dx0.m23834h();
            f33435b[1] = this;
        }
    }

    /* renamed from: g */
    public final boolean m3991g() {
        Object[] objArr = f33435b;
        return objArr[0] != null && objArr[1] != null && objArr[0].equals(this) && f33435b[1].equals(this);
    }
}
