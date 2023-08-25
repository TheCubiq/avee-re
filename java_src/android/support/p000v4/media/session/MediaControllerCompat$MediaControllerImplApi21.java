package android.support.p000v4.media.session;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.p000v4.media.MediaMetadataCompat;
import android.support.p000v4.media.session.AbstractC0021c;
import android.support.p000v4.media.session.InterfaceC0018b;
import android.support.p000v4.media.session.MediaSessionCompat;
import com.daaw.C3686yc;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
/* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21 */
/* loaded from: classes.dex */
public class MediaControllerCompat$MediaControllerImplApi21 {

    /* renamed from: a */
    public final Object f27a;

    /* renamed from: b */
    public final List<AbstractC0021c> f28b;

    /* renamed from: c */
    public HashMap<AbstractC0021c, BinderC0009a> f29c;

    /* renamed from: d */
    public final MediaSessionCompat.Token f30d;

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    /* loaded from: classes.dex */
    public static class ExtraBinderRequestResultReceiver extends ResultReceiver {

        /* renamed from: p */
        public WeakReference<MediaControllerCompat$MediaControllerImplApi21> f31p;

        @Override // android.os.ResultReceiver
        public void onReceiveResult(int i, Bundle bundle) {
            MediaControllerCompat$MediaControllerImplApi21 mediaControllerCompat$MediaControllerImplApi21 = this.f31p.get();
            if (mediaControllerCompat$MediaControllerImplApi21 == null || bundle == null) {
                return;
            }
            synchronized (mediaControllerCompat$MediaControllerImplApi21.f27a) {
                mediaControllerCompat$MediaControllerImplApi21.f30d.m30452b(InterfaceC0018b.AbstractBinderC0019a.m30440D(C3686yc.m3873a(bundle, "android.support.v4.media.session.EXTRA_BINDER")));
                mediaControllerCompat$MediaControllerImplApi21.f30d.m30451c(bundle.getBundle("android.support.v4.media.session.SESSION_TOKEN2_BUNDLE"));
                mediaControllerCompat$MediaControllerImplApi21.m30461a();
            }
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$a */
    /* loaded from: classes.dex */
    public static class BinderC0009a extends AbstractC0021c.BinderC0023b {
        public BinderC0009a(AbstractC0021c abstractC0021c) {
            super(abstractC0021c);
        }

        @Override // android.support.p000v4.media.session.AbstractC0021c.BinderC0023b, android.support.p000v4.media.session.InterfaceC0016a
        /* renamed from: B */
        public void mo30428B() {
            throw new AssertionError();
        }

        @Override // android.support.p000v4.media.session.AbstractC0021c.BinderC0023b, android.support.p000v4.media.session.InterfaceC0016a
        /* renamed from: E1 */
        public void mo30427E1(MediaMetadataCompat mediaMetadataCompat) {
            throw new AssertionError();
        }

        @Override // android.support.p000v4.media.session.AbstractC0021c.BinderC0023b, android.support.p000v4.media.session.InterfaceC0016a
        /* renamed from: f3 */
        public void mo30421f3(ParcelableVolumeInfo parcelableVolumeInfo) {
            throw new AssertionError();
        }

        @Override // android.support.p000v4.media.session.AbstractC0021c.BinderC0023b, android.support.p000v4.media.session.InterfaceC0016a
        /* renamed from: u */
        public void mo30419u(Bundle bundle) {
            throw new AssertionError();
        }

        @Override // android.support.p000v4.media.session.AbstractC0021c.BinderC0023b, android.support.p000v4.media.session.InterfaceC0016a
        /* renamed from: v */
        public void mo30418v(List<MediaSessionCompat.QueueItem> list) {
            throw new AssertionError();
        }

        @Override // android.support.p000v4.media.session.AbstractC0021c.BinderC0023b, android.support.p000v4.media.session.InterfaceC0016a
        /* renamed from: z */
        public void mo30417z(CharSequence charSequence) {
            throw new AssertionError();
        }
    }

    /* renamed from: a */
    public void m30461a() {
        if (this.f30d.m30453a() == null) {
            return;
        }
        for (AbstractC0021c abstractC0021c : this.f28b) {
            BinderC0009a binderC0009a = new BinderC0009a(abstractC0021c);
            this.f29c.put(abstractC0021c, binderC0009a);
            abstractC0021c.f63b = binderC0009a;
            try {
                this.f30d.m30453a().mo30439V(binderC0009a);
                abstractC0021c.m30430i(13, null, null);
            } catch (RemoteException unused) {
            }
        }
        this.f28b.clear();
    }
}
