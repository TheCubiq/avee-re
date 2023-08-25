.class public Lcom/daaw/xw0$q0$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/xw0$q0;->a(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:Lcom/daaw/xw0$q0;


# direct methods
.method public constructor <init>(Lcom/daaw/xw0$q0;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/xw0$q0$a;->p:Lcom/daaw/xw0$q0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    invoke-static {}, Lcom/daaw/ko0;->q()Lcom/daaw/ko0;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, v1, v1}, Lcom/daaw/ko0;->H(ZZ)V

    :cond_0
    return-void
.end method
