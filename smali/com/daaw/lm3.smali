.class public final Lcom/daaw/lm3;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/mh3;


# instance fields
.field public final a:Lcom/daaw/e14;

.field public final synthetic b:Lcom/daaw/mm3;


# direct methods
.method public constructor <init>(Lcom/daaw/mm3;Lcom/daaw/e14;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/lm3;->b:Lcom/daaw/mm3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/daaw/lm3;->a:Lcom/daaw/e14;

    return-void
.end method


# virtual methods
.method public final a(Lorg/json/JSONObject;)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lcom/daaw/lm3;->a:Lcom/daaw/e14;

    invoke-virtual {v0, p1}, Lcom/daaw/e14;->b(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    iget-object v0, p0, Lcom/daaw/lm3;->a:Lcom/daaw/e14;

    invoke-virtual {v0, p1}, Lcom/daaw/e14;->c(Ljava/lang/Throwable;)Z

    :catch_1
    return-void
.end method

.method public final zza(Ljava/lang/String;)V
    .locals 2

    if-nez p1, :cond_0

    :try_start_0
    iget-object p1, p0, Lcom/daaw/lm3;->a:Lcom/daaw/e14;

    new-instance v0, Lcom/daaw/ml3;

    invoke-direct {v0}, Lcom/daaw/ml3;-><init>()V

    invoke-virtual {p1, v0}, Lcom/daaw/e14;->c(Ljava/lang/Throwable;)Z

    return-void

    :cond_0
    iget-object v0, p0, Lcom/daaw/lm3;->a:Lcom/daaw/e14;

    new-instance v1, Lcom/daaw/ml3;

    invoke-direct {v1, p1}, Lcom/daaw/ml3;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/daaw/e14;->c(Ljava/lang/Throwable;)Z
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method
