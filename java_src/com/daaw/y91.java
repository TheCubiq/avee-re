package com.daaw;

import android.content.Context;
import android.content.pm.Signature;
import com.daaw.xw1;
import java.security.MessageDigest;
import java.util.List;
/* loaded from: classes.dex */
public class y91 extends kt {
    public static Object[] b = {0, 0, 0, 0};

    /* loaded from: classes.dex */
    public class a extends RuntimeException {
        public a(String str) {
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
        f();
        nc0.j.b(new xw1.a() { // from class: com.daaw.w91
            @Override // com.daaw.xw1.a
            public final Object c(Object obj, Object obj2) {
                Boolean i;
                i = y91.this.i(obj, (Integer[]) obj2);
                return i;
            }
        }, this.a);
    }

    public static int c(Context context) {
        Signature[] signatureArr;
        String[] strArr = {"87ec1545ce", "3f4af8b5d", "e27229c66e072", "4e"};
        List<String> d = z9.d(strArr[0], strArr[1], new String[]{"e0418bb", "ec1545", "a9a844", "ba"}, new String[]{"3bc9", "52fc", "229c66", "95"}, new String[]{"388", "303f0", "303f0", "83"}, new String[]{"f52", "93a", "072e7357aea", "29"}, new String[]{"0b", "bc7", "c66e072e7357ae83f4a", "ae83ae83", "bb"});
        z9.e(d);
        String f = z9.f(d);
        try {
            int i = 0;
            for (Signature signature : context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures) {
                MessageDigest messageDigest = MessageDigest.getInstance("SHA");
                messageDigest.update(signature.toByteArray());
                byte[] digest = messageDigest.digest(messageDigest.digest());
                StringBuffer stringBuffer = new StringBuffer();
                for (byte b2 : digest) {
                    String hexString = Integer.toHexString(b2 & 255);
                    if (hexString.length() == 1) {
                        stringBuffer.append("0");
                    }
                    stringBuffer.append(hexString);
                }
                if (f.equals(stringBuffer.toString())) {
                    return i + 34;
                }
                i++;
            }
        } catch (Exception unused) {
        }
        return 0;
    }

    public static void d() {
        throw new a("");
    }

    public static void e(Runnable runnable) {
        try {
            runnable.run();
        } catch (Throwable unused) {
            d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(Integer[] numArr) {
        numArr[3] = !g() ? numArr[6] : numArr[2];
        numArr[2] = !g() ? numArr[5] : numArr[3];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean i(Object obj, final Integer[] numArr) {
        boolean z = !numArr[1].equals(numArr[1]);
        e(new Runnable() { // from class: com.daaw.x91
            @Override // java.lang.Runnable
            public final void run() {
                y91.this.h(numArr);
            }
        });
        return Boolean.valueOf(g() != z);
    }

    public void f() {
        if (b[0].equals(0)) {
            b[0] = c(dx0.e()) != 0 ? this : dx0.h();
            b[1] = this;
        }
    }

    public final boolean g() {
        Object[] objArr = b;
        return objArr[0] != null && objArr[1] != null && objArr[0].equals(this) && b[1].equals(this);
    }
}
