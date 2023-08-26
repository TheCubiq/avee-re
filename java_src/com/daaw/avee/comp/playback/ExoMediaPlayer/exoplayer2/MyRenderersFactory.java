package com.daaw.avee.comp.playback.ExoMediaPlayer.exoplayer2;

import android.content.Context;
import android.os.Handler;
import com.daaw.avee.comp.playback.ExoMediaPlayer.IVisualizerDataCapturer;
import com.daaw.avee.comp.playback.ExoMediaPlayer.MyMediaCodecAudioTrackRendererCapture;
import com.daaw.avee.comp.playback.IMediaPlayerCore;
import com.google.android.exoplayer2.DefaultRenderersFactory;
import com.google.android.exoplayer2.Renderer;
import com.google.android.exoplayer2.audio.AudioCapabilities;
import com.google.android.exoplayer2.audio.AudioProcessor;
import com.google.android.exoplayer2.audio.AudioRendererEventListener;
import com.google.android.exoplayer2.drm.DrmSessionManager;
import com.google.android.exoplayer2.drm.FrameworkMediaCrypto;
import com.google.android.exoplayer2.mediacodec.MediaCodecSelector;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class MyRenderersFactory extends DefaultRenderersFactory {
    private IMediaPlayerCore.OnNotifyListener onNotifyListener;
    private int playerEntryIndexId;
    private IVisualizerDataCapturer visualizerData;

    public MyRenderersFactory(IMediaPlayerCore.OnNotifyListener onNotifyListener, IVisualizerDataCapturer iVisualizerDataCapturer, int i, Context context) {
        super(context);
        this.onNotifyListener = onNotifyListener;
        this.visualizerData = iVisualizerDataCapturer;
        this.playerEntryIndexId = i;
    }

    public MyRenderersFactory(IMediaPlayerCore.OnNotifyListener onNotifyListener, IVisualizerDataCapturer iVisualizerDataCapturer, int i, Context context, int i2) {
        super(context, i2);
        this.onNotifyListener = onNotifyListener;
        this.visualizerData = iVisualizerDataCapturer;
        this.playerEntryIndexId = i;
    }

    @Override // com.google.android.exoplayer2.DefaultRenderersFactory
    protected void buildAudioRenderers(Context context, DrmSessionManager<FrameworkMediaCrypto> drmSessionManager, AudioProcessor[] audioProcessorArr, Handler handler, AudioRendererEventListener audioRendererEventListener, int i, ArrayList<Renderer> arrayList) {
        arrayList.add(new MyMediaCodecAudioTrackRendererCapture(this.visualizerData, this.playerEntryIndexId, new WeakReference(null), context, MediaCodecSelector.DEFAULT, drmSessionManager, true, handler, audioRendererEventListener, AudioCapabilities.getCapabilities(context), audioProcessorArr));
    }
}
