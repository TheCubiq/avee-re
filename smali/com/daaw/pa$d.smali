.class public Lcom/daaw/pa$d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/pa$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/pa;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "d"
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/pa;


# direct methods
.method public constructor <init>(Lcom/daaw/pa;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/pa$d;->a:Lcom/daaw/pa;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/common/ConnectionResult;)V
    .locals 2

    invoke-virtual {p1}, Lcom/google/android/gms/common/ConnectionResult;->u()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Lcom/daaw/pa$d;->a:Lcom/daaw/pa;

    const/4 v0, 0x0

    invoke-virtual {p1}, Lcom/daaw/pa;->j()Ljava/util/Set;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/daaw/pa;->getRemoteService(Lcom/google/android/gms/common/internal/b;Ljava/util/Set;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/daaw/pa$d;->a:Lcom/daaw/pa;

    invoke-static {v0}, Lcom/daaw/pa;->v(Lcom/daaw/pa;)Lcom/daaw/pa$b;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/daaw/pa$d;->a:Lcom/daaw/pa;

    invoke-static {v0}, Lcom/daaw/pa;->v(Lcom/daaw/pa;)Lcom/daaw/pa$b;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/daaw/pa$b;->I(Lcom/google/android/gms/common/ConnectionResult;)V

    :cond_1
    return-void
.end method
