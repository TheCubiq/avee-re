.class public final synthetic Lcom/daaw/ee4;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/ie4;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/ie4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/ee4;->p:Lcom/daaw/ie4;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/ee4;->p:Lcom/daaw/ie4;

    invoke-virtual {v0}, Lcom/daaw/ie4;->zzb()V

    return-void
.end method
