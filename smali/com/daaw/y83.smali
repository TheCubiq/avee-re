.class public abstract Lcom/daaw/y83;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:I

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/Object;Lcom/daaw/x83;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/daaw/y83;->a:I

    iput-object p2, p0, Lcom/daaw/y83;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/daaw/y83;->c:Ljava/lang/Object;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zza()Lcom/daaw/z83;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/daaw/z83;->d(Lcom/daaw/y83;)V

    return-void
.end method

.method public static f(ILjava/lang/String;F)Lcom/daaw/y83;
    .locals 1

    new-instance p0, Lcom/daaw/r83;

    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p2

    const/4 v0, 0x1

    invoke-direct {p0, v0, p1, p2}, Lcom/daaw/r83;-><init>(ILjava/lang/String;Ljava/lang/Float;)V

    return-object p0
.end method

.method public static g(ILjava/lang/String;I)Lcom/daaw/y83;
    .locals 1

    new-instance p0, Lcom/daaw/p83;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    const/4 v0, 0x1

    invoke-direct {p0, v0, p1, p2}, Lcom/daaw/p83;-><init>(ILjava/lang/String;Ljava/lang/Integer;)V

    return-object p0
.end method

.method public static h(ILjava/lang/String;J)Lcom/daaw/y83;
    .locals 0

    new-instance p0, Lcom/daaw/q83;

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    const/4 p3, 0x1

    invoke-direct {p0, p3, p1, p2}, Lcom/daaw/q83;-><init>(ILjava/lang/String;Ljava/lang/Long;)V

    return-object p0
.end method

.method public static i(ILjava/lang/String;Ljava/lang/Boolean;)Lcom/daaw/y83;
    .locals 1

    new-instance v0, Lcom/daaw/o83;

    invoke-direct {v0, p0, p1, p2}, Lcom/daaw/o83;-><init>(ILjava/lang/String;Ljava/lang/Boolean;)V

    return-object v0
.end method

.method public static j(ILjava/lang/String;Ljava/lang/String;)Lcom/daaw/y83;
    .locals 1

    new-instance p0, Lcom/daaw/s83;

    const/4 v0, 0x1

    invoke-direct {p0, v0, p1, p2}, Lcom/daaw/s83;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    return-object p0
.end method

.method public static k(ILjava/lang/String;)Lcom/daaw/y83;
    .locals 1

    const/4 p0, 0x1

    const-string p1, "gads:sdk_core_constants:experiment_id"

    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Lcom/daaw/y83;->j(ILjava/lang/String;Ljava/lang/String;)Lcom/daaw/y83;

    move-result-object p0

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zza()Lcom/daaw/z83;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/daaw/z83;->c(Lcom/daaw/y83;)V

    return-object p0
.end method


# virtual methods
.method public abstract a(Lorg/json/JSONObject;)Ljava/lang/Object;
.end method

.method public abstract b(Landroid/os/Bundle;)Ljava/lang/Object;
.end method

.method public abstract c(Landroid/content/SharedPreferences;)Ljava/lang/Object;
.end method

.method public abstract d(Landroid/content/SharedPreferences$Editor;Ljava/lang/Object;)V
.end method

.method public final e()I
    .locals 1

    iget v0, p0, Lcom/daaw/y83;->a:I

    return v0
.end method

.method public final l()Ljava/lang/Object;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final m()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/daaw/y83;->c:Ljava/lang/Object;

    return-object v0
.end method

.method public final n()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/y83;->b:Ljava/lang/String;

    return-object v0
.end method
