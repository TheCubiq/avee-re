.class public final Lcom/daaw/oz6;
.super Lcom/daaw/ja8;
.source ""

# interfaces
.implements Lcom/daaw/be8;


# static fields
.field private static final zza:Lcom/daaw/oz6;


# instance fields
.field private zzd:I

.field private zze:Ljava/lang/String;

.field private zzf:Ljava/lang/String;

.field private zzg:Lcom/daaw/sm6;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/daaw/oz6;

    invoke-direct {v0}, Lcom/daaw/oz6;-><init>()V

    sput-object v0, Lcom/daaw/oz6;->zza:Lcom/daaw/oz6;

    const-class v1, Lcom/daaw/oz6;

    invoke-static {v1, v0}, Lcom/daaw/ja8;->v(Ljava/lang/Class;Lcom/daaw/ja8;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/daaw/ja8;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lcom/daaw/oz6;->zze:Ljava/lang/String;

    iput-object v0, p0, Lcom/daaw/oz6;->zzf:Ljava/lang/String;

    return-void
.end method

.method public static synthetic D()Lcom/daaw/oz6;
    .locals 1

    sget-object v0, Lcom/daaw/oz6;->zza:Lcom/daaw/oz6;

    return-object v0
.end method


# virtual methods
.method public final C(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
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
    sget-object p1, Lcom/daaw/oz6;->zza:Lcom/daaw/oz6;

    return-object p1

    :cond_1
    new-instance p1, Lcom/daaw/ly6;

    invoke-direct {p1, p2}, Lcom/daaw/ly6;-><init>(Lcom/daaw/lj6;)V

    return-object p1

    :cond_2
    new-instance p1, Lcom/daaw/oz6;

    invoke-direct {p1}, Lcom/daaw/oz6;-><init>()V

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

    const-string p2, "zzg"

    aput-object p2, p1, v0

    sget-object p2, Lcom/daaw/oz6;->zza:Lcom/daaw/oz6;

    const-string p3, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1009\u0002"

    invoke-static {p2, p3, p1}, Lcom/daaw/ja8;->s(Lcom/daaw/zd8;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
