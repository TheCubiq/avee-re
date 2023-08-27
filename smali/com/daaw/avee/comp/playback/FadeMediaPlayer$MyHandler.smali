.class Lcom/daaw/avee/comp/playback/FadeMediaPlayer$MyHandler;
.super Landroid/os/Handler;
.source "FadeMediaPlayer.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/playback/FadeMediaPlayer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "MyHandler"
.end annotation


# instance fields
.field private targetWeak:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/daaw/avee/comp/playback/FadeMediaPlayer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/daaw/avee/comp/playback/FadeMediaPlayer;)V
    .locals 1

    .line 58
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 59
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/daaw/avee/comp/playback/FadeMediaPlayer$MyHandler;->targetWeak:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 13

    .line 65
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/FadeMediaPlayer$MyHandler;->targetWeak:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;

    if-nez v0, :cond_0

    return-void

    .line 68
    :cond_0
    invoke-static {v0}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->access$000(Lcom/daaw/avee/comp/playback/FadeMediaPlayer;)J

    move-result-wide v1

    long-to-float v1, v1

    const v2, 0x3a83126f    # 0.001f

    mul-float v1, v1, v2

    .line 69
    invoke-static {v0}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->access$100(Lcom/daaw/avee/comp/playback/FadeMediaPlayer;)J

    move-result-wide v3

    const-wide/16 v5, 0xa

    add-long/2addr v3, v5

    long-to-float v3, v3

    mul-float v3, v3, v2

    div-float/2addr v3, v1

    .line 71
    iget p1, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x3

    const/4 v2, 0x5

    const/4 v4, 0x4

    const/4 v7, 0x1

    const/4 v8, 0x0

    packed-switch p1, :pswitch_data_0

    goto/16 :goto_2

    .line 170
    :pswitch_0
    invoke-static {v0}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->access$1100(Lcom/daaw/avee/comp/playback/FadeMediaPlayer;)V

    goto/16 :goto_2

    .line 164
    :pswitch_1
    invoke-static {v0}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->access$900(Lcom/daaw/avee/comp/playback/FadeMediaPlayer;)V

    .line 165
    invoke-static {v0}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->access$1000(Lcom/daaw/avee/comp/playback/FadeMediaPlayer;)V

    goto/16 :goto_2

    .line 158
    :pswitch_2
    invoke-static {v0}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->access$800(Lcom/daaw/avee/comp/playback/FadeMediaPlayer;)V

    .line 159
    invoke-virtual {v0}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->destroyOldCrossFade()V

    goto/16 :goto_2

    .line 132
    :pswitch_3
    invoke-static {v0}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->access$000(Lcom/daaw/avee/comp/playback/FadeMediaPlayer;)J

    move-result-wide v1

    const-wide/16 v7, 0x0

    cmp-long p1, v1, v7

    if-ltz p1, :cond_a

    .line 134
    invoke-static {v0}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->access$400(Lcom/daaw/avee/comp/playback/FadeMediaPlayer;)Lcom/daaw/avee/comp/playback/IMediaPlayerCore;

    move-result-object p1

    invoke-interface {p1}, Lcom/daaw/avee/comp/playback/IMediaPlayerCore;->position()J

    move-result-wide v1

    .line 135
    invoke-static {v0}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->access$400(Lcom/daaw/avee/comp/playback/FadeMediaPlayer;)Lcom/daaw/avee/comp/playback/IMediaPlayerCore;

    move-result-object p1

    invoke-interface {p1}, Lcom/daaw/avee/comp/playback/IMediaPlayerCore;->duration()J

    move-result-wide v7

    sub-long v1, v7, v1

    .line 138
    invoke-static {v0}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->access$000(Lcom/daaw/avee/comp/playback/FadeMediaPlayer;)J

    move-result-wide v9

    const-wide/16 v11, 0x5dc

    add-long/2addr v9, v11

    cmp-long p1, v7, v9

    if-lez p1, :cond_1

    .line 140
    invoke-static {v0}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->access$000(Lcom/daaw/avee/comp/playback/FadeMediaPlayer;)J

    move-result-wide v7

    add-long/2addr v7, v11

    cmp-long p1, v1, v7

    if-gtz p1, :cond_1

    .line 141
    invoke-static {v0}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->access$000(Lcom/daaw/avee/comp/playback/FadeMediaPlayer;)J

    move-result-wide v3

    sub-long/2addr v1, v3

    sub-long/2addr v1, v5

    .line 142
    invoke-static {}, Lcom/daaw/avee/Common/Utils;->tickCount()J

    move-result-wide v3

    add-long/2addr v3, v1

    .line 143
    invoke-static {v0}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->access$600(Lcom/daaw/avee/comp/playback/FadeMediaPlayer;)Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;

    move-result-object p1

    invoke-interface {p1, v3, v4}, Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;->requestNextDataAtTime(J)V

    goto/16 :goto_2

    .line 149
    :cond_1
    invoke-virtual {p0, v4}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer$MyHandler;->obtainMessage(I)Landroid/os/Message;

    move-result-object p1

    .line 150
    invoke-static {v0}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->access$700(Lcom/daaw/avee/comp/playback/FadeMediaPlayer;)J

    move-result-wide v0

    invoke-virtual {p0, p1, v0, v1}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer$MyHandler;->sendMessageDelayed(Landroid/os/Message;J)Z

    goto/16 :goto_2

    .line 108
    :pswitch_4
    invoke-static {v0}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->access$500(Lcom/daaw/avee/comp/playback/FadeMediaPlayer;)I

    move-result p1

    if-ne p1, v4, :cond_2

    .line 109
    invoke-static {v0}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->access$400(Lcom/daaw/avee/comp/playback/FadeMediaPlayer;)Lcom/daaw/avee/comp/playback/IMediaPlayerCore;

    move-result-object p1

    invoke-static {v0}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->access$300(Lcom/daaw/avee/comp/playback/FadeMediaPlayer;)F

    move-result v2

    neg-float v2, v2

    invoke-interface {p1, v2, v7}, Lcom/daaw/avee/comp/playback/IMediaPlayerCore;->setFadeVolumeRelative(FI)Z

    move-result p1

    if-eqz p1, :cond_4

    .line 110
    invoke-static {v0}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->access$400(Lcom/daaw/avee/comp/playback/FadeMediaPlayer;)Lcom/daaw/avee/comp/playback/IMediaPlayerCore;

    move-result-object p1

    invoke-interface {p1}, Lcom/daaw/avee/comp/playback/IMediaPlayerCore;->destroyOld()V

    .line 111
    invoke-static {v0, v8}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->access$502(Lcom/daaw/avee/comp/playback/FadeMediaPlayer;I)I

    goto :goto_0

    .line 113
    :cond_2
    invoke-static {v0}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->access$500(Lcom/daaw/avee/comp/playback/FadeMediaPlayer;)I

    move-result p1

    if-ne p1, v2, :cond_3

    .line 114
    invoke-static {v0, v8}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->access$502(Lcom/daaw/avee/comp/playback/FadeMediaPlayer;I)I

    goto :goto_0

    .line 115
    :cond_3
    invoke-static {v0}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->access$500(Lcom/daaw/avee/comp/playback/FadeMediaPlayer;)I

    move-result p1

    const/4 v2, 0x6

    if-ne p1, v2, :cond_4

    .line 116
    invoke-static {v0}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->access$400(Lcom/daaw/avee/comp/playback/FadeMediaPlayer;)Lcom/daaw/avee/comp/playback/IMediaPlayerCore;

    move-result-object p1

    neg-float v2, v3

    invoke-interface {p1, v2, v7}, Lcom/daaw/avee/comp/playback/IMediaPlayerCore;->setFadeVolumeRelative(FI)Z

    move-result p1

    if-eqz p1, :cond_4

    .line 117
    invoke-static {v0}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->access$400(Lcom/daaw/avee/comp/playback/FadeMediaPlayer;)Lcom/daaw/avee/comp/playback/IMediaPlayerCore;

    move-result-object p1

    invoke-interface {p1}, Lcom/daaw/avee/comp/playback/IMediaPlayerCore;->destroyOld()V

    .line 118
    invoke-static {v0, v8}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->access$502(Lcom/daaw/avee/comp/playback/FadeMediaPlayer;I)I

    .line 122
    :cond_4
    :goto_0
    invoke-static {v0}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->access$500(Lcom/daaw/avee/comp/playback/FadeMediaPlayer;)I

    move-result p1

    if-eqz p1, :cond_a

    .line 123
    invoke-virtual {p0, v1}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer$MyHandler;->obtainMessage(I)Landroid/os/Message;

    move-result-object p1

    .line 124
    invoke-static {v0}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->access$100(Lcom/daaw/avee/comp/playback/FadeMediaPlayer;)J

    move-result-wide v0

    invoke-virtual {p0, p1, v0, v1}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer$MyHandler;->sendMessageDelayed(Landroid/os/Message;J)Z

    goto/16 :goto_2

    .line 75
    :pswitch_5
    invoke-static {v0}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->access$200(Lcom/daaw/avee/comp/playback/FadeMediaPlayer;)I

    move-result p1

    const/4 v5, 0x2

    if-ne p1, v7, :cond_5

    .line 76
    invoke-static {v0}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->access$400(Lcom/daaw/avee/comp/playback/FadeMediaPlayer;)Lcom/daaw/avee/comp/playback/IMediaPlayerCore;

    move-result-object p1

    invoke-static {v0}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->access$300(Lcom/daaw/avee/comp/playback/FadeMediaPlayer;)F

    move-result v1

    neg-float v1, v1

    invoke-interface {p1, v1, v8}, Lcom/daaw/avee/comp/playback/IMediaPlayerCore;->setFadeVolumeRelative(FI)Z

    move-result p1

    if-eqz p1, :cond_9

    .line 77
    invoke-static {v0}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->access$400(Lcom/daaw/avee/comp/playback/FadeMediaPlayer;)Lcom/daaw/avee/comp/playback/IMediaPlayerCore;

    move-result-object p1

    invoke-interface {p1}, Lcom/daaw/avee/comp/playback/IMediaPlayerCore;->stop()V

    .line 78
    invoke-static {v0, v8}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->access$202(Lcom/daaw/avee/comp/playback/FadeMediaPlayer;I)I

    goto :goto_1

    .line 80
    :cond_5
    invoke-static {v0}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->access$200(Lcom/daaw/avee/comp/playback/FadeMediaPlayer;)I

    move-result p1

    if-ne p1, v5, :cond_6

    .line 81
    invoke-static {v0}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->access$400(Lcom/daaw/avee/comp/playback/FadeMediaPlayer;)Lcom/daaw/avee/comp/playback/IMediaPlayerCore;

    move-result-object p1

    invoke-static {v0}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->access$300(Lcom/daaw/avee/comp/playback/FadeMediaPlayer;)F

    move-result v1

    neg-float v1, v1

    invoke-interface {p1, v1, v8}, Lcom/daaw/avee/comp/playback/IMediaPlayerCore;->setFadeVolumeRelative(FI)Z

    move-result p1

    if-eqz p1, :cond_9

    .line 82
    invoke-static {v0}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->access$400(Lcom/daaw/avee/comp/playback/FadeMediaPlayer;)Lcom/daaw/avee/comp/playback/IMediaPlayerCore;

    move-result-object p1

    invoke-interface {p1}, Lcom/daaw/avee/comp/playback/IMediaPlayerCore;->pause()V

    .line 83
    invoke-static {v0, v8}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->access$202(Lcom/daaw/avee/comp/playback/FadeMediaPlayer;I)I

    goto :goto_1

    .line 85
    :cond_6
    invoke-static {v0}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->access$200(Lcom/daaw/avee/comp/playback/FadeMediaPlayer;)I

    move-result p1

    if-ne p1, v1, :cond_7

    .line 86
    invoke-static {v0}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->access$400(Lcom/daaw/avee/comp/playback/FadeMediaPlayer;)Lcom/daaw/avee/comp/playback/IMediaPlayerCore;

    move-result-object p1

    invoke-static {v0}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->access$300(Lcom/daaw/avee/comp/playback/FadeMediaPlayer;)F

    move-result v1

    invoke-interface {p1, v1, v8}, Lcom/daaw/avee/comp/playback/IMediaPlayerCore;->setFadeVolumeRelative(FI)Z

    move-result p1

    if-eqz p1, :cond_9

    .line 87
    invoke-static {v0, v8}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->access$202(Lcom/daaw/avee/comp/playback/FadeMediaPlayer;I)I

    goto :goto_1

    .line 89
    :cond_7
    invoke-static {v0}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->access$200(Lcom/daaw/avee/comp/playback/FadeMediaPlayer;)I

    move-result p1

    if-ne p1, v4, :cond_8

    goto :goto_1

    .line 91
    :cond_8
    invoke-static {v0}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->access$200(Lcom/daaw/avee/comp/playback/FadeMediaPlayer;)I

    move-result p1

    if-ne p1, v2, :cond_9

    .line 92
    invoke-static {v0}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->access$400(Lcom/daaw/avee/comp/playback/FadeMediaPlayer;)Lcom/daaw/avee/comp/playback/IMediaPlayerCore;

    move-result-object p1

    invoke-interface {p1, v3, v8}, Lcom/daaw/avee/comp/playback/IMediaPlayerCore;->setFadeVolumeRelative(FI)Z

    move-result p1

    if-eqz p1, :cond_9

    .line 93
    invoke-static {v0, v8}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->access$202(Lcom/daaw/avee/comp/playback/FadeMediaPlayer;I)I

    .line 97
    :cond_9
    :goto_1
    invoke-static {v0}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->access$200(Lcom/daaw/avee/comp/playback/FadeMediaPlayer;)I

    move-result p1

    if-eqz p1, :cond_a

    .line 98
    invoke-virtual {p0, v5}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer$MyHandler;->obtainMessage(I)Landroid/os/Message;

    move-result-object p1

    .line 99
    invoke-static {v0}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer;->access$100(Lcom/daaw/avee/comp/playback/FadeMediaPlayer;)J

    move-result-wide v0

    invoke-virtual {p0, p1, v0, v1}, Lcom/daaw/avee/comp/playback/FadeMediaPlayer$MyHandler;->sendMessageDelayed(Landroid/os/Message;J)Z

    :cond_a
    :goto_2
    return-void

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
