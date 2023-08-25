.class public final synthetic Lcom/daaw/sq4;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/br4;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/br4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/sq4;->p:Lcom/daaw/br4;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/sq4;->p:Lcom/daaw/br4;

    invoke-virtual {v0}, Lcom/daaw/br4;->zzd()V

    return-void
.end method
