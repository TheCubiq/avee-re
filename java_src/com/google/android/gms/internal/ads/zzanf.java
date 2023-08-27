package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
@zzadh
/* loaded from: classes2.dex */
public final class zzanf implements zzamx {
    private final String zzcpq;

    public zzanf() {
        this(null);
    }

    public zzanf(String str) {
        this.zzcpq = str;
    }

    @Override // com.google.android.gms.internal.ads.zzamx
    public final void zzcz(String str) {
        String message;
        StringBuilder sb;
        String sb2;
        try {
            String valueOf = String.valueOf(str);
            zzane.zzck(valueOf.length() != 0 ? "Pinging URL: ".concat(valueOf) : new String("Pinging URL: "));
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            zzkb.zzif();
            zzamu.zza(true, httpURLConnection, this.zzcpq);
            zzamy zzamyVar = new zzamy();
            zzamyVar.zza(httpURLConnection, (byte[]) null);
            int responseCode = httpURLConnection.getResponseCode();
            zzamyVar.zza(httpURLConnection, responseCode);
            if (responseCode < 200 || responseCode >= 300) {
                StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 65);
                sb3.append("Received non-success response code ");
                sb3.append(responseCode);
                sb3.append(" from pinging URL: ");
                sb3.append(str);
                zzane.zzdk(sb3.toString());
            }
            httpURLConnection.disconnect();
        } catch (IOException e) {
            message = e.getMessage();
            sb = new StringBuilder(String.valueOf(str).length() + 27 + String.valueOf(message).length());
            sb.append("Error while pinging URL: ");
            sb.append(str);
            sb.append(". ");
            sb.append(message);
            sb2 = sb.toString();
            zzane.zzdk(sb2);
        } catch (IndexOutOfBoundsException e2) {
            String message2 = e2.getMessage();
            StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 32 + String.valueOf(message2).length());
            sb4.append("Error while parsing ping URL: ");
            sb4.append(str);
            sb4.append(". ");
            sb4.append(message2);
            sb2 = sb4.toString();
            zzane.zzdk(sb2);
        } catch (RuntimeException e3) {
            message = e3.getMessage();
            sb = new StringBuilder(String.valueOf(str).length() + 27 + String.valueOf(message).length());
            sb.append("Error while pinging URL: ");
            sb.append(str);
            sb.append(". ");
            sb.append(message);
            sb2 = sb.toString();
            zzane.zzdk(sb2);
        }
    }
}
