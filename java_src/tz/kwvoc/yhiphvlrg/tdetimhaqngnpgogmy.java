package tz.kwvoc.yhiphvlrg;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Base64;
import androidx.multidex.MultiDexApplication;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
/* compiled from: PmsHookApplication.java */
/* loaded from: classes.dex */
public class tdetimhaqngnpgogmy extends MultiDexApplication implements InvocationHandler {
    private static String appPkgName = "";
    private static Signature[] signatures;
    private Object base;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.multidex.MultiDexApplication, android.content.ContextWrapper
    public void attachBaseContext(Context base) {
        hook(base);
        super.attachBaseContext(base);
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if ("getPackageInfo".equals(method.getName())) {
            String str = (String) args[0];
            if ((((Number) args[1]).intValue() & 64) != 0 && appPkgName.equals(str)) {
                PackageInfo packageInfo = (PackageInfo) method.invoke(this.base, args);
                packageInfo.signatures = new Signature[signatures.length];
                System.arraycopy(signatures, 0, packageInfo.signatures, 0, signatures.length);
                return packageInfo;
            }
        }
        if ("getInstallerPackageName".equals(method.getName())) {
            return "com.android.vending";
        }
        return method.invoke(this.base, args);
    }

    private void hook(Context context) {
        try {
            DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(Base64.decode("AQAAAwcwggMDMIIB66ADAgECAgR/NichMA0GCSqGSIb3DQEBCwUAMDIxCzAJBgNVBAYTAkxWMQ0wCwYDVQQKEwREYWF3MRQwEgYDVQQDEwtQZXRlciBCcmVkZTAeFw0xNTA2MTcyMjAzMzBaFw00NTA2MDkyMjAzMzBaMDIxCzAJBgNVBAYTAkxWMQ0wCwYDVQQKEwREYWF3MRQwEgYDVQQDEwtQZXRlciBCcmVkZTCCASIwDQYJKoZIhvcNAQEBBQADggEPADCCAQoCggEBAKcnQyyCJad1LlUs390771S5wf9aB1RQgBjrevJVwoeJ66qjWAftTZElly/nSmQuMBbe33Qqwc6sWBJc83arhH/Cj8ka+f71fBxC/Vc52kX7QygjtfQpkrEtEr4DoCdyT+MYq9BowCVKwphwarjrmpAm7BNklWdzqle+NgayYbJaSsoe3aWJCR/M/uKt2swMJPBFdv4RjNPqZGoO2/nC07pqG4NXDhyZ/oIwWRzmlunO/pdncT5OfWtwqHZUL4x/PiXFyU0S1XCeGy+nFb4u8ISU2vAks6nnXw+VodULW2tAVm7+/h7xdWdK1RdyWDc0IkpnaP323xqdKBSFarHnrBsCAwEAAaMhMB8wHQYDVR0OBBYEFIHW1i+nfP+N4ISKE0BnomCNmzX8MA0GCSqGSIb3DQEBCwUAA4IBAQCQqowpU4khL441yng9Heyp4E6KU1jVvtL2lPOZrS9wLW+PqWfHh2PyuauSGBLtHb3UIscrGgTwfcstpDvCf35ucLAuCQVqaaf3WEeMPph7/ldtOXA4yt9JYUwbEFpMJjp+9+zwj2+h84hmj8Q1BXHH2NVyb7NA3/u6HA940coyobvObkskST/Aq/4k31LLMB6coL7vD8lSVjCuiqjnQd6SStaPkhPXEi5KawV4gP+geGgq8+/5tbInn7rza7V3kXg1v5UR6/0lmyLWTYnuTS681UnhJ1jhEB5+rLocLG4ftEN54cA4VzkX9Cn2XgyOKrtAjmQsk4+HnCzpPjNvrdLC", 0)));
            int read = dataInputStream.read() & 255;
            byte[][] bArr = new byte[read];
            for (int i = 0; i < read; i++) {
                bArr[i] = new byte[dataInputStream.readInt()];
                dataInputStream.readFully(bArr[i]);
            }
            if (signatures == null) {
                signatures = new Signature[read];
                int i2 = 0;
                while (true) {
                    Signature[] signatureArr = signatures;
                    if (i2 >= signatureArr.length) {
                        break;
                    }
                    signatureArr[i2] = new Signature(bArr[i2]);
                    i2++;
                }
            }
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Object invoke = cls.getDeclaredMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
            Field declaredField = cls.getDeclaredField("sPackageManager");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(invoke);
            Class<?> cls2 = Class.forName("android.content.pm.IPackageManager");
            this.base = obj;
            appPkgName = context.getPackageName();
            Object newProxyInstance = Proxy.newProxyInstance(cls2.getClassLoader(), new Class[]{cls2}, this);
            declaredField.set(invoke, newProxyInstance);
            PackageManager packageManager = context.getPackageManager();
            Field declaredField2 = packageManager.getClass().getDeclaredField("mPM");
            declaredField2.setAccessible(true);
            declaredField2.set(packageManager, newProxyInstance);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
