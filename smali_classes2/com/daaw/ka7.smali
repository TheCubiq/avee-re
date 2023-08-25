.class public final Lcom/daaw/ka7;
.super Lcom/daaw/ja8;
.source ""

# interfaces
.implements Lcom/daaw/be8;


# static fields
.field private static final zza:Lcom/daaw/ka7;


# instance fields
.field private zzd:Lcom/daaw/ab8;

.field private zze:Lcom/daaw/ab8;

.field private zzf:Lcom/daaw/db8;

.field private zzg:Lcom/daaw/db8;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/daaw/ka7;

    invoke-direct {v0}, Lcom/daaw/ka7;-><init>()V

    sput-object v0, Lcom/daaw/ka7;->zza:Lcom/daaw/ka7;

    const-class v1, Lcom/daaw/ka7;

    invoke-static {v1, v0}, Lcom/daaw/ja8;->v(Ljava/lang/Class;Lcom/daaw/ja8;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/daaw/ja8;-><init>()V

    invoke-static {}, Lcom/daaw/ja8;->m()Lcom/daaw/ab8;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/ka7;->zzd:Lcom/daaw/ab8;

    invoke-static {}, Lcom/daaw/ja8;->m()Lcom/daaw/ab8;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/ka7;->zze:Lcom/daaw/ab8;

    invoke-static {}, Lcom/daaw/ja8;->o()Lcom/daaw/db8;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/ka7;->zzf:Lcom/daaw/db8;

    invoke-static {}, Lcom/daaw/ja8;->o()Lcom/daaw/db8;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/ka7;->zzg:Lcom/daaw/db8;

    return-void
.end method

.method public static I()Lcom/daaw/h97;
    .locals 1

    sget-object v0, Lcom/daaw/ka7;->zza:Lcom/daaw/ka7;

    invoke-virtual {v0}, Lcom/daaw/ja8;->z()Lcom/daaw/y98;

    move-result-object v0

    check-cast v0, Lcom/daaw/h97;

    return-object v0
.end method

.method public static synthetic J()Lcom/daaw/ka7;
    .locals 1

    sget-object v0, Lcom/daaw/ka7;->zza:Lcom/daaw/ka7;

    return-object v0
.end method

.method public static K()Lcom/daaw/ka7;
    .locals 1

    sget-object v0, Lcom/daaw/ka7;->zza:Lcom/daaw/ka7;

    return-object v0
.end method

.method public static synthetic Q(Lcom/daaw/ka7;Ljava/lang/Iterable;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/ka7;->zzd:Lcom/daaw/ab8;

    invoke-interface {v0}, Lcom/daaw/db8;->zzc()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Lcom/daaw/ja8;->n(Lcom/daaw/ab8;)Lcom/daaw/ab8;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/ka7;->zzd:Lcom/daaw/ab8;

    :cond_0
    iget-object p0, p0, Lcom/daaw/ka7;->zzd:Lcom/daaw/ab8;

    invoke-static {p1, p0}, Lcom/daaw/w48;->f(Ljava/lang/Iterable;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic R(Lcom/daaw/ka7;)V
    .locals 1

    invoke-static {}, Lcom/daaw/ja8;->m()Lcom/daaw/ab8;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/ka7;->zzd:Lcom/daaw/ab8;

    return-void
.end method

.method public static synthetic S(Lcom/daaw/ka7;Ljava/lang/Iterable;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/ka7;->zze:Lcom/daaw/ab8;

    invoke-interface {v0}, Lcom/daaw/db8;->zzc()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Lcom/daaw/ja8;->n(Lcom/daaw/ab8;)Lcom/daaw/ab8;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/ka7;->zze:Lcom/daaw/ab8;

    :cond_0
    iget-object p0, p0, Lcom/daaw/ka7;->zze:Lcom/daaw/ab8;

    invoke-static {p1, p0}, Lcom/daaw/w48;->f(Ljava/lang/Iterable;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic T(Lcom/daaw/ka7;)V
    .locals 1

    invoke-static {}, Lcom/daaw/ja8;->m()Lcom/daaw/ab8;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/ka7;->zze:Lcom/daaw/ab8;

    return-void
.end method

.method public static synthetic U(Lcom/daaw/ka7;Ljava/lang/Iterable;)V
    .locals 0

    invoke-virtual {p0}, Lcom/daaw/ka7;->a0()V

    iget-object p0, p0, Lcom/daaw/ka7;->zzf:Lcom/daaw/db8;

    invoke-static {p1, p0}, Lcom/daaw/w48;->f(Ljava/lang/Iterable;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic V(Lcom/daaw/ka7;)V
    .locals 1

    invoke-static {}, Lcom/daaw/ja8;->o()Lcom/daaw/db8;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/ka7;->zzf:Lcom/daaw/db8;

    return-void
.end method

.method public static synthetic W(Lcom/daaw/ka7;I)V
    .locals 0

    invoke-virtual {p0}, Lcom/daaw/ka7;->a0()V

    iget-object p0, p0, Lcom/daaw/ka7;->zzf:Lcom/daaw/db8;

    invoke-interface {p0, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic X(Lcom/daaw/ka7;Ljava/lang/Iterable;)V
    .locals 0

    invoke-virtual {p0}, Lcom/daaw/ka7;->b0()V

    iget-object p0, p0, Lcom/daaw/ka7;->zzg:Lcom/daaw/db8;

    invoke-static {p1, p0}, Lcom/daaw/w48;->f(Ljava/lang/Iterable;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic Y(Lcom/daaw/ka7;)V
    .locals 1

    invoke-static {}, Lcom/daaw/ja8;->o()Lcom/daaw/db8;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/ka7;->zzg:Lcom/daaw/db8;

    return-void
.end method

.method public static synthetic Z(Lcom/daaw/ka7;I)V
    .locals 0

    invoke-virtual {p0}, Lcom/daaw/ka7;->b0()V

    iget-object p0, p0, Lcom/daaw/ka7;->zzg:Lcom/daaw/db8;

    invoke-interface {p0, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final C(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    add-int/lit8 p1, p1, -0x1

    const/4 p2, 0x1

    if-eqz p1, :cond_4

    const/4 p3, 0x5

    const/4 v0, 0x4

    const/4 v1, 0x3

    const/4 v2, 0x2

    if-eq p1, v2, :cond_3

    if-eq p1, v1, :cond_2

    const/4 p2, 0x0

    if-eq p1, v0, :cond_1

    if-eq p1, p3, :cond_0

    return-object p2

    :cond_0
    sget-object p1, Lcom/daaw/ka7;->zza:Lcom/daaw/ka7;

    return-object p1

    :cond_1
    new-instance p1, Lcom/daaw/h97;

    invoke-direct {p1, p2}, Lcom/daaw/h97;-><init>(Lcom/daaw/lj6;)V

    return-object p1

    :cond_2
    new-instance p1, Lcom/daaw/ka7;

    invoke-direct {p1}, Lcom/daaw/ka7;-><init>()V

    return-object p1

    :cond_3
    const/4 p1, 0x6

    new-array p1, p1, [Ljava/lang/Object;

    const/4 v3, 0x0

    const-string v4, "zzd"

    aput-object v4, p1, v3

    const-string v3, "zze"

    aput-object v3, p1, p2

    const-string p2, "zzf"

    aput-object p2, p1, v2

    const-class p2, Lcom/daaw/er6;

    aput-object p2, p1, v1

    const-string p2, "zzg"

    aput-object p2, p1, v0

    const-class p2, Lcom/daaw/qc7;

    aput-object p2, p1, p3

    sget-object p2, Lcom/daaw/ka7;->zza:Lcom/daaw/ka7;

    const-string p3, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b"

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

    iget-object v0, p0, Lcom/daaw/ka7;->zzf:Lcom/daaw/db8;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final E()I
    .locals 1

    iget-object v0, p0, Lcom/daaw/ka7;->zze:Lcom/daaw/ab8;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final F()I
    .locals 1

    iget-object v0, p0, Lcom/daaw/ka7;->zzg:Lcom/daaw/db8;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final G()I
    .locals 1

    iget-object v0, p0, Lcom/daaw/ka7;->zzd:Lcom/daaw/ab8;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final H(I)Lcom/daaw/er6;
    .locals 1

    iget-object v0, p0, Lcom/daaw/ka7;->zzf:Lcom/daaw/db8;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/er6;

    return-object p1
.end method

.method public final L(I)Lcom/daaw/qc7;
    .locals 1

    iget-object v0, p0, Lcom/daaw/ka7;->zzg:Lcom/daaw/db8;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/qc7;

    return-object p1
.end method

.method public final M()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/daaw/ka7;->zzf:Lcom/daaw/db8;

    return-object v0
.end method

.method public final N()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/daaw/ka7;->zze:Lcom/daaw/ab8;

    return-object v0
.end method

.method public final O()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/daaw/ka7;->zzg:Lcom/daaw/db8;

    return-object v0
.end method

.method public final P()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/daaw/ka7;->zzd:Lcom/daaw/ab8;

    return-object v0
.end method

.method public final a0()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/ka7;->zzf:Lcom/daaw/db8;

    invoke-interface {v0}, Lcom/daaw/db8;->zzc()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Lcom/daaw/ja8;->p(Lcom/daaw/db8;)Lcom/daaw/db8;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/ka7;->zzf:Lcom/daaw/db8;

    :cond_0
    return-void
.end method

.method public final b0()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/ka7;->zzg:Lcom/daaw/db8;

    invoke-interface {v0}, Lcom/daaw/db8;->zzc()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Lcom/daaw/ja8;->p(Lcom/daaw/db8;)Lcom/daaw/db8;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/ka7;->zzg:Lcom/daaw/db8;

    :cond_0
    return-void
.end method
