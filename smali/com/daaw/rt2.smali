.class public final Lcom/daaw/rt2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/pt2;


# instance fields
.field public final a:I

.field public final b:I

.field public final c:Lcom/daaw/iz2;


# direct methods
.method public constructor <init>(Lcom/daaw/mt2;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object p1, p1, Lcom/daaw/mt2;->P0:Lcom/daaw/iz2;

    iput-object p1, p0, Lcom/daaw/rt2;->c:Lcom/daaw/iz2;

    const/16 v0, 0xc

    invoke-virtual {p1, v0}, Lcom/daaw/iz2;->v(I)V

    invoke-virtual {p1}, Lcom/daaw/iz2;->i()I

    move-result v0

    iput v0, p0, Lcom/daaw/rt2;->a:I

    invoke-virtual {p1}, Lcom/daaw/iz2;->i()I

    move-result p1

    iput p1, p0, Lcom/daaw/rt2;->b:I

    return-void
.end method


# virtual methods
.method public final zza()I
    .locals 1

    iget v0, p0, Lcom/daaw/rt2;->b:I

    return v0
.end method

.method public final zzb()I
    .locals 1

    iget v0, p0, Lcom/daaw/rt2;->a:I

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/rt2;->c:Lcom/daaw/iz2;

    invoke-virtual {v0}, Lcom/daaw/iz2;->i()I

    move-result v0

    :cond_0
    return v0
.end method

.method public final zzc()Z
    .locals 1

    iget v0, p0, Lcom/daaw/rt2;->a:I

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
