.class public Lcom/daaw/hs$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/hs;->a(Lcom/daaw/qy1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:Lcom/daaw/qy1;

.field public final synthetic q:Lcom/daaw/hs;


# direct methods
.method public constructor <init>(Lcom/daaw/hs;Lcom/daaw/qy1;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/hs$a;->q:Lcom/daaw/hs;

    iput-object p2, p0, Lcom/daaw/hs$a;->p:Lcom/daaw/qy1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    invoke-static {}, Lcom/daaw/ll0;->c()Lcom/daaw/ll0;

    move-result-object v0

    sget-object v1, Lcom/daaw/hs;->d:Ljava/lang/String;

    const/4 v2, 0x1

    new-array v3, v2, [Ljava/lang/Object;

    iget-object v4, p0, Lcom/daaw/hs$a;->p:Lcom/daaw/qy1;

    iget-object v4, v4, Lcom/daaw/qy1;->a:Ljava/lang/String;

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const-string v4, "Scheduling work %s"

    invoke-static {v4, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    new-array v4, v5, [Ljava/lang/Throwable;

    invoke-virtual {v0, v1, v3, v4}, Lcom/daaw/ll0;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    iget-object v0, p0, Lcom/daaw/hs$a;->q:Lcom/daaw/hs;

    iget-object v0, v0, Lcom/daaw/hs;->a:Lcom/daaw/h80;

    new-array v1, v2, [Lcom/daaw/qy1;

    iget-object v2, p0, Lcom/daaw/hs$a;->p:Lcom/daaw/qy1;

    aput-object v2, v1, v5

    invoke-virtual {v0, v1}, Lcom/daaw/h80;->e([Lcom/daaw/qy1;)V

    return-void
.end method
