.class public final Lcom/daaw/a23;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:I

.field public final b:Lcom/daaw/u13;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/daaw/c23;

    invoke-direct {v0}, Lcom/daaw/c23;-><init>()V

    iput-object v0, p0, Lcom/daaw/a23;->b:Lcom/daaw/u13;

    iput p1, p0, Lcom/daaw/a23;->a:I

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/ArrayList;)Ljava/lang/String;
    .locals 7

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_0

    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    sget-object v5, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v4, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v4, 0xa

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "\n"

    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    array-length v0, p1

    if-nez v0, :cond_1

    const-string p1, ""

    goto :goto_3

    :cond_1
    new-instance v0, Lcom/daaw/z13;

    invoke-direct {v0}, Lcom/daaw/z13;-><init>()V

    new-instance v1, Ljava/util/PriorityQueue;

    iget v3, p0, Lcom/daaw/a23;->a:I

    new-instance v4, Lcom/daaw/v13;

    invoke-direct {v4, p0}, Lcom/daaw/v13;-><init>(Lcom/daaw/a23;)V

    invoke-direct {v1, v3, v4}, Ljava/util/PriorityQueue;-><init>(ILjava/util/Comparator;)V

    const/4 v3, 0x0

    :goto_1
    array-length v4, p1

    if-ge v3, v4, :cond_3

    aget-object v4, p1, v3

    invoke-static {v4, v2}, Lcom/daaw/b23;->b(Ljava/lang/String;Z)[Ljava/lang/String;

    move-result-object v4

    array-length v5, v4

    if-eqz v5, :cond_2

    iget v5, p0, Lcom/daaw/a23;->a:I

    const/4 v6, 0x6

    invoke-static {v4, v5, v6, v1}, Lcom/daaw/f23;->c([Ljava/lang/String;IILjava/util/PriorityQueue;)V

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_3
    invoke-virtual {v1}, Ljava/util/PriorityQueue;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/e23;

    :try_start_0
    iget-object v2, p0, Lcom/daaw/a23;->b:Lcom/daaw/u13;

    iget-object v1, v1, Lcom/daaw/e23;->b:Ljava/lang/String;

    invoke-virtual {v2, v1}, Lcom/daaw/u13;->b(Ljava/lang/String;)[B

    move-result-object v1

    iget-object v2, v0, Lcom/daaw/z13;->b:Landroid/util/Base64OutputStream;

    invoke-virtual {v2, v1}, Landroid/util/Base64OutputStream;->write([B)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    const-string v1, "Error while writing hash to byteStream"

    invoke-static {v1, p1}, Lcom/daaw/k04;->zzh(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_4
    invoke-virtual {v0}, Lcom/daaw/z13;->toString()Ljava/lang/String;

    move-result-object p1

    :goto_3
    return-object p1
.end method
