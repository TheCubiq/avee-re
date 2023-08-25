.class public abstract Lcom/daaw/ld1;
.super Lcom/daaw/ya;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Z:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/daaw/ya<",
        "TZ;>;"
    }
.end annotation


# instance fields
.field public final q:I

.field public final r:I


# direct methods
.method public constructor <init>()V
    .locals 1

    const/high16 v0, -0x80000000

    invoke-direct {p0, v0, v0}, Lcom/daaw/ld1;-><init>(II)V

    return-void
.end method

.method public constructor <init>(II)V
    .locals 0

    invoke-direct {p0}, Lcom/daaw/ya;-><init>()V

    iput p1, p0, Lcom/daaw/ld1;->q:I

    iput p2, p0, Lcom/daaw/ld1;->r:I

    return-void
.end method


# virtual methods
.method public final e(Lcom/daaw/sd1;)V
    .locals 2

    iget v0, p0, Lcom/daaw/ld1;->q:I

    iget v1, p0, Lcom/daaw/ld1;->r:I

    invoke-static {v0, v1}, Lcom/daaw/tq1;->l(II)Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/daaw/ld1;->q:I

    iget v1, p0, Lcom/daaw/ld1;->r:I

    invoke-interface {p1, v0, v1}, Lcom/daaw/sd1;->f(II)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/daaw/ld1;->q:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " and height: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/daaw/ld1;->r:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", either provide dimensions in the constructor"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " or call override()"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
