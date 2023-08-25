.class public final Lcom/daaw/dc3;
.super Lcom/daaw/uc3;
.source ""


# instance fields
.field public final p:Landroid/graphics/drawable/Drawable;

.field public final q:Landroid/net/Uri;

.field public final r:D

.field public final s:I

.field public final t:I


# direct methods
.method public constructor <init>(Landroid/graphics/drawable/Drawable;Landroid/net/Uri;DII)V
    .locals 0

    invoke-direct {p0}, Lcom/daaw/uc3;-><init>()V

    iput-object p1, p0, Lcom/daaw/dc3;->p:Landroid/graphics/drawable/Drawable;

    iput-object p2, p0, Lcom/daaw/dc3;->q:Landroid/net/Uri;

    iput-wide p3, p0, Lcom/daaw/dc3;->r:D

    iput p5, p0, Lcom/daaw/dc3;->s:I

    iput p6, p0, Lcom/daaw/dc3;->t:I

    return-void
.end method


# virtual methods
.method public final zzb()D
    .locals 2

    iget-wide v0, p0, Lcom/daaw/dc3;->r:D

    return-wide v0
.end method

.method public final zzc()I
    .locals 1

    iget v0, p0, Lcom/daaw/dc3;->t:I

    return v0
.end method

.method public final zzd()I
    .locals 1

    iget v0, p0, Lcom/daaw/dc3;->s:I

    return v0
.end method

.method public final zze()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Lcom/daaw/dc3;->q:Landroid/net/Uri;

    return-object v0
.end method

.method public final zzf()Lcom/daaw/yd0;
    .locals 1

    iget-object v0, p0, Lcom/daaw/dc3;->p:Landroid/graphics/drawable/Drawable;

    invoke-static {v0}, Lcom/daaw/nt0;->g3(Ljava/lang/Object;)Lcom/daaw/yd0;

    move-result-object v0

    return-object v0
.end method
