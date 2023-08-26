.class Lcom/daaw/avee/Design/PlaybackDesign$4;
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
        "Ljava/lang/Integer;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/PlaybackDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/PlaybackDesign;)V
    .locals 0

    .line 100
    iput-object p1, p0, Lcom/daaw/avee/Design/PlaybackDesign$4;->this$0:Lcom/daaw/avee/Design/PlaybackDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Integer;
    .locals 1

    .line 103
    iget-object v0, p0, Lcom/daaw/avee/Design/PlaybackDesign$4;->this$0:Lcom/daaw/avee/Design/PlaybackDesign;

    invoke-static {v0}, Lcom/daaw/avee/Design/PlaybackDesign;->access$000(Lcom/daaw/avee/Design/PlaybackDesign;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 100
    invoke-virtual {p0}, Lcom/daaw/avee/Design/PlaybackDesign$4;->invoke()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method
