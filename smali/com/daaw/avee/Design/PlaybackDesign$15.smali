.class Lcom/daaw/avee/Design/PlaybackDesign$15;
.super Ljava/lang/Object;
.source "PlaybackDesign.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEvent$Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/Design/PlaybackDesign;-><init>(Lcom/daaw/avee/Design/StationsDesign;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/PlaybackDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/PlaybackDesign;)V
    .locals 0

    .line 232
    iput-object p1, p0, Lcom/daaw/avee/Design/PlaybackDesign$15;->this$0:Lcom/daaw/avee/Design/PlaybackDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke()V
    .locals 2

    .line 235
    iget-object v0, p0, Lcom/daaw/avee/Design/PlaybackDesign$15;->this$0:Lcom/daaw/avee/Design/PlaybackDesign;

    invoke-static {v0}, Lcom/daaw/avee/Design/PlaybackDesign;->access$100(Lcom/daaw/avee/Design/PlaybackDesign;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lcom/daaw/avee/Design/PlaybackDesign$15$1;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/PlaybackDesign$15$1;-><init>(Lcom/daaw/avee/Design/PlaybackDesign$15;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
