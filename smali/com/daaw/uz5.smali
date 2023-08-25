.class public final synthetic Lcom/daaw/uz5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/wz5;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/wz5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/uz5;->p:Lcom/daaw/wz5;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/uz5;->p:Lcom/daaw/wz5;

    iget-object v0, v0, Lcom/daaw/wz5;->e:Lcom/daaw/xz5;

    invoke-static {v0}, Lcom/daaw/xz5;->c(Lcom/daaw/xz5;)Lcom/daaw/nz5;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/nz5;->b()Lcom/daaw/fs4;

    move-result-object v0

    invoke-interface {v0}, Lcom/daaw/fs4;->zzn()V

    return-void
.end method
