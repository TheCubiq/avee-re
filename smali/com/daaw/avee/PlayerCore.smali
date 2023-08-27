.class public Lcom/daaw/avee/PlayerCore;
.super Ljava/lang/Object;
.source "PlayerCore.java"


# static fields
.field static instance:Lcom/daaw/avee/PlayerCore;


# instance fields
.field private albumArtCore:Lcom/daaw/avee/comp/AlbumArt/IAlbumArtCore;

.field private appPreferences:Lcom/daaw/avee/comp/AppPreferences/AppPreferences;

.field private contextualActionBar:Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar;

.field private design:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private globalSearchCore:Lcom/daaw/avee/comp/GlobalSearch/GlobalSearchCore;

.field protected listenerRefHolder:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private mediaControlsUI:Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;

.field private playbackQueue:Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;

.field private sleepTimer:Lcom/daaw/avee/comp/SleepTimer/SleepTimer;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 57
    new-instance v0, Lcom/daaw/avee/PlayerCore;

    invoke-direct {v0}, Lcom/daaw/avee/PlayerCore;-><init>()V

    sput-object v0, Lcom/daaw/avee/PlayerCore;->instance:Lcom/daaw/avee/PlayerCore;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .line 71
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 66
    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0x1e

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lcom/daaw/avee/PlayerCore;->design:Ljava/util/List;

    .line 69
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/daaw/avee/PlayerCore;->listenerRefHolder:Ljava/util/List;

    .line 72
    sput-object p0, Lcom/daaw/avee/PlayerCore;->instance:Lcom/daaw/avee/PlayerCore;

    .line 73
    invoke-direct {p0}, Lcom/daaw/avee/PlayerCore;->init()V

    return-void
.end method

.method private init()V
    .locals 7

    .line 81
    invoke-static {}, Lcom/daaw/avee/Common/UtilsUI;->AssertIsUiThread()V

    .line 83
    invoke-static {}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->createOrGetInstance()Lcom/daaw/avee/comp/AppPreferences/AppPreferences;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/avee/PlayerCore;->appPreferences:Lcom/daaw/avee/comp/AppPreferences/AppPreferences;

    .line 85
    iget-object v0, p0, Lcom/daaw/avee/PlayerCore;->design:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 87
    new-instance v0, Lcom/daaw/avee/Design/IAP2Design;

    invoke-direct {v0}, Lcom/daaw/avee/Design/IAP2Design;-><init>()V

    .line 89
    iget-object v1, p0, Lcom/daaw/avee/PlayerCore;->design:Ljava/util/List;

    new-instance v2, Lcom/daaw/avee/Design/GeneralDesign;

    invoke-direct {v2}, Lcom/daaw/avee/Design/GeneralDesign;-><init>()V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 90
    iget-object v1, p0, Lcom/daaw/avee/PlayerCore;->design:Ljava/util/List;

    new-instance v2, Lcom/daaw/avee/Design/AppDesign;

    invoke-direct {v2}, Lcom/daaw/avee/Design/AppDesign;-><init>()V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 91
    iget-object v1, p0, Lcom/daaw/avee/PlayerCore;->design:Ljava/util/List;

    new-instance v2, Lcom/daaw/avee/Design/Sec0Design;

    invoke-direct {v2}, Lcom/daaw/avee/Design/Sec0Design;-><init>()V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 92
    iget-object v1, p0, Lcom/daaw/avee/PlayerCore;->design:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 94
    iget-object v1, p0, Lcom/daaw/avee/PlayerCore;->design:Ljava/util/List;

    new-instance v2, Lcom/daaw/avee/Design/SleepTimerDesign;

    invoke-direct {v2}, Lcom/daaw/avee/Design/SleepTimerDesign;-><init>()V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 95
    iget-object v1, p0, Lcom/daaw/avee/PlayerCore;->design:Ljava/util/List;

    new-instance v2, Lcom/daaw/avee/Design/LibraryQueueUIDesign;

    invoke-direct {v2}, Lcom/daaw/avee/Design/LibraryQueueUIDesign;-><init>()V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 96
    new-instance v1, Lcom/daaw/avee/Design/VisualizerDesign;

    invoke-direct {v1}, Lcom/daaw/avee/Design/VisualizerDesign;-><init>()V

    .line 97
    iget-object v2, p0, Lcom/daaw/avee/PlayerCore;->design:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 98
    iget-object v2, p0, Lcom/daaw/avee/PlayerCore;->design:Ljava/util/List;

    new-instance v3, Lcom/daaw/avee/Design/PlaybackControlsDesign;

    invoke-direct {v3}, Lcom/daaw/avee/Design/PlaybackControlsDesign;-><init>()V

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 99
    new-instance v2, Lcom/daaw/avee/Design/StationsDesign;

    invoke-direct {v2}, Lcom/daaw/avee/Design/StationsDesign;-><init>()V

    .line 100
    new-instance v3, Lcom/daaw/avee/Design/PlaybackDesign;

    invoke-direct {v3, v2}, Lcom/daaw/avee/Design/PlaybackDesign;-><init>(Lcom/daaw/avee/Design/StationsDesign;)V

    .line 101
    iget-object v4, p0, Lcom/daaw/avee/PlayerCore;->design:Ljava/util/List;

    invoke-interface {v4, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 102
    new-instance v4, Lcom/daaw/avee/Design/MainUIDesign;

    invoke-direct {v4}, Lcom/daaw/avee/Design/MainUIDesign;-><init>()V

    .line 103
    iget-object v5, p0, Lcom/daaw/avee/PlayerCore;->design:Ljava/util/List;

    invoke-interface {v5, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 104
    iget-object v5, p0, Lcom/daaw/avee/PlayerCore;->design:Ljava/util/List;

    new-instance v6, Lcom/daaw/avee/Design/CompositeSearchDesign;

    invoke-direct {v6}, Lcom/daaw/avee/Design/CompositeSearchDesign;-><init>()V

    invoke-interface {v5, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 105
    iget-object v5, p0, Lcom/daaw/avee/PlayerCore;->design:Ljava/util/List;

    new-instance v6, Lcom/daaw/avee/Design/SortDesign;

    invoke-direct {v6}, Lcom/daaw/avee/Design/SortDesign;-><init>()V

    invoke-interface {v5, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 106
    iget-object v5, p0, Lcom/daaw/avee/PlayerCore;->design:Ljava/util/List;

    new-instance v6, Lcom/daaw/avee/Design/PlaylistsDesign;

    invoke-direct {v6}, Lcom/daaw/avee/Design/PlaylistsDesign;-><init>()V

    invoke-interface {v5, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 107
    iget-object v5, p0, Lcom/daaw/avee/PlayerCore;->design:Ljava/util/List;

    new-instance v6, Lcom/daaw/avee/Design/PlayerControlsUIDesign;

    invoke-direct {v6}, Lcom/daaw/avee/Design/PlayerControlsUIDesign;-><init>()V

    invoke-interface {v5, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 108
    iget-object v5, p0, Lcom/daaw/avee/PlayerCore;->design:Ljava/util/List;

    new-instance v6, Lcom/daaw/avee/Design/ContextualActionModeDesign;

    invoke-direct {v6}, Lcom/daaw/avee/Design/ContextualActionModeDesign;-><init>()V

    invoke-interface {v5, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 109
    iget-object v5, p0, Lcom/daaw/avee/PlayerCore;->design:Ljava/util/List;

    new-instance v6, Lcom/daaw/avee/Design/AdsDesign;

    invoke-direct {v6}, Lcom/daaw/avee/Design/AdsDesign;-><init>()V

    invoke-interface {v5, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 110
    iget-object v5, p0, Lcom/daaw/avee/PlayerCore;->design:Ljava/util/List;

    new-instance v6, Lcom/daaw/avee/Design/AdsRewardedDesign;

    invoke-direct {v6}, Lcom/daaw/avee/Design/AdsRewardedDesign;-><init>()V

    invoke-interface {v5, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 112
    new-instance v5, Lcom/daaw/avee/Common/Events/WeakEventR;

    invoke-direct {v5}, Lcom/daaw/avee/Common/Events/WeakEventR;-><init>()V

    .line 113
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v6, Lcom/daaw/avee/-$$Lambda$TUCTVSkpBLpT5Bss9IrbaM4TVA8;

    invoke-direct {v6, v0}, Lcom/daaw/avee/-$$Lambda$TUCTVSkpBLpT5Bss9IrbaM4TVA8;-><init>(Lcom/daaw/avee/Design/IAP2Design;)V

    iget-object v0, p0, Lcom/daaw/avee/PlayerCore;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v5, v6, v0}, Lcom/daaw/avee/Common/Events/WeakEventR;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEventR$Handler;Ljava/util/List;)V

    .line 115
    iget-object v0, p0, Lcom/daaw/avee/PlayerCore;->design:Ljava/util/List;

    new-instance v6, Lcom/daaw/avee/PostExportAdManager;

    invoke-direct {v6, v5}, Lcom/daaw/avee/PostExportAdManager;-><init>(Lcom/daaw/avee/Common/Events/WeakEventR;)V

    invoke-interface {v0, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 116
    iget-object v0, p0, Lcom/daaw/avee/PlayerCore;->design:Ljava/util/List;

    new-instance v5, Lcom/daaw/avee/Design/AudioEffectsDesign;

    invoke-direct {v5}, Lcom/daaw/avee/Design/AudioEffectsDesign;-><init>()V

    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 117
    iget-object v0, p0, Lcom/daaw/avee/PlayerCore;->design:Ljava/util/List;

    new-instance v5, Lcom/daaw/avee/Design/AppThemesDesign;

    invoke-direct {v5}, Lcom/daaw/avee/Design/AppThemesDesign;-><init>()V

    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 118
    iget-object v0, p0, Lcom/daaw/avee/PlayerCore;->design:Ljava/util/List;

    invoke-static {}, Lcom/daaw/avee/Design/WidgetAndNotificationDesign;->createInstance()Lcom/daaw/avee/Design/WidgetAndNotificationDesign;

    move-result-object v5

    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 119
    iget-object v0, p0, Lcom/daaw/avee/PlayerCore;->design:Ljava/util/List;

    new-instance v5, Lcom/daaw/avee/Design/VisualizerExporterDesign;

    invoke-direct {v5, v1, v3, v4}, Lcom/daaw/avee/Design/VisualizerExporterDesign;-><init>(Lcom/daaw/avee/Design/VisualizerDesign;Lcom/daaw/avee/Design/PlaybackDesign;Lcom/daaw/avee/Design/MainUIDesign;)V

    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 120
    iget-object v0, p0, Lcom/daaw/avee/PlayerCore;->design:Ljava/util/List;

    new-instance v1, Lcom/daaw/avee/Design/RingtoneDesign;

    invoke-direct {v1}, Lcom/daaw/avee/Design/RingtoneDesign;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 121
    iget-object v0, p0, Lcom/daaw/avee/PlayerCore;->design:Ljava/util/List;

    new-instance v1, Lcom/daaw/avee/Design/HeadsetMonitorDesign;

    invoke-direct {v1}, Lcom/daaw/avee/Design/HeadsetMonitorDesign;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 122
    iget-object v0, p0, Lcom/daaw/avee/PlayerCore;->design:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 123
    iget-object v0, p0, Lcom/daaw/avee/PlayerCore;->design:Ljava/util/List;

    new-instance v1, Lcom/daaw/avee/Design/PcmDesign;

    invoke-direct {v1}, Lcom/daaw/avee/Design/PcmDesign;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 124
    iget-object v0, p0, Lcom/daaw/avee/PlayerCore;->design:Ljava/util/List;

    new-instance v1, Lcom/daaw/avee/Design/LogoDesign;

    invoke-direct {v1}, Lcom/daaw/avee/Design/LogoDesign;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 125
    iget-object v0, p0, Lcom/daaw/avee/PlayerCore;->design:Ljava/util/List;

    new-instance v1, Lcom/daaw/avee/Design/VisualizerSharingDesign;

    invoke-direct {v1}, Lcom/daaw/avee/Design/VisualizerSharingDesign;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 126
    iget-object v0, p0, Lcom/daaw/avee/PlayerCore;->design:Ljava/util/List;

    new-instance v1, Lcom/daaw/avee/Design/VisualizerCustomizationDesign;

    invoke-direct {v1}, Lcom/daaw/avee/Design/VisualizerCustomizationDesign;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 128
    invoke-static {}, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->createOrGetInstance()Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/avee/PlayerCore;->playbackQueue:Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;

    .line 129
    invoke-static {}, Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar;->createInstance()Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/avee/PlayerCore;->contextualActionBar:Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar;

    .line 130
    invoke-static {}, Lcom/daaw/avee/comp/SleepTimer/SleepTimer;->createOrGetInstance()Lcom/daaw/avee/comp/SleepTimer/SleepTimer;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/avee/PlayerCore;->sleepTimer:Lcom/daaw/avee/comp/SleepTimer/SleepTimer;

    .line 131
    invoke-virtual {p0}, Lcom/daaw/avee/PlayerCore;->getAppContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/avee/comp/AlbumArt/AlbumArtFactory;->createInstance(Landroid/content/Context;)Lcom/daaw/avee/comp/AlbumArt/IAlbumArtCore;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/avee/PlayerCore;->albumArtCore:Lcom/daaw/avee/comp/AlbumArt/IAlbumArtCore;

    .line 132
    invoke-static {}, Lcom/daaw/avee/comp/GlobalSearch/GlobalSearchCore;->createInstance()Lcom/daaw/avee/comp/GlobalSearch/GlobalSearchCore;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/avee/PlayerCore;->globalSearchCore:Lcom/daaw/avee/comp/GlobalSearch/GlobalSearchCore;

    .line 133
    invoke-static {}, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->createOrGetInstance()Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/avee/PlayerCore;->mediaControlsUI:Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;

    return-void
.end method

.method public static s()Lcom/daaw/avee/PlayerCore;
    .locals 1

    .line 77
    sget-object v0, Lcom/daaw/avee/PlayerCore;->instance:Lcom/daaw/avee/PlayerCore;

    return-object v0
.end method


# virtual methods
.method public getActivityContext()Landroid/content/Context;
    .locals 1

    .line 157
    invoke-static {}, Lcom/daaw/avee/MainActivity;->getInstance()Lcom/daaw/avee/MainActivity;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getActivityContextAsActivity()Landroid/app/Activity;
    .locals 1

    .line 165
    invoke-static {}, Lcom/daaw/avee/MainActivity;->getInstance()Lcom/daaw/avee/MainActivity;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getAppContext()Landroid/content/Context;
    .locals 3

    .line 139
    invoke-static {}, Lcom/daaw/avee/MainActivity;->getInstance()Lcom/daaw/avee/MainActivity;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 141
    invoke-virtual {v0}, Lcom/daaw/avee/MainActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_1

    return-object v0

    .line 145
    :cond_1
    invoke-static {}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->getInstance()Lcom/daaw/avee/comp/playback/MediaPlaybackService;

    move-result-object v2

    if-eqz v2, :cond_2

    .line 147
    invoke-virtual {v2}, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    :cond_2
    if-eqz v0, :cond_3

    return-object v0

    :cond_3
    const-string v0, "app context is null"

    .line 151
    invoke-static {v0}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    return-object v1
.end method
