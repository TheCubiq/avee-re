.class public abstract Lcom/daaw/dz6;
.super Lcom/daaw/vx6;
.source ""


# instance fields
.field public final r:Ljava/lang/CharSequence;

.field public final s:Lcom/daaw/by6;

.field public t:I

.field public u:I


# direct methods
.method public constructor <init>(Lcom/daaw/fz6;Ljava/lang/CharSequence;)V
    .locals 1

    invoke-direct {p0}, Lcom/daaw/vx6;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/dz6;->t:I

    invoke-static {p1}, Lcom/daaw/fz6;->a(Lcom/daaw/fz6;)Lcom/daaw/by6;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/dz6;->s:Lcom/daaw/by6;

    const p1, 0x7fffffff

    iput p1, p0, Lcom/daaw/dz6;->u:I

    iput-object p2, p0, Lcom/daaw/dz6;->r:Ljava/lang/CharSequence;

    return-void
.end method


# virtual methods
.method public final bridge synthetic a()Ljava/lang/Object;
    .locals 5
    .annotation runtime Ljavax/annotation/CheckForNull;
    .end annotation

    iget v0, p0, Lcom/daaw/dz6;->t:I

    :cond_0
    :goto_0
    iget v1, p0, Lcom/daaw/dz6;->t:I

    const/4 v2, -0x1

    if-eq v1, v2, :cond_7

    invoke-virtual {p0, v1}, Lcom/daaw/dz6;->d(I)I

    move-result v1

    if-ne v1, v2, :cond_1

    iget-object v1, p0, Lcom/daaw/dz6;->r:Ljava/lang/CharSequence;

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    iput v2, p0, Lcom/daaw/dz6;->t:I

    const/4 v3, -0x1

    goto :goto_1

    :cond_1
    invoke-virtual {p0, v1}, Lcom/daaw/dz6;->c(I)I

    move-result v3

    iput v3, p0, Lcom/daaw/dz6;->t:I

    :goto_1
    if-ne v3, v0, :cond_2

    add-int/lit8 v3, v3, 0x1

    iput v3, p0, Lcom/daaw/dz6;->t:I

    iget-object v1, p0, Lcom/daaw/dz6;->r:Ljava/lang/CharSequence;

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-le v3, v1, :cond_0

    iput v2, p0, Lcom/daaw/dz6;->t:I

    goto :goto_0

    :cond_2
    if-ge v0, v1, :cond_3

    iget-object v3, p0, Lcom/daaw/dz6;->r:Ljava/lang/CharSequence;

    invoke-interface {v3, v0}, Ljava/lang/CharSequence;->charAt(I)C

    :cond_3
    if-ge v0, v1, :cond_4

    iget-object v3, p0, Lcom/daaw/dz6;->r:Ljava/lang/CharSequence;

    add-int/lit8 v4, v1, -0x1

    invoke-interface {v3, v4}, Ljava/lang/CharSequence;->charAt(I)C

    :cond_4
    iget v3, p0, Lcom/daaw/dz6;->u:I

    const/4 v4, 0x1

    if-ne v3, v4, :cond_5

    iget-object v1, p0, Lcom/daaw/dz6;->r:Ljava/lang/CharSequence;

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    iput v2, p0, Lcom/daaw/dz6;->t:I

    if-le v1, v0, :cond_6

    iget-object v2, p0, Lcom/daaw/dz6;->r:Ljava/lang/CharSequence;

    add-int/lit8 v3, v1, -0x1

    invoke-interface {v2, v3}, Ljava/lang/CharSequence;->charAt(I)C

    goto :goto_2

    :cond_5
    add-int/2addr v3, v2

    iput v3, p0, Lcom/daaw/dz6;->u:I

    :cond_6
    :goto_2
    iget-object v2, p0, Lcom/daaw/dz6;->r:Ljava/lang/CharSequence;

    invoke-interface {v2, v0, v1}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_3

    :cond_7
    invoke-virtual {p0}, Lcom/daaw/vx6;->b()Ljava/lang/Object;

    const/4 v0, 0x0

    :goto_3
    return-object v0
.end method

.method public abstract c(I)I
.end method

.method public abstract d(I)I
.end method
