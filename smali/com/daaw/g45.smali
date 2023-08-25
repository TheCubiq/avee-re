.class public final synthetic Lcom/daaw/g45;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/h45;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/h45;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/g45;->p:Lcom/daaw/h45;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/g45;->p:Lcom/daaw/h45;

    invoke-virtual {v0}, Lcom/daaw/h45;->zzs()V

    return-void
.end method
