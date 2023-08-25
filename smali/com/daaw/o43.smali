.class public final Lcom/daaw/o43;
.super Lcom/daaw/ls7;
.source ""

# interfaces
.implements Lcom/daaw/yt7;


# static fields
.field private static final zzb:Lcom/daaw/o43;


# instance fields
.field private zzd:I

.field private zze:I

.field private zzf:Lcom/daaw/s43;

.field private zzg:Lcom/daaw/u43;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/daaw/o43;

    invoke-direct {v0}, Lcom/daaw/o43;-><init>()V

    sput-object v0, Lcom/daaw/o43;->zzb:Lcom/daaw/o43;

    const-class v1, Lcom/daaw/o43;

    invoke-static {v1, v0}, Lcom/daaw/ls7;->C(Ljava/lang/Class;Lcom/daaw/ls7;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/daaw/ls7;-><init>()V

    return-void
.end method

.method public static L()Lcom/daaw/n43;
    .locals 1

    sget-object v0, Lcom/daaw/o43;->zzb:Lcom/daaw/o43;

    invoke-virtual {v0}, Lcom/daaw/ls7;->H()Lcom/daaw/fs7;

    move-result-object v0

    check-cast v0, Lcom/daaw/n43;

    return-object v0
.end method

.method public static synthetic M()Lcom/daaw/o43;
    .locals 1

    sget-object v0, Lcom/daaw/o43;->zzb:Lcom/daaw/o43;

    return-object v0
.end method

.method public static synthetic N(Lcom/daaw/o43;Lcom/daaw/s43;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lcom/daaw/o43;->zzf:Lcom/daaw/s43;

    iget p1, p0, Lcom/daaw/o43;->zzd:I

    or-int/lit8 p1, p1, 0x2

    iput p1, p0, Lcom/daaw/o43;->zzd:I

    return-void
.end method

.method public static synthetic O(Lcom/daaw/o43;Lcom/daaw/u43;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lcom/daaw/o43;->zzg:Lcom/daaw/u43;

    iget p1, p0, Lcom/daaw/o43;->zzd:I

    or-int/lit8 p1, p1, 0x4

    iput p1, p0, Lcom/daaw/o43;->zzd:I

    return-void
.end method

.method public static synthetic P(Lcom/daaw/o43;I)V
    .locals 1

    const/4 p1, 0x1

    iput p1, p0, Lcom/daaw/o43;->zze:I

    iget v0, p0, Lcom/daaw/o43;->zzd:I

    or-int/2addr p1, v0

    iput p1, p0, Lcom/daaw/o43;->zzd:I

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
    sget-object p1, Lcom/daaw/o43;->zzb:Lcom/daaw/o43;

    return-object p1

    :cond_1
    new-instance p1, Lcom/daaw/n43;

    invoke-direct {p1, p2}, Lcom/daaw/n43;-><init>(Lcom/daaw/h43;)V

    return-object p1

    :cond_2
    new-instance p1, Lcom/daaw/o43;

    invoke-direct {p1}, Lcom/daaw/o43;-><init>()V

    return-object p1

    :cond_3
    new-array p1, p3, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v3, "zzd"

    aput-object v3, p1, p3

    const-string p3, "zze"

    aput-object p3, p1, p2

    sget-object p2, Lcom/daaw/q43;->a:Lcom/daaw/ps7;

    aput-object p2, p1, v2

    const-string p2, "zzf"

    aput-object p2, p1, v1

    const-string p2, "zzg"

    aput-object p2, p1, v0

    sget-object p2, Lcom/daaw/o43;->zzb:Lcom/daaw/o43;

    const-string p3, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u1009\u0001\u0003\u1009\u0002"

    invoke-static {p2, p3, p1}, Lcom/daaw/ls7;->z(Lcom/daaw/xt7;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
