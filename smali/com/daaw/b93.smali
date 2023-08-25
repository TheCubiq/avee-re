.class public final synthetic Lcom/daaw/b93;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/iz6;


# instance fields
.field public final synthetic p:Lcom/daaw/e93;

.field public final synthetic q:Lcom/daaw/y83;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/e93;Lcom/daaw/y83;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/b93;->p:Lcom/daaw/e93;

    iput-object p2, p0, Lcom/daaw/b93;->q:Lcom/daaw/y83;

    return-void
.end method


# virtual methods
.method public final zza()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/daaw/b93;->p:Lcom/daaw/e93;

    iget-object v1, p0, Lcom/daaw/b93;->q:Lcom/daaw/y83;

    invoke-virtual {v0, v1}, Lcom/daaw/e93;->c(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
