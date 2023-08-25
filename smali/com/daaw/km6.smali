.class public final synthetic Lcom/daaw/km6;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lcom/daaw/fm6;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/fm6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/km6;->a:Lcom/daaw/fm6;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/daaw/km6;->a:Lcom/daaw/fm6;

    invoke-interface {v0}, Lcom/daaw/fm6;->zza()V

    const/4 v0, 0x0

    return-object v0
.end method
