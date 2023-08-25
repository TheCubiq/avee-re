.class public final synthetic Lcom/daaw/qk3;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/bk3;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/bk3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/qk3;->p:Lcom/daaw/bk3;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/qk3;->p:Lcom/daaw/bk3;

    invoke-interface {v0}, Lcom/daaw/bk3;->zzc()V

    return-void
.end method
