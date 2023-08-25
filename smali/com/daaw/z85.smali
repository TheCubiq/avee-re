.class public final Lcom/daaw/z85;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lcom/daaw/jq4;

.field public final b:Lcom/daaw/vr4;

.field public final c:Lcom/daaw/ls4;

.field public final d:Lcom/daaw/xs4;

.field public final e:Lcom/daaw/uv4;

.field public final f:Lcom/daaw/ty4;


# direct methods
.method public constructor <init>(Lcom/daaw/jq4;Lcom/daaw/vr4;Lcom/daaw/ls4;Lcom/daaw/xs4;Lcom/daaw/uv4;Lcom/daaw/ty4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/z85;->a:Lcom/daaw/jq4;

    iput-object p2, p0, Lcom/daaw/z85;->b:Lcom/daaw/vr4;

    iput-object p3, p0, Lcom/daaw/z85;->c:Lcom/daaw/ls4;

    iput-object p4, p0, Lcom/daaw/z85;->d:Lcom/daaw/xs4;

    iput-object p5, p0, Lcom/daaw/z85;->e:Lcom/daaw/uv4;

    iput-object p6, p0, Lcom/daaw/z85;->f:Lcom/daaw/ty4;

    return-void
.end method


# virtual methods
.method public final a(Lcom/daaw/a95;)V
    .locals 7

    invoke-static {p1}, Lcom/daaw/a95;->a(Lcom/daaw/a95;)Lcom/daaw/x85;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/z85;->a:Lcom/daaw/jq4;

    iget-object v2, p0, Lcom/daaw/z85;->c:Lcom/daaw/ls4;

    iget-object v3, p0, Lcom/daaw/z85;->d:Lcom/daaw/xs4;

    iget-object v4, p0, Lcom/daaw/z85;->e:Lcom/daaw/uv4;

    iget-object p1, p0, Lcom/daaw/z85;->b:Lcom/daaw/vr4;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v5, Lcom/daaw/y85;

    invoke-direct {v5, p1}, Lcom/daaw/y85;-><init>(Lcom/daaw/vr4;)V

    iget-object v6, p0, Lcom/daaw/z85;->f:Lcom/daaw/ty4;

    invoke-static/range {v0 .. v6}, Lcom/daaw/x85;->b(Lcom/daaw/x85;Lcom/google/android/gms/ads/internal/client/zza;Lcom/daaw/mf3;Lcom/google/android/gms/ads/internal/overlay/zzo;Lcom/daaw/of3;Lcom/google/android/gms/ads/internal/overlay/zzz;Lcom/daaw/vy4;)V

    return-void
.end method
