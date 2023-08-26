.class public Lcom/daaw/avee/comp/LibraryQueueUI/Containers/SearchFilterGenreDesc;
.super Ljava/lang/Object;
.source "SearchFilterGenreDesc.java"

# interfaces
.implements Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/FilterComparable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/FilterComparable<",
        "Lcom/daaw/avee/comp/IceCast/GenreDesc;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public compare(Ljava/lang/String;Lcom/daaw/avee/comp/IceCast/GenreDesc;)Z
    .locals 0

    .line 31
    iget-object p2, p2, Lcom/daaw/avee/comp/IceCast/GenreDesc;->name:Ljava/lang/String;

    invoke-virtual {p2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public bridge synthetic compare(Ljava/lang/String;Ljava/lang/Object;)Z
    .locals 0

    .line 12
    check-cast p2, Lcom/daaw/avee/comp/IceCast/GenreDesc;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/SearchFilterGenreDesc;->compare(Ljava/lang/String;Lcom/daaw/avee/comp/IceCast/GenreDesc;)Z

    move-result p1

    return p1
.end method

.method public preProcessItem(Lcom/daaw/avee/comp/IceCast/GenreDesc;)V
    .locals 0

    return-void
.end method

.method public bridge synthetic preProcessItem(Ljava/lang/Object;)V
    .locals 0

    .line 12
    check-cast p1, Lcom/daaw/avee/comp/IceCast/GenreDesc;

    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/SearchFilterGenreDesc;->preProcessItem(Lcom/daaw/avee/comp/IceCast/GenreDesc;)V

    return-void
.end method

.method public preProcessQuery(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 20
    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
