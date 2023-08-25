.class public final synthetic Lcom/daaw/qd5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/rd5;

.field public final synthetic q:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/rd5;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/qd5;->p:Lcom/daaw/rd5;

    iput-object p2, p0, Lcom/daaw/qd5;->q:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/qd5;->p:Lcom/daaw/rd5;

    iget-object v1, p0, Lcom/daaw/qd5;->q:Ljava/lang/String;

    iget-object v0, v0, Lcom/daaw/rd5;->d:Lcom/daaw/p04;

    invoke-virtual {v0, v1}, Lcom/daaw/p04;->zza(Ljava/lang/String;)Z

    return-void
.end method
