.class public Lcom/daaw/r41$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/r41;-><init>(Landroid/content/Context;Lcom/daaw/mj0;Lcom/daaw/u41;Lcom/daaw/v41;Lcom/daaw/ij;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:Lcom/daaw/mj0;

.field public final synthetic q:Lcom/daaw/r41;


# direct methods
.method public constructor <init>(Lcom/daaw/r41;Lcom/daaw/mj0;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/r41$a;->q:Lcom/daaw/r41;

    iput-object p2, p0, Lcom/daaw/r41$a;->p:Lcom/daaw/mj0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/r41$a;->p:Lcom/daaw/mj0;

    iget-object v1, p0, Lcom/daaw/r41$a;->q:Lcom/daaw/r41;

    invoke-interface {v0, v1}, Lcom/daaw/mj0;->a(Lcom/daaw/qj0;)V

    return-void
.end method
