.class public final synthetic Lcom/daaw/do8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/iz6;


# instance fields
.field public final synthetic p:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/daaw/do8;->p:I

    return-void
.end method


# virtual methods
.method public final zza()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lcom/daaw/do8;->p:I

    invoke-static {v0}, Lcom/daaw/eo8;->b(I)Landroid/os/HandlerThread;

    move-result-object v0

    return-object v0
.end method
