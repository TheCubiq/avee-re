.class public Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;
.super Landroid/opengl/GLSurfaceView;
.source "VisualizerViewCore.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore$MyEGLConfigChooser;,
        Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore$BaseConfigChooser;
    }
.end annotation


# static fields
.field public static onFrameCaptured:Lcom/daaw/avee/Common/Events/WeakEvent4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent4<",
            "[I",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "[I>;"
        }
    .end annotation
.end field

.field public static onFrameStart:Lcom/daaw/avee/Common/Events/WeakEvent2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent2<",
            "Ljava/lang/Float;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field public static onOffScreenContentRendered:Lcom/daaw/avee/Common/Events/WeakEvent3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent3<",
            "Lmdesl/graphics/Texture;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static onRequestAlbumArtPathAndBitmap:Lcom/daaw/avee/Common/Events/WeakEvent2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent2<",
            "Lcom/daaw/avee/comp/AlbumArt/ImageLoadedListener;",
            "Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest2;",
            ">;"
        }
    .end annotation
.end field

.field public static onRequestAudioProcessMultiThreadValue:Lcom/daaw/avee/Common/Events/WeakEventR1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEventR1<",
            "Landroid/content/Context;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static onRequestConvertDpToPx:Lcom/daaw/avee/Common/Events/WeakEventR1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEventR1<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static onRequestFrameCaptureMode:Lcom/daaw/avee/Common/Events/WeakEventR;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEventR<",
            "Lcom/daaw/avee/comp/Visualizer/FrameCaptureDesc;",
            ">;"
        }
    .end annotation
.end field

.field public static onRequestMeasureText:Lcom/daaw/avee/Common/Events/WeakEventR2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEventR2<",
            "Ljava/lang/String;",
            "Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static onRequestMeasureVec2f:Lcom/daaw/avee/Common/Events/WeakEventR5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEventR5<",
            "Ljava/lang/String;",
            "Lcom/daaw/avee/Common/Vec2f;",
            "Lcom/daaw/avee/Common/Vec2f;",
            "Lcom/daaw/avee/comp/Common/MeterOutputData;",
            "Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;",
            "Lcom/daaw/avee/Common/Vec2f;",
            ">;"
        }
    .end annotation
.end field

.field public static onRequestOverrideAudioFrameSamplesInCount:Lcom/daaw/avee/Common/Events/WeakEventR;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEventR<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static onRequestRenderQualityEdgesValue:Lcom/daaw/avee/Common/Events/WeakEventR1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEventR1<",
            "Landroid/content/Context;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static onRequestSelectedSkinThemePreset:Lcom/daaw/avee/Common/Events/WeakEventR;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEventR<",
            "Lcom/daaw/avee/comp/Visualizer/CustomScene;",
            ">;"
        }
    .end annotation
.end field

.field public static onRequestTrackDurationInfo:Lcom/daaw/avee/Common/Events/WeakEventR1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEventR1<",
            "Landroid/content/Context;",
            "Lcom/daaw/avee/comp/Common/TrackDurationInfo;",
            ">;"
        }
    .end annotation
.end field

.field public static onRequestUseHighQualityBlur:Lcom/daaw/avee/Common/Events/WeakEventR;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEventR<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static onRequestsAlbumArtPath:Lcom/daaw/avee/Common/Events/WeakEventR;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEventR<",
            "Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;",
            ">;"
        }
    .end annotation
.end field

.field public static onRequestsSoundVisualizationData:Lcom/daaw/avee/Common/Events/WeakEventR1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEventR1<",
            "Ljava/lang/Integer;",
            "Lcom/daaw/avee/comp/playback/AudioFrameData;",
            ">;"
        }
    .end annotation
.end field

.field public static onThemeChanged:Lcom/daaw/avee/Common/Events/WeakEvent;


# instance fields
.field private EGLContextClientVersion:I

.field private dbgFrameCounter:I

.field internalDataProvider:Lcom/daaw/avee/comp/Visualizer/InternalVisualizationDataProvider;

.field private renderer:Lcom/daaw/avee/comp/Visualizer/Graphic/RendererCore;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 47
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEventR1;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEventR1;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->onRequestsSoundVisualizationData:Lcom/daaw/avee/Common/Events/WeakEventR1;

    .line 48
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEventR2;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEventR2;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->onRequestMeasureText:Lcom/daaw/avee/Common/Events/WeakEventR2;

    .line 49
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEventR5;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEventR5;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->onRequestMeasureVec2f:Lcom/daaw/avee/Common/Events/WeakEventR5;

    .line 50
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEventR;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEventR;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->onRequestsAlbumArtPath:Lcom/daaw/avee/Common/Events/WeakEventR;

    .line 51
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent2;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent2;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->onRequestAlbumArtPathAndBitmap:Lcom/daaw/avee/Common/Events/WeakEvent2;

    .line 52
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEventR;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEventR;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->onRequestSelectedSkinThemePreset:Lcom/daaw/avee/Common/Events/WeakEventR;

    .line 53
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->onThemeChanged:Lcom/daaw/avee/Common/Events/WeakEvent;

    .line 54
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent2;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent2;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->onFrameStart:Lcom/daaw/avee/Common/Events/WeakEvent2;

    .line 55
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEventR;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEventR;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->onRequestFrameCaptureMode:Lcom/daaw/avee/Common/Events/WeakEventR;

    .line 56
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent4;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent4;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->onFrameCaptured:Lcom/daaw/avee/Common/Events/WeakEvent4;

    .line 57
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEventR;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEventR;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->onRequestUseHighQualityBlur:Lcom/daaw/avee/Common/Events/WeakEventR;

    .line 58
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEventR;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEventR;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->onRequestOverrideAudioFrameSamplesInCount:Lcom/daaw/avee/Common/Events/WeakEventR;

    .line 59
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent3;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent3;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->onOffScreenContentRendered:Lcom/daaw/avee/Common/Events/WeakEvent3;

    .line 60
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEventR1;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEventR1;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->onRequestConvertDpToPx:Lcom/daaw/avee/Common/Events/WeakEventR1;

    .line 61
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEventR1;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEventR1;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->onRequestRenderQualityEdgesValue:Lcom/daaw/avee/Common/Events/WeakEventR1;

    .line 62
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEventR1;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEventR1;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->onRequestAudioProcessMultiThreadValue:Lcom/daaw/avee/Common/Events/WeakEventR1;

    .line 63
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEventR1;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEventR1;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->onRequestTrackDurationInfo:Lcom/daaw/avee/Common/Events/WeakEventR1;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .line 160
    invoke-direct {p0, p1, p2}, Landroid/opengl/GLSurfaceView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p2, 0x2

    .line 65
    iput p2, p0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->EGLContextClientVersion:I

    const/4 p2, 0x0

    .line 68
    iput p2, p0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->dbgFrameCounter:I

    .line 70
    new-instance p2, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore$1;

    invoke-direct {p2, p0}, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore$1;-><init>(Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;)V

    iput-object p2, p0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->internalDataProvider:Lcom/daaw/avee/comp/Visualizer/InternalVisualizationDataProvider;

    .line 162
    iget p2, p0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->EGLContextClientVersion:I

    invoke-virtual {p0, p2}, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->setEGLContextClientVersion(I)V

    const/4 p2, 0x1

    .line 177
    invoke-virtual {p0, p2}, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->setEGLConfigChooser(Z)V

    .line 180
    new-instance p2, Lcom/daaw/avee/comp/Visualizer/Graphic/RendererCore;

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->internalDataProvider:Lcom/daaw/avee/comp/Visualizer/InternalVisualizationDataProvider;

    invoke-direct {p2, p1, v0, v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RendererCore;-><init>(Landroid/content/Context;Landroid/content/res/Resources;Lcom/daaw/avee/comp/Visualizer/InternalVisualizationDataProvider;)V

    iput-object p2, p0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->renderer:Lcom/daaw/avee/comp/Visualizer/Graphic/RendererCore;

    .line 181
    invoke-virtual {p0, p2}, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->setRenderer(Landroid/opengl/GLSurfaceView$Renderer;)V

    return-void
.end method

.method static synthetic access$000(Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;Lcom/daaw/avee/comp/Visualizer/CustomScene;)V
    .locals 0

    .line 45
    invoke-direct {p0, p1}, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->setThemeElements(Lcom/daaw/avee/comp/Visualizer/CustomScene;)V

    return-void
.end method

.method static synthetic access$100(Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;)V
    .locals 0

    .line 45
    invoke-direct {p0, p1}, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->setThemeElements(Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;)V

    return-void
.end method

.method static synthetic access$200(Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;)V
    .locals 0

    .line 45
    invoke-direct {p0}, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->requestRefreshThemeElements()V

    return-void
.end method

.method static synthetic access$300(Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;II)V
    .locals 0

    .line 45
    invoke-direct {p0, p1, p2}, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->setTriggerLogo(II)V

    return-void
.end method

.method static synthetic access$400(Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;)I
    .locals 0

    .line 45
    iget p0, p0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->EGLContextClientVersion:I

    return p0
.end method

.method static synthetic lambda$resetVisualizerTh$1(Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;)V
    .locals 0

    .line 287
    invoke-direct {p0}, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->resetVisualizer()V

    return-void
.end method

.method private requestRefreshThemeElements()V
    .locals 1

    .line 226
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->renderer:Lcom/daaw/avee/comp/Visualizer/Graphic/RendererCore;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/RendererCore;->requestRefreshThemeElements()V

    return-void
.end method

.method private resetVisualizer()V
    .locals 1

    .line 280
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->renderer:Lcom/daaw/avee/comp/Visualizer/Graphic/RendererCore;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/RendererCore;->resetVisualizer()V

    return-void
.end method

.method private setThemeElements(Lcom/daaw/avee/comp/Visualizer/CustomScene;)V
    .locals 1

    .line 197
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->renderer:Lcom/daaw/avee/comp/Visualizer/Graphic/RendererCore;

    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RendererCore;->setThemeElements(Lcom/daaw/avee/comp/Visualizer/CustomScene;)V

    return-void
.end method

.method private setThemeElements(Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;)V
    .locals 1

    .line 193
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->renderer:Lcom/daaw/avee/comp/Visualizer/Graphic/RendererCore;

    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RendererCore;->setThemeElements(Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;)V

    return-void
.end method

.method private setTriggerLogo(II)V
    .locals 1

    .line 292
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->renderer:Lcom/daaw/avee/comp/Visualizer/Graphic/RendererCore;

    invoke-virtual {v0, p1, p2}, Lcom/daaw/avee/comp/Visualizer/Graphic/RendererCore;->setTriggerLogo(II)V

    return-void
.end method


# virtual methods
.method public getFrameStats()Lcom/daaw/avee/comp/Visualizer/FrameStats;
    .locals 1

    .line 185
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->renderer:Lcom/daaw/avee/comp/Visualizer/Graphic/RendererCore;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/RendererCore;->getFrameStats()Lcom/daaw/avee/comp/Visualizer/FrameStats;

    move-result-object v0

    return-object v0
.end method

.method public getFrameTimeMs()I
    .locals 1

    .line 189
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->renderer:Lcom/daaw/avee/comp/Visualizer/Graphic/RendererCore;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/RendererCore;->getFrameTimeMs()I

    move-result v0

    return v0
.end method

.method public synthetic lambda$readThemeCustomizationDataUiTh$0$VisualizerViewCore(Lcom/daaw/avee/comp/Visualizer/CustomScene;Lcom/daaw/avee/comp/Visualizer/IDependencyResourceCounter;Lcom/daaw/avee/Common/Action1;Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;)V
    .locals 1

    .line 273
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->renderer:Lcom/daaw/avee/comp/Visualizer/Graphic/RendererCore;

    invoke-virtual {v0, p1, p2}, Lcom/daaw/avee/comp/Visualizer/Graphic/RendererCore;->readThemeCustomizationData(Lcom/daaw/avee/comp/Visualizer/CustomScene;Lcom/daaw/avee/comp/Visualizer/IDependencyResourceCounter;)V

    if-eqz p3, :cond_0

    .line 274
    invoke-interface {p3, p4}, Lcom/daaw/avee/Common/Action1;->onInvoke(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public readThemeCustomizationData(Lcom/daaw/avee/comp/Visualizer/CustomScene;Lcom/daaw/avee/comp/Visualizer/IDependencyResourceCounter;)V
    .locals 1

    .line 264
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->renderer:Lcom/daaw/avee/comp/Visualizer/Graphic/RendererCore;

    invoke-virtual {v0, p1, p2}, Lcom/daaw/avee/comp/Visualizer/Graphic/RendererCore;->readThemeCustomizationData(Lcom/daaw/avee/comp/Visualizer/CustomScene;Lcom/daaw/avee/comp/Visualizer/IDependencyResourceCounter;)V

    return-void
.end method

.method public readThemeCustomizationDataUiTh(Lcom/daaw/avee/comp/Visualizer/CustomScene;Lcom/daaw/avee/comp/Visualizer/IDependencyResourceCounter;Lcom/daaw/avee/Common/Action1;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/avee/comp/Visualizer/CustomScene;",
            "Lcom/daaw/avee/comp/Visualizer/IDependencyResourceCounter;",
            "Lcom/daaw/avee/Common/Action1<",
            "Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;",
            ">;)V"
        }
    .end annotation

    .line 271
    new-instance v6, Lcom/daaw/avee/comp/Visualizer/-$$Lambda$VisualizerViewCore$FfDF-ngFG3E1F0NaBjbruMftJRU;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p0

    invoke-direct/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/-$$Lambda$VisualizerViewCore$FfDF-ngFG3E1F0NaBjbruMftJRU;-><init>(Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;Lcom/daaw/avee/comp/Visualizer/CustomScene;Lcom/daaw/avee/comp/Visualizer/IDependencyResourceCounter;Lcom/daaw/avee/Common/Action1;Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;)V

    invoke-virtual {p0, v6}, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->queueEvent(Ljava/lang/Runnable;)V

    return-void
.end method

.method public requestRefreshThemeElementsUiTh()V
    .locals 1

    .line 231
    new-instance v0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore$4;

    invoke-direct {v0, p0}, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore$4;-><init>(Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;)V

    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->queueEvent(Ljava/lang/Runnable;)V

    return-void
.end method

.method public resetVisualizerTh()V
    .locals 1

    .line 285
    new-instance v0, Lcom/daaw/avee/comp/Visualizer/-$$Lambda$VisualizerViewCore$NVu5RwcX8I7NueWPh-RYoHTNZsY;

    invoke-direct {v0, p0}, Lcom/daaw/avee/comp/Visualizer/-$$Lambda$VisualizerViewCore$NVu5RwcX8I7NueWPh-RYoHTNZsY;-><init>(Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;)V

    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->queueEvent(Ljava/lang/Runnable;)V

    return-void
.end method

.method public setThemeCustomizationData(Lcom/daaw/avee/comp/Visualizer/CustomScene;)V
    .locals 1

    .line 241
    invoke-static {}, Lcom/daaw/avee/Common/UtilsUI;->AssertIsNotUiThread()V

    .line 242
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->renderer:Lcom/daaw/avee/comp/Visualizer/Graphic/RendererCore;

    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RendererCore;->setThemeCustomizationData(Lcom/daaw/avee/comp/Visualizer/CustomScene;)V

    return-void
.end method

.method public setThemeCustomizationDataUiTh(Lcom/daaw/avee/comp/Visualizer/CustomScene;Lcom/daaw/avee/Common/Action1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/avee/comp/Visualizer/CustomScene;",
            "Lcom/daaw/avee/Common/Action1<",
            "Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;",
            ">;)V"
        }
    .end annotation

    .line 249
    invoke-virtual {p1}, Lcom/daaw/avee/comp/Visualizer/CustomScene;->serialize()Ljava/lang/String;

    move-result-object p1

    .line 251
    new-instance v0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore$5;

    invoke-direct {v0, p0, p1, p2, p0}, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore$5;-><init>(Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;Ljava/lang/String;Lcom/daaw/avee/Common/Action1;Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;)V

    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->queueEvent(Ljava/lang/Runnable;)V

    return-void
.end method

.method public setThemeElementsUiTh(Lcom/daaw/avee/comp/Visualizer/CustomScene;)V
    .locals 1

    .line 204
    new-instance v0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore$2;

    invoke-direct {v0, p0, p1}, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore$2;-><init>(Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;Lcom/daaw/avee/comp/Visualizer/CustomScene;)V

    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->queueEvent(Ljava/lang/Runnable;)V

    return-void
.end method

.method public setThemeElementsUiTh(Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;)V
    .locals 1

    .line 215
    new-instance v0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore$3;

    invoke-direct {v0, p0, p1}, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore$3;-><init>(Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;)V

    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->queueEvent(Ljava/lang/Runnable;)V

    return-void
.end method

.method public setTriggerLogoTh(II)V
    .locals 1

    .line 297
    new-instance v0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore$6;

    invoke-direct {v0, p0, p1, p2}, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore$6;-><init>(Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;II)V

    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->queueEvent(Ljava/lang/Runnable;)V

    return-void
.end method
