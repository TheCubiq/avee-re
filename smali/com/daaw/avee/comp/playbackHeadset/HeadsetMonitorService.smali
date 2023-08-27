.class public Lcom/daaw/avee/comp/playbackHeadset/HeadsetMonitorService;
.super Landroid/app/Service;
.source "HeadsetMonitorService.java"


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

.field private mediaEventReceiver:Lcom/daaw/avee/comp/playbackHeadset/HeadsetEventReceiver;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 24
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    .line 26
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/daaw/avee/comp/playbackHeadset/HeadsetMonitorService;->listenerRefHolder:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public onCreate()V
    .locals 3

    .line 64
    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    const-string v0, "HeadsetMonitorService"

    .line 66
    invoke-static {v0}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    .line 68
    new-instance v0, Lcom/daaw/avee/comp/playbackHeadset/HeadsetEventReceiver;

    invoke-direct {v0}, Lcom/daaw/avee/comp/playbackHeadset/HeadsetEventReceiver;-><init>()V

    iput-object v0, p0, Lcom/daaw/avee/comp/playbackHeadset/HeadsetMonitorService;->mediaEventReceiver:Lcom/daaw/avee/comp/playbackHeadset/HeadsetEventReceiver;

    .line 69
    iget-object v0, v0, Lcom/daaw/avee/comp/playbackHeadset/HeadsetEventReceiver;->onHeadsetPluggedIn:Lcom/daaw/avee/Common/Events/WeakEvent;

    new-instance v1, Lcom/daaw/avee/comp/playbackHeadset/HeadsetMonitorService$1;

    invoke-direct {v1, p0}, Lcom/daaw/avee/comp/playbackHeadset/HeadsetMonitorService$1;-><init>(Lcom/daaw/avee/comp/playbackHeadset/HeadsetMonitorService;)V

    iget-object v2, p0, Lcom/daaw/avee/comp/playbackHeadset/HeadsetMonitorService;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent$Handler;Ljava/util/List;)V

    .line 76
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    const-string v1, "android.intent.action.HEADSET_PLUG"

    .line 77
    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 79
    iget-object v1, p0, Lcom/daaw/avee/comp/playbackHeadset/HeadsetMonitorService;->mediaEventReceiver:Lcom/daaw/avee/comp/playbackHeadset/HeadsetEventReceiver;

    invoke-virtual {p0, v1, v0}, Lcom/daaw/avee/comp/playbackHeadset/HeadsetMonitorService;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    return-void
.end method

.method public onDestroy()V
    .locals 2

    const-string v0, "HeadsetMonitorService"

    .line 86
    invoke-static {v0}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    .line 88
    iget-object v0, p0, Lcom/daaw/avee/comp/playbackHeadset/HeadsetMonitorService;->mediaEventReceiver:Lcom/daaw/avee/comp/playbackHeadset/HeadsetEventReceiver;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lcom/daaw/avee/comp/playbackHeadset/HeadsetEventReceiver;->onHeadsetPluggedIn:Lcom/daaw/avee/Common/Events/WeakEvent;

    iget-object v1, p0, Lcom/daaw/avee/comp/playbackHeadset/HeadsetMonitorService;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1}, Lcom/daaw/avee/Common/Events/WeakEvent;->unSubscribeWeak(Ljava/util/List;)V

    .line 89
    :cond_0
    iget-object v0, p0, Lcom/daaw/avee/comp/playbackHeadset/HeadsetMonitorService;->listenerRefHolder:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 92
    :try_start_0
    iget-object v0, p0, Lcom/daaw/avee/comp/playbackHeadset/HeadsetMonitorService;->mediaEventReceiver:Lcom/daaw/avee/comp/playbackHeadset/HeadsetEventReceiver;

    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/playbackHeadset/HeadsetMonitorService;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 97
    :catch_0
    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    return-void
.end method

.method onHeadsetPluggedIn()V
    .locals 1

    const-string v0, "onHeadsetPluggedIn"

    .line 102
    invoke-static {v0}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    .line 103
    invoke-virtual {p0}, Lcom/daaw/avee/comp/playbackHeadset/HeadsetMonitorService;->startActivity()V

    return-void
.end method

.method public onStartCommand(Landroid/content/Intent;II)I
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public onTaskRemoved(Landroid/content/Intent;)V
    .locals 0

    return-void
.end method

.method startActivity()V
    .locals 2

    .line 108
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/daaw/avee/MainActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/high16 v1, 0x10000000

    .line 109
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 111
    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/playbackHeadset/HeadsetMonitorService;->startActivity(Landroid/content/Intent;)V

    return-void
.end method
