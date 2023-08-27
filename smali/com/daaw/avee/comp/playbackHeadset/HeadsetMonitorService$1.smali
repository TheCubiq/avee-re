.class Lcom/daaw/avee/comp/playbackHeadset/HeadsetMonitorService$1;
.super Ljava/lang/Object;
.source "HeadsetMonitorService.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEvent$Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/playbackHeadset/HeadsetMonitorService;->onCreate()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/comp/playbackHeadset/HeadsetMonitorService;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/playbackHeadset/HeadsetMonitorService;)V
    .locals 0

    .line 69
    iput-object p1, p0, Lcom/daaw/avee/comp/playbackHeadset/HeadsetMonitorService$1;->this$0:Lcom/daaw/avee/comp/playbackHeadset/HeadsetMonitorService;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke()V
    .locals 1

    .line 72
    iget-object v0, p0, Lcom/daaw/avee/comp/playbackHeadset/HeadsetMonitorService$1;->this$0:Lcom/daaw/avee/comp/playbackHeadset/HeadsetMonitorService;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/playbackHeadset/HeadsetMonitorService;->onHeadsetPluggedIn()V

    return-void
.end method
