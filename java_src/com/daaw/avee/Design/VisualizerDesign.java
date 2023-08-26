package com.daaw.avee.Design;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.util.TypedValue;
import android.view.SurfaceHolder;
import android.widget.TextView;
import com.daaw.avee.Common.Action1;
import com.daaw.avee.Common.Events.WeakDelegateR2;
import com.daaw.avee.Common.Events.WeakEvent;
import com.daaw.avee.Common.Events.WeakEvent1;
import com.daaw.avee.Common.Events.WeakEvent2;
import com.daaw.avee.Common.Events.WeakEvent3;
import com.daaw.avee.Common.Events.WeakEvent4;
import com.daaw.avee.Common.Events.WeakEvent5;
import com.daaw.avee.Common.Events.WeakEventR;
import com.daaw.avee.Common.Events.WeakEventR1;
import com.daaw.avee.Common.Events.WeakEventR2;
import com.daaw.avee.Common.Events.WeakEventR5;
import com.daaw.avee.Common.Interpolate;
import com.daaw.avee.Common.Tuple2;
import com.daaw.avee.Common.Utils;
import com.daaw.avee.Common.UtilsFileSys;
import com.daaw.avee.Common.VAsyncTask;
import com.daaw.avee.Common.Vec2f;
import com.daaw.avee.Common.tlog;
import com.daaw.avee.ContextData;
import com.daaw.avee.Design.VisualizerThemes;
import com.daaw.avee.EventsGlobal.EventsGlobalTextNotifier;
import com.daaw.avee.MainActivity;
import com.daaw.avee.PlayerCore;
import com.daaw.avee.R;
import com.daaw.avee.SettingsActivity;
import com.daaw.avee.comp.AlbumArt.AlbumArtFactory;
import com.daaw.avee.comp.AlbumArt.AlbumArtRequest;
import com.daaw.avee.comp.AlbumArt.AlbumArtRequest2;
import com.daaw.avee.comp.AlbumArt.IAlbumArtCore;
import com.daaw.avee.comp.AlbumArt.ImageLoadedListener;
import com.daaw.avee.comp.AlbumArt.ImageResult;
import com.daaw.avee.comp.AlbumArt.LocalBitmapLoader;
import com.daaw.avee.comp.AppPreferences.AppPreferences;
import com.daaw.avee.comp.Common.IItemIdentifier;
import com.daaw.avee.comp.Common.MeasureDefs;
import com.daaw.avee.comp.Common.MeterOutputData;
import com.daaw.avee.comp.Common.TrackDurationInfo;
import com.daaw.avee.comp.Common.VisualizerThemeInfo;
import com.daaw.avee.comp.MediaControlsUI.MediaControlsUI;
import com.daaw.avee.comp.VisualUI.Fragment2;
import com.daaw.avee.comp.VisualUI.VisualizerChooseDialog;
import com.daaw.avee.comp.Visualizer.CustomScene;
import com.daaw.avee.comp.Visualizer.DependencyResourceCounter;
import com.daaw.avee.comp.Visualizer.DependencyResourceCounterDuymmy;
import com.daaw.avee.comp.Visualizer.Elements.ElementsFactory;
import com.daaw.avee.comp.Visualizer.Elements.RootElement;
import com.daaw.avee.comp.Visualizer.Graphic.IRenderState;
import com.daaw.avee.comp.Visualizer.GraphicPreview.RenderStatePreview;
import com.daaw.avee.comp.Visualizer.VisualizerViewCore;
import com.daaw.avee.comp.VisualizerCutomization.CustomizeVisDialog;
import com.daaw.avee.comp.playback.AudioFrameData;
import com.daaw.avee.comp.playback.EventsPlaybackService;
import com.daaw.avee.comp.playback.MediaPlaybackService;
import com.daaw.avee.comp.playback.PlayingMediaInfo;
import com.daaw.avee.comp.playback.Song.PlaylistSong;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
/* loaded from: classes.dex */
public class VisualizerDesign {
    public static WeakDelegateR2<AudioFrameData, AudioFrameData.Request2, AudioFrameData> getVisualizationData = new WeakDelegateR2<>();
    private boolean useHighQualityBlur;
    private volatile WeakReference<SurfaceHolder> surfaceHolder = new WeakReference<>(null);
    private WeakReference<VisualizerViewCore> visualizerSurfaceView = new WeakReference<>(null);
    private volatile float videoWidthHeightRatio = 1.0f;
    private boolean uiNeedShowVisual = true;
    private List<Object> listenerRefHolder = new LinkedList();
    private Handler threadHandler = new Handler();
    private WeakReference<TextView> currentPickingTxtValue = new WeakReference<>(null);
    private List<String> currentPickingCustomizationData = null;
    private String currentPickingPropertyName = null;
    final Random randomGenerator = new Random();
    private Handler mainThreadHandler = new Handler();
    private Vec2f shakePoint = new Vec2f(0.0f, 0.0f);
    private Vec2f shakePointSmooth = new Vec2f(0.0f, 0.0f);
    private float totalFrameTimeWhenPlaying = 0.0f;
    private int selectedSceneElementId = -1;
    private final HandheldMotion handheldMotionSmooth = new HandheldMotion(HandheldMotion.Jarles_Presets_MoreMovement_Smoothest);
    private final HandheldMotion handheldMotionLotOfShake = new HandheldMotion(HandheldMotion.Jarles_Presets_LotsOshake);
    HashMap<Integer, Bitmap> cachedPreviewThumbs = new HashMap<>();
    RenderStatePreview renderStatePreview = new RenderStatePreview();

    public VisualizerDesign() {
        boolean z = true;
        this.useHighQualityBlur = false;
        final Context appContext = PlayerCore.s().getAppContext();
        this.useHighQualityBlur = (appContext == null || !AppPreferences.createOrGetInstance().preferencesGetBoolSafe(appContext, "pref_highQualityBlur", false)) ? false : false;
        SettingsActivity.onPrefHighQualityBlurChanged.subscribeWeak(new WeakEvent1.Handler<Boolean>() { // from class: com.daaw.avee.Design.VisualizerDesign.1
            @Override // com.daaw.avee.Common.Events.WeakEvent1.Handler
            public void invoke(Boolean bool) {
                VisualizerDesign.this.useHighQualityBlur = bool.booleanValue();
            }
        }, this.listenerRefHolder);
        MediaPlaybackService.onDisplayMetaDataStateChanged.subscribeWeak(new WeakEvent4.Handler<PlaylistSong, IItemIdentifier, PlaylistSong.Data, PlayingMediaInfo>() { // from class: com.daaw.avee.Design.VisualizerDesign.2
            @Override // com.daaw.avee.Common.Events.WeakEvent4.Handler
            public void invoke(PlaylistSong playlistSong, IItemIdentifier iItemIdentifier, PlaylistSong.Data data, PlayingMediaInfo playingMediaInfo) {
            }
        }, this.listenerRefHolder);
        MediaPlaybackService.onRequestVideoScalingMode.subscribeWeak(new WeakEventR.Handler<Integer>() { // from class: com.daaw.avee.Design.VisualizerDesign.3
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.daaw.avee.Common.Events.WeakEventR.Handler
            public Integer invoke() {
                return Integer.valueOf(VisualizerDesign.this.getPlayerbackVideoScalingMode());
            }
        }, this.listenerRefHolder);
        MediaPlaybackService.onRequestVideoSurfaceHolder.subscribeWeak(new WeakEventR.Handler<SurfaceHolder>() { // from class: com.daaw.avee.Design.VisualizerDesign.4
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.daaw.avee.Common.Events.WeakEventR.Handler
            public SurfaceHolder invoke() {
                return (SurfaceHolder) VisualizerDesign.this.surfaceHolder.get();
            }
        }, this.listenerRefHolder);
        MediaPlaybackService.onVideoSizeChanged.subscribeWeak(new WeakEvent3.Handler<Integer, Integer, Float>() { // from class: com.daaw.avee.Design.VisualizerDesign.5
            @Override // com.daaw.avee.Common.Events.WeakEvent3.Handler
            public void invoke(Integer num, Integer num2, Float f) {
                VisualizerDesign.this.videoWidthHeightRatio = f.floatValue();
                VisualizerDesign.this.threadHandler.post(new Runnable() { // from class: com.daaw.avee.Design.VisualizerDesign.5.1
                    @Override // java.lang.Runnable
                    public void run() {
                        Fragment2 fragment2Instance = MainActivity.getFragment2Instance();
                        if (fragment2Instance != null) {
                            fragment2Instance.setVideoSizeTh(VisualizerDesign.this.getSurfaceVideoSize(VisualizerDesign.this.videoWidthHeightRatio));
                        }
                    }
                });
            }
        }, this.listenerRefHolder);
        Fragment2.onSurfaceCreated.subscribeWeak(new WeakEvent1.Handler<VisualizerViewCore>() { // from class: com.daaw.avee.Design.VisualizerDesign.6
            @Override // com.daaw.avee.Common.Events.WeakEvent1.Handler
            public void invoke(VisualizerViewCore visualizerViewCore) {
                VisualizerDesign.this.visualizerSurfaceView = new WeakReference(visualizerViewCore);
            }
        }, this.listenerRefHolder);
        AppDesign.onRequestsSoundVisualizationDataRealTime.subscribeWeak(new WeakEventR2.Handler<AudioFrameData, Integer, AudioFrameData>() { // from class: com.daaw.avee.Design.VisualizerDesign.7
            @Override // com.daaw.avee.Common.Events.WeakEventR2.Handler
            public AudioFrameData invoke(AudioFrameData audioFrameData, Integer num) {
                return VisualizerDesign.this.getSoundVisualizationData(num.intValue(), audioFrameData);
            }
        }, this.listenerRefHolder);
        VisualizerViewCore.onFrameStart.subscribeWeak(new WeakEvent2.Handler<Float, Float>() { // from class: com.daaw.avee.Design.VisualizerDesign.8
            @Override // com.daaw.avee.Common.Events.WeakEvent2.Handler
            public void invoke(Float f, Float f2) {
                if (VisualizerDesign.this.isPlaying()) {
                    VisualizerDesign.this.totalFrameTimeWhenPlaying += f.floatValue();
                }
                if (VisualizerDesign.this.shakePointSmooth.distance(VisualizerDesign.this.shakePoint) < 0.1f) {
                    VisualizerDesign.this.shakePoint.x = (VisualizerDesign.this.randomGenerator.nextFloat() * 2.0f) - 1.0f;
                    VisualizerDesign.this.shakePoint.y = (VisualizerDesign.this.randomGenerator.nextFloat() * 2.0f) - 1.0f;
                    VisualizerDesign.this.shakePoint.normalize();
                }
                Interpolate.Lerp(VisualizerDesign.this.shakePointSmooth, VisualizerDesign.this.shakePointSmooth, VisualizerDesign.this.shakePoint, 0.8999999761581421d);
            }
        }, this.listenerRefHolder);
        VisualizerViewCore.onRequestMeasureText.subscribeWeak(new WeakEventR2.Handler<String, VisualizerViewCore, String>() { // from class: com.daaw.avee.Design.VisualizerDesign.9
            @Override // com.daaw.avee.Common.Events.WeakEventR2.Handler
            public String invoke(String str, VisualizerViewCore visualizerViewCore) {
                return str == null ? "" : VisualizerDesign.this.formatMeasureString(str, visualizerViewCore);
            }
        }, this.listenerRefHolder);
        VisualizerViewCore.onRequestMeasureVec2f.subscribeWeak(new WeakEventR5.Handler<String, Vec2f, Vec2f, MeterOutputData, IRenderState, Vec2f>() { // from class: com.daaw.avee.Design.VisualizerDesign.10
            @Override // com.daaw.avee.Common.Events.WeakEventR5.Handler
            public Vec2f invoke(String str, Vec2f vec2f, Vec2f vec2f2, MeterOutputData meterOutputData, IRenderState iRenderState) {
                float frameTimeF = iRenderState.getFrameTimeF();
                float totalFrameTimeF = iRenderState.getTotalFrameTimeF();
                if (str == null) {
                    return new Vec2f(vec2f.x, vec2f.y);
                }
                if (str.length() < 1) {
                    return new Vec2f(vec2f.x, vec2f.y);
                }
                float f = 0.0f;
                Vec2f vec2f3 = vec2f2 == null ? new Vec2f(0.0f, 0.0f) : vec2f2;
                if (MeasureDefs.Nothing.equals(str)) {
                    return new Vec2f(0.0f, 0.0f);
                }
                if (MeasureDefs.Constant.equals(str)) {
                    return new Vec2f(vec2f.x, vec2f.y);
                }
                if (MeasureDefs.isPlaying.equals(str)) {
                    return VisualizerDesign.this.isPlaying() ? new Vec2f(1.0f, 1.0f) : new Vec2f(0.0f, 0.0f);
                } else if (str.equals(MeasureDefs.beat)) {
                    return new Vec2f(meterOutputData.frameDataRmsValue * vec2f.x, meterOutputData.frameDataRmsValue * vec2f.y);
                } else {
                    float f2 = 0.5f;
                    if (str.equals(MeasureDefs.beatCamShakeMore)) {
                        float max = Math.max(Math.min(VisualizerDesign.this.isPlaying() ? meterOutputData.frameDataRmsValue * 2.5f : 0.0f, 1.0f), 0.0f);
                        float f3 = max * max;
                        Vec2f pos = VisualizerDesign.this.handheldMotionLotOfShake.getPos((((totalFrameTimeF * 0.5f) * max) * vec2f.y) % 1.0f);
                        pos.x = (pos.x - 0.5f) * vec2f.x * f3 * 0.06f;
                        pos.y = (pos.y - 0.5f) * vec2f.x * f3 * 0.06f;
                        Interpolate.Lerp(pos, vec2f3, pos, 0.800000011920929d);
                        return pos;
                    } else if (str.equals(MeasureDefs.beatCamShakeLess)) {
                        float max2 = Math.max(Math.min(VisualizerDesign.this.isPlaying() ? meterOutputData.frameDataRmsValue * 2.5f : 0.0f, 1.0f), 0.0f);
                        float f4 = max2 * max2;
                        Vec2f pos2 = VisualizerDesign.this.handheldMotionSmooth.getPos((((totalFrameTimeF * 0.5f) * max2) * vec2f.y) % 1.0f);
                        pos2.x = (pos2.x - 0.5f) * vec2f.x * f4 * 0.06f;
                        pos2.y = (pos2.y - 0.5f) * vec2f.x * f4 * 0.06f;
                        Interpolate.Lerp(pos2, vec2f3, pos2, 0.800000011920929d);
                        return pos2;
                    } else if (str.equals(MeasureDefs.totalTime)) {
                        return new Vec2f((vec2f.x * totalFrameTimeF) % 1.0f, (totalFrameTimeF * vec2f.y) % 1.0f);
                    } else {
                        if (str.equals(MeasureDefs.totalTimeBackward)) {
                            return new Vec2f(1.0f - ((vec2f.x * totalFrameTimeF) % 1.0f), 1.0f - ((totalFrameTimeF * vec2f.y) % 1.0f));
                        }
                        if (str.equals(MeasureDefs.totalTimeWhenPlaying)) {
                            return new Vec2f((VisualizerDesign.this.totalFrameTimeWhenPlaying * vec2f.x) % 1.0f, (VisualizerDesign.this.totalFrameTimeWhenPlaying * vec2f.y) % 1.0f);
                        }
                        if (str.equals(MeasureDefs.constantCamShakeMore)) {
                            Vec2f pos3 = VisualizerDesign.this.handheldMotionLotOfShake.getPos(((totalFrameTimeF * 0.5f) * vec2f.y) % 1.0f);
                            pos3.x = (pos3.x - 0.5f) * vec2f.x * 0.06f;
                            pos3.y = (pos3.y - 0.5f) * vec2f.x * 0.06f;
                            Interpolate.Lerp(pos3, vec2f3, pos3, 0.10000000149011612d);
                            return pos3;
                        } else if (str.equals(MeasureDefs.constantCamShakeLess)) {
                            Vec2f pos4 = VisualizerDesign.this.handheldMotionSmooth.getPos(((totalFrameTimeF * 0.5f) * vec2f.y) % 1.0f);
                            pos4.x = (pos4.x - 0.5f) * vec2f.x * 0.06f;
                            pos4.y = (pos4.y - 0.5f) * vec2f.x * 0.06f;
                            Interpolate.Lerp(pos4, vec2f3, pos4, 0.10000000149011612d);
                            return pos4;
                        } else if (str.equals(MeasureDefs.beatRandomShake)) {
                            float max3 = Math.max(Math.min(VisualizerDesign.this.isPlaying() ? meterOutputData.frameDataRmsValue * 2.5f : 0.0f, 1.0f), 0.0f);
                            float f5 = max3 * max3 * max3;
                            return new Vec2f(VisualizerDesign.this.shakePointSmooth.x * f5 * vec2f.x * 0.025f, VisualizerDesign.this.shakePointSmooth.y * f5 * vec2f.x * 0.025f);
                        } else if (str.equals(MeasureDefs.trackPosition)) {
                            float max4 = Math.max(Math.min(((float) AppDesign.getTrackPositionForRendering()) / ((float) AppDesign.getTrackDurationForRendering()), 1.0f), 0.0f);
                            return new Vec2f(vec2f.x * max4, max4 * vec2f.y);
                        } else if (str.equals(MeasureDefs.totalTimeAndBeat)) {
                            float f6 = vec2f3.x;
                            if (VisualizerDesign.this.isPlaying()) {
                                f6 = f6 + (frameTimeF * vec2f.x * 1.0f) + (meterOutputData.frameDataRmsValue * vec2f.y * 0.1f);
                            }
                            return new Vec2f(f6, f6);
                        } else if (str.equals(MeasureDefs.constantCamShakeRotMore)) {
                            double rot = VisualizerDesign.this.handheldMotionLotOfShake.getRot(((totalFrameTimeF * 0.5f) * vec2f.y) % 1.0f);
                            Double.isNaN(rot);
                            float Lerp = Interpolate.Lerp(vec2f3.x, ((float) (rot / 6.283185307179586d)) * vec2f.x * 0.5f, 0.10000000149011612d);
                            return new Vec2f(Lerp, Lerp);
                        } else if (str.equals(MeasureDefs.constantCamShakeRotLess)) {
                            double rot2 = VisualizerDesign.this.handheldMotionSmooth.getRot(((totalFrameTimeF * 0.5f) * vec2f.y) % 1.0f);
                            Double.isNaN(rot2);
                            float Lerp2 = Interpolate.Lerp(vec2f3.x, ((float) (rot2 / 6.283185307179586d)) * vec2f.x * 0.5f, 0.10000000149011612d);
                            return new Vec2f(Lerp2, Lerp2);
                        } else if (str.equals(MeasureDefs.beatCamShakeRotMore)) {
                            float max5 = Math.max(Math.min(VisualizerDesign.this.isPlaying() ? meterOutputData.frameDataRmsValue * 2.5f : 0.0f, 1.0f), 0.0f);
                            double rot3 = VisualizerDesign.this.handheldMotionLotOfShake.getRot(((totalFrameTimeF * 0.5f) * vec2f.y) % 1.0f);
                            Double.isNaN(rot3);
                            float Lerp3 = Interpolate.Lerp(vec2f3.x, ((float) (rot3 / 6.283185307179586d)) * vec2f.x * 0.5f * max5 * max5, 0.800000011920929d);
                            return new Vec2f(Lerp3, Lerp3);
                        } else if (str.equals(MeasureDefs.beatCamShakeRotLess)) {
                            float max6 = Math.max(Math.min(VisualizerDesign.this.isPlaying() ? meterOutputData.frameDataRmsValue * 2.5f : 0.0f, 1.0f), 0.0f);
                            double rot4 = VisualizerDesign.this.handheldMotionSmooth.getRot(((totalFrameTimeF * 0.5f) * vec2f.y) % 1.0f);
                            Double.isNaN(rot4);
                            float Lerp4 = Interpolate.Lerp(vec2f3.x, ((float) (rot4 / 6.283185307179586d)) * vec2f.x * 0.5f * max6 * max6, 0.800000011920929d);
                            return new Vec2f(Lerp4, Lerp4);
                        } else if (str.equals(MeasureDefs.peakBarIndex)) {
                            float Lerp5 = Interpolate.Lerp(meterOutputData.peakBarIndex, vec2f3.x, vec2f.y);
                            return new Vec2f(vec2f.x * Lerp5, Lerp5 * vec2f.x);
                        } else if (str.equals(MeasureDefs.beatTriggerAnim)) {
                            if (VisualizerDesign.this.isPlaying() && meterOutputData.frameDataRmsValue > vec2f.x && vec2f3.y >= 1.9999999f) {
                                vec2f3.x = 0.0f;
                                vec2f3.y = 0.0f;
                            }
                            float f7 = vec2f3.x + (vec2f.y * frameTimeF);
                            if (f7 >= 0.4999999f) {
                                f = vec2f3.y + (frameTimeF * vec2f.y);
                            } else {
                                f2 = f7;
                            }
                            return new Vec2f(f2, f);
                        } else {
                            return vec2f3;
                        }
                    }
                }
            }
        }, this.listenerRefHolder);
        VisualizerViewCore.onRequestsAlbumArtPath.subscribeWeak(new WeakEventR.Handler<AlbumArtRequest>() { // from class: com.daaw.avee.Design.VisualizerDesign.11
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.daaw.avee.Common.Events.WeakEventR.Handler
            public AlbumArtRequest invoke() {
                PlaylistSong.Data data = PlaybackControlsDesign.fieldsongData;
                if (data == PlaylistSong.emptyData) {
                    return null;
                }
                return new AlbumArtRequest(data.dataSource, data.getAlbumArtPath0Str(), data.getAlbumArtPath1Str(), data.getAlbumArtGenerateStr());
            }
        }, this.listenerRefHolder);
        VisualizerViewCore.onRequestAlbumArtPathAndBitmap.subscribeWeak(new WeakEvent2.Handler<ImageLoadedListener, AlbumArtRequest2>() { // from class: com.daaw.avee.Design.VisualizerDesign.12
            @Override // com.daaw.avee.Common.Events.WeakEvent2.Handler
            public void invoke(final ImageLoadedListener imageLoadedListener, AlbumArtRequest2 albumArtRequest2) {
                ImageLoadedListener imageLoadedListener2 = new ImageLoadedListener() { // from class: com.daaw.avee.Design.VisualizerDesign.12.1
                    Object object1;

                    @Override // com.daaw.avee.comp.AlbumArt.ImageLoadedListener
                    public void onBitmapLoaded(final ImageResult imageResult, final String str, final String str2, final String str3) {
                        VisualizerViewCore visualizerViewCore = (VisualizerViewCore) VisualizerDesign.this.visualizerSurfaceView.get();
                        if (visualizerViewCore != null) {
                            visualizerViewCore.queueEvent(new Runnable() { // from class: com.daaw.avee.Design.VisualizerDesign.12.1.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    imageLoadedListener.onBitmapLoaded(imageResult, str, str2, str3);
                                }
                            });
                        }
                    }

                    @Override // com.daaw.avee.comp.AlbumArt.ImageLoadedListener
                    public void setUserObject1(Object obj) {
                        this.object1 = obj;
                    }
                };
                imageLoadedListener.setUserObject1(imageLoadedListener2);
                int i = AppPreferences.createOrGetInstance().getInt(AppPreferences.PREF_Int_visualizerThemeId);
                IAlbumArtCore albumArtFactory = AlbumArtFactory.getInstance();
                if (albumArtFactory != null) {
                    albumArtFactory.loadAlbumArtLarge(false, albumArtRequest2.videoThumbDataSource, albumArtRequest2.path0, albumArtRequest2.path1, albumArtRequest2.genStr, albumArtRequest2.fitCenter, imageLoadedListener2, albumArtRequest2.targetBoundsWidth, albumArtRequest2.targetBoundsHeight, albumArtRequest2.genBoundsWidth, albumArtRequest2.genBoundsHeight, albumArtRequest2.genHint, albumArtRequest2.genHint2, false, albumArtRequest2.imageColorKeyParams, Integer.valueOf(i));
                }
            }
        }, this.listenerRefHolder);
        VisualizerViewCore.onRequestConvertDpToPx.subscribeWeak(new WeakEventR1.Handler<Integer, Integer>() { // from class: com.daaw.avee.Design.VisualizerDesign.13
            @Override // com.daaw.avee.Common.Events.WeakEventR1.Handler
            public Integer invoke(Integer num) {
                return Integer.valueOf((int) TypedValue.applyDimension(1, Integer.valueOf(num.intValue() / 2).intValue(), PlayerCore.s().getAppContext().getResources().getDisplayMetrics()));
            }
        }, this.listenerRefHolder);
        VisualizerChooseDialog.onRequestSkinThemePresetList.subscribeWeak(new WeakEventR1.Handler<List<VisualizerThemeInfo>, Tuple2<Integer, List<Integer>>>() { // from class: com.daaw.avee.Design.VisualizerDesign.14
            @Override // com.daaw.avee.Common.Events.WeakEventR1.Handler
            public Tuple2<Integer, List<Integer>> invoke(List<VisualizerThemeInfo> list) {
                List<Tuple2<VisualizerThemeInfo, VisualizerThemes.IVisualizerFactory2>> themesList = VisualizerThemes.s().getThemesList();
                ArrayList arrayList = new ArrayList(themesList.size());
                for (Tuple2<VisualizerThemeInfo, VisualizerThemes.IVisualizerFactory2> tuple2 : themesList) {
                    arrayList.add(Integer.valueOf(tuple2.obj1.id));
                }
                List<Integer> prefThemeCustomizationIndexes = AppPreferences.createOrGetInstance().getPrefThemeCustomizationIndexes();
                ArrayList<Integer> arrayList2 = new ArrayList(themesList.size() + prefThemeCustomizationIndexes.size());
                for (Tuple2<VisualizerThemeInfo, VisualizerThemes.IVisualizerFactory2> tuple22 : themesList) {
                    arrayList2.add(Integer.valueOf(tuple22.obj1.id));
                }
                for (Integer num : prefThemeCustomizationIndexes) {
                    if (!arrayList.contains(num)) {
                        arrayList2.add(num);
                    }
                }
                for (Integer num2 : arrayList2) {
                    list.add(new VisualizerThemeInfo(num2.intValue(), VisualizerThemes.s().isTemplateIndex(num2.intValue())));
                }
                return new Tuple2<>(Integer.valueOf(AppPreferences.createOrGetInstance().getInt(AppPreferences.PREF_Int_visualizerThemeId)), arrayList2);
            }
        }, this.listenerRefHolder);
        VisualizerChooseDialog.onRequestVisTemplatePreviewImage.subscribeWeak(new WeakEventR1.Handler<List<VisualizerThemeInfo>, VAsyncTask<List<Bitmap>>>() { // from class: com.daaw.avee.Design.VisualizerDesign.15
            @Override // com.daaw.avee.Common.Events.WeakEventR1.Handler
            public VAsyncTask<List<Bitmap>> invoke(final List<VisualizerThemeInfo> list) {
                return new VAsyncTask<>(new VAsyncTask.TaskListener<List<Bitmap>>() { // from class: com.daaw.avee.Design.VisualizerDesign.15.1
                    @Override // com.daaw.avee.Common.VAsyncTask.TaskListener
                    public List<Bitmap> onExecuteInBg(VAsyncTask<List<Bitmap>> vAsyncTask) {
                        ArrayList arrayList = new ArrayList(list.size());
                        int[] iArr = new int[1];
                        HashMap<Integer, Bitmap> hashMap = new HashMap<>(list.size());
                        RootElement themeObjectForLoading2 = VisualizerThemes.s().getThemeObjectForLoading2(0, false, "");
                        for (int i = 0; i < list.size(); i++) {
                            int i2 = ((VisualizerThemeInfo) list.get(i)).id;
                            CustomScene prefThemeCustomizationDataOrTemplateData = VisualizerDesign.getPrefThemeCustomizationDataOrTemplateData(i2, iArr);
                            Bitmap bitmap = VisualizerDesign.this.cachedPreviewThumbs.get(Integer.valueOf(iArr[0]));
                            if (bitmap == null || iArr[0] == 0) {
                                Bitmap createBitmap = Bitmap.createBitmap(PsExtractor.AUDIO_STREAM, PsExtractor.AUDIO_STREAM, Bitmap.Config.ARGB_8888);
                                VisualizerDesign.this.loadRootElementWithCustomSecene(null, themeObjectForLoading2, i2, true, prefThemeCustomizationDataOrTemplateData);
                                if (themeObjectForLoading2 != null) {
                                    VisualizerDesign.this.renderStatePreview.onFrameStart();
                                    VisualizerDesign.this.renderStatePreview.setDestBitmap(createBitmap);
                                    for (int i3 = 0; i3 < 1; i3++) {
                                        themeObjectForLoading2.onEarlyUpdate(VisualizerDesign.this.renderStatePreview, null, null);
                                    }
                                    themeObjectForLoading2.onRenderPreview(VisualizerDesign.this.renderStatePreview, null);
                                }
                                bitmap = createBitmap;
                            }
                            hashMap.put(Integer.valueOf(iArr[0]), bitmap);
                            arrayList.add(bitmap);
                        }
                        VisualizerDesign.this.cachedPreviewThumbs = hashMap;
                        return arrayList;
                    }
                });
            }
        }, this.listenerRefHolder);
        VisualizerChooseDialog.onSkinThemePresetSelected.subscribeWeak(new WeakEvent1.Handler<VisualizerThemeInfo>() { // from class: com.daaw.avee.Design.VisualizerDesign.16
            @Override // com.daaw.avee.Common.Events.WeakEvent1.Handler
            public void invoke(VisualizerThemeInfo visualizerThemeInfo) {
                VisualizerDesign.selectThemePreset(visualizerThemeInfo.id);
            }
        }, this.listenerRefHolder);
        VisualizerChooseDialog.onRemoveVisTemplateAction.subscribeWeak(new WeakEvent1.Handler<VisualizerThemeInfo>() { // from class: com.daaw.avee.Design.VisualizerDesign.17
            @Override // com.daaw.avee.Common.Events.WeakEvent1.Handler
            public void invoke(VisualizerThemeInfo visualizerThemeInfo) {
                if (visualizerThemeInfo == null) {
                    return;
                }
                EventsGlobalTextNotifier.onTextMsg.invoke(appContext.getResources().getString(R.string.hold_to_remove_vis));
            }
        }, this.listenerRefHolder);
        VisualizerChooseDialog.onRemoveVisTemplateAction_Long.subscribeWeak(new WeakEvent1.Handler<VisualizerThemeInfo>() { // from class: com.daaw.avee.Design.VisualizerDesign.18
            @Override // com.daaw.avee.Common.Events.WeakEvent1.Handler
            public void invoke(VisualizerThemeInfo visualizerThemeInfo) {
                if (visualizerThemeInfo == null) {
                    return;
                }
                AppPreferences createOrGetInstance = AppPreferences.createOrGetInstance();
                List<Integer> prefThemeCustomizationIndexes = createOrGetInstance.getPrefThemeCustomizationIndexes();
                prefThemeCustomizationIndexes.remove(Integer.valueOf(visualizerThemeInfo.id));
                createOrGetInstance.getInt(AppPreferences.PREF_Int_visualizerThemeId);
                createOrGetInstance.setPrefThemeCustomizationIndexes(prefThemeCustomizationIndexes);
            }
        }, this.listenerRefHolder);
        VisualizerChooseDialog.onDuplicateVisTemplateAction.subscribeWeak(new WeakEvent2.Handler<VisualizerThemeInfo, List<Integer>>() { // from class: com.daaw.avee.Design.VisualizerDesign.19
            @Override // com.daaw.avee.Common.Events.WeakEvent2.Handler
            public void invoke(VisualizerThemeInfo visualizerThemeInfo, List<Integer> list) {
                if (visualizerThemeInfo == null) {
                    return;
                }
                VisualizerDesign.addNewVisualizer(VisualizerDesign.getPrefThemeCustomizationDataOrTemplateData(visualizerThemeInfo.id, null), list, visualizerThemeInfo.id);
            }
        }, this.listenerRefHolder);
        AppPreferences.onStringPreferenceChanged.subscribeWeak(new WeakEvent3.Handler<Integer, String, Boolean>() { // from class: com.daaw.avee.Design.VisualizerDesign.20
            @Override // com.daaw.avee.Common.Events.WeakEvent3.Handler
            public void invoke(Integer num, String str, Boolean bool) {
                VisualizerViewCore visualizerViewCore;
                if (num.equals(Integer.valueOf(AppPreferences.PREF_String_themeCustomizationIndexes))) {
                    VisualizerChooseDialog visualizerChooseDialog = VisualizerChooseDialog.getInstance();
                    if (visualizerChooseDialog != null) {
                        visualizerChooseDialog.requestUpdateVisualizerTemplates();
                    }
                } else if (num.intValue() < AppPreferences.PREF_String_vThemeCustomization16start || num.intValue() > AppPreferences.PREF_String_vThemeCustomization116end || AppPreferences.themeCustomizationIdentifierToPref(AppPreferences.createOrGetInstance().getInt(AppPreferences.PREF_Int_visualizerThemeId)) != num.intValue() || (visualizerViewCore = (VisualizerViewCore) VisualizerDesign.this.visualizerSurfaceView.get()) == null) {
                } else {
                    visualizerViewCore.requestRefreshThemeElementsUiTh();
                }
            }
        }, this.listenerRefHolder);
        VisualizerViewCore.onRequestSelectedSkinThemePreset.subscribeWeak(new WeakEventR.Handler<CustomScene>() { // from class: com.daaw.avee.Design.VisualizerDesign.21
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.daaw.avee.Common.Events.WeakEventR.Handler
            public CustomScene invoke() {
                return VisualizerDesign.getPrefThemeCustomizationDataOrTemplateData(AppPreferences.createOrGetInstance().getInt(AppPreferences.PREF_Int_visualizerThemeId), null);
            }
        }, this.listenerRefHolder);
        VisualizerViewCore.onThemeChanged.subscribeWeak(new WeakEvent.Handler() { // from class: com.daaw.avee.Design.VisualizerDesign.22
            @Override // com.daaw.avee.Common.Events.WeakEvent.Handler
            public void invoke() {
                VisualizerViewCore visualizerViewCore = (VisualizerViewCore) VisualizerDesign.this.visualizerSurfaceView.get();
                if (visualizerViewCore != null) {
                    VisualizerDesign.updateChangesToVisDialogGlTh(visualizerViewCore, false, -1);
                }
            }
        }, this.listenerRefHolder);
        VisualizerViewCore.onRequestTrackDurationInfo.subscribeWeak(new WeakEventR1.Handler<Context, TrackDurationInfo>() { // from class: com.daaw.avee.Design.VisualizerDesign.23
            @Override // com.daaw.avee.Common.Events.WeakEventR1.Handler
            public TrackDurationInfo invoke(Context context) {
                TrackDurationInfo trackDurationInfo = new TrackDurationInfo();
                trackDurationInfo.trackPositionMs = (float) AppDesign.getTrackPositionForRendering();
                trackDurationInfo.durationMs = (float) AppDesign.getTrackDurationForRendering();
                trackDurationInfo.progress = Math.min(trackDurationInfo.trackPositionMs / trackDurationInfo.durationMs, 1.0f);
                trackDurationInfo.progress = Math.max(trackDurationInfo.progress, 0.0f);
                return trackDurationInfo;
            }
        }, this.listenerRefHolder);
        AppDesign.onRequestRenderQualityEdgesValueRealTime.subscribeWeak(new WeakEventR1.Handler<Context, Integer>() { // from class: com.daaw.avee.Design.VisualizerDesign.24
            @Override // com.daaw.avee.Common.Events.WeakEventR1.Handler
            public Integer invoke(Context context) {
                return Integer.valueOf(AppPreferences.createOrGetInstance().preferencesGetBoolSafe(context, "pref_alwaysQualityEdges", false) ? 1 : 0);
            }
        }, this.listenerRefHolder);
        AppDesign.onRequestAudioProcessMultiThreadValueRealTime.subscribeWeak(new WeakEventR1.Handler<Context, Integer>() { // from class: com.daaw.avee.Design.VisualizerDesign.25
            @Override // com.daaw.avee.Common.Events.WeakEventR1.Handler
            public Integer invoke(Context context) {
                return Integer.valueOf(AppPreferences.createOrGetInstance().preferencesGetBoolSafe(context, "pref_enableNewestFeatures", true) ? 1 : 0);
            }
        }, this.listenerRefHolder);
        Fragment2.onRequestShowVideoContentState.subscribeWeak(new WeakEventR.Handler<Boolean>() { // from class: com.daaw.avee.Design.VisualizerDesign.26
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.daaw.avee.Common.Events.WeakEventR.Handler
            public Boolean invoke() {
                return Boolean.valueOf(AppPreferences.createOrGetInstance().getBool(AppPreferences.PREF_Bool_visualPreferShowVideoContent));
            }
        }, this.listenerRefHolder);
        MediaControlsUI.onToggleVideoScalingMode.subscribeWeak(new WeakEvent.Handler() { // from class: com.daaw.avee.Design.VisualizerDesign.27
            @Override // com.daaw.avee.Common.Events.WeakEvent.Handler
            public void invoke() {
                String string;
                int i = AppPreferences.createOrGetInstance().getInt(AppPreferences.PREF_Int_videoScalingMode);
                int i2 = 3;
                if (i == 1) {
                    i2 = 2;
                } else if (i != 2) {
                    i2 = 1;
                }
                AppPreferences.createOrGetInstance().setInt(AppPreferences.PREF_Int_videoScalingMode, i2);
                Context appContext2 = PlayerCore.s().getAppContext();
                if (appContext2 != null) {
                    if (i2 == 1) {
                        string = appContext2.getResources().getString(R.string.video_scaling_fit);
                    } else if (i2 == 2) {
                        string = appContext2.getResources().getString(R.string.video_scaling_crop);
                    } else {
                        string = appContext2.getResources().getString(R.string.video_scaling_stretch);
                    }
                    EventsGlobalTextNotifier.onTextMsg.invoke(string);
                }
            }
        }, this.listenerRefHolder);
        Fragment2.onRequestVideoScalingMode.subscribeWeak(new WeakEventR.Handler<Integer>() { // from class: com.daaw.avee.Design.VisualizerDesign.28
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.daaw.avee.Common.Events.WeakEventR.Handler
            public Integer invoke() {
                return Integer.valueOf(AppPreferences.createOrGetInstance().getInt(AppPreferences.PREF_Int_videoScalingMode));
            }
        }, this.listenerRefHolder);
        MediaControlsUI.onRequestVideoScalingMode.subscribeWeak(new WeakEventR.Handler<Integer>() { // from class: com.daaw.avee.Design.VisualizerDesign.29
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.daaw.avee.Common.Events.WeakEventR.Handler
            public Integer invoke() {
                return Integer.valueOf(AppPreferences.createOrGetInstance().getInt(AppPreferences.PREF_Int_videoScalingMode));
            }
        }, this.listenerRefHolder);
        Fragment2.onRequestVideoWidthHeightRatio.subscribeWeak(new WeakEventR.Handler<Float>() { // from class: com.daaw.avee.Design.VisualizerDesign.30
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.daaw.avee.Common.Events.WeakEventR.Handler
            public Float invoke() {
                VisualizerDesign visualizerDesign = VisualizerDesign.this;
                return Float.valueOf(visualizerDesign.getSurfaceVideoSize(visualizerDesign.videoWidthHeightRatio));
            }
        }, this.listenerRefHolder);
        MediaControlsUI.onToggleVisualPreferShowContent.subscribeWeak(new WeakEvent.Handler() { // from class: com.daaw.avee.Design.VisualizerDesign.31
            @Override // com.daaw.avee.Common.Events.WeakEvent.Handler
            public void invoke() {
                AppPreferences.createOrGetInstance().setInt(AppPreferences.PREF_Int_visualizerThemeId, AppPreferences.createOrGetInstance().getInt(AppPreferences.PREF_Int_visualizerThemeId), true);
                AppPreferences.createOrGetInstance().toggleBool(AppPreferences.PREF_Bool_visualPreferShowVideoContent);
                Context appContext2 = PlayerCore.s().getAppContext();
                if (appContext2 != null) {
                    if (AppPreferences.createOrGetInstance().getBool(AppPreferences.PREF_Bool_visualPreferShowVideoContent)) {
                        EventsGlobalTextNotifier.onTextMsg.invoke(appContext2.getResources().getString(R.string.switched_to_video));
                        return;
                    }
                    EventsGlobalTextNotifier.onTextMsg.invoke(appContext2.getResources().getString(R.string.switched_to_visualizer));
                }
            }
        }, this.listenerRefHolder);
        Fragment2.onVideoSurfaceHolderCreated.subscribeWeak(new WeakEvent1.Handler<SurfaceHolder>() { // from class: com.daaw.avee.Design.VisualizerDesign.32
            @Override // com.daaw.avee.Common.Events.WeakEvent1.Handler
            public void invoke(SurfaceHolder surfaceHolder) {
                VisualizerDesign.this.surfaceHolder = new WeakReference(surfaceHolder);
                EventsPlaybackService.Receive.setVideoSurfaceHolder.invoke(surfaceHolder);
            }
        }, this.listenerRefHolder);
        Fragment2.onVideoSurfaceHolderDestroyed.subscribeWeak(new WeakEvent.Handler() { // from class: com.daaw.avee.Design.VisualizerDesign.33
            @Override // com.daaw.avee.Common.Events.WeakEvent.Handler
            public void invoke() {
                VisualizerDesign.this.surfaceHolder = new WeakReference(null);
            }
        }, this.listenerRefHolder);
        MainActivity.onViewPagerPageSelected.subscribeWeak(new WeakEvent2.Handler<Integer, Activity>() { // from class: com.daaw.avee.Design.VisualizerDesign.34
            @Override // com.daaw.avee.Common.Events.WeakEvent2.Handler
            public void invoke(Integer num, Activity activity) {
                if (num.intValue() == 2) {
                    VisualizerDesign.this.uiNeedShowVisual = true;
                    boolean bool = AppPreferences.createOrGetInstance().getBool(AppPreferences.PREF_Bool_visualPreferShowVideoContent);
                    Fragment2 fragment2Instance = MainActivity.getFragment2Instance();
                    if (fragment2Instance != null) {
                        fragment2Instance.updateSurfaceVisibility(true, bool);
                        return;
                    }
                    return;
                }
                VisualizerDesign.this.uiNeedShowVisual = false;
                boolean bool2 = AppPreferences.createOrGetInstance().getBool(AppPreferences.PREF_Bool_visualPreferShowVideoContent);
                Fragment2 fragment2Instance2 = MainActivity.getFragment2Instance();
                if (fragment2Instance2 != null) {
                    fragment2Instance2.updateSurfaceVisibility(false, bool2);
                }
            }
        }, this.listenerRefHolder);
        Fragment2.onUIComponentNeedChanged.subscribeWeak(new WeakEvent1.Handler<Boolean>() { // from class: com.daaw.avee.Design.VisualizerDesign.35
            @Override // com.daaw.avee.Common.Events.WeakEvent1.Handler
            public void invoke(Boolean bool) {
                VisualizerDesign.this.uiNeedShowVisual = bool.booleanValue();
            }
        }, this.listenerRefHolder);
        Fragment2.onRequestUIComponentNeedChangedValue.subscribeWeak(new WeakEventR.Handler<Boolean>() { // from class: com.daaw.avee.Design.VisualizerDesign.36
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.daaw.avee.Common.Events.WeakEventR.Handler
            public Boolean invoke() {
                return Boolean.valueOf(VisualizerDesign.this.uiNeedShowVisual);
            }
        }, this.listenerRefHolder);
        Fragment2.onVideoElementInteracted.subscribeWeak(new WeakEvent.Handler() { // from class: com.daaw.avee.Design.VisualizerDesign.37
            @Override // com.daaw.avee.Common.Events.WeakEvent.Handler
            public void invoke() {
                MainActivity mainActivity = MainActivity.getInstance();
                if (mainActivity == null || mainActivity.currentFragmentPage != 2) {
                    return;
                }
                mainActivity.toggleShowControls(mainActivity.currentFragmentPage);
            }
        }, this.listenerRefHolder);
        Fragment2.onCustomizeAction.subscribeWeak(new AnonymousClass38(), this.listenerRefHolder);
        CustomizeVisDialog.onDialogShowed.subscribeWeak(new WeakEvent.Handler() { // from class: com.daaw.avee.Design.VisualizerDesign.39
            @Override // com.daaw.avee.Common.Events.WeakEvent.Handler
            public void invoke() {
                MainActivity mainActivity = MainActivity.getInstance();
                if (mainActivity == null || mainActivity.currentFragmentPage != 2) {
                    return;
                }
                mainActivity.showControls(false, mainActivity.currentFragmentPage);
            }
        }, this.listenerRefHolder);
        CustomizeVisDialog.onDialogDismissed.subscribeWeak(new WeakEvent.Handler() { // from class: com.daaw.avee.Design.VisualizerDesign.40
            @Override // com.daaw.avee.Common.Events.WeakEvent.Handler
            public void invoke() {
                MainActivity mainActivity = MainActivity.getInstance();
                if (mainActivity != null && mainActivity.currentFragmentPage == 2) {
                    mainActivity.showControls(true, mainActivity.currentFragmentPage);
                }
                VisualizerDesign.this.selectedSceneElementChanged(-1, false);
            }
        }, this.listenerRefHolder);
        CustomizeVisDialog.onSelectedSceneElementChanged.subscribeWeak(new WeakEvent3.Handler<Integer, Integer, Boolean>() { // from class: com.daaw.avee.Design.VisualizerDesign.41
            @Override // com.daaw.avee.Common.Events.WeakEvent3.Handler
            public void invoke(Integer num, Integer num2, Boolean bool) {
                VisualizerDesign.this.selectedSceneElementChanged(num2, bool.booleanValue());
            }
        }, this.listenerRefHolder);
        CustomizeVisDialog.onResetAction.subscribeWeak(new WeakEvent3.Handler<ContextData, Integer, CustomScene>() { // from class: com.daaw.avee.Design.VisualizerDesign.42
            @Override // com.daaw.avee.Common.Events.WeakEvent3.Handler
            public void invoke(ContextData contextData, Integer num, CustomScene customScene) {
                CustomScene themeObject2;
                if (VisualizerThemes.s().isTemplateIndex(num.intValue())) {
                    themeObject2 = VisualizerThemes.s().getThemeObject2(num.intValue());
                } else {
                    themeObject2 = VisualizerThemes.s().getThemeObject2(customScene.getBasedOnTemplate());
                }
                if (themeObject2 == null) {
                    tlog.w("Can't reset visualizer basedOnTemplate not valid");
                } else {
                    AppPreferences.createOrGetInstance().savePrefThemeCustomizationData(num.intValue(), themeObject2, true);
                }
            }
        }, this.listenerRefHolder);
        CustomizeVisDialog.onCustomizationChanged.subscribeWeak(new WeakEvent4.Handler<Integer, CustomScene, Integer, WeakEvent2<Integer, CustomScene>>() { // from class: com.daaw.avee.Design.VisualizerDesign.43
            @Override // com.daaw.avee.Common.Events.WeakEvent4.Handler
            public void invoke(Integer num, CustomScene customScene, Integer num2, final WeakEvent2<Integer, CustomScene> weakEvent2) {
                VisualizerViewCore visualizerViewCore = (VisualizerViewCore) VisualizerDesign.this.visualizerSurfaceView.get();
                if (visualizerViewCore != null) {
                    visualizerViewCore.setThemeCustomizationDataUiTh(customScene, new Action1<VisualizerViewCore>() { // from class: com.daaw.avee.Design.VisualizerDesign.43.1
                        @Override // com.daaw.avee.Common.Action1
                        public void onInvoke(VisualizerViewCore visualizerViewCore2) {
                            if (weakEvent2 != null) {
                                VisualizerDesign.updateChangesToVisDialogGlTh(visualizerViewCore2, false, -1);
                            }
                        }
                    });
                }
            }
        }, this.listenerRefHolder);
        CustomizeVisDialog.onFinishedCustomizing.subscribeWeak(new WeakEvent3.Handler<Integer, CustomScene, Integer>() { // from class: com.daaw.avee.Design.VisualizerDesign.44
            @Override // com.daaw.avee.Common.Events.WeakEvent3.Handler
            public void invoke(Integer num, CustomScene customScene, Integer num2) {
                AppPreferences.createOrGetInstance().savePrefThemeCustomizationData(num.intValue(), customScene, false);
            }
        }, this.listenerRefHolder);
        CustomizeVisDialog.onImagePropertyPicking.subscribeWeak(new WeakEvent5.Handler<Fragment, TextView, List<String>, String, String>() { // from class: com.daaw.avee.Design.VisualizerDesign.45
            @Override // com.daaw.avee.Common.Events.WeakEvent5.Handler
            public void invoke(Fragment fragment, TextView textView, List<String> list, String str, String str2) {
                if (fragment.getActivity() == null || fragment.getActivity().isFinishing()) {
                    return;
                }
                VisualizerDesign.this.currentPickingTxtValue = new WeakReference(textView);
                VisualizerDesign.this.currentPickingCustomizationData = list;
                VisualizerDesign.this.currentPickingPropertyName = str;
                if (Build.VERSION.SDK_INT < 19) {
                    Intent intent = new Intent();
                    intent.setType("image/*");
                    intent.setAction("android.intent.action.GET_CONTENT");
                    fragment.startActivityForResult(Intent.createChooser(intent, fragment.getResources().getString(R.string.vis_customization_pick_image_title)), 43);
                    return;
                }
                Intent intent2 = new Intent("android.intent.action.OPEN_DOCUMENT");
                intent2.addCategory("android.intent.category.OPENABLE");
                intent2.setType("image/*");
                intent2.setFlags(1);
                fragment.startActivityForResult(intent2, 44);
            }
        }, this.listenerRefHolder);
        CustomizeVisDialog.onActivityResult.subscribeWeak(new WeakEvent3.Handler<CustomizeVisDialog, Integer, Intent>() { // from class: com.daaw.avee.Design.VisualizerDesign.46
            @Override // com.daaw.avee.Common.Events.WeakEvent3.Handler
            public void invoke(CustomizeVisDialog customizeVisDialog, Integer num, Intent intent) {
                if (num.intValue() == 43 || num.intValue() == 44) {
                    int i = customizeVisDialog.rootIdentifier;
                    if (intent == null) {
                        tlog.w("Data is null");
                        return;
                    }
                    Uri data = intent.getData();
                    if (data == null) {
                        tlog.w("originalUri is null");
                        return;
                    }
                    File GetVisualizerFolderFromIdentifier = AppPreferences.GetVisualizerFolderFromIdentifier(i);
                    InputStream inputStream = null;
                    try {
                        inputStream = customizeVisDialog.getActivity().getContentResolver().openInputStream(data);
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                    File SaveFileToLocal = AppPreferences.SaveFileToLocal(GetVisualizerFolderFromIdentifier, inputStream, UtilsFileSys.extractFilenameAdditionalSeperator(data.getPath(), LocalBitmapLoader.Separator));
                    if (SaveFileToLocal != null) {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException e2) {
                                e2.printStackTrace();
                            }
                        }
                        VisualizerDesign visualizerDesign = VisualizerDesign.this;
                        int intValue = num.intValue();
                        visualizerDesign.CustomizeVisDialogOnActivityResult(customizeVisDialog, i, intValue, null, LocalBitmapLoader.Prefix + SaveFileToLocal.getName(), 0);
                        return;
                    }
                    tlog.w("Copy to local folder failed");
                }
            }
        }, this.listenerRefHolder);
        AppPreferences.onIntPreferenceChanged.subscribeWeak(new WeakEvent3.Handler<Integer, Integer, Boolean>() { // from class: com.daaw.avee.Design.VisualizerDesign.47
            @Override // com.daaw.avee.Common.Events.WeakEvent3.Handler
            public void invoke(Integer num, Integer num2, Boolean bool) {
                if (num.intValue() == AppPreferences.PREF_Int_visualizerThemeId && bool.booleanValue()) {
                    int intValue = num2.intValue();
                    VisualizerDesign visualizerDesign = VisualizerDesign.this;
                    visualizerDesign.loadRootElement((VisualizerViewCore) visualizerDesign.visualizerSurfaceView.get(), intValue, false, null);
                } else if (num.intValue() == AppPreferences.PREF_Int_videoScalingMode) {
                    EventsPlaybackService.Receive.setVideoScalingMode.invoke(Integer.valueOf(VisualizerDesign.this.getPlayerbackVideoScalingMode()));
                    Fragment2 fragment2Instance = MainActivity.getFragment2Instance();
                    if (fragment2Instance != null) {
                        VisualizerDesign visualizerDesign2 = VisualizerDesign.this;
                        fragment2Instance.setVideoSize(visualizerDesign2.getSurfaceVideoSize(visualizerDesign2.videoWidthHeightRatio));
                        fragment2Instance.updateVideoScaleMode(num2.intValue());
                    }
                    MediaControlsUI mediaControlsUI = MediaControlsUI.getInstance();
                    if (mediaControlsUI != null) {
                        mediaControlsUI.updateVideoScaleMode(num2.intValue());
                    }
                } else {
                    num.intValue();
                    int i = AppPreferences.PREF_Int_audioVisOffset;
                }
            }
        }, this.listenerRefHolder);
        AppPreferences.onBoolPreferenceChanged.subscribeWeak(new WeakEvent2.Handler<Integer, Boolean>() { // from class: com.daaw.avee.Design.VisualizerDesign.48
            @Override // com.daaw.avee.Common.Events.WeakEvent2.Handler
            public void invoke(Integer num, Boolean bool) {
                Fragment2 fragment2Instance;
                if (num.intValue() != AppPreferences.PREF_Bool_visualPreferShowVideoContent || (fragment2Instance = MainActivity.getFragment2Instance()) == null) {
                    return;
                }
                fragment2Instance.setShowVideoContentState(bool.booleanValue());
            }
        }, this.listenerRefHolder);
        MainActivity.onFullscreenChanged.subscribeWeak(new WeakEvent1.Handler<Boolean>() { // from class: com.daaw.avee.Design.VisualizerDesign.49
            @Override // com.daaw.avee.Common.Events.WeakEvent1.Handler
            public void invoke(Boolean bool) {
                Fragment2 fragment2Instance = MainActivity.getFragment2Instance();
                if (fragment2Instance != null) {
                    fragment2Instance.animateShow(!bool.booleanValue());
                }
            }
        }, this.listenerRefHolder);
        MainActivity.onToolbarAction.subscribeWeak(new WeakEventR2.Handler() { // from class: com.daaw.avee.Design.-$$Lambda$VisualizerDesign$V6vQYbstUlKqXhqkd5pBBQcwMLI
            @Override // com.daaw.avee.Common.Events.WeakEventR2.Handler
            public final Object invoke(Object obj, Object obj2) {
                return VisualizerDesign.lambda$new$0((ContextData) obj, (Integer) obj2);
            }
        }, this.listenerRefHolder);
    }

    /* renamed from: com.daaw.avee.Design.VisualizerDesign$38  reason: invalid class name */
    /* loaded from: classes.dex */
    class AnonymousClass38 implements WeakEvent1.Handler<ContextData> {
        AnonymousClass38() {
        }

        @Override // com.daaw.avee.Common.Events.WeakEvent1.Handler
        public void invoke(final ContextData contextData) {
            final DependencyResourceCounter dependencyResourceCounter = new DependencyResourceCounter();
            final VisualizerViewCore visualizerViewCore = (VisualizerViewCore) VisualizerDesign.this.visualizerSurfaceView.get();
            if (visualizerViewCore != null) {
                visualizerViewCore.queueEvent(new Runnable() { // from class: com.daaw.avee.Design.VisualizerDesign.38.1
                    @Override // java.lang.Runnable
                    public void run() {
                        final int i = AppPreferences.createOrGetInstance().getInt(AppPreferences.PREF_Int_visualizerThemeId);
                        final CustomScene Create = CustomScene.Create();
                        visualizerViewCore.readThemeCustomizationData(Create, dependencyResourceCounter);
                        visualizerViewCore.post(new Runnable() { // from class: com.daaw.avee.Design.VisualizerDesign.38.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                FragmentManager fragmentManager;
                                VisualizerDesign.this.CleanLocalFolderResources(i, dependencyResourceCounter.GetDependencyResourceNamesList());
                                Activity activity = contextData.getActivity();
                                if (activity == null || activity.isFinishing() || (fragmentManager = contextData.getFragmentManager()) == null || CustomizeVisDialog.isShowing(fragmentManager)) {
                                    return;
                                }
                                CustomizeVisDialog.createAndShowCustomizeVisDialog(contextData, Integer.valueOf(i), Create, ElementsFactory.typeNamesAddable);
                            }
                        });
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Boolean lambda$new$0(ContextData contextData, Integer num) {
        int intValue = num.intValue();
        if (intValue == 1) {
            VisualizerChooseDialog.createAndShowDialog(contextData.getActivity());
            return true;
        } else if (intValue == 2) {
            Fragment2.onCustomizeAction.invoke(contextData);
            return true;
        } else if (intValue == 3) {
            Fragment2.onExportAction.invoke(contextData);
            return true;
        } else {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void CustomizeVisDialogOnActivityResult(CustomizeVisDialog customizeVisDialog, int i, int i2, Uri uri, String str, int i3) {
        if (i2 == 43) {
            if (this.currentPickingCustomizationData != null && this.currentPickingPropertyName != null) {
                customizeVisDialog.onImagePropertyValuePicked(this.currentPickingTxtValue.get(), this.currentPickingCustomizationData, this.currentPickingPropertyName, str);
            } else {
                tlog.w("PICK_IMAGE_PROPERTY_REQUEST_CODE invalid data");
            }
        } else if (i2 != 44 || Build.VERSION.SDK_INT < 19) {
        } else {
            if (this.currentPickingCustomizationData != null && this.currentPickingPropertyName != null) {
                if ((i3 & 64) != 0 && uri != null) {
                    tlog.w("offered FLAG_GRANT_PERSISTABLE_URI_PERMISSION");
                    try {
                        customizeVisDialog.getActivity().getContentResolver().takePersistableUriPermission(uri, 1);
                    } catch (Exception e) {
                        WeakEvent1<String> weakEvent1 = EventsGlobalTextNotifier.onTextMsg;
                        weakEvent1.invoke("Error TakePersistableUriPermission " + e.getMessage());
                    }
                }
                try {
                    customizeVisDialog.onImagePropertyValuePicked(this.currentPickingTxtValue.get(), this.currentPickingCustomizationData, this.currentPickingPropertyName, str);
                    return;
                } catch (Exception e2) {
                    WeakEvent1<String> weakEvent12 = EventsGlobalTextNotifier.onTextMsg;
                    weakEvent12.invoke("Error OnImagePropertyValuePicked " + e2.getMessage());
                    return;
                }
            }
            tlog.w("PICK_IMAGE_PROPERTY_REQUEST_CODE_KITKAT invalid data");
        }
    }

    public static void selectThemePreset(int i) {
        AppPreferences.createOrGetInstance().setInt(AppPreferences.PREF_Int_visualizerThemeId, i, true);
        AppPreferences.createOrGetInstance().setBool(AppPreferences.PREF_Bool_visualPreferShowVideoContent, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void selectedSceneElementChanged(Integer num, boolean z) {
        if (z || this.selectedSceneElementId != num.intValue()) {
            this.selectedSceneElementId = num.intValue();
            VisualizerViewCore visualizerViewCore = this.visualizerSurfaceView.get();
            if (visualizerViewCore != null) {
                visualizerViewCore.setTriggerLogoTh(3, num.intValue());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getPlayerbackVideoScalingMode() {
        int i = AppPreferences.createOrGetInstance().getInt(AppPreferences.PREF_Int_videoScalingMode);
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 2;
        }
        if (i == 3) {
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getSurfaceVideoSize(float f) {
        int i = AppPreferences.createOrGetInstance().getInt(AppPreferences.PREF_Int_videoScalingMode);
        if (i == 1) {
            return f;
        }
        if (i == 2 || i == 3) {
            return 0.0f;
        }
        return f;
    }

    private void applyThemeCustomizationData(VisualizerViewCore visualizerViewCore, int i, RootElement rootElement, CustomScene customScene, boolean z) {
        if (customScene == null) {
            if (visualizerViewCore != null) {
                visualizerViewCore.setThemeElementsUiTh(rootElement);
            }
        } else if (rootElement.getVersionId().equals(customScene.getVersionId())) {
            rootElement.setThemeCustomizationData(customScene);
            if (visualizerViewCore != null) {
                visualizerViewCore.setThemeElementsUiTh(rootElement);
            }
        } else {
            tlog.w("visualizer customization, version mismatch");
            if (z) {
                rootElement.setThemeCustomizationData(customScene);
                if (visualizerViewCore != null) {
                    visualizerViewCore.setThemeElementsUiTh(rootElement);
                    return;
                }
                return;
            }
            customScene.setVersionId(rootElement.getVersionId());
            rootElement.setThemeCustomizationData(customScene);
            if (visualizerViewCore != null) {
                visualizerViewCore.setThemeElementsUiTh(rootElement);
            }
            AppPreferences.createOrGetInstance().savePrefThemeCustomizationData(i, customScene, false);
            Context activityContext = PlayerCore.s().getActivityContext();
            if (activityContext != null) {
                new AlertDialog.Builder(activityContext).setMessage(R.string.vis_customization_dialog_ver_mismatch).show();
            }
        }
    }

    public static void applyThemeCustomizationData2(VisualizerViewCore visualizerViewCore, RootElement rootElement, int i, String str, CustomScene customScene, boolean z) {
        if (customScene == null) {
            if (visualizerViewCore != null) {
                visualizerViewCore.setThemeElementsUiTh((CustomScene) null);
            }
        } else if (str.equals(customScene.getVersionId())) {
            if (visualizerViewCore != null) {
                visualizerViewCore.setThemeElementsUiTh(customScene);
            }
            if (rootElement != null) {
                rootElement.setThemeCustomizationData(customScene);
            }
        } else {
            tlog.w("visualizer customization, version mismatch");
            if (z) {
                if (visualizerViewCore != null) {
                    visualizerViewCore.setThemeElementsUiTh(customScene);
                }
                if (rootElement != null) {
                    rootElement.setThemeCustomizationData(customScene);
                    return;
                }
                return;
            }
            customScene.setVersionId(str);
            AppPreferences.createOrGetInstance().savePrefThemeCustomizationData(i, customScene, false);
            Context activityContext = PlayerCore.s().getActivityContext();
            if (activityContext != null) {
                new AlertDialog.Builder(activityContext).setMessage(R.string.vis_customization_dialog_ver_mismatch).show();
            }
            if (visualizerViewCore != null) {
                visualizerViewCore.setThemeElementsUiTh(customScene);
            }
            if (rootElement != null) {
                rootElement.setThemeCustomizationData(customScene);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AudioFrameData getSoundVisualizationData(int i, AudioFrameData audioFrameData) {
        AppPreferences createOrGetInstance = AppPreferences.createOrGetInstance();
        AudioFrameData.Request2 request2 = new AudioFrameData.Request2();
        request2.useGlobalSession = createOrGetInstance.getBool(AppPreferences.PREF_Bool_visualizerUseGlobalSession);
        request2.overridePositionUs = -1L;
        request2.audioChannelCount = 1;
        request2.audioOffsetMs = createOrGetInstance.getInt(AppPreferences.PREF_Int_audioVisOffset);
        request2.samplesCountUs = 0L;
        request2.samplesCount = i;
        return getVisualizationData.invoke(audioFrameData, request2, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean getUseHighQualityBlur() {
        return this.useHighQualityBlur;
    }

    boolean isPlaying() {
        return VisualizerExporterDesign.isExporting() || PlaybackDesign.isPlaying;
    }

    public static void updateChangesToVisDialogGlTh(final VisualizerViewCore visualizerViewCore, final boolean z, final int i) {
        visualizerViewCore.post(new Runnable() { // from class: com.daaw.avee.Design.-$$Lambda$VisualizerDesign$zolF5hibwrWe6ARHB3ugN9kKIGQ
            @Override // java.lang.Runnable
            public final void run() {
                VisualizerDesign.lambda$updateChangesToVisDialogGlTh$3(VisualizerViewCore.this, z, i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$updateChangesToVisDialogGlTh$3(final VisualizerViewCore visualizerViewCore, final boolean z, final int i) {
        final CustomizeVisDialog customizeVisDialog = CustomizeVisDialog.getInstance();
        if (customizeVisDialog != null) {
            final CustomScene Create = CustomScene.Create();
            visualizerViewCore.readThemeCustomizationDataUiTh(Create, new DependencyResourceCounterDuymmy(), new Action1() { // from class: com.daaw.avee.Design.-$$Lambda$VisualizerDesign$bWgYguNfOaf1zULrwGo8o8AgTlc
                @Override // com.daaw.avee.Common.Action1
                public final void onInvoke(Object obj) {
                    VisualizerViewCore visualizerViewCore2 = (VisualizerViewCore) obj;
                    VisualizerViewCore.this.post(new Runnable() { // from class: com.daaw.avee.Design.-$$Lambda$VisualizerDesign$BYkZJjfaeycSUhAV7ZzFgdWA-u8
                        @Override // java.lang.Runnable
                        public final void run() {
                            CustomizeVisDialog.this.onVisualizerCustomizationChanged(r2, r3, r4);
                        }
                    });
                }
            });
        }
    }

    void updateChangesToVisDialogGlTh(CustomScene customScene, boolean z, int i) {
        CustomizeVisDialog customizeVisDialog = CustomizeVisDialog.getInstance();
        if (customizeVisDialog != null) {
            customizeVisDialog.onVisualizerCustomizationChanged(customScene, z, i);
        }
    }

    private String getMeasurePlaceholderValue(String str, VisualizerViewCore visualizerViewCore) {
        if (MeasureDefs.textTimeCurrent.equals(str)) {
            return Utils.getDurationStringHMSS((int) (AppDesign.getTrackPositionForRendering() / 1000));
        }
        if (MeasureDefs.textTimeRemaining.equals(str)) {
            return Utils.getDurationStringHMSS((int) (Math.max(0L, AppDesign.getTrackDurationForRendering() - AppDesign.getTrackPositionForRendering()) / 1000));
        } else if (MeasureDefs.textTimeLength.equals(str)) {
            return Utils.getDurationStringHMSS((int) (AppDesign.getTrackDurationForRendering() / 1000));
        } else {
            if (MeasureDefs.textArtist.equals(str)) {
                PlaylistSong.Data data = PlaybackControlsDesign.fieldsongData;
                return data.isArtistKnown() ? data.artistName : "";
            } else if (MeasureDefs.textArtistOrTitle.equals(str)) {
                PlaylistSong.Data data2 = PlaybackControlsDesign.fieldsongData;
                return data2.isArtistKnown() ? data2.artistName : PlaybackControlsDesign.fieldsongData.trackName;
            } else if (MeasureDefs.textArtistAndTitle.equals(str)) {
                PlaylistSong.Data data3 = PlaybackControlsDesign.fieldsongData;
                if (data3.isArtistKnown()) {
                    return data3.artistName + "\n" + data3.trackName;
                }
                return "\n" + data3.trackName;
            } else if (MeasureDefs.textMarkedArtistAndTitle.equals(str)) {
                PlaylistSong.Data data4 = PlaybackControlsDesign.fieldsongData;
                if (data4.isArtistKnown()) {
                    return "Avee Player\n" + data4.artistName + " - " + data4.trackName;
                }
                return "Avee Player\n" + data4.trackName;
            } else if (MeasureDefs.textTitle.equals(str)) {
                return PlaybackControlsDesign.fieldsongData.trackName;
            } else {
                if (MeasureDefs.textAlbum.equals(str)) {
                    return PlaybackControlsDesign.fieldsongData.albumName;
                }
                if (MeasureDefs.textFps.equals(str)) {
                    return "" + visualizerViewCore.getFrameStats().getFps();
                } else if (MeasureDefs.textFrameTime.equals(str)) {
                    return "" + visualizerViewCore.getFrameTimeMs();
                } else if (MeasureDefs.textStatFlush.equals(str)) {
                    return "" + visualizerViewCore.getFrameStats().getStatFlushCount();
                } else if (MeasureDefs.textWaitResLoad.equals(str)) {
                    return "" + visualizerViewCore.getFrameStats().getFrameResourcesLoadingCount();
                } else if (MeasureDefs.textResLoad.equals(str)) {
                    return "" + visualizerViewCore.getFrameStats().getStatResourceLoadCount();
                } else if (MeasureDefs.textGradualResLoad.equals(str)) {
                    return "" + visualizerViewCore.getFrameStats().getStatGradualResourceLoadCount();
                } else if (MeasureDefs.textRTSwitch.equals(str)) {
                    return "" + visualizerViewCore.getFrameStats().getStatRTSwitchCount();
                } else {
                    return str;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String formatMeasureString(String str, VisualizerViewCore visualizerViewCore) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(32);
        StringBuilder sb2 = null;
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt != '{') {
                if (charAt == '}' && sb2 != null) {
                    sb2.append(charAt);
                    sb.append(getMeasurePlaceholderValue(sb2.toString(), visualizerViewCore));
                    sb2 = null;
                }
                if (sb2 == null) {
                }
            } else if (sb2 != null) {
                sb2 = null;
                if (sb2 == null) {
                    sb2.append(charAt);
                } else {
                    sb.append(charAt);
                }
            } else {
                sb2 = new StringBuilder(16);
                sb2.append(charAt);
            }
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void loadRootElement(VisualizerViewCore visualizerViewCore, int i, boolean z, int[] iArr) {
        loadRootElementWithCustomSecene(visualizerViewCore, null, i, z, getPrefThemeCustomizationDataOrTemplateData(i, iArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void loadRootElementWithCustomSecene(VisualizerViewCore visualizerViewCore, RootElement rootElement, int i, boolean z, CustomScene customScene) {
        applyThemeCustomizationData2(visualizerViewCore, rootElement, i, VisualizerThemes.ACTUAL_ROOT_VERSION, customScene, z);
    }

    public static CustomScene getPrefThemeCustomizationDataOrTemplateData(int i, int[] iArr) {
        CustomScene prefThemeCustomizationData = AppPreferences.createOrGetInstance().getPrefThemeCustomizationData(i, iArr);
        if (prefThemeCustomizationData == null) {
            prefThemeCustomizationData = VisualizerThemes.s().getThemeObject2(i);
            if (prefThemeCustomizationData == null) {
                return null;
            }
            if (iArr != null) {
                iArr[0] = AppPreferences.generateVisualizerCustomizationHash(prefThemeCustomizationData.serialize());
            }
        }
        return prefThemeCustomizationData;
    }

    public static int addNewVisualizer(CustomScene customScene, List<Integer> list, int i) {
        AppPreferences createOrGetInstance = AppPreferences.createOrGetInstance();
        if (customScene == null) {
            return -1;
        }
        int i2 = 0;
        while (true) {
            if (!VisualizerThemes.s().isTemplateIndex(i2) && !list.contains(Integer.valueOf(i2))) {
                break;
            }
            i2++;
        }
        if (AppPreferences.themeCustomizationIdentifierToPref(i2) < 0) {
            Context appContext = PlayerCore.s().getAppContext();
            if (appContext != null) {
                EventsGlobalTextNotifier.onTextMsg.invoke(appContext.getResources().getString(R.string.vis_error_duplicating));
            }
            return -1;
        }
        list.add(Integer.valueOf(i2));
        if (customScene != null && customScene.getBasedOnTemplate() < 0 && i > 0) {
            customScene.setBasedOnTemplate(i);
        }
        if (customScene != null) {
            createOrGetInstance.savePrefThemeCustomizationData(i2, customScene, false);
        }
        createOrGetInstance.setPrefThemeCustomizationIndexes(list);
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void CleanLocalFolderResources(int i, List<String> list) {
        File[] listFiles = AppPreferences.GetVisualizerFolderFromIdentifier(i).listFiles();
        int i2 = -1;
        int i3 = -1;
        for (int i4 = 0; i4 < listFiles.length; i4++) {
            File file = listFiles[i4];
            if (VisualizerSharingDesign.StringContent_FileExtWithDotAlt.equals(UtilsFileSys.extractFilenameExtWithDot(file.getName()))) {
                i3 = i4;
            }
            if (VisualizerSharingDesign.PackedContent_SceneFileName.equals(file.getName())) {
                i2 = i4;
            }
        }
        if (i2 == -1) {
            i2 = i3;
        }
        if (i2 >= 0) {
            listFiles[i2] = null;
        }
        for (int i5 = 0; i5 < listFiles.length; i5++) {
            File file2 = listFiles[i5];
            if (file2 != null) {
                for (String str : list) {
                    if (CompareResourceName(file2.getName(), str)) {
                        listFiles[i5] = null;
                    }
                }
            }
        }
        for (File file3 : listFiles) {
            if (file3 != null) {
                file3.delete();
            }
        }
    }

    boolean CompareResourceName(String str, String str2) {
        if (str2 == null) {
            return false;
        }
        return str.equals(UtilsFileSys.extractFilenameAdditionalSeperator(str2, LocalBitmapLoader.Separator));
    }
}
