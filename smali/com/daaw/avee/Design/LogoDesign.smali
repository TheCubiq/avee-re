.class public Lcom/daaw/avee/Design/LogoDesign;
.super Lcom/daaw/avee/Design/DesignBase;
.source "LogoDesign.java"


# instance fields
.field private alwaysHideAppLogo:Z

.field private volatile logoTriggeredOnThisTrack:Z

.field private volatile logoTriggeredOnThisTrack2:Z

.field logoTriggeredOnTrack:Lcom/daaw/avee/comp/playback/Song/PlaylistSong;

.field private temporaryHideAppLogo:Z

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
.method public constructor <init>()V
    .locals 3

    .line 39
    invoke-direct {p0}, Lcom/daaw/avee/Design/DesignBase;-><init>()V

    .line 28
    new-instance v0, Ljava/lang/ref/WeakReference;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/daaw/avee/Design/LogoDesign;->visualizerSurfaceView:Ljava/lang/ref/WeakReference;

    .line 30
    iput-object v1, p0, Lcom/daaw/avee/Design/LogoDesign;->logoTriggeredOnTrack:Lcom/daaw/avee/comp/playback/Song/PlaylistSong;

    const/4 v0, 0x0

    .line 31
    iput-boolean v0, p0, Lcom/daaw/avee/Design/LogoDesign;->logoTriggeredOnThisTrack:Z

    .line 32
    iput-boolean v0, p0, Lcom/daaw/avee/Design/LogoDesign;->logoTriggeredOnThisTrack2:Z

    .line 34
    iput-boolean v0, p0, Lcom/daaw/avee/Design/LogoDesign;->alwaysHideAppLogo:Z

    .line 36
    iput-boolean v0, p0, Lcom/daaw/avee/Design/LogoDesign;->temporaryHideAppLogo:Z

    .line 41
    sget-object v0, Lcom/daaw/avee/comp/VisualUI/Fragment2;->onSurfaceCreated:Lcom/daaw/avee/Common/Events/WeakEvent1;

    new-instance v1, Lcom/daaw/avee/Design/LogoDesign$1;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/LogoDesign$1;-><init>(Lcom/daaw/avee/Design/LogoDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/LogoDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent1;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent1$Handler;Ljava/util/List;)V

    .line 48
    sget-object v0, Lcom/daaw/avee/EventsGlobal/EventsGlobalApp;->onUITick10:Lcom/daaw/avee/Common/Events/WeakEvent;

    new-instance v1, Lcom/daaw/avee/Design/LogoDesign$2;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/LogoDesign$2;-><init>(Lcom/daaw/avee/Design/LogoDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/LogoDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent$Handler;Ljava/util/List;)V

    .line 62
    sget-object v0, Lcom/daaw/avee/EventsGlobal/EventsGlobalApp;->onUITick1:Lcom/daaw/avee/Common/Events/WeakEvent;

    new-instance v1, Lcom/daaw/avee/Design/LogoDesign$3;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/LogoDesign$3;-><init>(Lcom/daaw/avee/Design/LogoDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/LogoDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent$Handler;Ljava/util/List;)V

    .line 106
    sget-object v0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->onDisplayMetaDataStateChanged:Lcom/daaw/avee/Common/Events/WeakEvent4;

    new-instance v1, Lcom/daaw/avee/Design/LogoDesign$4;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/LogoDesign$4;-><init>(Lcom/daaw/avee/Design/LogoDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/LogoDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent4;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent4$Handler;Ljava/util/List;)V

    .line 124
    sget-object v0, Lcom/daaw/avee/Design/VisualizerExporterDesign;->onExportingChanged:Lcom/daaw/avee/Common/Events/WeakEvent3;

    new-instance v1, Lcom/daaw/avee/Design/LogoDesign$5;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/LogoDesign$5;-><init>(Lcom/daaw/avee/Design/LogoDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/LogoDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent3;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent3$Handler;Ljava/util/List;)V

    return-void
.end method

.method static synthetic access$000(Lcom/daaw/avee/Design/LogoDesign;)Ljava/lang/ref/WeakReference;
    .locals 0

    .line 26
    iget-object p0, p0, Lcom/daaw/avee/Design/LogoDesign;->visualizerSurfaceView:Ljava/lang/ref/WeakReference;

    return-object p0
.end method

.method static synthetic access$002(Lcom/daaw/avee/Design/LogoDesign;Ljava/lang/ref/WeakReference;)Ljava/lang/ref/WeakReference;
    .locals 0

    .line 26
    iput-object p1, p0, Lcom/daaw/avee/Design/LogoDesign;->visualizerSurfaceView:Ljava/lang/ref/WeakReference;

    return-object p1
.end method

.method static synthetic access$100(Lcom/daaw/avee/Design/LogoDesign;)Z
    .locals 0

    .line 26
    iget-boolean p0, p0, Lcom/daaw/avee/Design/LogoDesign;->alwaysHideAppLogo:Z

    return p0
.end method

.method static synthetic access$102(Lcom/daaw/avee/Design/LogoDesign;Z)Z
    .locals 0

    .line 26
    iput-boolean p1, p0, Lcom/daaw/avee/Design/LogoDesign;->alwaysHideAppLogo:Z

    return p1
.end method

.method static synthetic access$200(Lcom/daaw/avee/Design/LogoDesign;)Z
    .locals 0

    .line 26
    iget-boolean p0, p0, Lcom/daaw/avee/Design/LogoDesign;->temporaryHideAppLogo:Z

    return p0
.end method

.method static synthetic access$202(Lcom/daaw/avee/Design/LogoDesign;Z)Z
    .locals 0

    .line 26
    iput-boolean p1, p0, Lcom/daaw/avee/Design/LogoDesign;->temporaryHideAppLogo:Z

    return p1
.end method

.method static synthetic access$300(Lcom/daaw/avee/Design/LogoDesign;)Z
    .locals 0

    .line 26
    iget-boolean p0, p0, Lcom/daaw/avee/Design/LogoDesign;->logoTriggeredOnThisTrack:Z

    return p0
.end method

.method static synthetic access$302(Lcom/daaw/avee/Design/LogoDesign;Z)Z
    .locals 0

    .line 26
    iput-boolean p1, p0, Lcom/daaw/avee/Design/LogoDesign;->logoTriggeredOnThisTrack:Z

    return p1
.end method

.method static synthetic access$400(Lcom/daaw/avee/Design/LogoDesign;)Z
    .locals 0

    .line 26
    iget-boolean p0, p0, Lcom/daaw/avee/Design/LogoDesign;->logoTriggeredOnThisTrack2:Z

    return p0
.end method

.method static synthetic access$402(Lcom/daaw/avee/Design/LogoDesign;Z)Z
    .locals 0

    .line 26
    iput-boolean p1, p0, Lcom/daaw/avee/Design/LogoDesign;->logoTriggeredOnThisTrack2:Z

    return p1
.end method
