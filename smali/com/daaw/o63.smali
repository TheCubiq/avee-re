.class public final Lcom/daaw/o63;
.super Lcom/daaw/ls7;
.source ""

# interfaces
.implements Lcom/daaw/yt7;


# static fields
.field private static final zzb:Lcom/daaw/o63;


# instance fields
.field private zzd:I

.field private zze:I

.field private zzf:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/daaw/o63;

    invoke-direct {v0}, Lcom/daaw/o63;-><init>()V

    sput-object v0, Lcom/daaw/o63;->zzb:Lcom/daaw/o63;

    const-class v1, Lcom/daaw/o63;

    invoke-static {v1, v0}, Lcom/daaw/ls7;->C(Ljava/lang/Class;Lcom/daaw/ls7;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/daaw/ls7;-><init>()V

    return-void
.end method

.method public static L()Lcom/daaw/c63;
    .locals 1

    sget-object v0, Lcom/daaw/o63;->zzb:Lcom/daaw/o63;

    invoke-virtual {v0}, Lcom/daaw/ls7;->H()Lcom/daaw/fs7;

    move-result-object v0

    check-cast v0, Lcom/daaw/c63;

    return-object v0
.end method

.method public static synthetic M()Lcom/daaw/o63;
    .locals 1

    sget-object v0, Lcom/daaw/o63;->zzb:Lcom/daaw/o63;

    return-object v0
.end method

.method public static N()Lcom/daaw/o63;
    .locals 1

    sget-object v0, Lcom/daaw/o63;->zzb:Lcom/daaw/o63;

    return-object v0
.end method

.method public static synthetic S(Lcom/daaw/o63;I)V
    .locals 0

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Lcom/daaw/o63;->zze:I

    iget p1, p0, Lcom/daaw/o63;->zzd:I

    or-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/daaw/o63;->zzd:I

    return-void
.end method

.method public static synthetic T(Lcom/daaw/o63;I)V
    .locals 0

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Lcom/daaw/o63;->zzf:I

    iget p1, p0, Lcom/daaw/o63;->zzd:I

    or-int/lit8 p1, p1, 0x2

    iput p1, p0, Lcom/daaw/o63;->zzd:I

    return-void
.end method


# virtual methods
.method public final I(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
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
    sget-object p1, Lcom/daaw/o63;->zzb:Lcom/daaw/o63;

    return-object p1

    :cond_1
    new-instance p1, Lcom/daaw/c63;

    invoke-direct {p1, p2}, Lcom/daaw/c63;-><init>(Lcom/daaw/h43;)V

    return-object p1

    :cond_2
    new-instance p1, Lcom/daaw/o63;

    invoke-direct {p1}, Lcom/daaw/o63;-><init>()V

    return-object p1

    :cond_3
    new-array p1, p3, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v3, "zzd"

    aput-object v3, p1, p3

    const-string p3, "zze"

    aput-object p3, p1, p2

    sget-object p2, Lcom/daaw/h63;->a:Lcom/daaw/ps7;

    aput-object p2, p1, v2

    const-string p2, "zzf"

    aput-object p2, p1, v1

    sget-object p2, Lcom/daaw/e63;->a:Lcom/daaw/ps7;

    aput-object p2, p1, v0

    sget-object p2, Lcom/daaw/o63;->zzb:Lcom/daaw/o63;

    const-string p3, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u100c\u0001"

    invoke-static {p2, p3, p1}, Lcom/daaw/ls7;->z(Lcom/daaw/xt7;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method

.method public final O()Z
    .locals 1

    iget v0, p0, Lcom/daaw/o63;->zzd:I

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final P()Z
    .locals 2

    iget v0, p0, Lcom/daaw/o63;->zzd:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final Q()I
    .locals 1

    iget v0, p0, Lcom/daaw/o63;->zzf:I

    invoke-static {v0}, Lcom/daaw/f63;->a(I)I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :cond_0
    return v0
.end method

.method public final R()I
    .locals 1

    iget v0, p0, Lcom/daaw/o63;->zze:I

    invoke-static {v0}, Lcom/daaw/i63;->a(I)I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :cond_0
    return v0
.end method
