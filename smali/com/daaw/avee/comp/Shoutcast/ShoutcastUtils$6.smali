.class final Lcom/daaw/avee/comp/Shoutcast/ShoutcastUtils$6;
.super Ljava/lang/Object;
.source "ShoutcastUtils.java"

# interfaces
.implements Lcom/daaw/avee/Common/Func/Func1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/Shoutcast/ShoutcastUtils;->getGenreName(Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/avee/Common/IVAsyncTask;
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
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic val$genreId:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 182
    iput-object p1, p0, Lcom/daaw/avee/comp/Shoutcast/ShoutcastUtils$6;->val$genreId:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic onInvoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 182
    check-cast p1, Lcom/daaw/avee/Common/Tuple2;

    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/Shoutcast/ShoutcastUtils$6;->onInvoke(Lcom/daaw/avee/Common/Tuple2;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public onInvoke(Lcom/daaw/avee/Common/Tuple2;)Ljava/lang/String;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/avee/Common/Tuple2<",
            "Ljava/util/List<",
            "Lcom/daaw/avee/comp/IceCast/GenreDesc;",
            ">;",
            "Lcom/daaw/avee/Common/StatusMsg;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 185
    iget-object v0, p0, Lcom/daaw/avee/comp/Shoutcast/ShoutcastUtils$6;->val$genreId:Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    .line 187
    :cond_0
    iget-object v0, p1, Lcom/daaw/avee/Common/Tuple2;->obj1:Ljava/lang/Object;

    if-nez v0, :cond_1

    return-object v1

    .line 189
    :cond_1
    iget-object v0, p1, Lcom/daaw/avee/Common/Tuple2;->obj1:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_3

    .line 193
    iget-object v3, p1, Lcom/daaw/avee/Common/Tuple2;->obj1:Ljava/lang/Object;

    check-cast v3, Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/daaw/avee/comp/IceCast/GenreDesc;

    .line 194
    iget-object v4, p0, Lcom/daaw/avee/comp/Shoutcast/ShoutcastUtils$6;->val$genreId:Ljava/lang/String;

    iget-object v5, v3, Lcom/daaw/avee/comp/IceCast/GenreDesc;->id:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    iget-object p1, v3, Lcom/daaw/avee/comp/IceCast/GenreDesc;->name:Ljava/lang/String;

    return-object p1

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    return-object v1
.end method
