.class Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;
.super Ljava/lang/Object;
.source "NativeMediaPlayerCore.java"

# interfaces
.implements Landroid/media/MediaPlayer$OnPreparedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "PlayerEntry"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry$StateTh;
    }
.end annotation


# static fields
.field public static final state_error:I = -0x1

.field public static final state_idle:I = 0x0

.field public static final state_initialized_preparing:I = 0x1

.field public static final state_null:I = -0x2

.field public static final state_paused:I = 0x4

.field public static final state_prepared:I = 0x3

.field public static final state_started:I = 0x5

.field public static final state_stopped:I = 0x2


# instance fields
.field public bitRate:I

.field public channelCount:I

.field fadeVolume:F

.field public player:Landroid/media/MediaPlayer;

.field public playerShouldStarts:Z

.field prepareSeekPos:J

.field public sampleRate:I

.field public startFadeVolume:F

.field private stateLevels:I

.field volatile stateTh:Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry$StateTh;

.field final synthetic this$0:Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;

.field volume:F

.field volumeStereoBalance:F


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;)V
    .locals 2

    .line 649
    iput-object p1, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;->this$0:Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    .line 660
    iput-object p1, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;->player:Landroid/media/MediaPlayer;

    const/4 p1, 0x0

    .line 661
    iput-boolean p1, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;->playerShouldStarts:Z

    const/high16 p1, 0x3f800000    # 1.0f

    .line 662
    iput p1, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;->startFadeVolume:F

    const-wide/16 v0, 0x0

    .line 663
    iput-wide v0, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;->prepareSeekPos:J

    .line 664
    iput p1, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;->volume:F

    .line 665
    iput p1, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;->fadeVolume:F

    const/4 p1, 0x0

    .line 666
    iput p1, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;->volumeStereoBalance:F

    .line 667
    new-instance p1, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry$StateTh;

    invoke-direct {p1, p0}, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry$StateTh;-><init>(Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;)V

    iput-object p1, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;->stateTh:Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry$StateTh;

    const/4 p1, -0x1

    .line 668
    iput p1, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;->stateLevels:I

    .line 669
    iput p1, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;->sampleRate:I

    .line 670
    iput p1, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;->channelCount:I

    .line 671
    iput p1, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;->bitRate:I

    return-void
.end method


# virtual methods
.method public containsVideoTrack()Z
    .locals 6

    .line 757
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;->player:Landroid/media/MediaPlayer;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 758
    :cond_0
    invoke-virtual {p0}, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;->getStateLevels()I

    move-result v0

    const/4 v2, 0x2

    if-ge v0, v2, :cond_1

    return v1

    .line 762
    :cond_1
    :try_start_0
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;->player:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->getTrackInfo()[Landroid/media/MediaPlayer$TrackInfo;

    move-result-object v0

    .line 763
    array-length v2, v0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_3

    aget-object v4, v0, v3

    .line 764
    invoke-virtual {v4}, Landroid/media/MediaPlayer$TrackInfo;->getTrackType()I

    move-result v4
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v5, 0x1

    if-ne v4, v5, :cond_2

    return v5

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :catch_0
    move-exception v0

    .line 768
    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    :cond_3
    return v1
.end method

.method public getStateLevels()I
    .locals 1

    .line 690
    iget v0, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;->stateLevels:I

    return v0
.end method

.method public isPreparingOrAbove()Z
    .locals 1

    .line 749
    iget v0, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;->stateLevels:I

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isPreparingOrStared()Z
    .locals 3

    .line 753
    iget v0, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;->stateLevels:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    const/4 v2, 0x3

    if-ne v0, v2, :cond_1

    :cond_0
    iget-boolean v0, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;->playerShouldStarts:Z

    if-nez v0, :cond_3

    :cond_1
    iget v0, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;->stateLevels:I

    const/4 v2, 0x5

    if-ne v0, v2, :cond_2

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    :cond_3
    :goto_0
    return v1
.end method

.method public onPrepared(Landroid/media/MediaPlayer;)V
    .locals 2

    const/4 v0, 0x3

    .line 849
    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;->setStateLevels(I)V

    .line 851
    iget-wide v0, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;->prepareSeekPos:J

    long-to-int v1, v0

    invoke-virtual {p1, v1}, Landroid/media/MediaPlayer;->seekTo(I)V

    .line 853
    iget p1, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;->startFadeVolume:F

    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;->setFadeVolume(F)V

    .line 855
    iget-boolean p1, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;->playerShouldStarts:Z

    if-eqz p1, :cond_0

    .line 856
    iget-object p1, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;->this$0:Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->access$000(Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;Z)V

    .line 858
    :cond_0
    iget-object p1, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;->this$0:Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;

    iget-object p1, p1, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->onNotifyListener:Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-interface {p1, v0, v1}, Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;->onMpPlaystateOrMetaChanged(ZLjava/lang/String;)V

    return-void
.end method

.method public prepareAsync(J)V
    .locals 0

    .line 742
    iput-wide p1, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;->prepareSeekPos:J

    .line 745
    iget-object p1, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;->player:Landroid/media/MediaPlayer;

    invoke-virtual {p1}, Landroid/media/MediaPlayer;->prepareAsync()V

    return-void
.end method

.method public release()V
    .locals 3

    .line 674
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;->this$0:Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->setVideoSurfaceHolder(Landroid/view/SurfaceHolder;)V

    .line 676
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;->player:Landroid/media/MediaPlayer;

    if-eqz v0, :cond_1

    .line 677
    invoke-virtual {p0}, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;->getStateLevels()I

    move-result v0

    const/4 v2, 0x2

    if-le v0, v2, :cond_0

    .line 678
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;->player:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->stop()V

    .line 679
    :cond_0
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;->player:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->release()V

    .line 682
    :cond_1
    iput-object v1, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;->player:Landroid/media/MediaPlayer;

    return-void
.end method

.method public reset()V
    .locals 1

    .line 686
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;->player:Landroid/media/MediaPlayer;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->reset()V

    :cond_0
    return-void
.end method

.method public setFadeVolume(F)V
    .locals 0

    .line 801
    iput p1, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;->fadeVolume:F

    .line 802
    invoke-virtual {p0}, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;->updateVolume()V

    return-void
.end method

.method public setFadeVolumeRelative(F)Z
    .locals 3

    .line 807
    iget v0, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;->stateLevels:I

    const/4 v1, 0x1

    if-gez v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    .line 811
    iget v2, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;->fadeVolume:F

    add-float/2addr v2, p1

    iput v2, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;->fadeVolume:F

    const/4 p1, 0x0

    cmpg-float v2, v2, p1

    if-gtz v2, :cond_1

    .line 814
    iput p1, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;->fadeVolume:F

    const/4 v0, 0x1

    .line 817
    :cond_1
    iget p1, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;->fadeVolume:F

    const/high16 v2, 0x3f800000    # 1.0f

    cmpl-float p1, p1, v2

    if-ltz p1, :cond_2

    .line 818
    iput v2, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;->fadeVolume:F

    goto :goto_0

    :cond_2
    move v1, v0

    .line 822
    :goto_0
    invoke-virtual {p0}, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;->updateVolume()V

    return v1
.end method

.method public setStartFadeVolume(F)V
    .locals 0

    .line 828
    iput p1, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;->startFadeVolume:F

    return-void
.end method

.method public setStateLevels(I)V
    .locals 1

    .line 694
    iput p1, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;->stateLevels:I

    .line 696
    new-instance v0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry$StateTh;

    invoke-direct {v0, p0}, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry$StateTh;-><init>(Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;)V

    .line 697
    iput p1, v0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry$StateTh;->stateLevels:I

    .line 698
    invoke-virtual {p0}, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;->isPreparingOrStared()Z

    move-result p1

    iput-boolean p1, v0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry$StateTh;->isPreparingOrStared:Z

    .line 699
    iget-object p1, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;->player:Landroid/media/MediaPlayer;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/media/MediaPlayer;->getAudioSessionId()I

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput p1, v0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry$StateTh;->audioSessionId:I

    .line 701
    iput-object v0, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;->stateTh:Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry$StateTh;

    return-void
.end method

.method public setVideoScalingMode(I)V
    .locals 2

    .line 775
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;->player:Landroid/media/MediaPlayer;

    if-nez v0, :cond_0

    return-void

    .line 776
    :cond_0
    invoke-virtual {p0}, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;->getStateLevels()I

    move-result v0

    const/4 v1, 0x2

    if-ge v0, v1, :cond_1

    return-void

    .line 779
    :cond_1
    :try_start_0
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;->player:Landroid/media/MediaPlayer;

    invoke-static {p1}, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore;->ConvertToNativeVideoScalingMode(I)I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/media/MediaPlayer;->setVideoScalingMode(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 781
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public setVideoSurface(Landroid/view/Surface;)V
    .locals 1

    .line 786
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;->player:Landroid/media/MediaPlayer;

    if-nez v0, :cond_0

    return-void

    :cond_0
    if-eqz p1, :cond_1

    .line 788
    invoke-virtual {p1}, Landroid/view/Surface;->isValid()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 789
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;->player:Landroid/media/MediaPlayer;

    invoke-virtual {v0, p1}, Landroid/media/MediaPlayer;->setSurface(Landroid/view/Surface;)V

    goto :goto_0

    .line 791
    :cond_1
    iget-object p1, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;->player:Landroid/media/MediaPlayer;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/media/MediaPlayer;->setSurface(Landroid/view/Surface;)V

    :goto_0
    return-void
.end method

.method public setVolume(F)V
    .locals 0

    .line 796
    iput p1, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;->volume:F

    .line 797
    invoke-virtual {p0}, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;->updateVolume()V

    return-void
.end method

.method public setVolumeStereoBalance(F)V
    .locals 0

    .line 833
    iput p1, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;->volumeStereoBalance:F

    .line 834
    invoke-virtual {p0}, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;->updateVolume()V

    return-void
.end method

.method public updateVolume()V
    .locals 5

    .line 838
    iget v0, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;->stateLevels:I

    if-gez v0, :cond_0

    return-void

    .line 840
    :cond_0
    iget v0, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;->volumeStereoBalance:F

    const/high16 v1, 0x3f800000    # 1.0f

    sub-float v0, v1, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->min(FF)F

    move-result v0

    .line 841
    iget v2, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;->volumeStereoBalance:F

    add-float/2addr v2, v1

    invoke-static {v2, v1}, Ljava/lang/Math;->min(FF)F

    move-result v1

    .line 843
    iget-object v2, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;->player:Landroid/media/MediaPlayer;

    iget v3, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;->fadeVolume:F

    mul-float v0, v0, v3

    iget v4, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeMediaPlayerCore$PlayerEntry;->volume:F

    mul-float v0, v0, v4

    mul-float v1, v1, v3

    mul-float v1, v1, v4

    invoke-virtual {v2, v0, v1}, Landroid/media/MediaPlayer;->setVolume(FF)V

    return-void
.end method
