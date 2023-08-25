.class public final Lcom/daaw/m43;
.super Lcom/daaw/ls7;
.source ""

# interfaces
.implements Lcom/daaw/yt7;


# static fields
.field private static final zzb:Lcom/daaw/m43;


# instance fields
.field private zzd:I

.field private zze:I

.field private zzf:I

.field private zzg:Lcom/daaw/c53;

.field private zzh:Lcom/daaw/j53;

.field private zzi:Lcom/daaw/us7;

.field private zzj:Lcom/daaw/l53;

.field private zzk:Lcom/daaw/a73;

.field private zzl:Lcom/daaw/q63;

.field private zzm:Lcom/daaw/z53;

.field private zzn:Lcom/daaw/b63;

.field private zzo:Lcom/daaw/us7;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/daaw/m43;

    invoke-direct {v0}, Lcom/daaw/m43;-><init>()V

    sput-object v0, Lcom/daaw/m43;->zzb:Lcom/daaw/m43;

    const-class v1, Lcom/daaw/m43;

    invoke-static {v1, v0}, Lcom/daaw/ls7;->C(Ljava/lang/Class;Lcom/daaw/ls7;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/daaw/ls7;-><init>()V

    const/16 v0, 0x3e8

    iput v0, p0, Lcom/daaw/m43;->zzf:I

    invoke-static {}, Lcom/daaw/ls7;->w()Lcom/daaw/us7;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/m43;->zzi:Lcom/daaw/us7;

    invoke-static {}, Lcom/daaw/ls7;->w()Lcom/daaw/us7;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/m43;->zzo:Lcom/daaw/us7;

    return-void
.end method

.method public static synthetic L()Lcom/daaw/m43;
    .locals 1

    sget-object v0, Lcom/daaw/m43;->zzb:Lcom/daaw/m43;

    return-object v0
.end method

.method public static M()Lcom/daaw/m43;
    .locals 1

    sget-object v0, Lcom/daaw/m43;->zzb:Lcom/daaw/m43;

    return-object v0
.end method

.method public static synthetic O(Lcom/daaw/m43;Lcom/daaw/k43;)V
    .locals 0

    invoke-virtual {p1}, Lcom/daaw/k43;->zza()I

    move-result p1

    iput p1, p0, Lcom/daaw/m43;->zze:I

    iget p1, p0, Lcom/daaw/m43;->zzd:I

    or-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/daaw/m43;->zzd:I

    return-void
.end method

.method public static synthetic P(Lcom/daaw/m43;Lcom/daaw/j53;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lcom/daaw/m43;->zzh:Lcom/daaw/j53;

    iget p1, p0, Lcom/daaw/m43;->zzd:I

    or-int/lit8 p1, p1, 0x8

    iput p1, p0, Lcom/daaw/m43;->zzd:I

    return-void
.end method


# virtual methods
.method public final I(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
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
    sget-object p1, Lcom/daaw/m43;->zzb:Lcom/daaw/m43;

    return-object p1

    :cond_1
    new-instance p1, Lcom/daaw/l43;

    invoke-direct {p1, p2}, Lcom/daaw/l43;-><init>(Lcom/daaw/h43;)V

    return-object p1

    :cond_2
    new-instance p1, Lcom/daaw/m43;

    invoke-direct {p1}, Lcom/daaw/m43;-><init>()V

    return-object p1

    :cond_3
    const/16 p1, 0x10

    new-array p1, p1, [Ljava/lang/Object;

    const/4 v3, 0x0

    const-string v4, "zzd"

    aput-object v4, p1, v3

    const-string v3, "zze"

    aput-object v3, p1, p2

    invoke-static {}, Lcom/daaw/k43;->b()Lcom/daaw/ps7;

    move-result-object p2

    aput-object p2, p1, v2

    const-string p2, "zzf"

    aput-object p2, p1, v1

    sget-object p2, Lcom/daaw/s53;->a:Lcom/daaw/ps7;

    aput-object p2, p1, v0

    const-string p2, "zzg"

    aput-object p2, p1, p3

    const/4 p2, 0x6

    const-string p3, "zzh"

    aput-object p3, p1, p2

    const/4 p2, 0x7

    const-string p3, "zzi"

    aput-object p3, p1, p2

    const/16 p2, 0x8

    const-class p3, Lcom/daaw/a53;

    aput-object p3, p1, p2

    const/16 p2, 0x9

    const-string p3, "zzj"

    aput-object p3, p1, p2

    const/16 p2, 0xa

    const-string p3, "zzk"

    aput-object p3, p1, p2

    const/16 p2, 0xb

    const-string p3, "zzl"

    aput-object p3, p1, p2

    const/16 p2, 0xc

    const-string p3, "zzm"

    aput-object p3, p1, p2

    const/16 p2, 0xd

    const-string p3, "zzn"

    aput-object p3, p1, p2

    const/16 p2, 0xe

    const-string p3, "zzo"

    aput-object p3, p1, p2

    const/16 p2, 0xf

    const-class p3, Lcom/daaw/m73;

    aput-object p3, p1, p2

    sget-object p2, Lcom/daaw/m43;->zzb:Lcom/daaw/m43;

    const-string p3, "\u0001\u000b\u0000\u0001\u0007\u0011\u000b\u0000\u0002\u0000\u0007\u100c\u0000\u0008\u100c\u0001\t\u1009\u0002\n\u1009\u0003\u000b\u001b\u000c\u1009\u0004\r\u1009\u0005\u000e\u1009\u0006\u000f\u1009\u0007\u0010\u1009\u0008\u0011\u001b"

    invoke-static {p2, p3, p1}, Lcom/daaw/ls7;->z(Lcom/daaw/xt7;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method

.method public final N()Lcom/daaw/j53;
    .locals 1

    iget-object v0, p0, Lcom/daaw/m43;->zzh:Lcom/daaw/j53;

    if-nez v0, :cond_0

    invoke-static {}, Lcom/daaw/j53;->M()Lcom/daaw/j53;

    move-result-object v0

    :cond_0
    return-object v0
.end method
