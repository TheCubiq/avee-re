.class public final Lcom/daaw/h02;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/pa$e;


# instance fields
.field public final synthetic a:Lcom/daaw/i02;


# direct methods
.method public constructor <init>(Lcom/daaw/i02;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/h02;->a:Lcom/daaw/i02;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/h02;->a:Lcom/daaw/i02;

    iget-object v0, v0, Lcom/daaw/i02;->B:Lcom/daaw/z70;

    invoke-static {v0}, Lcom/daaw/z70;->r(Lcom/daaw/z70;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lcom/daaw/g02;

    invoke-direct {v1, p0}, Lcom/daaw/g02;-><init>(Lcom/daaw/h02;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
