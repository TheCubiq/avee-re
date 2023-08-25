.class public final synthetic Lcom/daaw/m65;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/o84;


# instance fields
.field public final synthetic p:Lcom/daaw/d14;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/d14;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/m65;->p:Lcom/daaw/d14;

    return-void
.end method


# virtual methods
.method public final zza(Z)V
    .locals 3

    iget-object v0, p0, Lcom/daaw/m65;->p:Lcom/daaw/d14;

    if-eqz p1, :cond_0

    invoke-virtual {v0}, Lcom/daaw/d14;->g()V

    return-void

    :cond_0
    new-instance p1, Lcom/daaw/yu5;

    const/4 v1, 0x1

    const-string v2, "Image Web View failed to load."

    invoke-direct {p1, v1, v2}, Lcom/daaw/yu5;-><init>(ILjava/lang/String;)V

    invoke-virtual {v0, p1}, Lcom/daaw/e14;->c(Ljava/lang/Throwable;)Z

    return-void
.end method
