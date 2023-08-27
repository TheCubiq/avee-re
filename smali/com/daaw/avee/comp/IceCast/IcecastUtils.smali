.class public Lcom/daaw/avee/comp/IceCast/IcecastUtils;
.super Ljava/lang/Object;
.source "IcecastUtils.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getIcecastDirectory()Lcom/daaw/avee/comp/IceCast/IceCastDirectory;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/avee/comp/IceCast/IceCastDirectory<",
            "Lcom/daaw/avee/Common/Tuple2<",
            "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
            "Lcom/daaw/avee/comp/IceCast/StationEntry;",
            ">;",
            "Lcom/daaw/avee/Common/MultiList<",
            "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
            "Lcom/daaw/avee/comp/IceCast/StationEntry;",
            ">;>;"
        }
    .end annotation

    .line 17
    new-instance v0, Lcom/daaw/avee/comp/IceCast/IceCastDirectory;

    new-instance v1, Lcom/daaw/avee/comp/IceCast/IcecastUtils$1;

    invoke-direct {v1}, Lcom/daaw/avee/comp/IceCast/IcecastUtils$1;-><init>()V

    new-instance v2, Lcom/daaw/avee/Common/MultiList$Factory;

    invoke-direct {v2}, Lcom/daaw/avee/Common/MultiList$Factory;-><init>()V

    const-string v3, "http://dir.xiph.org/yp.xml"

    const-string v4, "xiph_org_yp"

    invoke-direct {v0, v3, v4, v1, v2}, Lcom/daaw/avee/comp/IceCast/IceCastDirectory;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/daaw/avee/comp/IceCast/XiphYpXmlParser$EntryFactory;Lcom/daaw/avee/Common/Func/Func;)V

    return-object v0
.end method
