.class final Lcom/daaw/avee/comp/LibraryQueueUI/StationSortingUtils$2;
.super Ljava/lang/Object;
.source "StationSortingUtils.java"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/LibraryQueueUI/StationSortingUtils;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Lcom/daaw/avee/Common/Tuple2<",
        "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
        "Lcom/daaw/avee/comp/IceCast/StationEntry;",
        ">;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public compare(Lcom/daaw/avee/Common/Tuple2;Lcom/daaw/avee/Common/Tuple2;)I
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/avee/Common/Tuple2<",
            "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
            "Lcom/daaw/avee/comp/IceCast/StationEntry;",
            ">;",
            "Lcom/daaw/avee/Common/Tuple2<",
            "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
            "Lcom/daaw/avee/comp/IceCast/StationEntry;",
            ">;)I"
        }
    .end annotation

    .line 26
    iget-object p1, p1, Lcom/daaw/avee/Common/Tuple2;->obj2:Ljava/lang/Object;

    check-cast p1, Lcom/daaw/avee/comp/IceCast/StationEntry;

    iget-object p1, p1, Lcom/daaw/avee/comp/IceCast/StationEntry;->url:Ljava/lang/String;

    iget-object p2, p2, Lcom/daaw/avee/Common/Tuple2;->obj2:Ljava/lang/Object;

    check-cast p2, Lcom/daaw/avee/comp/IceCast/StationEntry;

    iget-object p2, p2, Lcom/daaw/avee/comp/IceCast/StationEntry;->url:Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 23
    check-cast p1, Lcom/daaw/avee/Common/Tuple2;

    check-cast p2, Lcom/daaw/avee/Common/Tuple2;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/StationSortingUtils$2;->compare(Lcom/daaw/avee/Common/Tuple2;Lcom/daaw/avee/Common/Tuple2;)I

    move-result p1

    return p1
.end method
