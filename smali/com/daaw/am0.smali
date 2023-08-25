.class public Lcom/daaw/am0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/pe1;


# static fields
.field public static final a:[Lcom/daaw/wk;


# direct methods
.method public static constructor <clinit>()V
    .locals 17

    const/4 v0, 0x4

    new-array v1, v0, [Lcom/daaw/wk;

    new-instance v2, Lcom/daaw/wk;

    const-string v3, ".m3u"

    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v3

    const-string v4, "audio/x-mpegurl"

    const-string v5, "audio/mpegurl"

    filled-new-array {v4, v5}, [Ljava/lang/String;

    move-result-object v6

    const/16 v7, 0x9

    new-array v7, v7, [Lcom/daaw/gx0;

    new-instance v8, Lcom/daaw/gx0;

    sget-object v9, Lcom/daaw/gx0$a;->w:Lcom/daaw/gx0$a;

    const/4 v10, 0x1

    const/4 v11, 0x0

    invoke-direct {v8, v9, v10, v11}, Lcom/daaw/gx0;-><init>(Lcom/daaw/gx0$a;ZLjava/lang/String;)V

    const/4 v12, 0x0

    aput-object v8, v7, v12

    new-instance v8, Lcom/daaw/gx0;

    sget-object v13, Lcom/daaw/gx0$a;->v:Lcom/daaw/gx0$a;

    invoke-direct {v8, v13, v10, v11}, Lcom/daaw/gx0;-><init>(Lcom/daaw/gx0$a;ZLjava/lang/String;)V

    aput-object v8, v7, v10

    new-instance v8, Lcom/daaw/gx0;

    sget-object v13, Lcom/daaw/gx0$a;->x:Lcom/daaw/gx0$a;

    invoke-direct {v8, v13, v10, v11}, Lcom/daaw/gx0;-><init>(Lcom/daaw/gx0$a;ZLjava/lang/String;)V

    const/4 v13, 0x2

    aput-object v8, v7, v13

    new-instance v8, Lcom/daaw/gx0;

    sget-object v14, Lcom/daaw/gx0$a;->r:Lcom/daaw/gx0$a;

    invoke-direct {v8, v14, v10, v11}, Lcom/daaw/gx0;-><init>(Lcom/daaw/gx0$a;ZLjava/lang/String;)V

    const/4 v15, 0x3

    aput-object v8, v7, v15

    new-instance v8, Lcom/daaw/gx0;

    sget-object v15, Lcom/daaw/gx0$a;->p:Lcom/daaw/gx0$a;

    invoke-direct {v8, v15, v10, v11}, Lcom/daaw/gx0;-><init>(Lcom/daaw/gx0$a;ZLjava/lang/String;)V

    aput-object v8, v7, v0

    new-instance v0, Lcom/daaw/gx0;

    sget-object v8, Lcom/daaw/gx0$a;->s:Lcom/daaw/gx0$a;

    invoke-direct {v0, v8, v10, v11}, Lcom/daaw/gx0;-><init>(Lcom/daaw/gx0$a;ZLjava/lang/String;)V

    const/4 v8, 0x5

    aput-object v0, v7, v8

    new-instance v0, Lcom/daaw/gx0;

    sget-object v8, Lcom/daaw/gx0$a;->t:Lcom/daaw/gx0$a;

    invoke-direct {v0, v8, v10, v11}, Lcom/daaw/gx0;-><init>(Lcom/daaw/gx0$a;ZLjava/lang/String;)V

    const/4 v8, 0x6

    aput-object v0, v7, v8

    new-instance v0, Lcom/daaw/gx0;

    sget-object v8, Lcom/daaw/gx0$a;->q:Lcom/daaw/gx0$a;

    invoke-direct {v0, v8, v10, v11}, Lcom/daaw/gx0;-><init>(Lcom/daaw/gx0$a;ZLjava/lang/String;)V

    const/4 v8, 0x7

    aput-object v0, v7, v8

    new-instance v0, Lcom/daaw/gx0;

    sget-object v8, Lcom/daaw/gx0$a;->u:Lcom/daaw/gx0$a;

    invoke-direct {v0, v8, v12, v11}, Lcom/daaw/gx0;-><init>(Lcom/daaw/gx0$a;ZLjava/lang/String;)V

    const/16 v16, 0x8

    aput-object v0, v7, v16

    const-string v0, "Winamp M3U"

    invoke-direct {v2, v3, v6, v7, v0}, Lcom/daaw/wk;-><init>([Ljava/lang/String;[Ljava/lang/String;[Lcom/daaw/gx0;Ljava/lang/String;)V

    aput-object v2, v1, v12

    new-instance v0, Lcom/daaw/wk;

    const-string v2, ".m3u8"

    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    filled-new-array {v4, v5}, [Ljava/lang/String;

    move-result-object v3

    new-array v4, v13, [Lcom/daaw/gx0;

    new-instance v5, Lcom/daaw/gx0;

    invoke-direct {v5, v9, v10, v11}, Lcom/daaw/gx0;-><init>(Lcom/daaw/gx0$a;ZLjava/lang/String;)V

    aput-object v5, v4, v12

    new-instance v5, Lcom/daaw/gx0;

    invoke-direct {v5, v15, v10, v11}, Lcom/daaw/gx0;-><init>(Lcom/daaw/gx0$a;ZLjava/lang/String;)V

    aput-object v5, v4, v10

    const-string v5, "Winamp M3U8"

    invoke-direct {v0, v2, v3, v4, v5}, Lcom/daaw/wk;-><init>([Ljava/lang/String;[Ljava/lang/String;[Lcom/daaw/gx0;Ljava/lang/String;)V

    aput-object v0, v1, v10

    new-instance v0, Lcom/daaw/wk;

    const-string v2, ".m4u"

    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    const-string v3, "video/x-mpegurl"

    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v3

    new-array v4, v12, [Lcom/daaw/gx0;

    const-string v5, "M4U Playlist"

    invoke-direct {v0, v2, v3, v4, v5}, Lcom/daaw/wk;-><init>([Ljava/lang/String;[Ljava/lang/String;[Lcom/daaw/gx0;Ljava/lang/String;)V

    aput-object v0, v1, v13

    new-instance v0, Lcom/daaw/wk;

    const-string v2, ".ram"

    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    const-string v3, "audio/vnd.rn-realaudio"

    const-string v4, "audio/x-pn-realaudio"

    filled-new-array {v3, v4}, [Ljava/lang/String;

    move-result-object v3

    new-array v4, v13, [Lcom/daaw/gx0;

    new-instance v5, Lcom/daaw/gx0;

    invoke-direct {v5, v14, v12, v11}, Lcom/daaw/gx0;-><init>(Lcom/daaw/gx0$a;ZLjava/lang/String;)V

    aput-object v5, v4, v12

    new-instance v5, Lcom/daaw/gx0;

    invoke-direct {v5, v8, v12, v11}, Lcom/daaw/gx0;-><init>(Lcom/daaw/gx0$a;ZLjava/lang/String;)V

    aput-object v5, v4, v10

    const-string v5, "Real Audio Metadata (RAM)"

    invoke-direct {v0, v2, v3, v4, v5}, Lcom/daaw/wk;-><init>([Ljava/lang/String;[Ljava/lang/String;[Lcom/daaw/gx0;Ljava/lang/String;)V

    const/4 v2, 0x3

    aput-object v0, v1, v2

    sput-object v1, Lcom/daaw/am0;->a:[Lcom/daaw/wk;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/io/InputStream;Ljava/lang/String;Lcom/daaw/bl0;)Lcom/daaw/oe1;
    .locals 6

    if-nez p2, :cond_0

    const-string p2, "UTF-8"

    :cond_0
    new-instance p3, Ljava/io/BufferedReader;

    new-instance v0, Ljava/io/InputStreamReader;

    invoke-direct {v0, p1, p2}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V

    invoke-direct {p3, v0}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    new-instance p1, Lcom/daaw/zl0;

    invoke-direct {p1}, Lcom/daaw/zl0;-><init>()V

    invoke-virtual {p1, p0}, Lcom/daaw/zl0;->e(Lcom/daaw/pe1;)V

    const/4 p2, 0x0

    :goto_0
    move-object v0, p2

    move-object v1, v0

    :cond_1
    :goto_1
    invoke-virtual {p3}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_6

    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_1

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const/16 v5, 0x3c

    if-eq v4, v5, :cond_5

    const/16 v5, 0x5b

    if-eq v4, v5, :cond_5

    const/16 v5, 0x23

    if-ne v4, v5, :cond_3

    sget-object v4, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {v2, v4}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "#EXTINF"

    invoke-virtual {v4, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_1

    const/16 v4, 0x2c

    invoke-virtual {v2, v4, v3}, Ljava/lang/String;->indexOf(II)I

    move-result v4

    if-ltz v4, :cond_2

    add-int/lit8 v0, v4, 0x1

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v5

    invoke-virtual {v2, v0, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    :cond_2
    const/16 v5, 0x3a

    invoke-virtual {v2, v5, v3}, Ljava/lang/String;->indexOf(II)I

    move-result v3

    if-ltz v3, :cond_1

    if-ge v3, v4, :cond_1

    add-int/lit8 v3, v3, 0x1

    invoke-virtual {v2, v3, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :cond_3
    new-instance v3, Lcom/daaw/a51;

    invoke-direct {v3}, Lcom/daaw/a51;-><init>()V

    invoke-virtual {v3, v2}, Lcom/daaw/a51;->e(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Lcom/daaw/a51;->f(Ljava/lang/String;)V

    if-eqz v1, :cond_4

    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {v3, v0, v1}, Lcom/daaw/a51;->d(J)V

    :cond_4
    invoke-virtual {p1}, Lcom/daaw/zl0;->c()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Doesn\'t seem to be a M3U playlist (and related ones)"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    return-object p1
.end method

.method public b()[Lcom/daaw/wk;
    .locals 1

    sget-object v0, Lcom/daaw/am0;->a:[Lcom/daaw/wk;

    invoke-virtual {v0}, [Lcom/daaw/wk;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/daaw/wk;

    return-object v0
.end method

.method public c(Lcom/daaw/ix0;)Lcom/daaw/oe1;
    .locals 2

    new-instance v0, Lcom/daaw/zl0;

    invoke-direct {v0}, Lcom/daaw/zl0;-><init>()V

    invoke-virtual {v0, p0}, Lcom/daaw/zl0;->e(Lcom/daaw/pe1;)V

    invoke-virtual {v0}, Lcom/daaw/zl0;->c()Ljava/util/List;

    move-result-object v1

    invoke-virtual {p1}, Lcom/daaw/ix0;->a()Lcom/daaw/fb1;

    move-result-object p1

    invoke-virtual {p0, v1, p1}, Lcom/daaw/am0;->d(Ljava/util/List;Lcom/daaw/n;)V

    return-object v0
.end method

.method public final d(Ljava/util/List;Lcom/daaw/n;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/daaw/a51;",
            ">;",
            "Lcom/daaw/n;",
            ")V"
        }
    .end annotation

    instance-of v0, p2, Lcom/daaw/fb1;

    if-eqz v0, :cond_2

    check-cast p2, Lcom/daaw/fb1;

    invoke-virtual {p2}, Lcom/daaw/n;->a()I

    move-result v0

    if-ltz v0, :cond_1

    invoke-virtual {p2}, Lcom/daaw/p;->b()[Lcom/daaw/n;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    invoke-virtual {p2}, Lcom/daaw/n;->a()I

    move-result v3

    if-ge v2, v3, :cond_5

    array-length v3, v0

    const/4 v4, 0x0

    :goto_1
    if-ge v4, v3, :cond_0

    aget-object v5, v0, v4

    invoke-virtual {p0, p1, v5}, Lcom/daaw/am0;->d(Ljava/util/List;Lcom/daaw/n;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "A M3U playlist cannot handle a sequence repeated indefinitely"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    instance-of p1, p2, Lcom/daaw/yn0;

    if-eqz p1, :cond_5

    check-cast p2, Lcom/daaw/yn0;

    invoke-virtual {p2}, Lcom/daaw/yn0;->b()Ljava/lang/Long;

    move-result-object p1

    if-nez p1, :cond_4

    invoke-virtual {p2}, Lcom/daaw/n;->a()I

    move-result p1

    if-ltz p1, :cond_3

    invoke-virtual {p2}, Lcom/daaw/yn0;->c()Lcom/daaw/rk;

    goto :goto_2

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "A M3U playlist cannot handle a media repeated indefinitely"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "A M3U playlist cannot handle a timed media"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    :goto_2
    return-void
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    const-string v0, "m3u"

    return-object v0
.end method
