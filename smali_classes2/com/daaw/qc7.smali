.class public final Lcom/daaw/qc7;
.super Lcom/daaw/ja8;
.source ""

# interfaces
.implements Lcom/daaw/be8;


# static fields
.field private static final zza:Lcom/daaw/qc7;


# instance fields
.field private zzd:I

.field private zze:I

.field private zzf:Lcom/daaw/ab8;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/daaw/qc7;

    invoke-direct {v0}, Lcom/daaw/qc7;-><init>()V

    sput-object v0, Lcom/daaw/qc7;->zza:Lcom/daaw/qc7;

    const-class v1, Lcom/daaw/qc7;

    invoke-static {v1, v0}, Lcom/daaw/ja8;->v(Ljava/lang/Class;Lcom/daaw/ja8;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/daaw/ja8;-><init>()V

    invoke-static {}, Lcom/daaw/ja8;->m()Lcom/daaw/ab8;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/qc7;->zzf:Lcom/daaw/ab8;

    return-void
.end method

.method public static G()Lcom/daaw/nb7;
    .locals 1

    sget-object v0, Lcom/daaw/qc7;->zza:Lcom/daaw/qc7;

    invoke-virtual {v0}, Lcom/daaw/ja8;->z()Lcom/daaw/y98;

    move-result-object v0

    check-cast v0, Lcom/daaw/nb7;

    return-object v0
.end method

.method public static synthetic H()Lcom/daaw/qc7;
    .locals 1

    sget-object v0, Lcom/daaw/qc7;->zza:Lcom/daaw/qc7;

    return-object v0
.end method

.method public static synthetic J(Lcom/daaw/qc7;I)V
    .locals 1

    iget v0, p0, Lcom/daaw/qc7;->zzd:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/daaw/qc7;->zzd:I

    iput p1, p0, Lcom/daaw/qc7;->zze:I

    return-void
.end method

.method public static synthetic K(Lcom/daaw/qc7;Ljava/lang/Iterable;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/qc7;->zzf:Lcom/daaw/ab8;

    invoke-interface {v0}, Lcom/daaw/db8;->zzc()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Lcom/daaw/ja8;->n(Lcom/daaw/ab8;)Lcom/daaw/ab8;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/qc7;->zzf:Lcom/daaw/ab8;

    :cond_0
    iget-object p0, p0, Lcom/daaw/qc7;->zzf:Lcom/daaw/ab8;

    invoke-static {p1, p0}, Lcom/daaw/w48;->f(Ljava/lang/Iterable;Ljava/util/List;)V

    return-void
.end method


# virtual methods
.method public final C(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    add-int/lit8 p1, p1, -0x1

    const/4 p2, 0x1

    if-eqz p1, :cond_4

    const/4 p3, 0x3

    const/4 v0, 0x2

    if-eq p1, v0, :cond_3

    if-eq p1, p3, :cond_2

    const/4 p2, 0x4

    const/4 p3, 0x0

    if-eq p1, p2, :cond_1

    const/4 p2, 0x5

    if-eq p1, p2, :cond_0

    return-object p3

    :cond_0
    sget-object p1, Lcom/daaw/qc7;->zza:Lcom/daaw/qc7;

    return-object p1

    :cond_1
    new-instance p1, Lcom/daaw/nb7;

    invoke-direct {p1, p3}, Lcom/daaw/nb7;-><init>(Lcom/daaw/lj6;)V

    return-object p1

    :cond_2
    new-instance p1, Lcom/daaw/qc7;

    invoke-direct {p1}, Lcom/daaw/qc7;-><init>()V

    return-object p1

    :cond_3
    new-array p1, p3, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v1, "zzd"

    aput-object v1, p1, p3

    const-string p3, "zze"

    aput-object p3, p1, p2

    const-string p2, "zzf"

    aput-object p2, p1, v0

    sget-object p2, Lcom/daaw/qc7;->zza:Lcom/daaw/qc7;

    const-string p3, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u1004\u0000\u0002\u0014"

    invoke-static {p2, p3, p1}, Lcom/daaw/ja8;->s(Lcom/daaw/zd8;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method

.method public final D()I
    .locals 1

    iget-object v0, p0, Lcom/daaw/qc7;->zzf:Lcom/daaw/ab8;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final E()I
    .locals 1

    iget v0, p0, Lcom/daaw/qc7;->zze:I

    return v0
.end method

.method public final F(I)J
    .locals 2

    iget-object v0, p0, Lcom/daaw/qc7;->zzf:Lcom/daaw/ab8;

    invoke-interface {v0, p1}, Lcom/daaw/ab8;->a(I)J

    move-result-wide v0

    return-wide v0
.end method

.method public final I()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/daaw/qc7;->zzf:Lcom/daaw/ab8;

    return-object v0
.end method

.method public final L()Z
    .locals 2

    iget v0, p0, Lcom/daaw/qc7;->zzd:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
