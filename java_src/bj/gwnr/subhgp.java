package bj.gwnr;

import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
/* compiled from: SigningInfo.java */
/* loaded from: classes3.dex */
public class subhgp {
    static String sig_data = "AQAAAwcwggMDMIIB66ADAgECAgR/NichMA0GCSqGSIb3DQEBCwUAMDIxCzAJBgNVBAYTAkxWMQ0wCwYDVQQKEwREYWF3MRQwEgYDVQQDEwtQZXRlciBCcmVkZTAeFw0xNTA2MTcyMjAzMzBaFw00NTA2MDkyMjAzMzBaMDIxCzAJBgNVBAYTAkxWMQ0wCwYDVQQKEwREYWF3MRQwEgYDVQQDEwtQZXRlciBCcmVkZTCCASIwDQYJKoZIhvcNAQEBBQADggEPADCCAQoCggEBAKcnQyyCJad1LlUs390771S5wf9aB1RQgBjrevJVwoeJ66qjWAftTZElly/nSmQuMBbe33Qqwc6sWBJc83arhH/Cj8ka+f71fBxC/Vc52kX7QygjtfQpkrEtEr4DoCdyT+MYq9BowCVKwphwarjrmpAm7BNklWdzqle+NgayYbJaSsoe3aWJCR/M/uKt2swMJPBFdv4RjNPqZGoO2/nC07pqG4NXDhyZ/oIwWRzmlunO/pdncT5OfWtwqHZUL4x/PiXFyU0S1XCeGy+nFb4u8ISU2vAks6nnXw+VodULW2tAVm7+/h7xdWdK1RdyWDc0IkpnaP323xqdKBSFarHnrBsCAwEAAaMhMB8wHQYDVR0OBBYEFIHW1i+nfP+N4ISKE0BnomCNmzX8MA0GCSqGSIb3DQEBCwUAA4IBAQCQqowpU4khL441yng9Heyp4E6KU1jVvtL2lPOZrS9wLW+PqWfHh2PyuauSGBLtHb3UIscrGgTwfcstpDvCf35ucLAuCQVqaaf3WEeMPph7/ldtOXA4yt9JYUwbEFpMJjp+9+zwj2+h84hmj8Q1BXHH2NVyb7NA3/u6HA940coyobvObkskST/Aq/4k31LLMB6coL7vD8lSVjCuiqjnQd6SStaPkhPXEi5KawV4gP+geGgq8+/5tbInn7rza7V3kXg1v5UR6/0lmyLWTYnuTS681UnhJ1jhEB5+rLocLG4ftEN54cA4VzkX9Cn2XgyOKrtAjmQsk4+HnCzpPjNvrdLC";
    public static Signature[] signatures;

    public static Signature[] getSigningCertificateHistory(SigningInfo signingInfo) {
        if (signingInfo.hasMultipleSigners()) {
            return null;
        }
        Signature[] signatureArr = signatures;
        if (signatureArr == null) {
            m27869a();
            return signatures;
        }
        return signatureArr;
    }

    /* renamed from: a */
    private static void m27869a() {
        try {
            int i = 0;
            DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(Base64.decode(sig_data, 0)));
            int read = dataInputStream.read() & 255;
            byte[][] bArr = new byte[read];
            for (int i2 = 0; i2 < read; i2++) {
                bArr[i2] = new byte[dataInputStream.readInt()];
                dataInputStream.readFully(bArr[i2]);
            }
            signatures = new Signature[read];
            while (true) {
                Signature[] signatureArr = signatures;
                if (i >= signatureArr.length) {
                    return;
                }
                signatureArr[i] = new Signature(bArr[i]);
                i++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Signature[] getApkContentsSigners() {
        Signature[] signatureArr = signatures;
        if (signatureArr == null) {
            m27869a();
            return signatures;
        }
        return signatureArr;
    }
}
