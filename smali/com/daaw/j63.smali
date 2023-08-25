.class public final Lcom/daaw/j63;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/uf2;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Lcom/daaw/bb3;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/ads/internal/util/zzbo;Ljava/lang/String;Lcom/daaw/bb3;)V
    .locals 0

    iput-object p2, p0, Lcom/daaw/j63;->a:Ljava/lang/String;

    iput-object p3, p0, Lcom/daaw/j63;->b:Lcom/daaw/bb3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/daaw/zf2;)V
    .locals 3

    iget-object v0, p0, Lcom/daaw/j63;->a:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Failed to load URL: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\n"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/k04;->zzj(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/daaw/j63;->b:Lcom/daaw/bb3;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/daaw/bb3;->zza(Ljava/lang/Object;)V

    return-void
.end method
