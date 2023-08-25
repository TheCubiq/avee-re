.class public Lcom/google/android/datatransport/cct/CctBackendFactory;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/aa;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public create(Lcom/daaw/en;)Lcom/daaw/rn1;
    .locals 3

    new-instance v0, Lcom/daaw/ie;

    invoke-virtual {p1}, Lcom/daaw/en;->b()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p1}, Lcom/daaw/en;->e()Lcom/daaw/cg;

    move-result-object v2

    invoke-virtual {p1}, Lcom/daaw/en;->d()Lcom/daaw/cg;

    move-result-object p1

    invoke-direct {v0, v1, v2, p1}, Lcom/daaw/ie;-><init>(Landroid/content/Context;Lcom/daaw/cg;Lcom/daaw/cg;)V

    return-object v0
.end method
