.class public final Lcom/daaw/aj2;
.super Lcom/daaw/ls7;
.source ""

# interfaces
.implements Lcom/daaw/yt7;


# static fields
.field private static final zzb:Lcom/daaw/aj2;


# instance fields
.field private zzd:I

.field private zze:J

.field private zzf:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/daaw/aj2;

    invoke-direct {v0}, Lcom/daaw/aj2;-><init>()V

    sput-object v0, Lcom/daaw/aj2;->zzb:Lcom/daaw/aj2;

    const-class v1, Lcom/daaw/aj2;

    invoke-static {v1, v0}, Lcom/daaw/ls7;->C(Ljava/lang/Class;Lcom/daaw/ls7;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lcom/daaw/ls7;-><init>()V

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/daaw/aj2;->zze:J

    const/16 v0, 0x3e8

    iput v0, p0, Lcom/daaw/aj2;->zzf:I

    return-void
.end method

.method public static synthetic L()Lcom/daaw/aj2;
    .locals 1

    sget-object v0, Lcom/daaw/aj2;->zzb:Lcom/daaw/aj2;

    return-object v0
.end method


# virtual methods
.method public final I(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    add-int/lit8 p1, p1, -0x1

    const/4 p2, 0x1

    if-eqz p1, :cond_4

    const/4 p3, 0x4

    const/4 v0, 0x3

    const/4 v1, 0x2

    if-eq p1, v1, :cond_3

    if-eq p1, v0, :cond_2

    const/4 p2, 0x0

    if-eq p1, p3, :cond_1

    const/4 p3, 0x5

    if-eq p1, p3, :cond_0

    return-object p2

    :cond_0
    sget-object p1, Lcom/daaw/aj2;->zzb:Lcom/daaw/aj2;

    return-object p1

    :cond_1
    new-instance p1, Lcom/daaw/vi2;

    invoke-direct {p1, p2}, Lcom/daaw/vi2;-><init>(Lcom/daaw/gi2;)V

    return-object p1

    :cond_2
    new-instance p1, Lcom/daaw/aj2;

    invoke-direct {p1}, Lcom/daaw/aj2;-><init>()V

    return-object p1

    :cond_3
    new-array p1, p3, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v2, "zzd"

    aput-object v2, p1, p3

    const-string p3, "zze"

    aput-object p3, p1, p2

    const-string p2, "zzf"

    aput-object p2, p1, v1

    sget-object p2, Lcom/daaw/lj2;->a:Lcom/daaw/ps7;

    aput-object p2, p1, v0

    sget-object p2, Lcom/daaw/aj2;->zzb:Lcom/daaw/aj2;

    const-string p3, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1002\u0000\u0002\u100c\u0001"

    invoke-static {p2, p3, p1}, Lcom/daaw/ls7;->z(Lcom/daaw/xt7;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
