package com.daaw.avee.Design;

import com.daaw.avee.Common.Events.WeakDelegateR2;
import com.daaw.avee.Common.Events.WeakEvent;
import com.daaw.avee.Common.Events.WeakEvent1;
import com.daaw.avee.Common.Events.WeakEvent3;
import com.daaw.avee.Common.tlog;
import com.daaw.avee.comp.Common.ExoPcmData;
import com.daaw.avee.comp.PcmProcess.ExoVisualizerDataProvider;
import com.daaw.avee.comp.PcmProcess.PcmBuffer;
import com.daaw.avee.comp.playback.AudioFrameData;
import com.daaw.avee.comp.playback.EventsPlaybackService;
import com.daaw.avee.comp.playback.MediaPlaybackService;
/* loaded from: classes.dex */
public class PcmDesign extends DesignBase {
    private volatile ExoVisualizerDataProvider visualizerData = null;
    private ExoPcmData pcmData = new ExoPcmData();
    private final Object visualizerLock = new Object();
    private PcmBuffer pcmBuffer = null;

    public PcmDesign() {
        MediaPlaybackService.onExoPcmData.subscribeWeak(new WeakEvent1.Handler<ExoPcmData>() { // from class: com.daaw.avee.Design.PcmDesign.1
            @Override // com.daaw.avee.Common.Events.WeakEvent1.Handler
            public void invoke(ExoPcmData exoPcmData) {
                PcmDesign.this.pcmData = exoPcmData;
                if (exoPcmData.enabled) {
                    ExoVisualizerDataProvider exoVisualizerDataProvider = PcmDesign.this.visualizerData;
                    if (exoVisualizerDataProvider != null) {
                        exoVisualizerDataProvider.onPcmData(exoPcmData.buffer, exoPcmData.bufferPresentationTimeUs, exoPcmData.bufferIndex, exoPcmData.sampleRate, exoPcmData.channelCount, exoPcmData.bitDepth);
                    }
                    PcmBuffer pcmBuffer = PcmDesign.this.pcmBuffer;
                    if (pcmBuffer != null) {
                        pcmBuffer.onPcmData(exoPcmData.buffer, exoPcmData.bufferPresentationTimeUs, exoPcmData.bufferIndex, exoPcmData.sampleRate, exoPcmData.channelCount, exoPcmData.bitDepth);
                    }
                }
            }
        }, this.listenerRefHolder);
        MediaPlaybackService.onExoPcmDataNewSource.subscribeWeak(new WeakEvent.Handler() { // from class: com.daaw.avee.Design.PcmDesign.2
            @Override // com.daaw.avee.Common.Events.WeakEvent.Handler
            public void invoke() {
                ExoVisualizerDataProvider exoVisualizerDataProvider = PcmDesign.this.visualizerData;
                if (exoVisualizerDataProvider != null) {
                    exoVisualizerDataProvider.onNewSourceTh();
                }
                PcmBuffer pcmBuffer = PcmDesign.this.pcmBuffer;
                if (pcmBuffer != null) {
                    pcmBuffer.onNewSourceTh();
                }
            }
        }, this.listenerRefHolder);
        VisualizerExporterDesign.onExportingChanged.subscribeWeak(new WeakEvent3.Handler<Boolean, Long, Boolean>() { // from class: com.daaw.avee.Design.PcmDesign.3
            @Override // com.daaw.avee.Common.Events.WeakEvent3.Handler
            public void invoke(Boolean bool, Long l, Boolean bool2) {
                if (!bool.booleanValue()) {
                    if (PcmDesign.this.pcmBuffer != null) {
                        PcmDesign.this.pcmBuffer.dispose();
                    }
                    PcmDesign.this.pcmBuffer = null;
                    return;
                }
                PcmDesign.this.pcmBuffer = new PcmBuffer("tempexport", l.longValue() * 1000);
            }
        }, this.listenerRefHolder);
        VisualizerDesign.getVisualizationData.subscribeWeak(new WeakDelegateR2.Handler<AudioFrameData, AudioFrameData.Request2, AudioFrameData>() { // from class: com.daaw.avee.Design.PcmDesign.4
            @Override // com.daaw.avee.Common.Events.WeakDelegateR2.Handler
            public AudioFrameData invoke(AudioFrameData audioFrameData, AudioFrameData.Request2 request2) {
                return PcmDesign.this.getSoundVisualizationData(audioFrameData, request2, false);
            }
        }, this.listenerRefHolder);
        VisualizerExporterDesign.getVisualizationData.subscribeWeak(new WeakDelegateR2.Handler<AudioFrameData, AudioFrameData.Request2, AudioFrameData>() { // from class: com.daaw.avee.Design.PcmDesign.5
            @Override // com.daaw.avee.Common.Events.WeakDelegateR2.Handler
            public AudioFrameData invoke(AudioFrameData audioFrameData, AudioFrameData.Request2 request2) {
                return PcmDesign.this.getSoundVisualizationData(audioFrameData, request2, true);
            }
        }, this.listenerRefHolder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AudioFrameData getSoundVisualizationData(AudioFrameData audioFrameData, AudioFrameData.Request2 request2, boolean z) {
        AudioFrameData invoke = EventsPlaybackService.Receive.getVisualizationData.invoke(audioFrameData, request2, null);
        if (invoke == null) {
            if (z) {
                tlog.w("AudioFrameData is null, MediaService not started?");
            }
            return invoke;
        } else if (invoke.exoDataUse) {
            PcmBuffer pcmBuffer = this.pcmBuffer;
            if (pcmBuffer != null) {
                return pcmBuffer.getVisData(request2.overridePositionUs < 0 ? invoke.exoDataTimePositionUs : request2.overridePositionUs, request2, audioFrameData, this.pcmData.bitDepth);
            }
            return getVisualizationExoData(invoke.exoDataTimePositionUs, audioFrameData, request2);
        } else {
            return invoke;
        }
    }

    public AudioFrameData getVisualizationExoData(long j, AudioFrameData audioFrameData, AudioFrameData.Request2 request2) {
        AudioFrameData visData;
        if (audioFrameData == null) {
            return null;
        }
        synchronized (this.visualizerLock) {
            ExoVisualizerDataProvider exoVisualizerDataProvider = this.visualizerData;
            if (exoVisualizerDataProvider == null) {
                exoVisualizerDataProvider = new ExoVisualizerDataProvider();
            }
            ExoVisualizerDataProvider exoVisualizerDataProvider2 = exoVisualizerDataProvider;
            if (request2.overridePositionUs >= 0) {
                j = request2.overridePositionUs;
            }
            visData = exoVisualizerDataProvider2.getVisData(j, request2, audioFrameData, request2.clearBuffers);
            this.visualizerData = exoVisualizerDataProvider2;
        }
        return visData;
    }
}
