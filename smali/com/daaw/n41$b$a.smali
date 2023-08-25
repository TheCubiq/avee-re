.class public Lcom/daaw/n41$b$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/n41$b;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:Lcom/daaw/uj;

.field public final synthetic q:Ljava/lang/Object;

.field public final synthetic r:Lcom/daaw/n41$b;


# direct methods
.method public constructor <init>(Lcom/daaw/n41$b;Lcom/daaw/uj;Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/n41$b$a;->r:Lcom/daaw/n41$b;

    iput-object p2, p0, Lcom/daaw/n41$b$a;->p:Lcom/daaw/uj;

    iput-object p3, p0, Lcom/daaw/n41$b$a;->q:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/n41$b$a;->p:Lcom/daaw/uj;

    iget-object v1, p0, Lcom/daaw/n41$b$a;->q:Ljava/lang/Object;

    invoke-interface {v0, v1}, Lcom/daaw/uj;->a(Ljava/lang/Object;)V

    return-void
.end method
