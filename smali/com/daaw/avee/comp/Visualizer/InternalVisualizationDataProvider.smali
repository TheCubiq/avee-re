.class public interface abstract Lcom/daaw/avee/comp/Visualizer/InternalVisualizationDataProvider;
.super Ljava/lang/Object;
.source "InternalVisualizationDataProvider.java"


# virtual methods
.method public abstract onOffScreenContentRendered(Lmdesl/graphics/Texture;ZLjava/lang/String;)V
.end method

.method public abstract onRequestAlbumArtPathAndBitmap(Lcom/daaw/avee/comp/AlbumArt/ImageLoadedListener;Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest2;)V
.end method

.method public abstract onRequestAntiAliasingValue()I
.end method

.method public abstract onRequestAudioProcessMultiThreadValue()I
.end method

.method public abstract onRequestConvertDpToPx(I)I
.end method

.method public abstract onRequestMeasureVec2f(Ljava/lang/String;Lcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/comp/Common/MeterOutputData;Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;)Lcom/daaw/avee/Common/Vec2f;
.end method

.method public abstract onRequestOverrideAudioFrameSamplesInCount()I
.end method

.method public abstract onRequestSoundVisualizationData(I)Lcom/daaw/avee/comp/playback/AudioFrameData;
.end method

.method public abstract onRequestTrackDurationInfo()Lcom/daaw/avee/comp/Common/TrackDurationInfo;
.end method

.method public abstract onRequestUseHighQualityBlur()Z
.end method

.method public abstract onRequestsAlbumArtPath()Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;
.end method

.method public abstract onRequestsMeasureText(Ljava/lang/String;)Ljava/lang/String;
.end method

.method public abstract onThemeChanged()V
.end method
