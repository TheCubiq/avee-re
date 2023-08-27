.class Lcom/daaw/avee/Design/PlaylistsDesign$13;
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
        "Landroid/content/Context;",
        "Ljava/lang/Long;",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/PlaylistsDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/PlaylistsDesign;)V
    .locals 0

    .line 242
    iput-object p1, p0, Lcom/daaw/avee/Design/PlaylistsDesign$13;->this$0:Lcom/daaw/avee/Design/PlaylistsDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Landroid/content/Context;Ljava/lang/Long;Ljava/lang/String;)V
    .locals 2

    .line 245
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-static {p1, v0, v1, p3}, Lcom/daaw/avee/comp/Playlists/Platform/PlaylistPlatformUtils;->renamePlaylist(Landroid/content/Context;JLjava/lang/String;)V

    .line 247
    iget-object p1, p0, Lcom/daaw/avee/Design/PlaylistsDesign$13;->this$0:Lcom/daaw/avee/Design/PlaylistsDesign;

    invoke-static {p1}, Lcom/daaw/avee/Design/PlaylistsDesign;->access$400(Lcom/daaw/avee/Design/PlaylistsDesign;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 242
    check-cast p1, Landroid/content/Context;

    check-cast p2, Ljava/lang/Long;

    check-cast p3, Ljava/lang/String;

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/avee/Design/PlaylistsDesign$13;->invoke(Landroid/content/Context;Ljava/lang/Long;Ljava/lang/String;)V

    return-void
.end method
