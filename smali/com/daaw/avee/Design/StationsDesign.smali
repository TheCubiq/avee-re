.class public Lcom/daaw/avee/Design/StationsDesign;
.super Lcom/daaw/avee/Design/DesignBase;
.source "StationsDesign.java"


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 21
    invoke-direct {p0}, Lcom/daaw/avee/Design/DesignBase;-><init>()V

    .line 22
    sget-object v0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->onPlayStateChanged:Lcom/daaw/avee/Common/Events/WeakEvent5;

    new-instance v1, Lcom/daaw/avee/Design/StationsDesign$1;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/StationsDesign$1;-><init>(Lcom/daaw/avee/Design/StationsDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/StationsDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent5;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent5$Handler;Ljava/util/List;)V

    return-void
.end method


# virtual methods
.method public onPlayStateChanged(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Lcom/daaw/avee/comp/playback/Song/PlaylistSong;)Z
    .locals 0

    if-eqz p4, :cond_0

    .line 32
    invoke-virtual {p4}, Ljava/lang/String;->length()I

    move-result p1

    if-lez p1, :cond_0

    .line 33
    invoke-virtual {p0, p5}, Lcom/daaw/avee/Design/StationsDesign;->trySwitchPlaybackEngine(Lcom/daaw/avee/comp/playback/Song/PlaylistSong;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public trySwitchPlaybackEngine(Lcom/daaw/avee/comp/playback/Song/PlaylistSong;)Z
    .locals 5

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    .line 42
    invoke-virtual {p1}, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->isStream()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 43
    invoke-static {}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->createOrGetInstance()Lcom/daaw/avee/comp/AppPreferences/AppPreferences;

    move-result-object p1

    sget v1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Int_playbackEngine:I

    invoke-virtual {p1, v1}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->getInt(I)I

    move-result p1

    const/4 v1, 0x1

    if-eq p1, v1, :cond_1

    .line 46
    invoke-static {}, Lcom/daaw/avee/PlayerCore;->s()Lcom/daaw/avee/PlayerCore;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/avee/PlayerCore;->getActivityContext()Landroid/content/Context;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 49
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f100100

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 50
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const v3, 0x7f100177

    new-array v4, v1, [Ljava/lang/Object;

    aput-object v2, v4, v0

    invoke-virtual {p1, v3, v4}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 52
    sget-object v0, Lcom/daaw/avee/EventsGlobal/EventsGlobalTextNotifier;->onTextMsg:Lcom/daaw/avee/Common/Events/WeakEvent1;

    invoke-virtual {v0, p1}, Lcom/daaw/avee/Common/Events/WeakEvent1;->invoke(Ljava/lang/Object;)V

    .line 55
    :cond_0
    invoke-static {}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->createOrGetInstance()Lcom/daaw/avee/comp/AppPreferences/AppPreferences;

    move-result-object p1

    sget v0, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Int_playbackEngine:I

    invoke-virtual {p1, v0, v1}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->setInt(II)V

    return v1

    :cond_1
    return v0
.end method
