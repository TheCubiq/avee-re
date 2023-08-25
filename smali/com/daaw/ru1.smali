.class public Lcom/daaw/ru1;
.super Lcom/daaw/bb0;
.source ""


# instance fields
.field public A0:I

.field public B0:I

.field public C0:I

.field public D0:I

.field public E0:I

.field public F0:I

.field public G0:Z

.field public H0:I

.field public I0:I

.field public J0:Lcom/daaw/gb$a;

.field public K0:Lcom/daaw/gb$b;

.field public y0:I

.field public z0:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/daaw/bb0;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/ru1;->y0:I

    iput v0, p0, Lcom/daaw/ru1;->z0:I

    iput v0, p0, Lcom/daaw/ru1;->A0:I

    iput v0, p0, Lcom/daaw/ru1;->B0:I

    iput v0, p0, Lcom/daaw/ru1;->C0:I

    iput v0, p0, Lcom/daaw/ru1;->D0:I

    iput v0, p0, Lcom/daaw/ru1;->E0:I

    iput v0, p0, Lcom/daaw/ru1;->F0:I

    iput-boolean v0, p0, Lcom/daaw/ru1;->G0:Z

    iput v0, p0, Lcom/daaw/ru1;->H0:I

    iput v0, p0, Lcom/daaw/ru1;->I0:I

    new-instance v0, Lcom/daaw/gb$a;

    invoke-direct {v0}, Lcom/daaw/gb$a;-><init>()V

    iput-object v0, p0, Lcom/daaw/ru1;->J0:Lcom/daaw/gb$a;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/ru1;->K0:Lcom/daaw/gb$b;

    return-void
.end method


# virtual methods
.method public H0()V
    .locals 3

    const/4 v0, 0x0

    :goto_0
    iget v1, p0, Lcom/daaw/bb0;->x0:I

    if-ge v0, v1, :cond_1

    iget-object v1, p0, Lcom/daaw/bb0;->w0:[Lcom/daaw/qj;

    aget-object v1, v1, v0

    if-eqz v1, :cond_0

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lcom/daaw/qj;->n0(Z)V

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public I0()Z
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/ru1;->G0:Z

    return v0
.end method

.method public b(Lcom/daaw/rj;)V
    .locals 0

    invoke-virtual {p0}, Lcom/daaw/ru1;->H0()V

    return-void
.end method
