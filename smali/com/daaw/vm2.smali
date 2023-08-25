.class public final Lcom/daaw/vm2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/wm2;


# direct methods
.method public constructor <init>(Lcom/daaw/wm2;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/vm2;->p:Lcom/daaw/wm2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/vm2;->p:Lcom/daaw/wm2;

    iget-object v0, v0, Lcom/daaw/wm2;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/daaw/g93;->c(Landroid/content/Context;)V

    return-void
.end method
