.class public final synthetic Lcom/daaw/a04;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/c04;


# instance fields
.field public final synthetic a:Lcom/daaw/d04;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/d04;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/a04;->a:Lcom/daaw/d04;

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/String;)Z
    .locals 2

    iget-object v0, p0, Lcom/daaw/a04;->a:Lcom/daaw/d04;

    new-instance v1, Lcom/daaw/b04;

    invoke-direct {v1, v0, p1}, Lcom/daaw/b04;-><init>(Lcom/daaw/d04;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    const/4 p1, 0x1

    return p1
.end method
