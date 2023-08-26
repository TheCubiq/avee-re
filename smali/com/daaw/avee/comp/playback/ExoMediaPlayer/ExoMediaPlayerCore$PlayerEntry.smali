.class Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;
.super Ljava/lang/Object;
.source "ExoMediaPlayerCore.java"

# interfaces
.implements Lcom/google/android/exoplayer2/Player$EventListener;
.implements Lcom/google/android/exoplayer2/metadata/MetadataRenderer$Output;
.implements Lcom/google/android/exoplayer2/SimpleExoPlayer$VideoListener;
.implements Lcom/google/android/exoplayer2/text/TextRenderer$Output;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "PlayerEntry"
.end annotation


# instance fields
.field private final BANDWIDTH_METER:Lcom/google/android/exoplayer2/upstream/DefaultBandwidthMeter;

.field private context:Landroid/content/Context;

.field dataSource:Lcom/daaw/avee/comp/playback/Song/IMediaDataSource;

.field private fadeVolume:F

.field private lastPlaybackState:I

.field private mediaDataSourceFactory:Lcom/google/android/exoplayer2/upstream/DataSource$Factory;

.field mediaSource:Lcom/google/android/exoplayer2/source/MediaSource;

.field private player:Lcom/google/android/exoplayer2/SimpleExoPlayer;

.field private playerEntryIndexId:I

.field private startFadeVolume:F

.field final synthetic this$0:Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;

.field private trackSelector:Lcom/google/android/exoplayer2/trackselection/MappingTrackSelector;

.field private volume:F

.field private volumeStereoBalance:F


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;Landroid/content/Context;I)V
    .locals 0

    .line 662
    iput-object p1, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->this$0:Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 647
    new-instance p1, Lcom/google/android/exoplayer2/upstream/DefaultBandwidthMeter;

    invoke-direct {p1}, Lcom/google/android/exoplayer2/upstream/DefaultBandwidthMeter;-><init>()V

    iput-object p1, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->BANDWIDTH_METER:Lcom/google/android/exoplayer2/upstream/DefaultBandwidthMeter;

    const/4 p1, 0x0

    .line 653
    iput p1, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->lastPlaybackState:I

    const/high16 p1, 0x3f800000    # 1.0f

    .line 654
    iput p1, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->volume:F

    const/4 p1, 0x0

    .line 655
    iput p1, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->fadeVolume:F

    .line 656
    iput p1, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->volumeStereoBalance:F

    .line 658
    iput p1, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->startFadeVolume:F

    .line 663
    iput-object p2, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->context:Landroid/content/Context;

    .line 664
    iput p3, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->playerEntryIndexId:I

    const/4 p1, 0x1

    .line 665
    invoke-direct {p0, p1}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->buildDataSourceFactory(Z)Lcom/google/android/exoplayer2/upstream/DataSource$Factory;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->mediaDataSourceFactory:Lcom/google/android/exoplayer2/upstream/DataSource$Factory;

    return-void
.end method

.method static synthetic access$400(Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;)I
    .locals 0

    .line 641
    iget p0, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->playerEntryIndexId:I

    return p0
.end method

.method static synthetic access$700(Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;)V
    .locals 0

    .line 641
    invoke-direct {p0}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->releasePlayer()V

    return-void
.end method

.method static synthetic access$800(Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;)Lcom/google/android/exoplayer2/SimpleExoPlayer;
    .locals 0

    .line 641
    iget-object p0, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->player:Lcom/google/android/exoplayer2/SimpleExoPlayer;

    return-object p0
.end method

.method private buildDataSourceFactory(Z)Lcom/google/android/exoplayer2/upstream/DataSource$Factory;
    .locals 0

    if-eqz p1, :cond_0

    .line 696
    iget-object p1, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->BANDWIDTH_METER:Lcom/google/android/exoplayer2/upstream/DefaultBandwidthMeter;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->buildDataSourceFactory(Lcom/google/android/exoplayer2/upstream/TransferListener;)Lcom/google/android/exoplayer2/upstream/DataSource$Factory;

    move-result-object p1

    return-object p1
.end method

.method private buildMediaSource(Landroid/net/Uri;ILjava/lang/String;)Lcom/google/android/exoplayer2/source/MediaSource;
    .locals 2

    .line 705
    invoke-static {p1, p3}, Lcom/google/android/exoplayer2/util/Util;->inferContentType(Landroid/net/Uri;Ljava/lang/String;)I

    move-result p2

    const/4 p3, 0x0

    if-eqz p2, :cond_3

    const/4 v0, 0x1

    if-eq p2, v0, :cond_2

    const/4 p3, 0x2

    if-eq p2, p3, :cond_1

    const/4 p3, 0x3

    if-ne p2, p3, :cond_0

    .line 730
    new-instance p2, Lcom/google/android/exoplayer2/source/ExtractorMediaSource$Factory;

    iget-object p3, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->mediaDataSourceFactory:Lcom/google/android/exoplayer2/upstream/DataSource$Factory;

    invoke-direct {p2, p3}, Lcom/google/android/exoplayer2/source/ExtractorMediaSource$Factory;-><init>(Lcom/google/android/exoplayer2/upstream/DataSource$Factory;)V

    invoke-virtual {p2, p1}, Lcom/google/android/exoplayer2/source/ExtractorMediaSource$Factory;->createMediaSource(Landroid/net/Uri;)Lcom/google/android/exoplayer2/source/ExtractorMediaSource;

    move-result-object p1

    return-object p1

    .line 732
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Unsupported type: "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 724
    :cond_1
    new-instance p2, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource$Factory;

    iget-object p3, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->mediaDataSourceFactory:Lcom/google/android/exoplayer2/upstream/DataSource$Factory;

    invoke-direct {p2, p3}, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource$Factory;-><init>(Lcom/google/android/exoplayer2/upstream/DataSource$Factory;)V

    new-instance p3, Lcom/google/android/exoplayer2/offline/FilteringManifestParser;

    new-instance v0, Lcom/google/android/exoplayer2/source/hls/playlist/HlsPlaylistParser;

    invoke-direct {v0}, Lcom/google/android/exoplayer2/source/hls/playlist/HlsPlaylistParser;-><init>()V

    .line 727
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->getOfflineStreamKeys(Landroid/net/Uri;)Ljava/util/List;

    move-result-object v1

    invoke-direct {p3, v0, v1}, Lcom/google/android/exoplayer2/offline/FilteringManifestParser;-><init>(Lcom/google/android/exoplayer2/upstream/ParsingLoadable$Parser;Ljava/util/List;)V

    .line 725
    invoke-virtual {p2, p3}, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource$Factory;->setPlaylistParser(Lcom/google/android/exoplayer2/upstream/ParsingLoadable$Parser;)Lcom/google/android/exoplayer2/source/hls/HlsMediaSource$Factory;

    move-result-object p2

    .line 728
    invoke-virtual {p2, p1}, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource$Factory;->createMediaSource(Landroid/net/Uri;)Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;

    move-result-object p1

    return-object p1

    .line 716
    :cond_2
    new-instance p2, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource$Factory;

    new-instance v0, Lcom/google/android/exoplayer2/source/smoothstreaming/DefaultSsChunkSource$Factory;

    iget-object v1, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->mediaDataSourceFactory:Lcom/google/android/exoplayer2/upstream/DataSource$Factory;

    invoke-direct {v0, v1}, Lcom/google/android/exoplayer2/source/smoothstreaming/DefaultSsChunkSource$Factory;-><init>(Lcom/google/android/exoplayer2/upstream/DataSource$Factory;)V

    .line 718
    invoke-direct {p0, p3}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->buildDataSourceFactory(Z)Lcom/google/android/exoplayer2/upstream/DataSource$Factory;

    move-result-object p3

    invoke-direct {p2, v0, p3}, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource$Factory;-><init>(Lcom/google/android/exoplayer2/source/smoothstreaming/SsChunkSource$Factory;Lcom/google/android/exoplayer2/upstream/DataSource$Factory;)V

    new-instance p3, Lcom/google/android/exoplayer2/offline/FilteringManifestParser;

    new-instance v0, Lcom/google/android/exoplayer2/source/smoothstreaming/manifest/SsManifestParser;

    invoke-direct {v0}, Lcom/google/android/exoplayer2/source/smoothstreaming/manifest/SsManifestParser;-><init>()V

    .line 721
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->getOfflineStreamKeys(Landroid/net/Uri;)Ljava/util/List;

    move-result-object v1

    invoke-direct {p3, v0, v1}, Lcom/google/android/exoplayer2/offline/FilteringManifestParser;-><init>(Lcom/google/android/exoplayer2/upstream/ParsingLoadable$Parser;Ljava/util/List;)V

    .line 719
    invoke-virtual {p2, p3}, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource$Factory;->setManifestParser(Lcom/google/android/exoplayer2/upstream/ParsingLoadable$Parser;)Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource$Factory;

    move-result-object p2

    .line 722
    invoke-virtual {p2, p1}, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource$Factory;->createMediaSource(Landroid/net/Uri;)Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;

    move-result-object p1

    return-object p1

    .line 708
    :cond_3
    new-instance p2, Lcom/google/android/exoplayer2/source/dash/DashMediaSource$Factory;

    new-instance v0, Lcom/google/android/exoplayer2/source/dash/DefaultDashChunkSource$Factory;

    iget-object v1, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->mediaDataSourceFactory:Lcom/google/android/exoplayer2/upstream/DataSource$Factory;

    invoke-direct {v0, v1}, Lcom/google/android/exoplayer2/source/dash/DefaultDashChunkSource$Factory;-><init>(Lcom/google/android/exoplayer2/upstream/DataSource$Factory;)V

    .line 710
    invoke-direct {p0, p3}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->buildDataSourceFactory(Z)Lcom/google/android/exoplayer2/upstream/DataSource$Factory;

    move-result-object p3

    invoke-direct {p2, v0, p3}, Lcom/google/android/exoplayer2/source/dash/DashMediaSource$Factory;-><init>(Lcom/google/android/exoplayer2/source/dash/DashChunkSource$Factory;Lcom/google/android/exoplayer2/upstream/DataSource$Factory;)V

    new-instance p3, Lcom/google/android/exoplayer2/offline/FilteringManifestParser;

    new-instance v0, Lcom/google/android/exoplayer2/source/dash/manifest/DashManifestParser;

    invoke-direct {v0}, Lcom/google/android/exoplayer2/source/dash/manifest/DashManifestParser;-><init>()V

    .line 713
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->getOfflineStreamKeys(Landroid/net/Uri;)Ljava/util/List;

    move-result-object v1

    invoke-direct {p3, v0, v1}, Lcom/google/android/exoplayer2/offline/FilteringManifestParser;-><init>(Lcom/google/android/exoplayer2/upstream/ParsingLoadable$Parser;Ljava/util/List;)V

    .line 711
    invoke-virtual {p2, p3}, Lcom/google/android/exoplayer2/source/dash/DashMediaSource$Factory;->setManifestParser(Lcom/google/android/exoplayer2/upstream/ParsingLoadable$Parser;)Lcom/google/android/exoplayer2/source/dash/DashMediaSource$Factory;

    move-result-object p2

    .line 714
    invoke-virtual {p2, p1}, Lcom/google/android/exoplayer2/source/dash/DashMediaSource$Factory;->createMediaSource(Landroid/net/Uri;)Lcom/google/android/exoplayer2/source/dash/DashMediaSource;

    move-result-object p1

    return-object p1
.end method

.method private getMediaSource(Lcom/daaw/avee/comp/playback/Song/IMediaDataSource;)Lcom/google/android/exoplayer2/source/MediaSource;
    .locals 9

    const/4 v0, 0x1

    new-array v1, v0, [Landroid/net/Uri;

    .line 743
    invoke-interface {p1}, Lcom/daaw/avee/comp/playback/Song/IMediaDataSource;->getContentUri()Landroid/net/Uri;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    new-array v2, v0, [Ljava/lang/String;

    const-string v4, ""

    aput-object v4, v2, v3

    new-array v4, v0, [I

    .line 745
    invoke-interface {p1}, Lcom/daaw/avee/comp/playback/Song/IMediaDataSource;->getContentType()I

    move-result p1

    aput p1, v4, v3

    new-array p1, v0, [Lcom/google/android/exoplayer2/source/MediaSource;

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v0, :cond_0

    .line 749
    aget-object v6, v1, v5

    aget v7, v4, v5

    aget-object v8, v2, v5

    invoke-direct {p0, v6, v7, v8}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->buildMediaSource(Landroid/net/Uri;ILjava/lang/String;)Lcom/google/android/exoplayer2/source/MediaSource;

    move-result-object v6

    aput-object v6, p1, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 752
    :cond_0
    aget-object p1, p1, v3

    return-object p1
.end method

.method private releasePlayer()V
    .locals 2

    .line 824
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->player:Lcom/google/android/exoplayer2/SimpleExoPlayer;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 825
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->release()V

    .line 826
    iput-object v1, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->player:Lcom/google/android/exoplayer2/SimpleExoPlayer;

    .line 828
    :cond_0
    iput-object v1, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->trackSelector:Lcom/google/android/exoplayer2/trackselection/MappingTrackSelector;

    return-void
.end method


# virtual methods
.method public buildDataSourceFactory(Lcom/google/android/exoplayer2/upstream/TransferListener;)Lcom/google/android/exoplayer2/upstream/DataSource$Factory;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/exoplayer2/upstream/TransferListener<",
            "-",
            "Lcom/google/android/exoplayer2/upstream/DataSource;",
            ">;)",
            "Lcom/google/android/exoplayer2/upstream/DataSource$Factory;"
        }
    .end annotation

    .line 673
    new-instance v0, Lcom/google/android/exoplayer2/upstream/DefaultDataSourceFactory;

    iget-object v1, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->context:Landroid/content/Context;

    .line 674
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->buildHttpDataSourceFactory(Lcom/google/android/exoplayer2/upstream/TransferListener;)Lcom/google/android/exoplayer2/upstream/HttpDataSource$Factory;

    move-result-object v2

    invoke-direct {v0, v1, p1, v2}, Lcom/google/android/exoplayer2/upstream/DefaultDataSourceFactory;-><init>(Landroid/content/Context;Lcom/google/android/exoplayer2/upstream/TransferListener;Lcom/google/android/exoplayer2/upstream/DataSource$Factory;)V

    return-object v0
.end method

.method public buildHttpDataSourceFactory(Lcom/google/android/exoplayer2/upstream/TransferListener;)Lcom/google/android/exoplayer2/upstream/HttpDataSource$Factory;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/exoplayer2/upstream/TransferListener<",
            "-",
            "Lcom/google/android/exoplayer2/upstream/DataSource;",
            ">;)",
            "Lcom/google/android/exoplayer2/upstream/HttpDataSource$Factory;"
        }
    .end annotation

    .line 685
    new-instance v0, Lcom/google/android/exoplayer2/upstream/DefaultHttpDataSourceFactory;

    iget-object v1, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->this$0:Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;

    invoke-static {v1}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->access$900(Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Lcom/google/android/exoplayer2/upstream/DefaultHttpDataSourceFactory;-><init>(Ljava/lang/String;Lcom/google/android/exoplayer2/upstream/TransferListener;)V

    return-object v0
.end method

.method public getDuration()J
    .locals 7

    .line 865
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->player:Lcom/google/android/exoplayer2/SimpleExoPlayer;

    const-wide/16 v1, 0x0

    if-eqz v0, :cond_2

    .line 866
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->getDuration()J

    move-result-wide v3

    cmp-long v0, v3, v1

    if-gez v0, :cond_0

    return-wide v1

    :cond_0
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, v3, v5

    if-nez v0, :cond_1

    return-wide v1

    :cond_1
    return-wide v3

    :cond_2
    return-wide v1
.end method

.method public getOfflineStreamKeys(Landroid/net/Uri;)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            ")",
            "Ljava/util/List<",
            "*>;"
        }
    .end annotation

    .line 701
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method getVideoTrack()I
    .locals 1

    const/4 v0, -0x1

    return v0
.end method

.method public onCompletion(Lcom/google/android/exoplayer2/SimpleExoPlayer;)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    .line 1016
    :cond_0
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->this$0:Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;

    invoke-static {v0}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->access$1100(Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;)Lcom/google/android/exoplayer2/SimpleExoPlayer;

    move-result-object v0

    if-ne v0, p1, :cond_1

    .line 1017
    iget-object p1, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->this$0:Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;

    invoke-static {p1}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->access$000(Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;)Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;

    move-result-object p1

    invoke-interface {p1}, Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;->requestNextDataNow()V

    :cond_1
    return-void
.end method

.method public onCues(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/google/android/exoplayer2/text/Cue;",
            ">;)V"
        }
    .end annotation

    return-void
.end method

.method public onLoadingChanged(Z)V
    .locals 0

    return-void
.end method

.method public onMetadata(Lcom/google/android/exoplayer2/metadata/Metadata;)V
    .locals 0

    return-void
.end method

.method public onPlaybackParametersChanged(Lcom/google/android/exoplayer2/PlaybackParameters;)V
    .locals 0

    return-void
.end method

.method public onPlayerError(Lcom/google/android/exoplayer2/ExoPlaybackException;)V
    .locals 2

    .line 929
    invoke-virtual {p1}, Lcom/google/android/exoplayer2/ExoPlaybackException;->getMessage()Ljava/lang/String;

    move-result-object p1

    const-string v0, ""

    if-nez p1, :cond_0

    move-object p1, v0

    :cond_0
    const-string v1, "java.io.IOException:"

    .line 931
    invoke-virtual {p1, v1, v0}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    const-string v1, "java.lang.IllegalStateException"

    .line 932
    invoke-virtual {p1, v1, v0}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    .line 933
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x5

    if-ge v0, v1, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Error "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 935
    :cond_1
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->this$0:Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;

    invoke-static {v0}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->access$000(Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;)Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1, p1}, Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;->onMpPlaystateOrMetaChanged(ZLjava/lang/String;)V

    return-void
.end method

.method public onPlayerStateChanged(ZI)V
    .locals 4

    .line 901
    iget p1, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->lastPlaybackState:I

    if-ne p1, p2, :cond_0

    return-void

    .line 903
    :cond_0
    iput p2, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->lastPlaybackState:I

    .line 905
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->this$0:Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;

    invoke-static {v0}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->access$300(Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;)Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoEqualizerEffect;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 906
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->this$0:Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;

    invoke-static {v0}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->access$300(Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;)Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoEqualizerEffect;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoEqualizerEffect;->onCheckEqualizerLife()V

    :cond_1
    const/4 v0, 0x3

    if-eq p1, v0, :cond_2

    .line 911
    iget v1, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->startFadeVolume:F

    invoke-virtual {p0, v1}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->setFadeVolume(F)V

    .line 913
    iget-object v1, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->this$0:Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;

    invoke-static {v1}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->access$000(Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;)Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;

    move-result-object v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-interface {v1, v2, v3}, Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;->onMpPlaystateOrMetaChanged(ZLjava/lang/String;)V

    :cond_2
    const/4 v1, 0x2

    if-eq p1, v1, :cond_3

    if-ne p1, v0, :cond_4

    :cond_3
    const/4 p1, 0x4

    if-ne p2, p1, :cond_4

    .line 918
    iget-object p1, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->player:Lcom/google/android/exoplayer2/SimpleExoPlayer;

    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->onCompletion(Lcom/google/android/exoplayer2/SimpleExoPlayer;)V

    :cond_4
    return-void
.end method

.method public onPositionDiscontinuity(I)V
    .locals 0

    return-void
.end method

.method public onRenderedFirstFrame()V
    .locals 0

    return-void
.end method

.method public onRepeatModeChanged(I)V
    .locals 0

    return-void
.end method

.method public onSeekProcessed()V
    .locals 0

    return-void
.end method

.method public onShuffleModeEnabledChanged(Z)V
    .locals 0

    return-void
.end method

.method public onTimelineChanged(Lcom/google/android/exoplayer2/Timeline;Ljava/lang/Object;I)V
    .locals 0

    return-void
.end method

.method public onTracksChanged(Lcom/google/android/exoplayer2/source/TrackGroupArray;Lcom/google/android/exoplayer2/trackselection/TrackSelectionArray;)V
    .locals 0

    return-void
.end method

.method public onVideoSizeChanged(IIIF)V
    .locals 7

    .line 970
    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "width: "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " height: "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-static {p3}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    int-to-float p3, p1

    int-to-float v0, p2

    if-ge p1, p2, :cond_0

    move v6, v0

    move v0, p3

    move p3, v6

    :cond_0
    const/high16 v1, 0x3f800000    # 1.0f

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    cmpl-float v5, p3, v4

    if-lez v5, :cond_1

    const/4 v5, 0x1

    goto :goto_0

    :cond_1
    const/4 v5, 0x0

    :goto_0
    cmpl-float v4, v0, v4

    if-lez v4, :cond_2

    goto :goto_1

    :cond_2
    const/4 v2, 0x0

    :goto_1
    and-int/2addr v2, v5

    if-eqz v2, :cond_3

    mul-float p3, p3, p4

    div-float v1, p3, v0

    .line 984
    :cond_3
    iget-object p3, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->this$0:Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;

    invoke-static {p3}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->access$000(Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;)Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;

    move-result-object p3

    invoke-interface {p3, p1, p2, v1}, Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;->onNotifyVideoSizeChanged(IIF)V

    return-void
.end method

.method public pause()V
    .locals 2

    .line 880
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->player:Lcom/google/android/exoplayer2/SimpleExoPlayer;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 881
    invoke-virtual {v0, v1}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->setPlayWhenReady(Z)V

    :cond_0
    return-void
.end method

.method prepare(Lcom/google/android/exoplayer2/source/MediaSource;)V
    .locals 1

    .line 857
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->player:Lcom/google/android/exoplayer2/SimpleExoPlayer;

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    .line 858
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->this$0:Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;

    invoke-static {v0}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->access$1000(Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;)Lcom/daaw/avee/comp/playback/ExoMediaPlayer/IVisualizerDataCapturer;

    move-result-object v0

    invoke-interface {v0}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/IVisualizerDataCapturer;->onNewSource()V

    .line 859
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->player:Lcom/google/android/exoplayer2/SimpleExoPlayer;

    invoke-virtual {v0, p1}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->prepare(Lcom/google/android/exoplayer2/source/MediaSource;)V

    :cond_0
    return-void
.end method

.method preparePlayer(Lcom/daaw/avee/comp/playback/Song/IMediaDataSource;FJ)V
    .locals 6

    .line 770
    new-instance v0, Lcom/google/android/exoplayer2/trackselection/AdaptiveTrackSelection$Factory;

    iget-object v1, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->BANDWIDTH_METER:Lcom/google/android/exoplayer2/upstream/DefaultBandwidthMeter;

    invoke-direct {v0, v1}, Lcom/google/android/exoplayer2/trackselection/AdaptiveTrackSelection$Factory;-><init>(Lcom/google/android/exoplayer2/upstream/BandwidthMeter;)V

    .line 772
    new-instance v1, Lcom/google/android/exoplayer2/trackselection/DefaultTrackSelector;

    invoke-direct {v1, v0}, Lcom/google/android/exoplayer2/trackselection/DefaultTrackSelector;-><init>(Lcom/google/android/exoplayer2/trackselection/TrackSelection$Factory;)V

    iput-object v1, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->trackSelector:Lcom/google/android/exoplayer2/trackselection/MappingTrackSelector;

    .line 779
    iput-object p1, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->dataSource:Lcom/daaw/avee/comp/playback/Song/IMediaDataSource;

    .line 781
    invoke-direct {p0, p1}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->getMediaSource(Lcom/daaw/avee/comp/playback/Song/IMediaDataSource;)Lcom/google/android/exoplayer2/source/MediaSource;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->mediaSource:Lcom/google/android/exoplayer2/source/MediaSource;

    .line 783
    iget-object p1, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->player:Lcom/google/android/exoplayer2/SimpleExoPlayer;

    if-nez p1, :cond_1

    .line 785
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x15

    if-ge p1, v0, :cond_0

    const/4 p1, 0x1

    .line 786
    sput-boolean p1, Lcom/google/android/exoplayer2/audio/DefaultAudioSink;->enablePreV21AudioSessionWorkaround:Z

    :cond_0
    const/4 v5, 0x0

    .line 794
    new-instance p1, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/exoplayer2/MyRenderersFactory;

    iget-object v0, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->this$0:Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;

    .line 795
    invoke-static {v0}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->access$000(Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;)Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;

    move-result-object v1

    iget-object v0, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->this$0:Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;

    .line 796
    invoke-static {v0}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->access$1000(Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;)Lcom/daaw/avee/comp/playback/ExoMediaPlayer/IVisualizerDataCapturer;

    move-result-object v2

    iget v3, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->playerEntryIndexId:I

    iget-object v4, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->context:Landroid/content/Context;

    move-object v0, p1

    invoke-direct/range {v0 .. v5}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/exoplayer2/MyRenderersFactory;-><init>(Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;Lcom/daaw/avee/comp/playback/ExoMediaPlayer/IVisualizerDataCapturer;ILandroid/content/Context;I)V

    .line 800
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->trackSelector:Lcom/google/android/exoplayer2/trackselection/MappingTrackSelector;

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Lcom/google/android/exoplayer2/ExoPlayerFactory;->newSimpleInstance(Lcom/google/android/exoplayer2/RenderersFactory;Lcom/google/android/exoplayer2/trackselection/TrackSelector;Lcom/google/android/exoplayer2/drm/DrmSessionManager;)Lcom/google/android/exoplayer2/SimpleExoPlayer;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->player:Lcom/google/android/exoplayer2/SimpleExoPlayer;

    .line 805
    invoke-virtual {p1, p0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->addListener(Lcom/google/android/exoplayer2/Player$EventListener;)V

    .line 806
    iget-object p1, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->player:Lcom/google/android/exoplayer2/SimpleExoPlayer;

    new-instance v0, Lcom/google/android/exoplayer2/util/EventLogger;

    iget-object v1, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->trackSelector:Lcom/google/android/exoplayer2/trackselection/MappingTrackSelector;

    invoke-direct {v0, v1}, Lcom/google/android/exoplayer2/util/EventLogger;-><init>(Lcom/google/android/exoplayer2/trackselection/MappingTrackSelector;)V

    invoke-virtual {p1, v0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->addAnalyticsListener(Lcom/google/android/exoplayer2/analytics/AnalyticsListener;)V

    .line 808
    iget-object p1, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->player:Lcom/google/android/exoplayer2/SimpleExoPlayer;

    invoke-virtual {p1, p3, p4}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->seekTo(J)V

    .line 811
    :cond_1
    invoke-virtual {p0, p2}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->setFadeVolume(F)V

    .line 812
    invoke-virtual {p0, p2}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->setStartFadeVolume(F)V

    .line 814
    iget-object p1, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->this$0:Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;

    invoke-static {p1}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->access$000(Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;)Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;

    move-result-object v0

    invoke-interface {v0}, Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;->onRequestVideoSurfaceHolder()Landroid/view/SurfaceHolder;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore;->setVideoSurfaceHolder(Landroid/view/SurfaceHolder;)V

    .line 816
    iget-object p1, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->player:Lcom/google/android/exoplayer2/SimpleExoPlayer;

    invoke-virtual {p1, p3, p4}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->seekTo(J)V

    .line 817
    iget-object p1, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->dataSource:Lcom/daaw/avee/comp/playback/Song/IMediaDataSource;

    if-eqz p1, :cond_2

    .line 818
    iget-object p1, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->mediaSource:Lcom/google/android/exoplayer2/source/MediaSource;

    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->prepare(Lcom/google/android/exoplayer2/source/MediaSource;)V

    .line 820
    :cond_2
    invoke-virtual {p0, p2}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->setFadeVolume(F)V

    return-void
.end method

.method rePrepareDataSourceIfNotStarted()V
    .locals 2

    .line 850
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->player:Lcom/google/android/exoplayer2/SimpleExoPlayer;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->getPlaybackState()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 851
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->mediaSource:Lcom/google/android/exoplayer2/source/MediaSource;

    if-eqz v0, :cond_0

    .line 852
    iget-object v1, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->player:Lcom/google/android/exoplayer2/SimpleExoPlayer;

    invoke-virtual {v1, v0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->prepare(Lcom/google/android/exoplayer2/source/MediaSource;)V

    :cond_0
    return-void
.end method

.method public seekTo(J)V
    .locals 1

    .line 885
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->player:Lcom/google/android/exoplayer2/SimpleExoPlayer;

    if-eqz v0, :cond_0

    .line 887
    invoke-virtual {v0, p1, p2}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->seekTo(J)V

    :cond_0
    return-void
.end method

.method public setFadeVolume(F)V
    .locals 0

    .line 1111
    iput p1, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->fadeVolume:F

    .line 1112
    invoke-virtual {p0}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->updateVolume()V

    return-void
.end method

.method public setFadeVolumeRelative(F)Z
    .locals 3

    .line 1119
    iget v0, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->fadeVolume:F

    add-float/2addr v0, p1

    iput v0, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->fadeVolume:F

    const/4 p1, 0x1

    const/4 v1, 0x0

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_0

    .line 1122
    iput v1, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->fadeVolume:F

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 1125
    :goto_0
    iget v1, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->fadeVolume:F

    const/high16 v2, 0x3f800000    # 1.0f

    cmpl-float v1, v1, v2

    if-ltz v1, :cond_1

    .line 1126
    iput v2, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->fadeVolume:F

    goto :goto_1

    :cond_1
    move p1, v0

    .line 1129
    :goto_1
    invoke-virtual {p0}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->updateVolume()V

    return p1
.end method

.method public setStartFadeVolume(F)V
    .locals 0

    .line 1135
    iput p1, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->startFadeVolume:F

    return-void
.end method

.method public setVideoScalingMode(I)V
    .locals 0

    return-void
.end method

.method public setVideoSurface(Landroid/view/Surface;)Z
    .locals 2

    .line 1028
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->player:Lcom/google/android/exoplayer2/SimpleExoPlayer;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    if-eqz p1, :cond_1

    .line 1030
    invoke-virtual {p1}, Landroid/view/Surface;->isValid()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1032
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->player:Lcom/google/android/exoplayer2/SimpleExoPlayer;

    invoke-virtual {v0, p0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->setVideoListener(Lcom/google/android/exoplayer2/SimpleExoPlayer$VideoListener;)V

    .line 1033
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->player:Lcom/google/android/exoplayer2/SimpleExoPlayer;

    invoke-virtual {v0, p1}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->setVideoSurface(Landroid/view/Surface;)V

    const/4 p1, 0x1

    return p1

    .line 1038
    :cond_1
    iget-object p1, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->player:Lcom/google/android/exoplayer2/SimpleExoPlayer;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->setVideoListener(Lcom/google/android/exoplayer2/SimpleExoPlayer$VideoListener;)V

    .line 1039
    iget-object p1, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->player:Lcom/google/android/exoplayer2/SimpleExoPlayer;

    invoke-virtual {p1, v0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->setVideoSurface(Landroid/view/Surface;)V

    return v1
.end method

.method public setVolume(F)V
    .locals 0

    .line 1106
    iput p1, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->volume:F

    .line 1107
    invoke-virtual {p0}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->updateVolume()V

    return-void
.end method

.method public setVolumeStereoBalance(F)V
    .locals 0

    .line 1140
    iput p1, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->volumeStereoBalance:F

    .line 1141
    invoke-virtual {p0}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->updateVolume()V

    return-void
.end method

.method public start()V
    .locals 2

    .line 875
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->player:Lcom/google/android/exoplayer2/SimpleExoPlayer;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    .line 876
    invoke-virtual {v0, v1}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->setPlayWhenReady(Z)V

    :cond_0
    return-void
.end method

.method updateVolume()V
    .locals 3

    .line 1145
    iget v0, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->volumeStereoBalance:F

    const/high16 v1, 0x3f800000    # 1.0f

    sub-float v0, v1, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->min(FF)F

    .line 1146
    iget v0, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->volumeStereoBalance:F

    add-float/2addr v0, v1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(FF)F

    move-result v0

    .line 1148
    iget-object v1, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->player:Lcom/google/android/exoplayer2/SimpleExoPlayer;

    if-eqz v1, :cond_0

    .line 1149
    iget v2, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->fadeVolume:F

    mul-float v0, v0, v2

    iget v2, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/ExoMediaPlayerCore$PlayerEntry;->volume:F

    mul-float v0, v0, v2

    invoke-virtual {v1, v0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->setVolume(F)V

    :cond_0
    return-void
.end method
