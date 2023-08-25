.class public Lcom/daaw/c60$m;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/qw1$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/c60;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/qw1$a<",
        "Landroid/content/Context;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/c60;


# direct methods
.method public constructor <init>(Lcom/daaw/c60;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/c60$m;->a:Lcom/daaw/c60;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/c60$m;->a:Lcom/daaw/c60;

    invoke-static {v0}, Lcom/daaw/c60;->f(Lcom/daaw/c60;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lcom/daaw/c60$m$a;

    invoke-direct {v1, p0, p1}, Lcom/daaw/c60$m$a;-><init>(Lcom/daaw/c60$m;Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public bridge synthetic b(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Landroid/content/Context;

    invoke-virtual {p0, p1}, Lcom/daaw/c60$m;->a(Landroid/content/Context;)V

    return-void
.end method
