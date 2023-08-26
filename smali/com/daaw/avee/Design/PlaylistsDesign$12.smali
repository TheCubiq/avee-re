.class Lcom/daaw/avee/Design/PlaylistsDesign$12;
.super Ljava/lang/Object;
.source "PlaylistsDesign.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEvent4$Handler;


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
        "Lcom/daaw/avee/Common/Events/WeakEvent4$Handler<",
        "Landroid/content/Context;",
        "Ljava/lang/Long;",
        "Ljava/lang/String;",
        "Lcom/daaw/avee/ContextData;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/PlaylistsDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/PlaylistsDesign;)V
    .locals 0

    .line 232
    iput-object p1, p0, Lcom/daaw/avee/Design/PlaylistsDesign$12;->this$0:Lcom/daaw/avee/Design/PlaylistsDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Landroid/content/Context;Ljava/lang/Long;Ljava/lang/String;Lcom/daaw/avee/ContextData;)V
    .locals 0

    .line 235
    invoke-virtual {p4}, Lcom/daaw/avee/ContextData;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 238
    invoke-static {p4, p2, p3}, Lcom/daaw/avee/comp/Playlists/Dialog/RenamePlaylistDialog;->createAndShowCreateRenamePlaylistDialog(Lcom/daaw/avee/ContextData;Ljava/lang/Long;Ljava/lang/String;)Lcom/daaw/avee/comp/Playlists/Dialog/RenamePlaylistDialog;

    :cond_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 232
    check-cast p1, Landroid/content/Context;

    check-cast p2, Ljava/lang/Long;

    check-cast p3, Ljava/lang/String;

    check-cast p4, Lcom/daaw/avee/ContextData;

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/daaw/avee/Design/PlaylistsDesign$12;->invoke(Landroid/content/Context;Ljava/lang/Long;Ljava/lang/String;Lcom/daaw/avee/ContextData;)V

    return-void
.end method
