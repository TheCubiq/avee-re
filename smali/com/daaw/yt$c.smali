.class public final Lcom/daaw/yt$c;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/yt;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "c"
.end annotation


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:[J

.field public c:[Ljava/io/File;

.field public d:[Ljava/io/File;

.field public e:Z

.field public f:Lcom/daaw/yt$b;

.field public g:J

.field public final synthetic h:Lcom/daaw/yt;


# direct methods
.method public constructor <init>(Lcom/daaw/yt;Ljava/lang/String;)V
    .locals 6

    iput-object p1, p0, Lcom/daaw/yt$c;->h:Lcom/daaw/yt;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/daaw/yt$c;->a:Ljava/lang/String;

    invoke-static {p1}, Lcom/daaw/yt;->q(Lcom/daaw/yt;)I

    move-result v0

    new-array v0, v0, [J

    iput-object v0, p0, Lcom/daaw/yt$c;->b:[J

    invoke-static {p1}, Lcom/daaw/yt;->q(Lcom/daaw/yt;)I

    move-result v0

    new-array v0, v0, [Ljava/io/File;

    iput-object v0, p0, Lcom/daaw/yt$c;->c:[Ljava/io/File;

    invoke-static {p1}, Lcom/daaw/yt;->q(Lcom/daaw/yt;)I

    move-result v0

    new-array v0, v0, [Ljava/io/File;

    iput-object v0, p0, Lcom/daaw/yt$c;->d:[Ljava/io/File;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/16 p2, 0x2e

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result p2

    const/4 v1, 0x0

    :goto_0
    invoke-static {p1}, Lcom/daaw/yt;->q(Lcom/daaw/yt;)I

    move-result v2

    if-ge v1, v2, :cond_0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/daaw/yt$c;->c:[Ljava/io/File;

    new-instance v3, Ljava/io/File;

    invoke-static {p1}, Lcom/daaw/yt;->u(Lcom/daaw/yt;)Ljava/io/File;

    move-result-object v4

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v3, v4, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    aput-object v3, v2, v1

    const-string v2, ".tmp"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/daaw/yt$c;->d:[Ljava/io/File;

    new-instance v3, Ljava/io/File;

    invoke-static {p1}, Lcom/daaw/yt;->u(Lcom/daaw/yt;)Ljava/io/File;

    move-result-object v4

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v3, v4, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    aput-object v3, v2, v1

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->setLength(I)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public synthetic constructor <init>(Lcom/daaw/yt;Ljava/lang/String;Lcom/daaw/yt$a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/daaw/yt$c;-><init>(Lcom/daaw/yt;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic a(Lcom/daaw/yt$c;)[J
    .locals 0

    iget-object p0, p0, Lcom/daaw/yt$c;->b:[J

    return-object p0
.end method

.method public static synthetic b(Lcom/daaw/yt$c;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/daaw/yt$c;->a:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic c(Lcom/daaw/yt$c;)J
    .locals 2

    iget-wide v0, p0, Lcom/daaw/yt$c;->g:J

    return-wide v0
.end method

.method public static synthetic d(Lcom/daaw/yt$c;J)J
    .locals 0

    iput-wide p1, p0, Lcom/daaw/yt$c;->g:J

    return-wide p1
.end method

.method public static synthetic e(Lcom/daaw/yt$c;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/daaw/yt$c;->e:Z

    return p0
.end method

.method public static synthetic f(Lcom/daaw/yt$c;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/daaw/yt$c;->e:Z

    return p1
.end method

.method public static synthetic g(Lcom/daaw/yt$c;)Lcom/daaw/yt$b;
    .locals 0

    iget-object p0, p0, Lcom/daaw/yt$c;->f:Lcom/daaw/yt$b;

    return-object p0
.end method

.method public static synthetic h(Lcom/daaw/yt$c;Lcom/daaw/yt$b;)Lcom/daaw/yt$b;
    .locals 0

    iput-object p1, p0, Lcom/daaw/yt$c;->f:Lcom/daaw/yt$b;

    return-object p1
.end method

.method public static synthetic i(Lcom/daaw/yt$c;[Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/daaw/yt$c;->n([Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public j(I)Ljava/io/File;
    .locals 1

    iget-object v0, p0, Lcom/daaw/yt$c;->c:[Ljava/io/File;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public k(I)Ljava/io/File;
    .locals 1

    iget-object v0, p0, Lcom/daaw/yt$c;->d:[Ljava/io/File;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public l()Ljava/lang/String;
    .locals 7

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/daaw/yt$c;->b:[J

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    aget-wide v4, v1, v3

    const/16 v6, 0x20

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final m([Ljava/lang/String;)Ljava/io/IOException;
    .locals 3

    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "unexpected journal line: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final n([Ljava/lang/String;)V
    .locals 4

    array-length v0, p1

    iget-object v1, p0, Lcom/daaw/yt$c;->h:Lcom/daaw/yt;

    invoke-static {v1}, Lcom/daaw/yt;->q(Lcom/daaw/yt;)I

    move-result v1

    if-ne v0, v1, :cond_1

    const/4 v0, 0x0

    :goto_0
    :try_start_0
    array-length v1, p1

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Lcom/daaw/yt$c;->b:[J

    aget-object v2, p1, v0

    invoke-static {v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v2

    aput-wide v2, v1, v0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void

    :catch_0
    invoke-virtual {p0, p1}, Lcom/daaw/yt$c;->m([Ljava/lang/String;)Ljava/io/IOException;

    move-result-object p1

    throw p1

    :cond_1
    invoke-virtual {p0, p1}, Lcom/daaw/yt$c;->m([Ljava/lang/String;)Ljava/io/IOException;

    move-result-object p1

    goto :goto_2

    :goto_1
    throw p1

    :goto_2
    goto :goto_1
.end method
