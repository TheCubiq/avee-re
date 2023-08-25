.class public final Lcom/daaw/t52;
.super Lcom/daaw/y52;
.source ""


# static fields
.field public static final e:[I


# instance fields
.field public b:Z

.field public c:Z

.field public d:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x4

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lcom/daaw/t52;->e:[I

    return-void

    nop

    :array_0
    .array-data 4
        0x1588
        0x2b11
        0x5622
        0xac44
    .end array-data
.end method

.method public constructor <init>(Lcom/daaw/m42;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/daaw/y52;-><init>(Lcom/daaw/m42;)V

    return-void
.end method


# virtual methods
.method public final a(Lcom/daaw/ik5;)Z
    .locals 3

    iget-boolean v0, p0, Lcom/daaw/t52;->b:Z

    const/4 v1, 0x1

    if-nez v0, :cond_5

    invoke-virtual {p1}, Lcom/daaw/ik5;->s()I

    move-result p1

    shr-int/lit8 v0, p1, 0x4

    iput v0, p0, Lcom/daaw/t52;->d:I

    const/4 v2, 0x2

    if-ne v0, v2, :cond_0

    sget-object v0, Lcom/daaw/t52;->e:[I

    shr-int/2addr p1, v2

    and-int/lit8 p1, p1, 0x3

    aget p1, v0, p1

    new-instance v0, Lcom/daaw/b72;

    invoke-direct {v0}, Lcom/daaw/b72;-><init>()V

    const-string v2, "audio/mpeg"

    invoke-virtual {v0, v2}, Lcom/daaw/b72;->s(Ljava/lang/String;)Lcom/daaw/b72;

    invoke-virtual {v0, v1}, Lcom/daaw/b72;->e0(I)Lcom/daaw/b72;

    :goto_0
    invoke-virtual {v0, p1}, Lcom/daaw/b72;->t(I)Lcom/daaw/b72;

    invoke-virtual {v0}, Lcom/daaw/b72;->y()Lcom/daaw/f92;

    move-result-object p1

    iget-object v0, p0, Lcom/daaw/y52;->a:Lcom/daaw/m42;

    invoke-interface {v0, p1}, Lcom/daaw/m42;->f(Lcom/daaw/f92;)V

    iput-boolean v1, p0, Lcom/daaw/t52;->c:Z

    goto :goto_3

    :cond_0
    const/4 p1, 0x7

    if-eq v0, p1, :cond_3

    const/16 v2, 0x8

    if-ne v0, v2, :cond_1

    goto :goto_1

    :cond_1
    const/16 p1, 0xa

    if-ne v0, p1, :cond_2

    goto :goto_3

    :cond_2
    new-instance p1, Lcom/daaw/x52;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Audio format not supported: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/daaw/x52;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    :goto_1
    if-ne v0, p1, :cond_4

    const-string p1, "audio/g711-alaw"

    goto :goto_2

    :cond_4
    const-string p1, "audio/g711-mlaw"

    :goto_2
    new-instance v0, Lcom/daaw/b72;

    invoke-direct {v0}, Lcom/daaw/b72;-><init>()V

    invoke-virtual {v0, p1}, Lcom/daaw/b72;->s(Ljava/lang/String;)Lcom/daaw/b72;

    invoke-virtual {v0, v1}, Lcom/daaw/b72;->e0(I)Lcom/daaw/b72;

    const/16 p1, 0x1f40

    goto :goto_0

    :goto_3
    iput-boolean v1, p0, Lcom/daaw/t52;->b:Z

    goto :goto_4

    :cond_5
    invoke-virtual {p1, v1}, Lcom/daaw/ik5;->g(I)V

    :goto_4
    return v1
.end method

.method public final b(Lcom/daaw/ik5;J)Z
    .locals 12

    iget v0, p0, Lcom/daaw/t52;->d:I

    const/4 v1, 0x1

    const/4 v2, 0x2

    if-ne v0, v2, :cond_0

    invoke-virtual {p1}, Lcom/daaw/ik5;->i()I

    move-result v7

    iget-object v0, p0, Lcom/daaw/y52;->a:Lcom/daaw/m42;

    invoke-interface {v0, p1, v7}, Lcom/daaw/m42;->c(Lcom/daaw/ik5;I)V

    iget-object v3, p0, Lcom/daaw/y52;->a:Lcom/daaw/m42;

    const/4 v6, 0x1

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-wide v4, p2

    invoke-interface/range {v3 .. v9}, Lcom/daaw/m42;->b(JIIILcom/daaw/l42;)V

    return v1

    :cond_0
    invoke-virtual {p1}, Lcom/daaw/ik5;->s()I

    move-result v0

    const/4 v2, 0x0

    if-nez v0, :cond_2

    iget-boolean v3, p0, Lcom/daaw/t52;->c:Z

    if-eqz v3, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lcom/daaw/ik5;->i()I

    move-result p2

    new-array p3, p2, [B

    invoke-virtual {p1, p3, v2, p2}, Lcom/daaw/ik5;->b([BII)V

    invoke-static {p3}, Lcom/daaw/zy8;->a([B)Lcom/daaw/yy8;

    move-result-object p1

    new-instance p2, Lcom/daaw/b72;

    invoke-direct {p2}, Lcom/daaw/b72;-><init>()V

    const-string v0, "audio/mp4a-latm"

    invoke-virtual {p2, v0}, Lcom/daaw/b72;->s(Ljava/lang/String;)Lcom/daaw/b72;

    iget-object v0, p1, Lcom/daaw/yy8;->c:Ljava/lang/String;

    invoke-virtual {p2, v0}, Lcom/daaw/b72;->f0(Ljava/lang/String;)Lcom/daaw/b72;

    iget v0, p1, Lcom/daaw/yy8;->b:I

    invoke-virtual {p2, v0}, Lcom/daaw/b72;->e0(I)Lcom/daaw/b72;

    iget p1, p1, Lcom/daaw/yy8;->a:I

    invoke-virtual {p2, p1}, Lcom/daaw/b72;->t(I)Lcom/daaw/b72;

    invoke-static {p3}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/daaw/b72;->i(Ljava/util/List;)Lcom/daaw/b72;

    invoke-virtual {p2}, Lcom/daaw/b72;->y()Lcom/daaw/f92;

    move-result-object p1

    iget-object p2, p0, Lcom/daaw/y52;->a:Lcom/daaw/m42;

    invoke-interface {p2, p1}, Lcom/daaw/m42;->f(Lcom/daaw/f92;)V

    iput-boolean v1, p0, Lcom/daaw/t52;->c:Z

    return v2

    :cond_2
    :goto_0
    iget v3, p0, Lcom/daaw/t52;->d:I

    const/16 v4, 0xa

    if-ne v3, v4, :cond_4

    if-ne v0, v1, :cond_3

    goto :goto_1

    :cond_3
    return v2

    :cond_4
    :goto_1
    invoke-virtual {p1}, Lcom/daaw/ik5;->i()I

    move-result v9

    iget-object v0, p0, Lcom/daaw/y52;->a:Lcom/daaw/m42;

    invoke-interface {v0, p1, v9}, Lcom/daaw/m42;->c(Lcom/daaw/ik5;I)V

    iget-object v5, p0, Lcom/daaw/y52;->a:Lcom/daaw/m42;

    const/4 v8, 0x1

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-wide v6, p2

    invoke-interface/range {v5 .. v11}, Lcom/daaw/m42;->b(JIIILcom/daaw/l42;)V

    return v1
.end method
