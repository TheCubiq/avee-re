.class public Lcom/daaw/id0;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public a:Ljava/lang/String;

.field public b:I

.field public c:[B

.field public d:Z

.field public e:Z

.field public f:Z

.field public g:Z

.field public h:Z

.field public i:Z

.field public j:Z

.field public k:Z


# direct methods
.method public constructor <init>([BI)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/id0;->b:I

    const/4 v1, 0x0

    iput-object v1, p0, Lcom/daaw/id0;->c:[B

    iput-boolean v0, p0, Lcom/daaw/id0;->d:Z

    iput-boolean v0, p0, Lcom/daaw/id0;->e:Z

    iput-boolean v0, p0, Lcom/daaw/id0;->f:Z

    iput-boolean v0, p0, Lcom/daaw/id0;->g:Z

    iput-boolean v0, p0, Lcom/daaw/id0;->h:Z

    iput-boolean v0, p0, Lcom/daaw/id0;->i:Z

    iput-boolean v0, p0, Lcom/daaw/id0;->j:Z

    iput-boolean v0, p0, Lcom/daaw/id0;->k:Z

    invoke-virtual {p0, p1, p2}, Lcom/daaw/id0;->g([BI)V

    return-void
.end method


# virtual methods
.method public a()[B
    .locals 1

    iget-object v0, p0, Lcom/daaw/id0;->c:[B

    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/id0;->a:Ljava/lang/String;

    return-object v0
.end method

.method public c()I
    .locals 1

    iget v0, p0, Lcom/daaw/id0;->b:I

    add-int/lit8 v0, v0, 0xa

    return v0
.end method

.method public d()V
    .locals 3

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lcom/daaw/id0;->a:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-ge v0, v1, :cond_3

    iget-object v1, p0, Lcom/daaw/id0;->a:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v2, 0x41

    if-lt v1, v2, :cond_0

    iget-object v1, p0, Lcom/daaw/id0;->a:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v2, 0x5a

    if-le v1, v2, :cond_1

    :cond_0
    iget-object v1, p0, Lcom/daaw/id0;->a:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v2, 0x30

    if-lt v1, v2, :cond_2

    iget-object v1, p0, Lcom/daaw/id0;->a:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v2, 0x39

    if-gt v1, v2, :cond_2

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    new-instance v0, Lcom/daaw/xg0;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Not a valid frame - invalid tag "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/daaw/id0;->a:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/daaw/xg0;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    return-void
.end method

.method public e([BI)V
    .locals 3

    add-int/lit8 p2, p2, 0x4

    aget-byte v0, p1, p2

    add-int/lit8 v1, p2, 0x1

    aget-byte v1, p1, v1

    add-int/lit8 v2, p2, 0x2

    aget-byte v2, p1, v2

    add-int/lit8 p2, p2, 0x3

    aget-byte p1, p1, p2

    invoke-static {v0, v1, v2, p1}, Lcom/daaw/wc;->l(BBBB)I

    move-result p1

    iput p1, p0, Lcom/daaw/id0;->b:I

    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-nez p1, :cond_1

    return v1

    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_2

    return v1

    :cond_2
    check-cast p1, Lcom/daaw/id0;

    iget-boolean v2, p0, Lcom/daaw/id0;->h:Z

    iget-boolean v3, p1, Lcom/daaw/id0;->h:Z

    if-eq v2, v3, :cond_3

    return v1

    :cond_3
    iget-object v2, p0, Lcom/daaw/id0;->c:[B

    iget-object v3, p1, Lcom/daaw/id0;->c:[B

    invoke-static {v2, v3}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v2

    if-nez v2, :cond_4

    return v1

    :cond_4
    iget v2, p0, Lcom/daaw/id0;->b:I

    iget v3, p1, Lcom/daaw/id0;->b:I

    if-eq v2, v3, :cond_5

    return v1

    :cond_5
    iget-boolean v2, p0, Lcom/daaw/id0;->k:Z

    iget-boolean v3, p1, Lcom/daaw/id0;->k:Z

    if-eq v2, v3, :cond_6

    return v1

    :cond_6
    iget-boolean v2, p0, Lcom/daaw/id0;->i:Z

    iget-boolean v3, p1, Lcom/daaw/id0;->i:Z

    if-eq v2, v3, :cond_7

    return v1

    :cond_7
    iget-boolean v2, p0, Lcom/daaw/id0;->g:Z

    iget-boolean v3, p1, Lcom/daaw/id0;->g:Z

    if-eq v2, v3, :cond_8

    return v1

    :cond_8
    iget-object v2, p0, Lcom/daaw/id0;->a:Ljava/lang/String;

    if-nez v2, :cond_9

    iget-object v2, p1, Lcom/daaw/id0;->a:Ljava/lang/String;

    if-eqz v2, :cond_a

    return v1

    :cond_9
    iget-object v3, p1, Lcom/daaw/id0;->a:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_a

    return v1

    :cond_a
    iget-boolean v2, p0, Lcom/daaw/id0;->e:Z

    iget-boolean v3, p1, Lcom/daaw/id0;->e:Z

    if-eq v2, v3, :cond_b

    return v1

    :cond_b
    iget-boolean v2, p0, Lcom/daaw/id0;->d:Z

    iget-boolean v3, p1, Lcom/daaw/id0;->d:Z

    if-eq v2, v3, :cond_c

    return v1

    :cond_c
    iget-boolean v2, p0, Lcom/daaw/id0;->f:Z

    iget-boolean v3, p1, Lcom/daaw/id0;->f:Z

    if-eq v2, v3, :cond_d

    return v1

    :cond_d
    iget-boolean v2, p0, Lcom/daaw/id0;->j:Z

    iget-boolean p1, p1, Lcom/daaw/id0;->j:Z

    if-eq v2, p1, :cond_e

    return v1

    :cond_e
    return v0
.end method

.method public final f([BI)V
    .locals 4

    add-int/lit8 v0, p2, 0x8

    aget-byte v1, p1, v0

    const/4 v2, 0x6

    invoke-static {v1, v2}, Lcom/daaw/wc;->d(BI)Z

    move-result v1

    iput-boolean v1, p0, Lcom/daaw/id0;->d:Z

    aget-byte v1, p1, v0

    const/4 v3, 0x5

    invoke-static {v1, v3}, Lcom/daaw/wc;->d(BI)Z

    move-result v1

    iput-boolean v1, p0, Lcom/daaw/id0;->e:Z

    aget-byte v0, p1, v0

    const/4 v1, 0x4

    invoke-static {v0, v1}, Lcom/daaw/wc;->d(BI)Z

    move-result v0

    iput-boolean v0, p0, Lcom/daaw/id0;->f:Z

    add-int/lit8 p2, p2, 0x9

    aget-byte v0, p1, p2

    invoke-static {v0, v2}, Lcom/daaw/wc;->d(BI)Z

    move-result v0

    iput-boolean v0, p0, Lcom/daaw/id0;->g:Z

    aget-byte v0, p1, p2

    const/4 v1, 0x3

    invoke-static {v0, v1}, Lcom/daaw/wc;->d(BI)Z

    move-result v0

    iput-boolean v0, p0, Lcom/daaw/id0;->h:Z

    aget-byte v0, p1, p2

    const/4 v1, 0x2

    invoke-static {v0, v1}, Lcom/daaw/wc;->d(BI)Z

    move-result v0

    iput-boolean v0, p0, Lcom/daaw/id0;->i:Z

    aget-byte v0, p1, p2

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/daaw/wc;->d(BI)Z

    move-result v0

    iput-boolean v0, p0, Lcom/daaw/id0;->j:Z

    aget-byte p1, p1, p2

    const/4 p2, 0x0

    invoke-static {p1, p2}, Lcom/daaw/wc;->d(BI)Z

    move-result p1

    iput-boolean p1, p0, Lcom/daaw/id0;->k:Z

    return-void
.end method

.method public final g([BI)V
    .locals 1

    invoke-virtual {p0, p1, p2}, Lcom/daaw/id0;->h([BI)I

    move-result p2

    invoke-virtual {p0}, Lcom/daaw/id0;->d()V

    iget v0, p0, Lcom/daaw/id0;->b:I

    invoke-static {p1, p2, v0}, Lcom/daaw/wc;->e([BII)[B

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/id0;->c:[B

    return-void
.end method

.method public h([BI)I
    .locals 2

    add-int/lit8 v0, p2, 0x0

    const/4 v1, 0x4

    invoke-static {p1, v0, v1}, Lcom/daaw/wc;->c([BII)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/id0;->a:Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/id0;->e([BI)V

    invoke-virtual {p0, p1, p2}, Lcom/daaw/id0;->f([BI)V

    add-int/lit8 p2, p2, 0xa

    return p2
.end method

.method public hashCode()I
    .locals 5

    iget-boolean v0, p0, Lcom/daaw/id0;->h:Z

    const/16 v1, 0x4cf

    const/16 v2, 0x4d5

    if-eqz v0, :cond_0

    const/16 v0, 0x4cf

    goto :goto_0

    :cond_0
    const/16 v0, 0x4d5

    :goto_0
    const/16 v3, 0x1f

    add-int/2addr v0, v3

    mul-int/lit8 v0, v0, 0x1f

    iget-object v4, p0, Lcom/daaw/id0;->c:[B

    invoke-static {v4}, Ljava/util/Arrays;->hashCode([B)I

    move-result v4

    add-int/2addr v0, v4

    mul-int/lit8 v0, v0, 0x1f

    iget v4, p0, Lcom/daaw/id0;->b:I

    add-int/2addr v0, v4

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v4, p0, Lcom/daaw/id0;->k:Z

    if-eqz v4, :cond_1

    const/16 v4, 0x4cf

    goto :goto_1

    :cond_1
    const/16 v4, 0x4d5

    :goto_1
    add-int/2addr v0, v4

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v4, p0, Lcom/daaw/id0;->i:Z

    if-eqz v4, :cond_2

    const/16 v4, 0x4cf

    goto :goto_2

    :cond_2
    const/16 v4, 0x4d5

    :goto_2
    add-int/2addr v0, v4

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v4, p0, Lcom/daaw/id0;->g:Z

    if-eqz v4, :cond_3

    const/16 v4, 0x4cf

    goto :goto_3

    :cond_3
    const/16 v4, 0x4d5

    :goto_3
    add-int/2addr v0, v4

    mul-int/lit8 v0, v0, 0x1f

    iget-object v4, p0, Lcom/daaw/id0;->a:Ljava/lang/String;

    if-nez v4, :cond_4

    const/4 v4, 0x0

    goto :goto_4

    :cond_4
    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    move-result v4

    :goto_4
    add-int/2addr v0, v4

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v4, p0, Lcom/daaw/id0;->e:Z

    if-eqz v4, :cond_5

    const/16 v4, 0x4cf

    goto :goto_5

    :cond_5
    const/16 v4, 0x4d5

    :goto_5
    add-int/2addr v0, v4

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v4, p0, Lcom/daaw/id0;->d:Z

    if-eqz v4, :cond_6

    const/16 v4, 0x4cf

    goto :goto_6

    :cond_6
    const/16 v4, 0x4d5

    :goto_6
    add-int/2addr v0, v4

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v4, p0, Lcom/daaw/id0;->f:Z

    if-eqz v4, :cond_7

    const/16 v4, 0x4cf

    goto :goto_7

    :cond_7
    const/16 v4, 0x4d5

    :goto_7
    add-int/2addr v0, v4

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v3, p0, Lcom/daaw/id0;->j:Z

    if-eqz v3, :cond_8

    goto :goto_8

    :cond_8
    const/16 v1, 0x4d5

    :goto_8
    add-int/2addr v0, v1

    return v0
.end method
