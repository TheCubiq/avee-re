package android.support.v4.media.session;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.b;
import android.support.v4.media.session.c;
import com.daaw.yc;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
/* loaded from: classes.dex */
public class MediaControllerCompat$MediaControllerImplApi21 {
    public final Object a;
    public final List<c> b;
    public HashMap<c, a> c;
    public final MediaSessionCompat.Token d;

    /* loaded from: classes.dex */
    public static class ExtraBinderRequestResultReceiver extends ResultReceiver {
        public WeakReference<MediaControllerCompat$MediaControllerImplApi21> p;

        @Override // android.os.ResultReceiver
        public void onReceiveResult(int i, Bundle bundle) {
            MediaControllerCompat$MediaControllerImplApi21 mediaControllerCompat$MediaControllerImplApi21 = this.p.get();
            if (mediaControllerCompat$MediaControllerImplApi21 == null || bundle == null) {
                return;
            }
            synchronized (mediaControllerCompat$MediaControllerImplApi21.a) {
                mediaControllerCompat$MediaControllerImplApi21.d.b(b.a.D(yc.a(bundle, "android.support.v4.media.session.EXTRA_BINDER")));
                mediaControllerCompat$MediaControllerImplApi21.d.c(bundle.getBundle("android.support.v4.media.session.SESSION_TOKEN2_BUNDLE"));
                mediaControllerCompat$MediaControllerImplApi21.a();
            }
        }
    }

    /* loaded from: classes.dex */
    public static class a extends c.b {
        public a(c cVar) {
            super(cVar);
        }

        @Override // android.support.v4.media.session.c.b, android.support.v4.media.session.a
        public void B() {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.c.b, android.support.v4.media.session.a
        public void E1(MediaMetadataCompat mediaMetadataCompat) {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.c.b, android.support.v4.media.session.a
        public void f3(ParcelableVolumeInfo parcelableVolumeInfo) {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.c.b, android.support.v4.media.session.a
        public void u(Bundle bundle) {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.c.b, android.support.v4.media.session.a
        public void v(List<MediaSessionCompat.QueueItem> list) {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.c.b, android.support.v4.media.session.a
        public void z(CharSequence charSequence) {
            throw new AssertionError();
        }
    }

    public void a() {
        if (this.d.a() == null) {
            return;
        }
        for (c cVar : this.b) {
            a aVar = new a(cVar);
            this.c.put(cVar, aVar);
            cVar.b = aVar;
            try {
                this.d.a().V(aVar);
                cVar.i(13, null, null);
            } catch (RemoteException unused) {
            }
        }
        this.b.clear();
    }
}
