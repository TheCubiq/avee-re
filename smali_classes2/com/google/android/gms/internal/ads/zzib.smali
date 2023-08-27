.class public final Lcom/google/android/gms/internal/ads/zzib;
.super Lcom/google/android/gms/internal/ads/zzbfc;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/ads/zzbfc<",
        "Lcom/google/android/gms/internal/ads/zzib;",
        ">;"
    }
.end annotation


# instance fields
.field public zzalt:Ljava/lang/Integer;

.field private zzalu:Ljava/lang/Integer;

.field private zzalv:Lcom/google/android/gms/internal/ads/zzid;

.field public zzalw:Lcom/google/android/gms/internal/ads/zzie;

.field private zzalx:[Lcom/google/android/gms/internal/ads/zzic;

.field private zzaly:Lcom/google/android/gms/internal/ads/zzif;

.field private zzalz:Lcom/google/android/gms/internal/ads/zzio;

.field private zzama:Lcom/google/android/gms/internal/ads/zzin;

.field private zzamb:Lcom/google/android/gms/internal/ads/zzik;

.field private zzamc:Lcom/google/android/gms/internal/ads/zzil;

.field private zzamd:[Lcom/google/android/gms/internal/ads/zziu;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzbfc;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzib;->zzalt:Ljava/lang/Integer;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzib;->zzalu:Ljava/lang/Integer;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzib;->zzalv:Lcom/google/android/gms/internal/ads/zzid;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzib;->zzalw:Lcom/google/android/gms/internal/ads/zzie;

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzic;->zzhr()[Lcom/google/android/gms/internal/ads/zzic;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/zzib;->zzalx:[Lcom/google/android/gms/internal/ads/zzic;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzib;->zzaly:Lcom/google/android/gms/internal/ads/zzif;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzib;->zzalz:Lcom/google/android/gms/internal/ads/zzio;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzib;->zzama:Lcom/google/android/gms/internal/ads/zzin;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzib;->zzamb:Lcom/google/android/gms/internal/ads/zzik;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzib;->zzamc:Lcom/google/android/gms/internal/ads/zzil;

    invoke-static {}, Lcom/google/android/gms/internal/ads/zziu;->zzhu()[Lcom/google/android/gms/internal/ads/zziu;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/zzib;->zzamd:[Lcom/google/android/gms/internal/ads/zziu;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzib;->zzebk:Lcom/google/android/gms/internal/ads/zzbfe;

    const/4 v0, -0x1

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzib;->zzebt:I

    return-void
.end method

.method private final zze(Lcom/google/android/gms/internal/ads/zzbez;)Lcom/google/android/gms/internal/ads/zzib;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    :cond_0
    :goto_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbez;->zzabk()I

    move-result v0

    const/4 v1, 0x0

    sparse-switch v0, :sswitch_data_0

    invoke-super {p0, p1, v0}, Lcom/google/android/gms/internal/ads/zzbfc;->zza(Lcom/google/android/gms/internal/ads/zzbez;I)Z

    move-result v0

    if-nez v0, :cond_0

    return-object p0

    :sswitch_0
    const/16 v0, 0x8a

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/ads/zzbfl;->zzb(Lcom/google/android/gms/internal/ads/zzbez;I)I

    move-result v0

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzib;->zzamd:[Lcom/google/android/gms/internal/ads/zziu;

    if-nez v2, :cond_1

    const/4 v2, 0x0

    goto :goto_1

    :cond_1
    array-length v2, v2

    :goto_1
    add-int/2addr v0, v2

    new-array v3, v0, [Lcom/google/android/gms/internal/ads/zziu;

    if-eqz v2, :cond_2

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzib;->zzamd:[Lcom/google/android/gms/internal/ads/zziu;

    invoke-static {v4, v1, v3, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_2
    :goto_2
    add-int/lit8 v1, v0, -0x1

    if-ge v2, v1, :cond_3

    new-instance v1, Lcom/google/android/gms/internal/ads/zziu;

    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/zziu;-><init>()V

    aput-object v1, v3, v2

    aget-object v1, v3, v2

    invoke-virtual {p1, v1}, Lcom/google/android/gms/internal/ads/zzbez;->zza(Lcom/google/android/gms/internal/ads/zzbfi;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbez;->zzabk()I

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_3
    new-instance v0, Lcom/google/android/gms/internal/ads/zziu;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zziu;-><init>()V

    aput-object v0, v3, v2

    aget-object v0, v3, v2

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/zzbez;->zza(Lcom/google/android/gms/internal/ads/zzbfi;)V

    iput-object v3, p0, Lcom/google/android/gms/internal/ads/zzib;->zzamd:[Lcom/google/android/gms/internal/ads/zziu;

    goto :goto_0

    :sswitch_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzib;->zzamc:Lcom/google/android/gms/internal/ads/zzil;

    if-nez v0, :cond_4

    new-instance v0, Lcom/google/android/gms/internal/ads/zzil;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzil;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzib;->zzamc:Lcom/google/android/gms/internal/ads/zzil;

    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzib;->zzamc:Lcom/google/android/gms/internal/ads/zzil;

    goto/16 :goto_5

    :sswitch_2
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzib;->zzamb:Lcom/google/android/gms/internal/ads/zzik;

    if-nez v0, :cond_5

    new-instance v0, Lcom/google/android/gms/internal/ads/zzik;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzik;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzib;->zzamb:Lcom/google/android/gms/internal/ads/zzik;

    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzib;->zzamb:Lcom/google/android/gms/internal/ads/zzik;

    goto/16 :goto_5

    :sswitch_3
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzib;->zzama:Lcom/google/android/gms/internal/ads/zzin;

    if-nez v0, :cond_6

    new-instance v0, Lcom/google/android/gms/internal/ads/zzin;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzin;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzib;->zzama:Lcom/google/android/gms/internal/ads/zzin;

    :cond_6
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzib;->zzama:Lcom/google/android/gms/internal/ads/zzin;

    goto/16 :goto_5

    :sswitch_4
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzib;->zzalz:Lcom/google/android/gms/internal/ads/zzio;

    if-nez v0, :cond_7

    new-instance v0, Lcom/google/android/gms/internal/ads/zzio;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzio;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzib;->zzalz:Lcom/google/android/gms/internal/ads/zzio;

    :cond_7
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzib;->zzalz:Lcom/google/android/gms/internal/ads/zzio;

    goto :goto_5

    :sswitch_5
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzib;->zzaly:Lcom/google/android/gms/internal/ads/zzif;

    if-nez v0, :cond_8

    new-instance v0, Lcom/google/android/gms/internal/ads/zzif;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzif;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzib;->zzaly:Lcom/google/android/gms/internal/ads/zzif;

    :cond_8
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzib;->zzaly:Lcom/google/android/gms/internal/ads/zzif;

    goto :goto_5

    :sswitch_6
    const/16 v0, 0x5a

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/ads/zzbfl;->zzb(Lcom/google/android/gms/internal/ads/zzbez;I)I

    move-result v0

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzib;->zzalx:[Lcom/google/android/gms/internal/ads/zzic;

    if-nez v2, :cond_9

    const/4 v2, 0x0

    goto :goto_3

    :cond_9
    array-length v2, v2

    :goto_3
    add-int/2addr v0, v2

    new-array v3, v0, [Lcom/google/android/gms/internal/ads/zzic;

    if-eqz v2, :cond_a

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzib;->zzalx:[Lcom/google/android/gms/internal/ads/zzic;

    invoke-static {v4, v1, v3, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_a
    :goto_4
    add-int/lit8 v1, v0, -0x1

    if-ge v2, v1, :cond_b

    new-instance v1, Lcom/google/android/gms/internal/ads/zzic;

    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/zzic;-><init>()V

    aput-object v1, v3, v2

    aget-object v1, v3, v2

    invoke-virtual {p1, v1}, Lcom/google/android/gms/internal/ads/zzbez;->zza(Lcom/google/android/gms/internal/ads/zzbfi;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbez;->zzabk()I

    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_b
    new-instance v0, Lcom/google/android/gms/internal/ads/zzic;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzic;-><init>()V

    aput-object v0, v3, v2

    aget-object v0, v3, v2

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/zzbez;->zza(Lcom/google/android/gms/internal/ads/zzbfi;)V

    iput-object v3, p0, Lcom/google/android/gms/internal/ads/zzib;->zzalx:[Lcom/google/android/gms/internal/ads/zzic;

    goto/16 :goto_0

    :sswitch_7
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzib;->zzalw:Lcom/google/android/gms/internal/ads/zzie;

    if-nez v0, :cond_c

    new-instance v0, Lcom/google/android/gms/internal/ads/zzie;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzie;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzib;->zzalw:Lcom/google/android/gms/internal/ads/zzie;

    :cond_c
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzib;->zzalw:Lcom/google/android/gms/internal/ads/zzie;

    goto :goto_5

    :sswitch_8
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzib;->zzalv:Lcom/google/android/gms/internal/ads/zzid;

    if-nez v0, :cond_d

    new-instance v0, Lcom/google/android/gms/internal/ads/zzid;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzid;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzib;->zzalv:Lcom/google/android/gms/internal/ads/zzid;

    :cond_d
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzib;->zzalv:Lcom/google/android/gms/internal/ads/zzid;

    :goto_5
    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/zzbez;->zza(Lcom/google/android/gms/internal/ads/zzbfi;)V

    goto/16 :goto_0

    :sswitch_9
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbez;->getPosition()I

    move-result v1

    :try_start_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbez;->zzacc()I

    move-result v2

    invoke-static {v2}, Lcom/google/android/gms/internal/ads/zzia;->zzd(I)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iput-object v2, p0, Lcom/google/android/gms/internal/ads/zzib;->zzalu:Ljava/lang/Integer;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_0

    :sswitch_a
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbez;->getPosition()I

    move-result v1

    :try_start_1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbez;->zzacc()I

    move-result v2

    if-ltz v2, :cond_e

    const/16 v3, 0x9

    if-gt v2, v3, :cond_e

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iput-object v2, p0, Lcom/google/android/gms/internal/ads/zzib;->zzalt:Ljava/lang/Integer;

    goto/16 :goto_0

    :cond_e
    new-instance v3, Ljava/lang/IllegalArgumentException;

    const/16 v4, 0x2b

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " is not a valid enum AdInitiater"

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v3, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v3
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    invoke-virtual {p1, v1}, Lcom/google/android/gms/internal/ads/zzbez;->zzdc(I)V

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/ads/zzbfc;->zza(Lcom/google/android/gms/internal/ads/zzbez;I)Z

    goto/16 :goto_0

    :sswitch_b
    return-object p0

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_b
        0x38 -> :sswitch_a
        0x40 -> :sswitch_9
        0x4a -> :sswitch_8
        0x52 -> :sswitch_7
        0x5a -> :sswitch_6
        0x62 -> :sswitch_5
        0x6a -> :sswitch_4
        0x72 -> :sswitch_3
        0x7a -> :sswitch_2
        0x82 -> :sswitch_1
        0x8a -> :sswitch_0
    .end sparse-switch
.end method


# virtual methods
.method public final synthetic zza(Lcom/google/android/gms/internal/ads/zzbez;)Lcom/google/android/gms/internal/ads/zzbfi;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzib;->zze(Lcom/google/android/gms/internal/ads/zzbez;)Lcom/google/android/gms/internal/ads/zzib;

    move-result-object p1

    return-object p1
.end method

.method public final zza(Lcom/google/android/gms/internal/ads/zzbfa;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzib;->zzalt:Ljava/lang/Integer;

    if-eqz v0, :cond_0

    const/4 v1, 0x7

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/internal/ads/zzbfa;->zzm(II)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzib;->zzalu:Ljava/lang/Integer;

    if-eqz v0, :cond_1

    const/16 v1, 0x8

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/internal/ads/zzbfa;->zzm(II)V

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzib;->zzalv:Lcom/google/android/gms/internal/ads/zzid;

    if-eqz v0, :cond_2

    const/16 v1, 0x9

    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/internal/ads/zzbfa;->zza(ILcom/google/android/gms/internal/ads/zzbfi;)V

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzib;->zzalw:Lcom/google/android/gms/internal/ads/zzie;

    if-eqz v0, :cond_3

    const/16 v1, 0xa

    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/internal/ads/zzbfa;->zza(ILcom/google/android/gms/internal/ads/zzbfi;)V

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzib;->zzalx:[Lcom/google/android/gms/internal/ads/zzic;

    const/4 v1, 0x0

    if-eqz v0, :cond_5

    array-length v0, v0

    if-lez v0, :cond_5

    const/4 v0, 0x0

    :goto_0
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzib;->zzalx:[Lcom/google/android/gms/internal/ads/zzic;

    array-length v3, v2

    if-ge v0, v3, :cond_5

    aget-object v2, v2, v0

    if-eqz v2, :cond_4

    const/16 v3, 0xb

    invoke-virtual {p1, v3, v2}, Lcom/google/android/gms/internal/ads/zzbfa;->zza(ILcom/google/android/gms/internal/ads/zzbfi;)V

    :cond_4
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzib;->zzaly:Lcom/google/android/gms/internal/ads/zzif;

    if-eqz v0, :cond_6

    const/16 v2, 0xc

    invoke-virtual {p1, v2, v0}, Lcom/google/android/gms/internal/ads/zzbfa;->zza(ILcom/google/android/gms/internal/ads/zzbfi;)V

    :cond_6
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzib;->zzalz:Lcom/google/android/gms/internal/ads/zzio;

    if-eqz v0, :cond_7

    const/16 v2, 0xd

    invoke-virtual {p1, v2, v0}, Lcom/google/android/gms/internal/ads/zzbfa;->zza(ILcom/google/android/gms/internal/ads/zzbfi;)V

    :cond_7
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzib;->zzama:Lcom/google/android/gms/internal/ads/zzin;

    if-eqz v0, :cond_8

    const/16 v2, 0xe

    invoke-virtual {p1, v2, v0}, Lcom/google/android/gms/internal/ads/zzbfa;->zza(ILcom/google/android/gms/internal/ads/zzbfi;)V

    :cond_8
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzib;->zzamb:Lcom/google/android/gms/internal/ads/zzik;

    if-eqz v0, :cond_9

    const/16 v2, 0xf

    invoke-virtual {p1, v2, v0}, Lcom/google/android/gms/internal/ads/zzbfa;->zza(ILcom/google/android/gms/internal/ads/zzbfi;)V

    :cond_9
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzib;->zzamc:Lcom/google/android/gms/internal/ads/zzil;

    if-eqz v0, :cond_a

    const/16 v2, 0x10

    invoke-virtual {p1, v2, v0}, Lcom/google/android/gms/internal/ads/zzbfa;->zza(ILcom/google/android/gms/internal/ads/zzbfi;)V

    :cond_a
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzib;->zzamd:[Lcom/google/android/gms/internal/ads/zziu;

    if-eqz v0, :cond_c

    array-length v0, v0

    if-lez v0, :cond_c

    :goto_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzib;->zzamd:[Lcom/google/android/gms/internal/ads/zziu;

    array-length v2, v0

    if-ge v1, v2, :cond_c

    aget-object v0, v0, v1

    if-eqz v0, :cond_b

    const/16 v2, 0x11

    invoke-virtual {p1, v2, v0}, Lcom/google/android/gms/internal/ads/zzbfa;->zza(ILcom/google/android/gms/internal/ads/zzbfi;)V

    :cond_b
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_c
    invoke-super {p0, p1}, Lcom/google/android/gms/internal/ads/zzbfc;->zza(Lcom/google/android/gms/internal/ads/zzbfa;)V

    return-void
.end method

.method protected final zzr()I
    .locals 5

    invoke-super {p0}, Lcom/google/android/gms/internal/ads/zzbfc;->zzr()I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzib;->zzalt:Ljava/lang/Integer;

    if-eqz v1, :cond_0

    const/4 v2, 0x7

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-static {v2, v1}, Lcom/google/android/gms/internal/ads/zzbfa;->zzq(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzib;->zzalu:Ljava/lang/Integer;

    if-eqz v1, :cond_1

    const/16 v2, 0x8

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-static {v2, v1}, Lcom/google/android/gms/internal/ads/zzbfa;->zzq(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_1
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzib;->zzalv:Lcom/google/android/gms/internal/ads/zzid;

    if-eqz v1, :cond_2

    const/16 v2, 0x9

    invoke-static {v2, v1}, Lcom/google/android/gms/internal/ads/zzbfa;->zzb(ILcom/google/android/gms/internal/ads/zzbfi;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_2
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzib;->zzalw:Lcom/google/android/gms/internal/ads/zzie;

    if-eqz v1, :cond_3

    const/16 v2, 0xa

    invoke-static {v2, v1}, Lcom/google/android/gms/internal/ads/zzbfa;->zzb(ILcom/google/android/gms/internal/ads/zzbfi;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_3
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzib;->zzalx:[Lcom/google/android/gms/internal/ads/zzic;

    const/4 v2, 0x0

    if-eqz v1, :cond_5

    array-length v1, v1

    if-lez v1, :cond_5

    const/4 v1, 0x0

    :goto_0
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzib;->zzalx:[Lcom/google/android/gms/internal/ads/zzic;

    array-length v4, v3

    if-ge v1, v4, :cond_5

    aget-object v3, v3, v1

    if-eqz v3, :cond_4

    const/16 v4, 0xb

    invoke-static {v4, v3}, Lcom/google/android/gms/internal/ads/zzbfa;->zzb(ILcom/google/android/gms/internal/ads/zzbfi;)I

    move-result v3

    add-int/2addr v0, v3

    :cond_4
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_5
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzib;->zzaly:Lcom/google/android/gms/internal/ads/zzif;

    if-eqz v1, :cond_6

    const/16 v3, 0xc

    invoke-static {v3, v1}, Lcom/google/android/gms/internal/ads/zzbfa;->zzb(ILcom/google/android/gms/internal/ads/zzbfi;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_6
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzib;->zzalz:Lcom/google/android/gms/internal/ads/zzio;

    if-eqz v1, :cond_7

    const/16 v3, 0xd

    invoke-static {v3, v1}, Lcom/google/android/gms/internal/ads/zzbfa;->zzb(ILcom/google/android/gms/internal/ads/zzbfi;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_7
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzib;->zzama:Lcom/google/android/gms/internal/ads/zzin;

    if-eqz v1, :cond_8

    const/16 v3, 0xe

    invoke-static {v3, v1}, Lcom/google/android/gms/internal/ads/zzbfa;->zzb(ILcom/google/android/gms/internal/ads/zzbfi;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_8
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzib;->zzamb:Lcom/google/android/gms/internal/ads/zzik;

    if-eqz v1, :cond_9

    const/16 v3, 0xf

    invoke-static {v3, v1}, Lcom/google/android/gms/internal/ads/zzbfa;->zzb(ILcom/google/android/gms/internal/ads/zzbfi;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_9
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzib;->zzamc:Lcom/google/android/gms/internal/ads/zzil;

    if-eqz v1, :cond_a

    const/16 v3, 0x10

    invoke-static {v3, v1}, Lcom/google/android/gms/internal/ads/zzbfa;->zzb(ILcom/google/android/gms/internal/ads/zzbfi;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_a
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzib;->zzamd:[Lcom/google/android/gms/internal/ads/zziu;

    if-eqz v1, :cond_c

    array-length v1, v1

    if-lez v1, :cond_c

    :goto_1
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzib;->zzamd:[Lcom/google/android/gms/internal/ads/zziu;

    array-length v3, v1

    if-ge v2, v3, :cond_c

    aget-object v1, v1, v2

    if-eqz v1, :cond_b

    const/16 v3, 0x11

    invoke-static {v3, v1}, Lcom/google/android/gms/internal/ads/zzbfa;->zzb(ILcom/google/android/gms/internal/ads/zzbfi;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_b
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_c
    return v0
.end method
