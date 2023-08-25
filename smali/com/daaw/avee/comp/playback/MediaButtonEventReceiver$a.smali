.class public Lcom/daaw/avee/comp/playback/MediaButtonEventReceiver$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/os/Handler$Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/playback/MediaButtonEventReceiver;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:Lcom/daaw/avee/comp/playback/MediaButtonEventReceiver;


# direct methods
.method public constructor <init>(Lcom/daaw/avee/comp/playback/MediaButtonEventReceiver;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/avee/comp/playback/MediaButtonEventReceiver$a;->p:Lcom/daaw/avee/comp/playback/MediaButtonEventReceiver;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)Z
    .locals 3

    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Lcom/daaw/avee/comp/playback/MediaButtonEventReceiver;->a()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Landroid/content/Context;

    iget-object v0, p0, Lcom/daaw/avee/comp/playback/MediaButtonEventReceiver$a;->p:Lcom/daaw/avee/comp/playback/MediaButtonEventReceiver;

    const-string v2, "HEADSET_ASSIST_ACTION"

    invoke-virtual {v0, p1, v2}, Lcom/daaw/avee/comp/playback/MediaButtonEventReceiver;->c(Landroid/content/Context;Ljava/lang/String;)V

    invoke-static {v1}, Lcom/daaw/avee/comp/playback/MediaButtonEventReceiver;->b(Z)Z

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return p1
.end method
