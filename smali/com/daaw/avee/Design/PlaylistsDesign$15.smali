.class Lcom/daaw/avee/Design/PlaylistsDesign$15;
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
        "Lcom/daaw/avee/Common/MultiList<",
        "Ljava/lang/String;",
        "Ljava/lang/String;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/PlaylistsDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/PlaylistsDesign;)V
    .locals 0

    .line 258
    iput-object p1, p0, Lcom/daaw/avee/Design/PlaylistsDesign$15;->this$0:Lcom/daaw/avee/Design/PlaylistsDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke()Lcom/daaw/avee/Common/MultiList;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/avee/Common/MultiList<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 261
    invoke-static {}, Lcom/daaw/avee/PlayerCore;->s()Lcom/daaw/avee/PlayerCore;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/avee/PlayerCore;->getAppContext()Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 264
    :cond_0
    invoke-static {}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->createOrGetInstance()Lcom/daaw/avee/comp/AppPreferences/AppPreferences;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->prefGetStandalonePlaylists(Landroid/content/Context;)Lcom/daaw/avee/Common/MultiList;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 258
    invoke-virtual {p0}, Lcom/daaw/avee/Design/PlaylistsDesign$15;->invoke()Lcom/daaw/avee/Common/MultiList;

    move-result-object v0

    return-object v0
.end method
