.class public Lcom/daaw/qv1$g;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/vw1$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/qv1;-><init>(Lcom/daaw/pv1;Lcom/daaw/xw0;Lcom/daaw/vm0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/vw1$a<",
        "Lcom/daaw/f40;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/qv1;


# direct methods
.method public constructor <init>(Lcom/daaw/qv1;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/qv1$g;->a:Lcom/daaw/qv1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/qv1$g;->b()Lcom/daaw/f40;

    move-result-object v0

    return-object v0
.end method

.method public b()Lcom/daaw/f40;
    .locals 2

    invoke-static {}, Lcom/daaw/qv1;->h()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/qv1$g;->a:Lcom/daaw/qv1;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/daaw/qv1;->m(Lcom/daaw/qv1;Z)Z

    iget-object v0, p0, Lcom/daaw/qv1$g;->a:Lcom/daaw/qv1;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/daaw/qv1;->X(Lcom/daaw/wf1;)V

    return-object v1

    :cond_0
    iget-object v0, p0, Lcom/daaw/qv1$g;->a:Lcom/daaw/qv1;

    invoke-static {v0}, Lcom/daaw/qv1;->z(Lcom/daaw/qv1;)Lcom/daaw/f40;

    move-result-object v0

    return-object v0
.end method
