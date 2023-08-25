.class public final synthetic Lcom/daaw/z02;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/at0;

.field public final synthetic q:Landroid/os/IBinder;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/at0;Landroid/os/IBinder;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/z02;->p:Lcom/daaw/at0;

    iput-object p2, p0, Lcom/daaw/z02;->q:Landroid/os/IBinder;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/z02;->p:Lcom/daaw/at0;

    iget-object v1, p0, Lcom/daaw/z02;->q:Landroid/os/IBinder;

    invoke-virtual {v0, v1}, Lcom/daaw/at0;->d(Landroid/os/IBinder;)V

    return-void
.end method
