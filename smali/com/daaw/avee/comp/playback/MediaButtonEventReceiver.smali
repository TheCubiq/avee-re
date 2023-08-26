.class public Lcom/daaw/avee/comp/playback/MediaButtonEventReceiver;
.super Landroid/content/BroadcastReceiver;
.source "MediaButtonEventReceiver.java"


# static fields
.field private static final LONG_PRESS_DELAY:I = 0x3e8

.field private static final MSG_LONGPRESS_TIMEOUT:I = 0x1

.field private static mDown:Z = false

.field private static mHandler:Landroid/os/Handler; = null

.field private static mLastClickTime:J = 0x0L

.field private static mLaunched:Z = false


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 25
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 27
    new-instance v0, Landroid/os/Handler;

    new-instance v1, Lcom/daaw/avee/comp/playback/MediaButtonEventReceiver$1;

    invoke-direct {v1, p0}, Lcom/daaw/avee/comp/playback/MediaButtonEventReceiver$1;-><init>(Lcom/daaw/avee/comp/playback/MediaButtonEventReceiver;)V

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Handler$Callback;)V

    sput-object v0, Lcom/daaw/avee/comp/playback/MediaButtonEventReceiver;->mHandler:Landroid/os/Handler;

    return-void
.end method

.method static synthetic access$000()Z
    .locals 1

    .line 16
    sget-boolean v0, Lcom/daaw/avee/comp/playback/MediaButtonEventReceiver;->mLaunched:Z

    return v0
.end method

.method static synthetic access$002(Z)Z
    .locals 0

    .line 16
    sput-boolean p0, Lcom/daaw/avee/comp/playback/MediaButtonEventReceiver;->mLaunched:Z

    return p0
.end method


# virtual methods
.method notifyEvent(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2

    .line 145
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0, p2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 146
    new-instance p2, Landroid/content/ComponentName;

    sget-object v1, Lcom/daaw/avee/comp/playback/MediaPlaybackServiceDefs;->MediaServiceClass:Ljava/lang/Class;

    invoke-direct {p2, p1, v1}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 147
    invoke-virtual {v0, p2}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 150
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt p2, v1, :cond_0

    .line 151
    invoke-virtual {p1, v0}, Landroid/content/Context;->startForegroundService(Landroid/content/Intent;)Landroid/content/ComponentName;

    goto :goto_0

    .line 153
    :cond_0
    invoke-virtual {p1, v0}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    :goto_0
    return-void
.end method

.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 13

    .line 51
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    const-string v1, "android.intent.action.MEDIA_BUTTON"

    .line 53
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    const-string v0, "android.intent.extra.KEY_EVENT"

    .line 54
    invoke-virtual {p2, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p2

    check-cast p2, Landroid/view/KeyEvent;

    if-nez p2, :cond_0

    return-void

    .line 60
    :cond_0
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    .line 61
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getAction()I

    move-result v1

    .line 62
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getEventTime()J

    move-result-wide v2

    const/4 v4, 0x0

    const-string v5, "PLAY_ACTION"

    const-string v6, "NEXT_ACTION"

    const-string v7, "TOGGLE_PAUSE_ACTION"

    const/16 v8, 0x4f

    if-eq v0, v8, :cond_3

    const/16 v9, 0x7e

    if-eq v0, v9, :cond_2

    const/16 v9, 0x7f

    if-eq v0, v9, :cond_1

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    const-string v4, "PREVIOUS_ACTION"

    goto :goto_0

    :pswitch_1
    move-object v4, v6

    goto :goto_0

    :pswitch_2
    const-string v4, "STOP_ACTION"

    goto :goto_0

    :cond_1
    const-string v4, "PAUSE_ACTION"

    goto :goto_0

    :cond_2
    move-object v4, v5

    goto :goto_0

    :cond_3
    :pswitch_3
    move-object v4, v7

    :goto_0
    if-eqz v4, :cond_9

    const/4 v9, 0x0

    const/4 v10, 0x1

    if-nez v1, :cond_7

    .line 92
    sget-boolean v1, Lcom/daaw/avee/comp/playback/MediaButtonEventReceiver;->mDown:Z

    const-wide/16 v11, 0x0

    if-eqz v1, :cond_5

    .line 93
    invoke-virtual {v7, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_4

    .line 94
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_8

    :cond_4
    sget-wide v0, Lcom/daaw/avee/comp/playback/MediaButtonEventReceiver;->mLastClickTime:J

    cmp-long p2, v0, v11

    if-eqz p2, :cond_8

    sub-long/2addr v2, v0

    const-wide/16 v0, 0x3e8

    cmp-long p2, v2, v0

    if-lez p2, :cond_8

    .line 97
    sget-object p2, Lcom/daaw/avee/comp/playback/MediaButtonEventReceiver;->mHandler:Landroid/os/Handler;

    .line 98
    invoke-virtual {p2, v10, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    .line 97
    invoke-virtual {p2, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    goto :goto_2

    .line 100
    :cond_5
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getRepeatCount()I

    move-result p2

    if-nez p2, :cond_8

    if-ne v0, v8, :cond_6

    .line 111
    sget-wide v0, Lcom/daaw/avee/comp/playback/MediaButtonEventReceiver;->mLastClickTime:J

    sub-long v0, v2, v0

    const-wide/16 v7, 0x12c

    cmp-long p2, v0, v7

    if-gez p2, :cond_6

    .line 116
    invoke-virtual {p0, p1, v6}, Lcom/daaw/avee/comp/playback/MediaButtonEventReceiver;->notifyEvent(Landroid/content/Context;Ljava/lang/String;)V

    .line 117
    sput-wide v11, Lcom/daaw/avee/comp/playback/MediaButtonEventReceiver;->mLastClickTime:J

    goto :goto_1

    .line 124
    :cond_6
    invoke-virtual {p0, p1, v4}, Lcom/daaw/avee/comp/playback/MediaButtonEventReceiver;->notifyEvent(Landroid/content/Context;Ljava/lang/String;)V

    .line 125
    sput-wide v2, Lcom/daaw/avee/comp/playback/MediaButtonEventReceiver;->mLastClickTime:J

    .line 129
    :goto_1
    sput-boolean v9, Lcom/daaw/avee/comp/playback/MediaButtonEventReceiver;->mLaunched:Z

    .line 130
    sput-boolean v10, Lcom/daaw/avee/comp/playback/MediaButtonEventReceiver;->mDown:Z

    goto :goto_2

    .line 133
    :cond_7
    sget-object p1, Lcom/daaw/avee/comp/playback/MediaButtonEventReceiver;->mHandler:Landroid/os/Handler;

    invoke-virtual {p1, v10}, Landroid/os/Handler;->removeMessages(I)V

    .line 134
    sput-boolean v9, Lcom/daaw/avee/comp/playback/MediaButtonEventReceiver;->mDown:Z

    .line 136
    :cond_8
    :goto_2
    invoke-virtual {p0}, Lcom/daaw/avee/comp/playback/MediaButtonEventReceiver;->isOrderedBroadcast()Z

    move-result p1

    if-eqz p1, :cond_9

    .line 137
    invoke-virtual {p0}, Lcom/daaw/avee/comp/playback/MediaButtonEventReceiver;->abortBroadcast()V

    :cond_9
    return-void

    :pswitch_data_0
    .packed-switch 0x55
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
