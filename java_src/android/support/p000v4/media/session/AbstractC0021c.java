package android.support.p000v4.media.session;

import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.support.p000v4.media.MediaMetadataCompat;
import android.support.p000v4.media.session.C0024d;
import android.support.p000v4.media.session.InterfaceC0016a;
import android.support.p000v4.media.session.MediaSessionCompat;
import com.daaw.ho0;
import java.lang.ref.WeakReference;
import java.util.List;
/* renamed from: android.support.v4.media.session.c */
/* loaded from: classes.dex */
public abstract class AbstractC0021c implements IBinder.DeathRecipient {

    /* renamed from: a */
    public final Object f62a;

    /* renamed from: b */
    public InterfaceC0016a f63b;

    /* renamed from: android.support.v4.media.session.c$a */
    /* loaded from: classes.dex */
    public static class C0022a implements C0024d.InterfaceC0025a {

        /* renamed from: a */
        public final WeakReference<AbstractC0021c> f64a;

        public C0022a(AbstractC0021c abstractC0021c) {
            this.f64a = new WeakReference<>(abstractC0021c);
        }

        @Override // android.support.p000v4.media.session.C0024d.InterfaceC0025a
        /* renamed from: B */
        public void mo30415B() {
            AbstractC0021c abstractC0021c = this.f64a.get();
            if (abstractC0021c != null) {
                abstractC0021c.m30432g();
            }
        }

        @Override // android.support.p000v4.media.session.C0024d.InterfaceC0025a
        /* renamed from: a */
        public void mo30414a(Object obj) {
            AbstractC0021c abstractC0021c = this.f64a.get();
            if (abstractC0021c != null) {
                abstractC0021c.m30436c(MediaMetadataCompat.m30486a(obj));
            }
        }

        @Override // android.support.p000v4.media.session.C0024d.InterfaceC0025a
        /* renamed from: b */
        public void mo30413b(int i, int i2, int i3, int i4, int i5) {
            AbstractC0021c abstractC0021c = this.f64a.get();
            if (abstractC0021c != null) {
                abstractC0021c.m30438a(new ho0(i, i2, i3, i4, i5));
            }
        }

        @Override // android.support.p000v4.media.session.C0024d.InterfaceC0025a
        /* renamed from: c */
        public void mo30412c(Object obj) {
            AbstractC0021c abstractC0021c = this.f64a.get();
            if (abstractC0021c == null || abstractC0021c.f63b != null) {
                return;
            }
            abstractC0021c.m30435d(PlaybackStateCompat.m30446a(obj));
        }

        @Override // android.support.p000v4.media.session.C0024d.InterfaceC0025a
        /* renamed from: d */
        public void mo30411d(String str, Bundle bundle) {
            AbstractC0021c abstractC0021c = this.f64a.get();
            if (abstractC0021c != null) {
                if (abstractC0021c.f63b == null || Build.VERSION.SDK_INT >= 23) {
                    abstractC0021c.m30431h(str, bundle);
                }
            }
        }

        @Override // android.support.p000v4.media.session.C0024d.InterfaceC0025a
        /* renamed from: u */
        public void mo30410u(Bundle bundle) {
            AbstractC0021c abstractC0021c = this.f64a.get();
            if (abstractC0021c != null) {
                abstractC0021c.m30437b(bundle);
            }
        }

        @Override // android.support.p000v4.media.session.C0024d.InterfaceC0025a
        /* renamed from: v */
        public void mo30409v(List<?> list) {
            AbstractC0021c abstractC0021c = this.f64a.get();
            if (abstractC0021c != null) {
                abstractC0021c.m30434e(MediaSessionCompat.QueueItem.m30458b(list));
            }
        }

        @Override // android.support.p000v4.media.session.C0024d.InterfaceC0025a
        /* renamed from: z */
        public void mo30408z(CharSequence charSequence) {
            AbstractC0021c abstractC0021c = this.f64a.get();
            if (abstractC0021c != null) {
                abstractC0021c.m30433f(charSequence);
            }
        }
    }

    /* renamed from: android.support.v4.media.session.c$b */
    /* loaded from: classes.dex */
    public static class BinderC0023b extends InterfaceC0016a.AbstractBinderC0017a {

        /* renamed from: p */
        public final WeakReference<AbstractC0021c> f65p;

        public BinderC0023b(AbstractC0021c abstractC0021c) {
            this.f65p = new WeakReference<>(abstractC0021c);
        }

        @Override // android.support.p000v4.media.session.InterfaceC0016a
        /* renamed from: A0 */
        public void mo30429A0() {
            AbstractC0021c abstractC0021c = this.f65p.get();
            if (abstractC0021c != null) {
                abstractC0021c.m30430i(13, null, null);
            }
        }

        /* renamed from: B */
        public void mo30428B() {
            AbstractC0021c abstractC0021c = this.f65p.get();
            if (abstractC0021c != null) {
                abstractC0021c.m30430i(8, null, null);
            }
        }

        /* renamed from: E1 */
        public void mo30427E1(MediaMetadataCompat mediaMetadataCompat) {
            AbstractC0021c abstractC0021c = this.f65p.get();
            if (abstractC0021c != null) {
                abstractC0021c.m30430i(3, mediaMetadataCompat, null);
            }
        }

        @Override // android.support.p000v4.media.session.InterfaceC0016a
        /* renamed from: K1 */
        public void mo30426K1(int i) {
            AbstractC0021c abstractC0021c = this.f65p.get();
            if (abstractC0021c != null) {
                abstractC0021c.m30430i(9, Integer.valueOf(i), null);
            }
        }

        @Override // android.support.p000v4.media.session.InterfaceC0016a
        /* renamed from: L */
        public void mo30425L(String str, Bundle bundle) {
            AbstractC0021c abstractC0021c = this.f65p.get();
            if (abstractC0021c != null) {
                abstractC0021c.m30430i(1, str, bundle);
            }
        }

        @Override // android.support.p000v4.media.session.InterfaceC0016a
        /* renamed from: Z2 */
        public void mo30424Z2(PlaybackStateCompat playbackStateCompat) {
            AbstractC0021c abstractC0021c = this.f65p.get();
            if (abstractC0021c != null) {
                abstractC0021c.m30430i(2, playbackStateCompat, null);
            }
        }

        @Override // android.support.p000v4.media.session.InterfaceC0016a
        /* renamed from: d1 */
        public void mo30423d1(boolean z) {
            AbstractC0021c abstractC0021c = this.f65p.get();
            if (abstractC0021c != null) {
                abstractC0021c.m30430i(11, Boolean.valueOf(z), null);
            }
        }

        @Override // android.support.p000v4.media.session.InterfaceC0016a
        /* renamed from: f2 */
        public void mo30422f2(int i) {
            AbstractC0021c abstractC0021c = this.f65p.get();
            if (abstractC0021c != null) {
                abstractC0021c.m30430i(12, Integer.valueOf(i), null);
            }
        }

        /* renamed from: f3 */
        public void mo30421f3(ParcelableVolumeInfo parcelableVolumeInfo) {
            AbstractC0021c abstractC0021c = this.f65p.get();
            if (abstractC0021c != null) {
                abstractC0021c.m30430i(4, parcelableVolumeInfo != null ? new ho0(parcelableVolumeInfo.f39p, parcelableVolumeInfo.f40q, parcelableVolumeInfo.f41r, parcelableVolumeInfo.f42s, parcelableVolumeInfo.f43t) : null, null);
            }
        }

        @Override // android.support.p000v4.media.session.InterfaceC0016a
        /* renamed from: r1 */
        public void mo30420r1(boolean z) {
        }

        /* renamed from: u */
        public void mo30419u(Bundle bundle) {
            AbstractC0021c abstractC0021c = this.f65p.get();
            if (abstractC0021c != null) {
                abstractC0021c.m30430i(7, bundle, null);
            }
        }

        /* renamed from: v */
        public void mo30418v(List<MediaSessionCompat.QueueItem> list) {
            AbstractC0021c abstractC0021c = this.f65p.get();
            if (abstractC0021c != null) {
                abstractC0021c.m30430i(5, list, null);
            }
        }

        /* renamed from: z */
        public void mo30417z(CharSequence charSequence) {
            AbstractC0021c abstractC0021c = this.f65p.get();
            if (abstractC0021c != null) {
                abstractC0021c.m30430i(6, charSequence, null);
            }
        }
    }

    public AbstractC0021c() {
        Object obj;
        if (Build.VERSION.SDK_INT >= 21) {
            obj = C0024d.m30416a(new C0022a(this));
        } else {
            BinderC0023b binderC0023b = new BinderC0023b(this);
            this.f63b = binderC0023b;
            obj = binderC0023b;
        }
        this.f62a = obj;
    }

    /* renamed from: a */
    public void m30438a(ho0 ho0Var) {
    }

    /* renamed from: b */
    public void m30437b(Bundle bundle) {
    }

    @Override // android.os.IBinder.DeathRecipient
    public void binderDied() {
        m30430i(8, null, null);
    }

    /* renamed from: c */
    public void m30436c(MediaMetadataCompat mediaMetadataCompat) {
    }

    /* renamed from: d */
    public void m30435d(PlaybackStateCompat playbackStateCompat) {
    }

    /* renamed from: e */
    public void m30434e(List<MediaSessionCompat.QueueItem> list) {
    }

    /* renamed from: f */
    public void m30433f(CharSequence charSequence) {
    }

    /* renamed from: g */
    public void m30432g() {
    }

    /* renamed from: h */
    public void m30431h(String str, Bundle bundle) {
    }

    /* renamed from: i */
    public void m30430i(int i, Object obj, Bundle bundle) {
    }
}
