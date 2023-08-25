.class public final synthetic Lcom/daaw/gl3;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/hl3;

.field public final synthetic q:Lcom/daaw/bk3;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/hl3;Lcom/daaw/bk3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/gl3;->p:Lcom/daaw/hl3;

    iput-object p2, p0, Lcom/daaw/gl3;->q:Lcom/daaw/bk3;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/gl3;->q:Lcom/daaw/bk3;

    sget-object v1, Lcom/daaw/yg3;->o:Lcom/daaw/nh3;

    const-string v2, "/result"

    invoke-interface {v0, v2, v1}, Lcom/daaw/kl3;->d0(Ljava/lang/String;Lcom/daaw/zg3;)V

    invoke-interface {v0}, Lcom/daaw/bk3;->zzc()V

    return-void
.end method
