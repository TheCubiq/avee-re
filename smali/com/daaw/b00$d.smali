.class public final Lcom/daaw/b00$d;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/b00;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation


# instance fields
.field public final a:[Lcom/daaw/zz;

.field public final b:Lcom/daaw/d00;

.field public c:Lcom/daaw/zz;


# direct methods
.method public constructor <init>([Lcom/daaw/zz;Lcom/daaw/d00;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/b00$d;->a:[Lcom/daaw/zz;

    iput-object p2, p0, Lcom/daaw/b00$d;->b:Lcom/daaw/d00;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/b00$d;->c:Lcom/daaw/zz;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/daaw/zz;->a()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/b00$d;->c:Lcom/daaw/zz;

    :cond_0
    return-void
.end method

.method public b(Lcom/daaw/a00;Landroid/net/Uri;)Lcom/daaw/zz;
    .locals 5

    iget-object v0, p0, Lcom/daaw/b00$d;->c:Lcom/daaw/zz;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/daaw/b00$d;->a:[Lcom/daaw/zz;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    aget-object v3, v0, v2

    :try_start_0
    invoke-interface {v3, p1}, Lcom/daaw/zz;->c(Lcom/daaw/a00;)Z

    move-result v4

    if-eqz v4, :cond_1

    iput-object v3, p0, Lcom/daaw/b00$d;->c:Lcom/daaw/zz;
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {p1}, Lcom/daaw/a00;->i()V

    goto :goto_1

    :catchall_0
    move-exception p2

    invoke-interface {p1}, Lcom/daaw/a00;->i()V

    throw p2

    :catch_0
    :cond_1
    invoke-interface {p1}, Lcom/daaw/a00;->i()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    iget-object p1, p0, Lcom/daaw/b00$d;->c:Lcom/daaw/zz;

    if-eqz p1, :cond_3

    iget-object p2, p0, Lcom/daaw/b00$d;->b:Lcom/daaw/d00;

    invoke-interface {p1, p2}, Lcom/daaw/zz;->i(Lcom/daaw/d00;)V

    iget-object p1, p0, Lcom/daaw/b00$d;->c:Lcom/daaw/zz;

    return-object p1

    :cond_3
    new-instance p1, Lcom/daaw/qp1;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "None of the available extractors ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/daaw/b00$d;->a:[Lcom/daaw/zz;

    invoke-static {v1}, Lcom/daaw/sq1;->t([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ") could read the stream."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0, p2}, Lcom/daaw/qp1;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    goto :goto_3

    :goto_2
    throw p1

    :goto_3
    goto :goto_2
.end method
