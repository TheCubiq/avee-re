.class final Lcom/daaw/avee/comp/Shoutcast/ShoutcastUtils$8;
.super Ljava/lang/Object;
.source "ShoutcastUtils.java"

# interfaces
.implements Lcom/daaw/avee/Common/Func/Func1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/Shoutcast/ShoutcastUtils;->getGenreChildren(Ljava/lang/String;)Lcom/daaw/avee/Common/IVAsyncTask;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/avee/Common/Func/Func1<",
        "Lcom/daaw/avee/Common/Tuple2<",
        "Ljava/util/List<",
        "Lcom/daaw/avee/comp/IceCast/GenreDesc;",
        ">;",
        "Lcom/daaw/avee/Common/StatusMsg;",
        ">;",
        "Lcom/daaw/avee/Common/Tuple2<",
        "Ljava/util/List<",
        "Lcom/daaw/avee/comp/IceCast/GenreDesc;",
        ">;",
        "Lcom/daaw/avee/Common/StatusMsg;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic val$genreParentId:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 265
    iput-object p1, p0, Lcom/daaw/avee/comp/Shoutcast/ShoutcastUtils$8;->val$genreParentId:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onInvoke(Lcom/daaw/avee/Common/Tuple2;)Lcom/daaw/avee/Common/Tuple2;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/avee/Common/Tuple2<",
            "Ljava/util/List<",
            "Lcom/daaw/avee/comp/IceCast/GenreDesc;",
            ">;",
            "Lcom/daaw/avee/Common/StatusMsg;",
            ">;)",
            "Lcom/daaw/avee/Common/Tuple2<",
            "Ljava/util/List<",
            "Lcom/daaw/avee/comp/IceCast/GenreDesc;",
            ">;",
            "Lcom/daaw/avee/Common/StatusMsg;",
            ">;"
        }
    .end annotation

    .line 269
    iget-object v0, p0, Lcom/daaw/avee/comp/Shoutcast/ShoutcastUtils$8;->val$genreParentId:Ljava/lang/String;

    iget-object v1, p1, Lcom/daaw/avee/Common/Tuple2;->obj1:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    invoke-static {v0, v1}, Lcom/daaw/avee/comp/Shoutcast/ShoutcastUtils;->findGenreChildren(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 275
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-nez v1, :cond_1

    .line 277
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 278
    iget-object v1, p0, Lcom/daaw/avee/comp/Shoutcast/ShoutcastUtils$8;->val$genreParentId:Ljava/lang/String;

    iget-object v2, p1, Lcom/daaw/avee/Common/Tuple2;->obj1:Ljava/lang/Object;

    check-cast v2, Ljava/util/List;

    invoke-static {v1, v2}, Lcom/daaw/avee/comp/Shoutcast/ShoutcastUtils;->findGenreByIdFromAllGenres(Ljava/lang/String;Ljava/util/List;)Lcom/daaw/avee/comp/IceCast/GenreDesc;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 279
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 284
    :cond_1
    new-instance v1, Lcom/daaw/avee/Common/Tuple2;

    iget-object p1, p1, Lcom/daaw/avee/Common/Tuple2;->obj2:Ljava/lang/Object;

    invoke-direct {v1, v0, p1}, Lcom/daaw/avee/Common/Tuple2;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v1
.end method

.method public bridge synthetic onInvoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 265
    check-cast p1, Lcom/daaw/avee/Common/Tuple2;

    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/Shoutcast/ShoutcastUtils$8;->onInvoke(Lcom/daaw/avee/Common/Tuple2;)Lcom/daaw/avee/Common/Tuple2;

    move-result-object p1

    return-object p1
.end method
