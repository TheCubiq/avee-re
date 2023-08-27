.class final Lcom/daaw/avee/comp/IceCast/IcecastUtils$1;
.super Ljava/lang/Object;
.source "IcecastUtils.java"

# interfaces
.implements Lcom/daaw/avee/comp/IceCast/XiphYpXmlParser$EntryFactory;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/IceCast/IcecastUtils;->getIcecastDirectory()Lcom/daaw/avee/comp/IceCast/IceCastDirectory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/avee/comp/IceCast/XiphYpXmlParser$EntryFactory<",
        "Lcom/daaw/avee/Common/Tuple2<",
        "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
        "Lcom/daaw/avee/comp/IceCast/StationEntry;",
        ">;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public createEntry(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Lcom/daaw/avee/Common/Tuple2;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/String;",
            ")",
            "Lcom/daaw/avee/Common/Tuple2<",
            "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
            "Lcom/daaw/avee/comp/IceCast/StationEntry;",
            ">;"
        }
    .end annotation

    .line 21
    new-instance v0, Lcom/daaw/avee/Common/Tuple2;

    new-instance v7, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;

    const-wide/16 v2, -0x1

    const/4 v6, 0x0

    move-object v1, v7

    move-object v4, p2

    move-object v5, p1

    invoke-direct/range {v1 .. v6}, Lcom/daaw/avee/comp/playback/Song/PlaylistSong;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, Lcom/daaw/avee/comp/IceCast/StationEntry;

    invoke-direct {v1, p1, p2, p3, p4}, Lcom/daaw/avee/comp/IceCast/StationEntry;-><init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V

    invoke-direct {v0, v7, v1}, Lcom/daaw/avee/Common/Tuple2;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method public bridge synthetic createEntry(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Ljava/lang/Object;
    .locals 0

    .line 18
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/daaw/avee/comp/IceCast/IcecastUtils$1;->createEntry(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Lcom/daaw/avee/Common/Tuple2;

    move-result-object p1

    return-object p1
.end method
