.class public final synthetic Lcom/daaw/hd6;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/ld6;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/ld6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/hd6;->p:Lcom/daaw/ld6;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/hd6;->p:Lcom/daaw/ld6;

    invoke-virtual {v0}, Lcom/daaw/ld6;->zzm()V

    return-void
.end method
