.class public final Lcom/daaw/j53;
.super Lcom/daaw/ls7;
.source ""

# interfaces
.implements Lcom/daaw/yt7;


# static fields
.field private static final zzb:Lcom/daaw/j53;


# instance fields
.field private zzd:I

.field private zze:Ljava/lang/String;

.field private zzf:Lcom/daaw/us7;

.field private zzg:I

.field private zzh:I

.field private zzi:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/daaw/j53;

    invoke-direct {v0}, Lcom/daaw/j53;-><init>()V

    sput-object v0, Lcom/daaw/j53;->zzb:Lcom/daaw/j53;

    const-class v1, Lcom/daaw/j53;

    invoke-static {v1, v0}, Lcom/daaw/ls7;->C(Ljava/lang/Class;Lcom/daaw/ls7;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/daaw/ls7;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lcom/daaw/j53;->zze:Ljava/lang/String;

    invoke-static {}, Lcom/daaw/ls7;->w()Lcom/daaw/us7;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/j53;->zzf:Lcom/daaw/us7;

    const/16 v0, 0x3e8

    iput v0, p0, Lcom/daaw/j53;->zzg:I

    iput v0, p0, Lcom/daaw/j53;->zzh:I

    iput v0, p0, Lcom/daaw/j53;->zzi:I

    return-void
.end method

.method public static synthetic L()Lcom/daaw/j53;
    .locals 1

    sget-object v0, Lcom/daaw/j53;->zzb:Lcom/daaw/j53;

    return-object v0
.end method

.method public static M()Lcom/daaw/j53;
    .locals 1

    sget-object v0, Lcom/daaw/j53;->zzb:Lcom/daaw/j53;

    return-object v0
.end method

.method public static synthetic N(Lcom/daaw/j53;Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, p0, Lcom/daaw/j53;->zzd:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/daaw/j53;->zzd:I

    iput-object p1, p0, Lcom/daaw/j53;->zze:Ljava/lang/String;

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
    sget-object p1, Lcom/daaw/j53;->zzb:Lcom/daaw/j53;

    return-object p1

    :cond_1
    new-instance p1, Lcom/daaw/d53;

    invoke-direct {p1, p2}, Lcom/daaw/d53;-><init>(Lcom/daaw/h43;)V

    return-object p1

    :cond_2
    new-instance p1, Lcom/daaw/j53;

    invoke-direct {p1}, Lcom/daaw/j53;-><init>()V

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

    const-class p2, Lcom/daaw/a53;

    aput-object p2, p1, v1

    const-string p2, "zzg"

    aput-object p2, p1, v0

    sget-object p2, Lcom/daaw/s53;->a:Lcom/daaw/ps7;

    aput-object p2, p1, p3

    const/4 p3, 0x6

    const-string v0, "zzh"

    aput-object v0, p1, p3

    const/4 p3, 0x7

    aput-object p2, p1, p3

    const/16 p3, 0x8

    const-string v0, "zzi"

    aput-object v0, p1, p3

    const/16 p3, 0x9

    aput-object p2, p1, p3

    sget-object p2, Lcom/daaw/j53;->zzb:Lcom/daaw/j53;

    const-string p3, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u001b\u0003\u100c\u0001\u0004\u100c\u0002\u0005\u100c\u0003"

    invoke-static {p2, p3, p1}, Lcom/daaw/ls7;->z(Lcom/daaw/xt7;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
