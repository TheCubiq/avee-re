.class Lcom/daaw/avee/Design/PlaylistsDesign$5;
.super Ljava/lang/Object;
.source "PlaylistsDesign.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEvent3$Handler;


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
        "Lcom/daaw/avee/Common/Events/WeakEvent3$Handler<",
        "[J",
        "Ljava/util/List<",
        "Ljava/lang/String;",
        ">;",
        "Lcom/daaw/avee/ContextData;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/PlaylistsDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/PlaylistsDesign;)V
    .locals 0

    .line 104
    iput-object p1, p0, Lcom/daaw/avee/Design/PlaylistsDesign$5;->this$0:Lcom/daaw/avee/Design/PlaylistsDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 104
    check-cast p1, [J

    check-cast p2, Ljava/util/List;

    check-cast p3, Lcom/daaw/avee/ContextData;

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/avee/Design/PlaylistsDesign$5;->invoke([JLjava/util/List;Lcom/daaw/avee/ContextData;)V

    return-void
.end method

.method public invoke([JLjava/util/List;Lcom/daaw/avee/ContextData;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([J",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/daaw/avee/ContextData;",
            ")V"
        }
    .end annotation

    .line 107
    invoke-static {p3, p1, p2}, Lcom/daaw/avee/comp/Playlists/Dialog/CreatePlaylistDialog;->createAndShowCreatePlaylistDialog(Lcom/daaw/avee/ContextData;[JLjava/util/List;)Lcom/daaw/avee/comp/Playlists/Dialog/CreatePlaylistDialog;

    return-void
.end method
