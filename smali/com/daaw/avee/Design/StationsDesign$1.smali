.class Lcom/daaw/avee/Design/StationsDesign$1;
.super Ljava/lang/Object;
.source "StationsDesign.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEvent5$Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/Design/StationsDesign;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/avee/Common/Events/WeakEvent5$Handler<",
        "Ljava/lang/Boolean;",
        "Ljava/lang/Boolean;",
        "Ljava/lang/Integer;",
        "Ljava/lang/String;",
        "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/StationsDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/StationsDesign;)V
    .locals 0

    .line 22
    iput-object p1, p0, Lcom/daaw/avee/Design/StationsDesign$1;->this$0:Lcom/daaw/avee/Design/StationsDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Lcom/daaw/avee/comp/playback/Song/PlaylistSong;)V
    .locals 0

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 22
    check-cast p1, Ljava/lang/Boolean;

    check-cast p2, Ljava/lang/Boolean;

    check-cast p3, Ljava/lang/Integer;

    check-cast p4, Ljava/lang/String;

    check-cast p5, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;

    invoke-virtual/range {p0 .. p5}, Lcom/daaw/avee/Design/StationsDesign$1;->invoke(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Lcom/daaw/avee/comp/playback/Song/PlaylistSong;)V

    return-void
.end method
