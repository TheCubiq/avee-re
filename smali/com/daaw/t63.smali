.class public final Lcom/daaw/t63;
.super Lcom/daaw/ls7;
.source ""

# interfaces
.implements Lcom/daaw/yt7;


# static fields
.field private static final zzb:Lcom/daaw/rs7;

.field private static final zzd:Lcom/daaw/t63;


# instance fields
.field private zze:I

.field private zzf:J

.field private zzg:I

.field private zzh:J

.field private zzi:J

.field private zzj:Lcom/daaw/qs7;

.field private zzk:Lcom/daaw/o63;

.field private zzl:I

.field private zzm:I

.field private zzn:I

.field private zzo:I

.field private zzp:I

.field private zzq:I

.field private zzr:J


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/daaw/r63;

    invoke-direct {v0}, Lcom/daaw/r63;-><init>()V

    sput-object v0, Lcom/daaw/t63;->zzb:Lcom/daaw/rs7;

    new-instance v0, Lcom/daaw/t63;

    invoke-direct {v0}, Lcom/daaw/t63;-><init>()V

    sput-object v0, Lcom/daaw/t63;->zzd:Lcom/daaw/t63;

    const-class v1, Lcom/daaw/t63;

    invoke-static {v1, v0}, Lcom/daaw/ls7;->C(Ljava/lang/Class;Lcom/daaw/ls7;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/daaw/ls7;-><init>()V

    invoke-static {}, Lcom/daaw/ls7;->t()Lcom/daaw/qs7;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/t63;->zzj:Lcom/daaw/qs7;

    return-void
.end method

.method public static synthetic L(Lcom/daaw/t63;I)V
    .locals 0

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Lcom/daaw/t63;->zzm:I

    iget p1, p0, Lcom/daaw/t63;->zze:I

    or-int/lit8 p1, p1, 0x40

    iput p1, p0, Lcom/daaw/t63;->zze:I

    return-void
.end method

.method public static synthetic M(Lcom/daaw/t63;I)V
    .locals 0

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Lcom/daaw/t63;->zzn:I

    iget p1, p0, Lcom/daaw/t63;->zze:I

    or-int/lit16 p1, p1, 0x80

    iput p1, p0, Lcom/daaw/t63;->zze:I

    return-void
.end method

.method public static synthetic N(Lcom/daaw/t63;I)V
    .locals 0

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Lcom/daaw/t63;->zzp:I

    iget p1, p0, Lcom/daaw/t63;->zze:I

    or-int/lit16 p1, p1, 0x200

    iput p1, p0, Lcom/daaw/t63;->zze:I

    return-void
.end method

.method public static T()Lcom/daaw/s63;
    .locals 1

    sget-object v0, Lcom/daaw/t63;->zzd:Lcom/daaw/t63;

    invoke-virtual {v0}, Lcom/daaw/ls7;->H()Lcom/daaw/fs7;

    move-result-object v0

    check-cast v0, Lcom/daaw/s63;

    return-object v0
.end method

.method public static synthetic U()Lcom/daaw/t63;
    .locals 1

    sget-object v0, Lcom/daaw/t63;->zzd:Lcom/daaw/t63;

    return-object v0
.end method

.method public static V([B)Lcom/daaw/t63;
    .locals 1

    sget-object v0, Lcom/daaw/t63;->zzd:Lcom/daaw/t63;

    invoke-static {v0, p0}, Lcom/daaw/ls7;->p(Lcom/daaw/ls7;[B)Lcom/daaw/ls7;

    move-result-object p0

    check-cast p0, Lcom/daaw/t63;

    return-object p0
.end method

.method public static synthetic Y(Lcom/daaw/t63;J)V
    .locals 1

    iget v0, p0, Lcom/daaw/t63;->zze:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/daaw/t63;->zze:I

    iput-wide p1, p0, Lcom/daaw/t63;->zzf:J

    return-void
.end method

.method public static synthetic Z(Lcom/daaw/t63;J)V
    .locals 1

    iget v0, p0, Lcom/daaw/t63;->zze:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Lcom/daaw/t63;->zze:I

    iput-wide p1, p0, Lcom/daaw/t63;->zzh:J

    return-void
.end method

.method public static synthetic a0(Lcom/daaw/t63;J)V
    .locals 1

    iget v0, p0, Lcom/daaw/t63;->zze:I

    or-int/lit8 v0, v0, 0x8

    iput v0, p0, Lcom/daaw/t63;->zze:I

    iput-wide p1, p0, Lcom/daaw/t63;->zzi:J

    return-void
.end method

.method public static synthetic b0(Lcom/daaw/t63;Ljava/lang/Iterable;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/t63;->zzj:Lcom/daaw/qs7;

    invoke-interface {v0}, Lcom/daaw/us7;->zzc()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Lcom/daaw/ls7;->u(Lcom/daaw/qs7;)Lcom/daaw/qs7;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/t63;->zzj:Lcom/daaw/qs7;

    :cond_0
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/y43;

    iget-object v1, p0, Lcom/daaw/t63;->zzj:Lcom/daaw/qs7;

    invoke-virtual {v0}, Lcom/daaw/y43;->zza()I

    move-result v0

    invoke-interface {v1, v0}, Lcom/daaw/qs7;->i(I)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public static synthetic c0(Lcom/daaw/t63;Lcom/daaw/o63;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lcom/daaw/t63;->zzk:Lcom/daaw/o63;

    iget p1, p0, Lcom/daaw/t63;->zze:I

    or-int/lit8 p1, p1, 0x10

    iput p1, p0, Lcom/daaw/t63;->zze:I

    return-void
.end method

.method public static synthetic d0(Lcom/daaw/t63;I)V
    .locals 1

    iget v0, p0, Lcom/daaw/t63;->zze:I

    or-int/lit16 v0, v0, 0x100

    iput v0, p0, Lcom/daaw/t63;->zze:I

    iput p1, p0, Lcom/daaw/t63;->zzo:I

    return-void
.end method

.method public static synthetic e0(Lcom/daaw/t63;Lcom/daaw/x63;)V
    .locals 0

    invoke-virtual {p1}, Lcom/daaw/x63;->zza()I

    move-result p1

    iput p1, p0, Lcom/daaw/t63;->zzq:I

    iget p1, p0, Lcom/daaw/t63;->zze:I

    or-int/lit16 p1, p1, 0x400

    iput p1, p0, Lcom/daaw/t63;->zze:I

    return-void
.end method

.method public static synthetic f0(Lcom/daaw/t63;J)V
    .locals 1

    iget v0, p0, Lcom/daaw/t63;->zze:I

    or-int/lit16 v0, v0, 0x800

    iput v0, p0, Lcom/daaw/t63;->zze:I

    iput-wide p1, p0, Lcom/daaw/t63;->zzr:J

    return-void
.end method

.method public static synthetic l0(Lcom/daaw/t63;I)V
    .locals 0

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Lcom/daaw/t63;->zzg:I

    iget p1, p0, Lcom/daaw/t63;->zze:I

    or-int/lit8 p1, p1, 0x2

    iput p1, p0, Lcom/daaw/t63;->zze:I

    return-void
.end method

.method public static synthetic m0(Lcom/daaw/t63;I)V
    .locals 0

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Lcom/daaw/t63;->zzl:I

    iget p1, p0, Lcom/daaw/t63;->zze:I

    or-int/lit8 p1, p1, 0x20

    iput p1, p0, Lcom/daaw/t63;->zze:I

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
    sget-object p1, Lcom/daaw/t63;->zzd:Lcom/daaw/t63;

    return-object p1

    :cond_1
    new-instance p1, Lcom/daaw/s63;

    invoke-direct {p1, p2}, Lcom/daaw/s63;-><init>(Lcom/daaw/h43;)V

    return-object p1

    :cond_2
    new-instance p1, Lcom/daaw/t63;

    invoke-direct {p1}, Lcom/daaw/t63;-><init>()V

    return-object p1

    :cond_3
    const/16 p1, 0x15

    new-array p1, p1, [Ljava/lang/Object;

    const/4 v3, 0x0

    const-string v4, "zze"

    aput-object v4, p1, v3

    const-string v3, "zzf"

    aput-object v3, p1, p2

    const-string p2, "zzg"

    aput-object p2, p1, v2

    sget-object p2, Lcom/daaw/s53;->a:Lcom/daaw/ps7;

    aput-object p2, p1, v1

    const-string v1, "zzh"

    aput-object v1, p1, v0

    const-string v0, "zzi"

    aput-object v0, p1, p3

    const/4 p3, 0x6

    const-string v0, "zzj"

    aput-object v0, p1, p3

    const/4 p3, 0x7

    invoke-static {}, Lcom/daaw/y43;->b()Lcom/daaw/ps7;

    move-result-object v0

    aput-object v0, p1, p3

    const/16 p3, 0x8

    const-string v0, "zzk"

    aput-object v0, p1, p3

    const/16 p3, 0x9

    const-string v0, "zzl"

    aput-object v0, p1, p3

    const/16 p3, 0xa

    aput-object p2, p1, p3

    const/16 p3, 0xb

    const-string v0, "zzm"

    aput-object v0, p1, p3

    const/16 p3, 0xc

    aput-object p2, p1, p3

    const/16 p3, 0xd

    const-string v0, "zzn"

    aput-object v0, p1, p3

    const/16 p3, 0xe

    aput-object p2, p1, p3

    const/16 p3, 0xf

    const-string v0, "zzo"

    aput-object v0, p1, p3

    const/16 p3, 0x10

    const-string v0, "zzp"

    aput-object v0, p1, p3

    const/16 p3, 0x11

    aput-object p2, p1, p3

    const/16 p2, 0x12

    const-string p3, "zzq"

    aput-object p3, p1, p2

    const/16 p2, 0x13

    invoke-static {}, Lcom/daaw/x63;->b()Lcom/daaw/ps7;

    move-result-object p3

    aput-object p3, p1, p2

    const/16 p2, 0x14

    const-string p3, "zzr"

    aput-object p3, p1, p2

    sget-object p2, Lcom/daaw/t63;->zzd:Lcom/daaw/t63;

    const-string p3, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001\u1002\u0000\u0002\u100c\u0001\u0003\u1002\u0002\u0004\u1002\u0003\u0005\u001e\u0006\u1009\u0004\u0007\u100c\u0005\u0008\u100c\u0006\t\u100c\u0007\n\u1004\u0008\u000b\u100c\t\u000c\u100c\n\r\u1002\u000b"

    invoke-static {p2, p3, p1}, Lcom/daaw/ls7;->z(Lcom/daaw/xt7;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method

.method public final O()I
    .locals 1

    iget v0, p0, Lcom/daaw/t63;->zzo:I

    return v0
.end method

.method public final P()J
    .locals 2

    iget-wide v0, p0, Lcom/daaw/t63;->zzi:J

    return-wide v0
.end method

.method public final Q()J
    .locals 2

    iget-wide v0, p0, Lcom/daaw/t63;->zzh:J

    return-wide v0
.end method

.method public final R()J
    .locals 2

    iget-wide v0, p0, Lcom/daaw/t63;->zzf:J

    return-wide v0
.end method

.method public final S()Lcom/daaw/o63;
    .locals 1

    iget-object v0, p0, Lcom/daaw/t63;->zzk:Lcom/daaw/o63;

    if-nez v0, :cond_0

    invoke-static {}, Lcom/daaw/o63;->N()Lcom/daaw/o63;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public final W()Lcom/daaw/x63;
    .locals 1

    iget v0, p0, Lcom/daaw/t63;->zzq:I

    invoke-static {v0}, Lcom/daaw/x63;->a(I)Lcom/daaw/x63;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/daaw/x63;->q:Lcom/daaw/x63;

    :cond_0
    return-object v0
.end method

.method public final X()Ljava/util/List;
    .locals 3

    new-instance v0, Lcom/daaw/ss7;

    iget-object v1, p0, Lcom/daaw/t63;->zzj:Lcom/daaw/qs7;

    sget-object v2, Lcom/daaw/t63;->zzb:Lcom/daaw/rs7;

    invoke-direct {v0, v1, v2}, Lcom/daaw/ss7;-><init>(Ljava/util/List;Lcom/daaw/rs7;)V

    return-object v0
.end method

.method public final g0()I
    .locals 1

    iget v0, p0, Lcom/daaw/t63;->zzm:I

    invoke-static {v0}, Lcom/daaw/t53;->a(I)I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :cond_0
    return v0
.end method

.method public final h0()I
    .locals 1

    iget v0, p0, Lcom/daaw/t63;->zzn:I

    invoke-static {v0}, Lcom/daaw/t53;->a(I)I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :cond_0
    return v0
.end method

.method public final i0()I
    .locals 1

    iget v0, p0, Lcom/daaw/t63;->zzp:I

    invoke-static {v0}, Lcom/daaw/t53;->a(I)I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :cond_0
    return v0
.end method

.method public final j0()I
    .locals 1

    iget v0, p0, Lcom/daaw/t63;->zzg:I

    invoke-static {v0}, Lcom/daaw/t53;->a(I)I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :cond_0
    return v0
.end method

.method public final k0()I
    .locals 1

    iget v0, p0, Lcom/daaw/t63;->zzl:I

    invoke-static {v0}, Lcom/daaw/t53;->a(I)I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :cond_0
    return v0
.end method
