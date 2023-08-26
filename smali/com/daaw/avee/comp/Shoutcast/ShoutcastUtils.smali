.class public Lcom/daaw/avee/comp/Shoutcast/ShoutcastUtils;
.super Ljava/lang/Object;
.source "ShoutcastUtils.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static findGenreByIdFromAllGenres(Ljava/lang/String;Ljava/util/List;)Lcom/daaw/avee/comp/IceCast/GenreDesc;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/daaw/avee/comp/IceCast/GenreDesc;",
            ">;)",
            "Lcom/daaw/avee/comp/IceCast/GenreDesc;"
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p0, :cond_4

    .line 226
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_0

    goto :goto_2

    :cond_0
    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 228
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_2

    .line 230
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/daaw/avee/comp/IceCast/GenreDesc;

    iget-object v3, v3, Lcom/daaw/avee/comp/IceCast/GenreDesc;->id:Ljava/lang/String;

    invoke-virtual {p0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/daaw/avee/comp/IceCast/GenreDesc;

    return-object p0

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 233
    :cond_2
    :goto_1
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_4

    .line 235
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/avee/comp/IceCast/GenreDesc;

    invoke-virtual {v2}, Lcom/daaw/avee/comp/IceCast/GenreDesc;->getChildren()Ljava/util/List;

    move-result-object v2

    .line 237
    invoke-static {p0, v2}, Lcom/daaw/avee/comp/Shoutcast/ShoutcastUtils;->findGenreByIdFromAllGenres(Ljava/lang/String;Ljava/util/List;)Lcom/daaw/avee/comp/IceCast/GenreDesc;

    move-result-object v2

    if-eqz v2, :cond_3

    return-object v2

    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_4
    :goto_2
    return-object v0
.end method

.method public static findGenreChildren(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/daaw/avee/comp/IceCast/GenreDesc;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/daaw/avee/comp/IceCast/GenreDesc;",
            ">;"
        }
    .end annotation

    if-nez p1, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    if-eqz p0, :cond_3

    .line 250
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-eqz v0, :cond_3

    const-string v0, "0"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    .line 252
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_3

    .line 254
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/avee/comp/IceCast/GenreDesc;

    iget-object v1, v1, Lcom/daaw/avee/comp/IceCast/GenreDesc;->id:Ljava/lang/String;

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/daaw/avee/comp/IceCast/GenreDesc;

    invoke-virtual {p0}, Lcom/daaw/avee/comp/IceCast/GenreDesc;->getChildren()Ljava/util/List;

    move-result-object p0

    return-object p0

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    :goto_1
    return-object p1
.end method

.method public static getGenreChildren(Ljava/lang/String;)Lcom/daaw/avee/Common/IVAsyncTask;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lcom/daaw/avee/Common/IVAsyncTask<",
            "Lcom/daaw/avee/Common/Tuple2<",
            "Ljava/util/List<",
            "Lcom/daaw/avee/comp/IceCast/GenreDesc;",
            ">;",
            "Lcom/daaw/avee/Common/StatusMsg;",
            ">;>;"
        }
    .end annotation

    .line 263
    invoke-static {}, Lcom/daaw/avee/comp/Shoutcast/ShoutcastUtils;->getShoutcastDirectory()Lcom/daaw/avee/comp/Shoutcast/ShoutcastDirectory;

    move-result-object v0

    const-string v1, "0"

    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/Shoutcast/ShoutcastDirectory;->getGenresSecondary(Ljava/lang/String;)Lcom/daaw/avee/Common/VAsyncTask;

    move-result-object v0

    .line 265
    new-instance v1, Lcom/daaw/avee/Common/VAsyncTaskResultConvert;

    new-instance v2, Lcom/daaw/avee/comp/Shoutcast/ShoutcastUtils$8;

    invoke-direct {v2, p0}, Lcom/daaw/avee/comp/Shoutcast/ShoutcastUtils$8;-><init>(Ljava/lang/String;)V

    invoke-direct {v1, v0, v2}, Lcom/daaw/avee/Common/VAsyncTaskResultConvert;-><init>(Lcom/daaw/avee/Common/VAsyncTask;Lcom/daaw/avee/Common/Func/Func1;)V

    return-object v1
.end method

.method public static getGenreName(Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/avee/Common/IVAsyncTask;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lcom/daaw/avee/Common/IVAsyncTask<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 182
    invoke-static {}, Lcom/daaw/avee/comp/Shoutcast/ShoutcastUtils;->getShoutcastDirectory()Lcom/daaw/avee/comp/Shoutcast/ShoutcastDirectory;

    move-result-object v0

    new-instance v1, Lcom/daaw/avee/comp/Shoutcast/ShoutcastUtils$6;

    invoke-direct {v1, p1}, Lcom/daaw/avee/comp/Shoutcast/ShoutcastUtils$6;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0, p1, v1}, Lcom/daaw/avee/comp/Shoutcast/ShoutcastDirectory;->getGenreName(Ljava/lang/String;Ljava/lang/String;Lcom/daaw/avee/Common/Func/Func1;)Lcom/daaw/avee/Common/IVAsyncTask;

    move-result-object p0

    return-object p0
.end method

.method public static getGenreName2(Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/avee/Common/IVAsyncTask;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lcom/daaw/avee/Common/IVAsyncTask<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 206
    invoke-static {}, Lcom/daaw/avee/comp/Shoutcast/ShoutcastUtils;->getShoutcastDirectory()Lcom/daaw/avee/comp/Shoutcast/ShoutcastDirectory;

    move-result-object p0

    const-string v0, "0"

    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Shoutcast/ShoutcastDirectory;->getGenresSecondary(Ljava/lang/String;)Lcom/daaw/avee/Common/VAsyncTask;

    move-result-object p0

    .line 208
    new-instance v0, Lcom/daaw/avee/Common/VAsyncTaskResultConvert;

    new-instance v1, Lcom/daaw/avee/comp/Shoutcast/ShoutcastUtils$7;

    invoke-direct {v1, p1}, Lcom/daaw/avee/comp/Shoutcast/ShoutcastUtils$7;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, p0, v1}, Lcom/daaw/avee/Common/VAsyncTaskResultConvert;-><init>(Lcom/daaw/avee/Common/VAsyncTask;Lcom/daaw/avee/Common/Func/Func1;)V

    return-object v0
.end method

.method public static getShoutcastDirectory()Lcom/daaw/avee/comp/Shoutcast/ShoutcastDirectory;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/avee/comp/Shoutcast/ShoutcastDirectory<",
            "Lcom/daaw/avee/Common/Tuple2<",
            "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
            "Lcom/daaw/avee/comp/Shoutcast/ShoutcastStationEntry;",
            ">;",
            "Lcom/daaw/avee/Common/MultiList<",
            "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
            "Lcom/daaw/avee/comp/Shoutcast/ShoutcastStationEntry;",
            ">;",
            "Lcom/daaw/avee/comp/IceCast/GenreDesc;",
            "Ljava/util/List<",
            "Lcom/daaw/avee/comp/IceCast/GenreDesc;",
            ">;>;"
        }
    .end annotation

    .line 151
    new-instance v0, Lcom/daaw/avee/comp/Shoutcast/ShoutcastUtils$3;

    invoke-direct {v0}, Lcom/daaw/avee/comp/Shoutcast/ShoutcastUtils$3;-><init>()V

    new-instance v1, Lcom/daaw/avee/comp/Shoutcast/ShoutcastUtils$4;

    invoke-direct {v1}, Lcom/daaw/avee/comp/Shoutcast/ShoutcastUtils$4;-><init>()V

    new-instance v2, Lcom/daaw/avee/comp/Shoutcast/ShoutcastUtils$5;

    invoke-direct {v2}, Lcom/daaw/avee/comp/Shoutcast/ShoutcastUtils$5;-><init>()V

    new-instance v3, Lcom/daaw/avee/Common/MultiList$Factory;

    invoke-direct {v3}, Lcom/daaw/avee/Common/MultiList$Factory;-><init>()V

    const-string v4, "shoutcast_com_yp"

    invoke-static {v4, v0, v1, v2, v3}, Lcom/daaw/avee/comp/Shoutcast/ShoutcastDirectory;->createInstance(Ljava/lang/String;Lcom/daaw/avee/comp/Shoutcast/ShoutcastYpXmlParser$EntryFactory;Lcom/daaw/avee/Common/Func/Func1;Lcom/daaw/avee/comp/Shoutcast/ShoutcastYpXmlParser$EntryFactoryStation;Lcom/daaw/avee/Common/Func/Func;)Lcom/daaw/avee/comp/Shoutcast/ShoutcastDirectory;

    move-result-object v0

    return-object v0
.end method

.method public static getdkey()Ljava/lang/String;
    .locals 1

    const-string v0, "zC0wX0Pwb5nJy7o2"

    .line 297
    invoke-static {v0}, Lcom/daaw/avee/comp/Shoutcast/Crave;->decry(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static parseXmlResponse(Ljava/lang/String;Ljava/lang/String;Lcom/daaw/avee/Common/Func/Func2;I)Lcom/daaw/avee/Common/VAsyncTask;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<J:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/daaw/avee/Common/Func/Func2<",
            "Ljava/io/File;",
            "[",
            "Ljava/lang/Boolean;",
            "TJ;>;I)",
            "Lcom/daaw/avee/Common/VAsyncTask<",
            "TJ;>;"
        }
    .end annotation

    .line 41
    invoke-static {}, Lcom/daaw/avee/PlayerCore;->s()Lcom/daaw/avee/PlayerCore;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/avee/PlayerCore;->getAppContext()Landroid/content/Context;

    move-result-object v2

    if-nez v2, :cond_0

    .line 43
    new-instance p0, Lcom/daaw/avee/Common/VAsyncTask;

    new-instance p1, Lcom/daaw/avee/comp/Shoutcast/ShoutcastUtils$1;

    invoke-direct {p1}, Lcom/daaw/avee/comp/Shoutcast/ShoutcastUtils$1;-><init>()V

    invoke-direct {p0, p1}, Lcom/daaw/avee/Common/VAsyncTask;-><init>(Lcom/daaw/avee/Common/VAsyncTask$TaskListener;)V

    return-object p0

    :cond_0
    int-to-long v0, p3

    const-wide/16 v3, 0x3c

    mul-long v0, v0, v3

    const-wide/16 v3, 0x3e8

    mul-long v4, v0, v3

    .line 64
    new-instance p3, Lcom/daaw/avee/Common/VAsyncTask;

    new-instance v0, Lcom/daaw/avee/comp/Shoutcast/ShoutcastUtils$2;

    move-object v1, v0

    move-object v3, p1

    move-object v6, p2

    move-object v7, p0

    invoke-direct/range {v1 .. v7}, Lcom/daaw/avee/comp/Shoutcast/ShoutcastUtils$2;-><init>(Landroid/content/Context;Ljava/lang/String;JLcom/daaw/avee/Common/Func/Func2;Ljava/lang/String;)V

    invoke-direct {p3, v0}, Lcom/daaw/avee/Common/VAsyncTask;-><init>(Lcom/daaw/avee/Common/VAsyncTask$TaskListener;)V

    return-object p3
.end method
