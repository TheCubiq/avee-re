.class final Lcom/google/android/gms/internal/ads/zzbcj;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzbdn;


# static fields
.field private static final zzdvw:Lcom/google/android/gms/internal/ads/zzbct;


# instance fields
.field private final zzdvv:Lcom/google/android/gms/internal/ads/zzbct;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/zzbck;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzbck;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzbcj;->zzdvw:Lcom/google/android/gms/internal/ads/zzbct;

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    new-instance v0, Lcom/google/android/gms/internal/ads/zzbcl;

    const/4 v1, 0x2

    new-array v1, v1, [Lcom/google/android/gms/internal/ads/zzbct;

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzbbn;->zzadc()Lcom/google/android/gms/internal/ads/zzbbn;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzbcj;->zzaea()Lcom/google/android/gms/internal/ads/zzbct;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzbcl;-><init>([Lcom/google/android/gms/internal/ads/zzbct;)V

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzbcj;-><init>(Lcom/google/android/gms/internal/ads/zzbct;)V

    return-void
.end method

.method private constructor <init>(Lcom/google/android/gms/internal/ads/zzbct;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "messageInfoFactory"

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/ads/zzbbq;->zza(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/zzbct;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzbcj;->zzdvv:Lcom/google/android/gms/internal/ads/zzbct;

    return-void
.end method

.method private static zza(Lcom/google/android/gms/internal/ads/zzbcs;)Z
    .locals 1

    invoke-interface {p0}, Lcom/google/android/gms/internal/ads/zzbcs;->zzaeh()I

    move-result p0

    sget v0, Lcom/google/android/gms/internal/ads/zzbbo$zze;->zzdui:I

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method private static zzaea()Lcom/google/android/gms/internal/ads/zzbct;
    .locals 4

    :try_start_0
    const-string v0, "com.google.protobuf.DescriptorMessageInfoFactory"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const-string v1, "getInstance"

    const/4 v2, 0x0

    new-array v3, v2, [Ljava/lang/Class;

    invoke-virtual {v0, v1, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    const/4 v1, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/zzbct;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbcj;->zzdvw:Lcom/google/android/gms/internal/ads/zzbct;

    return-object v0
.end method


# virtual methods
.method public final zzd(Ljava/lang/Class;)Lcom/google/android/gms/internal/ads/zzbdm;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)",
            "Lcom/google/android/gms/internal/ads/zzbdm<",
            "TT;>;"
        }
    .end annotation

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzbdo;->zzf(Ljava/lang/Class;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbcj;->zzdvv:Lcom/google/android/gms/internal/ads/zzbct;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/zzbct;->zzb(Ljava/lang/Class;)Lcom/google/android/gms/internal/ads/zzbcs;

    move-result-object v2

    invoke-interface {v2}, Lcom/google/android/gms/internal/ads/zzbcs;->zzaei()Z

    move-result v0

    if-eqz v0, :cond_1

    const-class v0, Lcom/google/android/gms/internal/ads/zzbbo;

    invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzbdo;->zzafp()Lcom/google/android/gms/internal/ads/zzbee;

    move-result-object p1

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzbbf;->zzact()Lcom/google/android/gms/internal/ads/zzbbd;

    move-result-object v0

    invoke-interface {v2}, Lcom/google/android/gms/internal/ads/zzbcs;->zzaej()Lcom/google/android/gms/internal/ads/zzbcu;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/ads/zzbda;->zza(Lcom/google/android/gms/internal/ads/zzbee;Lcom/google/android/gms/internal/ads/zzbbd;Lcom/google/android/gms/internal/ads/zzbcu;)Lcom/google/android/gms/internal/ads/zzbda;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzbdo;->zzafn()Lcom/google/android/gms/internal/ads/zzbee;

    move-result-object p1

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzbbf;->zzacu()Lcom/google/android/gms/internal/ads/zzbbd;

    move-result-object v0

    invoke-interface {v2}, Lcom/google/android/gms/internal/ads/zzbcs;->zzaej()Lcom/google/android/gms/internal/ads/zzbcu;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/ads/zzbda;->zza(Lcom/google/android/gms/internal/ads/zzbee;Lcom/google/android/gms/internal/ads/zzbbd;Lcom/google/android/gms/internal/ads/zzbcu;)Lcom/google/android/gms/internal/ads/zzbda;

    move-result-object p1

    return-object p1

    :cond_1
    const-class v0, Lcom/google/android/gms/internal/ads/zzbbo;

    invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {v2}, Lcom/google/android/gms/internal/ads/zzbcj;->zza(Lcom/google/android/gms/internal/ads/zzbcs;)Z

    move-result v0

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzbde;->zzaem()Lcom/google/android/gms/internal/ads/zzbdc;

    move-result-object v3

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzbce;->zzadz()Lcom/google/android/gms/internal/ads/zzbce;

    move-result-object v4

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzbdo;->zzafp()Lcom/google/android/gms/internal/ads/zzbee;

    move-result-object v5

    if-eqz v0, :cond_2

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzbbf;->zzact()Lcom/google/android/gms/internal/ads/zzbbd;

    move-result-object v6

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzbcr;->zzaef()Lcom/google/android/gms/internal/ads/zzbcp;

    move-result-object v7

    move-object v1, p1

    invoke-static/range {v1 .. v7}, Lcom/google/android/gms/internal/ads/zzbcy;->zza(Ljava/lang/Class;Lcom/google/android/gms/internal/ads/zzbcs;Lcom/google/android/gms/internal/ads/zzbdc;Lcom/google/android/gms/internal/ads/zzbce;Lcom/google/android/gms/internal/ads/zzbee;Lcom/google/android/gms/internal/ads/zzbbd;Lcom/google/android/gms/internal/ads/zzbcp;)Lcom/google/android/gms/internal/ads/zzbcy;

    move-result-object p1

    return-object p1

    :cond_2
    const/4 v6, 0x0

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzbcr;->zzaef()Lcom/google/android/gms/internal/ads/zzbcp;

    move-result-object v7

    move-object v1, p1

    invoke-static/range {v1 .. v7}, Lcom/google/android/gms/internal/ads/zzbcy;->zza(Ljava/lang/Class;Lcom/google/android/gms/internal/ads/zzbcs;Lcom/google/android/gms/internal/ads/zzbdc;Lcom/google/android/gms/internal/ads/zzbce;Lcom/google/android/gms/internal/ads/zzbee;Lcom/google/android/gms/internal/ads/zzbbd;Lcom/google/android/gms/internal/ads/zzbcp;)Lcom/google/android/gms/internal/ads/zzbcy;

    move-result-object p1

    return-object p1

    :cond_3
    invoke-static {v2}, Lcom/google/android/gms/internal/ads/zzbcj;->zza(Lcom/google/android/gms/internal/ads/zzbcs;)Z

    move-result v0

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzbde;->zzael()Lcom/google/android/gms/internal/ads/zzbdc;

    move-result-object v3

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzbce;->zzady()Lcom/google/android/gms/internal/ads/zzbce;

    move-result-object v4

    if-eqz v0, :cond_4

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzbdo;->zzafn()Lcom/google/android/gms/internal/ads/zzbee;

    move-result-object v5

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzbbf;->zzacu()Lcom/google/android/gms/internal/ads/zzbbd;

    move-result-object v6

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzbcr;->zzaee()Lcom/google/android/gms/internal/ads/zzbcp;

    move-result-object v7

    move-object v1, p1

    invoke-static/range {v1 .. v7}, Lcom/google/android/gms/internal/ads/zzbcy;->zza(Ljava/lang/Class;Lcom/google/android/gms/internal/ads/zzbcs;Lcom/google/android/gms/internal/ads/zzbdc;Lcom/google/android/gms/internal/ads/zzbce;Lcom/google/android/gms/internal/ads/zzbee;Lcom/google/android/gms/internal/ads/zzbbd;Lcom/google/android/gms/internal/ads/zzbcp;)Lcom/google/android/gms/internal/ads/zzbcy;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzbdo;->zzafo()Lcom/google/android/gms/internal/ads/zzbee;

    move-result-object v5

    const/4 v6, 0x0

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzbcr;->zzaee()Lcom/google/android/gms/internal/ads/zzbcp;

    move-result-object v7

    move-object v1, p1

    invoke-static/range {v1 .. v7}, Lcom/google/android/gms/internal/ads/zzbcy;->zza(Ljava/lang/Class;Lcom/google/android/gms/internal/ads/zzbcs;Lcom/google/android/gms/internal/ads/zzbdc;Lcom/google/android/gms/internal/ads/zzbce;Lcom/google/android/gms/internal/ads/zzbee;Lcom/google/android/gms/internal/ads/zzbbd;Lcom/google/android/gms/internal/ads/zzbcp;)Lcom/google/android/gms/internal/ads/zzbcy;

    move-result-object p1

    return-object p1
.end method
