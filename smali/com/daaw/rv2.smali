.class public final Lcom/daaw/rv2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/iw2;


# instance fields
.field public final a:I

.field public final synthetic b:Lcom/daaw/sv2;


# direct methods
.method public constructor <init>(Lcom/daaw/sv2;I)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/rv2;->b:Lcom/daaw/sv2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lcom/daaw/rv2;->a:I

    return-void
.end method

.method public static bridge synthetic c(Lcom/daaw/rv2;)I
    .locals 0

    iget p0, p0, Lcom/daaw/rv2;->a:I

    return p0
.end method


# virtual methods
.method public final a(J)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/rv2;->b:Lcom/daaw/sv2;

    iget v1, p0, Lcom/daaw/rv2;->a:I

    invoke-virtual {v0, v1, p1, p2}, Lcom/daaw/sv2;->B(IJ)V

    return-void
.end method

.method public final b(Lcom/daaw/cq2;Lcom/daaw/bs2;Z)I
    .locals 2

    iget-object v0, p0, Lcom/daaw/rv2;->b:Lcom/daaw/sv2;

    iget v1, p0, Lcom/daaw/rv2;->a:I

    invoke-virtual {v0, v1, p1, p2, p3}, Lcom/daaw/sv2;->r(ILcom/daaw/cq2;Lcom/daaw/bs2;Z)I

    move-result p1

    return p1
.end method

.method public final zzc()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/rv2;->b:Lcom/daaw/sv2;

    invoke-virtual {v0}, Lcom/daaw/sv2;->z()V

    return-void
.end method

.method public final zze()Z
    .locals 2

    iget-object v0, p0, Lcom/daaw/rv2;->b:Lcom/daaw/sv2;

    iget v1, p0, Lcom/daaw/rv2;->a:I

    invoke-virtual {v0, v1}, Lcom/daaw/sv2;->l(I)Z

    move-result v0

    return v0
.end method
