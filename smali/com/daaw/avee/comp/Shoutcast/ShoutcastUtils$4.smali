.class final Lcom/daaw/avee/comp/Shoutcast/ShoutcastUtils$4;
.super Ljava/lang/Object;
.source "ShoutcastUtils.java"

# interfaces
.implements Lcom/daaw/avee/Common/Func/Func1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/Shoutcast/ShoutcastUtils;->getShoutcastDirectory()Lcom/daaw/avee/comp/Shoutcast/ShoutcastDirectory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/avee/Common/Func/Func1<",
        "Lcom/daaw/avee/comp/IceCast/GenreDesc;",
        "Ljava/util/List<",
        "Lcom/daaw/avee/comp/IceCast/GenreDesc;",
        ">;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 158
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic onInvoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 158
    check-cast p1, Lcom/daaw/avee/comp/IceCast/GenreDesc;

    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/Shoutcast/ShoutcastUtils$4;->onInvoke(Lcom/daaw/avee/comp/IceCast/GenreDesc;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public onInvoke(Lcom/daaw/avee/comp/IceCast/GenreDesc;)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/avee/comp/IceCast/GenreDesc;",
            ")",
            "Ljava/util/List<",
            "Lcom/daaw/avee/comp/IceCast/GenreDesc;",
            ">;"
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 161
    invoke-virtual {p1}, Lcom/daaw/avee/comp/IceCast/GenreDesc;->getChildren()Ljava/util/List;

    move-result-object p1

    return-object p1

    .line 162
    :cond_0
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    return-object p1
.end method
