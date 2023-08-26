.class public Lcom/daaw/avee/Design/VisualizerDesign;
.super Ljava/lang/Object;
.source "VisualizerDesign.java"


# static fields
.field public static getVisualizationData:Lcom/daaw/avee/Common/Events/WeakDelegateR2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakDelegateR2<",
            "Lcom/daaw/avee/comp/playback/AudioFrameData;",
            "Lcom/daaw/avee/comp/playback/AudioFrameData$Request2;",
            "Lcom/daaw/avee/comp/playback/AudioFrameData;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field cachedPreviewThumbs:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/Integer;",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation
.end field

.field private currentPickingCustomizationData:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private currentPickingPropertyName:Ljava/lang/String;

.field private currentPickingTxtValue:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/widget/TextView;",
            ">;"
        }
    .end annotation
.end field

.field private final handheldMotionLotOfShake:Lcom/daaw/avee/Design/HandheldMotion;

.field private final handheldMotionSmooth:Lcom/daaw/avee/Design/HandheldMotion;

.field private listenerRefHolder:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private mainThreadHandler:Landroid/os/Handler;

.field final randomGenerator:Ljava/util/Random;

.field renderStatePreview:Lcom/daaw/avee/comp/Visualizer/GraphicPreview/RenderStatePreview;

.field private selectedSceneElementId:I

.field private shakePoint:Lcom/daaw/avee/Common/Vec2f;

.field private shakePointSmooth:Lcom/daaw/avee/Common/Vec2f;

.field private volatile surfaceHolder:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/view/SurfaceHolder;",
            ">;"
        }
    .end annotation
.end field

.field private threadHandler:Landroid/os/Handler;

.field private totalFrameTimeWhenPlaying:F

.field private uiNeedShowVisual:Z

.field private useHighQualityBlur:Z

.field private volatile videoWidthHeightRatio:F

.field private visualizerSurfaceView:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 103
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakDelegateR2;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakDelegateR2;-><init>()V

    sput-object v0, Lcom/daaw/avee/Design/VisualizerDesign;->getVisualizationData:Lcom/daaw/avee/Common/Events/WeakDelegateR2;

    return-void
.end method

.method public constructor <init>()V
    .locals 5

    .line 131
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 106
    new-instance v0, Ljava/lang/ref/WeakReference;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/daaw/avee/Design/VisualizerDesign;->surfaceHolder:Ljava/lang/ref/WeakReference;

    .line 107
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/daaw/avee/Design/VisualizerDesign;->visualizerSurfaceView:Ljava/lang/ref/WeakReference;

    const/high16 v0, 0x3f800000    # 1.0f

    .line 108
    iput v0, p0, Lcom/daaw/avee/Design/VisualizerDesign;->videoWidthHeightRatio:F

    const/4 v0, 0x1

    .line 109
    iput-boolean v0, p0, Lcom/daaw/avee/Design/VisualizerDesign;->uiNeedShowVisual:Z

    .line 110
    new-instance v2, Ljava/util/LinkedList;

    invoke-direct {v2}, Ljava/util/LinkedList;-><init>()V

    iput-object v2, p0, Lcom/daaw/avee/Design/VisualizerDesign;->listenerRefHolder:Ljava/util/List;

    .line 111
    new-instance v2, Landroid/os/Handler;

    invoke-direct {v2}, Landroid/os/Handler;-><init>()V

    iput-object v2, p0, Lcom/daaw/avee/Design/VisualizerDesign;->threadHandler:Landroid/os/Handler;

    .line 112
    new-instance v2, Ljava/lang/ref/WeakReference;

    invoke-direct {v2, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v2, p0, Lcom/daaw/avee/Design/VisualizerDesign;->currentPickingTxtValue:Ljava/lang/ref/WeakReference;

    .line 113
    iput-object v1, p0, Lcom/daaw/avee/Design/VisualizerDesign;->currentPickingCustomizationData:Ljava/util/List;

    .line 114
    iput-object v1, p0, Lcom/daaw/avee/Design/VisualizerDesign;->currentPickingPropertyName:Ljava/lang/String;

    const/4 v1, 0x0

    .line 115
    iput-boolean v1, p0, Lcom/daaw/avee/Design/VisualizerDesign;->useHighQualityBlur:Z

    .line 116
    new-instance v2, Ljava/util/Random;

    invoke-direct {v2}, Ljava/util/Random;-><init>()V

    iput-object v2, p0, Lcom/daaw/avee/Design/VisualizerDesign;->randomGenerator:Ljava/util/Random;

    .line 117
    new-instance v2, Landroid/os/Handler;

    invoke-direct {v2}, Landroid/os/Handler;-><init>()V

    iput-object v2, p0, Lcom/daaw/avee/Design/VisualizerDesign;->mainThreadHandler:Landroid/os/Handler;

    .line 118
    new-instance v2, Lcom/daaw/avee/Common/Vec2f;

    const/4 v3, 0x0

    invoke-direct {v2, v3, v3}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    iput-object v2, p0, Lcom/daaw/avee/Design/VisualizerDesign;->shakePoint:Lcom/daaw/avee/Common/Vec2f;

    .line 119
    new-instance v2, Lcom/daaw/avee/Common/Vec2f;

    invoke-direct {v2, v3, v3}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    iput-object v2, p0, Lcom/daaw/avee/Design/VisualizerDesign;->shakePointSmooth:Lcom/daaw/avee/Common/Vec2f;

    .line 120
    iput v3, p0, Lcom/daaw/avee/Design/VisualizerDesign;->totalFrameTimeWhenPlaying:F

    const/4 v2, -0x1

    .line 123
    iput v2, p0, Lcom/daaw/avee/Design/VisualizerDesign;->selectedSceneElementId:I

    .line 125
    new-instance v2, Lcom/daaw/avee/Design/HandheldMotion;

    sget-object v3, Lcom/daaw/avee/Design/HandheldMotion;->Jarles_Presets_MoreMovement_Smoothest:Lcom/daaw/avee/Design/HandheldMotion$Preset;

    invoke-direct {v2, v3}, Lcom/daaw/avee/Design/HandheldMotion;-><init>(Lcom/daaw/avee/Design/HandheldMotion$Preset;)V

    iput-object v2, p0, Lcom/daaw/avee/Design/VisualizerDesign;->handheldMotionSmooth:Lcom/daaw/avee/Design/HandheldMotion;

    .line 126
    new-instance v2, Lcom/daaw/avee/Design/HandheldMotion;

    sget-object v3, Lcom/daaw/avee/Design/HandheldMotion;->Jarles_Presets_LotsOshake:Lcom/daaw/avee/Design/HandheldMotion$Preset;

    invoke-direct {v2, v3}, Lcom/daaw/avee/Design/HandheldMotion;-><init>(Lcom/daaw/avee/Design/HandheldMotion$Preset;)V

    iput-object v2, p0, Lcom/daaw/avee/Design/VisualizerDesign;->handheldMotionLotOfShake:Lcom/daaw/avee/Design/HandheldMotion;

    .line 128
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    iput-object v2, p0, Lcom/daaw/avee/Design/VisualizerDesign;->cachedPreviewThumbs:Ljava/util/HashMap;

    .line 129
    new-instance v2, Lcom/daaw/avee/comp/Visualizer/GraphicPreview/RenderStatePreview;

    invoke-direct {v2}, Lcom/daaw/avee/comp/Visualizer/GraphicPreview/RenderStatePreview;-><init>()V

    iput-object v2, p0, Lcom/daaw/avee/Design/VisualizerDesign;->renderStatePreview:Lcom/daaw/avee/comp/Visualizer/GraphicPreview/RenderStatePreview;

    .line 133
    invoke-static {}, Lcom/daaw/avee/PlayerCore;->s()Lcom/daaw/avee/PlayerCore;

    move-result-object v2

    invoke-virtual {v2}, Lcom/daaw/avee/PlayerCore;->getAppContext()Landroid/content/Context;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 134
    invoke-static {}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->createOrGetInstance()Lcom/daaw/avee/comp/AppPreferences/AppPreferences;

    move-result-object v3

    const-string v4, "pref_highQualityBlur"

    invoke-virtual {v3, v2, v4, v1}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->preferencesGetBoolSafe(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lcom/daaw/avee/Design/VisualizerDesign;->useHighQualityBlur:Z

    .line 136
    sget-object v0, Lcom/daaw/avee/SettingsActivity;->onPrefHighQualityBlurChanged:Lcom/daaw/avee/Common/Events/WeakEvent1;

    new-instance v1, Lcom/daaw/avee/Design/VisualizerDesign$1;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/VisualizerDesign$1;-><init>(Lcom/daaw/avee/Design/VisualizerDesign;)V

    iget-object v3, p0, Lcom/daaw/avee/Design/VisualizerDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v3}, Lcom/daaw/avee/Common/Events/WeakEvent1;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent1$Handler;Ljava/util/List;)V

    .line 143
    sget-object v0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->onDisplayMetaDataStateChanged:Lcom/daaw/avee/Common/Events/WeakEvent4;

    new-instance v1, Lcom/daaw/avee/Design/VisualizerDesign$2;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/VisualizerDesign$2;-><init>(Lcom/daaw/avee/Design/VisualizerDesign;)V

    iget-object v3, p0, Lcom/daaw/avee/Design/VisualizerDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v3}, Lcom/daaw/avee/Common/Events/WeakEvent4;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent4$Handler;Ljava/util/List;)V

    .line 154
    sget-object v0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->onRequestVideoScalingMode:Lcom/daaw/avee/Common/Events/WeakEventR;

    new-instance v1, Lcom/daaw/avee/Design/VisualizerDesign$3;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/VisualizerDesign$3;-><init>(Lcom/daaw/avee/Design/VisualizerDesign;)V

    iget-object v3, p0, Lcom/daaw/avee/Design/VisualizerDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v3}, Lcom/daaw/avee/Common/Events/WeakEventR;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEventR$Handler;Ljava/util/List;)V

    .line 160
    sget-object v0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->onRequestVideoSurfaceHolder:Lcom/daaw/avee/Common/Events/WeakEventR;

    new-instance v1, Lcom/daaw/avee/Design/VisualizerDesign$4;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/VisualizerDesign$4;-><init>(Lcom/daaw/avee/Design/VisualizerDesign;)V

    iget-object v3, p0, Lcom/daaw/avee/Design/VisualizerDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v3}, Lcom/daaw/avee/Common/Events/WeakEventR;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEventR$Handler;Ljava/util/List;)V

    .line 166
    sget-object v0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->onVideoSizeChanged:Lcom/daaw/avee/Common/Events/WeakEvent3;

    new-instance v1, Lcom/daaw/avee/Design/VisualizerDesign$5;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/VisualizerDesign$5;-><init>(Lcom/daaw/avee/Design/VisualizerDesign;)V

    iget-object v3, p0, Lcom/daaw/avee/Design/VisualizerDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v3}, Lcom/daaw/avee/Common/Events/WeakEvent3;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent3$Handler;Ljava/util/List;)V

    .line 183
    sget-object v0, Lcom/daaw/avee/comp/VisualUI/Fragment2;->onSurfaceCreated:Lcom/daaw/avee/Common/Events/WeakEvent1;

    new-instance v1, Lcom/daaw/avee/Design/VisualizerDesign$6;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/VisualizerDesign$6;-><init>(Lcom/daaw/avee/Design/VisualizerDesign;)V

    iget-object v3, p0, Lcom/daaw/avee/Design/VisualizerDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v3}, Lcom/daaw/avee/Common/Events/WeakEvent1;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent1$Handler;Ljava/util/List;)V

    .line 198
    sget-object v0, Lcom/daaw/avee/Design/AppDesign;->onRequestsSoundVisualizationDataRealTime:Lcom/daaw/avee/Common/Events/WeakEventR2;

    new-instance v1, Lcom/daaw/avee/Design/VisualizerDesign$7;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/VisualizerDesign$7;-><init>(Lcom/daaw/avee/Design/VisualizerDesign;)V

    iget-object v3, p0, Lcom/daaw/avee/Design/VisualizerDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v3}, Lcom/daaw/avee/Common/Events/WeakEventR2;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEventR2$Handler;Ljava/util/List;)V

    .line 205
    sget-object v0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->onFrameStart:Lcom/daaw/avee/Common/Events/WeakEvent2;

    new-instance v1, Lcom/daaw/avee/Design/VisualizerDesign$8;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/VisualizerDesign$8;-><init>(Lcom/daaw/avee/Design/VisualizerDesign;)V

    iget-object v3, p0, Lcom/daaw/avee/Design/VisualizerDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v3}, Lcom/daaw/avee/Common/Events/WeakEvent2;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent2$Handler;Ljava/util/List;)V

    .line 240
    sget-object v0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->onRequestMeasureText:Lcom/daaw/avee/Common/Events/WeakEventR2;

    new-instance v1, Lcom/daaw/avee/Design/VisualizerDesign$9;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/VisualizerDesign$9;-><init>(Lcom/daaw/avee/Design/VisualizerDesign;)V

    iget-object v3, p0, Lcom/daaw/avee/Design/VisualizerDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v3}, Lcom/daaw/avee/Common/Events/WeakEventR2;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEventR2$Handler;Ljava/util/List;)V

    .line 251
    sget-object v0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->onRequestMeasureVec2f:Lcom/daaw/avee/Common/Events/WeakEventR5;

    new-instance v1, Lcom/daaw/avee/Design/VisualizerDesign$10;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/VisualizerDesign$10;-><init>(Lcom/daaw/avee/Design/VisualizerDesign;)V

    iget-object v3, p0, Lcom/daaw/avee/Design/VisualizerDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v3}, Lcom/daaw/avee/Common/Events/WeakEventR5;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEventR5$Handler;Ljava/util/List;)V

    .line 420
    sget-object v0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->onRequestsAlbumArtPath:Lcom/daaw/avee/Common/Events/WeakEventR;

    new-instance v1, Lcom/daaw/avee/Design/VisualizerDesign$11;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/VisualizerDesign$11;-><init>(Lcom/daaw/avee/Design/VisualizerDesign;)V

    iget-object v3, p0, Lcom/daaw/avee/Design/VisualizerDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v3}, Lcom/daaw/avee/Common/Events/WeakEventR;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEventR$Handler;Ljava/util/List;)V

    .line 431
    sget-object v0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->onRequestAlbumArtPathAndBitmap:Lcom/daaw/avee/Common/Events/WeakEvent2;

    new-instance v1, Lcom/daaw/avee/Design/VisualizerDesign$12;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/VisualizerDesign$12;-><init>(Lcom/daaw/avee/Design/VisualizerDesign;)V

    iget-object v3, p0, Lcom/daaw/avee/Design/VisualizerDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v3}, Lcom/daaw/avee/Common/Events/WeakEvent2;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent2$Handler;Ljava/util/List;)V

    .line 508
    sget-object v0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->onRequestConvertDpToPx:Lcom/daaw/avee/Common/Events/WeakEventR1;

    new-instance v1, Lcom/daaw/avee/Design/VisualizerDesign$13;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/VisualizerDesign$13;-><init>(Lcom/daaw/avee/Design/VisualizerDesign;)V

    iget-object v3, p0, Lcom/daaw/avee/Design/VisualizerDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v3}, Lcom/daaw/avee/Common/Events/WeakEventR1;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEventR1$Handler;Ljava/util/List;)V

    .line 516
    sget-object v0, Lcom/daaw/avee/comp/VisualUI/VisualizerChooseDialog;->onRequestSkinThemePresetList:Lcom/daaw/avee/Common/Events/WeakEventR1;

    new-instance v1, Lcom/daaw/avee/Design/VisualizerDesign$14;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/VisualizerDesign$14;-><init>(Lcom/daaw/avee/Design/VisualizerDesign;)V

    iget-object v3, p0, Lcom/daaw/avee/Design/VisualizerDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v3}, Lcom/daaw/avee/Common/Events/WeakEventR1;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEventR1$Handler;Ljava/util/List;)V

    .line 554
    sget-object v0, Lcom/daaw/avee/comp/VisualUI/VisualizerChooseDialog;->onRequestVisTemplatePreviewImage:Lcom/daaw/avee/Common/Events/WeakEventR1;

    new-instance v1, Lcom/daaw/avee/Design/VisualizerDesign$15;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/VisualizerDesign$15;-><init>(Lcom/daaw/avee/Design/VisualizerDesign;)V

    iget-object v3, p0, Lcom/daaw/avee/Design/VisualizerDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v3}, Lcom/daaw/avee/Common/Events/WeakEventR1;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEventR1$Handler;Ljava/util/List;)V

    .line 614
    sget-object v0, Lcom/daaw/avee/comp/VisualUI/VisualizerChooseDialog;->onSkinThemePresetSelected:Lcom/daaw/avee/Common/Events/WeakEvent1;

    new-instance v1, Lcom/daaw/avee/Design/VisualizerDesign$16;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/VisualizerDesign$16;-><init>(Lcom/daaw/avee/Design/VisualizerDesign;)V

    iget-object v3, p0, Lcom/daaw/avee/Design/VisualizerDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v3}, Lcom/daaw/avee/Common/Events/WeakEvent1;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent1$Handler;Ljava/util/List;)V

    .line 622
    sget-object v0, Lcom/daaw/avee/comp/VisualUI/VisualizerChooseDialog;->onRemoveVisTemplateAction:Lcom/daaw/avee/Common/Events/WeakEvent1;

    new-instance v1, Lcom/daaw/avee/Design/VisualizerDesign$17;

    invoke-direct {v1, p0, v2}, Lcom/daaw/avee/Design/VisualizerDesign$17;-><init>(Lcom/daaw/avee/Design/VisualizerDesign;Landroid/content/Context;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/VisualizerDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent1;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent1$Handler;Ljava/util/List;)V

    .line 633
    sget-object v0, Lcom/daaw/avee/comp/VisualUI/VisualizerChooseDialog;->onRemoveVisTemplateAction_Long:Lcom/daaw/avee/Common/Events/WeakEvent1;

    new-instance v1, Lcom/daaw/avee/Design/VisualizerDesign$18;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/VisualizerDesign$18;-><init>(Lcom/daaw/avee/Design/VisualizerDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/VisualizerDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent1;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent1$Handler;Ljava/util/List;)V

    .line 660
    sget-object v0, Lcom/daaw/avee/comp/VisualUI/VisualizerChooseDialog;->onDuplicateVisTemplateAction:Lcom/daaw/avee/Common/Events/WeakEvent2;

    new-instance v1, Lcom/daaw/avee/Design/VisualizerDesign$19;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/VisualizerDesign$19;-><init>(Lcom/daaw/avee/Design/VisualizerDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/VisualizerDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent2;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent2$Handler;Ljava/util/List;)V

    .line 673
    sget-object v0, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->onStringPreferenceChanged:Lcom/daaw/avee/Common/Events/WeakEvent3;

    new-instance v1, Lcom/daaw/avee/Design/VisualizerDesign$20;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/VisualizerDesign$20;-><init>(Lcom/daaw/avee/Design/VisualizerDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/VisualizerDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent3;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent3$Handler;Ljava/util/List;)V

    .line 708
    sget-object v0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->onRequestSelectedSkinThemePreset:Lcom/daaw/avee/Common/Events/WeakEventR;

    new-instance v1, Lcom/daaw/avee/Design/VisualizerDesign$21;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/VisualizerDesign$21;-><init>(Lcom/daaw/avee/Design/VisualizerDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/VisualizerDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEventR;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEventR$Handler;Ljava/util/List;)V

    .line 731
    sget-object v0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->onThemeChanged:Lcom/daaw/avee/Common/Events/WeakEvent;

    new-instance v1, Lcom/daaw/avee/Design/VisualizerDesign$22;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/VisualizerDesign$22;-><init>(Lcom/daaw/avee/Design/VisualizerDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/VisualizerDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent$Handler;Ljava/util/List;)V

    .line 743
    sget-object v0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->onRequestTrackDurationInfo:Lcom/daaw/avee/Common/Events/WeakEventR1;

    new-instance v1, Lcom/daaw/avee/Design/VisualizerDesign$23;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/VisualizerDesign$23;-><init>(Lcom/daaw/avee/Design/VisualizerDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/VisualizerDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEventR1;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEventR1$Handler;Ljava/util/List;)V

    .line 762
    sget-object v0, Lcom/daaw/avee/Design/AppDesign;->onRequestRenderQualityEdgesValueRealTime:Lcom/daaw/avee/Common/Events/WeakEventR1;

    new-instance v1, Lcom/daaw/avee/Design/VisualizerDesign$24;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/VisualizerDesign$24;-><init>(Lcom/daaw/avee/Design/VisualizerDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/VisualizerDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEventR1;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEventR1$Handler;Ljava/util/List;)V

    .line 769
    sget-object v0, Lcom/daaw/avee/Design/AppDesign;->onRequestAudioProcessMultiThreadValueRealTime:Lcom/daaw/avee/Common/Events/WeakEventR1;

    new-instance v1, Lcom/daaw/avee/Design/VisualizerDesign$25;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/VisualizerDesign$25;-><init>(Lcom/daaw/avee/Design/VisualizerDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/VisualizerDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEventR1;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEventR1$Handler;Ljava/util/List;)V

    .line 786
    sget-object v0, Lcom/daaw/avee/comp/VisualUI/Fragment2;->onRequestShowVideoContentState:Lcom/daaw/avee/Common/Events/WeakEventR;

    new-instance v1, Lcom/daaw/avee/Design/VisualizerDesign$26;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/VisualizerDesign$26;-><init>(Lcom/daaw/avee/Design/VisualizerDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/VisualizerDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEventR;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEventR$Handler;Ljava/util/List;)V

    .line 793
    sget-object v0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->onToggleVideoScalingMode:Lcom/daaw/avee/Common/Events/WeakEvent;

    new-instance v1, Lcom/daaw/avee/Design/VisualizerDesign$27;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/VisualizerDesign$27;-><init>(Lcom/daaw/avee/Design/VisualizerDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/VisualizerDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent$Handler;Ljava/util/List;)V

    .line 824
    sget-object v0, Lcom/daaw/avee/comp/VisualUI/Fragment2;->onRequestVideoScalingMode:Lcom/daaw/avee/Common/Events/WeakEventR;

    new-instance v1, Lcom/daaw/avee/Design/VisualizerDesign$28;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/VisualizerDesign$28;-><init>(Lcom/daaw/avee/Design/VisualizerDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/VisualizerDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEventR;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEventR$Handler;Ljava/util/List;)V

    .line 831
    sget-object v0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->onRequestVideoScalingMode:Lcom/daaw/avee/Common/Events/WeakEventR;

    new-instance v1, Lcom/daaw/avee/Design/VisualizerDesign$29;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/VisualizerDesign$29;-><init>(Lcom/daaw/avee/Design/VisualizerDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/VisualizerDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEventR;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEventR$Handler;Ljava/util/List;)V

    .line 838
    sget-object v0, Lcom/daaw/avee/comp/VisualUI/Fragment2;->onRequestVideoWidthHeightRatio:Lcom/daaw/avee/Common/Events/WeakEventR;

    new-instance v1, Lcom/daaw/avee/Design/VisualizerDesign$30;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/VisualizerDesign$30;-><init>(Lcom/daaw/avee/Design/VisualizerDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/VisualizerDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEventR;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEventR$Handler;Ljava/util/List;)V

    .line 846
    sget-object v0, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->onToggleVisualPreferShowContent:Lcom/daaw/avee/Common/Events/WeakEvent;

    new-instance v1, Lcom/daaw/avee/Design/VisualizerDesign$31;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/VisualizerDesign$31;-><init>(Lcom/daaw/avee/Design/VisualizerDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/VisualizerDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent$Handler;Ljava/util/List;)V

    .line 869
    sget-object v0, Lcom/daaw/avee/comp/VisualUI/Fragment2;->onVideoSurfaceHolderCreated:Lcom/daaw/avee/Common/Events/WeakEvent1;

    new-instance v1, Lcom/daaw/avee/Design/VisualizerDesign$32;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/VisualizerDesign$32;-><init>(Lcom/daaw/avee/Design/VisualizerDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/VisualizerDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent1;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent1$Handler;Ljava/util/List;)V

    .line 878
    sget-object v0, Lcom/daaw/avee/comp/VisualUI/Fragment2;->onVideoSurfaceHolderDestroyed:Lcom/daaw/avee/Common/Events/WeakEvent;

    new-instance v1, Lcom/daaw/avee/Design/VisualizerDesign$33;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/VisualizerDesign$33;-><init>(Lcom/daaw/avee/Design/VisualizerDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/VisualizerDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent$Handler;Ljava/util/List;)V

    .line 886
    sget-object v0, Lcom/daaw/avee/MainActivity;->onViewPagerPageSelected:Lcom/daaw/avee/Common/Events/WeakEvent2;

    new-instance v1, Lcom/daaw/avee/Design/VisualizerDesign$34;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/VisualizerDesign$34;-><init>(Lcom/daaw/avee/Design/VisualizerDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/VisualizerDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent2;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent2$Handler;Ljava/util/List;)V

    .line 911
    sget-object v0, Lcom/daaw/avee/comp/VisualUI/Fragment2;->onUIComponentNeedChanged:Lcom/daaw/avee/Common/Events/WeakEvent1;

    new-instance v1, Lcom/daaw/avee/Design/VisualizerDesign$35;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/VisualizerDesign$35;-><init>(Lcom/daaw/avee/Design/VisualizerDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/VisualizerDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent1;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent1$Handler;Ljava/util/List;)V

    .line 918
    sget-object v0, Lcom/daaw/avee/comp/VisualUI/Fragment2;->onRequestUIComponentNeedChangedValue:Lcom/daaw/avee/Common/Events/WeakEventR;

    new-instance v1, Lcom/daaw/avee/Design/VisualizerDesign$36;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/VisualizerDesign$36;-><init>(Lcom/daaw/avee/Design/VisualizerDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/VisualizerDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEventR;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEventR$Handler;Ljava/util/List;)V

    .line 925
    sget-object v0, Lcom/daaw/avee/comp/VisualUI/Fragment2;->onVideoElementInteracted:Lcom/daaw/avee/Common/Events/WeakEvent;

    new-instance v1, Lcom/daaw/avee/Design/VisualizerDesign$37;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/VisualizerDesign$37;-><init>(Lcom/daaw/avee/Design/VisualizerDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/VisualizerDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent$Handler;Ljava/util/List;)V

    .line 941
    sget-object v0, Lcom/daaw/avee/comp/VisualUI/Fragment2;->onCustomizeAction:Lcom/daaw/avee/Common/Events/WeakEvent1;

    new-instance v1, Lcom/daaw/avee/Design/VisualizerDesign$38;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/VisualizerDesign$38;-><init>(Lcom/daaw/avee/Design/VisualizerDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/VisualizerDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent1;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent1$Handler;Ljava/util/List;)V

    .line 999
    sget-object v0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;->onDialogShowed:Lcom/daaw/avee/Common/Events/WeakEvent;

    new-instance v1, Lcom/daaw/avee/Design/VisualizerDesign$39;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/VisualizerDesign$39;-><init>(Lcom/daaw/avee/Design/VisualizerDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/VisualizerDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent$Handler;Ljava/util/List;)V

    .line 1012
    sget-object v0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;->onDialogDismissed:Lcom/daaw/avee/Common/Events/WeakEvent;

    new-instance v1, Lcom/daaw/avee/Design/VisualizerDesign$40;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/VisualizerDesign$40;-><init>(Lcom/daaw/avee/Design/VisualizerDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/VisualizerDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent$Handler;Ljava/util/List;)V

    .line 1026
    sget-object v0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;->onSelectedSceneElementChanged:Lcom/daaw/avee/Common/Events/WeakEvent3;

    new-instance v1, Lcom/daaw/avee/Design/VisualizerDesign$41;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/VisualizerDesign$41;-><init>(Lcom/daaw/avee/Design/VisualizerDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/VisualizerDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent3;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent3$Handler;Ljava/util/List;)V

    .line 1044
    sget-object v0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;->onResetAction:Lcom/daaw/avee/Common/Events/WeakEvent3;

    new-instance v1, Lcom/daaw/avee/Design/VisualizerDesign$42;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/VisualizerDesign$42;-><init>(Lcom/daaw/avee/Design/VisualizerDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/VisualizerDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent3;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent3$Handler;Ljava/util/List;)V

    .line 1086
    sget-object v0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;->onCustomizationChanged:Lcom/daaw/avee/Common/Events/WeakEvent4;

    new-instance v1, Lcom/daaw/avee/Design/VisualizerDesign$43;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/VisualizerDesign$43;-><init>(Lcom/daaw/avee/Design/VisualizerDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/VisualizerDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent4;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent4$Handler;Ljava/util/List;)V

    .line 1124
    sget-object v0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;->onFinishedCustomizing:Lcom/daaw/avee/Common/Events/WeakEvent3;

    new-instance v1, Lcom/daaw/avee/Design/VisualizerDesign$44;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/VisualizerDesign$44;-><init>(Lcom/daaw/avee/Design/VisualizerDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/VisualizerDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent3;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent3$Handler;Ljava/util/List;)V

    .line 1131
    sget-object v0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;->onImagePropertyPicking:Lcom/daaw/avee/Common/Events/WeakEvent5;

    new-instance v1, Lcom/daaw/avee/Design/VisualizerDesign$45;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/VisualizerDesign$45;-><init>(Lcom/daaw/avee/Design/VisualizerDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/VisualizerDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent5;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent5$Handler;Ljava/util/List;)V

    .line 1160
    sget-object v0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;->onActivityResult:Lcom/daaw/avee/Common/Events/WeakEvent3;

    new-instance v1, Lcom/daaw/avee/Design/VisualizerDesign$46;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/VisualizerDesign$46;-><init>(Lcom/daaw/avee/Design/VisualizerDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/VisualizerDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent3;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent3$Handler;Ljava/util/List;)V

    .line 1212
    sget-object v0, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->onIntPreferenceChanged:Lcom/daaw/avee/Common/Events/WeakEvent3;

    new-instance v1, Lcom/daaw/avee/Design/VisualizerDesign$47;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/VisualizerDesign$47;-><init>(Lcom/daaw/avee/Design/VisualizerDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/VisualizerDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent3;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent3$Handler;Ljava/util/List;)V

    .line 1243
    sget-object v0, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->onBoolPreferenceChanged:Lcom/daaw/avee/Common/Events/WeakEvent2;

    new-instance v1, Lcom/daaw/avee/Design/VisualizerDesign$48;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/VisualizerDesign$48;-><init>(Lcom/daaw/avee/Design/VisualizerDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/VisualizerDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent2;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent2$Handler;Ljava/util/List;)V

    .line 1256
    sget-object v0, Lcom/daaw/avee/MainActivity;->onFullscreenChanged:Lcom/daaw/avee/Common/Events/WeakEvent1;

    new-instance v1, Lcom/daaw/avee/Design/VisualizerDesign$49;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/VisualizerDesign$49;-><init>(Lcom/daaw/avee/Design/VisualizerDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/VisualizerDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent1;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent1$Handler;Ljava/util/List;)V

    .line 1267
    sget-object v0, Lcom/daaw/avee/MainActivity;->onToolbarAction:Lcom/daaw/avee/Common/Events/WeakEventR2;

    sget-object v1, Lcom/daaw/avee/Design/-$$Lambda$VisualizerDesign$V6vQYbstUlKqXhqkd5pBBQcwMLI;->INSTANCE:Lcom/daaw/avee/Design/-$$Lambda$VisualizerDesign$V6vQYbstUlKqXhqkd5pBBQcwMLI;

    iget-object v2, p0, Lcom/daaw/avee/Design/VisualizerDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEventR2;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEventR2$Handler;Ljava/util/List;)V

    return-void
.end method

.method private CleanLocalFolderResources(ILjava/util/List;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1810
    invoke-static {p1}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->GetVisualizerFolderFromIdentifier(I)Ljava/io/File;

    move-result-object p1

    .line 1811
    invoke-virtual {p1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object p1

    const/4 v0, 0x0

    const/4 v1, -0x1

    const/4 v2, 0x0

    const/4 v3, -0x1

    const/4 v4, -0x1

    .line 1819
    :goto_0
    array-length v5, p1

    if-ge v2, v5, :cond_2

    .line 1820
    aget-object v5, p1, v2

    .line 1822
    invoke-virtual {v5}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/daaw/avee/Common/UtilsFileSys;->extractFilenameExtWithDot(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v7, ".json"

    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    move v4, v2

    .line 1824
    :cond_0
    invoke-virtual {v5}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v5

    const-string v6, "scene.json"

    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    move v3, v2

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    if-ne v3, v1, :cond_3

    move v3, v4

    :cond_3
    const/4 v1, 0x0

    if-ltz v3, :cond_4

    .line 1830
    aput-object v1, p1, v3

    :cond_4
    const/4 v2, 0x0

    .line 1834
    :goto_1
    array-length v3, p1

    if-ge v2, v3, :cond_8

    .line 1836
    aget-object v3, p1, v2

    if-nez v3, :cond_5

    goto :goto_3

    .line 1839
    :cond_5
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_6
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_7

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    .line 1841
    invoke-virtual {v3}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p0, v6, v5}, Lcom/daaw/avee/Design/VisualizerDesign;->CompareResourceName(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_6

    aput-object v1, p1, v2

    goto :goto_2

    :cond_7
    :goto_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 1845
    :cond_8
    :goto_4
    array-length p2, p1

    if-ge v0, p2, :cond_a

    .line 1847
    aget-object p2, p1, v0

    if-nez p2, :cond_9

    goto :goto_5

    .line 1851
    :cond_9
    invoke-virtual {p2}, Ljava/io/File;->delete()Z

    :goto_5
    add-int/lit8 v0, v0, 0x1

    goto :goto_4

    :cond_a
    return-void
.end method

.method private CustomizeVisDialogOnActivityResult(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;IILandroid/net/Uri;Ljava/lang/String;I)V
    .locals 0

    const/16 p2, 0x2b

    if-ne p3, p2, :cond_1

    .line 1292
    iget-object p2, p0, Lcom/daaw/avee/Design/VisualizerDesign;->currentPickingCustomizationData:Ljava/util/List;

    if-eqz p2, :cond_0

    iget-object p2, p0, Lcom/daaw/avee/Design/VisualizerDesign;->currentPickingPropertyName:Ljava/lang/String;

    if-eqz p2, :cond_0

    .line 1293
    iget-object p2, p0, Lcom/daaw/avee/Design/VisualizerDesign;->currentPickingTxtValue:Ljava/lang/ref/WeakReference;

    invoke-virtual {p2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    iget-object p3, p0, Lcom/daaw/avee/Design/VisualizerDesign;->currentPickingCustomizationData:Ljava/util/List;

    iget-object p4, p0, Lcom/daaw/avee/Design/VisualizerDesign;->currentPickingPropertyName:Ljava/lang/String;

    invoke-virtual {p1, p2, p3, p4, p5}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;->onImagePropertyValuePicked(Landroid/widget/TextView;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_1

    :cond_0
    const-string p1, "PICK_IMAGE_PROPERTY_REQUEST_CODE invalid data"

    .line 1295
    invoke-static {p1}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    goto/16 :goto_1

    :cond_1
    const/16 p2, 0x2c

    if-ne p3, p2, :cond_4

    .line 1298
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p3, 0x13

    if-lt p2, p3, :cond_4

    .line 1299
    iget-object p2, p0, Lcom/daaw/avee/Design/VisualizerDesign;->currentPickingCustomizationData:Ljava/util/List;

    if-eqz p2, :cond_3

    iget-object p2, p0, Lcom/daaw/avee/Design/VisualizerDesign;->currentPickingPropertyName:Ljava/lang/String;

    if-eqz p2, :cond_3

    and-int/lit8 p2, p6, 0x40

    if-eqz p2, :cond_2

    if-eqz p4, :cond_2

    const-string p2, "offered FLAG_GRANT_PERSISTABLE_URI_PERMISSION"

    .line 1313
    invoke-static {p2}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    .line 1315
    :try_start_0
    invoke-virtual {p1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;->getActivity()Landroid/app/Activity;

    move-result-object p2

    invoke-virtual {p2}, Landroid/app/Activity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p2

    const/4 p3, 0x1

    invoke-virtual {p2, p4, p3}, Landroid/content/ContentResolver;->takePersistableUriPermission(Landroid/net/Uri;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p2

    .line 1317
    sget-object p3, Lcom/daaw/avee/EventsGlobal/EventsGlobalTextNotifier;->onTextMsg:Lcom/daaw/avee/Common/Events/WeakEvent1;

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    const-string p6, "Error TakePersistableUriPermission "

    invoke-virtual {p4, p6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3, p2}, Lcom/daaw/avee/Common/Events/WeakEvent1;->invoke(Ljava/lang/Object;)V

    .line 1322
    :cond_2
    :goto_0
    :try_start_1
    iget-object p2, p0, Lcom/daaw/avee/Design/VisualizerDesign;->currentPickingTxtValue:Ljava/lang/ref/WeakReference;

    invoke-virtual {p2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    iget-object p3, p0, Lcom/daaw/avee/Design/VisualizerDesign;->currentPickingCustomizationData:Ljava/util/List;

    iget-object p4, p0, Lcom/daaw/avee/Design/VisualizerDesign;->currentPickingPropertyName:Ljava/lang/String;

    invoke-virtual {p1, p2, p3, p4, p5}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;->onImagePropertyValuePicked(Landroid/widget/TextView;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception p1

    .line 1324
    sget-object p2, Lcom/daaw/avee/EventsGlobal/EventsGlobalTextNotifier;->onTextMsg:Lcom/daaw/avee/Common/Events/WeakEvent1;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string p4, "Error OnImagePropertyValuePicked "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/daaw/avee/Common/Events/WeakEvent1;->invoke(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    const-string p1, "PICK_IMAGE_PROPERTY_REQUEST_CODE_KITKAT invalid data"

    .line 1328
    invoke-static {p1}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    :cond_4
    :goto_1
    return-void
.end method

.method static synthetic access$002(Lcom/daaw/avee/Design/VisualizerDesign;Z)Z
    .locals 0

    .line 101
    iput-boolean p1, p0, Lcom/daaw/avee/Design/VisualizerDesign;->useHighQualityBlur:Z

    return p1
.end method

.method static synthetic access$100(Lcom/daaw/avee/Design/VisualizerDesign;)I
    .locals 0

    .line 101
    invoke-direct {p0}, Lcom/daaw/avee/Design/VisualizerDesign;->getPlayerbackVideoScalingMode()I

    move-result p0

    return p0
.end method

.method static synthetic access$1000(Lcom/daaw/avee/Design/VisualizerDesign;)Lcom/daaw/avee/Common/Vec2f;
    .locals 0

    .line 101
    iget-object p0, p0, Lcom/daaw/avee/Design/VisualizerDesign;->shakePointSmooth:Lcom/daaw/avee/Common/Vec2f;

    return-object p0
.end method

.method static synthetic access$1100(Lcom/daaw/avee/Design/VisualizerDesign;Ljava/lang/String;Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;)Ljava/lang/String;
    .locals 0

    .line 101
    invoke-direct {p0, p1, p2}, Lcom/daaw/avee/Design/VisualizerDesign;->formatMeasureString(Ljava/lang/String;Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$1200(Lcom/daaw/avee/Design/VisualizerDesign;)Lcom/daaw/avee/Design/HandheldMotion;
    .locals 0

    .line 101
    iget-object p0, p0, Lcom/daaw/avee/Design/VisualizerDesign;->handheldMotionLotOfShake:Lcom/daaw/avee/Design/HandheldMotion;

    return-object p0
.end method

.method static synthetic access$1300(Lcom/daaw/avee/Design/VisualizerDesign;)Lcom/daaw/avee/Design/HandheldMotion;
    .locals 0

    .line 101
    iget-object p0, p0, Lcom/daaw/avee/Design/VisualizerDesign;->handheldMotionSmooth:Lcom/daaw/avee/Design/HandheldMotion;

    return-object p0
.end method

.method static synthetic access$1400(Lcom/daaw/avee/Design/VisualizerDesign;Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;IZLcom/daaw/avee/comp/Visualizer/CustomScene;)V
    .locals 0

    .line 101
    invoke-direct/range {p0 .. p5}, Lcom/daaw/avee/Design/VisualizerDesign;->loadRootElementWithCustomSecene(Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;IZLcom/daaw/avee/comp/Visualizer/CustomScene;)V

    return-void
.end method

.method static synthetic access$1500(Lcom/daaw/avee/Design/VisualizerDesign;)Z
    .locals 0

    .line 101
    iget-boolean p0, p0, Lcom/daaw/avee/Design/VisualizerDesign;->uiNeedShowVisual:Z

    return p0
.end method

.method static synthetic access$1502(Lcom/daaw/avee/Design/VisualizerDesign;Z)Z
    .locals 0

    .line 101
    iput-boolean p1, p0, Lcom/daaw/avee/Design/VisualizerDesign;->uiNeedShowVisual:Z

    return p1
.end method

.method static synthetic access$1600(Lcom/daaw/avee/Design/VisualizerDesign;ILjava/util/List;)V
    .locals 0

    .line 101
    invoke-direct {p0, p1, p2}, Lcom/daaw/avee/Design/VisualizerDesign;->CleanLocalFolderResources(ILjava/util/List;)V

    return-void
.end method

.method static synthetic access$1700(Lcom/daaw/avee/Design/VisualizerDesign;Ljava/lang/Integer;Z)V
    .locals 0

    .line 101
    invoke-direct {p0, p1, p2}, Lcom/daaw/avee/Design/VisualizerDesign;->selectedSceneElementChanged(Ljava/lang/Integer;Z)V

    return-void
.end method

.method static synthetic access$1802(Lcom/daaw/avee/Design/VisualizerDesign;Ljava/lang/ref/WeakReference;)Ljava/lang/ref/WeakReference;
    .locals 0

    .line 101
    iput-object p1, p0, Lcom/daaw/avee/Design/VisualizerDesign;->currentPickingTxtValue:Ljava/lang/ref/WeakReference;

    return-object p1
.end method

.method static synthetic access$1902(Lcom/daaw/avee/Design/VisualizerDesign;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 101
    iput-object p1, p0, Lcom/daaw/avee/Design/VisualizerDesign;->currentPickingCustomizationData:Ljava/util/List;

    return-object p1
.end method

.method static synthetic access$200(Lcom/daaw/avee/Design/VisualizerDesign;)Ljava/lang/ref/WeakReference;
    .locals 0

    .line 101
    iget-object p0, p0, Lcom/daaw/avee/Design/VisualizerDesign;->surfaceHolder:Ljava/lang/ref/WeakReference;

    return-object p0
.end method

.method static synthetic access$2002(Lcom/daaw/avee/Design/VisualizerDesign;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 101
    iput-object p1, p0, Lcom/daaw/avee/Design/VisualizerDesign;->currentPickingPropertyName:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic access$202(Lcom/daaw/avee/Design/VisualizerDesign;Ljava/lang/ref/WeakReference;)Ljava/lang/ref/WeakReference;
    .locals 0

    .line 101
    iput-object p1, p0, Lcom/daaw/avee/Design/VisualizerDesign;->surfaceHolder:Ljava/lang/ref/WeakReference;

    return-object p1
.end method

.method static synthetic access$2100(Lcom/daaw/avee/Design/VisualizerDesign;Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;IILandroid/net/Uri;Ljava/lang/String;I)V
    .locals 0

    .line 101
    invoke-direct/range {p0 .. p6}, Lcom/daaw/avee/Design/VisualizerDesign;->CustomizeVisDialogOnActivityResult(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;IILandroid/net/Uri;Ljava/lang/String;I)V

    return-void
.end method

.method static synthetic access$2200(Lcom/daaw/avee/Design/VisualizerDesign;Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;IZ[I)V
    .locals 0

    .line 101
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/daaw/avee/Design/VisualizerDesign;->loadRootElement(Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;IZ[I)V

    return-void
.end method

.method static synthetic access$300(Lcom/daaw/avee/Design/VisualizerDesign;)F
    .locals 0

    .line 101
    iget p0, p0, Lcom/daaw/avee/Design/VisualizerDesign;->videoWidthHeightRatio:F

    return p0
.end method

.method static synthetic access$302(Lcom/daaw/avee/Design/VisualizerDesign;F)F
    .locals 0

    .line 101
    iput p1, p0, Lcom/daaw/avee/Design/VisualizerDesign;->videoWidthHeightRatio:F

    return p1
.end method

.method static synthetic access$400(Lcom/daaw/avee/Design/VisualizerDesign;F)F
    .locals 0

    .line 101
    invoke-direct {p0, p1}, Lcom/daaw/avee/Design/VisualizerDesign;->getSurfaceVideoSize(F)F

    move-result p0

    return p0
.end method

.method static synthetic access$500(Lcom/daaw/avee/Design/VisualizerDesign;)Landroid/os/Handler;
    .locals 0

    .line 101
    iget-object p0, p0, Lcom/daaw/avee/Design/VisualizerDesign;->threadHandler:Landroid/os/Handler;

    return-object p0
.end method

.method static synthetic access$600(Lcom/daaw/avee/Design/VisualizerDesign;)Ljava/lang/ref/WeakReference;
    .locals 0

    .line 101
    iget-object p0, p0, Lcom/daaw/avee/Design/VisualizerDesign;->visualizerSurfaceView:Ljava/lang/ref/WeakReference;

    return-object p0
.end method

.method static synthetic access$602(Lcom/daaw/avee/Design/VisualizerDesign;Ljava/lang/ref/WeakReference;)Ljava/lang/ref/WeakReference;
    .locals 0

    .line 101
    iput-object p1, p0, Lcom/daaw/avee/Design/VisualizerDesign;->visualizerSurfaceView:Ljava/lang/ref/WeakReference;

    return-object p1
.end method

.method static synthetic access$700(Lcom/daaw/avee/Design/VisualizerDesign;ILcom/daaw/avee/comp/playback/AudioFrameData;)Lcom/daaw/avee/comp/playback/AudioFrameData;
    .locals 0

    .line 101
    invoke-direct {p0, p1, p2}, Lcom/daaw/avee/Design/VisualizerDesign;->getSoundVisualizationData(ILcom/daaw/avee/comp/playback/AudioFrameData;)Lcom/daaw/avee/comp/playback/AudioFrameData;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$800(Lcom/daaw/avee/Design/VisualizerDesign;)F
    .locals 0

    .line 101
    iget p0, p0, Lcom/daaw/avee/Design/VisualizerDesign;->totalFrameTimeWhenPlaying:F

    return p0
.end method

.method static synthetic access$802(Lcom/daaw/avee/Design/VisualizerDesign;F)F
    .locals 0

    .line 101
    iput p1, p0, Lcom/daaw/avee/Design/VisualizerDesign;->totalFrameTimeWhenPlaying:F

    return p1
.end method

.method static synthetic access$900(Lcom/daaw/avee/Design/VisualizerDesign;)Lcom/daaw/avee/Common/Vec2f;
    .locals 0

    .line 101
    iget-object p0, p0, Lcom/daaw/avee/Design/VisualizerDesign;->shakePoint:Lcom/daaw/avee/Common/Vec2f;

    return-object p0
.end method

.method public static addNewVisualizer(Lcom/daaw/avee/comp/Visualizer/CustomScene;Ljava/util/List;I)I
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/avee/comp/Visualizer/CustomScene;",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;I)I"
        }
    .end annotation

    .line 1769
    invoke-static {}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->createOrGetInstance()Lcom/daaw/avee/comp/AppPreferences/AppPreferences;

    move-result-object v0

    const/4 v1, -0x1

    if-nez p0, :cond_0

    return v1

    :cond_0
    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 1779
    :goto_0
    invoke-static {}, Lcom/daaw/avee/Design/VisualizerThemes;->s()Lcom/daaw/avee/Design/VisualizerThemes;

    move-result-object v4

    invoke-virtual {v4, v3}, Lcom/daaw/avee/Design/VisualizerThemes;->isTemplateIndex(I)Z

    move-result v4

    if-eqz v4, :cond_1

    goto :goto_1

    .line 1780
    :cond_1
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {p1, v4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_6

    .line 1784
    invoke-static {v3}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->themeCustomizationIdentifierToPref(I)I

    move-result v4

    if-gez v4, :cond_3

    .line 1786
    invoke-static {}, Lcom/daaw/avee/PlayerCore;->s()Lcom/daaw/avee/PlayerCore;

    move-result-object p0

    invoke-virtual {p0}, Lcom/daaw/avee/PlayerCore;->getAppContext()Landroid/content/Context;

    move-result-object p0

    if-eqz p0, :cond_2

    .line 1788
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    const p1, 0x7f1001aa

    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p0

    .line 1789
    sget-object p1, Lcom/daaw/avee/EventsGlobal/EventsGlobalTextNotifier;->onTextMsg:Lcom/daaw/avee/Common/Events/WeakEvent1;

    invoke-virtual {p1, p0}, Lcom/daaw/avee/Common/Events/WeakEvent1;->invoke(Ljava/lang/Object;)V

    :cond_2
    return v1

    .line 1794
    :cond_3
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    if-eqz p0, :cond_4

    .line 1796
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/CustomScene;->getBasedOnTemplate()I

    move-result v1

    if-gez v1, :cond_4

    if-lez p2, :cond_4

    .line 1798
    invoke-virtual {p0, p2}, Lcom/daaw/avee/comp/Visualizer/CustomScene;->setBasedOnTemplate(I)V

    :cond_4
    if-eqz p0, :cond_5

    .line 1801
    invoke-virtual {v0, v3, p0, v2}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->savePrefThemeCustomizationData(ILcom/daaw/avee/comp/Visualizer/CustomScene;Z)V

    .line 1802
    :cond_5
    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->setPrefThemeCustomizationIndexes(Ljava/util/List;)V

    return v3

    :cond_6
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0
.end method

.method private applyThemeCustomizationData(Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;ILcom/daaw/avee/comp/Visualizer/Elements/RootElement;Lcom/daaw/avee/comp/Visualizer/CustomScene;Z)V
    .locals 2

    if-nez p4, :cond_1

    if-eqz p1, :cond_0

    .line 1381
    invoke-virtual {p1, p3}, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->setThemeElementsUiTh(Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;)V

    :cond_0
    return-void

    .line 1385
    :cond_1
    invoke-virtual {p3}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->getVersionId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p4}, Lcom/daaw/avee/comp/Visualizer/CustomScene;->getVersionId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1388
    invoke-virtual {p3, p4}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->setThemeCustomizationData(Lcom/daaw/avee/comp/Visualizer/CustomScene;)V

    if-eqz p1, :cond_5

    .line 1390
    invoke-virtual {p1, p3}, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->setThemeElementsUiTh(Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;)V

    goto :goto_0

    :cond_2
    const-string v0, "visualizer customization, version mismatch"

    .line 1393
    invoke-static {v0}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    if-eqz p5, :cond_3

    .line 1407
    invoke-virtual {p3, p4}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->setThemeCustomizationData(Lcom/daaw/avee/comp/Visualizer/CustomScene;)V

    if-eqz p1, :cond_5

    .line 1409
    invoke-virtual {p1, p3}, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->setThemeElementsUiTh(Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;)V

    goto :goto_0

    .line 1415
    :cond_3
    invoke-virtual {p3}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->getVersionId()Ljava/lang/String;

    move-result-object p5

    invoke-virtual {p4, p5}, Lcom/daaw/avee/comp/Visualizer/CustomScene;->setVersionId(Ljava/lang/String;)V

    .line 1418
    invoke-virtual {p3, p4}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->setThemeCustomizationData(Lcom/daaw/avee/comp/Visualizer/CustomScene;)V

    if-eqz p1, :cond_4

    .line 1420
    invoke-virtual {p1, p3}, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->setThemeElementsUiTh(Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;)V

    .line 1423
    :cond_4
    invoke-static {}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->createOrGetInstance()Lcom/daaw/avee/comp/AppPreferences/AppPreferences;

    move-result-object p1

    const/4 p3, 0x0

    invoke-virtual {p1, p2, p4, p3}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->savePrefThemeCustomizationData(ILcom/daaw/avee/comp/Visualizer/CustomScene;Z)V

    .line 1458
    invoke-static {}, Lcom/daaw/avee/PlayerCore;->s()Lcom/daaw/avee/PlayerCore;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/avee/PlayerCore;->getActivityContext()Landroid/content/Context;

    move-result-object p1

    if-eqz p1, :cond_5

    .line 1460
    new-instance p2, Landroid/app/AlertDialog$Builder;

    invoke-direct {p2, p1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const p1, 0x7f10019d

    .line 1461
    invoke-virtual {p2, p1}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    :cond_5
    :goto_0
    return-void
.end method

.method public static applyThemeCustomizationData2(Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;ILjava/lang/String;Lcom/daaw/avee/comp/Visualizer/CustomScene;Z)V
    .locals 1

    if-nez p4, :cond_1

    if-eqz p0, :cond_0

    const/4 p1, 0x0

    .line 1474
    check-cast p1, Lcom/daaw/avee/comp/Visualizer/CustomScene;

    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->setThemeElementsUiTh(Lcom/daaw/avee/comp/Visualizer/CustomScene;)V

    :cond_0
    return-void

    .line 1478
    :cond_1
    invoke-virtual {p4}, Lcom/daaw/avee/comp/Visualizer/CustomScene;->getVersionId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    if-eqz p0, :cond_2

    .line 1481
    invoke-virtual {p0, p4}, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->setThemeElementsUiTh(Lcom/daaw/avee/comp/Visualizer/CustomScene;)V

    :cond_2
    if-eqz p1, :cond_8

    .line 1483
    invoke-virtual {p1, p4}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->setThemeCustomizationData(Lcom/daaw/avee/comp/Visualizer/CustomScene;)V

    goto :goto_0

    :cond_3
    const-string v0, "visualizer customization, version mismatch"

    .line 1486
    invoke-static {v0}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    if-eqz p5, :cond_5

    if-eqz p0, :cond_4

    .line 1492
    invoke-virtual {p0, p4}, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->setThemeElementsUiTh(Lcom/daaw/avee/comp/Visualizer/CustomScene;)V

    :cond_4
    if-eqz p1, :cond_8

    .line 1494
    invoke-virtual {p1, p4}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->setThemeCustomizationData(Lcom/daaw/avee/comp/Visualizer/CustomScene;)V

    goto :goto_0

    .line 1500
    :cond_5
    invoke-virtual {p4, p3}, Lcom/daaw/avee/comp/Visualizer/CustomScene;->setVersionId(Ljava/lang/String;)V

    .line 1503
    invoke-static {}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->createOrGetInstance()Lcom/daaw/avee/comp/AppPreferences/AppPreferences;

    move-result-object p3

    const/4 p5, 0x0

    invoke-virtual {p3, p2, p4, p5}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->savePrefThemeCustomizationData(ILcom/daaw/avee/comp/Visualizer/CustomScene;Z)V

    .line 1505
    invoke-static {}, Lcom/daaw/avee/PlayerCore;->s()Lcom/daaw/avee/PlayerCore;

    move-result-object p2

    invoke-virtual {p2}, Lcom/daaw/avee/PlayerCore;->getActivityContext()Landroid/content/Context;

    move-result-object p2

    if-eqz p2, :cond_6

    .line 1507
    new-instance p3, Landroid/app/AlertDialog$Builder;

    invoke-direct {p3, p2}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const p2, 0x7f10019d

    .line 1508
    invoke-virtual {p3, p2}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;

    move-result-object p2

    invoke-virtual {p2}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    :cond_6
    if-eqz p0, :cond_7

    .line 1513
    invoke-virtual {p0, p4}, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->setThemeElementsUiTh(Lcom/daaw/avee/comp/Visualizer/CustomScene;)V

    :cond_7
    if-eqz p1, :cond_8

    .line 1515
    invoke-virtual {p1, p4}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->setThemeCustomizationData(Lcom/daaw/avee/comp/Visualizer/CustomScene;)V

    :cond_8
    :goto_0
    return-void
.end method

.method private formatMeasureString(Ljava/lang/String;Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;)Ljava/lang/String;
    .locals 7

    .line 1674
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    .line 1680
    new-instance v1, Ljava/lang/StringBuilder;

    const/16 v2, 0x20

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v4, v2

    :goto_0
    if-ge v3, v0, :cond_4

    .line 1684
    invoke-virtual {p1, v3}, Ljava/lang/String;->charAt(I)C

    move-result v5

    const/16 v6, 0x7b

    if-ne v5, v6, :cond_1

    if-eqz v4, :cond_0

    move-object v4, v2

    goto :goto_1

    .line 1692
    :cond_0
    new-instance v4, Ljava/lang/StringBuilder;

    const/16 v6, 0x10

    invoke-direct {v4, v6}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 1693
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_2

    :cond_1
    const/16 v6, 0x7d

    if-ne v5, v6, :cond_2

    if-eqz v4, :cond_2

    .line 1697
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1698
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {p0, v4, p2}, Lcom/daaw/avee/Design/VisualizerDesign;->getMeasurePlaceholderValue(Ljava/lang/String;Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object v4, v2

    goto :goto_2

    :cond_2
    :goto_1
    if-eqz v4, :cond_3

    .line 1704
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_2

    .line 1706
    :cond_3
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :goto_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 1710
    :cond_4
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private getMeasurePlaceholderValue(Ljava/lang/String;Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;)Ljava/lang/String;
    .locals 7

    const-string v0, "{TimeCurrent}"

    .line 1620
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const-wide/16 v1, 0x3e8

    if-eqz v0, :cond_0

    .line 1621
    invoke-static {}, Lcom/daaw/avee/Design/AppDesign;->getTrackPositionForRendering()J

    move-result-wide p1

    .line 1622
    div-long/2addr p1, v1

    long-to-int p2, p1

    invoke-static {p2}, Lcom/daaw/avee/Common/Utils;->getDurationStringHMSS(I)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    const-string v0, "{TimeRemaining}"

    .line 1623
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1624
    invoke-static {}, Lcom/daaw/avee/Design/AppDesign;->getTrackPositionForRendering()J

    move-result-wide p1

    .line 1625
    invoke-static {}, Lcom/daaw/avee/Design/AppDesign;->getTrackDurationForRendering()J

    move-result-wide v3

    const-wide/16 v5, 0x0

    sub-long/2addr v3, p1

    .line 1626
    invoke-static {v5, v6, v3, v4}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p1

    div-long/2addr p1, v1

    long-to-int p2, p1

    invoke-static {p2}, Lcom/daaw/avee/Common/Utils;->getDurationStringHMSS(I)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_1
    const-string v0, "{TimeLength}"

    .line 1627
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1628
    invoke-static {}, Lcom/daaw/avee/Design/AppDesign;->getTrackDurationForRendering()J

    move-result-wide p1

    .line 1629
    div-long/2addr p1, v1

    long-to-int p2, p1

    invoke-static {p2}, Lcom/daaw/avee/Common/Utils;->getDurationStringHMSS(I)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_2
    const-string v0, "{Artist}"

    .line 1630
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const-string v1, ""

    if-eqz v0, :cond_4

    .line 1631
    sget-object p1, Lcom/daaw/avee/Design/PlaybackControlsDesign;->fieldsongData:Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;

    .line 1632
    invoke-virtual {p1}, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->isArtistKnown()Z

    move-result p2

    if-eqz p2, :cond_3

    iget-object v1, p1, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->artistName:Ljava/lang/String;

    :cond_3
    return-object v1

    :cond_4
    const-string v0, "{ArtistOrTitle}"

    .line 1633
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 1634
    sget-object p1, Lcom/daaw/avee/Design/PlaybackControlsDesign;->fieldsongData:Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;

    .line 1635
    invoke-virtual {p1}, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->isArtistKnown()Z

    move-result p2

    if-eqz p2, :cond_5

    iget-object p1, p1, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->artistName:Ljava/lang/String;

    goto :goto_0

    :cond_5
    sget-object p1, Lcom/daaw/avee/Design/PlaybackControlsDesign;->fieldsongData:Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;

    iget-object p1, p1, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->trackName:Ljava/lang/String;

    :goto_0
    return-object p1

    :cond_6
    const-string v0, "{ArtistAndTitle}"

    .line 1636
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 1637
    sget-object p1, Lcom/daaw/avee/Design/PlaybackControlsDesign;->fieldsongData:Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;

    .line 1638
    invoke-virtual {p1}, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->isArtistKnown()Z

    move-result p2

    const-string v0, "\n"

    if-eqz p2, :cond_7

    .line 1639
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p1, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->artistName:Ljava/lang/String;

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p1, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->trackName:Ljava/lang/String;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 1641
    :cond_7
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p1, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->trackName:Ljava/lang/String;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_8
    const-string v0, "{MarkedArtistAndTitle}"

    .line 1643
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 1644
    sget-object p1, Lcom/daaw/avee/Design/PlaybackControlsDesign;->fieldsongData:Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;

    .line 1645
    invoke-virtual {p1}, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->isArtistKnown()Z

    move-result p2

    const-string v0, "Avee Player\n"

    if-eqz p2, :cond_9

    .line 1646
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p1, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->artistName:Ljava/lang/String;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " - "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p1, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->trackName:Ljava/lang/String;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 1648
    :cond_9
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p1, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->trackName:Ljava/lang/String;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_a
    const-string v0, "{Title}"

    .line 1650
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 1651
    sget-object p1, Lcom/daaw/avee/Design/PlaybackControlsDesign;->fieldsongData:Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;

    iget-object p1, p1, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->trackName:Ljava/lang/String;

    return-object p1

    :cond_b
    const-string v0, "{Album}"

    .line 1652
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_c

    .line 1653
    sget-object p1, Lcom/daaw/avee/Design/PlaybackControlsDesign;->fieldsongData:Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;

    iget-object p1, p1, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->albumName:Ljava/lang/String;

    return-object p1

    :cond_c
    const-string v0, "{Fps}"

    .line 1654
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_d

    .line 1655
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->getFrameStats()Lcom/daaw/avee/comp/Visualizer/FrameStats;

    move-result-object p2

    invoke-virtual {p2}, Lcom/daaw/avee/comp/Visualizer/FrameStats;->getFps()I

    move-result p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_d
    const-string v0, "{FrameTime}"

    .line 1656
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_e

    .line 1657
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->getFrameTimeMs()I

    move-result p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_e
    const-string v0, "{StatFlush}"

    .line 1658
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_f

    .line 1659
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->getFrameStats()Lcom/daaw/avee/comp/Visualizer/FrameStats;

    move-result-object p2

    invoke-virtual {p2}, Lcom/daaw/avee/comp/Visualizer/FrameStats;->getStatFlushCount()I

    move-result p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_f
    const-string v0, "{WaitResLoad}"

    .line 1660
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_10

    .line 1661
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->getFrameStats()Lcom/daaw/avee/comp/Visualizer/FrameStats;

    move-result-object p2

    invoke-virtual {p2}, Lcom/daaw/avee/comp/Visualizer/FrameStats;->getFrameResourcesLoadingCount()I

    move-result p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_10
    const-string v0, "{ResLoad}"

    .line 1662
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_11

    .line 1663
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->getFrameStats()Lcom/daaw/avee/comp/Visualizer/FrameStats;

    move-result-object p2

    invoke-virtual {p2}, Lcom/daaw/avee/comp/Visualizer/FrameStats;->getStatResourceLoadCount()I

    move-result p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_11
    const-string v0, "{GradualResLoad}"

    .line 1664
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_12

    .line 1665
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->getFrameStats()Lcom/daaw/avee/comp/Visualizer/FrameStats;

    move-result-object p2

    invoke-virtual {p2}, Lcom/daaw/avee/comp/Visualizer/FrameStats;->getStatGradualResourceLoadCount()I

    move-result p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_12
    const-string v0, "{RTSwitch}"

    .line 1666
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_13

    .line 1667
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->getFrameStats()Lcom/daaw/avee/comp/Visualizer/FrameStats;

    move-result-object p2

    invoke-virtual {p2}, Lcom/daaw/avee/comp/Visualizer/FrameStats;->getStatRTSwitchCount()I

    move-result p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :cond_13
    return-object p1
.end method

.method private getPlayerbackVideoScalingMode()I
    .locals 3

    .line 1353
    invoke-static {}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->createOrGetInstance()Lcom/daaw/avee/comp/AppPreferences/AppPreferences;

    move-result-object v0

    sget v1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Int_videoScalingMode:I

    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->getInt(I)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v2, 0x2

    if-ne v0, v2, :cond_1

    return v2

    :cond_1
    const/4 v2, 0x3

    if-ne v0, v2, :cond_2

    :cond_2
    return v1
.end method

.method public static getPrefThemeCustomizationDataOrTemplateData(I[I)Lcom/daaw/avee/comp/Visualizer/CustomScene;
    .locals 2

    .line 1750
    invoke-static {}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->createOrGetInstance()Lcom/daaw/avee/comp/AppPreferences/AppPreferences;

    move-result-object v0

    invoke-virtual {v0, p0, p1}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->getPrefThemeCustomizationData(I[I)Lcom/daaw/avee/comp/Visualizer/CustomScene;

    move-result-object v0

    if-nez v0, :cond_1

    .line 1758
    invoke-static {}, Lcom/daaw/avee/Design/VisualizerThemes;->s()Lcom/daaw/avee/Design/VisualizerThemes;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/daaw/avee/Design/VisualizerThemes;->getThemeObject2(I)Lcom/daaw/avee/comp/Visualizer/CustomScene;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    if-eqz p1, :cond_1

    const/4 p0, 0x0

    .line 1761
    invoke-virtual {v0}, Lcom/daaw/avee/comp/Visualizer/CustomScene;->serialize()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->generateVisualizerCustomizationHash(Ljava/lang/String;)I

    move-result v1

    aput v1, p1, p0

    :cond_1
    return-object v0
.end method

.method private getSoundVisualizationData(ILcom/daaw/avee/comp/playback/AudioFrameData;)Lcom/daaw/avee/comp/playback/AudioFrameData;
    .locals 4

    .line 1524
    invoke-static {}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->createOrGetInstance()Lcom/daaw/avee/comp/AppPreferences/AppPreferences;

    move-result-object v0

    .line 1525
    new-instance v1, Lcom/daaw/avee/comp/playback/AudioFrameData$Request2;

    invoke-direct {v1}, Lcom/daaw/avee/comp/playback/AudioFrameData$Request2;-><init>()V

    .line 1526
    sget v2, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Bool_visualizerUseGlobalSession:I

    invoke-virtual {v0, v2}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->getBool(I)Z

    move-result v2

    iput-boolean v2, v1, Lcom/daaw/avee/comp/playback/AudioFrameData$Request2;->useGlobalSession:Z

    const-wide/16 v2, -0x1

    .line 1527
    iput-wide v2, v1, Lcom/daaw/avee/comp/playback/AudioFrameData$Request2;->overridePositionUs:J

    const/4 v2, 0x1

    .line 1528
    iput v2, v1, Lcom/daaw/avee/comp/playback/AudioFrameData$Request2;->audioChannelCount:I

    .line 1529
    sget v2, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Int_audioVisOffset:I

    invoke-virtual {v0, v2}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->getInt(I)I

    move-result v0

    iput v0, v1, Lcom/daaw/avee/comp/playback/AudioFrameData$Request2;->audioOffsetMs:I

    const-wide/16 v2, 0x0

    .line 1530
    iput-wide v2, v1, Lcom/daaw/avee/comp/playback/AudioFrameData$Request2;->samplesCountUs:J

    .line 1531
    iput p1, v1, Lcom/daaw/avee/comp/playback/AudioFrameData$Request2;->samplesCount:I

    .line 1533
    sget-object p1, Lcom/daaw/avee/Design/VisualizerDesign;->getVisualizationData:Lcom/daaw/avee/Common/Events/WeakDelegateR2;

    const/4 v0, 0x0

    invoke-virtual {p1, p2, v1, v0}, Lcom/daaw/avee/Common/Events/WeakDelegateR2;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/avee/comp/playback/AudioFrameData;

    return-object p1
.end method

.method private getSurfaceVideoSize(F)F
    .locals 3

    .line 1366
    invoke-static {}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->createOrGetInstance()Lcom/daaw/avee/comp/AppPreferences/AppPreferences;

    move-result-object v0

    sget v1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Int_videoScalingMode:I

    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->getInt(I)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return p1

    :cond_0
    const/4 v1, 0x2

    const/4 v2, 0x0

    if-ne v0, v1, :cond_1

    return v2

    :cond_1
    const/4 v1, 0x3

    if-ne v0, v1, :cond_2

    return v2

    :cond_2
    return p1
.end method

.method static synthetic lambda$new$0(Lcom/daaw/avee/ContextData;Ljava/lang/Integer;)Ljava/lang/Boolean;
    .locals 2

    .line 1269
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_2

    const/4 v1, 0x2

    if-eq p1, v1, :cond_1

    const/4 v1, 0x3

    if-eq p1, v1, :cond_0

    .line 1282
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0

    .line 1279
    :cond_0
    sget-object p1, Lcom/daaw/avee/comp/VisualUI/Fragment2;->onExportAction:Lcom/daaw/avee/Common/Events/WeakEvent1;

    invoke-virtual {p1, p0}, Lcom/daaw/avee/Common/Events/WeakEvent1;->invoke(Ljava/lang/Object;)V

    .line 1280
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0

    .line 1276
    :cond_1
    sget-object p1, Lcom/daaw/avee/comp/VisualUI/Fragment2;->onCustomizeAction:Lcom/daaw/avee/Common/Events/WeakEvent1;

    invoke-virtual {p1, p0}, Lcom/daaw/avee/Common/Events/WeakEvent1;->invoke(Ljava/lang/Object;)V

    .line 1277
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0

    .line 1272
    :cond_2
    invoke-virtual {p0}, Lcom/daaw/avee/ContextData;->getActivity()Landroid/app/Activity;

    move-result-object p0

    .line 1273
    invoke-static {p0}, Lcom/daaw/avee/comp/VisualUI/VisualizerChooseDialog;->createAndShowDialog(Landroid/app/Activity;)Lcom/daaw/avee/comp/VisualUI/VisualizerChooseDialog;

    .line 1274
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method static synthetic lambda$null$1(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;Lcom/daaw/avee/comp/Visualizer/CustomScene;ZI)V
    .locals 0

    .line 1594
    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;->onVisualizerCustomizationChanged(Lcom/daaw/avee/comp/Visualizer/CustomScene;ZI)V

    return-void
.end method

.method static synthetic lambda$null$2(Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;Lcom/daaw/avee/comp/Visualizer/CustomScene;ZILcom/daaw/avee/comp/Visualizer/VisualizerViewCore;)V
    .locals 0

    .line 1591
    new-instance p5, Lcom/daaw/avee/Design/-$$Lambda$VisualizerDesign$BYkZJjfaeycSUhAV7ZzFgdWA-u8;

    invoke-direct {p5, p1, p2, p3, p4}, Lcom/daaw/avee/Design/-$$Lambda$VisualizerDesign$BYkZJjfaeycSUhAV7ZzFgdWA-u8;-><init>(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;Lcom/daaw/avee/comp/Visualizer/CustomScene;ZI)V

    invoke-virtual {p0, p5}, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method static synthetic lambda$updateChangesToVisDialogGlTh$3(Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;ZI)V
    .locals 9

    .line 1583
    invoke-static {}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;->getInstance()Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 1586
    invoke-static {}, Lcom/daaw/avee/comp/Visualizer/CustomScene;->Create()Lcom/daaw/avee/comp/Visualizer/CustomScene;

    move-result-object v6

    .line 1587
    new-instance v7, Lcom/daaw/avee/comp/Visualizer/DependencyResourceCounterDuymmy;

    invoke-direct {v7}, Lcom/daaw/avee/comp/Visualizer/DependencyResourceCounterDuymmy;-><init>()V

    new-instance v8, Lcom/daaw/avee/Design/-$$Lambda$VisualizerDesign$bWgYguNfOaf1zULrwGo8o8AgTlc;

    move-object v0, v8

    move-object v1, p0

    move-object v3, v6

    move v4, p1

    move v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/daaw/avee/Design/-$$Lambda$VisualizerDesign$bWgYguNfOaf1zULrwGo8o8AgTlc;-><init>(Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;Lcom/daaw/avee/comp/Visualizer/CustomScene;ZI)V

    invoke-virtual {p0, v6, v7, v8}, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->readThemeCustomizationDataUiTh(Lcom/daaw/avee/comp/Visualizer/CustomScene;Lcom/daaw/avee/comp/Visualizer/IDependencyResourceCounter;Lcom/daaw/avee/Common/Action1;)V

    :cond_0
    return-void
.end method

.method private loadRootElement(Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;IZ[I)V
    .locals 6

    .line 1722
    invoke-static {p2, p4}, Lcom/daaw/avee/Design/VisualizerDesign;->getPrefThemeCustomizationDataOrTemplateData(I[I)Lcom/daaw/avee/comp/Visualizer/CustomScene;

    move-result-object v5

    const/4 v2, 0x0

    move-object v0, p0

    move-object v1, p1

    move v3, p2

    move v4, p3

    .line 1723
    invoke-direct/range {v0 .. v5}, Lcom/daaw/avee/Design/VisualizerDesign;->loadRootElementWithCustomSecene(Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;IZLcom/daaw/avee/comp/Visualizer/CustomScene;)V

    return-void
.end method

.method private loadRootElementWithCustomSecene(Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;IZLcom/daaw/avee/comp/Visualizer/CustomScene;)V
    .locals 6

    .line 1729
    sget-object v3, Lcom/daaw/avee/Design/VisualizerThemes;->ACTUAL_ROOT_VERSION:Ljava/lang/String;

    move-object v0, p1

    move-object v1, p2

    move v2, p3

    move-object v4, p5

    move v5, p4

    invoke-static/range {v0 .. v5}, Lcom/daaw/avee/Design/VisualizerDesign;->applyThemeCustomizationData2(Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;ILjava/lang/String;Lcom/daaw/avee/comp/Visualizer/CustomScene;Z)V

    return-void
.end method

.method public static selectThemePreset(I)V
    .locals 3

    .line 1340
    invoke-static {}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->createOrGetInstance()Lcom/daaw/avee/comp/AppPreferences/AppPreferences;

    move-result-object v0

    sget v1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Int_visualizerThemeId:I

    const/4 v2, 0x1

    invoke-virtual {v0, v1, p0, v2}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->setInt(IIZ)V

    .line 1341
    invoke-static {}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->createOrGetInstance()Lcom/daaw/avee/comp/AppPreferences/AppPreferences;

    move-result-object p0

    sget v0, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Bool_visualPreferShowVideoContent:I

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->setBool(IZ)V

    return-void
.end method

.method private selectedSceneElementChanged(Ljava/lang/Integer;Z)V
    .locals 1

    if-nez p2, :cond_0

    .line 1345
    iget p2, p0, Lcom/daaw/avee/Design/VisualizerDesign;->selectedSceneElementId:I

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-ne p2, v0, :cond_0

    return-void

    .line 1346
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iput p2, p0, Lcom/daaw/avee/Design/VisualizerDesign;->selectedSceneElementId:I

    .line 1348
    iget-object p2, p0, Lcom/daaw/avee/Design/VisualizerDesign;->visualizerSurfaceView:Ljava/lang/ref/WeakReference;

    invoke-virtual {p2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;

    if-eqz p2, :cond_1

    const/4 v0, 0x3

    .line 1349
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p2, v0, p1}, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->setTriggerLogoTh(II)V

    :cond_1
    return-void
.end method

.method public static updateChangesToVisDialogGlTh(Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;ZI)V
    .locals 1

    .line 1578
    new-instance v0, Lcom/daaw/avee/Design/-$$Lambda$VisualizerDesign$zolF5hibwrWe6ARHB3ugN9kKIGQ;

    invoke-direct {v0, p0, p1, p2}, Lcom/daaw/avee/Design/-$$Lambda$VisualizerDesign$zolF5hibwrWe6ARHB3ugN9kKIGQ;-><init>(Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;ZI)V

    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->post(Ljava/lang/Runnable;)Z

    return-void
.end method


# virtual methods
.method CompareResourceName(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 1

    if-nez p2, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    const/16 v0, 0x3a

    .line 1860
    invoke-static {p2, v0}, Lcom/daaw/avee/Common/UtilsFileSys;->extractFilenameAdditionalSeperator(Ljava/lang/String;C)Ljava/lang/String;

    move-result-object p2

    .line 1862
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method getUseHighQualityBlur()Z
    .locals 1

    .line 1539
    iget-boolean v0, p0, Lcom/daaw/avee/Design/VisualizerDesign;->useHighQualityBlur:Z

    return v0
.end method

.method isPlaying()Z
    .locals 1

    .line 1544
    invoke-static {}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->isExporting()Z

    move-result v0

    if-nez v0, :cond_1

    sget-boolean v0, Lcom/daaw/avee/Design/PlaybackDesign;->isPlaying:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method updateChangesToVisDialogGlTh(Lcom/daaw/avee/comp/Visualizer/CustomScene;ZI)V
    .locals 1

    .line 1609
    invoke-static {}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;->getInstance()Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 1612
    invoke-virtual {v0, p1, p2, p3}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;->onVisualizerCustomizationChanged(Lcom/daaw/avee/comp/Visualizer/CustomScene;ZI)V

    :cond_0
    return-void
.end method
