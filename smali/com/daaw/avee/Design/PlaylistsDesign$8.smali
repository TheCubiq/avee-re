.class Lcom/daaw/avee/Design/PlaylistsDesign$8;
.super Ljava/lang/Object;
.source "PlaylistsDesign.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEvent5$Handler;


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
        "Lcom/daaw/avee/Common/Events/WeakEvent5$Handler<",
        "Ljava/lang/String;",
        "Ljava/lang/String;",
        "Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesType;",
        "Ljava/util/List<",
        "Ljava/lang/String;",
        ">;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/PlaylistsDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/PlaylistsDesign;)V
    .locals 0

    .line 141
    iput-object p1, p0, Lcom/daaw/avee/Design/PlaylistsDesign$8;->this$0:Lcom/daaw/avee/Design/PlaylistsDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 141
    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/lang/String;

    check-cast p3, Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesType;

    check-cast p4, Ljava/util/List;

    check-cast p5, Ljava/lang/Boolean;

    invoke-virtual/range {p0 .. p5}, Lcom/daaw/avee/Design/PlaylistsDesign$8;->invoke(Ljava/lang/String;Ljava/lang/String;Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesType;Ljava/util/List;Ljava/lang/Boolean;)V

    return-void
.end method

.method public invoke(Ljava/lang/String;Ljava/lang/String;Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesType;Ljava/util/List;Ljava/lang/Boolean;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesType;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/Boolean;",
            ")V"
        }
    .end annotation

    .line 145
    invoke-static {}, Lcom/daaw/avee/PlayerCore;->s()Lcom/daaw/avee/PlayerCore;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/avee/PlayerCore;->getAppContext()Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    if-eqz p1, :cond_1

    .line 148
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    if-gtz v1, :cond_2

    .line 149
    :cond_1
    invoke-static {}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->createOrGetInstance()Lcom/daaw/avee/comp/AppPreferences/AppPreferences;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->getPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object p1

    const-string v1, "pref_playlistDefaultPath"

    const-string v2, "\\Playlists\\"

    invoke-static {p1, v1, v2}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->preferencesGetStringSafe(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    :cond_2
    if-eqz p2, :cond_5

    .line 151
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_5

    .line 153
    new-instance v1, Lcom/daaw/avee/Common/StatusMsg;

    invoke-direct {v1}, Lcom/daaw/avee/Common/StatusMsg;-><init>()V

    .line 155
    invoke-static {p1, p2, p3}, Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesUtils;->makePlaylistPath(Ljava/lang/String;Ljava/lang/String;Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesType;)Ljava/lang/String;

    move-result-object p1

    .line 156
    invoke-static {}, Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesUtils;->s()Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesUtils;

    move-result-object v2

    invoke-virtual {p5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7

    move-object v3, v1

    move-object v4, p1

    move-object v5, p3

    move-object v6, p4

    invoke-virtual/range {v2 .. v7}, Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesUtils;->createPlaylist(Lcom/daaw/avee/Common/StatusMsg;Ljava/lang/String;Lcom/daaw/avee/comp/Playlists/Files/PlaylistFilesType;Ljava/util/List;Z)I

    move-result p2

    const/4 p3, 0x1

    if-lez p2, :cond_3

    .line 159
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p4

    const p5, 0x7f0e0010

    new-array v1, p3, [Ljava/lang/Object;

    const/4 v2, 0x0

    .line 160
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v2

    .line 159
    invoke-virtual {p4, p5, p2, v1}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    .line 161
    sget-object p4, Lcom/daaw/avee/EventsGlobal/EventsGlobalTextNotifier;->onTextMsg:Lcom/daaw/avee/Common/Events/WeakEvent1;

    invoke-virtual {p4, p2}, Lcom/daaw/avee/Common/Events/WeakEvent1;->invoke(Ljava/lang/Object;)V

    goto :goto_0

    .line 162
    :cond_3
    invoke-virtual {v1}, Lcom/daaw/avee/Common/StatusMsg;->hasCriticalError()Z

    move-result p2

    if-eqz p2, :cond_4

    .line 163
    sget-object p2, Lcom/daaw/avee/EventsGlobal/EventsGlobalTextNotifier;->onTextMsg:Lcom/daaw/avee/Common/Events/WeakEvent1;

    invoke-virtual {v1}, Lcom/daaw/avee/Common/StatusMsg;->getFullMessage()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p2, p4}, Lcom/daaw/avee/Common/Events/WeakEvent1;->invoke(Ljava/lang/Object;)V

    .line 166
    :cond_4
    :goto_0
    invoke-static {}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->createOrGetInstance()Lcom/daaw/avee/comp/AppPreferences/AppPreferences;

    move-result-object p2

    invoke-virtual {p2, v0, p1, p3}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->prefAddStandalonePlaylistGenerateHash(Landroid/content/Context;Ljava/lang/String;Z)V

    .line 167
    iget-object p1, p0, Lcom/daaw/avee/Design/PlaylistsDesign$8;->this$0:Lcom/daaw/avee/Design/PlaylistsDesign;

    invoke-static {p1}, Lcom/daaw/avee/Design/PlaylistsDesign;->access$400(Lcom/daaw/avee/Design/PlaylistsDesign;)V

    :cond_5
    return-void
.end method
