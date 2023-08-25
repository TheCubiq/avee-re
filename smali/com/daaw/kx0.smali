.class public Lcom/daaw/kx0;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static d:[Lcom/daaw/kx0;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 9

    const/4 v0, 0x6

    new-array v1, v0, [Lcom/daaw/kx0;

    new-instance v2, Lcom/daaw/kx0;

    const-string v3, "PLA Playlist"

    const/4 v4, 0x1

    const-string v5, "pla"

    invoke-direct {v2, v3, v4, v5, v4}, Lcom/daaw/kx0;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    const/4 v3, 0x0

    aput-object v2, v1, v3

    new-instance v2, Lcom/daaw/kx0;

    const-string v3, "PLS Playlist"

    const/4 v5, 0x3

    const-string v6, "pls"

    invoke-direct {v2, v3, v5, v6, v4}, Lcom/daaw/kx0;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    aput-object v2, v1, v4

    new-instance v2, Lcom/daaw/kx0;

    const-string v3, "MPCPL Playlist"

    const/4 v6, 0x4

    const-string v7, "mpcpl"

    invoke-direct {v2, v3, v6, v7, v4}, Lcom/daaw/kx0;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    const/4 v3, 0x2

    aput-object v2, v1, v3

    new-instance v2, Lcom/daaw/kx0;

    const-string v3, "PLP Playlist"

    const/4 v7, 0x5

    const-string v8, "plp"

    invoke-direct {v2, v3, v7, v8, v4}, Lcom/daaw/kx0;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    aput-object v2, v1, v5

    new-instance v2, Lcom/daaw/kx0;

    const-string v3, "M3U Playlist"

    const-string v5, "m3u"

    invoke-direct {v2, v3, v0, v5, v4}, Lcom/daaw/kx0;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    aput-object v2, v1, v6

    new-instance v0, Lcom/daaw/kx0;

    const-string v2, "M3U8 Playlist"

    const/4 v3, 0x7

    const-string v5, "m3u8"

    invoke-direct {v0, v2, v3, v5, v4}, Lcom/daaw/kx0;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    aput-object v0, v1, v7

    sput-object v1, Lcom/daaw/kx0;->d:[Lcom/daaw/kx0;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/kx0;->a:Ljava/lang/String;

    iput-object p3, p0, Lcom/daaw/kx0;->b:Ljava/lang/String;

    iput-boolean p4, p0, Lcom/daaw/kx0;->c:Z

    return-void
.end method

.method public static a(Ljava/lang/String;)Z
    .locals 2

    const-string v0, "pla"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    const-string v0, "pls"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    return v1

    :cond_1
    const-string v0, "mpcpl"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    return v1

    :cond_2
    const-string v0, "plp"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    return v1

    :cond_3
    const-string v0, "m3u"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    return v1

    :cond_4
    const-string v0, "m3u8"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    return v1

    :cond_5
    const-string v0, "m4u"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    return v1

    :cond_6
    const-string v0, "ram"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_7

    return v1

    :cond_7
    const/4 p0, 0x0

    return p0
.end method
