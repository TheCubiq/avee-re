.class public final Lcom/google/android/gms/internal/measurement/zzne;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-measurement-impl@@17.5.0"

# interfaces
.implements Lcom/google/android/gms/internal/measurement/zzeb;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/measurement/zzeb<",
        "Lcom/google/android/gms/internal/measurement/zznd;",
        ">;"
    }
.end annotation


# static fields
.field private static zza:Lcom/google/android/gms/internal/measurement/zzne;


# instance fields
.field private final zzb:Lcom/google/android/gms/internal/measurement/zzeb;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/measurement/zzeb<",
            "Lcom/google/android/gms/internal/measurement/zznd;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 11
    new-instance v0, Lcom/google/android/gms/internal/measurement/zzne;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/zzne;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/measurement/zzne;->zza:Lcom/google/android/gms/internal/measurement/zzne;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 6
    new-instance v0, Lcom/google/android/gms/internal/measurement/zzng;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/zzng;-><init>()V

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/zzea;->zza(Ljava/lang/Object;)Lcom/google/android/gms/internal/measurement/zzeb;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/measurement/zzne;-><init>(Lcom/google/android/gms/internal/measurement/zzeb;)V

    return-void
.end method

.method private constructor <init>(Lcom/google/android/gms/internal/measurement/zzeb;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/measurement/zzeb<",
            "Lcom/google/android/gms/internal/measurement/zznd;",
            ">;)V"
        }
    .end annotation

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    invoke-static {p1}, Lcom/google/android/gms/internal/measurement/zzea;->zza(Lcom/google/android/gms/internal/measurement/zzeb;)Lcom/google/android/gms/internal/measurement/zzeb;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzne;->zzb:Lcom/google/android/gms/internal/measurement/zzeb;

    return-void
.end method

.method public static zzb()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/measurement/zzne;->zza:Lcom/google/android/gms/internal/measurement/zzne;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzne;->zza()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/zznd;

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/zznd;->zza()Z

    move-result v0

    return v0
.end method

.method public static zzc()Z
    .locals 1

    .line 2
    sget-object v0, Lcom/google/android/gms/internal/measurement/zzne;->zza:Lcom/google/android/gms/internal/measurement/zzne;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzne;->zza()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/zznd;

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/zznd;->zzb()Z

    move-result v0

    return v0
.end method


# virtual methods
.method public final synthetic zza()Ljava/lang/Object;
    .locals 1

    .line 9
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzne;->zzb:Lcom/google/android/gms/internal/measurement/zzeb;

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/zzeb;->zza()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/zznd;

    return-object v0
.end method
