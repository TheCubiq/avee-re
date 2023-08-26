.class final Lcom/google/android/gms/internal/ads/zzbat;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzbdl;


# instance fields
.field private tag:I

.field private final zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

.field private zzdqj:I

.field private zzdqk:I


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/ads/zzbaq;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqk:I

    const-string v0, "input"

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/ads/zzbbq;->zza(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/zzbaq;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    iput-object p0, p1, Lcom/google/android/gms/internal/ads/zzbaq;->zzdqa:Lcom/google/android/gms/internal/ads/zzbat;

    return-void
.end method

.method public static zza(Lcom/google/android/gms/internal/ads/zzbaq;)Lcom/google/android/gms/internal/ads/zzbat;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbaq;->zzdqa:Lcom/google/android/gms/internal/ads/zzbat;

    if-eqz v0, :cond_0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzbaq;->zzdqa:Lcom/google/android/gms/internal/ads/zzbat;

    return-object p0

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/ads/zzbat;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/zzbat;-><init>(Lcom/google/android/gms/internal/ads/zzbaq;)V

    return-object v0
.end method

.method private final zza(Lcom/google/android/gms/internal/ads/zzbes;Ljava/lang/Class;Lcom/google/android/gms/internal/ads/zzbbb;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ads/zzbes;",
            "Ljava/lang/Class<",
            "*>;",
            "Lcom/google/android/gms/internal/ads/zzbbb;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    sget-object v0, Lcom/google/android/gms/internal/ads/zzbau;->zzdql:[I

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbes;->ordinal()I

    move-result p1

    aget p1, v0, p1

    packed-switch p1, :pswitch_data_0

    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "unsupported field type."

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzbat;->zzabl()J

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1

    :pswitch_1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzbat;->zzabt()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_2
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzbat;->zzabr()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :pswitch_3
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzbat;->zzaby()J

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1

    :pswitch_4
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzbat;->zzabx()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_5
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzbat;->zzabw()J

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1

    :pswitch_6
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzbat;->zzabv()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_7
    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzbat;->zzbv(I)V

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzbdg;->zzaeo()Lcom/google/android/gms/internal/ads/zzbdg;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/zzbdg;->zze(Ljava/lang/Class;)Lcom/google/android/gms/internal/ads/zzbdm;

    move-result-object p1

    invoke-direct {p0, p1, p3}, Lcom/google/android/gms/internal/ads/zzbat;->zzc(Lcom/google/android/gms/internal/ads/zzbdm;Lcom/google/android/gms/internal/ads/zzbbb;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_8
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzbat;->zzabm()J

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1

    :pswitch_9
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzbat;->zzabn()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_a
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzbat;->readFloat()F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    return-object p1

    :pswitch_b
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzbat;->zzabo()J

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1

    :pswitch_c
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzbat;->zzabp()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_d
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzbat;->zzabu()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_e
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzbat;->readDouble()D

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    return-object p1

    :pswitch_f
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzbat;->zzabs()Lcom/google/android/gms/internal/ads/zzbah;

    move-result-object p1

    return-object p1

    :pswitch_10
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzbat;->zzabq()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private final zza(Ljava/util/List;Z)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;Z)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->tag:I

    and-int/lit8 v0, v0, 0x7

    const/4 v1, 0x2

    if-ne v0, v1, :cond_5

    instance-of v0, p1, Lcom/google/android/gms/internal/ads/zzbcd;

    if-eqz v0, :cond_2

    if-nez p2, :cond_2

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/ads/zzbcd;

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzbat;->zzabs()Lcom/google/android/gms/internal/ads/zzbah;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/zzbcd;->zzap(Lcom/google/android/gms/internal/ads/zzbah;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbaq;->zzaca()Z

    move-result p1

    if-eqz p1, :cond_1

    return-void

    :cond_1
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbaq;->zzabk()I

    move-result p1

    iget p2, p0, Lcom/google/android/gms/internal/ads/zzbat;->tag:I

    if-eq p1, p2, :cond_0

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqk:I

    return-void

    :cond_2
    if-eqz p2, :cond_3

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzbat;->zzabr()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_3
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzbat;->readString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbaq;->zzaca()Z

    move-result v0

    if-eqz v0, :cond_4

    return-void

    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbaq;->zzabk()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzbat;->tag:I

    if-eq v0, v1, :cond_2

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqk:I

    return-void

    :cond_5
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzbbu;->zzadq()Lcom/google/android/gms/internal/ads/zzbbv;

    move-result-object p1

    goto :goto_2

    :goto_1
    throw p1

    :goto_2
    goto :goto_1
.end method

.method private final zzbv(I)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->tag:I

    and-int/lit8 v0, v0, 0x7

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzbbu;->zzadq()Lcom/google/android/gms/internal/ads/zzbbv;

    move-result-object p1

    throw p1
.end method

.method private static zzbw(I)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    and-int/lit8 p0, p0, 0x7

    if-nez p0, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzbbu;->zzadr()Lcom/google/android/gms/internal/ads/zzbbu;

    move-result-object p0

    throw p0
.end method

.method private static zzbx(I)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    and-int/lit8 p0, p0, 0x3

    if-nez p0, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzbbu;->zzadr()Lcom/google/android/gms/internal/ads/zzbbu;

    move-result-object p0

    throw p0
.end method

.method private final zzby(I)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbaq;->zzacb()I

    move-result v0

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzbbu;->zzadl()Lcom/google/android/gms/internal/ads/zzbbu;

    move-result-object p1

    throw p1
.end method

.method private final zzc(Lcom/google/android/gms/internal/ads/zzbdm;Lcom/google/android/gms/internal/ads/zzbbb;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/android/gms/internal/ads/zzbdm<",
            "TT;>;",
            "Lcom/google/android/gms/internal/ads/zzbbb;",
            ")TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbaq;->zzabt()I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    iget v1, v1, Lcom/google/android/gms/internal/ads/zzbaq;->zzdpx:I

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    iget v2, v2, Lcom/google/android/gms/internal/ads/zzbaq;->zzdpy:I

    if-ge v1, v2, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzbaq;->zzbr(I)I

    move-result v0

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzbdm;->newInstance()Ljava/lang/Object;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    iget v3, v2, Lcom/google/android/gms/internal/ads/zzbaq;->zzdpx:I

    add-int/lit8 v3, v3, 0x1

    iput v3, v2, Lcom/google/android/gms/internal/ads/zzbaq;->zzdpx:I

    invoke-interface {p1, v1, p0, p2}, Lcom/google/android/gms/internal/ads/zzbdm;->zza(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/zzbdl;Lcom/google/android/gms/internal/ads/zzbbb;)V

    invoke-interface {p1, v1}, Lcom/google/android/gms/internal/ads/zzbdm;->zzo(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/zzbaq;->zzbp(I)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    iget p2, p1, Lcom/google/android/gms/internal/ads/zzbaq;->zzdpx:I

    add-int/lit8 p2, p2, -0x1

    iput p2, p1, Lcom/google/android/gms/internal/ads/zzbaq;->zzdpx:I

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/zzbaq;->zzbs(I)V

    return-object v1

    :cond_0
    new-instance p1, Lcom/google/android/gms/internal/ads/zzbbu;

    const-string p2, "Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit."

    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/ads/zzbbu;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final zzd(Lcom/google/android/gms/internal/ads/zzbdm;Lcom/google/android/gms/internal/ads/zzbbb;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/android/gms/internal/ads/zzbdm<",
            "TT;>;",
            "Lcom/google/android/gms/internal/ads/zzbbb;",
            ")TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqj:I

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzbat;->tag:I

    ushr-int/lit8 v1, v1, 0x3

    shl-int/lit8 v1, v1, 0x3

    or-int/lit8 v1, v1, 0x4

    iput v1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqj:I

    :try_start_0
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzbdm;->newInstance()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p1, v1, p0, p2}, Lcom/google/android/gms/internal/ads/zzbdm;->zza(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/zzbdl;Lcom/google/android/gms/internal/ads/zzbbb;)V

    invoke-interface {p1, v1}, Lcom/google/android/gms/internal/ads/zzbdm;->zzo(Ljava/lang/Object;)V

    iget p1, p0, Lcom/google/android/gms/internal/ads/zzbat;->tag:I

    iget p2, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqj:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne p1, p2, :cond_0

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqj:I

    return-object v1

    :cond_0
    :try_start_1
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzbbu;->zzadr()Lcom/google/android/gms/internal/ads/zzbbu;

    move-result-object p1

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p1

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqj:I

    throw p1
.end method


# virtual methods
.method public final getTag()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->tag:I

    return v0
.end method

.method public final readDouble()D
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzbat;->zzbv(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbaq;->readDouble()D

    move-result-wide v0

    return-wide v0
.end method

.method public final readFloat()F
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x5

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzbat;->zzbv(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbaq;->readFloat()F

    move-result v0

    return v0
.end method

.method public final readString()Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzbat;->zzbv(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbaq;->readString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final readStringList(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/ads/zzbat;->zza(Ljava/util/List;Z)V

    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/ads/zzbdm;Lcom/google/android/gms/internal/ads/zzbbb;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/android/gms/internal/ads/zzbdm<",
            "TT;>;",
            "Lcom/google/android/gms/internal/ads/zzbbb;",
            ")TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzbat;->zzbv(I)V

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/ads/zzbat;->zzc(Lcom/google/android/gms/internal/ads/zzbdm;Lcom/google/android/gms/internal/ads/zzbbb;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final zza(Ljava/util/List;Lcom/google/android/gms/internal/ads/zzbdm;Lcom/google/android/gms/internal/ads/zzbbb;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/List<",
            "TT;>;",
            "Lcom/google/android/gms/internal/ads/zzbdm<",
            "TT;>;",
            "Lcom/google/android/gms/internal/ads/zzbbb;",
            ")V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->tag:I

    and-int/lit8 v1, v0, 0x7

    const/4 v2, 0x2

    if-ne v1, v2, :cond_3

    :cond_0
    invoke-direct {p0, p2, p3}, Lcom/google/android/gms/internal/ads/zzbat;->zzc(Lcom/google/android/gms/internal/ads/zzbdm;Lcom/google/android/gms/internal/ads/zzbbb;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzbaq;->zzaca()Z

    move-result v1

    if-nez v1, :cond_2

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqk:I

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzbaq;->zzabk()I

    move-result v1

    if-eq v1, v0, :cond_0

    iput v1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqk:I

    :cond_2
    :goto_0
    return-void

    :cond_3
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzbbu;->zzadq()Lcom/google/android/gms/internal/ads/zzbbv;

    move-result-object p1

    goto :goto_2

    :goto_1
    throw p1

    :goto_2
    goto :goto_1
.end method

.method public final zza(Ljava/util/Map;Lcom/google/android/gms/internal/ads/zzbcn;Lcom/google/android/gms/internal/ads/zzbbb;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Map<",
            "TK;TV;>;",
            "Lcom/google/android/gms/internal/ads/zzbcn<",
            "TK;TV;>;",
            "Lcom/google/android/gms/internal/ads/zzbbb;",
            ")V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzbat;->zzbv(I)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzbaq;->zzabt()I

    move-result v1

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/zzbaq;->zzbr(I)I

    move-result v1

    iget-object v2, p2, Lcom/google/android/gms/internal/ads/zzbcn;->zzdvz:Ljava/lang/Object;

    iget-object v3, p2, Lcom/google/android/gms/internal/ads/zzbcn;->zzdwb:Ljava/lang/Object;

    :goto_0
    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzbat;->zzaci()I

    move-result v4

    const v5, 0x7fffffff

    if-eq v4, v5, :cond_4

    iget-object v5, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/zzbaq;->zzaca()Z

    move-result v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v5, :cond_4

    const/4 v5, 0x1

    const-string v6, "Unable to parse map entry."

    if-eq v4, v5, :cond_2

    if-eq v4, v0, :cond_1

    :try_start_1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzbat;->zzacj()Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_0

    :cond_0
    new-instance v4, Lcom/google/android/gms/internal/ads/zzbbu;

    invoke-direct {v4, v6}, Lcom/google/android/gms/internal/ads/zzbbu;-><init>(Ljava/lang/String;)V

    throw v4

    :cond_1
    iget-object v4, p2, Lcom/google/android/gms/internal/ads/zzbcn;->zzdwa:Lcom/google/android/gms/internal/ads/zzbes;

    iget-object v5, p2, Lcom/google/android/gms/internal/ads/zzbcn;->zzdwb:Ljava/lang/Object;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    invoke-direct {p0, v4, v5, p3}, Lcom/google/android/gms/internal/ads/zzbat;->zza(Lcom/google/android/gms/internal/ads/zzbes;Ljava/lang/Class;Lcom/google/android/gms/internal/ads/zzbbb;)Ljava/lang/Object;

    move-result-object v3

    goto :goto_0

    :cond_2
    iget-object v4, p2, Lcom/google/android/gms/internal/ads/zzbcn;->zzdvy:Lcom/google/android/gms/internal/ads/zzbes;

    const/4 v5, 0x0

    invoke-direct {p0, v4, v5, v5}, Lcom/google/android/gms/internal/ads/zzbat;->zza(Lcom/google/android/gms/internal/ads/zzbes;Ljava/lang/Class;Lcom/google/android/gms/internal/ads/zzbbb;)Ljava/lang/Object;

    move-result-object v2
    :try_end_1
    .catch Lcom/google/android/gms/internal/ads/zzbbv; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    :try_start_2
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzbat;->zzacj()Z

    move-result v4

    if-eqz v4, :cond_3

    goto :goto_0

    :cond_3
    new-instance p1, Lcom/google/android/gms/internal/ads/zzbbu;

    invoke-direct {p1, v6}, Lcom/google/android/gms/internal/ads/zzbbu;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    invoke-interface {p1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {p1, v1}, Lcom/google/android/gms/internal/ads/zzbaq;->zzbs(I)V

    return-void

    :catchall_0
    move-exception p1

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {p2, v1}, Lcom/google/android/gms/internal/ads/zzbaq;->zzbs(I)V

    goto :goto_2

    :goto_1
    throw p1

    :goto_2
    goto :goto_1
.end method

.method public final zzaa(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    instance-of v0, p1, Lcom/google/android/gms/internal/ads/zzbbp;

    const/4 v1, 0x2

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/ads/zzbbp;

    iget p1, p0, Lcom/google/android/gms/internal/ads/zzbat;->tag:I

    and-int/lit8 p1, p1, 0x7

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbaq;->zzabt()I

    move-result p1

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzbaq;->zzacb()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbaq;->zzabu()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzbbp;->zzco(I)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbaq;->zzacb()I

    move-result p1

    if-lt p1, v1, :cond_0

    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/ads/zzbat;->zzby(I)V

    return-void

    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzbbu;->zzadq()Lcom/google/android/gms/internal/ads/zzbbv;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbaq;->zzabu()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzbbp;->zzco(I)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbaq;->zzaca()Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    :cond_3
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbaq;->zzabk()I

    move-result p1

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzbat;->tag:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqk:I

    return-void

    :cond_4
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->tag:I

    and-int/lit8 v0, v0, 0x7

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbaq;->zzabt()I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzbaq;->zzacb()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbaq;->zzabu()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbaq;->zzacb()I

    move-result v0

    if-lt v0, v1, :cond_5

    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/ads/zzbat;->zzby(I)V

    return-void

    :cond_6
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzbbu;->zzadq()Lcom/google/android/gms/internal/ads/zzbbv;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbaq;->zzabu()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbaq;->zzaca()Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    :cond_8
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbaq;->zzabk()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzbat;->tag:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqk:I

    return-void
.end method

.method public final zzab(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    instance-of v0, p1, Lcom/google/android/gms/internal/ads/zzbbp;

    const/4 v1, 0x5

    const/4 v2, 0x2

    if-eqz v0, :cond_5

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/ads/zzbbp;

    iget p1, p0, Lcom/google/android/gms/internal/ads/zzbat;->tag:I

    and-int/lit8 p1, p1, 0x7

    if-eq p1, v2, :cond_3

    if-ne p1, v1, :cond_2

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbaq;->zzabv()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzbbp;->zzco(I)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbaq;->zzaca()Z

    move-result p1

    if-eqz p1, :cond_1

    return-void

    :cond_1
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbaq;->zzabk()I

    move-result p1

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzbat;->tag:I

    if-eq p1, v1, :cond_0

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqk:I

    return-void

    :cond_2
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzbbu;->zzadq()Lcom/google/android/gms/internal/ads/zzbbv;

    move-result-object p1

    throw p1

    :cond_3
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbaq;->zzabt()I

    move-result p1

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzbat;->zzbx(I)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzbaq;->zzacb()I

    move-result v1

    add-int v3, v1, p1

    :cond_4
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbaq;->zzabv()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzbbp;->zzco(I)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbaq;->zzacb()I

    move-result p1

    if-lt p1, v3, :cond_4

    return-void

    :cond_5
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->tag:I

    and-int/lit8 v0, v0, 0x7

    if-eq v0, v2, :cond_9

    if-ne v0, v1, :cond_8

    :cond_6
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbaq;->zzabv()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbaq;->zzaca()Z

    move-result v0

    if-eqz v0, :cond_7

    return-void

    :cond_7
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbaq;->zzabk()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzbat;->tag:I

    if-eq v0, v1, :cond_6

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqk:I

    return-void

    :cond_8
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzbbu;->zzadq()Lcom/google/android/gms/internal/ads/zzbbv;

    move-result-object p1

    throw p1

    :cond_9
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbaq;->zzabt()I

    move-result v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzbat;->zzbx(I)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzbaq;->zzacb()I

    move-result v1

    add-int/2addr v1, v0

    :cond_a
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbaq;->zzabv()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbaq;->zzacb()I

    move-result v0

    if-lt v0, v1, :cond_a

    return-void
.end method

.method public final zzabl()J
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzbat;->zzbv(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbaq;->zzabl()J

    move-result-wide v0

    return-wide v0
.end method

.method public final zzabm()J
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzbat;->zzbv(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbaq;->zzabm()J

    move-result-wide v0

    return-wide v0
.end method

.method public final zzabn()I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzbat;->zzbv(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbaq;->zzabn()I

    move-result v0

    return v0
.end method

.method public final zzabo()J
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzbat;->zzbv(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbaq;->zzabo()J

    move-result-wide v0

    return-wide v0
.end method

.method public final zzabp()I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x5

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzbat;->zzbv(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbaq;->zzabp()I

    move-result v0

    return v0
.end method

.method public final zzabq()Z
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzbat;->zzbv(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbaq;->zzabq()Z

    move-result v0

    return v0
.end method

.method public final zzabr()Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzbat;->zzbv(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbaq;->zzabr()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final zzabs()Lcom/google/android/gms/internal/ads/zzbah;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzbat;->zzbv(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbaq;->zzabs()Lcom/google/android/gms/internal/ads/zzbah;

    move-result-object v0

    return-object v0
.end method

.method public final zzabt()I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzbat;->zzbv(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbaq;->zzabt()I

    move-result v0

    return v0
.end method

.method public final zzabu()I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzbat;->zzbv(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbaq;->zzabu()I

    move-result v0

    return v0
.end method

.method public final zzabv()I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x5

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzbat;->zzbv(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbaq;->zzabv()I

    move-result v0

    return v0
.end method

.method public final zzabw()J
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzbat;->zzbv(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbaq;->zzabw()J

    move-result-wide v0

    return-wide v0
.end method

.method public final zzabx()I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzbat;->zzbv(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbaq;->zzabx()I

    move-result v0

    return v0
.end method

.method public final zzaby()J
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzbat;->zzbv(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbaq;->zzaby()J

    move-result-wide v0

    return-wide v0
.end method

.method public final zzac(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    instance-of v0, p1, Lcom/google/android/gms/internal/ads/zzbci;

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/ads/zzbci;

    iget p1, p0, Lcom/google/android/gms/internal/ads/zzbat;->tag:I

    and-int/lit8 p1, p1, 0x7

    if-eq p1, v2, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbaq;->zzabt()I

    move-result p1

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzbat;->zzbw(I)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzbaq;->zzacb()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbaq;->zzabw()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/internal/ads/zzbci;->zzw(J)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbaq;->zzacb()I

    move-result p1

    if-lt p1, v1, :cond_0

    return-void

    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzbbu;->zzadq()Lcom/google/android/gms/internal/ads/zzbbv;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbaq;->zzabw()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzbci;->zzw(J)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbaq;->zzaca()Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    :cond_3
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbaq;->zzabk()I

    move-result p1

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzbat;->tag:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqk:I

    return-void

    :cond_4
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->tag:I

    and-int/lit8 v0, v0, 0x7

    if-eq v0, v2, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbaq;->zzabt()I

    move-result v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzbat;->zzbw(I)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzbaq;->zzacb()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbaq;->zzabw()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbaq;->zzacb()I

    move-result v0

    if-lt v0, v1, :cond_5

    return-void

    :cond_6
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzbbu;->zzadq()Lcom/google/android/gms/internal/ads/zzbbv;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbaq;->zzabw()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbaq;->zzaca()Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    :cond_8
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbaq;->zzabk()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzbat;->tag:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqk:I

    return-void
.end method

.method public final zzaci()I
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqk:I

    if-eqz v0, :cond_0

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->tag:I

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqk:I

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbaq;->zzabk()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->tag:I

    :goto_0
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->tag:I

    if-eqz v0, :cond_2

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqj:I

    if-ne v0, v1, :cond_1

    goto :goto_1

    :cond_1
    ushr-int/lit8 v0, v0, 0x3

    return v0

    :cond_2
    :goto_1
    const v0, 0x7fffffff

    return v0
.end method

.method public final zzacj()Z
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbaq;->zzaca()Z

    move-result v0

    if-nez v0, :cond_1

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->tag:I

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqj:I

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzbaq;->zzbq(I)Z

    move-result v0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x0

    return v0
.end method

.method public final zzad(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    instance-of v0, p1, Lcom/google/android/gms/internal/ads/zzbbp;

    const/4 v1, 0x2

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/ads/zzbbp;

    iget p1, p0, Lcom/google/android/gms/internal/ads/zzbat;->tag:I

    and-int/lit8 p1, p1, 0x7

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbaq;->zzabt()I

    move-result p1

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzbaq;->zzacb()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbaq;->zzabx()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzbbp;->zzco(I)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbaq;->zzacb()I

    move-result p1

    if-lt p1, v1, :cond_0

    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/ads/zzbat;->zzby(I)V

    return-void

    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzbbu;->zzadq()Lcom/google/android/gms/internal/ads/zzbbv;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbaq;->zzabx()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzbbp;->zzco(I)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbaq;->zzaca()Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    :cond_3
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbaq;->zzabk()I

    move-result p1

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzbat;->tag:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqk:I

    return-void

    :cond_4
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->tag:I

    and-int/lit8 v0, v0, 0x7

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbaq;->zzabt()I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzbaq;->zzacb()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbaq;->zzabx()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbaq;->zzacb()I

    move-result v0

    if-lt v0, v1, :cond_5

    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/ads/zzbat;->zzby(I)V

    return-void

    :cond_6
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzbbu;->zzadq()Lcom/google/android/gms/internal/ads/zzbbv;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbaq;->zzabx()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbaq;->zzaca()Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    :cond_8
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbaq;->zzabk()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzbat;->tag:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqk:I

    return-void
.end method

.method public final zzae(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    instance-of v0, p1, Lcom/google/android/gms/internal/ads/zzbci;

    const/4 v1, 0x2

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/ads/zzbci;

    iget p1, p0, Lcom/google/android/gms/internal/ads/zzbat;->tag:I

    and-int/lit8 p1, p1, 0x7

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbaq;->zzabt()I

    move-result p1

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzbaq;->zzacb()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbaq;->zzaby()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/internal/ads/zzbci;->zzw(J)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbaq;->zzacb()I

    move-result p1

    if-lt p1, v1, :cond_0

    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/ads/zzbat;->zzby(I)V

    return-void

    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzbbu;->zzadq()Lcom/google/android/gms/internal/ads/zzbbv;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbaq;->zzaby()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzbci;->zzw(J)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbaq;->zzaca()Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    :cond_3
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbaq;->zzabk()I

    move-result p1

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzbat;->tag:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqk:I

    return-void

    :cond_4
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->tag:I

    and-int/lit8 v0, v0, 0x7

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbaq;->zzabt()I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzbaq;->zzacb()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbaq;->zzaby()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbaq;->zzacb()I

    move-result v0

    if-lt v0, v1, :cond_5

    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/ads/zzbat;->zzby(I)V

    return-void

    :cond_6
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzbbu;->zzadq()Lcom/google/android/gms/internal/ads/zzbbv;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbaq;->zzaby()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbaq;->zzaca()Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    :cond_8
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbaq;->zzabk()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzbat;->tag:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqk:I

    return-void
.end method

.method public final zzb(Lcom/google/android/gms/internal/ads/zzbdm;Lcom/google/android/gms/internal/ads/zzbbb;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/android/gms/internal/ads/zzbdm<",
            "TT;>;",
            "Lcom/google/android/gms/internal/ads/zzbbb;",
            ")TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x3

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzbat;->zzbv(I)V

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/ads/zzbat;->zzd(Lcom/google/android/gms/internal/ads/zzbdm;Lcom/google/android/gms/internal/ads/zzbbb;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final zzb(Ljava/util/List;Lcom/google/android/gms/internal/ads/zzbdm;Lcom/google/android/gms/internal/ads/zzbbb;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/List<",
            "TT;>;",
            "Lcom/google/android/gms/internal/ads/zzbdm<",
            "TT;>;",
            "Lcom/google/android/gms/internal/ads/zzbbb;",
            ")V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->tag:I

    and-int/lit8 v1, v0, 0x7

    const/4 v2, 0x3

    if-ne v1, v2, :cond_3

    :cond_0
    invoke-direct {p0, p2, p3}, Lcom/google/android/gms/internal/ads/zzbat;->zzd(Lcom/google/android/gms/internal/ads/zzbdm;Lcom/google/android/gms/internal/ads/zzbbb;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzbaq;->zzaca()Z

    move-result v1

    if-nez v1, :cond_2

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqk:I

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzbaq;->zzabk()I

    move-result v1

    if-eq v1, v0, :cond_0

    iput v1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqk:I

    :cond_2
    :goto_0
    return-void

    :cond_3
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzbbu;->zzadq()Lcom/google/android/gms/internal/ads/zzbbv;

    move-result-object p1

    goto :goto_2

    :goto_1
    throw p1

    :goto_2
    goto :goto_1
.end method

.method public final zzp(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    instance-of v0, p1, Lcom/google/android/gms/internal/ads/zzbay;

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/ads/zzbay;

    iget p1, p0, Lcom/google/android/gms/internal/ads/zzbat;->tag:I

    and-int/lit8 p1, p1, 0x7

    if-eq p1, v2, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbaq;->zzabt()I

    move-result p1

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzbat;->zzbw(I)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzbaq;->zzacb()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbaq;->readDouble()D

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/internal/ads/zzbay;->zzd(D)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbaq;->zzacb()I

    move-result p1

    if-lt p1, v1, :cond_0

    return-void

    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzbbu;->zzadq()Lcom/google/android/gms/internal/ads/zzbbv;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbaq;->readDouble()D

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzbay;->zzd(D)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbaq;->zzaca()Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    :cond_3
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbaq;->zzabk()I

    move-result p1

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzbat;->tag:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqk:I

    return-void

    :cond_4
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->tag:I

    and-int/lit8 v0, v0, 0x7

    if-eq v0, v2, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbaq;->zzabt()I

    move-result v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzbat;->zzbw(I)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzbaq;->zzacb()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbaq;->readDouble()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbaq;->zzacb()I

    move-result v0

    if-lt v0, v1, :cond_5

    return-void

    :cond_6
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzbbu;->zzadq()Lcom/google/android/gms/internal/ads/zzbbv;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbaq;->readDouble()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbaq;->zzaca()Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    :cond_8
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbaq;->zzabk()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzbat;->tag:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqk:I

    return-void
.end method

.method public final zzq(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Float;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    instance-of v0, p1, Lcom/google/android/gms/internal/ads/zzbbm;

    const/4 v1, 0x5

    const/4 v2, 0x2

    if-eqz v0, :cond_5

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/ads/zzbbm;

    iget p1, p0, Lcom/google/android/gms/internal/ads/zzbat;->tag:I

    and-int/lit8 p1, p1, 0x7

    if-eq p1, v2, :cond_3

    if-ne p1, v1, :cond_2

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbaq;->readFloat()F

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzbbm;->zzd(F)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbaq;->zzaca()Z

    move-result p1

    if-eqz p1, :cond_1

    return-void

    :cond_1
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbaq;->zzabk()I

    move-result p1

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzbat;->tag:I

    if-eq p1, v1, :cond_0

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqk:I

    return-void

    :cond_2
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzbbu;->zzadq()Lcom/google/android/gms/internal/ads/zzbbv;

    move-result-object p1

    throw p1

    :cond_3
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbaq;->zzabt()I

    move-result p1

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzbat;->zzbx(I)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzbaq;->zzacb()I

    move-result v1

    add-int v3, v1, p1

    :cond_4
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbaq;->readFloat()F

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzbbm;->zzd(F)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbaq;->zzacb()I

    move-result p1

    if-lt p1, v3, :cond_4

    return-void

    :cond_5
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->tag:I

    and-int/lit8 v0, v0, 0x7

    if-eq v0, v2, :cond_9

    if-ne v0, v1, :cond_8

    :cond_6
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbaq;->readFloat()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbaq;->zzaca()Z

    move-result v0

    if-eqz v0, :cond_7

    return-void

    :cond_7
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbaq;->zzabk()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzbat;->tag:I

    if-eq v0, v1, :cond_6

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqk:I

    return-void

    :cond_8
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzbbu;->zzadq()Lcom/google/android/gms/internal/ads/zzbbv;

    move-result-object p1

    throw p1

    :cond_9
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbaq;->zzabt()I

    move-result v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzbat;->zzbx(I)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzbaq;->zzacb()I

    move-result v1

    add-int/2addr v1, v0

    :cond_a
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbaq;->readFloat()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbaq;->zzacb()I

    move-result v0

    if-lt v0, v1, :cond_a

    return-void
.end method

.method public final zzr(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    instance-of v0, p1, Lcom/google/android/gms/internal/ads/zzbci;

    const/4 v1, 0x2

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/ads/zzbci;

    iget p1, p0, Lcom/google/android/gms/internal/ads/zzbat;->tag:I

    and-int/lit8 p1, p1, 0x7

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbaq;->zzabt()I

    move-result p1

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzbaq;->zzacb()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbaq;->zzabl()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/internal/ads/zzbci;->zzw(J)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbaq;->zzacb()I

    move-result p1

    if-lt p1, v1, :cond_0

    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/ads/zzbat;->zzby(I)V

    return-void

    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzbbu;->zzadq()Lcom/google/android/gms/internal/ads/zzbbv;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbaq;->zzabl()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzbci;->zzw(J)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbaq;->zzaca()Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    :cond_3
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbaq;->zzabk()I

    move-result p1

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzbat;->tag:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqk:I

    return-void

    :cond_4
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->tag:I

    and-int/lit8 v0, v0, 0x7

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbaq;->zzabt()I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzbaq;->zzacb()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbaq;->zzabl()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbaq;->zzacb()I

    move-result v0

    if-lt v0, v1, :cond_5

    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/ads/zzbat;->zzby(I)V

    return-void

    :cond_6
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzbbu;->zzadq()Lcom/google/android/gms/internal/ads/zzbbv;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbaq;->zzabl()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbaq;->zzaca()Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    :cond_8
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbaq;->zzabk()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzbat;->tag:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqk:I

    return-void
.end method

.method public final zzs(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    instance-of v0, p1, Lcom/google/android/gms/internal/ads/zzbci;

    const/4 v1, 0x2

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/ads/zzbci;

    iget p1, p0, Lcom/google/android/gms/internal/ads/zzbat;->tag:I

    and-int/lit8 p1, p1, 0x7

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbaq;->zzabt()I

    move-result p1

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzbaq;->zzacb()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbaq;->zzabm()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/internal/ads/zzbci;->zzw(J)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbaq;->zzacb()I

    move-result p1

    if-lt p1, v1, :cond_0

    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/ads/zzbat;->zzby(I)V

    return-void

    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzbbu;->zzadq()Lcom/google/android/gms/internal/ads/zzbbv;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbaq;->zzabm()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzbci;->zzw(J)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbaq;->zzaca()Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    :cond_3
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbaq;->zzabk()I

    move-result p1

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzbat;->tag:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqk:I

    return-void

    :cond_4
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->tag:I

    and-int/lit8 v0, v0, 0x7

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbaq;->zzabt()I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzbaq;->zzacb()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbaq;->zzabm()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbaq;->zzacb()I

    move-result v0

    if-lt v0, v1, :cond_5

    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/ads/zzbat;->zzby(I)V

    return-void

    :cond_6
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzbbu;->zzadq()Lcom/google/android/gms/internal/ads/zzbbv;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbaq;->zzabm()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbaq;->zzaca()Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    :cond_8
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbaq;->zzabk()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzbat;->tag:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqk:I

    return-void
.end method

.method public final zzt(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    instance-of v0, p1, Lcom/google/android/gms/internal/ads/zzbbp;

    const/4 v1, 0x2

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/ads/zzbbp;

    iget p1, p0, Lcom/google/android/gms/internal/ads/zzbat;->tag:I

    and-int/lit8 p1, p1, 0x7

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbaq;->zzabt()I

    move-result p1

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzbaq;->zzacb()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbaq;->zzabn()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzbbp;->zzco(I)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbaq;->zzacb()I

    move-result p1

    if-lt p1, v1, :cond_0

    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/ads/zzbat;->zzby(I)V

    return-void

    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzbbu;->zzadq()Lcom/google/android/gms/internal/ads/zzbbv;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbaq;->zzabn()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzbbp;->zzco(I)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbaq;->zzaca()Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    :cond_3
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbaq;->zzabk()I

    move-result p1

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzbat;->tag:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqk:I

    return-void

    :cond_4
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->tag:I

    and-int/lit8 v0, v0, 0x7

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbaq;->zzabt()I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzbaq;->zzacb()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbaq;->zzabn()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbaq;->zzacb()I

    move-result v0

    if-lt v0, v1, :cond_5

    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/ads/zzbat;->zzby(I)V

    return-void

    :cond_6
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzbbu;->zzadq()Lcom/google/android/gms/internal/ads/zzbbv;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbaq;->zzabn()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbaq;->zzaca()Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    :cond_8
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbaq;->zzabk()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzbat;->tag:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqk:I

    return-void
.end method

.method public final zzu(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    instance-of v0, p1, Lcom/google/android/gms/internal/ads/zzbci;

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/ads/zzbci;

    iget p1, p0, Lcom/google/android/gms/internal/ads/zzbat;->tag:I

    and-int/lit8 p1, p1, 0x7

    if-eq p1, v2, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbaq;->zzabt()I

    move-result p1

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzbat;->zzbw(I)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzbaq;->zzacb()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbaq;->zzabo()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/internal/ads/zzbci;->zzw(J)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbaq;->zzacb()I

    move-result p1

    if-lt p1, v1, :cond_0

    return-void

    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzbbu;->zzadq()Lcom/google/android/gms/internal/ads/zzbbv;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbaq;->zzabo()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzbci;->zzw(J)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbaq;->zzaca()Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    :cond_3
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbaq;->zzabk()I

    move-result p1

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzbat;->tag:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqk:I

    return-void

    :cond_4
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->tag:I

    and-int/lit8 v0, v0, 0x7

    if-eq v0, v2, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbaq;->zzabt()I

    move-result v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzbat;->zzbw(I)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzbaq;->zzacb()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbaq;->zzabo()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbaq;->zzacb()I

    move-result v0

    if-lt v0, v1, :cond_5

    return-void

    :cond_6
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzbbu;->zzadq()Lcom/google/android/gms/internal/ads/zzbbv;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbaq;->zzabo()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbaq;->zzaca()Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    :cond_8
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbaq;->zzabk()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzbat;->tag:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqk:I

    return-void
.end method

.method public final zzv(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    instance-of v0, p1, Lcom/google/android/gms/internal/ads/zzbbp;

    const/4 v1, 0x5

    const/4 v2, 0x2

    if-eqz v0, :cond_5

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/ads/zzbbp;

    iget p1, p0, Lcom/google/android/gms/internal/ads/zzbat;->tag:I

    and-int/lit8 p1, p1, 0x7

    if-eq p1, v2, :cond_3

    if-ne p1, v1, :cond_2

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbaq;->zzabp()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzbbp;->zzco(I)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbaq;->zzaca()Z

    move-result p1

    if-eqz p1, :cond_1

    return-void

    :cond_1
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbaq;->zzabk()I

    move-result p1

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzbat;->tag:I

    if-eq p1, v1, :cond_0

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqk:I

    return-void

    :cond_2
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzbbu;->zzadq()Lcom/google/android/gms/internal/ads/zzbbv;

    move-result-object p1

    throw p1

    :cond_3
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbaq;->zzabt()I

    move-result p1

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzbat;->zzbx(I)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzbaq;->zzacb()I

    move-result v1

    add-int v3, v1, p1

    :cond_4
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbaq;->zzabp()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzbbp;->zzco(I)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbaq;->zzacb()I

    move-result p1

    if-lt p1, v3, :cond_4

    return-void

    :cond_5
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->tag:I

    and-int/lit8 v0, v0, 0x7

    if-eq v0, v2, :cond_9

    if-ne v0, v1, :cond_8

    :cond_6
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbaq;->zzabp()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbaq;->zzaca()Z

    move-result v0

    if-eqz v0, :cond_7

    return-void

    :cond_7
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbaq;->zzabk()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzbat;->tag:I

    if-eq v0, v1, :cond_6

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqk:I

    return-void

    :cond_8
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzbbu;->zzadq()Lcom/google/android/gms/internal/ads/zzbbv;

    move-result-object p1

    throw p1

    :cond_9
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbaq;->zzabt()I

    move-result v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzbat;->zzbx(I)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzbaq;->zzacb()I

    move-result v1

    add-int/2addr v1, v0

    :cond_a
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbaq;->zzabp()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbaq;->zzacb()I

    move-result v0

    if-lt v0, v1, :cond_a

    return-void
.end method

.method public final zzw(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    instance-of v0, p1, Lcom/google/android/gms/internal/ads/zzbaf;

    const/4 v1, 0x2

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/ads/zzbaf;

    iget p1, p0, Lcom/google/android/gms/internal/ads/zzbat;->tag:I

    and-int/lit8 p1, p1, 0x7

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbaq;->zzabt()I

    move-result p1

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzbaq;->zzacb()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbaq;->zzabq()Z

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzbaf;->addBoolean(Z)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbaq;->zzacb()I

    move-result p1

    if-lt p1, v1, :cond_0

    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/ads/zzbat;->zzby(I)V

    return-void

    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzbbu;->zzadq()Lcom/google/android/gms/internal/ads/zzbbv;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbaq;->zzabq()Z

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzbaf;->addBoolean(Z)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbaq;->zzaca()Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    :cond_3
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbaq;->zzabk()I

    move-result p1

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzbat;->tag:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqk:I

    return-void

    :cond_4
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->tag:I

    and-int/lit8 v0, v0, 0x7

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbaq;->zzabt()I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzbaq;->zzacb()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbaq;->zzabq()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbaq;->zzacb()I

    move-result v0

    if-lt v0, v1, :cond_5

    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/ads/zzbat;->zzby(I)V

    return-void

    :cond_6
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzbbu;->zzadq()Lcom/google/android/gms/internal/ads/zzbbv;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbaq;->zzabq()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbaq;->zzaca()Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    :cond_8
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbaq;->zzabk()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzbat;->tag:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqk:I

    return-void
.end method

.method public final zzx(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/ads/zzbat;->zza(Ljava/util/List;Z)V

    return-void
.end method

.method public final zzy(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/google/android/gms/internal/ads/zzbah;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->tag:I

    and-int/lit8 v0, v0, 0x7

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzbat;->zzabs()Lcom/google/android/gms/internal/ads/zzbah;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbaq;->zzaca()Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbaq;->zzabk()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzbat;->tag:I

    if-eq v0, v1, :cond_0

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqk:I

    return-void

    :cond_2
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzbbu;->zzadq()Lcom/google/android/gms/internal/ads/zzbbv;

    move-result-object p1

    goto :goto_1

    :goto_0
    throw p1

    :goto_1
    goto :goto_0
.end method

.method public final zzz(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    instance-of v0, p1, Lcom/google/android/gms/internal/ads/zzbbp;

    const/4 v1, 0x2

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/ads/zzbbp;

    iget p1, p0, Lcom/google/android/gms/internal/ads/zzbat;->tag:I

    and-int/lit8 p1, p1, 0x7

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbaq;->zzabt()I

    move-result p1

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzbaq;->zzacb()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbaq;->zzabt()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzbbp;->zzco(I)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbaq;->zzacb()I

    move-result p1

    if-lt p1, v1, :cond_0

    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/ads/zzbat;->zzby(I)V

    return-void

    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzbbu;->zzadq()Lcom/google/android/gms/internal/ads/zzbbv;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbaq;->zzabt()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzbbp;->zzco(I)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbaq;->zzaca()Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    :cond_3
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbaq;->zzabk()I

    move-result p1

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzbat;->tag:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqk:I

    return-void

    :cond_4
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->tag:I

    and-int/lit8 v0, v0, 0x7

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbaq;->zzabt()I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzbaq;->zzacb()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbaq;->zzabt()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbaq;->zzacb()I

    move-result v0

    if-lt v0, v1, :cond_5

    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/ads/zzbat;->zzby(I)V

    return-void

    :cond_6
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzbbu;->zzadq()Lcom/google/android/gms/internal/ads/zzbbv;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbaq;->zzabt()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbaq;->zzaca()Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    :cond_8
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqi:Lcom/google/android/gms/internal/ads/zzbaq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbaq;->zzabk()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzbat;->tag:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzbat;->zzdqk:I

    return-void
.end method
