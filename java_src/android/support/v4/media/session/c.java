package android.support.v4.media.session;

import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.a;
import android.support.v4.media.session.d;
import com.daaw.ho0;
import java.lang.ref.WeakReference;
import java.util.List;
/* loaded from: classes.dex */
public abstract class c implements IBinder.DeathRecipient {
    public final Object a;
    public android.support.v4.media.session.a b;

    /* loaded from: classes.dex */
    public static class a implements d.a {
        public final WeakReference<c> a;

        public a(c cVar) {
            this.a = new WeakReference<>(cVar);
        }

        @Override // android.support.v4.media.session.d.a
        public void B() {
            c cVar = this.a.get();
            if (cVar != null) {
                cVar.g();
            }
        }

        @Override // android.support.v4.media.session.d.a
        public void a(Object obj) {
            c cVar = this.a.get();
            if (cVar != null) {
                cVar.c(MediaMetadataCompat.a(obj));
            }
        }

        @Override // android.support.v4.media.session.d.a
        public void b(int i, int i2, int i3, int i4, int i5) {
            c cVar = this.a.get();
            if (cVar != null) {
                cVar.a(new ho0(i, i2, i3, i4, i5));
            }
        }

        @Override // android.support.v4.media.session.d.a
        public void c(Object obj) {
            c cVar = this.a.get();
            if (cVar == null || cVar.b != null) {
                return;
            }
            cVar.d(PlaybackStateCompat.a(obj));
        }

        @Override // android.support.v4.media.session.d.a
        public void d(String str, Bundle bundle) {
            c cVar = this.a.get();
            if (cVar != null) {
                if (cVar.b == null || Build.VERSION.SDK_INT >= 23) {
                    cVar.h(str, bundle);
                }
            }
        }

        @Override // android.support.v4.media.session.d.a
        public void u(Bundle bundle) {
            c cVar = this.a.get();
            if (cVar != null) {
                cVar.b(bundle);
            }
        }

        @Override // android.support.v4.media.session.d.a
        public void v(List<?> list) {
            c cVar = this.a.get();
            if (cVar != null) {
                cVar.e(MediaSessionCompat.QueueItem.b(list));
            }
        }

        @Override // android.support.v4.media.session.d.a
        public void z(CharSequence charSequence) {
            c cVar = this.a.get();
            if (cVar != null) {
                cVar.f(charSequence);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b extends a.AbstractBinderC0001a {
        public final WeakReference<c> p;

        public b(c cVar) {
            this.p = new WeakReference<>(cVar);
        }

        @Override // android.support.v4.media.session.a
        public void A0() {
            c cVar = this.p.get();
            if (cVar != null) {
                cVar.i(13, null, null);
            }
        }

        public void B() {
            c cVar = this.p.get();
            if (cVar != null) {
                cVar.i(8, null, null);
            }
        }

        public void E1(MediaMetadataCompat mediaMetadataCompat) {
            c cVar = this.p.get();
            if (cVar != null) {
                cVar.i(3, mediaMetadataCompat, null);
            }
        }

        @Override // android.support.v4.media.session.a
        public void K1(int i) {
            c cVar = this.p.get();
            if (cVar != null) {
                cVar.i(9, Integer.valueOf(i), null);
            }
        }

        @Override // android.support.v4.media.session.a
        public void L(String str, Bundle bundle) {
            c cVar = this.p.get();
            if (cVar != null) {
                cVar.i(1, str, bundle);
            }
        }

        @Override // android.support.v4.media.session.a
        public void Z2(PlaybackStateCompat playbackStateCompat) {
            c cVar = this.p.get();
            if (cVar != null) {
                cVar.i(2, playbackStateCompat, null);
            }
        }

        @Override // android.support.v4.media.session.a
        public void d1(boolean z) {
            c cVar = this.p.get();
            if (cVar != null) {
                cVar.i(11, Boolean.valueOf(z), null);
            }
        }

        @Override // android.support.v4.media.session.a
        public void f2(int i) {
            c cVar = this.p.get();
            if (cVar != null) {
                cVar.i(12, Integer.valueOf(i), null);
            }
        }

        public void f3(ParcelableVolumeInfo parcelableVolumeInfo) {
            c cVar = this.p.get();
            if (cVar != null) {
                cVar.i(4, parcelableVolumeInfo != null ? new ho0(parcelableVolumeInfo.p, parcelableVolumeInfo.q, parcelableVolumeInfo.r, parcelableVolumeInfo.s, parcelableVolumeInfo.t) : null, null);
            }
        }

        @Override // android.support.v4.media.session.a
        public void r1(boolean z) {
        }

        public void u(Bundle bundle) {
            c cVar = this.p.get();
            if (cVar != null) {
                cVar.i(7, bundle, null);
            }
        }

        public void v(List<MediaSessionCompat.QueueItem> list) {
            c cVar = this.p.get();
            if (cVar != null) {
                cVar.i(5, list, null);
            }
        }

        public void z(CharSequence charSequence) {
            c cVar = this.p.get();
            if (cVar != null) {
                cVar.i(6, charSequence, null);
            }
        }
    }

    public c() {
        Object obj;
        if (Build.VERSION.SDK_INT >= 21) {
            obj = d.a(new a(this));
        } else {
            b bVar = new b(this);
            this.b = bVar;
            obj = bVar;
        }
        this.a = obj;
    }

    public void a(ho0 ho0Var) {
    }

    public void b(Bundle bundle) {
    }

    @Override // android.os.IBinder.DeathRecipient
    public void binderDied() {
        i(8, null, null);
    }

    public void c(MediaMetadataCompat mediaMetadataCompat) {
    }

    public void d(PlaybackStateCompat playbackStateCompat) {
    }

    public void e(List<MediaSessionCompat.QueueItem> list) {
    }

    public void f(CharSequence charSequence) {
    }

    public void g() {
    }

    public void h(String str, Bundle bundle) {
    }

    public void i(int i, Object obj, Bundle bundle) {
    }
}
