.class public Lcom/daaw/avee/comp/Shoutcast/SearchFilterStation;
.super Ljava/lang/Object;
.source "SearchFilterStation.java"

# interfaces
.implements Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/FilterComparable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/FilterComparable<",
        "Lcom/daaw/avee/comp/Shoutcast/ShoutcastStationEntry;",
        ">;"
    }
.end annotation


# instance fields
.field private context:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, Lcom/daaw/avee/comp/Shoutcast/SearchFilterStation;->context:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public compare(Ljava/lang/String;Lcom/daaw/avee/comp/Shoutcast/ShoutcastStationEntry;)Z
    .locals 2

    if-eqz p2, :cond_1

    .line 33
    iget-object v0, p2, Lcom/daaw/avee/comp/Shoutcast/ShoutcastStationEntry;->name:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    .line 34
    :cond_0
    invoke-virtual {p2}, Lcom/daaw/avee/comp/Shoutcast/ShoutcastStationEntry;->artistName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_1

    return v1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public bridge synthetic compare(Ljava/lang/String;Ljava/lang/Object;)Z
    .locals 0

    .line 11
    check-cast p2, Lcom/daaw/avee/comp/Shoutcast/ShoutcastStationEntry;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/avee/comp/Shoutcast/SearchFilterStation;->compare(Ljava/lang/String;Lcom/daaw/avee/comp/Shoutcast/ShoutcastStationEntry;)Z

    move-result p1

    return p1
.end method

.method public preProcessItem(Lcom/daaw/avee/comp/Shoutcast/ShoutcastStationEntry;)V
    .locals 0

    return-void
.end method

.method public bridge synthetic preProcessItem(Ljava/lang/Object;)V
    .locals 0

    .line 11
    check-cast p1, Lcom/daaw/avee/comp/Shoutcast/ShoutcastStationEntry;

    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/Shoutcast/SearchFilterStation;->preProcessItem(Lcom/daaw/avee/comp/Shoutcast/ShoutcastStationEntry;)V

    return-void
.end method

.method public preProcessQuery(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 21
    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
