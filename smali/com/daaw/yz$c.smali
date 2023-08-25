.class public Lcom/daaw/yz$c;
.super Lcom/daaw/z;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/yz;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "c"
.end annotation


# instance fields
.field public final synthetic b:Lcom/daaw/yz;


# direct methods
.method public constructor <init>(Lcom/daaw/yz;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/yz$c;->b:Lcom/daaw/yz;

    invoke-direct {p0}, Lcom/daaw/z;-><init>()V

    return-void
.end method


# virtual methods
.method public b(I)Lcom/daaw/y;
    .locals 1

    iget-object v0, p0, Lcom/daaw/yz$c;->b:Lcom/daaw/yz;

    invoke-virtual {v0, p1}, Lcom/daaw/yz;->H(I)Lcom/daaw/y;

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/y;->Q(Lcom/daaw/y;)Lcom/daaw/y;

    move-result-object p1

    return-object p1
.end method

.method public d(I)Lcom/daaw/y;
    .locals 1

    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Lcom/daaw/yz$c;->b:Lcom/daaw/yz;

    iget p1, p1, Lcom/daaw/yz;->k:I

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/daaw/yz$c;->b:Lcom/daaw/yz;

    iget p1, p1, Lcom/daaw/yz;->l:I

    :goto_0
    const/high16 v0, -0x80000000

    if-ne p1, v0, :cond_1

    const/4 p1, 0x0

    return-object p1

    :cond_1
    invoke-virtual {p0, p1}, Lcom/daaw/yz$c;->b(I)Lcom/daaw/y;

    move-result-object p1

    return-object p1
.end method

.method public f(IILandroid/os/Bundle;)Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/yz$c;->b:Lcom/daaw/yz;

    invoke-virtual {v0, p1, p2, p3}, Lcom/daaw/yz;->P(IILandroid/os/Bundle;)Z

    move-result p1

    return p1
.end method
