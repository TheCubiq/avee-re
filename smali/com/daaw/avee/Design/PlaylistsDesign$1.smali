.class Lcom/daaw/avee/Design/PlaylistsDesign$1;
.super Ljava/lang/Object;
.source "PlaylistsDesign.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEventR$Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/Design/PlaylistsDesign;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/avee/Common/Events/WeakEventR$Handler<",
        "Lcom/daaw/avee/Design/PlaylistsDesign$PlaylistScanningStatus;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/PlaylistsDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/PlaylistsDesign;)V
    .locals 0

    .line 56
    iput-object p1, p0, Lcom/daaw/avee/Design/PlaylistsDesign$1;->this$0:Lcom/daaw/avee/Design/PlaylistsDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke()Lcom/daaw/avee/Design/PlaylistsDesign$PlaylistScanningStatus;
    .locals 1

    .line 59
    iget-object v0, p0, Lcom/daaw/avee/Design/PlaylistsDesign$1;->this$0:Lcom/daaw/avee/Design/PlaylistsDesign;

    invoke-static {v0}, Lcom/daaw/avee/Design/PlaylistsDesign;->access$000(Lcom/daaw/avee/Design/PlaylistsDesign;)Lcom/daaw/avee/Design/PlaylistsDesign$PlaylistScanningStatus;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 56
    invoke-virtual {p0}, Lcom/daaw/avee/Design/PlaylistsDesign$1;->invoke()Lcom/daaw/avee/Design/PlaylistsDesign$PlaylistScanningStatus;

    move-result-object v0

    return-object v0
.end method
