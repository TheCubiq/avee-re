.class public Lcom/daaw/xw0$e$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/xw0$e;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:Lcom/daaw/xw0$e;


# direct methods
.method public constructor <init>(Lcom/daaw/xw0$e;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/xw0$e$a;->p:Lcom/daaw/xw0$e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    invoke-static {}, Lcom/daaw/l01;->c()Lcom/daaw/l01;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/daaw/l01;->o()I

    move-result v1

    const/4 v2, 0x1

    if-nez v1, :cond_0

    invoke-virtual {v0, v2, v2}, Lcom/daaw/l01;->T(IZ)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/daaw/l01;->T(IZ)V

    :cond_1
    :goto_0
    return-void
.end method
