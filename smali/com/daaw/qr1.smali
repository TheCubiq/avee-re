.class public Lcom/daaw/qr1;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/qr1$a;
    }
.end annotation


# instance fields
.field public a:Lcom/daaw/rc0;

.field public b:Lcom/daaw/sr1;

.field public c:[Lcom/daaw/wr1;

.field public d:I

.field public final e:I

.field public f:Lcom/daaw/f0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/f0<",
            "Lcom/daaw/y31;",
            "Lcom/daaw/sr1;",
            ">;"
        }
    .end annotation
.end field

.field public g:Lcom/daaw/f0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/f0<",
            "Lcom/daaw/y31;",
            "Lcom/daaw/sr1;",
            ">;"
        }
    .end annotation
.end field

.field public h:Z

.field public i:Z


# direct methods
.method public varargs constructor <init>(Lcom/daaw/rc0;Lcom/daaw/sr1;[Lcom/daaw/qr1$a;)V
    .locals 10

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x4

    iput v0, p0, Lcom/daaw/qr1;->e:I

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/qr1;->f:Lcom/daaw/f0;

    iput-object v0, p0, Lcom/daaw/qr1;->g:Lcom/daaw/f0;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/qr1;->h:Z

    iput-boolean v0, p0, Lcom/daaw/qr1;->i:Z

    iput-object p1, p0, Lcom/daaw/qr1;->a:Lcom/daaw/rc0;

    iput-object p2, p0, Lcom/daaw/qr1;->b:Lcom/daaw/sr1;

    array-length p1, p3

    new-array p1, p1, [Lcom/daaw/wr1;

    iput-object p1, p0, Lcom/daaw/qr1;->c:[Lcom/daaw/wr1;

    const/4 p1, 0x0

    iput p1, p0, Lcom/daaw/qr1;->d:I

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lcom/daaw/qr1;->c:[Lcom/daaw/wr1;

    array-length v2, v1

    if-ge v0, v2, :cond_0

    aget-object v2, p3, v0

    new-instance v9, Lcom/daaw/wr1;

    iget-object v3, v2, Lcom/daaw/qr1$a;->b:Ljava/lang/String;

    invoke-virtual {p2, v3}, Lcom/daaw/dc1;->i(Ljava/lang/String;)I

    move-result v4

    iget-object v5, v2, Lcom/daaw/qr1$a;->b:Ljava/lang/String;

    iget v6, v2, Lcom/daaw/qr1$a;->c:I

    iget v7, v2, Lcom/daaw/qr1$a;->d:I

    iget v8, v2, Lcom/daaw/qr1$a;->e:I

    move-object v3, v9

    invoke-direct/range {v3 .. v8}, Lcom/daaw/wr1;-><init>(ILjava/lang/String;III)V

    aput-object v9, v1, v0

    iget v1, p0, Lcom/daaw/qr1;->d:I

    iget v2, v2, Lcom/daaw/qr1$a;->e:I

    add-int/2addr v1, v2

    iput v1, p0, Lcom/daaw/qr1;->d:I

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    :goto_1
    iget-object p2, p0, Lcom/daaw/qr1;->c:[Lcom/daaw/wr1;

    array-length p3, p2

    if-ge p1, p3, :cond_2

    aget-object p2, p2, p1

    iget p2, p2, Lcom/daaw/ls1;->c:I

    if-gez p2, :cond_1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "ERROR attribute not found "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p3, p0, Lcom/daaw/qr1;->c:[Lcom/daaw/wr1;

    aget-object p3, p3, p1

    iget-object p3, p3, Lcom/daaw/ls1;->a:Ljava/lang/String;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lcom/daaw/lz1;->c(Ljava/lang/String;)V

    :cond_1
    add-int/lit8 p1, p1, 0x1

    goto :goto_1

    :cond_2
    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/y31;Lcom/daaw/g0;Lcom/daaw/w31;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/y31;",
            "Lcom/daaw/g0<",
            "Lcom/daaw/y31;",
            "Lcom/daaw/sr1;",
            "Lcom/daaw/w31;",
            ">;",
            "Lcom/daaw/w31;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/qr1;->b:Lcom/daaw/sr1;

    invoke-virtual {p1, v0}, Lcom/daaw/y31;->p(Lcom/daaw/dc1;)V

    iget-object v0, p0, Lcom/daaw/qr1;->f:Lcom/daaw/f0;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/daaw/qr1;->b:Lcom/daaw/sr1;

    invoke-interface {v0, p1, v1}, Lcom/daaw/f0;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_0
    iget-object v0, p0, Lcom/daaw/qr1;->g:Lcom/daaw/f0;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/daaw/qr1;->b:Lcom/daaw/sr1;

    invoke-interface {v0, p1, v1}, Lcom/daaw/f0;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_1
    if-eqz p2, :cond_2

    iget-object v0, p0, Lcom/daaw/qr1;->b:Lcom/daaw/sr1;

    invoke-interface {p2, p1, v0, p3}, Lcom/daaw/g0;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_2
    iget-object p1, p0, Lcom/daaw/qr1;->a:Lcom/daaw/rc0;

    invoke-interface {p1}, Lcom/daaw/rc0;->b()V

    iget p1, p0, Lcom/daaw/qr1;->d:I

    const/4 p2, 0x0

    const/4 p3, 0x0

    const/4 v6, 0x0

    :goto_0
    iget-object v0, p0, Lcom/daaw/qr1;->c:[Lcom/daaw/wr1;

    array-length v1, v0

    if-ge p3, v1, :cond_5

    aget-object v7, v0, p3

    iget v0, v7, Lcom/daaw/ls1;->c:I

    if-gez v0, :cond_3

    goto :goto_2

    :cond_3
    invoke-static {v0}, Landroid/opengl/GLES20;->glEnableVertexAttribArray(I)V

    iget v0, v7, Lcom/daaw/ls1;->c:I

    iget v1, v7, Lcom/daaw/ls1;->b:I

    iget v2, v7, Lcom/daaw/wr1;->d:I

    const/16 v3, 0x1406

    if-eq v2, v3, :cond_4

    const/4 v3, 0x1

    goto :goto_1

    :cond_4
    const/4 v3, 0x0

    :goto_1
    move v4, p1

    move v5, v6

    invoke-static/range {v0 .. v5}, Landroid/opengl/GLES20;->glVertexAttribPointer(IIIZII)V

    iget v0, v7, Lcom/daaw/wr1;->e:I

    add-int/2addr v6, v0

    :goto_2
    add-int/lit8 p3, p3, 0x1

    goto :goto_0

    :cond_5
    return-void
.end method

.method public b(III)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/qr1;->a:Lcom/daaw/rc0;

    invoke-interface {v0, p1, p2, p3}, Lcom/daaw/rc0;->c(III)V

    return-void
.end method

.method public c(ZLcom/daaw/f0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lcom/daaw/f0<",
            "Lcom/daaw/y31;",
            "Lcom/daaw/sr1;",
            ">;)V"
        }
    .end annotation

    iput-boolean p1, p0, Lcom/daaw/qr1;->h:Z

    iput-object p2, p0, Lcom/daaw/qr1;->f:Lcom/daaw/f0;

    return-void
.end method

.method public d(Lcom/daaw/y31;)V
    .locals 2

    invoke-virtual {p1}, Lcom/daaw/y31;->V()V

    iget-object p1, p0, Lcom/daaw/qr1;->a:Lcom/daaw/rc0;

    invoke-interface {p1}, Lcom/daaw/rc0;->a()V

    const/4 p1, 0x0

    :goto_0
    iget-object v0, p0, Lcom/daaw/qr1;->c:[Lcom/daaw/wr1;

    array-length v1, v0

    if-ge p1, v1, :cond_0

    aget-object v0, v0, p1

    iget v0, v0, Lcom/daaw/ls1;->c:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glDisableVertexAttribArray(I)V

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Lcom/daaw/qr1;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lcom/daaw/qr1;

    if-ne p0, p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method
