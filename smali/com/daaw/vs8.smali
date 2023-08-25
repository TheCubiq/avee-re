.class public final Lcom/daaw/vs8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/mt8;


# instance fields
.field public final a:I

.field public final synthetic b:Lcom/daaw/ys8;


# direct methods
.method public constructor <init>(Lcom/daaw/ys8;I)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/vs8;->b:Lcom/daaw/ys8;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lcom/daaw/vs8;->a:I

    return-void
.end method

.method public static bridge synthetic c(Lcom/daaw/vs8;)I
    .locals 0

    iget p0, p0, Lcom/daaw/vs8;->a:I

    return p0
.end method


# virtual methods
.method public final a(J)I
    .locals 2

    iget-object v0, p0, Lcom/daaw/vs8;->b:Lcom/daaw/ys8;

    iget v1, p0, Lcom/daaw/vs8;->a:I

    invoke-virtual {v0, v1, p1, p2}, Lcom/daaw/ys8;->I(IJ)I

    move-result p1

    return p1
.end method

.method public final b(Lcom/daaw/a78;Lcom/daaw/ma7;I)I
    .locals 2

    iget-object v0, p0, Lcom/daaw/vs8;->b:Lcom/daaw/ys8;

    iget v1, p0, Lcom/daaw/vs8;->a:I

    invoke-virtual {v0, v1, p1, p2, p3}, Lcom/daaw/ys8;->H(ILcom/daaw/a78;Lcom/daaw/ma7;I)I

    move-result p1

    return p1
.end method

.method public final zzd()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/vs8;->b:Lcom/daaw/ys8;

    iget v1, p0, Lcom/daaw/vs8;->a:I

    invoke-virtual {v0, v1}, Lcom/daaw/ys8;->u(I)V

    return-void
.end method

.method public final zze()Z
    .locals 2

    iget-object v0, p0, Lcom/daaw/vs8;->b:Lcom/daaw/ys8;

    iget v1, p0, Lcom/daaw/vs8;->a:I

    invoke-virtual {v0, v1}, Lcom/daaw/ys8;->w(I)Z

    move-result v0

    return v0
.end method
