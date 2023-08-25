.class public final Lcom/daaw/b00$f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/d81;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/b00;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "f"
.end annotation


# instance fields
.field public final p:I

.field public final synthetic q:Lcom/daaw/b00;


# direct methods
.method public constructor <init>(Lcom/daaw/b00;I)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/b00$f;->q:Lcom/daaw/b00;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lcom/daaw/b00$f;->p:I

    return-void
.end method

.method public static synthetic b(Lcom/daaw/b00$f;)I
    .locals 0

    iget p0, p0, Lcom/daaw/b00$f;->p:I

    return p0
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/b00$f;->q:Lcom/daaw/b00;

    invoke-virtual {v0}, Lcom/daaw/b00;->L()V

    return-void
.end method

.method public d()Z
    .locals 2

    iget-object v0, p0, Lcom/daaw/b00$f;->q:Lcom/daaw/b00;

    iget v1, p0, Lcom/daaw/b00$f;->p:I

    invoke-virtual {v0, v1}, Lcom/daaw/b00;->H(I)Z

    move-result v0

    return v0
.end method

.method public j(Lcom/daaw/k30;Lcom/daaw/gq;Z)I
    .locals 2

    iget-object v0, p0, Lcom/daaw/b00$f;->q:Lcom/daaw/b00;

    iget v1, p0, Lcom/daaw/b00$f;->p:I

    invoke-virtual {v0, v1, p1, p2, p3}, Lcom/daaw/b00;->P(ILcom/daaw/k30;Lcom/daaw/gq;Z)I

    move-result p1

    return p1
.end method

.method public n(J)I
    .locals 2

    iget-object v0, p0, Lcom/daaw/b00$f;->q:Lcom/daaw/b00;

    iget v1, p0, Lcom/daaw/b00$f;->p:I

    invoke-virtual {v0, v1, p1, p2}, Lcom/daaw/b00;->S(IJ)I

    move-result p1

    return p1
.end method
