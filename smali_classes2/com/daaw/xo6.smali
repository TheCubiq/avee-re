.class public final Lcom/daaw/xo6;
.super Lcom/daaw/ja8;
.source ""

# interfaces
.implements Lcom/daaw/be8;


# static fields
.field private static final zza:Lcom/daaw/xo6;


# instance fields
.field private zzd:I

.field private zze:I

.field private zzf:Lcom/daaw/ka7;

.field private zzg:Lcom/daaw/ka7;

.field private zzh:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/daaw/xo6;

    invoke-direct {v0}, Lcom/daaw/xo6;-><init>()V

    sput-object v0, Lcom/daaw/xo6;->zza:Lcom/daaw/xo6;

    const-class v1, Lcom/daaw/xo6;

    invoke-static {v1, v0}, Lcom/daaw/ja8;->v(Ljava/lang/Class;Lcom/daaw/ja8;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/daaw/ja8;-><init>()V

    return-void
.end method

.method public static E()Lcom/daaw/wn6;
    .locals 1

    sget-object v0, Lcom/daaw/xo6;->zza:Lcom/daaw/xo6;

    invoke-virtual {v0}, Lcom/daaw/ja8;->z()Lcom/daaw/y98;

    move-result-object v0

    check-cast v0, Lcom/daaw/wn6;

    return-object v0
.end method

.method public static synthetic F()Lcom/daaw/xo6;
    .locals 1

    sget-object v0, Lcom/daaw/xo6;->zza:Lcom/daaw/xo6;

    return-object v0
.end method

.method public static synthetic I(Lcom/daaw/xo6;I)V
    .locals 1

    iget v0, p0, Lcom/daaw/xo6;->zzd:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/daaw/xo6;->zzd:I

    iput p1, p0, Lcom/daaw/xo6;->zze:I

    return-void
.end method

.method public static synthetic J(Lcom/daaw/xo6;Lcom/daaw/ka7;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lcom/daaw/xo6;->zzf:Lcom/daaw/ka7;

    iget p1, p0, Lcom/daaw/xo6;->zzd:I

    or-int/lit8 p1, p1, 0x2

    iput p1, p0, Lcom/daaw/xo6;->zzd:I

    return-void
.end method

.method public static synthetic K(Lcom/daaw/xo6;Lcom/daaw/ka7;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/xo6;->zzg:Lcom/daaw/ka7;

    iget p1, p0, Lcom/daaw/xo6;->zzd:I

    or-int/lit8 p1, p1, 0x4

    iput p1, p0, Lcom/daaw/xo6;->zzd:I

    return-void
.end method

.method public static synthetic L(Lcom/daaw/xo6;Z)V
    .locals 1

    iget v0, p0, Lcom/daaw/xo6;->zzd:I

    or-int/lit8 v0, v0, 0x8

    iput v0, p0, Lcom/daaw/xo6;->zzd:I

    iput-boolean p1, p0, Lcom/daaw/xo6;->zzh:Z

    return-void
.end method


# virtual methods
.method public final C(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

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
    sget-object p1, Lcom/daaw/xo6;->zza:Lcom/daaw/xo6;

    return-object p1

    :cond_1
    new-instance p1, Lcom/daaw/wn6;

    invoke-direct {p1, p2}, Lcom/daaw/wn6;-><init>(Lcom/daaw/lj6;)V

    return-object p1

    :cond_2
    new-instance p1, Lcom/daaw/xo6;

    invoke-direct {p1}, Lcom/daaw/xo6;-><init>()V

    return-object p1

    :cond_3
    new-array p1, p3, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v3, "zzd"

    aput-object v3, p1, p3

    const-string p3, "zze"

    aput-object p3, p1, p2

    const-string p2, "zzf"

    aput-object p2, p1, v2

    const-string p2, "zzg"

    aput-object p2, p1, v1

    const-string p2, "zzh"

    aput-object p2, p1, v0

    sget-object p2, Lcom/daaw/xo6;->zza:Lcom/daaw/xo6;

    const-string p3, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1009\u0001\u0003\u1009\u0002\u0004\u1007\u0003"

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

    iget v0, p0, Lcom/daaw/xo6;->zze:I

    return v0
.end method

.method public final G()Lcom/daaw/ka7;
    .locals 1

    iget-object v0, p0, Lcom/daaw/xo6;->zzf:Lcom/daaw/ka7;

    if-nez v0, :cond_0

    invoke-static {}, Lcom/daaw/ka7;->K()Lcom/daaw/ka7;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public final H()Lcom/daaw/ka7;
    .locals 1

    iget-object v0, p0, Lcom/daaw/xo6;->zzg:Lcom/daaw/ka7;

    if-nez v0, :cond_0

    invoke-static {}, Lcom/daaw/ka7;->K()Lcom/daaw/ka7;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public final M()Z
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/xo6;->zzh:Z

    return v0
.end method

.method public final N()Z
    .locals 2

    iget v0, p0, Lcom/daaw/xo6;->zzd:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final O()Z
    .locals 1

    iget v0, p0, Lcom/daaw/xo6;->zzd:I

    and-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final P()Z
    .locals 1

    iget v0, p0, Lcom/daaw/xo6;->zzd:I

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
