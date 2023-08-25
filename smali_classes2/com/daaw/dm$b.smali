.class public Lcom/daaw/dm$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/dm;->h(Lcom/daaw/zb1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:Lcom/daaw/zb1;

.field public final synthetic q:Lcom/daaw/dm;


# direct methods
.method public constructor <init>(Lcom/daaw/dm;Lcom/daaw/zb1;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/dm$b;->q:Lcom/daaw/dm;

    iput-object p2, p0, Lcom/daaw/dm$b;->p:Lcom/daaw/zb1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/dm$b;->q:Lcom/daaw/dm;

    iget-object v1, p0, Lcom/daaw/dm$b;->p:Lcom/daaw/zb1;

    invoke-static {v0, v1}, Lcom/daaw/dm;->a(Lcom/daaw/dm;Lcom/daaw/zb1;)Lcom/daaw/rj1;

    return-void
.end method
