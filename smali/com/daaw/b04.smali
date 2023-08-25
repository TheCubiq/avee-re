.class public final Lcom/daaw/b04;
.super Ljava/lang/Thread;
.source ""


# instance fields
.field public final synthetic p:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/daaw/d04;Ljava/lang/String;)V
    .locals 0

    iput-object p2, p0, Lcom/daaw/b04;->p:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    new-instance v0, Lcom/daaw/p04;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/daaw/p04;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/daaw/b04;->p:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/daaw/p04;->zza(Ljava/lang/String;)Z

    return-void
.end method
