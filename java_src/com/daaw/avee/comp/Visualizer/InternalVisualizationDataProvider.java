package com.daaw.avee.comp.Visualizer;

import com.daaw.avee.Common.Vec2f;
import com.daaw.avee.comp.AlbumArt.AlbumArtRequest;
import com.daaw.avee.comp.AlbumArt.AlbumArtRequest2;
import com.daaw.avee.comp.AlbumArt.ImageLoadedListener;
import com.daaw.avee.comp.Common.MeterOutputData;
import com.daaw.avee.comp.Common.TrackDurationInfo;
import com.daaw.avee.comp.Visualizer.Graphic.IRenderState;
import com.daaw.avee.comp.playback.AudioFrameData;
import mdesl.graphics.Texture;
/* loaded from: classes.dex */
public interface InternalVisualizationDataProvider {
    void onOffScreenContentRendered(Texture texture, boolean z, String str);

    void onRequestAlbumArtPathAndBitmap(ImageLoadedListener imageLoadedListener, AlbumArtRequest2 albumArtRequest2);

    int onRequestAntiAliasingValue();

    int onRequestAudioProcessMultiThreadValue();

    int onRequestConvertDpToPx(int i);

    Vec2f onRequestMeasureVec2f(String str, Vec2f vec2f, Vec2f vec2f2, MeterOutputData meterOutputData, IRenderState iRenderState);

    int onRequestOverrideAudioFrameSamplesInCount();

    AudioFrameData onRequestSoundVisualizationData(int i);

    TrackDurationInfo onRequestTrackDurationInfo();

    boolean onRequestUseHighQualityBlur();

    AlbumArtRequest onRequestsAlbumArtPath();

    String onRequestsMeasureText(String str);

    void onThemeChanged();
}
