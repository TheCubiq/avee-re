.class final Lcom/daaw/avee/comp/Shoutcast/ShoutcastUtils$3;
.super Ljava/lang/Object;
.source "ShoutcastUtils.java"

# interfaces
.implements Lcom/daaw/avee/comp/Shoutcast/ShoutcastYpXmlParser$EntryFactory;


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
        "Lcom/daaw/avee/comp/Shoutcast/ShoutcastYpXmlParser$EntryFactory<",
        "Lcom/daaw/avee/comp/IceCast/GenreDesc;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 152
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public createEntry(Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/avee/comp/IceCast/GenreDesc;
    .locals 1

    .line 155
    new-instance v0, Lcom/daaw/avee/comp/IceCast/GenreDesc;

    invoke-direct {v0, p1, p2}, Lcom/daaw/avee/comp/IceCast/GenreDesc;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public bridge synthetic createEntry(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;
    .locals 0

    .line 152
    invoke-virtual {p0, p1, p2}, Lcom/daaw/avee/comp/Shoutcast/ShoutcastUtils$3;->createEntry(Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/avee/comp/IceCast/GenreDesc;

    move-result-object p1

    return-object p1
.end method
