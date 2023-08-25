.class public final Lcom/daaw/q85;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lcom/daaw/jq4;

.field public final b:Lcom/daaw/vr4;

.field public final c:Lcom/daaw/ls4;

.field public final d:Lcom/daaw/xs4;

.field public final e:Lcom/daaw/uv4;

.field public final f:Lcom/daaw/th6;

.field public final g:Lcom/daaw/wh6;


# direct methods
.method public constructor <init>(Lcom/daaw/jq4;Lcom/daaw/vr4;Lcom/daaw/ls4;Lcom/daaw/xs4;Lcom/daaw/uv4;Lcom/daaw/th6;Lcom/daaw/wh6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/q85;->a:Lcom/daaw/jq4;

    iput-object p2, p0, Lcom/daaw/q85;->b:Lcom/daaw/vr4;

    iput-object p3, p0, Lcom/daaw/q85;->c:Lcom/daaw/ls4;

    iput-object p4, p0, Lcom/daaw/q85;->d:Lcom/daaw/xs4;

    iput-object p5, p0, Lcom/daaw/q85;->e:Lcom/daaw/uv4;

    iput-object p6, p0, Lcom/daaw/q85;->f:Lcom/daaw/th6;

    iput-object p7, p0, Lcom/daaw/q85;->g:Lcom/daaw/wh6;

    return-void
.end method


# virtual methods
.method public final a(Lcom/daaw/u85;)V
    .locals 7

    invoke-static {p1}, Lcom/daaw/u85;->b(Lcom/daaw/u85;)Lcom/daaw/m85;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/q85;->a:Lcom/daaw/jq4;

    iget-object v2, p0, Lcom/daaw/q85;->c:Lcom/daaw/ls4;

    iget-object v3, p0, Lcom/daaw/q85;->d:Lcom/daaw/xs4;

    iget-object v4, p0, Lcom/daaw/q85;->e:Lcom/daaw/uv4;

    iget-object v5, p0, Lcom/daaw/q85;->b:Lcom/daaw/vr4;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v6, Lcom/daaw/n85;

    invoke-direct {v6, v5}, Lcom/daaw/n85;-><init>(Lcom/daaw/vr4;)V

    move-object v5, v6

    invoke-static/range {v0 .. v5}, Lcom/daaw/m85;->b(Lcom/daaw/m85;Lcom/google/android/gms/ads/internal/client/zza;Lcom/daaw/mf3;Lcom/google/android/gms/ads/internal/overlay/zzo;Lcom/daaw/of3;Lcom/google/android/gms/ads/internal/overlay/zzz;)V

    iget-object v0, p0, Lcom/daaw/q85;->f:Lcom/daaw/th6;

    iget-object v1, p0, Lcom/daaw/q85;->g:Lcom/daaw/wh6;

    invoke-virtual {p1, v0, v1}, Lcom/daaw/u85;->e(Lcom/daaw/th6;Lcom/daaw/wh6;)V

    return-void
.end method
