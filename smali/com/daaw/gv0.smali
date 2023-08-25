.class public Lcom/daaw/gv0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/pe1;


# static fields
.field public static final a:[Lcom/daaw/wk;


# direct methods
.method public static constructor <clinit>()V
    .locals 10

    const/4 v0, 0x1

    new-array v1, v0, [Lcom/daaw/wk;

    new-instance v2, Lcom/daaw/wk;

    const-string v3, ".pls"

    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v3

    const-string v4, "audio/x-scpls"

    filled-new-array {v4}, [Ljava/lang/String;

    move-result-object v4

    const/16 v5, 0x8

    new-array v5, v5, [Lcom/daaw/gx0;

    new-instance v6, Lcom/daaw/gx0;

    sget-object v7, Lcom/daaw/gx0$a;->w:Lcom/daaw/gx0$a;

    const/4 v8, 0x0

    invoke-direct {v6, v7, v0, v8}, Lcom/daaw/gx0;-><init>(Lcom/daaw/gx0$a;ZLjava/lang/String;)V

    const/4 v7, 0x0

    aput-object v6, v5, v7

    new-instance v6, Lcom/daaw/gx0;

    sget-object v9, Lcom/daaw/gx0$a;->v:Lcom/daaw/gx0$a;

    invoke-direct {v6, v9, v7, v8}, Lcom/daaw/gx0;-><init>(Lcom/daaw/gx0$a;ZLjava/lang/String;)V

    aput-object v6, v5, v0

    new-instance v6, Lcom/daaw/gx0;

    sget-object v9, Lcom/daaw/gx0$a;->r:Lcom/daaw/gx0$a;

    invoke-direct {v6, v9, v0, v8}, Lcom/daaw/gx0;-><init>(Lcom/daaw/gx0$a;ZLjava/lang/String;)V

    const/4 v9, 0x2

    aput-object v6, v5, v9

    new-instance v6, Lcom/daaw/gx0;

    sget-object v9, Lcom/daaw/gx0$a;->p:Lcom/daaw/gx0$a;

    invoke-direct {v6, v9, v7, v8}, Lcom/daaw/gx0;-><init>(Lcom/daaw/gx0$a;ZLjava/lang/String;)V

    const/4 v9, 0x3

    aput-object v6, v5, v9

    new-instance v6, Lcom/daaw/gx0;

    sget-object v9, Lcom/daaw/gx0$a;->s:Lcom/daaw/gx0$a;

    invoke-direct {v6, v9, v0, v8}, Lcom/daaw/gx0;-><init>(Lcom/daaw/gx0$a;ZLjava/lang/String;)V

    const/4 v9, 0x4

    aput-object v6, v5, v9

    new-instance v6, Lcom/daaw/gx0;

    sget-object v9, Lcom/daaw/gx0$a;->t:Lcom/daaw/gx0$a;

    invoke-direct {v6, v9, v0, v8}, Lcom/daaw/gx0;-><init>(Lcom/daaw/gx0$a;ZLjava/lang/String;)V

    const/4 v9, 0x5

    aput-object v6, v5, v9

    new-instance v6, Lcom/daaw/gx0;

    sget-object v9, Lcom/daaw/gx0$a;->q:Lcom/daaw/gx0$a;

    invoke-direct {v6, v9, v0, v8}, Lcom/daaw/gx0;-><init>(Lcom/daaw/gx0$a;ZLjava/lang/String;)V

    const/4 v0, 0x6

    aput-object v6, v5, v0

    new-instance v0, Lcom/daaw/gx0;

    sget-object v6, Lcom/daaw/gx0$a;->u:Lcom/daaw/gx0$a;

    invoke-direct {v0, v6, v7, v8}, Lcom/daaw/gx0;-><init>(Lcom/daaw/gx0$a;ZLjava/lang/String;)V

    const/4 v6, 0x7

    aput-object v0, v5, v6

    const-string v0, "Winamp PLSv2 Playlist"

    invoke-direct {v2, v3, v4, v5, v0}, Lcom/daaw/wk;-><init>([Ljava/lang/String;[Ljava/lang/String;[Lcom/daaw/gx0;Ljava/lang/String;)V

    aput-object v2, v1, v7

    sput-object v1, Lcom/daaw/gv0;->a:[Lcom/daaw/wk;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/io/InputStream;Ljava/lang/String;Lcom/daaw/bl0;)Lcom/daaw/oe1;
    .locals 10

    if-nez p2, :cond_0

    const-string p2, "UTF-8"

    :cond_0
    new-instance v0, Ljava/io/BufferedReader;

    new-instance v1, Ljava/io/InputStreamReader;

    invoke-direct {v1, p1, p2}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    new-instance p1, Lcom/daaw/fv0;

    invoke-direct {p1}, Lcom/daaw/fv0;-><init>()V

    invoke-virtual {p1, p0}, Lcom/daaw/fv0;->d(Lcom/daaw/pe1;)V

    const/4 p2, -0x1

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    :cond_1
    :goto_0
    invoke-virtual {v0}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    if-eqz v4, :cond_f

    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v6

    if-lez v6, :cond_1

    if-nez v3, :cond_3

    const-string v3, "[playlist]"

    invoke-virtual {v4, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    const/4 v3, 0x1

    goto :goto_0

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Not a PLS playlist format"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    const/16 v6, 0x3d

    invoke-virtual {v4, v6}, Ljava/lang/String;->indexOf(I)I

    move-result v6

    if-gtz v6, :cond_4

    const-string p1, "Malformed PLS playlist"

    :goto_1
    invoke-interface {p3, p1}, Lcom/daaw/bl0;->f(Ljava/lang/Object;)V

    :goto_2
    move-object p1, v5

    goto/16 :goto_6

    :cond_4
    invoke-virtual {v4, v1, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v7

    add-int/lit8 v6, v6, 0x1

    invoke-virtual {v4, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v4

    const-string v6, "numberofentries"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_7

    :try_start_0
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    if-gez v4, :cond_5

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Invalid NumberOfEntries in PLS playlist: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p3, p1}, Lcom/daaw/bl0;->e(Ljava/lang/Object;)V

    goto :goto_2

    :cond_5
    if-ltz p2, :cond_6

    if-eq p2, v4, :cond_6

    const-string p1, "PLS playlist number of entries already specified with a different value"

    goto :goto_1

    :cond_6
    move p2, v4

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/NumberFormatException;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    :cond_7
    const-string v6, "file"

    invoke-virtual {v7, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_9

    const/4 v6, 0x4

    invoke-virtual {v7, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v6

    :try_start_1
    invoke-static {v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v5
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0

    sub-int/2addr v5, v2

    invoke-virtual {p1}, Lcom/daaw/fv0;->c()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    :goto_3
    add-int/lit8 v7, v5, 0x1

    if-ge v6, v7, :cond_8

    invoke-virtual {p1}, Lcom/daaw/fv0;->c()Ljava/util/List;

    move-result-object v7

    new-instance v8, Lcom/daaw/a51;

    invoke-direct {v8}, Lcom/daaw/a51;-><init>()V

    invoke-interface {v7, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v6, v6, 0x1

    goto :goto_3

    :cond_8
    invoke-virtual {p1}, Lcom/daaw/fv0;->c()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/daaw/a51;

    invoke-virtual {v5, v4}, Lcom/daaw/a51;->e(Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_9
    const-string v6, "title"

    invoke-virtual {v7, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_b

    const/4 v6, 0x5

    invoke-virtual {v7, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v6

    :try_start_2
    invoke-static {v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v5
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_0

    sub-int/2addr v5, v2

    invoke-virtual {p1}, Lcom/daaw/fv0;->c()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    :goto_4
    add-int/lit8 v7, v5, 0x1

    if-ge v6, v7, :cond_a

    invoke-virtual {p1}, Lcom/daaw/fv0;->c()Ljava/util/List;

    move-result-object v7

    new-instance v8, Lcom/daaw/a51;

    invoke-direct {v8}, Lcom/daaw/a51;-><init>()V

    invoke-interface {v7, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v6, v6, 0x1

    goto :goto_4

    :cond_a
    invoke-virtual {p1}, Lcom/daaw/fv0;->c()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/daaw/a51;

    invoke-virtual {v5, v4}, Lcom/daaw/a51;->f(Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_b
    const-string v6, "length"

    invoke-virtual {v7, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_d

    const/4 v6, 0x6

    invoke-virtual {v7, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v6

    :try_start_3
    invoke-static {v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v6
    :try_end_3
    .catch Ljava/lang/NumberFormatException; {:try_start_3 .. :try_end_3} :catch_0

    sub-int/2addr v6, v2

    invoke-virtual {p1}, Lcom/daaw/fv0;->c()Ljava/util/List;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v7

    :goto_5
    add-int/lit8 v8, v6, 0x1

    if-ge v7, v8, :cond_c

    invoke-virtual {p1}, Lcom/daaw/fv0;->c()Ljava/util/List;

    move-result-object v8

    new-instance v9, Lcom/daaw/a51;

    invoke-direct {v9}, Lcom/daaw/a51;-><init>()V

    invoke-interface {v8, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v7, v7, 0x1

    goto :goto_5

    :cond_c
    invoke-virtual {p1}, Lcom/daaw/fv0;->c()Ljava/util/List;

    move-result-object v7

    invoke-interface {v7, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/daaw/a51;

    :try_start_4
    invoke-static {v4}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v7

    invoke-virtual {v6, v7, v8}, Lcom/daaw/a51;->d(J)V
    :try_end_4
    .catch Ljava/lang/NumberFormatException; {:try_start_4 .. :try_end_4} :catch_0

    goto/16 :goto_0

    :cond_d
    const-string v6, "version"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_e

    const-string v6, "2"

    invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_1

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Unknown PLS version "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto/16 :goto_1

    :cond_e
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Unknown PLS keyword "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {p3, v4}, Lcom/daaw/bl0;->e(Ljava/lang/Object;)V

    goto/16 :goto_0

    :cond_f
    :goto_6
    if-eqz p1, :cond_12

    if-gez p2, :cond_10

    const-string p2, "No number of entries in PLS playlist"

    invoke-interface {p3, p2}, Lcom/daaw/bl0;->e(Ljava/lang/Object;)V

    goto :goto_8

    :cond_10
    invoke-virtual {p1}, Lcom/daaw/fv0;->c()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    sub-int/2addr v0, p2

    if-lez v0, :cond_11

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Ignoring "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, " extra resources according to the specified number of entries "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p3, v2}, Lcom/daaw/bl0;->e(Ljava/lang/Object;)V

    :cond_11
    :goto_7
    if-ge v1, v0, :cond_12

    invoke-virtual {p1}, Lcom/daaw/fv0;->c()Ljava/util/List;

    move-result-object p3

    invoke-interface {p3, p2}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    add-int/lit8 v1, v1, 0x1

    goto :goto_7

    :cond_12
    :goto_8
    return-object p1
.end method

.method public b()[Lcom/daaw/wk;
    .locals 1

    sget-object v0, Lcom/daaw/gv0;->a:[Lcom/daaw/wk;

    invoke-virtual {v0}, [Lcom/daaw/wk;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/daaw/wk;

    return-object v0
.end method

.method public c(Lcom/daaw/ix0;)Lcom/daaw/oe1;
    .locals 2

    new-instance v0, Lcom/daaw/fv0;

    invoke-direct {v0}, Lcom/daaw/fv0;-><init>()V

    invoke-virtual {v0, p0}, Lcom/daaw/fv0;->d(Lcom/daaw/pe1;)V

    invoke-virtual {v0}, Lcom/daaw/fv0;->c()Ljava/util/List;

    move-result-object v1

    invoke-virtual {p1}, Lcom/daaw/ix0;->a()Lcom/daaw/fb1;

    move-result-object p1

    invoke-virtual {p0, v1, p1}, Lcom/daaw/gv0;->d(Ljava/util/List;Lcom/daaw/n;)V

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

    invoke-virtual {p0, p1, v5}, Lcom/daaw/gv0;->d(Ljava/util/List;Lcom/daaw/n;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "A PLS playlist cannot handle a sequence repeated indefinitely"

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

    const-string p2, "A PLS playlist cannot handle a media repeated indefinitely"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "A PLS playlist cannot handle a timed media"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    :goto_2
    return-void
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    const-string v0, "pls"

    return-object v0
.end method
