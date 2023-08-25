.class public Lcom/daaw/ol0$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/pw1$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/ol0;-><init>(Lcom/daaw/az0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/az0;

.field public final synthetic b:Lcom/daaw/ol0;


# direct methods
.method public constructor <init>(Lcom/daaw/ol0;Lcom/daaw/az0;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/ol0$b;->b:Lcom/daaw/ol0;

    iput-object p2, p0, Lcom/daaw/ol0$b;->a:Lcom/daaw/az0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    invoke-static {}, Lcom/daaw/dx0;->e()Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/daaw/ol0$b;->b:Lcom/daaw/ol0;

    iget-object v1, p0, Lcom/daaw/ol0$b;->a:Lcom/daaw/az0;

    invoke-virtual {v1}, Lcom/daaw/az0;->a()Z

    move-result v1

    invoke-static {v0, v1}, Lcom/daaw/ol0;->d(Lcom/daaw/ol0;Z)Z

    return-void
.end method
