.class Lcom/daaw/avee/Design/PlaybackDesign$8;
.super Ljava/lang/Object;
.source "PlaybackDesign.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEvent1$Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/Design/PlaybackDesign;-><init>(Lcom/daaw/avee/Design/StationsDesign;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/avee/Common/Events/WeakEvent1$Handler<",
        "Landroid/content/Context;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/PlaybackDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/PlaybackDesign;)V
    .locals 0

    .line 165
    iput-object p1, p0, Lcom/daaw/avee/Design/PlaybackDesign$8;->this$0:Lcom/daaw/avee/Design/PlaybackDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Landroid/content/Context;)V
    .locals 1

    .line 168
    iget-object p1, p0, Lcom/daaw/avee/Design/PlaybackDesign$8;->this$0:Lcom/daaw/avee/Design/PlaybackDesign;

    invoke-static {p1}, Lcom/daaw/avee/Design/PlaybackDesign;->access$100(Lcom/daaw/avee/Design/PlaybackDesign;)Landroid/os/Handler;

    move-result-object p1

    new-instance v0, Lcom/daaw/avee/Design/PlaybackDesign$8$1;

    invoke-direct {v0, p0}, Lcom/daaw/avee/Design/PlaybackDesign$8$1;-><init>(Lcom/daaw/avee/Design/PlaybackDesign$8;)V

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)V
    .locals 0

    .line 165
    check-cast p1, Landroid/content/Context;

    invoke-virtual {p0, p1}, Lcom/daaw/avee/Design/PlaybackDesign$8;->invoke(Landroid/content/Context;)V

    return-void
.end method
