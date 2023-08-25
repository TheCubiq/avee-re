package android.support.p000v4.media.session;

import android.media.AudioAttributes;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Bundle;
import java.util.List;
/* renamed from: android.support.v4.media.session.d */
/* loaded from: classes.dex */
public class C0024d {

    /* renamed from: android.support.v4.media.session.d$a */
    /* loaded from: classes.dex */
    public interface InterfaceC0025a {
        /* renamed from: B */
        void mo30415B();

        /* renamed from: a */
        void mo30414a(Object obj);

        /* renamed from: b */
        void mo30413b(int i, int i2, int i3, int i4, int i5);

        /* renamed from: c */
        void mo30412c(Object obj);

        /* renamed from: d */
        void mo30411d(String str, Bundle bundle);

        /* renamed from: u */
        void mo30410u(Bundle bundle);

        /* renamed from: v */
        void mo30409v(List<?> list);

        /* renamed from: z */
        void mo30408z(CharSequence charSequence);
    }

    /* renamed from: android.support.v4.media.session.d$b */
    /* loaded from: classes.dex */
    public static class C0026b<T extends InterfaceC0025a> extends MediaController.Callback {

        /* renamed from: a */
        public final T f66a;

        public C0026b(T t) {
            this.f66a = t;
        }

        @Override // android.media.session.MediaController.Callback
        public void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
            this.f66a.mo30413b(playbackInfo.getPlaybackType(), C0027c.m30406b(playbackInfo), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume());
        }

        @Override // android.media.session.MediaController.Callback
        public void onExtrasChanged(Bundle bundle) {
            MediaSessionCompat.m30460a(bundle);
            this.f66a.mo30410u(bundle);
        }

        @Override // android.media.session.MediaController.Callback
        public void onMetadataChanged(MediaMetadata mediaMetadata) {
            this.f66a.mo30414a(mediaMetadata);
        }

        @Override // android.media.session.MediaController.Callback
        public void onPlaybackStateChanged(PlaybackState playbackState) {
            this.f66a.mo30412c(playbackState);
        }

        @Override // android.media.session.MediaController.Callback
        public void onQueueChanged(List<MediaSession.QueueItem> list) {
            this.f66a.mo30409v(list);
        }

        @Override // android.media.session.MediaController.Callback
        public void onQueueTitleChanged(CharSequence charSequence) {
            this.f66a.mo30408z(charSequence);
        }

        @Override // android.media.session.MediaController.Callback
        public void onSessionDestroyed() {
            this.f66a.mo30415B();
        }

        @Override // android.media.session.MediaController.Callback
        public void onSessionEvent(String str, Bundle bundle) {
            MediaSessionCompat.m30460a(bundle);
            this.f66a.mo30411d(str, bundle);
        }
    }

    /* renamed from: android.support.v4.media.session.d$c */
    /* loaded from: classes.dex */
    public static class C0027c {
        /* renamed from: a */
        public static AudioAttributes m30407a(Object obj) {
            return ((MediaController.PlaybackInfo) obj).getAudioAttributes();
        }

        /* renamed from: b */
        public static int m30406b(Object obj) {
            return m30405c(m30407a(obj));
        }

        /* renamed from: c */
        public static int m30405c(AudioAttributes audioAttributes) {
            if ((audioAttributes.getFlags() & 1) == 1) {
                return 7;
            }
            if ((audioAttributes.getFlags() & 4) == 4) {
                return 6;
            }
            int usage = audioAttributes.getUsage();
            if (usage != 13) {
                switch (usage) {
                    case 2:
                        return 0;
                    case 3:
                        return 8;
                    case 4:
                        return 4;
                    case 5:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                        return 5;
                    case 6:
                        return 2;
                    default:
                        return 3;
                }
            }
            return 1;
        }
    }

    /* renamed from: a */
    public static Object m30416a(InterfaceC0025a interfaceC0025a) {
        return new C0026b(interfaceC0025a);
    }
}
