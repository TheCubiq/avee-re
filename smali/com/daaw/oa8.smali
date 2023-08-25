.class public final synthetic Lcom/daaw/oa8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/wa8;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/wa8;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/oa8;->p:Lcom/daaw/wa8;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/oa8;->p:Lcom/daaw/wa8;

    invoke-static {v0}, Lcom/daaw/wa8;->d(Lcom/daaw/wa8;)V

    return-void
.end method
