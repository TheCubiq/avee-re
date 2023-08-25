.class public Lcom/daaw/avee/comp/playback/MediaButtonEventReceiver;
.super Landroid/content/BroadcastReceiver;
.source ""


# static fields
.field public static a:Landroid/os/Handler;

.field public static b:J

.field public static c:Z

.field public static d:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    new-instance v0, Landroid/os/Handler;

    new-instance v1, Lcom/daaw/avee/comp/playback/MediaButtonEventReceiver$a;

    invoke-direct {v1, p0}, Lcom/daaw/avee/comp/playback/MediaButtonEventReceiver$a;-><init>(Lcom/daaw/avee/comp/playback/MediaButtonEventReceiver;)V

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Handler$Callback;)V

    sput-object v0, Lcom/daaw/avee/comp/playback/MediaButtonEventReceiver;->a:Landroid/os/Handler;

    return-void
.end method

.method public static synthetic a()Z
    .locals 1

    sget-boolean v0, Lcom/daaw/avee/comp/playback/MediaButtonEventReceiver;->d:Z

    return v0
.end method

.method public static synthetic b(Z)Z
    .locals 0

    sput-boolean p0, Lcom/daaw/avee/comp/playback/MediaButtonEventReceiver;->d:Z

    return p0
.end method


# virtual methods
.method public c(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0, p2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    new-instance p2, Landroid/content/ComponentName;

    sget-object v1, Lcom/daaw/zo0;->e:Ljava/lang/Class;

    invoke-direct {p2, p1, v1}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, p2}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt p2, v1, :cond_0

    invoke-virtual {p1, v0}, Landroid/content/Context;->startForegroundService(Landroid/content/Intent;)Landroid/content/ComponentName;

    goto :goto_0

    :cond_0
    invoke-virtual {p1, v0}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    :goto_0
    return-void
.end method

.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 13

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    const-string v1, "android.intent.action.MEDIA_BUTTON"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    const-string v0, "android.intent.extra.KEY_EVENT"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p2

    check-cast p2, Landroid/view/KeyEvent;

    if-nez p2, :cond_0

    return-void

    :cond_0
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    invoke-virtual {p2}, Landroid/view/KeyEvent;->getAction()I

    move-result v1

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

    sget-boolean v1, Lcom/daaw/avee/comp/playback/MediaButtonEventReceiver;->c:Z

    const-wide/16 v11, 0x0

    if-eqz v1, :cond_5

    invoke-virtual {v7, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_4

    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_8

    :cond_4
    sget-wide v0, Lcom/daaw/avee/comp/playback/MediaButtonEventReceiver;->b:J

    cmp-long p2, v0, v11

    if-eqz p2, :cond_8

    sub-long/2addr v2, v0

    const-wide/16 v0, 0x3e8

    cmp-long p2, v2, v0

    if-lez p2, :cond_8

    sget-object p2, Lcom/daaw/avee/comp/playback/MediaButtonEventReceiver;->a:Landroid/os/Handler;

    invoke-virtual {p2, v10, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    goto :goto_2

    :cond_5
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getRepeatCount()I

    move-result p2

    if-nez p2, :cond_8

    if-ne v0, v8, :cond_6

    sget-wide v0, Lcom/daaw/avee/comp/playback/MediaButtonEventReceiver;->b:J

    sub-long v0, v2, v0

    const-wide/16 v7, 0x12c

    cmp-long p2, v0, v7

    if-gez p2, :cond_6

    invoke-virtual {p0, p1, v6}, Lcom/daaw/avee/comp/playback/MediaButtonEventReceiver;->c(Landroid/content/Context;Ljava/lang/String;)V

    sput-wide v11, Lcom/daaw/avee/comp/playback/MediaButtonEventReceiver;->b:J

    goto :goto_1

    :cond_6
    invoke-virtual {p0, p1, v4}, Lcom/daaw/avee/comp/playback/MediaButtonEventReceiver;->c(Landroid/content/Context;Ljava/lang/String;)V

    sput-wide v2, Lcom/daaw/avee/comp/playback/MediaButtonEventReceiver;->b:J

    :goto_1
    sput-boolean v9, Lcom/daaw/avee/comp/playback/MediaButtonEventReceiver;->d:Z

    sput-boolean v10, Lcom/daaw/avee/comp/playback/MediaButtonEventReceiver;->c:Z

    goto :goto_2

    :cond_7
    sget-object p1, Lcom/daaw/avee/comp/playback/MediaButtonEventReceiver;->a:Landroid/os/Handler;

    invoke-virtual {p1, v10}, Landroid/os/Handler;->removeMessages(I)V

    sput-boolean v9, Lcom/daaw/avee/comp/playback/MediaButtonEventReceiver;->c:Z

    :cond_8
    :goto_2
    invoke-virtual {p0}, Landroid/content/BroadcastReceiver;->isOrderedBroadcast()Z

    move-result p1

    if-eqz p1, :cond_9

    invoke-virtual {p0}, Landroid/content/BroadcastReceiver;->abortBroadcast()V

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
