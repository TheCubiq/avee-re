package com.daaw.avee.Design;

import android.content.Context;
import com.daaw.avee.Common.Events.WeakEventR1;
import com.daaw.avee.Common.Events.WeakEventR2;
import com.daaw.avee.comp.Visualizer.VisualizerViewCore;
import com.daaw.avee.comp.playback.AudioFrameData;
/* loaded from: classes.dex */
public class AppDesign extends DesignBase {
    private AudioFrameData lastAudioFrameDataReuse = new AudioFrameData();
    public static WeakEventR2<AudioFrameData, Integer, AudioFrameData> onRequestsSoundVisualizationDataExport = new WeakEventR2<>();
    public static WeakEventR2<AudioFrameData, Integer, AudioFrameData> onRequestsSoundVisualizationDataRealTime = new WeakEventR2<>();
    public static WeakEventR1<Context, Integer> onRequestRenderQualityEdgesValueExport = new WeakEventR1<>();
    public static WeakEventR1<Context, Integer> onRequestRenderQualityEdgesValueRealTime = new WeakEventR1<>();
    public static WeakEventR1<Context, Integer> onRequestAudioProcessMultiThreadValueExport = new WeakEventR1<>();
    public static WeakEventR1<Context, Integer> onRequestAudioProcessMultiThreadValueRealTime = new WeakEventR1<>();

    public AppDesign() {
        VisualizerViewCore.onRequestsSoundVisualizationData.subscribeWeak(new WeakEventR1.Handler<Integer, AudioFrameData>() { // from class: com.daaw.avee.Design.AppDesign.1
            @Override // com.daaw.avee.Common.Events.WeakEventR1.Handler
            public AudioFrameData invoke(Integer num) {
                AudioFrameData invoke = VisualizerExporterDesign.isExporting() ? AppDesign.onRequestsSoundVisualizationDataExport.invoke(AppDesign.this.lastAudioFrameDataReuse, num, null) : AppDesign.onRequestsSoundVisualizationDataRealTime.invoke(AppDesign.this.lastAudioFrameDataReuse, num, null);
                if (invoke != null) {
                    AppDesign.this.lastAudioFrameDataReuse = invoke;
                }
                return invoke;
            }
        }, this.listenerRefHolder);
        VisualizerViewCore.onRequestRenderQualityEdgesValue.subscribeWeak(new WeakEventR1.Handler<Context, Integer>() { // from class: com.daaw.avee.Design.AppDesign.2
            @Override // com.daaw.avee.Common.Events.WeakEventR1.Handler
            public Integer invoke(Context context) {
                return VisualizerExporterDesign.isExporting() ? AppDesign.onRequestRenderQualityEdgesValueExport.invoke(context, 0) : AppDesign.onRequestRenderQualityEdgesValueRealTime.invoke(context, 0);
            }
        }, this.listenerRefHolder);
        VisualizerViewCore.onRequestAudioProcessMultiThreadValue.subscribeWeak(new WeakEventR1.Handler<Context, Integer>() { // from class: com.daaw.avee.Design.AppDesign.3
            @Override // com.daaw.avee.Common.Events.WeakEventR1.Handler
            public Integer invoke(Context context) {
                if (VisualizerExporterDesign.isExporting()) {
                    return Integer.valueOf(AppDesign.onRequestAudioProcessMultiThreadValueExport.invoke(context, 0).intValue() | 2);
                }
                return Integer.valueOf(AppDesign.onRequestAudioProcessMultiThreadValueRealTime.invoke(context, 1).intValue() | 2);
            }
        }, this.listenerRefHolder);
    }

    public static long getTrackPositionForRendering() {
        return VisualizerExporterDesign.isExporting() ? VisualizerExporterDesign.getOutputTrackPositionUs() / 1000 : PlaybackDesign.trackPosition;
    }

    public static long getTrackDurationForRendering() {
        return VisualizerExporterDesign.isExporting() ? VisualizerExporterDesign.getOutputTrackDurationUs() / 1000 : PlaybackDesign.playingMediaInfo.duration;
    }
}
