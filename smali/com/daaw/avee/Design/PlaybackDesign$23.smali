.class Lcom/daaw/avee/Design/PlaybackDesign$23;
.super Ljava/lang/Object;
.source "PlaybackDesign.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEventR$Handler;


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
        "Lcom/daaw/avee/Common/Events/WeakEventR$Handler<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/PlaybackDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/PlaybackDesign;)V
    .locals 0

    .line 339
    iput-object p1, p0, Lcom/daaw/avee/Design/PlaybackDesign$23;->this$0:Lcom/daaw/avee/Design/PlaybackDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Boolean;
    .locals 1

    .line 342
    iget-object v0, p0, Lcom/daaw/avee/Design/PlaybackDesign$23;->this$0:Lcom/daaw/avee/Design/PlaybackDesign;

    invoke-static {v0}, Lcom/daaw/avee/Design/PlaybackDesign;->access$300(Lcom/daaw/avee/Design/PlaybackDesign;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 339
    invoke-virtual {p0}, Lcom/daaw/avee/Design/PlaybackDesign$23;->invoke()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
