.class public Lcom/daaw/q01;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/vd0;


# instance fields
.field public a:I

.field public b:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lcom/daaw/q01;->a:I

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/q01;->b:I

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lcom/daaw/q01;->a:I

    iput p1, p0, Lcom/daaw/q01;->b:I

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Lcom/daaw/q01;->a:I

    return v0
.end method

.method public b(I)V
    .locals 0

    iput p1, p0, Lcom/daaw/q01;->b:I

    return-void
.end method

.method public c()I
    .locals 1

    iget v0, p0, Lcom/daaw/q01;->b:I

    return v0
.end method

.method public d(I)V
    .locals 0

    iput p1, p0, Lcom/daaw/q01;->a:I

    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 0

    invoke-super {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method
