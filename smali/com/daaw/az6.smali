.class public final Lcom/daaw/az6;
.super Lcom/daaw/dz6;
.source ""


# instance fields
.field public final synthetic v:Lcom/daaw/bz6;


# direct methods
.method public constructor <init>(Lcom/daaw/bz6;Lcom/daaw/fz6;Ljava/lang/CharSequence;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/az6;->v:Lcom/daaw/bz6;

    invoke-direct {p0, p2, p3}, Lcom/daaw/dz6;-><init>(Lcom/daaw/fz6;Ljava/lang/CharSequence;)V

    return-void
.end method


# virtual methods
.method public final c(I)I
    .locals 0

    return p1
.end method

.method public final d(I)I
    .locals 1

    add-int/lit16 p1, p1, 0xfa0

    iget-object v0, p0, Lcom/daaw/dz6;->r:Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-ge p1, v0, :cond_0

    return p1

    :cond_0
    const/4 p1, -0x1

    return p1
.end method
