.class public final synthetic Lcom/daaw/im3;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/g14;


# instance fields
.field public final synthetic a:Lcom/daaw/e14;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/e14;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/im3;->a:Lcom/daaw/e14;

    return-void
.end method


# virtual methods
.method public final zza()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/im3;->a:Lcom/daaw/e14;

    new-instance v1, Lcom/daaw/ml3;

    const-string v2, "Cannot get Javascript Engine"

    invoke-direct {v1, v2}, Lcom/daaw/ml3;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/daaw/e14;->c(Ljava/lang/Throwable;)Z

    return-void
.end method
