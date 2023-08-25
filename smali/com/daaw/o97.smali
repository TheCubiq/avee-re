.class public final Lcom/daaw/o97;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:[B

.field public final c:Lcom/daaw/zn7;

.field public final d:I

.field public final e:Lcom/daaw/m87;

.field public final f:I


# direct methods
.method public constructor <init>(Ljava/lang/Object;[BILcom/daaw/zn7;ILcom/daaw/m87;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/o97;->a:Ljava/lang/Object;

    array-length p1, p2

    invoke-static {p2, p1}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/o97;->b:[B

    iput p3, p0, Lcom/daaw/o97;->f:I

    iput-object p4, p0, Lcom/daaw/o97;->c:Lcom/daaw/zn7;

    iput p5, p0, Lcom/daaw/o97;->d:I

    iput-object p6, p0, Lcom/daaw/o97;->e:Lcom/daaw/m87;

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, Lcom/daaw/o97;->d:I

    return v0
.end method

.method public final b()Lcom/daaw/m87;
    .locals 1

    iget-object v0, p0, Lcom/daaw/o97;->e:Lcom/daaw/m87;

    return-object v0
.end method

.method public final c()Lcom/daaw/l97;
    .locals 1

    iget-object v0, p0, Lcom/daaw/o97;->e:Lcom/daaw/m87;

    invoke-virtual {v0}, Lcom/daaw/m87;->a()Lcom/daaw/l97;

    move-result-object v0

    return-object v0
.end method

.method public final d()Lcom/daaw/zn7;
    .locals 1

    iget-object v0, p0, Lcom/daaw/o97;->c:Lcom/daaw/zn7;

    return-object v0
.end method

.method public final e()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/daaw/o97;->a:Ljava/lang/Object;

    return-object v0
.end method

.method public final f()[B
    .locals 2
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/daaw/o97;->b:[B

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    array-length v1, v0

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v0

    return-object v0
.end method

.method public final g()I
    .locals 1

    iget v0, p0, Lcom/daaw/o97;->f:I

    return v0
.end method
