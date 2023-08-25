package com.daaw;

import android.content.Context;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Handler;
import com.daaw.tx0;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/* loaded from: classes.dex */
public class wx0 {

    /* renamed from: a */
    public static final ExecutorService f31627a = Executors.newFixedThreadPool(2);

    /* renamed from: c */
    public static void m5737c(Context context, final tx0 tx0Var, Uri uri, String str, final Handler handler, final InterfaceC1153e0<tx0.C3143b> interfaceC1153e0) {
        final Object[] objArr = {context, uri, str};
        f31627a.submit(new Callable() { // from class: com.daaw.vx0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                tx0.C3143b m5734f;
                m5734f = wx0.m5734f(tx0.this, objArr, handler, interfaceC1153e0);
                return m5734f;
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0123  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static tx0.C3144c m5736d(Context context, Uri uri, tx0.C3143b c3143b) {
        boolean z;
        tx0.C3144c c3144c = new tx0.C3144c(c3143b);
        if (uri != null && uri != Uri.EMPTY) {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            if (!"content".equals(uri.getScheme()) && ("http".equals(uri.getScheme()) || "https".equals(uri.getScheme()))) {
                String path = uri.getPath();
                int length = path.length();
                int lastIndexOf = path.lastIndexOf(".");
                if (lastIndexOf < 0) {
                    lastIndexOf = length - 1;
                }
                int max = Math.max(path.lastIndexOf(47, lastIndexOf), 0) + 1;
                int indexOf = path.indexOf(47, lastIndexOf);
                if (indexOf < 0) {
                    indexOf = (length - 1) + 1;
                }
                String substring = path.substring(max, indexOf);
                r3 = substring.length() >= 2 ? substring : null;
                z = false;
                if (z) {
                    c3144c.f28221b = true;
                    if (r3 == null) {
                        c3144c.f28223d = "";
                    } else {
                        c3144c.f28223d = r3;
                    }
                } else {
                    c3144c.f28221b = false;
                    c3144c.f28222c = mediaMetadataRetriever.extractMetadata(12);
                    c3144c.f28224e = mediaMetadataRetriever.extractMetadata(7);
                    c3144c.f28226g = mediaMetadataRetriever.extractMetadata(2);
                    c3144c.f28225f = mediaMetadataRetriever.extractMetadata(1);
                    c3144c.f28228i = br1.m25886w(mediaMetadataRetriever.extractMetadata(9));
                    c3144c.f28231l = br1.m25886w(mediaMetadataRetriever.extractMetadata(0));
                    c3144c.f28232m = br1.m25886w(mediaMetadataRetriever.extractMetadata(14));
                    c3144c.f28233n = br1.m25886w(mediaMetadataRetriever.extractMetadata(8));
                    c3144c.f28227h = mediaMetadataRetriever.extractMetadata(13);
                    c3144c.f28235p = mediaMetadataRetriever.extractMetadata(4);
                    c3144c.f28234o = br1.m25886w(mediaMetadataRetriever.extractMetadata(20));
                    c3144c.f28229j = br1.m25886w(mediaMetadataRetriever.extractMetadata(18));
                    c3144c.f28230k = br1.m25886w(mediaMetadataRetriever.extractMetadata(19));
                }
                if (c3144c.f28222c == null) {
                    c3144c.f28222c = "";
                }
                if (c3144c.f28224e == null) {
                    c3144c.f28224e = "";
                }
                if (c3144c.f28225f == null) {
                    c3144c.f28225f = "";
                }
                if (c3144c.f28226g == null) {
                    c3144c.f28226g = "";
                }
                if (c3144c.f28227h == null) {
                    c3144c.f28227h = "";
                }
                if (c3144c.f28235p == null) {
                    c3144c.f28235p = "";
                }
                mediaMetadataRetriever.release();
            } else {
                mediaMetadataRetriever.setDataSource(context, uri);
                z = true;
                if (z) {
                }
                if (c3144c.f28222c == null) {
                }
                if (c3144c.f28224e == null) {
                }
                if (c3144c.f28225f == null) {
                }
                if (c3144c.f28226g == null) {
                }
                if (c3144c.f28227h == null) {
                }
                if (c3144c.f28235p == null) {
                }
                mediaMetadataRetriever.release();
            }
        }
        return c3144c;
    }

    /* renamed from: f */
    public static /* synthetic */ tx0.C3143b m5734f(tx0 tx0Var, Object[] objArr, Handler handler, final InterfaceC1153e0 interfaceC1153e0) {
        final tx0.C3143b m8747e = tx0Var.m8747e(objArr);
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.daaw.ux0
                @Override // java.lang.Runnable
                public final void run() {
                    InterfaceC1153e0.this.mo7884a(m8747e);
                }
            });
        } else {
            interfaceC1153e0.mo7884a(m8747e);
        }
        return m8747e;
    }
}
