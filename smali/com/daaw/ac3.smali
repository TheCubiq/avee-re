.class public final Lcom/daaw/ac3;
.super Lcom/daaw/mc3;
.source ""


# static fields
.field public static final x:I

.field public static final y:I

.field public static final z:I


# instance fields
.field public final p:Ljava/lang/String;

.field public final q:Ljava/util/List;

.field public final r:Ljava/util/List;

.field public final s:I

.field public final t:I

.field public final u:I

.field public final v:I

.field public final w:I


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    const/16 v0, 0xc

    const/16 v1, 0xae

    const/16 v2, 0xce

    invoke-static {v0, v1, v2}, Landroid/graphics/Color;->rgb(III)I

    move-result v0

    sput v0, Lcom/daaw/ac3;->x:I

    const/16 v1, 0xcc

    invoke-static {v1, v1, v1}, Landroid/graphics/Color;->rgb(III)I

    move-result v1

    sput v1, Lcom/daaw/ac3;->y:I

    sput v0, Lcom/daaw/ac3;->z:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;IIZ)V
    .locals 1

    invoke-direct {p0}, Lcom/daaw/mc3;-><init>()V

    new-instance p8, Ljava/util/ArrayList;

    invoke-direct {p8}, Ljava/util/ArrayList;-><init>()V

    iput-object p8, p0, Lcom/daaw/ac3;->q:Ljava/util/List;

    new-instance p8, Ljava/util/ArrayList;

    invoke-direct {p8}, Ljava/util/ArrayList;-><init>()V

    iput-object p8, p0, Lcom/daaw/ac3;->r:Ljava/util/List;

    iput-object p1, p0, Lcom/daaw/ac3;->p:Ljava/lang/String;

    const/4 p1, 0x0

    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p8

    if-ge p1, p8, :cond_0

    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p8

    check-cast p8, Lcom/daaw/dc3;

    iget-object v0, p0, Lcom/daaw/ac3;->q:Ljava/util/List;

    invoke-interface {v0, p8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/daaw/ac3;->r:Ljava/util/List;

    invoke-interface {v0, p8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    if-eqz p3, :cond_1

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p1

    goto :goto_1

    :cond_1
    sget p1, Lcom/daaw/ac3;->y:I

    :goto_1
    iput p1, p0, Lcom/daaw/ac3;->s:I

    if-eqz p4, :cond_2

    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result p1

    goto :goto_2

    :cond_2
    sget p1, Lcom/daaw/ac3;->z:I

    :goto_2
    iput p1, p0, Lcom/daaw/ac3;->t:I

    if-eqz p5, :cond_3

    invoke-virtual {p5}, Ljava/lang/Integer;->intValue()I

    move-result p1

    goto :goto_3

    :cond_3
    const/16 p1, 0xc

    :goto_3
    iput p1, p0, Lcom/daaw/ac3;->u:I

    iput p6, p0, Lcom/daaw/ac3;->v:I

    iput p7, p0, Lcom/daaw/ac3;->w:I

    return-void
.end method


# virtual methods
.method public final h3()I
    .locals 1

    iget v0, p0, Lcom/daaw/ac3;->u:I

    return v0
.end method

.method public final i3()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/daaw/ac3;->q:Ljava/util/List;

    return-object v0
.end method

.method public final zzb()I
    .locals 1

    iget v0, p0, Lcom/daaw/ac3;->v:I

    return v0
.end method

.method public final zzc()I
    .locals 1

    iget v0, p0, Lcom/daaw/ac3;->w:I

    return v0
.end method

.method public final zzd()I
    .locals 1

    iget v0, p0, Lcom/daaw/ac3;->s:I

    return v0
.end method

.method public final zze()I
    .locals 1

    iget v0, p0, Lcom/daaw/ac3;->t:I

    return v0
.end method

.method public final zzg()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/ac3;->p:Ljava/lang/String;

    return-object v0
.end method

.method public final zzh()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/daaw/ac3;->r:Ljava/util/List;

    return-object v0
.end method
