.class public final Lcom/daaw/lh3;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/mh3;


# instance fields
.field public final synthetic a:Lcom/daaw/e14;


# direct methods
.method public constructor <init>(Lcom/daaw/nh3;Lcom/daaw/e14;)V
    .locals 0

    iput-object p2, p0, Lcom/daaw/lh3;->a:Lcom/daaw/e14;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lorg/json/JSONObject;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/lh3;->a:Lcom/daaw/e14;

    invoke-virtual {v0, p1}, Lcom/daaw/e14;->b(Ljava/lang/Object;)Z

    return-void
.end method

.method public final zza(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/lh3;->a:Lcom/daaw/e14;

    new-instance v1, Lcom/daaw/ml3;

    invoke-direct {v1, p1}, Lcom/daaw/ml3;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/daaw/e14;->c(Ljava/lang/Throwable;)Z

    return-void
.end method
