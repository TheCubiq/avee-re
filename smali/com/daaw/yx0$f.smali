.class public Lcom/daaw/yx0$f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/vw1$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/yx0;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/vw1$a<",
        "Lcom/daaw/er0<",
        "Ljava/lang/String;",
        "Ljava/lang/String;",
        ">;>;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/yx0;


# direct methods
.method public constructor <init>(Lcom/daaw/yx0;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/yx0$f;->a:Lcom/daaw/yx0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/yx0$f;->b()Lcom/daaw/er0;

    move-result-object v0

    return-object v0
.end method

.method public b()Lcom/daaw/er0;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/er0<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lcom/daaw/dx0;->e()Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-static {}, Lcom/daaw/j5;->e()Lcom/daaw/j5;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/daaw/j5;->H(Landroid/content/Context;)Lcom/daaw/er0;

    move-result-object v0

    return-object v0
.end method
