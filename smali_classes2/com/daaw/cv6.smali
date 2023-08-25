.class public final Lcom/daaw/cv6;
.super Lcom/daaw/ja8;
.source ""

# interfaces
.implements Lcom/daaw/be8;


# static fields
.field private static final zza:Lcom/daaw/cv6;


# instance fields
.field private zzd:I

.field private zze:Ljava/lang/String;

.field private zzf:J


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/daaw/cv6;

    invoke-direct {v0}, Lcom/daaw/cv6;-><init>()V

    sput-object v0, Lcom/daaw/cv6;->zza:Lcom/daaw/cv6;

    const-class v1, Lcom/daaw/cv6;

    invoke-static {v1, v0}, Lcom/daaw/ja8;->v(Ljava/lang/Class;Lcom/daaw/ja8;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/daaw/ja8;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lcom/daaw/cv6;->zze:Ljava/lang/String;

    return-void
.end method

.method public static D()Lcom/daaw/gu6;
    .locals 1

    sget-object v0, Lcom/daaw/cv6;->zza:Lcom/daaw/cv6;

    invoke-virtual {v0}, Lcom/daaw/ja8;->z()Lcom/daaw/y98;

    move-result-object v0

    check-cast v0, Lcom/daaw/gu6;

    return-object v0
.end method

.method public static synthetic E()Lcom/daaw/cv6;
    .locals 1

    sget-object v0, Lcom/daaw/cv6;->zza:Lcom/daaw/cv6;

    return-object v0
.end method

.method public static synthetic F(Lcom/daaw/cv6;Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, p0, Lcom/daaw/cv6;->zzd:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/daaw/cv6;->zzd:I

    iput-object p1, p0, Lcom/daaw/cv6;->zze:Ljava/lang/String;

    return-void
.end method

.method public static synthetic G(Lcom/daaw/cv6;J)V
    .locals 1

    iget v0, p0, Lcom/daaw/cv6;->zzd:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/daaw/cv6;->zzd:I

    iput-wide p1, p0, Lcom/daaw/cv6;->zzf:J

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
    sget-object p1, Lcom/daaw/cv6;->zza:Lcom/daaw/cv6;

    return-object p1

    :cond_1
    new-instance p1, Lcom/daaw/gu6;

    invoke-direct {p1, p3}, Lcom/daaw/gu6;-><init>(Lcom/daaw/lj6;)V

    return-object p1

    :cond_2
    new-instance p1, Lcom/daaw/cv6;

    invoke-direct {p1}, Lcom/daaw/cv6;-><init>()V

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

    sget-object p2, Lcom/daaw/cv6;->zza:Lcom/daaw/cv6;

    const-string p3, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1002\u0001"

    invoke-static {p2, p3, p1}, Lcom/daaw/ja8;->s(Lcom/daaw/zd8;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
