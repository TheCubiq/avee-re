.class public Lcom/daaw/yq1$a$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/hl;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/yq1$a;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/hl<",
        "TT;",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/yq1$a;


# direct methods
.method public constructor <init>(Lcom/daaw/yq1$a;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/yq1$a$a;->a:Lcom/daaw/yq1$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lcom/daaw/rj1;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/daaw/yq1$a$a;->b(Lcom/daaw/rj1;)Ljava/lang/Void;

    move-result-object p1

    return-object p1
.end method

.method public b(Lcom/daaw/rj1;)Ljava/lang/Void;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/rj1<",
            "TT;>;)",
            "Ljava/lang/Void;"
        }
    .end annotation

    invoke-virtual {p1}, Lcom/daaw/rj1;->n()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/yq1$a$a;->a:Lcom/daaw/yq1$a;

    iget-object v0, v0, Lcom/daaw/yq1$a;->q:Lcom/daaw/tj1;

    invoke-virtual {p1}, Lcom/daaw/rj1;->k()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/daaw/tj1;->c(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/daaw/yq1$a$a;->a:Lcom/daaw/yq1$a;

    iget-object v0, v0, Lcom/daaw/yq1$a;->q:Lcom/daaw/tj1;

    invoke-virtual {p1}, Lcom/daaw/rj1;->j()Ljava/lang/Exception;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/daaw/tj1;->b(Ljava/lang/Exception;)V

    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method
