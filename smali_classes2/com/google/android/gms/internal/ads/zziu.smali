.class public final Lcom/google/android/gms/internal/ads/zziu;
.super Lcom/google/android/gms/internal/ads/zzbfc;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/ads/zzbfc<",
        "Lcom/google/android/gms/internal/ads/zziu;",
        ">;"
    }
.end annotation


# static fields
.field private static volatile zzaow:[Lcom/google/android/gms/internal/ads/zziu;


# instance fields
.field private zzaox:Lcom/google/android/gms/internal/ads/zziy;

.field private zzaoy:Lcom/google/android/gms/internal/ads/zzja;

.field private zzaoz:Lcom/google/android/gms/internal/ads/zzjb;

.field private zzapa:Lcom/google/android/gms/internal/ads/zzjc;

.field private zzapb:Lcom/google/android/gms/internal/ads/zziv;

.field private zzapc:Lcom/google/android/gms/internal/ads/zziz;

.field private zzapd:Lcom/google/android/gms/internal/ads/zzix;

.field private zzape:Ljava/lang/Integer;

.field private zzapf:Ljava/lang/Integer;

.field private zzapg:Lcom/google/android/gms/internal/ads/zzis;

.field private zzaph:Ljava/lang/Integer;

.field private zzapi:Ljava/lang/Integer;

.field private zzapj:Ljava/lang/Integer;

.field private zzapk:Ljava/lang/Integer;

.field private zzapl:Ljava/lang/Integer;

.field private zzapm:Ljava/lang/Long;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzbfc;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zziu;->zzaox:Lcom/google/android/gms/internal/ads/zziy;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zziu;->zzaoy:Lcom/google/android/gms/internal/ads/zzja;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zziu;->zzaoz:Lcom/google/android/gms/internal/ads/zzjb;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zziu;->zzapa:Lcom/google/android/gms/internal/ads/zzjc;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zziu;->zzapb:Lcom/google/android/gms/internal/ads/zziv;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zziu;->zzapc:Lcom/google/android/gms/internal/ads/zziz;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zziu;->zzapd:Lcom/google/android/gms/internal/ads/zzix;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zziu;->zzape:Ljava/lang/Integer;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zziu;->zzapf:Ljava/lang/Integer;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zziu;->zzapg:Lcom/google/android/gms/internal/ads/zzis;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zziu;->zzaph:Ljava/lang/Integer;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zziu;->zzapi:Ljava/lang/Integer;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zziu;->zzapj:Ljava/lang/Integer;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zziu;->zzapk:Ljava/lang/Integer;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zziu;->zzapl:Ljava/lang/Integer;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zziu;->zzapm:Ljava/lang/Long;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zziu;->zzebk:Lcom/google/android/gms/internal/ads/zzbfe;

    const/4 v0, -0x1

    iput v0, p0, Lcom/google/android/gms/internal/ads/zziu;->zzebt:I

    return-void
.end method

.method public static zzhu()[Lcom/google/android/gms/internal/ads/zziu;
    .locals 2

    sget-object v0, Lcom/google/android/gms/internal/ads/zziu;->zzaow:[Lcom/google/android/gms/internal/ads/zziu;

    if-nez v0, :cond_1

    sget-object v0, Lcom/google/android/gms/internal/ads/zzbfg;->zzebs:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/google/android/gms/internal/ads/zziu;->zzaow:[Lcom/google/android/gms/internal/ads/zziu;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    new-array v1, v1, [Lcom/google/android/gms/internal/ads/zziu;

    sput-object v1, Lcom/google/android/gms/internal/ads/zziu;->zzaow:[Lcom/google/android/gms/internal/ads/zziu;

    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    :cond_1
    :goto_0
    sget-object v0, Lcom/google/android/gms/internal/ads/zziu;->zzaow:[Lcom/google/android/gms/internal/ads/zziu;

    return-object v0
.end method


# virtual methods
.method public final synthetic zza(Lcom/google/android/gms/internal/ads/zzbez;)Lcom/google/android/gms/internal/ads/zzbfi;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    :cond_0
    :goto_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbez;->zzabk()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    invoke-super {p0, p1, v0}, Lcom/google/android/gms/internal/ads/zzbfc;->zza(Lcom/google/android/gms/internal/ads/zzbez;I)Z

    move-result v0

    if-nez v0, :cond_0

    return-object p0

    :sswitch_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbez;->zzacd()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zziu;->zzapm:Ljava/lang/Long;

    goto :goto_0

    :sswitch_1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbez;->zzacc()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zziu;->zzapl:Ljava/lang/Integer;

    goto :goto_0

    :sswitch_2
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbez;->zzacc()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zziu;->zzapk:Ljava/lang/Integer;

    goto :goto_0

    :sswitch_3
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbez;->zzacc()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zziu;->zzapj:Ljava/lang/Integer;

    goto :goto_0

    :sswitch_4
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbez;->zzacc()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zziu;->zzapi:Ljava/lang/Integer;

    goto :goto_0

    :sswitch_5
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbez;->zzacc()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zziu;->zzaph:Ljava/lang/Integer;

    goto :goto_0

    :sswitch_6
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zziu;->zzapg:Lcom/google/android/gms/internal/ads/zzis;

    if-nez v0, :cond_1

    new-instance v0, Lcom/google/android/gms/internal/ads/zzis;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzis;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zziu;->zzapg:Lcom/google/android/gms/internal/ads/zzis;

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zziu;->zzapg:Lcom/google/android/gms/internal/ads/zzis;

    goto/16 :goto_1

    :sswitch_7
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbez;->zzacc()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zziu;->zzapf:Ljava/lang/Integer;

    goto :goto_0

    :sswitch_8
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbez;->zzacc()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zziu;->zzape:Ljava/lang/Integer;

    goto :goto_0

    :sswitch_9
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zziu;->zzapd:Lcom/google/android/gms/internal/ads/zzix;

    if-nez v0, :cond_2

    new-instance v0, Lcom/google/android/gms/internal/ads/zzix;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzix;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zziu;->zzapd:Lcom/google/android/gms/internal/ads/zzix;

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zziu;->zzapd:Lcom/google/android/gms/internal/ads/zzix;

    goto :goto_1

    :sswitch_a
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zziu;->zzapc:Lcom/google/android/gms/internal/ads/zziz;

    if-nez v0, :cond_3

    new-instance v0, Lcom/google/android/gms/internal/ads/zziz;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zziz;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zziu;->zzapc:Lcom/google/android/gms/internal/ads/zziz;

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zziu;->zzapc:Lcom/google/android/gms/internal/ads/zziz;

    goto :goto_1

    :sswitch_b
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zziu;->zzapb:Lcom/google/android/gms/internal/ads/zziv;

    if-nez v0, :cond_4

    new-instance v0, Lcom/google/android/gms/internal/ads/zziv;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zziv;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zziu;->zzapb:Lcom/google/android/gms/internal/ads/zziv;

    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zziu;->zzapb:Lcom/google/android/gms/internal/ads/zziv;

    goto :goto_1

    :sswitch_c
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zziu;->zzapa:Lcom/google/android/gms/internal/ads/zzjc;

    if-nez v0, :cond_5

    new-instance v0, Lcom/google/android/gms/internal/ads/zzjc;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzjc;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zziu;->zzapa:Lcom/google/android/gms/internal/ads/zzjc;

    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zziu;->zzapa:Lcom/google/android/gms/internal/ads/zzjc;

    goto :goto_1

    :sswitch_d
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zziu;->zzaoz:Lcom/google/android/gms/internal/ads/zzjb;

    if-nez v0, :cond_6

    new-instance v0, Lcom/google/android/gms/internal/ads/zzjb;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzjb;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zziu;->zzaoz:Lcom/google/android/gms/internal/ads/zzjb;

    :cond_6
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zziu;->zzaoz:Lcom/google/android/gms/internal/ads/zzjb;

    goto :goto_1

    :sswitch_e
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zziu;->zzaoy:Lcom/google/android/gms/internal/ads/zzja;

    if-nez v0, :cond_7

    new-instance v0, Lcom/google/android/gms/internal/ads/zzja;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzja;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zziu;->zzaoy:Lcom/google/android/gms/internal/ads/zzja;

    :cond_7
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zziu;->zzaoy:Lcom/google/android/gms/internal/ads/zzja;

    goto :goto_1

    :sswitch_f
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zziu;->zzaox:Lcom/google/android/gms/internal/ads/zziy;

    if-nez v0, :cond_8

    new-instance v0, Lcom/google/android/gms/internal/ads/zziy;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zziy;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zziu;->zzaox:Lcom/google/android/gms/internal/ads/zziy;

    :cond_8
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zziu;->zzaox:Lcom/google/android/gms/internal/ads/zziy;

    :goto_1
    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/zzbez;->zza(Lcom/google/android/gms/internal/ads/zzbfi;)V

    goto/16 :goto_0

    :sswitch_10
    return-object p0

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_10
        0x2a -> :sswitch_f
        0x32 -> :sswitch_e
        0x3a -> :sswitch_d
        0x42 -> :sswitch_c
        0x4a -> :sswitch_b
        0x52 -> :sswitch_a
        0x5a -> :sswitch_9
        0x60 -> :sswitch_8
        0x68 -> :sswitch_7
        0x72 -> :sswitch_6
        0x78 -> :sswitch_5
        0x80 -> :sswitch_4
        0x88 -> :sswitch_3
        0x90 -> :sswitch_2
        0x98 -> :sswitch_1
        0xa0 -> :sswitch_0
    .end sparse-switch
.end method

.method public final zza(Lcom/google/android/gms/internal/ads/zzbfa;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zziu;->zzaox:Lcom/google/android/gms/internal/ads/zziy;

    if-eqz v0, :cond_0

    const/4 v1, 0x5

    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/internal/ads/zzbfa;->zza(ILcom/google/android/gms/internal/ads/zzbfi;)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zziu;->zzaoy:Lcom/google/android/gms/internal/ads/zzja;

    if-eqz v0, :cond_1

    const/4 v1, 0x6

    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/internal/ads/zzbfa;->zza(ILcom/google/android/gms/internal/ads/zzbfi;)V

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zziu;->zzaoz:Lcom/google/android/gms/internal/ads/zzjb;

    if-eqz v0, :cond_2

    const/4 v1, 0x7

    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/internal/ads/zzbfa;->zza(ILcom/google/android/gms/internal/ads/zzbfi;)V

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zziu;->zzapa:Lcom/google/android/gms/internal/ads/zzjc;

    if-eqz v0, :cond_3

    const/16 v1, 0x8

    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/internal/ads/zzbfa;->zza(ILcom/google/android/gms/internal/ads/zzbfi;)V

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zziu;->zzapb:Lcom/google/android/gms/internal/ads/zziv;

    if-eqz v0, :cond_4

    const/16 v1, 0x9

    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/internal/ads/zzbfa;->zza(ILcom/google/android/gms/internal/ads/zzbfi;)V

    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zziu;->zzapc:Lcom/google/android/gms/internal/ads/zziz;

    if-eqz v0, :cond_5

    const/16 v1, 0xa

    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/internal/ads/zzbfa;->zza(ILcom/google/android/gms/internal/ads/zzbfi;)V

    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zziu;->zzapd:Lcom/google/android/gms/internal/ads/zzix;

    if-eqz v0, :cond_6

    const/16 v1, 0xb

    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/internal/ads/zzbfa;->zza(ILcom/google/android/gms/internal/ads/zzbfi;)V

    :cond_6
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zziu;->zzape:Ljava/lang/Integer;

    if-eqz v0, :cond_7

    const/16 v1, 0xc

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/internal/ads/zzbfa;->zzm(II)V

    :cond_7
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zziu;->zzapf:Ljava/lang/Integer;

    if-eqz v0, :cond_8

    const/16 v1, 0xd

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/internal/ads/zzbfa;->zzm(II)V

    :cond_8
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zziu;->zzapg:Lcom/google/android/gms/internal/ads/zzis;

    if-eqz v0, :cond_9

    const/16 v1, 0xe

    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/internal/ads/zzbfa;->zza(ILcom/google/android/gms/internal/ads/zzbfi;)V

    :cond_9
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zziu;->zzaph:Ljava/lang/Integer;

    if-eqz v0, :cond_a

    const/16 v1, 0xf

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/internal/ads/zzbfa;->zzm(II)V

    :cond_a
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zziu;->zzapi:Ljava/lang/Integer;

    if-eqz v0, :cond_b

    const/16 v1, 0x10

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/internal/ads/zzbfa;->zzm(II)V

    :cond_b
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zziu;->zzapj:Ljava/lang/Integer;

    if-eqz v0, :cond_c

    const/16 v1, 0x11

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/internal/ads/zzbfa;->zzm(II)V

    :cond_c
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zziu;->zzapk:Ljava/lang/Integer;

    if-eqz v0, :cond_d

    const/16 v1, 0x12

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/internal/ads/zzbfa;->zzm(II)V

    :cond_d
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zziu;->zzapl:Ljava/lang/Integer;

    if-eqz v0, :cond_e

    const/16 v1, 0x13

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/internal/ads/zzbfa;->zzm(II)V

    :cond_e
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zziu;->zzapm:Ljava/lang/Long;

    if-eqz v0, :cond_f

    const/16 v1, 0x14

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-virtual {p1, v1, v2, v3}, Lcom/google/android/gms/internal/ads/zzbfa;->zza(IJ)V

    :cond_f
    invoke-super {p0, p1}, Lcom/google/android/gms/internal/ads/zzbfc;->zza(Lcom/google/android/gms/internal/ads/zzbfa;)V

    return-void
.end method

.method protected final zzr()I
    .locals 5

    invoke-super {p0}, Lcom/google/android/gms/internal/ads/zzbfc;->zzr()I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zziu;->zzaox:Lcom/google/android/gms/internal/ads/zziy;

    if-eqz v1, :cond_0

    const/4 v2, 0x5

    invoke-static {v2, v1}, Lcom/google/android/gms/internal/ads/zzbfa;->zzb(ILcom/google/android/gms/internal/ads/zzbfi;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zziu;->zzaoy:Lcom/google/android/gms/internal/ads/zzja;

    if-eqz v1, :cond_1

    const/4 v2, 0x6

    invoke-static {v2, v1}, Lcom/google/android/gms/internal/ads/zzbfa;->zzb(ILcom/google/android/gms/internal/ads/zzbfi;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_1
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zziu;->zzaoz:Lcom/google/android/gms/internal/ads/zzjb;

    if-eqz v1, :cond_2

    const/4 v2, 0x7

    invoke-static {v2, v1}, Lcom/google/android/gms/internal/ads/zzbfa;->zzb(ILcom/google/android/gms/internal/ads/zzbfi;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_2
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zziu;->zzapa:Lcom/google/android/gms/internal/ads/zzjc;

    if-eqz v1, :cond_3

    const/16 v2, 0x8

    invoke-static {v2, v1}, Lcom/google/android/gms/internal/ads/zzbfa;->zzb(ILcom/google/android/gms/internal/ads/zzbfi;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_3
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zziu;->zzapb:Lcom/google/android/gms/internal/ads/zziv;

    if-eqz v1, :cond_4

    const/16 v2, 0x9

    invoke-static {v2, v1}, Lcom/google/android/gms/internal/ads/zzbfa;->zzb(ILcom/google/android/gms/internal/ads/zzbfi;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_4
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zziu;->zzapc:Lcom/google/android/gms/internal/ads/zziz;

    if-eqz v1, :cond_5

    const/16 v2, 0xa

    invoke-static {v2, v1}, Lcom/google/android/gms/internal/ads/zzbfa;->zzb(ILcom/google/android/gms/internal/ads/zzbfi;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_5
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zziu;->zzapd:Lcom/google/android/gms/internal/ads/zzix;

    if-eqz v1, :cond_6

    const/16 v2, 0xb

    invoke-static {v2, v1}, Lcom/google/android/gms/internal/ads/zzbfa;->zzb(ILcom/google/android/gms/internal/ads/zzbfi;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_6
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zziu;->zzape:Ljava/lang/Integer;

    if-eqz v1, :cond_7

    const/16 v2, 0xc

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-static {v2, v1}, Lcom/google/android/gms/internal/ads/zzbfa;->zzq(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_7
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zziu;->zzapf:Ljava/lang/Integer;

    if-eqz v1, :cond_8

    const/16 v2, 0xd

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-static {v2, v1}, Lcom/google/android/gms/internal/ads/zzbfa;->zzq(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_8
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zziu;->zzapg:Lcom/google/android/gms/internal/ads/zzis;

    if-eqz v1, :cond_9

    const/16 v2, 0xe

    invoke-static {v2, v1}, Lcom/google/android/gms/internal/ads/zzbfa;->zzb(ILcom/google/android/gms/internal/ads/zzbfi;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_9
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zziu;->zzaph:Ljava/lang/Integer;

    if-eqz v1, :cond_a

    const/16 v2, 0xf

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-static {v2, v1}, Lcom/google/android/gms/internal/ads/zzbfa;->zzq(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_a
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zziu;->zzapi:Ljava/lang/Integer;

    if-eqz v1, :cond_b

    const/16 v2, 0x10

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-static {v2, v1}, Lcom/google/android/gms/internal/ads/zzbfa;->zzq(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_b
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zziu;->zzapj:Ljava/lang/Integer;

    if-eqz v1, :cond_c

    const/16 v2, 0x11

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-static {v2, v1}, Lcom/google/android/gms/internal/ads/zzbfa;->zzq(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_c
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zziu;->zzapk:Ljava/lang/Integer;

    if-eqz v1, :cond_d

    const/16 v2, 0x12

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-static {v2, v1}, Lcom/google/android/gms/internal/ads/zzbfa;->zzq(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_d
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zziu;->zzapl:Ljava/lang/Integer;

    if-eqz v1, :cond_e

    const/16 v2, 0x13

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-static {v2, v1}, Lcom/google/android/gms/internal/ads/zzbfa;->zzq(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_e
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zziu;->zzapm:Ljava/lang/Long;

    if-eqz v1, :cond_f

    const/16 v2, 0x14

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    invoke-static {v2, v3, v4}, Lcom/google/android/gms/internal/ads/zzbfa;->zze(IJ)I

    move-result v1

    add-int/2addr v0, v1

    :cond_f
    return v0
.end method
