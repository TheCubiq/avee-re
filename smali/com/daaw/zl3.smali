.class public final Lcom/daaw/zl3;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/g14;


# instance fields
.field public final synthetic a:Lcom/daaw/e14;

.field public final synthetic b:Lcom/daaw/al3;


# direct methods
.method public constructor <init>(Lcom/daaw/bm3;Lcom/daaw/e14;Lcom/daaw/al3;)V
    .locals 0

    iput-object p2, p0, Lcom/daaw/zl3;->a:Lcom/daaw/e14;

    iput-object p3, p0, Lcom/daaw/zl3;->b:Lcom/daaw/al3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/zl3;->a:Lcom/daaw/e14;

    new-instance v1, Lcom/daaw/ml3;

    const-string v2, "Unable to obtain a JavascriptEngine."

    invoke-direct {v1, v2}, Lcom/daaw/ml3;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/daaw/e14;->c(Ljava/lang/Throwable;)Z

    iget-object v0, p0, Lcom/daaw/zl3;->b:Lcom/daaw/al3;

    invoke-virtual {v0}, Lcom/daaw/al3;->g()V

    return-void
.end method
