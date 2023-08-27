.class Lcom/daaw/avee/Design/PlaylistsDesign$2;
.super Ljava/lang/Object;
.source "PlaylistsDesign.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEvent$Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/Design/PlaylistsDesign;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/PlaylistsDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/PlaylistsDesign;)V
    .locals 0

    .line 63
    iput-object p1, p0, Lcom/daaw/avee/Design/PlaylistsDesign$2;->this$0:Lcom/daaw/avee/Design/PlaylistsDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke()V
    .locals 2

    .line 66
    iget-object v0, p0, Lcom/daaw/avee/Design/PlaylistsDesign$2;->this$0:Lcom/daaw/avee/Design/PlaylistsDesign;

    invoke-static {v0}, Lcom/daaw/avee/Design/PlaylistsDesign;->access$100(Lcom/daaw/avee/Design/PlaylistsDesign;)Lcom/daaw/avee/comp/GlobalSearch/SearchTaskManager;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/GlobalSearch/SearchTaskManager;->clearTaskIfMatch(I)V

    return-void
.end method
