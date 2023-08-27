.class public Lcom/daaw/avee/comp/playbackHeadset/HeadsetEventReceiver;
.super Landroid/content/BroadcastReceiver;
.source "HeadsetEventReceiver.java"


# instance fields
.field public onHeadsetPluggedIn:Lcom/daaw/avee/Common/Events/WeakEvent;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 22
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 20
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent;-><init>()V

    iput-object v0, p0, Lcom/daaw/avee/comp/playbackHeadset/HeadsetEventReceiver;->onHeadsetPluggedIn:Lcom/daaw/avee/Common/Events/WeakEvent;

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    .line 27
    invoke-virtual {p0}, Lcom/daaw/avee/comp/playbackHeadset/HeadsetEventReceiver;->isInitialStickyBroadcast()Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    .line 29
    :cond_0
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p1

    const-string v0, "android.intent.action.HEADSET_PLUG"

    .line 31
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x0

    const-string v0, "state"

    invoke-virtual {p2, v0, p1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p1

    const/4 p2, 0x1

    if-ne p1, p2, :cond_1

    .line 32
    iget-object p1, p0, Lcom/daaw/avee/comp/playbackHeadset/HeadsetEventReceiver;->onHeadsetPluggedIn:Lcom/daaw/avee/Common/Events/WeakEvent;

    invoke-virtual {p1}, Lcom/daaw/avee/Common/Events/WeakEvent;->invoke()V

    :cond_1
    return-void
.end method
