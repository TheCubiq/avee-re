.class public Lcom/daaw/avee/Design/PlaybackDesign;
.super Ljava/lang/Object;
.source "PlaybackDesign.java"


# static fields
.field static volatile currentDisplayTrack:Lcom/daaw/avee/comp/playback/Song/PlaylistSong;

.field static volatile isPlaying:Z

.field static volatile playingMediaInfo:Lcom/daaw/avee/comp/playback/PlayingMediaInfo;

.field static volatile repeatMode:I

.field static volatile songDisplayData:Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;

.field static volatile timeoutEnabled:Z

.field static volatile trackPosition:J

.field static volatile volumeMax:I

.field static volatile volumeMuted:Z

.field static volatile wantsPlaying:Z


# instance fields
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

.field stationsDesign:Lcom/daaw/avee/Design/StationsDesign;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 52
    sget-object v0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->EmptySong:Lcom/daaw/avee/comp/playback/Song/PlaylistSong;

    sput-object v0, Lcom/daaw/avee/Design/PlaybackDesign;->currentDisplayTrack:Lcom/daaw/avee/comp/playback/Song/PlaylistSong;

    .line 53
    sget-object v0, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;->emptyData:Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;

    sput-object v0, Lcom/daaw/avee/Design/PlaybackDesign;->songDisplayData:Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;

    .line 54
    sget-object v0, Lcom/daaw/avee/comp/playback/PlayingMediaInfo;->empty:Lcom/daaw/avee/comp/playback/PlayingMediaInfo;

    sput-object v0, Lcom/daaw/avee/Design/PlaybackDesign;->playingMediaInfo:Lcom/daaw/avee/comp/playback/PlayingMediaInfo;

    const-wide/16 v0, 0x0

    .line 55
    sput-wide v0, Lcom/daaw/avee/Design/PlaybackDesign;->trackPosition:J

    const/4 v0, 0x0

    .line 56
    sput v0, Lcom/daaw/avee/Design/PlaybackDesign;->repeatMode:I

    const/16 v1, 0xa

    .line 57
    sput v1, Lcom/daaw/avee/Design/PlaybackDesign;->volumeMax:I

    .line 58
    sput-boolean v0, Lcom/daaw/avee/Design/PlaybackDesign;->volumeMuted:Z

    const/4 v0, 0x1

    .line 59
    sput-boolean v0, Lcom/daaw/avee/Design/PlaybackDesign;->timeoutEnabled:Z

    return-void
.end method

.method public constructor <init>(Lcom/daaw/avee/Design/StationsDesign;)V
    .locals 2

    .line 66
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 63
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/daaw/avee/Design/PlaybackDesign;->listenerRefHolder:Ljava/util/List;

    .line 64
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/daaw/avee/Design/PlaybackDesign;->mainThreadHandler:Landroid/os/Handler;

    .line 67
    iput-object p1, p0, Lcom/daaw/avee/Design/PlaybackDesign;->stationsDesign:Lcom/daaw/avee/Design/StationsDesign;

    .line 69
    sget-object p1, Lcom/daaw/avee/MainActivity;->onStop:Lcom/daaw/avee/Common/Events/WeakEvent1;

    new-instance v0, Lcom/daaw/avee/Design/PlaybackDesign$1;

    invoke-direct {v0, p0}, Lcom/daaw/avee/Design/PlaybackDesign$1;-><init>(Lcom/daaw/avee/Design/PlaybackDesign;)V

    iget-object v1, p0, Lcom/daaw/avee/Design/PlaybackDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {p1, v0, v1}, Lcom/daaw/avee/Common/Events/WeakEvent1;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent1$Handler;Ljava/util/List;)V

    .line 81
    sget-object p1, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->onServiceDestroying:Lcom/daaw/avee/Common/Events/WeakEvent1;

    new-instance v0, Lcom/daaw/avee/Design/PlaybackDesign$2;

    invoke-direct {v0, p0}, Lcom/daaw/avee/Design/PlaybackDesign$2;-><init>(Lcom/daaw/avee/Design/PlaybackDesign;)V

    iget-object v1, p0, Lcom/daaw/avee/Design/PlaybackDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {p1, v0, v1}, Lcom/daaw/avee/Common/Events/WeakEvent1;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent1$Handler;Ljava/util/List;)V

    .line 94
    sget-object p1, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->onRequestTimeoutEnabled:Lcom/daaw/avee/Common/Events/WeakEventR;

    new-instance v0, Lcom/daaw/avee/Design/PlaybackDesign$3;

    invoke-direct {v0, p0}, Lcom/daaw/avee/Design/PlaybackDesign$3;-><init>(Lcom/daaw/avee/Design/PlaybackDesign;)V

    iget-object v1, p0, Lcom/daaw/avee/Design/PlaybackDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {p1, v0, v1}, Lcom/daaw/avee/Common/Events/WeakEventR;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEventR$Handler;Ljava/util/List;)V

    .line 100
    sget-object p1, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->onRequestSelectMediaPlayerCoreIndex:Lcom/daaw/avee/Common/Events/WeakEventR;

    new-instance v0, Lcom/daaw/avee/Design/PlaybackDesign$4;

    invoke-direct {v0, p0}, Lcom/daaw/avee/Design/PlaybackDesign$4;-><init>(Lcom/daaw/avee/Design/PlaybackDesign;)V

    iget-object v1, p0, Lcom/daaw/avee/Design/PlaybackDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {p1, v0, v1}, Lcom/daaw/avee/Common/Events/WeakEventR;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEventR$Handler;Ljava/util/List;)V

    .line 108
    sget-object p1, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->onDisplayMetaDataStateChanged:Lcom/daaw/avee/Common/Events/WeakEvent4;

    new-instance v0, Lcom/daaw/avee/Design/PlaybackDesign$5;

    invoke-direct {v0, p0}, Lcom/daaw/avee/Design/PlaybackDesign$5;-><init>(Lcom/daaw/avee/Design/PlaybackDesign;)V

    iget-object v1, p0, Lcom/daaw/avee/Design/PlaybackDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {p1, v0, v1}, Lcom/daaw/avee/Common/Events/WeakEvent4;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent4$Handler;Ljava/util/List;)V

    .line 133
    sget-object p1, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->onTrackPositionChanged:Lcom/daaw/avee/Common/Events/WeakEvent1;

    new-instance v0, Lcom/daaw/avee/Design/PlaybackDesign$6;

    invoke-direct {v0, p0}, Lcom/daaw/avee/Design/PlaybackDesign$6;-><init>(Lcom/daaw/avee/Design/PlaybackDesign;)V

    iget-object v1, p0, Lcom/daaw/avee/Design/PlaybackDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {p1, v0, v1}, Lcom/daaw/avee/Common/Events/WeakEvent1;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent1$Handler;Ljava/util/List;)V

    .line 140
    sget-object p1, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->onRepeatModeChanged:Lcom/daaw/avee/Common/Events/WeakEvent1;

    new-instance v0, Lcom/daaw/avee/Design/PlaybackDesign$7;

    invoke-direct {v0, p0}, Lcom/daaw/avee/Design/PlaybackDesign$7;-><init>(Lcom/daaw/avee/Design/PlaybackDesign;)V

    iget-object v1, p0, Lcom/daaw/avee/Design/PlaybackDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {p1, v0, v1}, Lcom/daaw/avee/Common/Events/WeakEvent1;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent1$Handler;Ljava/util/List;)V

    .line 165
    sget-object p1, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->onDestroyed:Lcom/daaw/avee/Common/Events/WeakEvent1;

    new-instance v0, Lcom/daaw/avee/Design/PlaybackDesign$8;

    invoke-direct {v0, p0}, Lcom/daaw/avee/Design/PlaybackDesign$8;-><init>(Lcom/daaw/avee/Design/PlaybackDesign;)V

    iget-object v1, p0, Lcom/daaw/avee/Design/PlaybackDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {p1, v0, v1}, Lcom/daaw/avee/Common/Events/WeakEvent1;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent1$Handler;Ljava/util/List;)V

    .line 181
    sget-object p1, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->onVolumeMaxChanged:Lcom/daaw/avee/Common/Events/WeakEvent1;

    new-instance v0, Lcom/daaw/avee/Design/PlaybackDesign$9;

    invoke-direct {v0, p0}, Lcom/daaw/avee/Design/PlaybackDesign$9;-><init>(Lcom/daaw/avee/Design/PlaybackDesign;)V

    iget-object v1, p0, Lcom/daaw/avee/Design/PlaybackDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {p1, v0, v1}, Lcom/daaw/avee/Common/Events/WeakEvent1;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent1$Handler;Ljava/util/List;)V

    .line 187
    sget-object p1, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->onVolumeMuteChanged:Lcom/daaw/avee/Common/Events/WeakEvent1;

    new-instance v0, Lcom/daaw/avee/Design/PlaybackDesign$10;

    invoke-direct {v0, p0}, Lcom/daaw/avee/Design/PlaybackDesign$10;-><init>(Lcom/daaw/avee/Design/PlaybackDesign;)V

    iget-object v1, p0, Lcom/daaw/avee/Design/PlaybackDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {p1, v0, v1}, Lcom/daaw/avee/Common/Events/WeakEvent1;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent1$Handler;Ljava/util/List;)V

    .line 193
    sget-object p1, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->onRequestVolumeMuteState:Lcom/daaw/avee/Common/Events/WeakEventR;

    new-instance v0, Lcom/daaw/avee/Design/PlaybackDesign$11;

    invoke-direct {v0, p0}, Lcom/daaw/avee/Design/PlaybackDesign$11;-><init>(Lcom/daaw/avee/Design/PlaybackDesign;)V

    iget-object v1, p0, Lcom/daaw/avee/Design/PlaybackDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {p1, v0, v1}, Lcom/daaw/avee/Common/Events/WeakEventR;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEventR$Handler;Ljava/util/List;)V

    .line 199
    sget-object p1, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->onRequestVolumeStereoBalance:Lcom/daaw/avee/Common/Events/WeakEventR;

    new-instance v0, Lcom/daaw/avee/Design/PlaybackDesign$12;

    invoke-direct {v0, p0}, Lcom/daaw/avee/Design/PlaybackDesign$12;-><init>(Lcom/daaw/avee/Design/PlaybackDesign;)V

    iget-object v1, p0, Lcom/daaw/avee/Design/PlaybackDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {p1, v0, v1}, Lcom/daaw/avee/Common/Events/WeakEventR;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEventR$Handler;Ljava/util/List;)V

    .line 206
    sget-object p1, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->onRequestCrossfadeValue:Lcom/daaw/avee/Common/Events/WeakEventR;

    new-instance v0, Lcom/daaw/avee/Design/PlaybackDesign$13;

    invoke-direct {v0, p0}, Lcom/daaw/avee/Design/PlaybackDesign$13;-><init>(Lcom/daaw/avee/Design/PlaybackDesign;)V

    iget-object v1, p0, Lcom/daaw/avee/Design/PlaybackDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {p1, v0, v1}, Lcom/daaw/avee/Common/Events/WeakEventR;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEventR$Handler;Ljava/util/List;)V

    .line 212
    sget-object p1, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->onHeadsetAssistAction:Lcom/daaw/avee/Common/Events/WeakEvent;

    new-instance v0, Lcom/daaw/avee/Design/PlaybackDesign$14;

    invoke-direct {v0, p0}, Lcom/daaw/avee/Design/PlaybackDesign$14;-><init>(Lcom/daaw/avee/Design/PlaybackDesign;)V

    iget-object v1, p0, Lcom/daaw/avee/Design/PlaybackDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {p1, v0, v1}, Lcom/daaw/avee/Common/Events/WeakEvent;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent$Handler;Ljava/util/List;)V

    .line 232
    sget-object p1, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->onUIPrevAction:Lcom/daaw/avee/Common/Events/WeakEvent;

    new-instance v0, Lcom/daaw/avee/Design/PlaybackDesign$15;

    invoke-direct {v0, p0}, Lcom/daaw/avee/Design/PlaybackDesign$15;-><init>(Lcom/daaw/avee/Design/PlaybackDesign;)V

    iget-object v1, p0, Lcom/daaw/avee/Design/PlaybackDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {p1, v0, v1}, Lcom/daaw/avee/Common/Events/WeakEvent;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent$Handler;Ljava/util/List;)V

    .line 244
    sget-object p1, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->onUINextAction:Lcom/daaw/avee/Common/Events/WeakEvent;

    new-instance v0, Lcom/daaw/avee/Design/PlaybackDesign$16;

    invoke-direct {v0, p0}, Lcom/daaw/avee/Design/PlaybackDesign$16;-><init>(Lcom/daaw/avee/Design/PlaybackDesign;)V

    iget-object v1, p0, Lcom/daaw/avee/Design/PlaybackDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {p1, v0, v1}, Lcom/daaw/avee/Common/Events/WeakEvent;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent$Handler;Ljava/util/List;)V

    .line 257
    sget-object p1, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->onRequestAlbumArtLarge:Lcom/daaw/avee/Common/Events/WeakEvent5;

    new-instance v0, Lcom/daaw/avee/Design/PlaybackDesign$17;

    invoke-direct {v0, p0}, Lcom/daaw/avee/Design/PlaybackDesign$17;-><init>(Lcom/daaw/avee/Design/PlaybackDesign;)V

    iget-object v1, p0, Lcom/daaw/avee/Design/PlaybackDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {p1, v0, v1}, Lcom/daaw/avee/Common/Events/WeakEvent5;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent5$Handler;Ljava/util/List;)V

    .line 300
    sget-object p1, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->onSelectMusicSysAction:Lcom/daaw/avee/Common/Events/WeakEvent1;

    new-instance v0, Lcom/daaw/avee/Design/PlaybackDesign$18;

    invoke-direct {v0, p0}, Lcom/daaw/avee/Design/PlaybackDesign$18;-><init>(Lcom/daaw/avee/Design/PlaybackDesign;)V

    iget-object v1, p0, Lcom/daaw/avee/Design/PlaybackDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {p1, v0, v1}, Lcom/daaw/avee/Common/Events/WeakEvent1;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent1$Handler;Ljava/util/List;)V

    .line 310
    sget-object p1, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->onTrackSelect:Lcom/daaw/avee/Common/Events/WeakEvent1;

    new-instance v0, Lcom/daaw/avee/Design/PlaybackDesign$19;

    invoke-direct {v0, p0}, Lcom/daaw/avee/Design/PlaybackDesign$19;-><init>(Lcom/daaw/avee/Design/PlaybackDesign;)V

    iget-object v1, p0, Lcom/daaw/avee/Design/PlaybackDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {p1, v0, v1}, Lcom/daaw/avee/Common/Events/WeakEvent1;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent1$Handler;Ljava/util/List;)V

    .line 318
    sget-object p1, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->onToggleMuteAction:Lcom/daaw/avee/Common/Events/WeakEvent;

    new-instance v0, Lcom/daaw/avee/Design/PlaybackDesign$20;

    invoke-direct {v0, p0}, Lcom/daaw/avee/Design/PlaybackDesign$20;-><init>(Lcom/daaw/avee/Design/PlaybackDesign;)V

    iget-object v1, p0, Lcom/daaw/avee/Design/PlaybackDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {p1, v0, v1}, Lcom/daaw/avee/Common/Events/WeakEvent;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent$Handler;Ljava/util/List;)V

    .line 325
    sget-object p1, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->onRequestMusicSystemIndex:Lcom/daaw/avee/Common/Events/WeakEventR;

    new-instance v0, Lcom/daaw/avee/Design/PlaybackDesign$21;

    invoke-direct {v0, p0}, Lcom/daaw/avee/Design/PlaybackDesign$21;-><init>(Lcom/daaw/avee/Design/PlaybackDesign;)V

    iget-object v1, p0, Lcom/daaw/avee/Design/PlaybackDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {p1, v0, v1}, Lcom/daaw/avee/Common/Events/WeakEventR;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEventR$Handler;Ljava/util/List;)V

    .line 332
    sget-object p1, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->onRequestVolumeMuteState:Lcom/daaw/avee/Common/Events/WeakEventR;

    new-instance v0, Lcom/daaw/avee/Design/PlaybackDesign$22;

    invoke-direct {v0, p0}, Lcom/daaw/avee/Design/PlaybackDesign$22;-><init>(Lcom/daaw/avee/Design/PlaybackDesign;)V

    iget-object v1, p0, Lcom/daaw/avee/Design/PlaybackDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {p1, v0, v1}, Lcom/daaw/avee/Common/Events/WeakEventR;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEventR$Handler;Ljava/util/List;)V

    .line 339
    sget-object p1, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->onRequestAudioEffectsActiveState:Lcom/daaw/avee/Common/Events/WeakEventR;

    new-instance v0, Lcom/daaw/avee/Design/PlaybackDesign$23;

    invoke-direct {v0, p0}, Lcom/daaw/avee/Design/PlaybackDesign$23;-><init>(Lcom/daaw/avee/Design/PlaybackDesign;)V

    iget-object v1, p0, Lcom/daaw/avee/Design/PlaybackDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {p1, v0, v1}, Lcom/daaw/avee/Common/Events/WeakEventR;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEventR$Handler;Ljava/util/List;)V

    .line 346
    sget-object p1, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->onRequestAudioVolumeState:Lcom/daaw/avee/Common/Events/WeakEventR;

    new-instance v0, Lcom/daaw/avee/Design/PlaybackDesign$24;

    invoke-direct {v0, p0}, Lcom/daaw/avee/Design/PlaybackDesign$24;-><init>(Lcom/daaw/avee/Design/PlaybackDesign;)V

    iget-object v1, p0, Lcom/daaw/avee/Design/PlaybackDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {p1, v0, v1}, Lcom/daaw/avee/Common/Events/WeakEventR;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEventR$Handler;Ljava/util/List;)V

    .line 355
    sget-object p1, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->onRequestAudioBalanceState:Lcom/daaw/avee/Common/Events/WeakEventR;

    new-instance v0, Lcom/daaw/avee/Design/PlaybackDesign$25;

    invoke-direct {v0, p0}, Lcom/daaw/avee/Design/PlaybackDesign$25;-><init>(Lcom/daaw/avee/Design/PlaybackDesign;)V

    iget-object v1, p0, Lcom/daaw/avee/Design/PlaybackDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {p1, v0, v1}, Lcom/daaw/avee/Common/Events/WeakEventR;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEventR$Handler;Ljava/util/List;)V

    .line 363
    sget-object p1, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->onRequestAudioEffectVirtualizerState:Lcom/daaw/avee/Common/Events/WeakEventR;

    new-instance v0, Lcom/daaw/avee/Design/PlaybackDesign$26;

    invoke-direct {v0, p0}, Lcom/daaw/avee/Design/PlaybackDesign$26;-><init>(Lcom/daaw/avee/Design/PlaybackDesign;)V

    iget-object v1, p0, Lcom/daaw/avee/Design/PlaybackDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {p1, v0, v1}, Lcom/daaw/avee/Common/Events/WeakEventR;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEventR$Handler;Ljava/util/List;)V

    .line 370
    sget-object p1, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->onRequestCrossFadeState:Lcom/daaw/avee/Common/Events/WeakEventR;

    new-instance v0, Lcom/daaw/avee/Design/PlaybackDesign$27;

    invoke-direct {v0, p0}, Lcom/daaw/avee/Design/PlaybackDesign$27;-><init>(Lcom/daaw/avee/Design/PlaybackDesign;)V

    iget-object v1, p0, Lcom/daaw/avee/Design/PlaybackDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {p1, v0, v1}, Lcom/daaw/avee/Common/Events/WeakEventR;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEventR$Handler;Ljava/util/List;)V

    .line 378
    sget-object p1, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->onSetAudioVolume:Lcom/daaw/avee/Common/Events/WeakEvent2;

    new-instance v0, Lcom/daaw/avee/Design/PlaybackDesign$28;

    invoke-direct {v0, p0}, Lcom/daaw/avee/Design/PlaybackDesign$28;-><init>(Lcom/daaw/avee/Design/PlaybackDesign;)V

    iget-object v1, p0, Lcom/daaw/avee/Design/PlaybackDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {p1, v0, v1}, Lcom/daaw/avee/Common/Events/WeakEvent2;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent2$Handler;Ljava/util/List;)V

    .line 385
    sget-object p1, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->onSetAudioStereoBalance:Lcom/daaw/avee/Common/Events/WeakEvent2;

    new-instance v0, Lcom/daaw/avee/Design/PlaybackDesign$29;

    invoke-direct {v0, p0}, Lcom/daaw/avee/Design/PlaybackDesign$29;-><init>(Lcom/daaw/avee/Design/PlaybackDesign;)V

    iget-object v1, p0, Lcom/daaw/avee/Design/PlaybackDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {p1, v0, v1}, Lcom/daaw/avee/Common/Events/WeakEvent2;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent2$Handler;Ljava/util/List;)V

    .line 392
    sget-object p1, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->onSetCrossFade:Lcom/daaw/avee/Common/Events/WeakEvent2;

    new-instance v0, Lcom/daaw/avee/Design/PlaybackDesign$30;

    invoke-direct {v0, p0}, Lcom/daaw/avee/Design/PlaybackDesign$30;-><init>(Lcom/daaw/avee/Design/PlaybackDesign;)V

    iget-object v1, p0, Lcom/daaw/avee/Design/PlaybackDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {p1, v0, v1}, Lcom/daaw/avee/Common/Events/WeakEvent2;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent2$Handler;Ljava/util/List;)V

    .line 399
    sget-object p1, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->onRequestAudioViewExpandedState:Lcom/daaw/avee/Common/Events/WeakEventR;

    new-instance v0, Lcom/daaw/avee/Design/PlaybackDesign$31;

    invoke-direct {v0, p0}, Lcom/daaw/avee/Design/PlaybackDesign$31;-><init>(Lcom/daaw/avee/Design/PlaybackDesign;)V

    iget-object v1, p0, Lcom/daaw/avee/Design/PlaybackDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {p1, v0, v1}, Lcom/daaw/avee/Common/Events/WeakEventR;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEventR$Handler;Ljava/util/List;)V

    .line 406
    sget-object p1, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->onSetAudioViewExpandedState:Lcom/daaw/avee/Common/Events/WeakEvent1;

    new-instance v0, Lcom/daaw/avee/Design/PlaybackDesign$32;

    invoke-direct {v0, p0}, Lcom/daaw/avee/Design/PlaybackDesign$32;-><init>(Lcom/daaw/avee/Design/PlaybackDesign;)V

    iget-object v1, p0, Lcom/daaw/avee/Design/PlaybackDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {p1, v0, v1}, Lcom/daaw/avee/Common/Events/WeakEvent1;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent1$Handler;Ljava/util/List;)V

    .line 413
    sget-object p1, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->onRequestRepeatMode:Lcom/daaw/avee/Common/Events/WeakEventR;

    new-instance v0, Lcom/daaw/avee/Design/PlaybackDesign$33;

    invoke-direct {v0, p0}, Lcom/daaw/avee/Design/PlaybackDesign$33;-><init>(Lcom/daaw/avee/Design/PlaybackDesign;)V

    iget-object v1, p0, Lcom/daaw/avee/Design/PlaybackDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {p1, v0, v1}, Lcom/daaw/avee/Common/Events/WeakEventR;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEventR$Handler;Ljava/util/List;)V

    .line 420
    sget-object p1, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->onSetRepeatMode:Lcom/daaw/avee/Common/Events/WeakEvent1;

    new-instance v0, Lcom/daaw/avee/Design/PlaybackDesign$34;

    invoke-direct {v0, p0}, Lcom/daaw/avee/Design/PlaybackDesign$34;-><init>(Lcom/daaw/avee/Design/PlaybackDesign;)V

    iget-object v1, p0, Lcom/daaw/avee/Design/PlaybackDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {p1, v0, v1}, Lcom/daaw/avee/Common/Events/WeakEvent1;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent1$Handler;Ljava/util/List;)V

    .line 427
    sget-object p1, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->onRequestTrackInfo:Lcom/daaw/avee/Common/Events/WeakEventR;

    new-instance v0, Lcom/daaw/avee/Design/PlaybackDesign$35;

    invoke-direct {v0, p0}, Lcom/daaw/avee/Design/PlaybackDesign$35;-><init>(Lcom/daaw/avee/Design/PlaybackDesign;)V

    iget-object v1, p0, Lcom/daaw/avee/Design/PlaybackDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {p1, v0, v1}, Lcom/daaw/avee/Common/Events/WeakEventR;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEventR$Handler;Ljava/util/List;)V

    .line 434
    sget-object p1, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->onRequestPlaystate:Lcom/daaw/avee/Common/Events/WeakEventR;

    new-instance v0, Lcom/daaw/avee/Design/PlaybackDesign$36;

    invoke-direct {v0, p0}, Lcom/daaw/avee/Design/PlaybackDesign$36;-><init>(Lcom/daaw/avee/Design/PlaybackDesign;)V

    iget-object v1, p0, Lcom/daaw/avee/Design/PlaybackDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {p1, v0, v1}, Lcom/daaw/avee/Common/Events/WeakEventR;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEventR$Handler;Ljava/util/List;)V

    .line 441
    sget-object p1, Lcom/daaw/avee/MainActivity;->onExit:Lcom/daaw/avee/Common/Events/WeakEvent;

    new-instance v0, Lcom/daaw/avee/Design/PlaybackDesign$37;

    invoke-direct {v0, p0}, Lcom/daaw/avee/Design/PlaybackDesign$37;-><init>(Lcom/daaw/avee/Design/PlaybackDesign;)V

    iget-object v1, p0, Lcom/daaw/avee/Design/PlaybackDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {p1, v0, v1}, Lcom/daaw/avee/Common/Events/WeakEvent;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent$Handler;Ljava/util/List;)V

    .line 448
    sget-object p1, Lcom/daaw/avee/MainActivity;->onStart:Lcom/daaw/avee/Common/Events/WeakEvent1;

    new-instance v0, Lcom/daaw/avee/Design/PlaybackDesign$38;

    invoke-direct {v0, p0}, Lcom/daaw/avee/Design/PlaybackDesign$38;-><init>(Lcom/daaw/avee/Design/PlaybackDesign;)V

    iget-object v1, p0, Lcom/daaw/avee/Design/PlaybackDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {p1, v0, v1}, Lcom/daaw/avee/Common/Events/WeakEvent1;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent1$Handler;Ljava/util/List;)V

    .line 457
    sget-object p1, Lcom/daaw/avee/MainActivity;->onStop:Lcom/daaw/avee/Common/Events/WeakEvent1;

    new-instance v0, Lcom/daaw/avee/Design/PlaybackDesign$39;

    invoke-direct {v0, p0}, Lcom/daaw/avee/Design/PlaybackDesign$39;-><init>(Lcom/daaw/avee/Design/PlaybackDesign;)V

    iget-object v1, p0, Lcom/daaw/avee/Design/PlaybackDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {p1, v0, v1}, Lcom/daaw/avee/Common/Events/WeakEvent1;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent1$Handler;Ljava/util/List;)V

    .line 472
    sget-object p1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->onIntPreferenceChanged:Lcom/daaw/avee/Common/Events/WeakEvent3;

    new-instance v0, Lcom/daaw/avee/Design/PlaybackDesign$40;

    invoke-direct {v0, p0}, Lcom/daaw/avee/Design/PlaybackDesign$40;-><init>(Lcom/daaw/avee/Design/PlaybackDesign;)V

    iget-object v1, p0, Lcom/daaw/avee/Design/PlaybackDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {p1, v0, v1}, Lcom/daaw/avee/Common/Events/WeakEvent3;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent3$Handler;Ljava/util/List;)V

    .line 491
    sget-object p1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->onBoolPreferenceChanged:Lcom/daaw/avee/Common/Events/WeakEvent2;

    new-instance v0, Lcom/daaw/avee/Design/PlaybackDesign$41;

    invoke-direct {v0, p0}, Lcom/daaw/avee/Design/PlaybackDesign$41;-><init>(Lcom/daaw/avee/Design/PlaybackDesign;)V

    iget-object v1, p0, Lcom/daaw/avee/Design/PlaybackDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {p1, v0, v1}, Lcom/daaw/avee/Common/Events/WeakEvent2;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent2$Handler;Ljava/util/List;)V

    return-void
.end method

.method static synthetic access$000(Lcom/daaw/avee/Design/PlaybackDesign;)I
    .locals 0

    .line 48
    invoke-direct {p0}, Lcom/daaw/avee/Design/PlaybackDesign;->onRequestMediaPlayerCoreIndex()I

    move-result p0

    return p0
.end method

.method static synthetic access$100(Lcom/daaw/avee/Design/PlaybackDesign;)Landroid/os/Handler;
    .locals 0

    .line 48
    iget-object p0, p0, Lcom/daaw/avee/Design/PlaybackDesign;->mainThreadHandler:Landroid/os/Handler;

    return-object p0
.end method

.method static synthetic access$200(Lcom/daaw/avee/Design/PlaybackDesign;)F
    .locals 0

    .line 48
    invoke-direct {p0}, Lcom/daaw/avee/Design/PlaybackDesign;->getCrossFadeMultiplier()F

    move-result p0

    return p0
.end method

.method static synthetic access$300(Lcom/daaw/avee/Design/PlaybackDesign;)Z
    .locals 0

    .line 48
    invoke-direct {p0}, Lcom/daaw/avee/Design/PlaybackDesign;->requestAudioEffectsActiveState()Z

    move-result p0

    return p0
.end method

.method private getCrossFadeMultiplier()F
    .locals 1

    const/high16 v0, 0x3f800000    # 1.0f

    return v0
.end method

.method private onRequestMediaPlayerCoreIndex()I
    .locals 2

    .line 558
    invoke-static {}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->createOrGetInstance()Lcom/daaw/avee/comp/AppPreferences/AppPreferences;

    move-result-object v0

    sget v1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Int_playbackEngine:I

    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->getInt(I)I

    move-result v0

    return v0
.end method

.method private requestAudioEffectsActiveState()Z
    .locals 2

    .line 562
    invoke-static {}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->createOrGetInstance()Lcom/daaw/avee/comp/AppPreferences/AppPreferences;

    move-result-object v0

    sget v1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Int_volumeStereoBalance:I

    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->getInt(I)I

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method


# virtual methods
.method public onPlayStateChanged(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Lcom/daaw/avee/comp/playback/Song/PlaylistSong;Z)V
    .locals 6

    .line 587
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p3

    sput-boolean p3, Lcom/daaw/avee/Design/PlaybackDesign;->isPlaying:Z

    .line 588
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p3

    sput-boolean p3, Lcom/daaw/avee/Design/PlaybackDesign;->wantsPlaying:Z

    .line 590
    iget-object p3, p0, Lcom/daaw/avee/Design/PlaybackDesign;->mainThreadHandler:Landroid/os/Handler;

    new-instance p5, Lcom/daaw/avee/Design/PlaybackDesign$43;

    move-object v0, p5

    move-object v1, p0

    move-object v2, p4

    move-object v3, p1

    move-object v4, p2

    move v5, p6

    invoke-direct/range {v0 .. v5}, Lcom/daaw/avee/Design/PlaybackDesign$43;-><init>(Lcom/daaw/avee/Design/PlaybackDesign;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Z)V

    invoke-virtual {p3, p5}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public onPlaybackCompleted(Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Long;ZLcom/daaw/avee/comp/playback/Song/PlaylistSong;)V
    .locals 7

    .line 516
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-nez p2, :cond_0

    return-void

    .line 518
    :cond_0
    iget-object p2, p0, Lcom/daaw/avee/Design/PlaybackDesign;->mainThreadHandler:Landroid/os/Handler;

    new-instance v6, Lcom/daaw/avee/Design/PlaybackDesign$42;

    move-object v0, v6

    move-object v1, p0

    move v2, p4

    move-object v3, p5

    move-object v4, p3

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, Lcom/daaw/avee/Design/PlaybackDesign$42;-><init>(Lcom/daaw/avee/Design/PlaybackDesign;ZLcom/daaw/avee/comp/playback/Song/PlaylistSong;Ljava/lang/Long;Ljava/lang/Integer;)V

    invoke-virtual {p2, v6}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public onViewPagerPageSelected(Ljava/lang/Integer;Landroid/app/Activity;Z)V
    .locals 1

    .line 579
    invoke-static {}, Lcom/daaw/avee/MainActivity;->getInstance()Lcom/daaw/avee/MainActivity;

    move-result-object p2

    if-eqz p2, :cond_2

    if-nez p3, :cond_1

    .line 581
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    sget-boolean p1, Lcom/daaw/avee/Design/PlaybackDesign;->isPlaying:Z

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    invoke-virtual {p2, p1, p3}, Lcom/daaw/avee/MainActivity;->setKeepScreenOnLock(ZZ)V

    :cond_2
    return-void
.end method

.method public selectMediaPlayerCoreIndex(Ljava/lang/Integer;)V
    .locals 1

    .line 550
    sget-object v0, Lcom/daaw/avee/comp/playback/EventsPlaybackService$Receive;->PlaybackControls_selectMediaPlayerCoreIndex:Lcom/daaw/avee/Common/Events/WeakDelegate1;

    invoke-virtual {v0, p1}, Lcom/daaw/avee/Common/Events/WeakDelegate1;->invoke(Ljava/lang/Object;)V

    .line 552
    invoke-static {}, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->getInstance()Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 554
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/MediaControlsUI/MediaControlsUI;->onMusicSysChanged(I)V

    :cond_0
    return-void
.end method

.method public updateKeepScreenOnLock(Z)V
    .locals 2

    .line 615
    iget-object v0, p0, Lcom/daaw/avee/Design/PlaybackDesign;->mainThreadHandler:Landroid/os/Handler;

    new-instance v1, Lcom/daaw/avee/Design/PlaybackDesign$44;

    invoke-direct {v1, p0, p1}, Lcom/daaw/avee/Design/PlaybackDesign$44;-><init>(Lcom/daaw/avee/Design/PlaybackDesign;Z)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
