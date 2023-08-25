.class public final Lcom/daaw/xp5;
.super Lcom/daaw/ja8;
.source ""

# interfaces
.implements Lcom/daaw/be8;


# static fields
.field private static final zza:Lcom/daaw/xp5;


# instance fields
.field private zzd:I

.field private zze:I

.field private zzf:Ljava/lang/String;

.field private zzg:Lcom/daaw/db8;

.field private zzh:Z

.field private zzi:Lcom/daaw/tx5;

.field private zzj:Z

.field private zzk:Z

.field private zzl:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/daaw/xp5;

    invoke-direct {v0}, Lcom/daaw/xp5;-><init>()V

    sput-object v0, Lcom/daaw/xp5;->zza:Lcom/daaw/xp5;

    const-class v1, Lcom/daaw/xp5;

    invoke-static {v1, v0}, Lcom/daaw/ja8;->v(Ljava/lang/Class;Lcom/daaw/ja8;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/daaw/ja8;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lcom/daaw/xp5;->zzf:Ljava/lang/String;

    invoke-static {}, Lcom/daaw/ja8;->o()Lcom/daaw/db8;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/xp5;->zzg:Lcom/daaw/db8;

    return-void
.end method

.method public static F()Lcom/daaw/uo5;
    .locals 1

    sget-object v0, Lcom/daaw/xp5;->zza:Lcom/daaw/xp5;

    invoke-virtual {v0}, Lcom/daaw/ja8;->z()Lcom/daaw/y98;

    move-result-object v0

    check-cast v0, Lcom/daaw/uo5;

    return-object v0
.end method

.method public static synthetic G()Lcom/daaw/xp5;
    .locals 1

    sget-object v0, Lcom/daaw/xp5;->zza:Lcom/daaw/xp5;

    return-object v0
.end method

.method public static synthetic L(Lcom/daaw/xp5;Ljava/lang/String;)V
    .locals 1

    iget v0, p0, Lcom/daaw/xp5;->zzd:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/daaw/xp5;->zzd:I

    iput-object p1, p0, Lcom/daaw/xp5;->zzf:Ljava/lang/String;

    return-void
.end method

.method public static synthetic M(Lcom/daaw/xp5;ILcom/daaw/ds5;)V
    .locals 2

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lcom/daaw/xp5;->zzg:Lcom/daaw/db8;

    invoke-interface {v0}, Lcom/daaw/db8;->zzc()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Lcom/daaw/ja8;->p(Lcom/daaw/db8;)Lcom/daaw/db8;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/xp5;->zzg:Lcom/daaw/db8;

    :cond_0
    iget-object p0, p0, Lcom/daaw/xp5;->zzg:Lcom/daaw/db8;

    invoke-interface {p0, p1, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

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
    sget-object p1, Lcom/daaw/xp5;->zza:Lcom/daaw/xp5;

    return-object p1

    :cond_1
    new-instance p1, Lcom/daaw/uo5;

    invoke-direct {p1, p2}, Lcom/daaw/uo5;-><init>(Lcom/daaw/kl5;)V

    return-object p1

    :cond_2
    new-instance p1, Lcom/daaw/xp5;

    invoke-direct {p1}, Lcom/daaw/xp5;-><init>()V

    return-object p1

    :cond_3
    const/16 p1, 0xa

    new-array p1, p1, [Ljava/lang/Object;

    const/4 v3, 0x0

    const-string v4, "zzd"

    aput-object v4, p1, v3

    const-string v3, "zze"

    aput-object v3, p1, p2

    const-string p2, "zzf"

    aput-object p2, p1, v2

    const-string p2, "zzg"

    aput-object p2, p1, v1

    const-class p2, Lcom/daaw/ds5;

    aput-object p2, p1, v0

    const-string p2, "zzh"

    aput-object p2, p1, p3

    const/4 p2, 0x6

    const-string p3, "zzi"

    aput-object p3, p1, p2

    const/4 p2, 0x7

    const-string p3, "zzj"

    aput-object p3, p1, p2

    const/16 p2, 0x8

    const-string p3, "zzk"

    aput-object p3, p1, p2

    const/16 p2, 0x9

    const-string p3, "zzl"

    aput-object p3, p1, p2

    sget-object p2, Lcom/daaw/xp5;->zza:Lcom/daaw/xp5;

    const-string p3, "\u0001\u0008\u0000\u0001\u0001\u0008\u0008\u0000\u0001\u0000\u0001\u1004\u0000\u0002\u1008\u0001\u0003\u001b\u0004\u1007\u0002\u0005\u1009\u0003\u0006\u1007\u0004\u0007\u1007\u0005\u0008\u1007\u0006"

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

    iget-object v0, p0, Lcom/daaw/xp5;->zzg:Lcom/daaw/db8;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final E()I
    .locals 1

    iget v0, p0, Lcom/daaw/xp5;->zze:I

    return v0
.end method

.method public final H(I)Lcom/daaw/ds5;
    .locals 1

    iget-object v0, p0, Lcom/daaw/xp5;->zzg:Lcom/daaw/db8;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/ds5;

    return-object p1
.end method

.method public final I()Lcom/daaw/tx5;
    .locals 1

    iget-object v0, p0, Lcom/daaw/xp5;->zzi:Lcom/daaw/tx5;

    if-nez v0, :cond_0

    invoke-static {}, Lcom/daaw/tx5;->E()Lcom/daaw/tx5;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public final J()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/xp5;->zzf:Ljava/lang/String;

    return-object v0
.end method

.method public final K()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/daaw/xp5;->zzg:Lcom/daaw/db8;

    return-object v0
.end method

.method public final N()Z
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/xp5;->zzj:Z

    return v0
.end method

.method public final O()Z
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/xp5;->zzk:Z

    return v0
.end method

.method public final P()Z
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/xp5;->zzl:Z

    return v0
.end method

.method public final Q()Z
    .locals 1

    iget v0, p0, Lcom/daaw/xp5;->zzd:I

    and-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final R()Z
    .locals 2

    iget v0, p0, Lcom/daaw/xp5;->zzd:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final S()Z
    .locals 1

    iget v0, p0, Lcom/daaw/xp5;->zzd:I

    and-int/lit8 v0, v0, 0x40

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
