.class final Lcom/daaw/avee/comp/Shoutcast/ShoutcastUtils$7;
.super Ljava/lang/Object;
.source "ShoutcastUtils.java"

# interfaces
.implements Lcom/daaw/avee/Common/Func/Func1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/Shoutcast/ShoutcastUtils;->getGenreName2(Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/avee/Common/IVAsyncTask;
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

    .line 208
    iput-object p1, p0, Lcom/daaw/avee/comp/Shoutcast/ShoutcastUtils$7;->val$genreId:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic onInvoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 208
    check-cast p1, Lcom/daaw/avee/Common/Tuple2;

    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/Shoutcast/ShoutcastUtils$7;->onInvoke(Lcom/daaw/avee/Common/Tuple2;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public onInvoke(Lcom/daaw/avee/Common/Tuple2;)Ljava/lang/String;
    .locals 2
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

    .line 211
    iget-object v0, p0, Lcom/daaw/avee/comp/Shoutcast/ShoutcastUtils$7;->val$genreId:Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    .line 213
    :cond_0
    iget-object v0, p1, Lcom/daaw/avee/Common/Tuple2;->obj1:Ljava/lang/Object;

    if-nez v0, :cond_1

    return-object v1

    .line 215
    :cond_1
    iget-object v0, p0, Lcom/daaw/avee/comp/Shoutcast/ShoutcastUtils$7;->val$genreId:Ljava/lang/String;

    iget-object p1, p1, Lcom/daaw/avee/Common/Tuple2;->obj1:Ljava/lang/Object;

    check-cast p1, Ljava/util/List;

    invoke-static {v0, p1}, Lcom/daaw/avee/comp/Shoutcast/ShoutcastUtils;->findGenreByIdFromAllGenres(Ljava/lang/String;Ljava/util/List;)Lcom/daaw/avee/comp/IceCast/GenreDesc;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 217
    iget-object p1, p1, Lcom/daaw/avee/comp/IceCast/GenreDesc;->name:Ljava/lang/String;

    goto :goto_0

    :cond_2
    const-string p1, "....."

    :goto_0
    return-object p1
.end method
