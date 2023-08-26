package com.google.android.exoplayer2;

import android.os.Looper;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.PlayerMessage;
import com.google.android.exoplayer2.source.MediaSource;
/* loaded from: classes.dex */
public interface ExoPlayer extends Player {
    @Deprecated
    public static final int REPEAT_MODE_ALL = 2;
    @Deprecated
    public static final int REPEAT_MODE_OFF = 0;
    @Deprecated
    public static final int REPEAT_MODE_ONE = 1;
    @Deprecated
    public static final int STATE_BUFFERING = 2;
    @Deprecated
    public static final int STATE_ENDED = 4;
    @Deprecated
    public static final int STATE_IDLE = 1;
    @Deprecated
    public static final int STATE_READY = 3;

    @Deprecated
    /* loaded from: classes.dex */
    public interface EventListener extends Player.EventListener {
    }

    @Deprecated
    /* loaded from: classes.dex */
    public interface ExoPlayerComponent extends PlayerMessage.Target {
    }

    @Deprecated
    void blockingSendMessages(ExoPlayerMessage... exoPlayerMessageArr);

    PlayerMessage createMessage(PlayerMessage.Target target);

    Looper getPlaybackLooper();

    void prepare(MediaSource mediaSource);

    void prepare(MediaSource mediaSource, boolean z, boolean z2);

    @Deprecated
    void sendMessages(ExoPlayerMessage... exoPlayerMessageArr);

    void setSeekParameters(SeekParameters seekParameters);

    @Deprecated
    /* loaded from: classes.dex */
    public static final class ExoPlayerMessage {
        public final Object message;
        public final int messageType;
        public final PlayerMessage.Target target;

        @Deprecated
        public ExoPlayerMessage(PlayerMessage.Target target, int i, Object obj) {
            this.target = target;
            this.messageType = i;
            this.message = obj;
        }
    }
}
