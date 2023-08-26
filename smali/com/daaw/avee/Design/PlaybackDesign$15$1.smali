.class Lcom/daaw/avee/Design/PlaybackDesign$15$1;
.super Ljava/lang/Object;
.source "PlaybackDesign.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/Design/PlaybackDesign$15;->invoke()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/daaw/avee/Design/PlaybackDesign$15;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/PlaybackDesign$15;)V
    .locals 0

    .line 235
    iput-object p1, p0, Lcom/daaw/avee/Design/PlaybackDesign$15$1;->this$1:Lcom/daaw/avee/Design/PlaybackDesign$15;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 238
    invoke-static {}, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->createOrGetInstance()Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->prev()V

    return-void
.end method
